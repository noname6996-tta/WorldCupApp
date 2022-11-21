package com.example.worldcup2022.view.fragment

import android.annotation.SuppressLint
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.worldcup2022.R
import com.example.worldcup2022.USER_ID
import com.example.worldcup2022.data.Data
import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.data.dto.worldcup.*
import com.example.worldcup2022.databinding.FragmentMatchInfoBinding
import com.example.worldcup2022.ui.component.main.MainViewModel
import com.example.worldcup2022.ui.component.vote.DiaLogVote
import com.example.worldcup2022.utils.observe
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.orhanobut.hawk.Hawk
import com.proxglobal.proxads.adsv2.callback.AdsCallback
import com.proxglobal.proxads.adsv2.callback.RewardCallback
import com.proxglobal.proxads.adsv2.remote_config.ProxAdsConfig
import com.proxglobal.worlcupapp.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject
import java.io.IOException
import java.util.*

@AndroidEntryPoint
class MatchInFragment : BaseFragment<FragmentMatchInfoBinding>() {
    lateinit var match: Match
    lateinit var dialogVote: DiaLogVote
    private val mainViewModel: MainViewModel by viewModels()
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
        if (match.country1 != null) {
            binding.tvTeam1.text = match.country1!!.name
            binding.tvProcessNameTeam1.text = match.country1!!.name
            Glide.with(requireContext()).load(match.country1!!.image)
                .error(R.drawable.logo)
                .override(100, 100)
                .into(binding.imgTeam1)
            Glide.with(requireContext()).load(match.country1!!.image)
                .error(R.drawable.logo)
                .override(100, 100)
                .into(binding.imgTeam1Prediction)

            binding.tvTeam2.text = match.country2?.name
            binding.tvProcessNameTeam2.text = match.country2?.name
            Glide.with(requireContext()).load(match.country2?.image)
                .error(R.drawable.logo)
                .override(100, 100)
                .into(binding.imgTeam2)
            Glide.with(requireContext()).load(match.country2?.image)
                .error(R.drawable.logo)
                .override(100, 100)
                .into(binding.imgTeam2Prediction)
        } else {
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
                            .error(R.drawable.logo)
                            .override(100, 100)
                            .into(binding.imgTeam1)
                        Glide.with(requireContext()).load(country.image)
                            .error(R.drawable.logo)
                            .override(100, 100)
                            .into(binding.imgTeam1Prediction)
                        match.country1 = country
                    }
                    if (match.idcountry2.toString() == country.id) {
                        binding.tvTeam2.text = country.name
                        binding.tvProcessNameTeam2.text = country.name
                        Glide.with(requireContext()).load(country.image)
                            .error(R.drawable.logo)
                            .override(100, 100)
                            .into(binding.imgTeam2)
                        Glide.with(requireContext()).load(country.image)
                            .error(R.drawable.logo)
                            .override(100, 100)
                            .into(binding.imgTeam2Prediction)
                        match.country2 = country
                    }
                }
            } catch (e: IOException) {

            }
        }
        dialogVote = DiaLogVote(requireContext(), match) { score1, score2 ->
            guess(score1, score2)
        }
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

                        .error(R.drawable.logo).placeholder(R.drawable.logo)
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

        val time = Data.parseTime(match.dateFormat)
        val current = Calendar.getInstance().timeInMillis
        if (current > time) {
            binding.rlVote.visibility = View.GONE
        } else {
            binding.rlVote.visibility = View.VISIBLE
        }
    }

    private fun showWhoWillWin() {
        binding.rlAdsProgressGuess.visibility = View.GONE

        binding.firstBar.setProgressPercentage(match.percent1Win.toDouble())
        binding.secondBar.setProgressPercentage(match.percent2Win.toDouble())
        binding.thirdBar.setProgressPercentage(match.percentDraw.toDouble())
        binding.tvPercent1Win.text = match.percent1Win.toString() + "%"
        binding.tvPercent2Win.text = match.percent2Win.toString() + "%"
        binding.tvPercentDraw.text = match.percentDraw.toString() + "%"
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

        binding.rlAdsProgressGuess.setOnClickListener {
            ProxAdsConfig.instance.showRewardAds(
                activity = requireActivity(),
                id_show_ads = "id_reward_who_will_win",
                adsId = getString(R.string.id_reward_ads),
                callback = object : AdsCallback() {
                    override fun onClosed() {
                        showWhoWillWin()
                    }

                    override fun onError(message: String?) {
                        Log.d("ntduc_debug", "RewardAds onError: $message")
                        showWhoWillWin()
                    }
                },
                rewardCallback = object : RewardCallback() {}
            )
        }
    }

    override fun addObservers() {
        super.addObservers()
        observe(mainViewModel.guessLiveData, ::guessData)
        observe(mainViewModel.historyMatchLiveData, ::handleHistoryMatchList)
    }

    /**
     *
     */
    private fun guess(score1: String, score2: String) {
        binding.tvGoalsTeam1.text = score1
        binding.tvGoalsTeam2.text = score2
        val userId = Hawk.get<String>(USER_ID, "")

        val jsonObject = JSONObject()
        jsonObject.put("userId", userId)
        jsonObject.put("matchId", match.id)
        if (score1.toInt() > score1.toInt()) {
            jsonObject.put("teamWin", match.country1?.id)
        } else {
            jsonObject.put("teamWin", match.country2?.id)
        }
        jsonObject.put("time", match.date)
        jsonObject.put("goal", "$score1-$score2")

        val jsonObjectString = jsonObject.toString()

        val requestBody = jsonObjectString.toRequestBody("application/json".toMediaTypeOrNull())
        mainViewModel.postGuess(requestBody)


    }

    private fun guessData(status: Resource<ResponseGuess>) {
        when (status) {
            is Resource.Loading -> {
                Log.e("Home", "handleMatchsList: Loading ")
            }
            is Resource.Success -> status.data?.let { bindListData(guess = it) }
            is Resource.DataError -> {
                status.errorCode?.let { Log.e("Home", "handleMatchsList: Error " + it) }
            }
        }
    }

    private fun bindListData(guess: ResponseGuess) {
        Log.e("TAG", "bindListData: " + Gson().toJson(guess))

    }

    override fun onResume() {
        super.onResume()
        val userId = Hawk.get<String>(USER_ID, "")
        mainViewModel.getHistoryMatchByUserIdAndID("userId==\"" + userId + "\"" + ";" + "matchId==\"" + match.id + "\"")
    }

    private fun handleHistoryMatchList(status: Resource<ResponseHistoryMatch>) {
        when (status) {
            is Resource.Loading -> {

            }
            is Resource.Success -> status.data?.let {

                bindListHistoryData(historyMatchs = it)
            }
            is Resource.DataError -> {
                status.errorCode?.let {
                    Log.d(
                        "ntduc_debug", "handleHistoryMatchList: Error " + it
                    )
                }
            }
        }
    }

    private fun bindListHistoryData(historyMatchs: ResponseHistoryMatch) {
        if (!historyMatchs.data.isNullOrEmpty()) {
            val matchHistory = historyMatchs.data?.get(0)
            if (matchHistory != null) {
                val separated: List<String> = matchHistory.goal!!.split("-")
                val score1 = separated[0].trim().toString()
                val score2 = separated[1].trim().toString()
                binding.tvGoalsTeam1.text = score1
                binding.tvGoalsTeam2.text = score2
                if (matchHistory.isRight != null) {
                    if (matchHistory.goal.equals(match.goal)) {
                        binding.ivResultGuess.setImageResource(R.drawable.ic_win_50x30)
                        binding.ivResultGuess.visibility = View.VISIBLE
                        binding.ivVoteSuccess.visibility = View.VISIBLE
                        binding.tvVote.visibility = View.GONE
                    } else {
                        binding.ivResultGuess.setImageResource(R.drawable.ic_false)
                        binding.ivResultGuess.visibility = View.VISIBLE
                        binding.ivVoteSuccess.visibility = View.GONE
                        binding.tvVote.visibility = View.GONE
                    }
                }

            }

        }

    }


}