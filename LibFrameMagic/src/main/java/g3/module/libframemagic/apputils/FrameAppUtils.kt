package g3.module.libframemagic.apputils

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.util.DisplayMetrics
import android.util.TypedValue
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.github.florent37.viewanimator.ViewAnimator

class FrameAppUtils {
    fun needsStoragePermission(context: Context): Boolean {
        return Build.VERSION.SDK_INT >= 23 && context.checkSelfPermission(
            Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED
    }
    fun requestStoragePermission(activity: AppCompatActivity, code: Int) {
        if (Build.VERSION.SDK_INT >= 23)
            activity.requestPermissions(arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE), code)
    }

    fun performFileSearch(activity: AppCompatActivity, code: Int, multiple: Boolean, type: String,
                          vararg mimetype: String) {
        val intent = Intent(Intent.ACTION_OPEN_DOCUMENT).apply {
            addCategory(Intent.CATEGORY_OPENABLE)
            this.type = type
            putExtra(Intent.EXTRA_MIME_TYPES, mimetype)
            putExtra(Intent.EXTRA_ALLOW_MULTIPLE, multiple)
        }

        activity.startActivityForResult(intent, code)
    }
    fun performImagesSearch(activity: AppCompatActivity, code: Int) {
        performFileSearch(activity, code, true,
            "image/*",
            "image/png", "image/jpeg", "image/tiff")
    }
    fun dpToPx(dp: Float, context: Context): Float {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            dp,
            context.resources.displayMetrics
        )
            .toFloat()
    }

    /**
     *
     */
    fun setImageResource(imageView: ImageView, res: Int) {
        imageView.setImageResource(res)

    }
    /**
     *
     */
    fun convertDpToPixel(dp: Float, context: Context): Float {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            dp,
            context.resources.displayMetrics
        )
            .toFloat()
    }
    /**
     *
     */
    fun setImage(imageView: ImageView, imageUrl: String?) {
        if (imageUrl != null && imageUrl != "") {
            Glide.with(imageView.context)
                .load(imageUrl)
                .into(imageView)
        }
    }

    /**
     *
     */
    fun getScreenWidth(act: Activity): Int {
        val dm = DisplayMetrics()
        act.windowManager.defaultDisplay.getMetrics(dm)
        return dm.widthPixels
    }
    /**
     *
     */
    fun fadeInView(v: View) {
        ViewAnimator.animate(v).alpha(0.0f, 1.0f).duration(10).onStart {
            v.visibility = View.VISIBLE
        }.start()
    }

    /**
     *
     */
    fun fadeOutView(v: View) {
        ViewAnimator.animate(v).alpha(1.0f, 0.0f).duration(500).onStop {
            v.visibility = View.GONE
        }.start()
    }
    /**
     *
     */
    fun resizeViewByPixel(view: View, width: Int, height: Int) {
        val params = view.layoutParams
        params.width = width
        params.height = height
    }

}