package com.task.ui.component

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import android.util.TypedValue
import android.view.View
import androidx.activity.viewModels
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import com.task.databinding.ActivityBeautyMagicBinding
import com.task.ui.base.BaseActivity
import com.task.utils.AppConstCamera
import com.task.utils.FileUtilsEditor
import dagger.hilt.android.AndroidEntryPoint
import g3.module.libframemagic.appinterface.OnListenerFrameView

/**
 * Created by TruyenDev on 04/10/2022.
 */
@AndroidEntryPoint
class BeautyActivity : BaseActivity() {

    private val beautiViewModel: BeautiViewModel by viewModels()
    private lateinit var binding: ActivityBeautyMagicBinding
    override fun observeViewModel() {

    }

    override fun initViewBinding() {
        binding = ActivityBeautyMagicBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
//        binding.rcFrame.setOnClickListener {

//        }
        getDataIntent()
        listenerFrameMagic()
    }

    /**
     * listener Frame
     */
    private var bitmapOrigin: Bitmap? = null
    private fun listenerFrameMagic() {
        binding.mFrameCustomView.setListener(object : OnListenerFrameView {
            override fun onClickCancel() {
                hideAllView()
            }

            override fun onClickApply(bitmap: Bitmap?) {
                if (bitmap != null) {
                    bitmapOrigin = bitmap
                    updateThumbBeauty()
                }

                hideAllView()



                FileUtilsEditor(this@BeautyActivity).saveExternal(bitmapOrigin!!, System.currentTimeMillis().toString() , AppConstCamera.FORMAT_FILE_SAVE, AppConstCamera.FORMAT_TYPE_JPG, AppConstCamera.FOLDER_SAVE_PHOTO){
                    path ->
                    Log.e("TAG", "onClickApply: "+ path )
                    FileUtilsEditor(this@BeautyActivity).addPhotoToGallery(path)
                }
            }
        })
    }

    private fun hideAllView() {

        binding.mFrameCustomView.visibility = View.GONE

    }

    /**
     * show Frame view
     */
     val BASE_URL_FRAME: String = "https://mystoragetm.s3.ap-southeast-1.amazonaws.com/"
     val URL_FRAME_ONLINE: String = "frames.json"
    private var displayMetrics: DisplayMetrics? = null
    private fun showFrame() {
        binding.mFrameCustomView.visibility = View.VISIBLE
        binding.mFrameCustomView.setUrlFrame(BASE_URL_FRAME, URL_FRAME_ONLINE)
        binding.mFrameCustomView.setBitmapOrigin(
            bitmapOrigin!!,
            displayMetrics!!.widthPixels,
            (displayMetrics!!.heightPixels -dpToPx(
                200f,
                this
            )).toInt()
        )
    }
    private fun updateThumbBeauty() {
        binding.imgViewBeauty.setImageBitmap(bitmapOrigin)
    }

    private fun getDataIntent() {
        val path = intent.getStringExtra("PATH_BEAUTY")
        Log.e("TAG", "getDataIntent: "+ path )
        loadBitmap(this, path, {
            bitmapOrigin = it
            updateThumbBeauty()
            showFrame()
        })
    }

    fun <T> loadBitmap(context: Context, link: T, bitmapSuccess: (bitmap: Bitmap) -> Unit) {
        Glide.with(context)
            .asBitmap()
            .load(link)
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .skipMemoryCache(true)
            .into(object : CustomTarget<Bitmap>() {
                override fun onLoadCleared(placeholder: Drawable?) {
                }

                override fun onResourceReady(
                    resource: Bitmap,
                    transition: Transition<in Bitmap>?
                ) {
                    bitmapSuccess(resource)
                }
            })
    }
    fun dpToPx(dp: Float, context: Context): Float {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            dp,
            context.resources.displayMetrics
        ).toFloat()
    }
}