package com.example.worldcup2022.view.fragment

import android.annotation.SuppressLint
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.worldcup2022.R
import com.example.worldcup2022.data.dto.worldcup.Country
import com.example.worldcup2022.data.dto.worldcup.Match
import com.example.worldcup2022.data.dto.worldcup.Stadium
import com.example.worldcup2022.databinding.FragmentMatchInfoBinding
import com.example.worldcup2022.ui.component.vote.DiaLogVote
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.proxglobal.worlcupapp.base.BaseFragment
import java.io.IOException

class MatchInFragment : BaseFragment<FragmentMatchInfoBinding>() {
    lateinit var match: Match
    lateinit var dialogVote: DiaLogVote

    override fun getDataBinding(): FragmentMatchInfoBinding {
        return FragmentMatchInfoBinding.inflate(layoutInflater)
    }

    override fun initData() {
        super.initData()


    }

    @SuppressLint("ResourceAsColor")
    override fun initView() {
        super.initView()
        match = MatchFragment.matchFragment

        // name and image
        try {
            val fileInString: String =
                requireContext().assets.open("country.json").bufferedReader().use { it.readText() }
            var countrys: List<Country> =
                Gson().fromJson(fileInString, object : TypeToken<List<Country>>() {}.type)
            for (i in 0..countrys.size - 1) {
                val country = countrys[i]
                if (match.idcountry1.toString() == country.id) {
                    binding.tvTeam1.text = country.name
                    binding.tvProcessNameTeam1.text = country.name
                    Glide.with(requireContext()).load(country.image)
                        .error(R.drawable.ic_launcher_background)
                        .into(binding.imgTeam1)
                    Glide.with(requireContext()).load(country.image)
                        .error(R.drawable.ic_launcher_background)
                        .into(binding.imgTeam1Prediction)
                    match.country1= country
                }
                if (match.idcountry2.toString() == country.id) {
                    binding.tvTeam2.text = country.name
                    binding.tvProcessNameTeam2.text = country.name
                    Glide.with(requireContext()).load(country.image)
                        .error(R.drawable.ic_launcher_background)
                        .into(binding.imgTeam2)
                    Glide.with(requireContext()).load(country.image)
                        .error(R.drawable.ic_launcher_background)
                        .into(binding.imgTeam2Prediction)
                    match.country2= country
                }
            }
        } catch (e: IOException) {

        }
        dialogVote = DiaLogVote(requireContext(), match)
        //
        val played = match.history.toString().trim()
        val separated: List<String> = played.split("-")
        val winsTeam1 = separated[0].trim().toString()
        val draw = separated[1].trim().toString()
        val winsTeam2 = separated[2].trim().toString()

        val sumPlayed: Int = winsTeam1.trim().toInt() + winsTeam2.trim().toInt() + draw.trim().toInt()

        val pencentTeam1 = (winsTeam1.toDouble() / sumPlayed) * 100
        binding.progessBarTeam1.setProgress(pencentTeam1.toInt())

        val pencentTeam2 = (winsTeam2.toDouble() / sumPlayed) * 100
        binding.progessBarTeam2.setProgress(pencentTeam2.toInt())

        binding.tvWinTeam1.text = winsTeam1.toString()
        binding.tvDraw.text = "Drawn " + draw.toString() + " "
        binding.tvWinTeam2.text = winsTeam2.toString()

        binding.tvSumPlayed.text = sumPlayed.toString()
        //
        try {
            val fileInString: String =
                requireContext().assets.open("Stadium.json").bufferedReader().use { it.readText() }
            var stadiums: List<Stadium> =
                Gson().fromJson(fileInString, object : TypeToken<List<Stadium>>() {}.type)
            for (i in 0..stadiums.size - 1) {
                val stadium = stadiums[i]
                if (match.idStadium.toString() == stadium.id) {
                    binding.tvNameSatdium.text = stadium.name
                    binding.tvLocationMatchStadium.text = stadium.location
                    Glide.with(requireContext()).load(stadium.image)
                        .error(R.drawable.ic_launcher_background).placeholder(R.drawable.ic_launcher_background)
                        .into(binding.imgStadium)
                }
            }
        } catch (e: IOException) {

        }

        //
        binding.tvGoalsTeam1.text = "?"
        binding.tvGoalsTeam2.text = "?"

        val matchName = binding.tvTeam1.text.toString() + " vs " + binding.tvTeam2.text.toString() + " "
        binding.tvMatchName.text = matchName.toString()


    }

    override fun addEvent() {
        super.addEvent()
        binding.viewDetails.setOnClickListener {
            val action = MatchFragmentDirections.actionMatchFragmentToStadiumFragment(match.idStadium.toString())
            findNavController().navigate(action)
        }

        binding.tvVote.setOnClickListener {
            dialogVote.show()
        }
    }
}