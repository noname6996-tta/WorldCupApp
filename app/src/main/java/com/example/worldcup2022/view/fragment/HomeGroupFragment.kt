package com.example.worldcup2022.view.fragment

import android.util.Log
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.worldcup2022.R
import com.example.worldcup2022.adapter.GroupPagerAdapter
import com.example.worldcup2022.databinding.FragemntHomegroupBinding
import com.example.worldcup2022.ui.component.main.MainNewActivity
import com.example.worldcup2022.view.activity.MainActivity
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.proxglobal.proxads.adsv2.callback.AdsCallback
import com.proxglobal.proxads.adsv2.remote_config.ProxAdsConfig
import com.proxglobal.worlcupapp.base.BaseFragment

class HomeGroupFragment: BaseFragment<FragemntHomegroupBinding>() {
    override fun getDataBinding(): FragemntHomegroupBinding {
        return FragemntHomegroupBinding.inflate(layoutInflater)
    }

    override fun initView() {
        super.initView()
        MainNewActivity.binding.bottomMain.visibility = View.GONE
        binding.viewPagerHomeGroup.adapter = GroupPagerAdapter(requireActivity())
        TabLayoutMediator(binding.tabLayoutHomeGroup, binding.viewPagerHomeGroup,object : TabLayoutMediator.TabConfigurationStrategy{
            override fun onConfigureTab(tab: TabLayout.Tab, position: Int) {
                when(position){
                    0-> tab.text = "Group Stage"
                    1-> tab.text = "Knockout Stage"
                    // tam thoi
                }
            }

        }).attach()

        binding.viewBack.setOnClickListener {
            findNavController().popBackStack()
        }

        ProxAdsConfig.instance.showNativeAds(
            activity = requireActivity(),
            container = binding.adContainer,
            id_show_ads = "id_native_gs_kos",
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
    }


}