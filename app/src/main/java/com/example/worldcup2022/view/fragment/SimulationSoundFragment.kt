package com.example.worldcup2022.view.fragment

import androidx.navigation.fragment.findNavController
import com.example.worldcup2022.databinding.FragmentSimulationSoundBinding
import com.proxglobal.worlcupapp.base.BaseFragment

class SimulationSoundFragment: BaseFragment<FragmentSimulationSoundBinding>() {
    override fun getDataBinding(): FragmentSimulationSoundBinding {
        return FragmentSimulationSoundBinding.inflate(layoutInflater)
    }

    override fun addEvent() {
        super.addEvent()
        binding.imgDrum.setOnClickListener {
            val action = WcFunFragmentDirections.actionWcFunFragmentToPlaySoundFragment()
            findNavController().navigate(action)
        }
    }
}