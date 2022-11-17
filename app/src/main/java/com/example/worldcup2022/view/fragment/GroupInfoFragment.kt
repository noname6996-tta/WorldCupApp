package com.example.worldcup2022.view.fragment

import android.util.Log
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.worldcup2022.R
import com.example.worldcup2022.adapter.GroupMatchAdapter
import com.example.worldcup2022.data.Data
import com.example.worldcup2022.databinding.FragmentGroupinfoBinding
import com.example.worldcup2022.data.dto.worldcup.Match
import com.example.worldcup2022.ui.component.main.MainNewActivity

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.ntduc.datetimeutils.currentMillis
import com.proxglobal.proxads.adsv2.callback.AdsCallback
import com.proxglobal.proxads.adsv2.remote_config.ProxAdsConfig
import com.proxglobal.worlcupapp.base.BaseFragment
import java.io.IOException
import kotlin.collections.ArrayList

class GroupInfoFragment : BaseFragment<FragmentGroupinfoBinding>() {
    private val groupMathAdapter = GroupMatchAdapter()
    lateinit var matchs: List<Match>
    lateinit var arrMatchs: ArrayList<Match>
    val args: GroupInfoFragmentArgs by navArgs()
    override fun getDataBinding(): FragmentGroupinfoBinding {
        return FragmentGroupinfoBinding.inflate(layoutInflater)
    }

    override fun initView() {
        super.initView()
        MainNewActivity.binding.bottomMain.visibility = View.GONE
        binding.recGroupMatch.adapter = groupMathAdapter
        arrMatchs = ArrayList()
        val linearLayoutManager = LinearLayoutManager(requireContext())
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.recGroupMatch.layoutManager = linearLayoutManager

        binding.imgbackGroup.setOnClickListener {
            MainNewActivity.binding.bottomMain.visibility = View.VISIBLE
            findNavController().popBackStack()
        }

        ProxAdsConfig.instance.showNativeAds(
            activity = requireActivity(),
            container = binding.adContainer,
            id_show_ads = "id_native_schedule_click_item_match",
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
        var groupName = args.groupName
        binding.tvGroupname.text = "Group $groupName "
        try {
            val fileInString: String =
                requireContext().assets.open("match.json").bufferedReader().use { it.readText() }
            matchs = Gson().fromJson(fileInString, object : TypeToken<List<Match>>() {}.type)
            for (i in 0..matchs.size - 1) {
                if (matchs[i].group.equals(groupName)) {
                    arrMatchs.add(matchs[i])
                }
            }

        } catch (e: IOException) {

        }
        groupMathAdapter.setListMatch(arrMatchs,requireContext())
    }

    override fun addEvent() {
        super.addEvent()
        groupMathAdapter.setClickShowMatch {
            val callback = object : AdsCallback() {
                override fun onClosed() {
                    val action = GroupInfoFragmentDirections.actionGroupInfoFragmentToMatchFragment(it)
                    findNavController().navigate(action)
                }

                override fun onError(message: String?) {
                    Log.d("ntduc_debug", "InterstitialAds onError: $message")
                    val action = GroupInfoFragmentDirections.actionGroupInfoFragmentToMatchFragment(it)
                    findNavController().navigate(action)
                }
            }
            if (Data.parseTime(it.dateFormat) < currentMillis) {
                ProxAdsConfig.instance.showInterstitialAds(
                    activity = requireActivity(),
                    id_show_ads = "id_inter_schedule_click_item_match",
                    adsId = getString(R.string.id_inter_ads),
                    callback = callback
                )
            } else {
                val action = GroupInfoFragmentDirections.actionGroupInfoFragmentToMatchFragment(it)
                findNavController().navigate(action)
            }
        }
    }
}