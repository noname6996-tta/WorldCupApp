package com.example.worldcup2022.view.fragment

import com.example.worldcup2022.databinding.FragmentKnockoutStageBinding
import com.proxglobal.worlcupapp.base.BaseFragment

class HomeKnockoutFragment: BaseFragment<FragmentKnockoutStageBinding>() {
    override fun getDataBinding(): FragmentKnockoutStageBinding {
        return FragmentKnockoutStageBinding.inflate(layoutInflater)
    }
}