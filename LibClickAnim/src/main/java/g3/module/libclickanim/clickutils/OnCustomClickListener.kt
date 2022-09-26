package g3.module.libclickanim.clickutils

import android.view.MotionEvent
import android.view.View

interface OnCustomClickListener {
    fun onCustomClick(v: View?, event: MotionEvent?)
}