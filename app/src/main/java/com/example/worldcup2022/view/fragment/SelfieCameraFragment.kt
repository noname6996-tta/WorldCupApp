package com.example.worldcup2022.view.fragment

import android.Manifest
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.example.worldcup2022.R
import com.example.worldcup2022.databinding.FragmentSelfieCameraBinding
import com.example.worldcup2022.utils.setOnClickListenerWithScaleAnimation
import com.permissionx.guolindev.PermissionX
import com.permissionx.guolindev.callback.RequestCallback
import com.proxglobal.worlcupapp.base.BaseFragment

class SelfieCameraFragment: BaseFragment<FragmentSelfieCameraBinding>() {
    override fun getDataBinding(): FragmentSelfieCameraBinding {
        return FragmentSelfieCameraBinding.inflate(layoutInflater)
    }

    override fun addEvent() {
        super.addEvent()
        binding.tvcomming.setOnClickListenerWithScaleAnimation {
            PermissionX.init(this).permissions(Manifest.permission.CAMERA)
                .request { allGranted, grantedList, deniedList ->
                    if (allGranted) {
                        findNavController().navigate(
                            R.id.action_wcFunFragment_to_cameraFragment,
                            null,
                            navOptions {
                                anim {
                                    enter = R.anim.slide_in_left
                                }
                            }
                        )
                    }
                }
        }
    }
}