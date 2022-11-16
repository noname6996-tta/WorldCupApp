package com.example.worldcup2022.view.fragment.selfie

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.util.Log
import android.view.Surface
import android.view.View
import androidx.camera.core.*
import androidx.camera.core.ImageCapture.OnImageCapturedCallback
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import com.example.worldcup2022.R
import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.databinding.FragmentCameraBinding
import com.example.worldcup2022.utils.dp
import com.example.worldcup2022.utils.increaseClickArea
import com.example.worldcup2022.utils.setOnClickListenerWithScaleAnimation
import com.proxglobal.worlcupapp.base.BaseFragment
import kotlinx.coroutines.launch
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

class CameraFragment : BaseFragment<FragmentCameraBinding>() {
    override fun getDataBinding(): FragmentCameraBinding {
        return FragmentCameraBinding.inflate(layoutInflater)
    }

    private val cameraViewModel by viewModels<CameraViewModel>()

    private lateinit var cameraExecutor: ExecutorService
    private lateinit var imageCapture: ImageCapture

    override fun addEvent() {
        super.addEvent()

        binding.ivCapture.setOnClickListenerWithScaleAnimation {
            Log.d("CameraFragment", "addObservers:start capture")
            capture()
        }

        binding.ivBack.apply {
            increaseClickArea(10.dp)
            setOnClickListenerWithScaleAnimation {
                findNavController().navigateUp()
            }
        }
    }

    override fun addObservers() {
        super.addObservers()
        cameraViewModel.cutBitmapLiveData.observe(viewLifecycleOwner) {
            when (it) {
                is Resource.Loading -> showLoadingArea()
                else -> {
                    binding.marquee.setImageBitmap(it.data!!)
                    hideLoadingArea()
                }
            }
        }

        cameraViewModel.captureEvent.observe(viewLifecycleOwner) {
            it?.let {
                when (val content = it.getContentIfNotHandled()) {
                    is Resource.Loading -> {
                        showLoadingArea()
                    }

                    is Resource.Success -> {
                        hideLoadingArea()
                        Log.d("CameraFragment", "addObservers: oke bitmap capture")
                        findNavController().navigate(
                            R.id.action_cameraFragment_to_imagePreviewFragment,
                            bundleOf(
                                "image" to content.data!!
                            ),
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

        findNavController().addOnDestinationChangedListener { controller, destination, arguments ->
            Log.d("CameraFragment", "addObservers: change to preview")
            if (destination.id == R.id.imagePreviewFragment) hideLoadingArea()
        }
    }

    private fun showLoadingArea() {
        binding.loadingArea.isVisible = true
        binding.ivCapture.isEnabled = false
    }

    private fun hideLoadingArea() {
        binding.loadingArea.isVisible = false
        binding.ivCapture.isEnabled = true
    }

    override fun initView() {
        super.initView()
        setupCamera()
        requireActivity().findViewById<View>(R.id.bottomMain).isGone = true

        Glide.with(this)
            .asBitmap()
            .load(requireArguments().getString("link"))
            .into(object : CustomTarget<Bitmap>() {
                override fun onResourceReady(resource: Bitmap, transition: Transition<in Bitmap>?) {
                    binding.marquee.post {
                        lifecycleScope.launch {
                            cameraViewModel.getTransparentFrame(
                                binding.marquee.width,
                                binding.marquee.height,
                                resource
                            )
                        }
                    }
                }

                override fun onLoadCleared(placeholder: Drawable?) {
                }
            })


    }

    private fun capture() {
        showLoadingArea()
        imageCapture.takePicture(cameraExecutor, object : OnImageCapturedCallback() {
            override fun onCaptureSuccess(image: ImageProxy) {
                super.onCaptureSuccess(image)
                lifecycleScope.launch {
                    cameraViewModel.capture(image.toBitmap())
                }
            }
        })
    }

    private fun setupCamera() {
        cameraExecutor = Executors.newSingleThreadExecutor()
        val cameraProviderFuture = ProcessCameraProvider.getInstance(requireContext())

        cameraProviderFuture.addListener({
            // Used to bind the lifecycle of cameras to the lifecycle owner
            val cameraProvider: ProcessCameraProvider = cameraProviderFuture.get()

            // Preview
            val preview = Preview.Builder()
                .setTargetAspectRatio(AspectRatio.RATIO_4_3)
                .build()
                .also {
                    it.setSurfaceProvider(binding.viewFinder.surfaceProvider)
                }

            imageCapture = ImageCapture.Builder()
                .setCaptureMode(ImageCapture.CAPTURE_MODE_MAXIMIZE_QUALITY)
                .setTargetAspectRatio(AspectRatio.RATIO_4_3)
                .setTargetRotation(Surface.ROTATION_0)
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