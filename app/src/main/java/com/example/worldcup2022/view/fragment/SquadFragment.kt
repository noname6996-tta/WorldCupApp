package com.example.worldcup2022.view.fragment

import com.example.worldcup2022.databinding.FragmentSquadBinding
import com.proxglobal.worlcupapp.base.BaseFragment

class SquadFragment : BaseFragment<FragmentSquadBinding>() {
    override fun getDataBinding(): FragmentSquadBinding {
        return FragmentSquadBinding.inflate(layoutInflater)
    }
}