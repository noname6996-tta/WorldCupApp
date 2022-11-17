package com.example.worldcup2022.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.worldcup2022.R
import com.example.worldcup2022.data.dto.worldcup.Sound
import com.example.worldcup2022.databinding.ItemSoundBinding

class SimulationSoundAdapter : RecyclerView.Adapter<SimulationSoundViewHolder>() {
    private var sounds: List<Sound> = listOf()
    private lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimulationSoundViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemSoundBinding.inflate(inflater, parent, false)
        return SimulationSoundViewHolder(binding)
    }

    fun setListSound(sounds: List<Sound>, context: Context) {
        this.sounds = sounds
        this.context = context
        notifyDataSetChanged()
    }

    private var onClickSound: ((Sound, Boolean) -> Unit)? = null
    fun setClickShowMatch(sound: ((Sound, Boolean) -> Unit)) {
        onClickSound = sound
    }

    override fun onBindViewHolder(holder: SimulationSoundViewHolder, position: Int) {
        val sound = sounds[position]
        holder.binding.tvNameSound.text = sound.name + " "
        Glide.with(holder.itemView.context).load(sound.image)
            .error(R.drawable.logo).placeholder(R.drawable.logo)
            .into(holder.binding.imgSound)

        holder.binding.txtAd.visibility = if (position < 5) View.GONE else View.VISIBLE
        holder.binding.imgSound.setOnClickListener {
            onClickSound?.let {
                it(sounds[position], holder.binding.txtAd.visibility == View.VISIBLE)
            }
        }
    }

    override fun getItemCount(): Int {
        return sounds.size
    }

}

class SimulationSoundViewHolder(val binding: ItemSoundBinding) :
    RecyclerView.ViewHolder(binding.root) {

}