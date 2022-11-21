package com.example.worldcup2022.view.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.worldcup2022.LIST_MATCHS
import com.example.worldcup2022.R
import com.example.worldcup2022.adapter.HomeMathAdapter
import com.example.worldcup2022.data.Data.parseTime
import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.data.dto.worldcup.Match
import com.example.worldcup2022.data.dto.worldcup.ResponseMatch
import com.example.worldcup2022.databinding.FragmentHomematchBinding
import com.example.worldcup2022.ui.component.main.MainViewModel
import com.example.worldcup2022.utils.UtilsKotlin
import com.example.worldcup2022.utils.observe
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.ntduc.datetimeutils.currentMillis
import com.ntduc.datetimeutils.getDateTimeFromMillis
import com.orhanobut.hawk.Hawk
import com.proxglobal.proxads.adsv2.callback.AdsCallback
import com.proxglobal.proxads.adsv2.remote_config.ProxAdsConfig
import com.proxglobal.worlcupapp.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import java.io.IOException
import java.text.SimpleDateFormat
import java.time.Instant
import java.util.*
import kotlin.collections.ArrayList

@AndroidEntryPoint
class HomeMatchFragment : BaseFragment<FragmentHomematchBinding>() {
    companion object {
        private const val ARG_DATE = "ARG_DATE"
    }

    private val mainViewModel: MainViewModel by viewModels()
    private val homeMatchAdapter = HomeMathAdapter()
    lateinit var matchs: List<Match>
    lateinit var matchsOnl: List<com.example.worldcup2022.data.dto.worldcup.Match>
    lateinit var arrMatchs: ArrayList<Match>

    private var daymatch: String = ""
    fun newInstance(date: String): HomeMatchFragment {
        val args = Bundle()
        args.putString(ARG_DATE, date)
        val fragment = HomeMatchFragment()
        fragment.arguments = args
        return fragment
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            daymatch = requireArguments().getString(ARG_DATE, "")
        }
    }

    override fun addObservers() {
        super.addObservers()
        observe(mainViewModel.matchsLiveData, ::handleMatchsList)
    }

    override fun initView() {
        super.initView()
        binding.recHomeMatch.adapter = homeMatchAdapter
        arrMatchs = ArrayList()
        val linearLayoutManager = LinearLayoutManager(requireContext())
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.recHomeMatch.layoutManager = linearLayoutManager
        setTime()

    }

    override fun initData() {
        super.initData()
        try {
            val fileInString: String =
                requireContext().assets.open("match.json").bufferedReader().use { it.readText() }
            arrMatchs.clear()
            matchs = Gson().fromJson(fileInString, object : TypeToken<List<Match>>() {}.type)

            if (matchsOnl.isNotEmpty()) {
                for (i in 0..matchsOnl.size - 1) {
                    val calendar1 = Calendar.getInstance().apply {
                        timeInMillis = parseTime(matchsOnl[i].dateFormat)
                    }.time
                    val day1 = SimpleDateFormat("dd", Locale.ENGLISH).format(calendar1)
                    val calendar2 = Calendar.getInstance().apply {
                        timeInMillis = UtilsKotlin().parseTime(daymatch)
                    }.time
                    val day2 = SimpleDateFormat("dd", Locale.ENGLISH).format(calendar2)

                    if (day1.equals(day2)) {
                        arrMatchs.add(matchsOnl[i])
                    }
                }
            } else {
                for (i in 0..matchs.size - 1) {
                    val calendar1 = Calendar.getInstance().apply {
                        timeInMillis = parseTime(matchs[i].dateFormat)
                    }.time
                    val day1 = SimpleDateFormat("dd", Locale.ENGLISH).format(calendar1)
                    val calendar2 = Calendar.getInstance().apply {
                        timeInMillis = UtilsKotlin().parseTime(daymatch)
                    }.time
                    val day2 = SimpleDateFormat("dd", Locale.ENGLISH).format(calendar2)
                    if (day1.equals(day2)) {
                        arrMatchs.add(matchs[i])
                    }
                }
            }


        } catch (e: IOException) {

        }
        homeMatchAdapter.setListMatch(arrMatchs, requireContext())
    }

    override fun getDataBinding(): FragmentHomematchBinding {
        return FragmentHomematchBinding.inflate(layoutInflater)
    }

    private fun setTime() {
        matchsOnl = Hawk.get<ArrayList<com.example.worldcup2022.data.dto.worldcup.Match>>(
            LIST_MATCHS,
            ArrayList()
        )
        val time = UtilsKotlin().parseTime(daymatch)
        val calendar = Calendar.getInstance().apply {
            timeInMillis = time
        }
        val month = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH)
        val day = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH)
        val date = calendar[Calendar.DAY_OF_MONTH]
        val year = calendar[Calendar.YEAR]
        val trueTime = "$day, $date $month $year "
        binding.tvDavMatch.text = trueTime
    }

    override fun addEvent() {
        super.addEvent()
        homeMatchAdapter.setOnLoadAdsListener {
            ProxAdsConfig.instance.showNativeAds(
                activity = requireActivity(),
                container = it,
                id_show_ads = "id_native_home",
                adId = getString(R.string.id_native_ads),
                callback = object : AdsCallback() {
                    override fun onError(message: String?) {
                        Log.d("ntduc_debug", "NativeAds onError: $message")
                    }
                }
            )
        }
        homeMatchAdapter.setClickShowMatch {
            val callback = object : AdsCallback() {
                override fun onClosed() {
                    val action = HomeFragmentDirections.actionHomeFragmentToMatchFragment(it)
                    findNavController().navigate(action)
                }

                override fun onError(message: String?) {
                    Log.d("ntduc_debug", "InterstitialAds onError: $message")
                    val action = HomeFragmentDirections.actionHomeFragmentToMatchFragment(it)
                    findNavController().navigate(action)
                }
            }
            if (parseTime(it.dateFormat) < currentMillis) {
                ProxAdsConfig.instance.showInterstitialAds(
                    activity = requireActivity(),
                    id_show_ads = "id_inter_home_click_item_match",
                    adsId = getString(R.string.id_inter_ads),
                    callback = callback
                )
            } else {
                val action = HomeFragmentDirections.actionHomeFragmentToMatchFragment(it)
                findNavController().navigate(action)
            }
        }

        binding.tvAllGroup.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToHomeGroupFragment()
            findNavController().navigate(action)
        }
    }

    override fun onResume() {
        super.onResume()
        mainViewModel.getFullMatchs()
    }

    private fun handleMatchsList(status: Resource<ResponseMatch>) {
        when (status) {
            is Resource.Loading -> {
                Log.e("Home", "handleMatchsList: Loading ")
            }
            is Resource.Success -> status.data?.let { bindListData(matchs = it) }
            is Resource.DataError -> {
                status.errorCode?.let { Log.e("Home", "handleMatchsList: Error " + it) }
            }
        }
    }

    private fun bindListData(matchs: ResponseMatch) {
        Hawk.put(LIST_MATCHS, matchs.data)
        matchsOnl = Hawk.get<ArrayList<com.example.worldcup2022.data.dto.worldcup.Match>>(LIST_MATCHS, ArrayList())
        arrMatchs.clear()

        if (matchsOnl.isNotEmpty()) {
            for (i in 0..matchsOnl.size - 1) {
                val calendar1 = Calendar.getInstance().apply {
                    timeInMillis = parseTime(matchsOnl[i].dateFormat)
                }.time
                val day1 = SimpleDateFormat("dd", Locale.ENGLISH).format(calendar1)
                val calendar2 = Calendar.getInstance().apply {
                    timeInMillis = UtilsKotlin().parseTime(daymatch)
                }.time
                val day2 = SimpleDateFormat("dd", Locale.ENGLISH).format(calendar2)
                if (day1.equals(day2)) {
                    arrMatchs.add(matchsOnl[i])
                }
            }
            if (arrMatchs.isNotEmpty()) arrMatchs.add(1, Match())
            homeMatchAdapter.setListMatch(arrMatchs, requireContext())
        }
    }
}