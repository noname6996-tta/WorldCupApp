package com.example.worldcup2022.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.worldcup2022.R
import com.example.worldcup2022.data.dto.worldcup.Highlight
import com.example.worldcup2022.databinding.ItemHighlightBinding
import com.example.worldcup2022.databinding.ItemInstallAppBinding
import com.example.worldcup2022.databinding.ItemLoadingBinding
import java.util.*

class InstallAppAdapter(
    val context: Context,
    var list: List<Int> = listOf()
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var onClickItemListener: ((pos: Int) -> Unit)? = null
    fun setOnClickItemListener(listener: ((pos: Int) -> Unit)) {
        onClickItemListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return InstallViewHolder(ItemInstallAppBinding.inflate(LayoutInflater.from(context), parent, false))


    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = list[position]

        when(holder){
            is InstallViewHolder -> {
                Glide.with(context)
                    .load(item)
                    .placeholder(R.drawable.ic_loading_3x4)
                    .error(R.drawable.ic_loading_3x4)
                    .into(holder.binding.ivBanner)


                holder.binding.root.setOnClickListener {
                    onClickItemListener?.let {
                        it(position)
                    }
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }



    @SuppressLint("NotifyDataSetChanged")
    fun updateData(newList: List<Int>) {
        list = newList
        notifyDataSetChanged()
    }

    inner class InstallViewHolder(binding: ItemInstallAppBinding) :
        RecyclerView.ViewHolder(binding.root) {
        internal val binding: ItemInstallAppBinding

        init {
            this.binding = binding
        }
    }


}