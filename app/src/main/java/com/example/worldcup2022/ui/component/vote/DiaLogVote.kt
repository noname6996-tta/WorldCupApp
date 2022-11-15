package com.example.worldcup2022.ui.component.vote

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.util.Log
import android.view.LayoutInflater
import android.view.Window
import com.bumptech.glide.Glide
import com.example.worldcup2022.R
import com.example.worldcup2022.data.dto.worldcup.Match
import com.example.worldcup2022.databinding.LayoutDialogVoteBinding
import com.google.gson.Gson

class DiaLogVote(context: Context, match: Match) : Dialog(context) {

    init {
        this.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        context.setTheme(R.style.ThemeDialog)
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val bind: LayoutDialogVoteBinding = LayoutDialogVoteBinding.inflate(inflater)
        setContentView(bind.root)
        listener(bind, match)
        Log.e("TAG", "country "+ Gson().toJson(match) )


    }

    private fun listener(bind: LayoutDialogVoteBinding, match: Match) {
        bind.tvSave.setOnClickListener { dismiss() }
        Glide.with(context).load(match.country1?.image)
            .error(R.drawable.logo).placeholder(R.drawable.logo)
            .into(bind.ivFlag1)
        Glide.with(context).load(match.country2?.image)
            .error(R.drawable.logo).placeholder(R.drawable.logo)
            .into(bind.ivFlag2)
    }
}