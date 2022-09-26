package g3.module.libframemagic.ui.customview

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Matrix
import android.graphics.Paint
import android.util.AttributeSet
import android.util.Pair
import android.view.View

class FrameDrawView(context: Context?, attrs: AttributeSet?) : View(context, attrs) {
    private var mNewWidth = 0
    private var mNewHeight = 0
    private var mBitmapImage: Bitmap? = null
    private var mBitmapImageDraw: Bitmap? = null
    private var mBitmapBg: Bitmap? = null
    private var mBitmapBgDraw: Bitmap? = null
    private var mWidthScreen = 0
    private var mHeightScreen = 0
    private var mEnableDraw = false


    /**
     *
     */
    fun setWidthHeightScreen(width: Int, height: Int) {
        this.mWidthScreen = width
        this.mHeightScreen = height
    }

    /**
     *
     */
    fun setBitmapFrame(bitmapImage: Bitmap, updateSizeBitmap: (bitmapSuccess: Bitmap, width: Int, height: Int) -> Unit) {
        this.mBitmapImage = bitmapImage

        mBitmapImageDraw = getResizedBitmap(mBitmapImage!!, getScaleFrame(mBitmapImage!!.width.toFloat(), mBitmapImage!!.height.toFloat()).first.toInt(), getScaleFrame(mBitmapImage!!.width.toFloat(), mBitmapImage!!.height.toFloat()).second.toInt())
        updateSizeBitmap(mBitmapImageDraw!!, mBitmapImageDraw!!.width, mBitmapImageDraw!!.height)
        setSizeLayoutDraw(mBitmapImageDraw!!.width, mBitmapImageDraw!!.height)
        invalidate()
    }

    /**
     *
     */
    fun setBitmapBg(bitmapImage: Bitmap, updateSizeBitmap: (bitmapSuccess: Bitmap, width: Int, height: Int) -> Unit) {
        this.mBitmapBg = bitmapImage

        mBitmapBgDraw = getResizedBitmap(mBitmapBg!!,
            getScale(mBitmapBg!!.width.toFloat(), mBitmapBg!!.height.toFloat()).first.toInt(),
            getScale(mBitmapImage!!.width.toFloat(), mBitmapImage!!.height.toFloat()).second.toInt())
        updateSizeBitmap(mBitmapImageDraw!!, mBitmapImageDraw!!.width, mBitmapImageDraw!!.height)
        setSizeLayoutDraw(mBitmapImageDraw!!.width, mBitmapImageDraw!!.height)
        invalidate()
    }

    /**
     *
     */
    private fun setSizeLayoutDraw(width: Int, height: Int) {
        this.mNewWidth = width
        this.mNewHeight = height
        requestLayout()
    }

    /**
     * resize
     */
    private fun getResizedBitmap(bm: Bitmap, newWidth: Int, newHeight: Int): Bitmap? {
        val width = bm.width
        val height = bm.height
        val scaleWidth = newWidth.toFloat() / width
        val scaleHeight = newHeight.toFloat() / height
        // CREATE A MATRIX FOR THE MANIPULATION
        val matrix = Matrix()
        // RESIZE THE BIT MAP
        matrix.postScale(scaleWidth, scaleHeight)
        // "RECREATE" THE NEW BITMAP
        val resizedBitmap = Bitmap.createBitmap(
            bm, 0, 0, width, height, matrix, false
        )
        return resizedBitmap
    }


    /**
     * tính scale
     */
    private fun getScale(width: Float, height: Float): Pair<Float, Float> {
        var newW = mWidthScreen.toFloat()
        var newH = (height *
                mWidthScreen / width)


        if (newH > mHeightScreen) {
            val temp = mHeightScreen / newH
            newH = mHeightScreen.toFloat()
            newW = (mWidthScreen * temp)
        }
        return Pair(newW, newH)
    }

    private fun getScaleFrame(width: Float, height: Float): Pair<Float, Float> {
        var newW = mWidthScreen.toFloat()
        var newH = (height *
                mWidthScreen / width)


//        if (newH > mHeightScreen) {
//            val temp = mHeightScreen / newH
//            newH = mHeightScreen.toFloat()
//            newW = (mWidthScreen * temp)
//        }
        return Pair(newW, newH)
    }


    /**
     *
     */
    override fun onDraw(canvas: Canvas) {
        System.gc()
        canvas.save()
        if (mEnableDraw) {
            if (mBitmapImageDraw != null) {
                canvas.drawBitmap(mBitmapImageDraw!!, (this.width - mBitmapImageDraw!!.width) / 2f, (this.height - mBitmapImageDraw!!.height) / 2f, Paint())
            }

        }

        canvas.restore()
    }

    /**
     *
     */
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        if (mNewWidth != 0 && mNewHeight != 0) {
            val newWidthSpec = MeasureSpec.makeMeasureSpec(mNewWidth, MeasureSpec.EXACTLY)
            val newHeightSpec = MeasureSpec.makeMeasureSpec(mNewHeight, MeasureSpec.EXACTLY)
            super.onMeasure(newWidthSpec, newHeightSpec)
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        }
    }

    /**
     *
     */
    fun genBitmapFrame(bitmap: Bitmap): Bitmap {
        val bitmapOut = Bitmap.createBitmap(width.toInt(), height.toInt(), Bitmap.Config.ARGB_8888)
        val canvasGen = Canvas(bitmapOut)
        if (mBitmapImageDraw != null) {

            canvasGen.drawBitmap(bitmap!!, (this.width - mBitmapImageDraw!!.width) / 2f, (this.height - mBitmapImageDraw!!.height) / 2f, Paint())
            canvasGen.drawBitmap(mBitmapImageDraw!!, (this.width - mBitmapImageDraw!!.width) / 2f, (this.height - mBitmapImageDraw!!.height) / 2f, Paint())
        }

        return bitmapOut
    }

    /**
     *
     */
    fun setEnableDraw(check: Boolean) {
        this.mEnableDraw = check
        invalidate()
    }
}