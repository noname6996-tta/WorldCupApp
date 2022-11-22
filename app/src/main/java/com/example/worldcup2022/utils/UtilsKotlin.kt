package com.example.worldcup2022.utils

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.ContextWrapper
import android.content.Intent
import android.graphics.*
import android.net.Uri
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by TruyenDev on 30/10/2022.
 */
class UtilsKotlin {
    /**
     *
     */
//    open fun doSharpen(original: Bitmap, radius: FloatArray?): Bitmap {
//        val bitmap = Bitmap.createBitmap(
//            original.width, original.height,
//            Bitmap.Config.ARGB_8888)
//        val rs: RenderScript = RenderScript.create(context)
//        val allocIn: Allocation = Allocation.createFromBitmap(rs, original)
//        val allocOut: Allocation = Allocation.createFromBitmap(rs, bitmap)
//        val convolution: ScriptIntrinsicConvolve3x3 = ScriptIntrinsicConvolve3x3.create(rs, Element.U8_4(rs))
//        convolution.setInput(allocIn)
//        convolution.setCoefficients(radius)
//        convolution.forEach(allocOut)
//        allocOut.copyTo(bitmap)
//        rs.destroy()
//        return bitmap
//    }

    /**
     *
     */
    private fun getResizedBitmap(bm: Bitmap, newHeight: Int): Bitmap {
        val width = bm.width
        val height = bm.height
        val scaleHeight = newHeight.toFloat() / height
        // create a matrix for the manipulation
        val matrix = Matrix()
        // resize the bit map
        matrix.postScale(scaleHeight, scaleHeight)
        // recreate the new Bitmap
        return Bitmap.createBitmap(bm, 0, 0, width, height, matrix, false)
    }

    /**
     *
     */
    open fun replaceColor(src: Bitmap, fromColor: Int, targetColor: Int): Bitmap {

        // Source image size
        val width = src.width
        val height = src.height
        val pixels = IntArray(width * height)
        //get pixels
        src.getPixels(pixels, 0, width, 0, 0, width, height)
        for (x in pixels.indices) {
            pixels[x] = if (pixels[x] == fromColor) targetColor else pixels[x]
        }
        // create result bitmap output
        val result = Bitmap.createBitmap(width, height, src.config)
        //set pixels
        result.setPixels(pixels, 0, width, 0, 0, width, height)
        return result
    }

    fun darkenText(bmp: Bitmap, contrast: Float): Bitmap {
        val cm = ColorMatrix()
        val scale = contrast + 1f
        val translate = (-.5f * scale + .5f) * 255f
        cm.set(
            floatArrayOf(
                scale, 0f, 0f, 0f, translate,
                0f, scale, 0f, 0f, translate,
                0f, 0f, scale, 0f, translate,
                0f, 0f, 0f, 1f, 0f
            )
        )
        val ret = Bitmap.createBitmap(bmp.width, bmp.height, bmp.config)
        val canvas = Canvas(ret)
        val paint = Paint()
        paint.colorFilter = ColorMatrixColorFilter(cm)
        canvas.drawBitmap(bmp, 0f, 0f, paint)
        return ret
    }

    fun saveToInternalStorageCrop(croppedBitmap: Bitmap, context: Context): String? {

        var sharp =
            floatArrayOf(-0.15f, -0.15f, -0.15f, -0.15f, 2.2f, -0.15f, -0.15f, -0.15f, -0.15f)
        //you call the method above and just paste the bitmap you want to apply it and the float of above
//        val bitmapImage = doSharpen(croppedBitmap!! , sharp)
        val bitmapImage = replaceColor(croppedBitmap!!, Color.GRAY, Color.BLACK)
        val bitmapImageNew = darkenText(bitmapImage, 0.8f)
//        val bitmapImage = croppedBitmap ?: return ""
        val cw = ContextWrapper(context)
        val fileNameToSave = "BVDR_" + System.currentTimeMillis()
        // path to /data/data/yourapp/app_data/imageDir
        val directory: File = cw.getDir("imageDir", Context.MODE_PRIVATE)
        // Create imageDir
        val mypath = File(directory, "${fileNameToSave}.jpg")
        var fos: FileOutputStream? = null
        try {
            fos = FileOutputStream(mypath)
            // Use the compress method on the BitMap object to write image to the OutputStream
            bitmapImageNew.compress(Bitmap.CompressFormat.JPEG, 100, fos)
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            try {
                fos!!.close()
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
        return mypath.absolutePath
    }

    fun parseTime(timeInString: String): Long {
        val df1: DateFormat = SimpleDateFormat("dd/MM/yyyy")
        val result1 = df1.parse(timeInString)
        return result1.time
    }

    fun formatDate(time: Long): String {
        val calendar = Calendar.getInstance().apply {
            timeInMillis = time
        }.time
        return SimpleDateFormat("EEE dd MMM", Locale.ENGLISH).format(calendar)
    }
    fun formatDate_dd_MM_yyyy(time: Long): String {
        val calendar = Calendar.getInstance().apply {
            timeInMillis = time
        }.time
        return SimpleDateFormat("dd/MM/yyyy", Locale.ROOT).format(calendar)
    }
    fun parseTime_yyyy_MM_dd_T_HH_mm_ssZ(timeInString: String): Long {
        val df1: DateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
        val result1 = df1.parse(timeInString)
        return result1.time
    }

    fun parseTimeEEEddMMM(timeInString: String): Long {
        val df1: DateFormat = SimpleDateFormat("EEE dd MMM")
        val result1 = df1.parse(timeInString)
        return result1.time
    }

    fun openApp(activity: Activity, packageName: String) {
        try {
            activity.startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("market://details?id=$packageName")
                )
            )
        } catch (e: ActivityNotFoundException) {
            activity.startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/details?id=$packageName")
                )
            )
        }
    }

}