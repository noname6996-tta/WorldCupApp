package com.example.worldcup2022.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.worldcup2022.databinding.FragmentHistoryBinding
import com.example.worldcup2022.databinding.FragmentHomeBinding
import com.proxglobal.worlcupapp.base.BaseFragment

class HistoryFragment : BaseFragment<FragmentHistoryBinding>(){
    override fun getDataBinding(): FragmentHistoryBinding {
        return FragmentHistoryBinding.inflate(layoutInflater)
    }

    override fun initView() {
        super.initView()
    }

    override fun initData() {
        super.initData()
    }
}