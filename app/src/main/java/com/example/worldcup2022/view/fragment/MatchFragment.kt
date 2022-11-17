package com.example.worldcup2022.view.fragment

import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.worldcup2022.R
import com.example.worldcup2022.adapter.MatchPagerAdapter
import com.example.worldcup2022.data.Data
import com.example.worldcup2022.data.dto.worldcup.Country
import com.example.worldcup2022.data.dto.worldcup.Match
import com.example.worldcup2022.data.dto.worldcup.Stadium
import com.example.worldcup2022.databinding.FragmentMatchBinding
import com.example.worldcup2022.ui.component.main.MainNewActivity
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.proxglobal.worlcupapp.base.BaseFragment
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class MatchFragment : BaseFragment<FragmentMatchBinding>() {

    val args: MatchFragmentArgs by navArgs()
    override fun getDataBinding(): FragmentMatchBinding {
        return FragmentMatchBinding.inflate(layoutInflater)
    }

    companion object {
        lateinit var matchFragment: Match
    }

    override fun initData() {
        super.initData()
        MainNewActivity.binding.bottomMain.visibility = View.GONE
        var match: Match = args.objectMatch
        matchFragment = args.objectMatch
        MatchGroupFragment.group = match.group


        if (match.country1 != null) {
            binding.tvTeam1.text = match.country1!!.name
            Glide.with(requireContext()).load(match.country1!!.image)
                .error(R.drawable.logo).placeholder(R.drawable.logo)
                .override(100, 100)
                .into(binding.imgteam1)
            binding.tvTeam2.text = match.country2!!.name
            Glide.with(requireContext()).load(match.country2!!.image)
                .error(R.drawable.logo).placeholder(R.drawable.logo)
                .override(100, 100)
                .into(binding.imgTeam2)
        } else {
            try {
                val fileInString: String =
                    requireContext().assets.open("country.json").bufferedReader()
                        .use { it.readText() }
                var countrys: List<Country> =
                    Gson().fromJson(fileInString, object : TypeToken<List<Country>>() {}.type)
                for (i in 0..countrys.size - 1) {
                    val country = countrys[i]
                    if (match.idcountry1.toString() == country.id) {
                        binding.tvTeam1.text = country.name
                        Glide.with(requireContext()).load(country.image)
                            .error(R.drawable.logo).placeholder(R.drawable.logo)
                            .override(100, 100)
                            .into(binding.imgteam1)
                    }
                    if (match.idcountry2.toString() == country.id) {
                        binding.tvTeam2.text = country.name
                        Glide.with(requireContext()).load(country.image)
                            .error(R.drawable.logo).placeholder(R.drawable.logo)
                            .override(100, 100)
                            .into(binding.imgTeam2)
                    }
                }
            } catch (e: IOException) {

            }
        }

        if (match.stadium != null) {
            binding.tvStadiumMatch.text = match.stadium.name
        } else {
            try {
                val fileInString: String =
                    requireContext().assets.open("Stadium.json").bufferedReader()
                        .use { it.readText() }
                var stadiums: List<Stadium> =
                    Gson().fromJson(fileInString, object : TypeToken<List<Stadium>>() {}.type)
                for (i in 0..stadiums.size - 1) {
                    val stadium = stadiums[i]
                    if (match.idStadium.toString() == stadium.id) {
                        binding.tvStadiumMatch.text = stadium.name
                    }
                }
            } catch (e: IOException) {

            }
        }

        val time = Data.parseTime(match.dateFormat)
        val calendar = Calendar.getInstance().apply {
            timeInMillis = time
        }.time
        val hours = SimpleDateFormat("HH", Locale.ROOT).format(calendar)
        val minus = SimpleDateFormat("mm", Locale.ROOT).format(calendar)
        val trueTime = "$hours : $minus"
        val current = Calendar.getInstance().timeInMillis
        if (current > time) {
            binding.tvTimeMatch.visibility = View.GONE
            binding.tvGoal.visibility = View.VISIBLE
            binding.tvGoal.text = match.goal
        } else {
            binding.tvTimeMatch.text = trueTime
            binding.tvTimeMatch.visibility = View.VISIBLE
            binding.tvGoal.visibility = View.GONE
        }
        val month = SimpleDateFormat("MMM", Locale.ENGLISH).format(calendar)
        val day = SimpleDateFormat("EEE", Locale.ENGLISH).format(calendar)
        val date = SimpleDateFormat("dd", Locale.ENGLISH).format(calendar)
        val year = SimpleDateFormat("yyyy", Locale.ENGLISH).format(calendar)
        val trueTime2 = "$day, $date $month $year"


        binding.tvDateMatchGroup.text = trueTime2

        binding.tvGroupName.text = "Group " + match.group + " "
    }

    override fun initView() {
        super.initView()
        MainNewActivity.binding.bottomMain.visibility = View.VISIBLE
        binding.viewPagerMatch.adapter = MatchPagerAdapter(requireActivity())
        TabLayoutMediator(binding.tabLayoutMatch,
            binding.viewPagerMatch,
            false,
            false,
            object : TabLayoutMediator.TabConfigurationStrategy {
                override fun onConfigureTab(tab: TabLayout.Tab, position: Int) {
                    when (position) {
                        0 -> tab.text = "Match info"
                        1 -> tab.text = "Group"
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
        binding.imgteam1.setOnClickListener {
            var country = args.objectMatch.country1
            val action = MatchFragmentDirections.actionMatchFragmentToSquadFragment(country!!)
            findNavController().navigate(action)
        }
        binding.imgTeam2.setOnClickListener {
            var country = args.objectMatch.country2
            val action = MatchFragmentDirections.actionMatchFragmentToSquadFragment(country!!)
            findNavController().navigate(action)
        }
    }
}