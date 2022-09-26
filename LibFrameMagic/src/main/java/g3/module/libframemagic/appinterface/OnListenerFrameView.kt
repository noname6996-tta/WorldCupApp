package g3.module.libframemagic.appinterface

import android.graphics.Bitmap

interface OnListenerFrameView {
    fun onClickCancel()
    fun onClickApply(bitmap: Bitmap?)
}