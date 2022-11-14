package com.example.worldcup2022.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.worldcup2022.R
import com.example.worldcup2022.databinding.FragmentHomeBinding
import com.example.worldcup2022.databinding.FragmentVideowcBinding
import com.proxglobal.worlcupapp.base.BaseFragment

class VideoWcFragment : BaseFragment<FragmentVideowcBinding>(){
    override fun getDataBinding(): FragmentVideowcBinding {
        return FragmentVideowcBinding.inflate(layoutInflater)
    }

    override fun initView() {
        super.initView()
        var inputSearch : String = binding.edtSearchHighLight.text.toString().trim()
        if  (inputSearch.length==0){
            binding.imgDeleteEdt.visibility = View.GONE
        } else {
            binding.imgDeleteEdt.visibility = View.VISIBLE
        }
    }

}