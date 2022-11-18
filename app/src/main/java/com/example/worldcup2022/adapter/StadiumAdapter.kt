package com.example.worldcup2022.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.worldcup2022.R
import com.example.worldcup2022.databinding.ItemStadiumBinding
import com.example.worldcup2022.data.dto.worldcup.Match
import com.example.worldcup2022.data.dto.worldcup.Stadium

class StadiumAdapter : RecyclerView.Adapter<StadiumViewHolder>() {

    private var stadiums: List<Stadium> = listOf()
    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StadiumViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemStadiumBinding.inflate(inflater, parent, false)
        return StadiumViewHolder(binding)
    }

    private var onClickStadium: ((Stadium) -> Unit)? = null
    fun setClickShowMatch(match: ((Stadium) -> Unit)) {
        onClickStadium = match
    }

    fun setListStadium(stadiums: List<Stadium>, context: Context) {
        this.stadiums = stadiums
        this.context = context
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: StadiumViewHolder, position: Int) {
        val stadium = stadiums[position]
        holder.binding.tvStadiumLocation.text= stadium.location
        holder.binding.tvStadiumName.text = stadium.name
        Glide.with(holder.itemView.context).load(stadium.image)
            .error(R.drawable.logo).placeholder(R.drawable.logo)
            .into(holder.binding.imgStadium)
        holder.binding.layoutStadium.setOnClickListener {
            onClickStadium?.let {
                it(stadiums[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return stadiums.size
    }
}

class StadiumViewHolder(val binding: ItemStadiumBinding) :
    RecyclerView.ViewHolder(binding.root) {

}