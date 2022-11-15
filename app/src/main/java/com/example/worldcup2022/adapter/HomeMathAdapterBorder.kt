package com.example.worldcup2022.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.worldcup2022.R
import com.example.worldcup2022.data.Data.parseTime
import com.example.worldcup2022.databinding.ItemMatchBinding
import com.example.worldcup2022.databinding.ItemMatchBorderRedBinding
import com.example.worldcup2022.data.dto.worldcup.Country
import com.example.worldcup2022.data.dto.worldcup.Match
import com.example.worldcup2022.data.dto.worldcup.Stadium
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class HomeMathAdapterBorder : RecyclerView.Adapter<HomeMatchBorderViewHolder>() {
    private var matchs: List<Match> = listOf()
    private lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeMatchBorderViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemMatchBorderRedBinding.inflate(inflater, parent, false)
        return HomeMatchBorderViewHolder(binding)
    }

    fun setListMatch(matchs: List<Match>, context: Context) {
        this.matchs = matchs
        this.context = context
        notifyDataSetChanged()
    }

    private var onClickMatch: ((Match) -> Unit)? = null
    fun setClickShowMatch(match: ((Match) -> Unit)) {
        onClickMatch = match
    }

    override fun onBindViewHolder(holder: HomeMatchBorderViewHolder, position: Int) {
        val match = matchs[position]
        holder.binding.tvGroupMatch.text = "Group " + match.group+" "
        try {
            val fileInString: String =
                context.assets.open("country.json").bufferedReader().use { it.readText() }
            var countrys: List<Country> =
                Gson().fromJson(fileInString, object : TypeToken<List<Country>>() {}.type)
            for (i in 0..countrys.size - 1) {
                val country = countrys[i]
                if (match.idcountry1.toString() == country.id) {
                    holder.binding.tvTeam1.text = country.name
                    Glide.with(holder.itemView.context).load(country.image)
                        .error(R.drawable.ic_launcher_background)
                        .into(holder.binding.imgTeam1)
                }
                if (match.idcountry2.toString() == country.id) {
                    holder.binding.tvTeam2.text = country.name
                    Glide.with(holder.itemView.context).load(country.image)
                        .error(R.drawable.ic_launcher_background)
                        .into(holder.binding.imgTeam2)
                }
            }
        } catch (e: IOException) {

        }

        // set name stadium
        try {
            val fileInString: String =
                context.assets.open("Stadium.json").bufferedReader().use { it.readText() }
            var stadiums: List<Stadium> =
                Gson().fromJson(fileInString, object : TypeToken<List<Stadium>>() {}.type)
            for (i in 0..stadiums.size - 1) {
                val stadium = stadiums[i]
                if (match.idStadium.toString() == stadium.id) {
                    holder.binding.tvStadiumMatch.text = stadium.name
                }
            }
        } catch (e: IOException) {

        }

        //
        val time = parseTime(match.date)
        val calendar = Calendar.getInstance().apply {
            timeInMillis = time
        }.time
        val hours = SimpleDateFormat("HH", Locale.ROOT).format(calendar)
        val minus = SimpleDateFormat("mm", Locale.ROOT).format(calendar)
        val trueTime = "$hours : $minus"
        holder.binding.tvTimeMatch.text = trueTime

        holder.binding.layoutMatchInfo.setOnClickListener {
            onClickMatch?.let{
                it(matchs[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return matchs.size
    }

}

class HomeMatchBorderViewHolder(val binding: ItemMatchBorderRedBinding) : RecyclerView.ViewHolder(binding.root) {

}