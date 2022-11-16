package com.example.worldcup2022.view.fragment

import androidx.navigation.fragment.findNavController
import com.example.worldcup2022.R
import com.example.worldcup2022.adapter.GroupPagerAdapter
import com.example.worldcup2022.databinding.FragemntHomegroupBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.proxglobal.worlcupapp.base.BaseFragment

class HomeGroupFragment: BaseFragment<FragemntHomegroupBinding>() {
    override fun getDataBinding(): FragemntHomegroupBinding {
        return FragemntHomegroupBinding.inflate(layoutInflater)
    }

    override fun initView() {
        super.initView()
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
    }

    override fun initData() {
        super.initData()
    }


}