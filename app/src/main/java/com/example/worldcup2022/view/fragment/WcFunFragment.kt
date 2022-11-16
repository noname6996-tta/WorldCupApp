package com.example.worldcup2022.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.example.worldcup2022.R
import com.example.worldcup2022.databinding.FragmentWcfunBinding
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
            binding.viewFirstLayout.setOnClickListener {
                isViewFirst = true
                setView()
                val fragmentTransaction: FragmentTransaction =
                    requireActivity().getSupportFragmentManager().beginTransaction()
                fragmentTransaction.replace(R.id.frameWcFun, SimulationSoundFragment())
                fragmentTransaction.commit()
            }

            binding.viewSencondLayout.setOnClickListener {
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
            binding.viewFirstLayout.setImageResource(R.drawable.simulation_sound)
            binding.viewFirstLayout.layoutParams.height = 160
            binding.viewSencondLayout.setImageResource(R.drawable.selfie_camera_white)
            binding.viewSencondLayout.layoutParams.height = 90
            binding.viewFirstLayout.requestLayout()
            binding.viewSencondLayout.requestLayout()

        } else {
            binding.viewSencondLayout.setImageResource(R.drawable.selfie_camera)
            binding.viewSencondLayout.layoutParams.height = 160
            binding.viewFirstLayout.setImageResource(R.drawable.simulation_sound_white)
            binding.viewFirstLayout.layoutParams.height = 90
            binding.viewFirstLayout.requestLayout()
            binding.viewSencondLayout.requestLayout()
        }
    }


}