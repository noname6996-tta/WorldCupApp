package com.example.worldcup2022.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.worldcup2022.R
import com.example.worldcup2022.data.Data.parseTime
import com.example.worldcup2022.databinding.ItemCountryPointsBinding
import com.example.worldcup2022.databinding.ItemMatchBinding
import com.example.worldcup2022.data.dto.worldcup.Country
import com.example.worldcup2022.data.dto.worldcup.Match
import com.example.worldcup2022.data.dto.worldcup.Stadium
import com.example.worldcup2022.view.fragment.MatchGroupFragment
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class MatchGroupAdapter : RecyclerView.Adapter<MatchGroupViewHolder>() {
    private var countrys: List<Country> = listOf()
    private lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MatchGroupViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemCountryPointsBinding.inflate(inflater, parent, false)
        return MatchGroupViewHolder(binding)
    }

    fun setListMatchCountrys(countrys: List<Country>, context: Context) {
        this.countrys = countrys
        this.context = context
        notifyDataSetChanged()
    }



    override fun onBindViewHolder(holder: MatchGroupViewHolder, position: Int) {
        val country = countrys[position]
        holder.binding.tvNameCountry.text = country.name
        Glide.with(holder.itemView.context).load(country.image)
            .error(R.drawable.ic_launcher_background)
            .into(holder.binding.imgFlagCountry)
    }

    override fun getItemCount(): Int {
        return countrys.size
    }

}

class MatchGroupViewHolder(val binding: ItemCountryPointsBinding) : RecyclerView.ViewHolder(binding.root) {

}