package com.example.worldcup2022.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.worldcup2022.R
import com.example.worldcup2022.data.Data.parseTime
import com.example.worldcup2022.data.dto.worldcup.Country
import com.example.worldcup2022.data.dto.worldcup.Match
import com.example.worldcup2022.data.dto.worldcup.Stadium
import com.example.worldcup2022.databinding.ItemMatchBinding
import com.example.worldcup2022.databinding.ItemNativeAdsBinding
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class HomeMathAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var matchs: List<Match> = listOf()
    private lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        return if (viewType == MATCH) {
            val binding = ItemMatchBinding.inflate(inflater, parent, false)
            HomeMatchViewHolder(binding)
        } else {
            val binding = ItemNativeAdsBinding.inflate(inflater, parent, false)
            NativeAdsViewHolder(binding)
        }

    }

    fun setListMatch(matchs: List<Match>, context: Context) {
        this.matchs = matchs
        this.context = context
        notifyDataSetChanged()
    }

    private var onLoadAdsListener: ((FrameLayout) -> Unit)? = null
    fun setOnLoadAdsListener(listener: ((FrameLayout) -> Unit)) {
        onLoadAdsListener = listener
    }

    private var onClickMatch: ((Match) -> Unit)? = null
    fun setClickShowMatch(match: ((Match) -> Unit)) {
        onClickMatch = match
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val match = matchs[position]
        when (holder) {
            is HomeMatchViewHolder -> {
                holder.binding.tvGroupMatch.text = "Group " + match.group + " "
                holder.binding.tvGroupMatch.text = "Group " + match.group + " "

                if (match.country1 != null) {
                    holder.binding.tvTeam1.text = match.country1?.name
                    Glide.with(holder.itemView.context).load(match.country1?.image)
                        .error(R.drawable.logo)
                        .into(holder.binding.imgTeam1)

                    holder.binding.tvTeam2.text = match.country2?.name
                    Glide.with(holder.itemView.context).load(match.country2?.image)
                        .error(R.drawable.logo)
                        .into(holder.binding.imgTeam2)
                } else {
                    try {
                        val fileInString: String =
                            context.assets.open("country.json").bufferedReader()
                                .use { it.readText() }
                        var countrys: List<Country> =
                            Gson().fromJson(
                                fileInString,
                                object : TypeToken<List<Country>>() {}.type
                            )
                        for (i in 0..countrys.size - 1) {
                            val country = countrys[i]
                            if (match.idcountry1.toString() == country.id) {
                                holder.binding.tvTeam1.text = country.name
                                Glide.with(holder.itemView.context).load(country.image)
                                    .error(R.drawable.logo)
                                    .into(holder.binding.imgTeam1)
                            }
                            if (match.idcountry2.toString() == country.id) {
                                holder.binding.tvTeam2.text = country.name
                                Glide.with(holder.itemView.context).load(country.image)
                                    .error(R.drawable.logo)
                                    .into(holder.binding.imgTeam2)
                            }
                        }
                    } catch (e: IOException) {

                    }
                }

                if (match.stadium != null) {
                    holder.binding.tvStadiumMatch.text = match.stadium.name
                } else {
                    // set name stadium
                    try {
                        val fileInString: String =
                            context.assets.open("Stadium.json").bufferedReader()
                                .use { it.readText() }
                        var stadiums: List<Stadium> =
                            Gson().fromJson(
                                fileInString,
                                object : TypeToken<List<Stadium>>() {}.type
                            )
                        for (i in 0..stadiums.size - 1) {
                            val stadium = stadiums[i]
                            if (match.idStadium.toString() == stadium.id) {
                                holder.binding.tvStadiumMatch.text = stadium.name
                            }
                        }
                    } catch (e: IOException) {

                    }
                }
                //

                val time = parseTime(match.dateFormat)
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
                    holder.binding.tvStadiumMatch.visibility = View.GONE
                    holder.binding.tvFullTime.visibility = View.VISIBLE
                } else {
                    holder.binding.tvTimeMatch.text = trueTime
                    holder.binding.tvTimeMatch.visibility = View.VISIBLE
                    holder.binding.tvTimeGoal.visibility = View.GONE
                }
                holder.binding.layoutMatchInfo.setOnClickListener {
                    onClickMatch?.let {
                        it(matchs[position])
                    }
                }
            }
            is NativeAdsViewHolder -> {
                onLoadAdsListener?.let {
                    it(holder.binding.adContainer)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return matchs.size
    }

    override fun getItemViewType(position: Int): Int {
        return if (matchs[position].id.isEmpty()) ADS else MATCH
    }


    companion object {
        private const val MATCH = 0
        private const val ADS = 1
    }
}

class HomeMatchViewHolder(val binding: ItemMatchBinding) : RecyclerView.ViewHolder(binding.root)
class NativeAdsViewHolder(val binding: ItemNativeAdsBinding) : RecyclerView.ViewHolder(binding.root)