package com.example.worldcup2022.view.fragment

import com.example.worldcup2022.databinding.FragmentSelfieCameraBinding
import com.proxglobal.worlcupapp.base.BaseFragment

class SelfieCameraFragment: BaseFragment<FragmentSelfieCameraBinding>() {
    override fun getDataBinding(): FragmentSelfieCameraBinding {
        return FragmentSelfieCameraBinding.inflate(layoutInflater)
    }
}