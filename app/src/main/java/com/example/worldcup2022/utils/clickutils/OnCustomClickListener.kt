package com.example.worldcup2022.utils.clickutils

import android.view.MotionEvent
import android.view.View

interface OnCustomClickListener {
    fun onCustomClick(v: View?, event: MotionEvent?)
}