package com.example.worldcup2022.view.fragment.selfie

import android.util.Log
import androidx.camera.core.AspectRatio
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageCapture
import androidx.camera.core.Preview
import androidx.camera.core.VideoCapture
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.example.worldcup2022.databinding.FragmentCameraBinding
import com.example.worldcup2022.utils.dp
import com.example.worldcup2022.utils.increaseClickArea
import com.example.worldcup2022.utils.setOnClickListenerWithScaleAnimation
import com.proxglobal.worlcupapp.base.BaseFragment
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

class CameraFragment: BaseFragment<FragmentCameraBinding>() {
    override fun getDataBinding(): FragmentCameraBinding {
        return FragmentCameraBinding.inflate(layoutInflater)
    }
    private var cameraExecutor = Executors.newSingleThreadExecutor()

    override fun addEvent() {
        super.addEvent()

        binding.ivCapture.setOnClickListenerWithScaleAnimation {
            capture()
        }

        binding.ivBack.apply {
            increaseClickArea(5.dp)
            setOnClickListenerWithScaleAnimation {
                findNavController().navigateUp()
            }
        }
    }

    override fun initView() {
        super.initView()
        setupCamera()
    }

    private fun capture() {

    }

    private fun setupCamera() {
        val cameraProviderFuture = ProcessCameraProvider.getInstance(requireContext())

        cameraProviderFuture.addListener({
            // Used to bind the lifecycle of cameras to the lifecycle owner
            val cameraProvider: ProcessCameraProvider = cameraProviderFuture.get()

            // Preview
            val preview = Preview.Builder()
                .setTargetAspectRatio(AspectRatio.RATIO_4_3)
//                .setTargetResolution(Size.parseSize("1x1"))
                .build()
                .also {
                    it.setSurfaceProvider(binding.viewFinder.surfaceProvider)
                }

            val imageCapture = ImageCapture.Builder()
                .setCaptureMode(ImageCapture.CAPTURE_MODE_MAXIMIZE_QUALITY)
                .setTargetAspectRatio(AspectRatio.RATIO_4_3)
                .build()


            // Select back camera as a default
            val cameraSelector = CameraSelector.DEFAULT_FRONT_CAMERA

            try {
                // Unbind use cases before rebinding
                cameraProvider.unbindAll()

                // Bind use cases to camera
                cameraProvider.bindToLifecycle(
                    this, cameraSelector, preview, imageCapture
                )


            } catch (exc: Exception) {
            }

        }, ContextCompat.getMainExecutor(requireContext()))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        cameraExecutor.shutdown()
    }
}