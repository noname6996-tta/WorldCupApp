package com.example.worldcup2022.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.worldcup2022.R
import com.example.worldcup2022.data.Data
import com.example.worldcup2022.data.dto.worldcup.Match
import com.example.worldcup2022.databinding.ItemMatchBorderRedBinding
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
        holder.binding.tvGroupMatch.text = "Group " + match.group + " "
        holder.binding.layoutMatchInfo.setOnClickListener {
            onClickMatch?.let {
                it(matchs[position])
            }
        }
        val time = Data.parseTime(match.dateFormat)
        val calendar = Calendar.getInstance().apply {
            timeInMillis = time
        }.time
        val hours = SimpleDateFormat("HH", Locale.ROOT).format(calendar)
        val minus = SimpleDateFormat("mm", Locale.ROOT).format(calendar)
        val trueTime = "$hours : $minus"
        val current = Calendar.getInstance().timeInMillis
        if (current > time) {
            holder.binding.tvTimeMatch.visibility = View.GONE
            holder.binding.tvTimeGoal.visibility = View.VISIBLE
            holder.binding.tvTimeGoal.text = match.goal
        } else {
            holder.binding.tvTimeMatch.text = trueTime
            holder.binding.tvTimeMatch.visibility = View.VISIBLE
            holder.binding.tvTimeGoal.visibility = View.GONE
        }
        holder.binding.tvGroupMatch.text = "Group " + match.group + " "
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

class HomeMatchBorderViewHolder(val binding: ItemMatchBorderRedBinding) :
    RecyclerView.ViewHolder(binding.root) {

}