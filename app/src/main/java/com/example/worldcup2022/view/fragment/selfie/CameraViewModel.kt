package com.example.worldcup2022.view.fragment.selfie

import android.app.Application
import android.graphics.*
import android.util.Log
import androidx.camera.core.ImageProxy
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.utils.SingleEvent
import com.example.worldcup2022.utils.eventOf
import com.example.worldcup2022.utils.mutableLiveDataOf
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.nio.ByteBuffer
import java.util.concurrent.CountDownLatch


class CameraViewModel(
    application: Application,
    private val savedStateHandle: SavedStateHandle
) : AndroidViewModel(application) {
    private var maskWidth = 0
    private var maskHeight = 0

    private var imageCaptureWidth = 0
    private var imageCaptureHeight = 0

    private lateinit var cutRect: Rect
    private var span = 0

    private lateinit var maskBitmap: Bitmap
    private lateinit var cutBitmap: Bitmap

    private var link: String = savedStateHandle.get<String>("link")!!


    val cutBitmapLiveData: MutableLiveData<Resource<Bitmap>> =
        mutableLiveDataOf(Resource.Loading())

    val captureEvent: MutableLiveData<SingleEvent<Resource<Bitmap>>> = mutableLiveDataOf(eventOf(Resource.DataError(0)))

    private suspend fun getTransparentRect(image: Bitmap): Rect {
        Log.d(javaClass.name, "getTransparentRect: w = ${image.width}, h = ${image.height}")
        var left = -1
        var right = -1
        var top = -1
        var bottom = -1

        val countDownLatch = CountDownLatch(2)

        Thread {
            for (x in 0 until image.width) {
                for (y in 0 until image.height) {
                    if (image.isTransparencyPixel(x, y)) {
                        if (left == -1) { //if left is not assign before, mean this is left
                            left = x
                        }
                        right = x
                    }
                }
            }
            countDownLatch.countDown()
        }.start()

        Thread {
            for (y in 0 until image.height) {
                for (x in 0 until image.width) {
                    if (image.isTransparencyPixel(x, y)) {
                        if (top == -1) { //if left is not assign before, mean this is left
                            top = y
                        }
                        bottom = y
                    }
                }
            }
            countDownLatch.countDown()
        }.start()
        countDownLatch.await()
        Log.d(javaClass.name, "getTransparentRect: l = $left, r = $right, t = $top, b = $bottom")
        return Rect(left, top, right, bottom)
    }

    private fun Bitmap.crop(w: Int, h: Int, frame: Rect) {
        val rightToEdge = width - frame.right
        val bottomToEdge = height - frame.bottom

        val ratio = w.toFloat() / h
        Log.d("CameraViewModel", "crop:${frame.width()} ")

        val count = if (frame.width() > 200) frame.width() * 1.5f
        else frame.width()

        val min1 = Math.min(frame.left, rightToEdge)
        val min2 = Math.min(frame.top, bottomToEdge)
        val min = Math.min(min1, min2)
        span = if (min <= count.toInt()) min else count.toInt()

        var rec1: Rect
        var rect2: Rect

        val cutWidth1 = frame.width() + 2 * span
        val cutHeight1 = cutWidth1 / ratio
        val newTOp = (frame.top - (cutHeight1 - frame.height()) / 2).toInt()
        rec1 = Rect(
            frame.left - span, newTOp, frame.left - span + cutWidth1,
            (newTOp + cutHeight1).toInt()
        )

        val cutHeight = frame.height() + 2 * span
        val cutWidth = ratio * cutHeight
        val newLeft = (frame.left - (cutWidth - frame.width()) / 2).toInt()
        rect2 = Rect(
            newLeft,
            frame.top - span,
            (newLeft + cutWidth).toInt(),
            frame.top - span + cutHeight
        )

        try {
            cutBitmap = Bitmap.createBitmap(
                this,
                rec1.left,
                rec1.top,
                rec1.width(), rec1.height()
            )
            cutRect = rec1
        } catch (e: Exception) {
            cutBitmap = Bitmap.createBitmap(
                this,
                rect2.left,
                rect2.top,
                rect2.width(), rect2.height()
            )
            cutRect = rect2
        }
        saveCutBitmapToCache()
        val tmp = Bitmap.createScaledBitmap(cutBitmap, w, h, true)
        cutBitmapLiveData.postValue(Resource.Success(tmp))

        Log.d(
            "CameraViewModel",
            "crop: w = $w, h = $h, cutBItmap: w = ${cutRect.width()} h = ${cutRect.height()}"
        )
    }

    fun capture(image: Bitmap) {

        viewModelScope.launch(Dispatchers.Default) {
            captureEvent.postValue(eventOf(Resource.Loading()))
            val tmp = Bitmap.createScaledBitmap(image, cutBitmap.width, cutBitmap.height, true)
            val c = Canvas(tmp)
            c.drawBitmap(cutBitmap, 0f, 0f, null)

            val bitmap = Bitmap.createBitmap(maskWidth, maskHeight, Bitmap.Config.ARGB_8888)
            val canvas = Canvas(bitmap)
            canvas.drawBitmap(maskBitmap, 0f, 0f, null)
            canvas.drawBitmap(tmp, cutRect.left.toFloat(), cutRect.top.toFloat(), null)
            Log.d("CameraFragment", "addObservers:oke capture")
            captureEvent.postValue(eventOf(Resource.Success(bitmap)))
        }
    }

    fun getTransparentFrame(w: Int, h: Int, bitmap: Bitmap) {
        if (cutBitmapLiveData.value?.data != null) return
        cutBitmapLiveData.postValue(Resource.Loading())
        maskBitmap = bitmap
        maskWidth = bitmap.width
        maskHeight = bitmap.height
        imageCaptureHeight = h
        imageCaptureWidth = w
        val cached = getCutBitmapFromCache(link)
        if (cached != null) {
            cutBitmap = cached
            cutBitmapLiveData.postValue(Resource.Success(cached))
            return
        }
        viewModelScope.launch(Dispatchers.Default) {
            bitmap.crop(w, h, getTransparentRect(bitmap))
        }
    }

    private fun getImageNameOfLink(link: String): String {
        val a = link.split("/")
        return a.last().split(".").first()
    }

    private fun saveCutBitmapToCache() {
        val dir = File(getApplication<Application>().cacheDir.absolutePath + "/worldcup")
        if (!dir.exists()) {
            dir.mkdirs()
        }
        val cacheFile = File(dir, "${getImageNameOfLink(link)}.png")
        val cacheCutRectFile = File(dir, "${getImageNameOfLink(link)}_rect.txt")
        cacheCutRectFile.bufferedWriter().use { out -> out.write(Gson().toJson(cutRect)) }
        convertImageToFile(cutBitmap, cacheFile)
    }

    private fun getCutBitmapFromCache(link: String): Bitmap? {
        val dir = File(getApplication<Application>().cacheDir.absolutePath + "/worldcup")
        if (!dir.exists()) {
            dir.mkdirs()
        }
        var result: Bitmap? = null
        dir.listFiles()?.forEach {
            if ((it.name == getImageNameOfLink(link) + "_rect.txt")) {
                cutRect = Gson().fromJson(it.readText(), Rect::class.java)
            }
            if (it.name == getImageNameOfLink(link) + ".png") {
                result = BitmapFactory.decodeFile(it.path)
            }
        }
        return result
    }

    private fun convertImageToFile(bitmap: Bitmap, file: File) {
        try {
            val fo = FileOutputStream(file)
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fo)
            fo.flush()
            fo.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    private fun Bitmap.isTransparencyPixel(x: Int, y: Int): Boolean =
        (getPixel(x, y) and -0x1000000 shr 24) in 0..255
}

fun ImageProxy.toBitmap(): Bitmap {
    val planeProxy = planes[0]
    val buffer: ByteBuffer = planeProxy.buffer
    val bytes = ByteArray(buffer.remaining())
    buffer.get(bytes)
    return BitmapFactory.decodeByteArray(bytes, 0, bytes.size).rotate(imageInfo.rotationDegrees)
}

fun Bitmap.rotate(degrees: Int): Bitmap =
    Bitmap.createBitmap(this, 0, 0, width, height, Matrix().apply {
        postRotate(degrees.toFloat()) // rotate image
        preScale(1f, -1f) // mirror image
    }, true)