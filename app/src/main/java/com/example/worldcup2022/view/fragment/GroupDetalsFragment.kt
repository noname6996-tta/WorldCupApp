package com.example.worldcup2022.view.fragment

import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.worldcup2022.R
import com.example.worldcup2022.adapter.HomeMathAdapterBorder
import com.example.worldcup2022.adapter.MatchGroupAdapter
import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.data.Data
import com.example.worldcup2022.databinding.FragmentGroupDetalsBinding
import com.example.worldcup2022.data.dto.worldcup.Country
import com.example.worldcup2022.data.dto.worldcup.Match
import com.example.worldcup2022.data.dto.worldcup.ResponseCountry
import com.example.worldcup2022.data.dto.worldcup.ResponseMatch
import com.example.worldcup2022.ui.component.main.MainNewActivity
import com.example.worldcup2022.ui.component.main.MainViewModel
import com.example.worldcup2022.utils.observe
import com.google.common.reflect.TypeToken
import com.google.gson.Gson
import com.ntduc.datetimeutils.currentMillis
import com.proxglobal.proxads.adsv2.callback.AdsCallback
import com.proxglobal.proxads.adsv2.remote_config.ProxAdsConfig
import com.proxglobal.worlcupapp.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import java.io.IOException

@AndroidEntryPoint
class GroupDetalsFragment : BaseFragment<FragmentGroupDetalsBinding>() {

    val args: GroupInfoFragmentArgs by navArgs()
    var groupMatch: String = ""
    lateinit var arrCountrys: ArrayList<Country>
    private val matchGroupAdapter = MatchGroupAdapter()

    private val homeMatchAdapter = HomeMathAdapterBorder()
    lateinit var matchs: List<Match>
    lateinit var arrMatchs: java.util.ArrayList<Match>
    override fun getDataBinding(): FragmentGroupDetalsBinding {
        return FragmentGroupDetalsBinding.inflate(layoutInflater)
    }

    private val mainViewModel: MainViewModel by viewModels()
    override fun initView() {
        super.initView()
        groupMatch = args.groupName
        binding.textView5.text = "Group " + groupMatch + " "
        binding.tvLogoGroupName.text = "Group " + groupMatch + " "
        binding.recMatchGroup.adapter = matchGroupAdapter
        arrCountrys = ArrayList()

        val linearLayoutManager = LinearLayoutManager(requireContext())
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.recMatchGroup.layoutManager = linearLayoutManager

        binding.recAllMatch.adapter = homeMatchAdapter
        arrMatchs = ArrayList()
        val linearLayoutManager2 = LinearLayoutManager(requireContext())
        linearLayoutManager2.orientation = LinearLayoutManager.VERTICAL
        binding.recAllMatch.layoutManager = linearLayoutManager2
        ProxAdsConfig.instance.showNativeAds(
            activity = requireActivity(),
            container = binding.adContainer,
            id_show_ads = "id_native_group_details",
            adId = getString(R.string.id_native_ads),
            callback = object : AdsCallback() {
                override fun onError(message: String?) {
                    Log.d("ntduc_debug", "NativeAds onError: $message")
                }
            }
        )
    }

    override fun initData() {
        super.initData()
        try {
            val fileInString: String =
                requireContext().assets.open("country.json").bufferedReader().use { it.readText() }
            var countrys: List<Country> =
                Gson().fromJson(fileInString, object : TypeToken<List<Country>>() {}.type)
            for (i in 0..countrys.size - 1) {
                val country = countrys[i]
                if (countrys[i].group.equals(groupMatch)) {
                    arrCountrys.add(countrys[i])
                }
            }
        } catch (e: IOException) {

        }
        matchGroupAdapter.setListMatchCountrys(arrCountrys,requireContext())


        try {
            val fileInString: String =
                requireContext().assets.open("match.json").bufferedReader().use { it.readText() }
            matchs = Gson().fromJson(fileInString, object : TypeToken<List<Match>>() {}.type)
            for (i in 0..matchs.size - 1) {
                if (matchs[i].group.equals(groupMatch)){
                    arrMatchs.add(matchs[i])
                }
            }

        } catch (e: IOException) {

        }
        homeMatchAdapter.setListMatch(arrMatchs, requireContext())
    }

    override fun addEvent() {
        super.addEvent()
        binding.vireBack.setOnClickListener {
            findNavController().popBackStack()
        }
        homeMatchAdapter.setClickShowMatch{
            val callback = object : AdsCallback() {
                override fun onClosed() {
                    val action = GroupDetalsFragmentDirections.actionGroupDetalsFragmentToMatchFragment(it)
                    findNavController().navigate(action)
                }

                override fun onError(message: String?) {
                    Log.d("ntduc_debug", "InterstitialAds onError: $message")
                    val action = GroupDetalsFragmentDirections.actionGroupDetalsFragmentToMatchFragment(it)
                    findNavController().navigate(action)
                }
            }
            if (Data.parseTime(it.dateFormat) < currentMillis) {
                ProxAdsConfig.instance.showInterstitialAds(
                    activity = requireActivity(),
                    id_show_ads = "id_inter_group_details_click_item_match",
                    adsId = getString(R.string.id_inter_ads),
                    callback = callback
                )
            } else {
                val action = GroupDetalsFragmentDirections.actionGroupDetalsFragmentToMatchFragment(it)
                findNavController().navigate(action)
            }
        }

    }

    override fun addObservers() {
        super.addObservers()
        observe(mainViewModel.countrysLiveData, ::handleSoundsList)
        observe(mainViewModel.matchsByGroupLiveData, ::handleMatchList)
    }

    override fun initViewModel() {
        super.initViewModel()
        mainViewModel.getFullCountry()
        mainViewModel.getMatchsByGroup(args.groupName)
    }

    private fun handleSoundsList(status: Resource<ResponseCountry>) {
        when (status) {
            is Resource.Loading -> {
                Log.e("handleCountryList", "handleCountryList: Loading ")
            }
            is Resource.Success -> status.data?.let { bindListData(matchs = it) }
            is Resource.DataError -> {
                status.errorCode?.let {
                    Log.e(
                        "handleCountryList",
                        "handleCountryList: Error " + it.toString()
                    )
                }
            }
        }
    }

    private fun bindListData(matchs: ResponseCountry) {
        arrCountrys = ArrayList()
        for (i in 0..matchs.data.size - 1) {
            if (matchs.data[i].group.equals(args.groupName)) {
                arrCountrys.add(matchs.data[i])
            }
        }
        var arrCountrys1 = arrCountrys.sortedWith { a, b ->
            if (a.point == b.point) {
                return@sortedWith a.goalDifference.compareTo(b.goalDifference)
            } else (a.point.compareTo(b.point))
        }.toMutableList()
        arrCountrys1.reverse()
        matchGroupAdapter.setListMatchCountrys(arrCountrys1, requireContext())
    }

    private fun handleMatchList(status: Resource<ResponseMatch>) {
        when (status) {
            is Resource.Loading -> {
                Log.e("handleMatchList", "handleMatchList: Loading ")
            }
            is Resource.Success -> status.data?.let { bindListDataMatchByGroup(matchs = it) }
            is Resource.DataError -> {
                status.errorCode?.let {
                    Log.e(
                        "handleMatchList",
                        "handleMatchList: Error " + it.toString()
                    )
                }
            }
        }
    }

    private fun bindListDataMatchByGroup(matchs: ResponseMatch) {
        arrMatchs = ArrayList()
        Log.e("handleMatchList",matchs.data.size.toString()+groupMatch)
        for (i in 0..matchs.data.size - 1) {
            if (matchs.data[i].group.equals(args.groupName)) {
                arrMatchs.add(matchs.data[i])
                Log.e("adasdasdasda",matchs.data[i].toString())
            }
        }
        homeMatchAdapter.setListMatch(arrMatchs, requireContext())
    }
}