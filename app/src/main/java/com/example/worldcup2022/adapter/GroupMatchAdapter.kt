package com.example.worldcup2022.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.worldcup2022.R
import com.example.worldcup2022.data.Data.parseTime
import com.example.worldcup2022.databinding.ItemMatchGroupBinding
import com.example.worldcup2022.data.dto.worldcup.Country
import com.example.worldcup2022.data.dto.worldcup.Match
import com.example.worldcup2022.data.dto.worldcup.Stadium
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class GroupMatchAdapter : RecyclerView.Adapter<GroupchMatchViewHolder>() {
    private var matchs: List<Match> = listOf()
    private lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupchMatchViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemMatchGroupBinding.inflate(inflater, parent, false)
        return GroupchMatchViewHolder(binding)
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

    override fun onBindViewHolder(holder: GroupchMatchViewHolder, position: Int) {
        val match = matchs[position]
        holder.binding.tvGroupMatch.text = "Group " + match.group + " "
//        //
        val time = parseTime(match.dateFormat)
        val calendar = Calendar.getInstance().apply {
            timeInMillis = time
        }.time
        val hours = SimpleDateFormat("HH", Locale.ROOT).format(calendar)
        val minus = SimpleDateFormat("mm", Locale.ROOT).format(calendar)
        val trueTime = "$hours : $minus"
        holder.binding.tvTimeMatch.text = trueTime

        val month = SimpleDateFormat("MMM", Locale.ENGLISH).format(calendar)
        val day = SimpleDateFormat("EEE", Locale.ENGLISH).format(calendar)
        val date = SimpleDateFormat("dd", Locale.ENGLISH).format(calendar)
        val year = SimpleDateFormat("yyyy", Locale.ENGLISH).format(calendar)
        val trueTime2 = "$day, $date $month $year "
        holder.binding.tvDateMatchGroup.text = trueTime2
//
        holder.binding.layoutMatchGroupInfo.setOnClickListener {
            onClickMatch?.let {
                it(matchs[position])
            }
        }
        holder.binding.tvTeam1.text = match.country1?.name.toString()
        holder.binding.tvTeam2.text = match.country2?.name.toString()
        holder.binding.tvTimeMatch.text = match.time.toString()
        holder.binding.tvStadiumMatch.text = match.stadium.name.toString()
        Glide.with(holder.itemView.context).load(match.country1?.image)
            .error(R.drawable.logo)
            .into(holder.binding.imgTeam1)

        Glide.with(holder.itemView.context).load(match.country2?.image)
            .error(R.drawable.logo)
            .into(holder.binding.imgTeam2)
    }

    override fun getItemCount(): Int {
        return matchs.size
    }

}

class GroupchMatchViewHolder(val binding: ItemMatchGroupBinding) :
    RecyclerView.ViewHolder(binding.root) {

}