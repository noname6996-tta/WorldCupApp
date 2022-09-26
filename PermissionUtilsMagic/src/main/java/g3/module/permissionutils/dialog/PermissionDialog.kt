package g3.module.permissionutils.dialog

import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.ViewGroup
import android.view.Window
import android.widget.TextView
import androidx.appcompat.app.AppCompatDialog
import g3.module.permissionutils.R

class PermissionDialog(
    activity: Activity,
    msg: Int,
    private val onClickOk: () -> Unit,
    private val onClickCancel: () -> Unit
) : Dialog(activity) {

    private var mTvMsg: TextView? = null
    private var mBtnOk: TextView? = null
    private var mBtnCancel: TextView? = null

    init {
        context.setTheme(android.R.style.Theme_Black_NoTitleBar_Fullscreen)
        this.requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.setCancelable(false)
        this.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        this.setContentView(R.layout.permission_dialog)
        window!!.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )

        mTvMsg = findViewById(R.id.galleryDialogPermissionTvMsg)
        mTvMsg?.text = activity.resources.getText(msg)

        mBtnOk = findViewById(R.id.galleryDialogPermissionBtnOk)
        mBtnCancel = findViewById(R.id.galleryDialogPermissionBtnCancel)


        mBtnOk?.setOnClickListener {
            onClickOk()
            dismiss()
        }

        mBtnCancel?.setOnClickListener {
            onClickCancel()
            dismiss()
        }
    }
}

