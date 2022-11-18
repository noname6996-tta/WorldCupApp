package com.example.worldcup2022.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.FragmentTransaction
import com.example.worldcup2022.R
import com.example.worldcup2022.databinding.FragmentWcfunBinding
import com.example.worldcup2022.view.activity.MainActivity
import com.proxglobal.worlcupapp.base.BaseFragment

class WcFunFragment : BaseFragment<FragmentWcfunBinding>() {

    private var isViewFirst: Boolean = true
    override fun getDataBinding(): FragmentWcfunBinding {
        return FragmentWcfunBinding.inflate(layoutInflater)
    }

    private var reCreateBinding = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        try {
            return if (binding == null) {
                reCreateBinding  = true
                super.onCreateView(inflater, container, savedInstanceState)
            } else {
                reCreateBinding = false
                binding.root
            }
        } catch (e: Exception) {
            reCreateBinding  = true
            return super.onCreateView(inflater, container, savedInstanceState)
        }
    }

    override fun initView() {
        super.initView()
        if (reCreateBinding) {
            setView()
            binding.rlFirstLayout.setOnClickListener {
                isViewFirst = true
                setView()
                val fragmentTransaction: FragmentTransaction =
                    requireActivity().getSupportFragmentManager().beginTransaction()
                fragmentTransaction.replace(R.id.frameWcFun, SimulationSoundFragment())
                fragmentTransaction.commit()
            }

            binding.rlSencondLayout.setOnClickListener {
                isViewFirst = false
                setView()
                val fragmentTransaction: FragmentTransaction =
                    requireActivity().getSupportFragmentManager().beginTransaction()
                fragmentTransaction.replace(R.id.frameWcFun, SelfieCameraFragment())
                fragmentTransaction.commit()
            }

            val fragmentTransaction: FragmentTransaction =
                requireActivity().getSupportFragmentManager().beginTransaction()
            fragmentTransaction.add(R.id.frameWcFun, SimulationSoundFragment())
            fragmentTransaction.commit()
        }
    }

    override fun addEvent() {
        super.addEvent()
    }

    private fun setView() {
        if (isViewFirst) {
            binding.viewFirstLayout.visibility = View.VISIBLE
            binding.viewSencondLayout.visibility = View.GONE

        } else {
            binding.viewFirstLayout.visibility = View.GONE
            binding.viewSencondLayout.visibility = View.VISIBLE
        }
    }

    override fun onResume() {
        super.onResume()
        requireActivity().findViewById<View>(R.id.bottomMain).isVisible = true
    }

}