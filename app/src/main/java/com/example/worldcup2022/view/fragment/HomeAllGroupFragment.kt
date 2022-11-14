package com.example.worldcup2022.view.fragment

import androidx.navigation.fragment.findNavController
import com.example.worldcup2022.databinding.FragmentAllgroupBinding
import com.proxglobal.worlcupapp.base.BaseFragment

class HomeAllGroupFragment:BaseFragment<FragmentAllgroupBinding>() {
    override fun getDataBinding(): FragmentAllgroupBinding {
        return FragmentAllgroupBinding.inflate(layoutInflater)
    }

    override fun initView() {
        super.initView()

    }

    override fun initData() {
        super.initData()
    }

    override fun addEvent() {
        super.addEvent()
        binding.imgGroupA.setOnClickListener {
            val action = HomeGroupFragmentDirections.actionHomeGroupFragmentToGroupInfoFragment("A")
            findNavController().navigate(action)
        }
        binding.imgGroupB.setOnClickListener {
            val action = HomeGroupFragmentDirections.actionHomeGroupFragmentToGroupInfoFragment("B")
            findNavController().navigate(action)
        }
        binding.imgGroupC.setOnClickListener {
            val action = HomeGroupFragmentDirections.actionHomeGroupFragmentToGroupInfoFragment("C")
            findNavController().navigate(action)
        }
        binding.imgGroupD.setOnClickListener {
            val action = HomeGroupFragmentDirections.actionHomeGroupFragmentToGroupInfoFragment("D")
            findNavController().navigate(action)
        }
        binding.imgGroupE.setOnClickListener {
            val action = HomeGroupFragmentDirections.actionHomeGroupFragmentToGroupInfoFragment("E")
            findNavController().navigate(action)
        }
        binding.imgGroupF.setOnClickListener {
            val action = HomeGroupFragmentDirections.actionHomeGroupFragmentToGroupInfoFragment("F")
            findNavController().navigate(action)
        }
        binding.imgGroupG.setOnClickListener {
            val action = HomeGroupFragmentDirections.actionHomeGroupFragmentToGroupInfoFragment("G")
            findNavController().navigate(action)
        }
        binding.imgGroupH.setOnClickListener {
            val action = HomeGroupFragmentDirections.actionHomeGroupFragmentToGroupInfoFragment("H")
            findNavController().navigate(action)
        }
    }
}