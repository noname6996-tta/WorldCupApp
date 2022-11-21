package com.example.worldcup2022.view.fragment.selfie

import android.content.ContentValues
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.content.FileProvider
import androidx.core.view.isGone
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.worldcup2022.R
import com.example.worldcup2022.databinding.FragmentImagePreviewBinding
import com.example.worldcup2022.utils.dp
import com.example.worldcup2022.utils.increaseClickArea
import com.example.worldcup2022.utils.setOnClickListenerWithScaleAnimation
import com.google.firebase.analytics.FirebaseAnalytics
import com.proxglobal.proxads.adsv2.callback.AdsCallback
import com.proxglobal.proxads.adsv2.callback.RewardCallback
import com.proxglobal.proxads.adsv2.remote_config.ProxAdsConfig
import com.proxglobal.worlcupapp.base.BaseFragment
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.*

class ImagePreviewFragment : BaseFragment<FragmentImagePreviewBinding>() {
    override fun getDataBinding(): FragmentImagePreviewBinding {
        return FragmentImagePreviewBinding.inflate(layoutInflater)
    }

    private lateinit var bitmap: Bitmap

    var isSaved = false

    override fun initView() {
        super.initView()
        lifecycleScope.launch(Dispatchers.Main) {
            if (!this@ImagePreviewFragment::bitmap.isInitialized) {
                bitmap = requireArguments().getParcelable("image")!!
            }
            withContext(Dispatchers.IO) {
                convertImageToFile()
            }
            requireArguments().clear()
            Glide.with(this@ImagePreviewFragment)
                .load(bitmap)
                .override(500,500)
                .into(binding.ivPreview)

            binding.ivBack.increaseClickArea(20.dp)
            binding.btnSave.increaseClickArea(10.dp)
            binding.btnSave.increaseClickArea(10.dp)
        }
    }

    private lateinit var imageFile: File

    private fun convertImageToFile() {
        imageFile = File(requireContext().cacheDir, "image_" + System.currentTimeMillis() + ".jpg")
        val bytes = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bytes)
        try {
            val fo = FileOutputStream(imageFile)
            fo.write(bytes.toByteArray())
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    override fun addEvent() {
        super.addEvent()
        binding.ivBack.setOnClickListener {
            findNavController().navigateUp()
        }

        binding.btnShare.setOnClickListenerWithScaleAnimation {
            shareImage()
        }

        binding.btnSave.setOnClickListenerWithScaleAnimation {
            FirebaseAnalytics.getInstance(requireContext()).logEvent("Result_click_Save", Bundle())

            if (!isSaved){
                ProxAdsConfig.instance.showRewardAds(
                    activity = requireActivity(),
                    id_show_ads = "id_reward_click_save_selfie",
                    adsId = getString(R.string.id_reward_ads),
                    callback = object : AdsCallback() {
                        override fun onClosed() {
                            saveImage()
                        }

                        override fun onError(message: String?) {
                            Log.d("ntduc_debug", "RewardAds onError: $message")
                            saveImage()
                        }
                    },
                    rewardCallback = object : RewardCallback() {}
                )
            }else{
                saveImage()
            }
        }
    }

    private fun saveImage() {
        var os: OutputStream? = null
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            val values = ContentValues().apply {
                put(MediaStore.MediaColumns.DISPLAY_NAME, "image_${System.currentTimeMillis()}.jpg")
                put(MediaStore.MediaColumns.MIME_TYPE, "image/jpg")
                put(MediaStore.MediaColumns.RELATIVE_PATH, Environment.DIRECTORY_DCIM + "/WorldCup")
            }
            val contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            val uri = requireContext().contentResolver.insert(contentUri, values)
            os = requireContext().contentResolver.openOutputStream(uri!!)
        } else {
            val dir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM)
            val file = File(dir, "image_${System.currentTimeMillis()}.jpg")
            os = FileOutputStream(file)
        }
        os?.use {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, it)
            it.close()
        }
        Toast.makeText(requireContext(), getString(R.string.success), Toast.LENGTH_SHORT).show()
        isSaved = true
    }

    private fun shareImage() {
        val uri = FileProvider.getUriForFile(
            requireContext(),
            requireContext().applicationContext.packageName,
            imageFile
        )
        val shareIntent = Intent(Intent.ACTION_SEND).apply {
            type = "image/jpeg"
            putExtra(Intent.EXTRA_STREAM, uri)
        }
        startActivity(shareIntent)
    }

    override fun onDestroy() {
        super.onDestroy()
        imageFile.delete()
    }

    override fun onResume() {
        super.onResume()
        requireActivity().findViewById<View>(R.id.bottomMain).isGone = true
    }
}