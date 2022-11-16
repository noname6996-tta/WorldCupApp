package com.example.worldcup2022.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.worldcup2022.R
import com.example.worldcup2022.data.dto.worldcup.Squad
import com.example.worldcup2022.databinding.ItemSoundBinding
import com.example.worldcup2022.databinding.ItemSquadBinding

class SquadAdapter : RecyclerView.Adapter<SquadViewHolder>(){
    private var squads : List<Squad> = listOf()
    private lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SquadViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemSquadBinding.inflate(inflater, parent, false)
        return SquadViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SquadViewHolder, position: Int) {
        val squad = squads[position]
        holder.binding.tvNamePlayer.text = squad.name
        holder.binding.tvPositionSquad.text = squad.position
        Glide.with(holder.itemView.context).load(squad.image)
            .error(R.drawable.logo).placeholder(R.drawable.logo)
            .into(holder.binding.imgPlayer)
    }

    override fun getItemCount(): Int {
        return squads.size
    }
}

class SquadViewHolder(val binding : ItemSquadBinding) : RecyclerView.ViewHolder(binding.root){

}

