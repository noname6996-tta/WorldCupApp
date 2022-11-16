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
import com.example.worldcup2022.databinding.ItemLoadingBinding
import java.util.*

class HighlightAdapter(
    val context: Context,
    var list: List<Highlight> = listOf()
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var isLoadMore: Boolean = true

    private var onClickItemListener: ((Highlight) -> Unit)? = null
    fun setOnClickItemListener(listener: ((Highlight) -> Unit)) {
        onClickItemListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            HIGHLIGHT -> {
                val binding =
                    ItemHighlightBinding.inflate(LayoutInflater.from(context), parent, false)
                HighlightViewHolder(binding)
            }
            else -> {
                val binding =
                    ItemLoadingBinding.inflate(LayoutInflater.from(context), parent, false)
                LoadingViewHolder(binding)
            }
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = list[position]

        when(holder){
            is HighlightViewHolder -> {
                Glide.with(context)
                    .load(item.image)
                    .placeholder(R.drawable.ic_loading_3x4)
                    .error(R.drawable.ic_loading_3x4)
                    .into(holder.binding.img)

                holder.binding.txtName.text = item.name

                holder.binding.root.setOnClickListener {
                    onClickItemListener?.let {
                        it(item)
                    }
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun getItemViewType(position: Int): Int {
        return if (list[position].id != null) HIGHLIGHT else LOADING
    }

    @SuppressLint("NotifyDataSetChanged")
    fun updateData(newList: List<Highlight>) {
        list = newList
        notifyDataSetChanged()
    }

    inner class HighlightViewHolder(binding: ItemHighlightBinding) :
        RecyclerView.ViewHolder(binding.root) {
        internal val binding: ItemHighlightBinding

        init {
            this.binding = binding
        }
    }

    inner class LoadingViewHolder(binding: ItemLoadingBinding) :
        RecyclerView.ViewHolder(binding.root) {
        internal val binding: ItemLoadingBinding

        init {
            this.binding = binding
        }
    }

    companion object {
        const val HIGHLIGHT = 0
        const val LOADING = 1
    }
}