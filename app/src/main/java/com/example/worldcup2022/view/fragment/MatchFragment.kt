package com.example.worldcup2022.view.fragment

import android.util.Log
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.worldcup2022.R
import com.example.worldcup2022.adapter.MatchPagerAdapter
import com.example.worldcup2022.data.Data
import com.example.worldcup2022.databinding.FragmentMatchBinding
import com.example.worldcup2022.model.Country
import com.example.worldcup2022.model.Match
import com.example.worldcup2022.model.Stadium
import com.example.worldcup2022.ui.component.main.MainNewActivity

import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.proxglobal.worlcupapp.base.BaseFragment
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class MatchFragment:BaseFragment<FragmentMatchBinding>() {

    val args: MatchFragmentArgs by navArgs()
    override fun getDataBinding(): FragmentMatchBinding {
        return FragmentMatchBinding.inflate(layoutInflater)
    }
    companion object {
        lateinit var matchFragment :Match
    }
    override fun initData() {
        super.initData()
        MainNewActivity.binding.bottomMain.visibility = View.GONE
        var match :Match = args.objectMatch
        matchFragment = args.objectMatch
        MatchGroupFragment.group = match.group
        try {
            val fileInString: String =
                requireContext().assets.open("country.json").bufferedReader().use { it.readText() }
            var countrys: List<Country> =
                Gson().fromJson(fileInString, object : TypeToken<List<Country>>() {}.type)
            for (i in 0..countrys.size - 1) {
                val country = countrys[i]
                if (match.idcountry1 == country.id) {
                    binding.tvTeam1.text = country.name
                    Glide.with(requireContext()).load(country.image)
                        .error(R.drawable.ic_launcher_background).placeholder(R.drawable.ic_launcher_background)
                        .into(binding.imgteam1)
                }
                if (match.idcountry2 == country.id) {
                    binding.tvTeam2.text = country.name
                    Glide.with(requireContext()).load(country.image)
                        .error(R.drawable.ic_launcher_background).placeholder(R.drawable.ic_launcher_background)
                        .into(binding.imgTeam2)
                }
            }
        } catch (e: IOException) {

        }

        try {
            val fileInString: String =
                requireContext().assets.open("Stadium.json").bufferedReader().use { it.readText() }
            var stadiums: List<Stadium> =
                Gson().fromJson(fileInString, object : TypeToken<List<Stadium>>() {}.type)
            for (i in 0..stadiums.size - 1) {
                val stadium = stadiums[i]
                if (match.idStadium == stadium.id) {
                    binding.tvStadiumMatch.text = stadium.name
                }
            }
        } catch (e: IOException) {

        }

        val time = Data.parseTime(match.date)
        val calendar = Calendar.getInstance().apply {
            timeInMillis = time
        }.time
        val hours = SimpleDateFormat("HH", Locale.ROOT).format(calendar)
        val minus = SimpleDateFormat("mm", Locale.ROOT).format(calendar)
        val trueTime = "$hours : $minus"
        binding.tvTimeMatch.text = trueTime

        val month = SimpleDateFormat("MMM", Locale.ENGLISH).format(calendar)
        val day = SimpleDateFormat("EEE", Locale.ENGLISH).format(calendar)
        val date = SimpleDateFormat("dd", Locale.ENGLISH).format(calendar)
        val year = SimpleDateFormat("yyyy", Locale.ENGLISH).format(calendar)
        val trueTime2 = "$day, $date $month $year"
        binding.tvDateMatchGroup.text = trueTime2

        binding.tvGroupName.text = "Group "+match.group+" "
    }

    override fun initView() {
        super.initView()
        MainNewActivity.binding.bottomMain.visibility = View.VISIBLE
        binding.viewPagerMatch.adapter = MatchPagerAdapter(requireActivity())
        TabLayoutMediator(binding.tabLayoutMatch,
            binding.viewPagerMatch,
            false,
            false,
            object : TabLayoutMediator.TabConfigurationStrategy{
                override fun onConfigureTab(tab: TabLayout.Tab, position: Int) {
                    when(position){
                        0-> tab.text = "Match info"
                        1-> tab.text = "Group"
                        // tam thoi
                    }
                }

            }).attach()

    }

    override fun addEvent() {
        super.addEvent()
        binding.viewBack.setOnClickListener {
            findNavController().popBackStack()

        }
    }
}