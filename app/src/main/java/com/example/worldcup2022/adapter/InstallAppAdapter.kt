package com.example.worldcup2022.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.worldcup2022.R
import com.example.worldcup2022.databinding.ItemInstallAppBinding

class InstallAppAdapter(
    val context: Context,
    var list: List<Int> = listOf()
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val newList: List<Int> =
        listOf(list.last()) + list + listOf(list.first())
    private var onClickItemListener: ((pos: Int) -> Unit)? = null
    fun setOnClickItemListener(listener: ((pos: Int) -> Unit)) {
        onClickItemListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return InstallViewHolder(ItemInstallAppBinding.inflate(LayoutInflater.from(context), parent, false))


    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = newList[position]

        when (holder) {
            is InstallViewHolder -> {
                Glide.with(context)
                    .load(item)
                    .placeholder(R.drawable.logo)
                    .error(R.drawable.logo)
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
        return newList.size
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