package g3.module.libframemagic.ui.customview

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Matrix
import android.graphics.PointF
import android.util.AttributeSet
import android.util.Pair
import android.view.MotionEvent
import android.view.View

class TouchView constructor(context: Context, attributeSet: AttributeSet) : View(
    context,
    attributeSet
) {
    private var withView = 0F
    private var heightView = 0F
    private var ratio = 0.0f
    private var newHeight = 0
    private var newWidth = 0
    private var touchStartX = 0F
    private var touchStartY = 0F
    private var dx = 0F
    private var dy = 0F
    private var mid = PointF()
    private var oldDist = 1f
    private var d = 0f
    private var newRot = 0f
    private var savedElement = Matrix()
    private var matrixElement = Matrix()
    private var modeView = NONE
    private var lastEvent: FloatArray? = null
    private var bitmapOrigin: Bitmap? = null
    private var mCheckShowBitmap = true

    companion object {
        const val NONE = 0
        const val DRAG = 1
        const val ZOOM = 2
        const val LIMIT_ZOOM_OUT = 0.1f
    }

    init {
        matrixElement.setTranslate(0F, 0F)
    }

    fun setSizeView(with: Float, height: Float) {
        withView = with
        heightView = height
        requestLayout()
    }

    fun setBitmap(bitmap: Bitmap) {
        bitmapOrigin = getResizedBitmap(
            bitmap!!,
            getScale(bitmap!!.width.toFloat(), bitmap!!.height.toFloat()).first.toInt(),
            getScale(bitmap!!.width.toFloat(), bitmap!!.height.toFloat()).second.toInt()
        )
        matrixElement.setTranslate((withView - bitmapOrigin!!.width) / 2f, (heightView - bitmapOrigin!!.height) / 2f)

    }

    /**
     * tính scale
     */
    private fun getScale(width: Float, height: Float): Pair<Float, Float> {
        var newW = withView.toFloat()
        var newH = (height *
                withView / width)


        if (newH > heightView) {
            val temp = heightView / newH
            newH = heightView.toFloat()
            newW = (withView * temp)
        }
        return Pair(newW, newH)
    }

    fun setRatio(ratio: Float) {
        this.ratio = ratio
        requestLayout()
    }

    @SuppressLint("DrawAllocation")
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        if (newWidth != 0 && newHeight != 0) {
            val newWidthSpec = MeasureSpec.makeMeasureSpec(newWidth, MeasureSpec.EXACTLY)
            val newHeightSpec = MeasureSpec.makeMeasureSpec(newHeight, MeasureSpec.EXACTLY)
            super.onMeasure(newWidthSpec, newHeightSpec)
        }
//        if (ratio != 0.0f) {
//            val width = withView.toInt()
//            val height = heightView.toInt()
//            if (width / ratio < height) {
//                newWidth = width
//                newHeight = (width / ratio).roundToInt()
//            } else {
//                newHeight = height
//                newWidth = (height * ratio).roundToInt()
//            }
//
//            bitmapOrigin = getResizedBitmap(bitmapOrigin,newHeight,newWidth)
//            val newWidthSpec = MeasureSpec.makeMeasureSpec(newWidth, MeasureSpec.EXACTLY)
//            val newHeightSpec = MeasureSpec.makeMeasureSpec(newHeight, MeasureSpec.EXACTLY)
//            super.onMeasure(newWidthSpec, newHeightSpec)
//        }
        else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        }
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        if (mCheckShowBitmap) {
            bitmapOrigin?.let {
                canvas!!.drawBitmap(it, matrixElement, null)
            }

        }

    }

    //    private fun getResizedBitmap(bm: Bitmap?, newHeight: Int, newWidth: Int): Bitmap? {
//        if (bm == null || newHeight <= 0 || newWidth <= 0) return bm
//        val width = bm.width
//        val height = bm.height
//        val scaleWidth = newWidth.toFloat() / width
//        val scaleHeight = newHeight.toFloat() / height
//        val matrix = Matrix()
//        matrix.postScale(scaleWidth, scaleHeight)
//        return Bitmap.createBitmap(bm, 0, 0, width, height, matrix, true)
//    }
    fun getResizedBitmap(bm: Bitmap, newWidth: Int, newHeight: Int): Bitmap? {
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

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event!!.action and MotionEvent.ACTION_MASK) {
            MotionEvent.ACTION_DOWN -> {
                onActionDown(event)
                return true
            }

            MotionEvent.ACTION_POINTER_DOWN -> {
                actionPointerDown(event)
                return true
            }

            MotionEvent.ACTION_MOVE -> {
                onActionMove(event)
                return true
            }

            MotionEvent.ACTION_UP -> {
                return true
            }

            MotionEvent.ACTION_POINTER_UP -> {
                modeView = NONE
                lastEvent = null
                return true
            }
        }
        return false
    }


    private fun onActionDown(event: MotionEvent) {
        touchStartX = event.x
        touchStartY = event.y
        savedElement.set(matrixElement)
        modeView = DRAG
    }


    private fun actionPointerDown(event: MotionEvent) {
        oldDist = ZoomImageUtil.spacing(event)
        if (oldDist > 10f) {
            savedElement.set(matrixElement)
            ZoomImageUtil.midPoint(mid, event)
            modeView = ZOOM
        }
        lastEvent = FloatArray(4)
        lastEvent!![0] = event.getX(0)
        lastEvent!![1] = event.getX(1)
        lastEvent!![2] = event.getY(0)
        lastEvent!![3] = event.getY(1)
        d = ZoomImageUtil.rotation(event)
    }

    private fun onActionMove(event: MotionEvent) {
        dx = event.x - touchStartX
        dy = event.y - touchStartY
        if (modeView == DRAG) {
            matrixElement.set(savedElement)
            matrixElement.postTranslate(dx, dy)
        }

        if (modeView == ZOOM) {
            val newDist = ZoomImageUtil.spacing(event)
            if (newDist > 10f) {
                matrixElement.set(savedElement)
                var scale = newDist / oldDist
                if (scale < LIMIT_ZOOM_OUT) scale = LIMIT_ZOOM_OUT
                matrixElement.postScale((scale), (scale), mid.x, mid.y)
            }

            if (lastEvent != null && event.pointerCount >= 2) {
                newRot = ZoomImageUtil.rotation(event)
                val r: Float = newRot - d
                matrixElement.postRotate(r, mid.x, mid.y)
            }
        }
        invalidate()
    }

    /**
     *
     */
    fun genBitmapBg(): Bitmap {
        val bitmapOut = Bitmap.createBitmap(withView.toInt(), heightView.toInt(), Bitmap.Config.ARGB_8888)
        val canvasGen = Canvas(bitmapOut)
        bitmapOrigin?.let {
            canvasGen!!.drawBitmap(it, matrixElement, null)
        }
        return bitmapOut
    }

    /**
     *
     */
    fun resetView() {
        withView = 0F
        heightView = 0F
        ratio = 0.0f
        newHeight = 0
        newWidth = 0
        touchStartX = 0F
        touchStartY = 0F
        dx = 0F
        dy = 0F
        mid = PointF()
        oldDist = 1f
        d = 0f
        newRot = 0f
        savedElement = Matrix()
        matrixElement = Matrix()
        modeView = NONE
        lastEvent = null
        bitmapOrigin = null
        matrixElement.setTranslate(0F, 0F)

    }

    /**
     *
     */
    fun setCheckShowBitmap(check: Boolean) {
        this.mCheckShowBitmap = check
        invalidate()
    }
}