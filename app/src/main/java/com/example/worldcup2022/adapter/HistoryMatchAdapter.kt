package com.example.worldcup2022.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.worldcup2022.R
import com.example.worldcup2022.data.Data
import com.example.worldcup2022.data.dto.worldcup.MyHistoryMatch
import com.example.worldcup2022.databinding.*
import com.ntduc.stringutils.highlight
import java.text.SimpleDateFormat
import java.util.*

class HistoryMatchAdapter(
    val context: Context,
    var list: List<MyHistoryMatch> = listOf()
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    var isLoadMore: Boolean = true

//    private var onClickItemListener: ((MyHistoryMatch) -> Unit)? = null
//    fun setOnClickItemListener(listener: ((MyHistoryMatch) -> Unit)) {
//        onClickItemListener = listener
//    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            LOADING -> {
                val binding =
                    ItemLoadingBinding.inflate(LayoutInflater.from(context), parent, false)
                LoadingViewHolder(binding)
            }
            TITLE -> {
                val binding =
                    ItemTitleHistoryMatchBinding.inflate(
                        LayoutInflater.from(context),
                        parent,
                        false
                    )
                TitleViewHolder(binding)
            }
            MATCH_WIN -> {
                val binding =
                    ItemHistoryMatchWinBinding.inflate(
                        LayoutInflater.from(context),
                        parent,
                        false
                    )
                MatchWinViewHolder(binding)
            }
            MATCH_FALSE -> {
                val binding =
                    ItemHistoryMatchLoseBinding.inflate(
                        LayoutInflater.from(context),
                        parent,
                        false
                    )
                MatchFalseViewHolder(binding)
            }
            else -> {
                val binding =
                    ItemHistoryMatchBinding.inflate(LayoutInflater.from(context), parent, false)
                MatchViewHolder(binding)
            }
        }
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = list[position]

        when (holder) {
            is TitleViewHolder -> {
                holder.binding.txtTitle.text = item.historyMatch.time
            }
            is MatchViewHolder -> {
                with(holder.binding) {
                    txtGroup.text = "Group ${item.match.group}"
                    txtTeam1.text = item.match.country1?.name
                    txtTeam2.text = item.match.country2?.name

                    val time = Data.parseTime(item.match.dateFormat)
                    val calendar = Calendar.getInstance().apply {
                        timeInMillis = time
                    }.time
                    val hours = SimpleDateFormat("HH", Locale.ROOT).format(calendar)
                    val minus = SimpleDateFormat("mm", Locale.ROOT).format(calendar)
                    val trueTime = "$hours : $minus"
                    txtTime.text = trueTime

                    txtGuess.text =
                        "${context.getString(R.string.guess)}: ${item.historyMatch.goal}".highlight(
                            key = item.historyMatch.goal!!,
                            bold = true
                        )

                    Glide.with(context)
                        .load(item.match.country1?.image)
                        .into(holder.binding.imgTeam1)

                    Glide.with(context)
                        .load(item.match.country2?.image)
                        .into(holder.binding.imgTeam2)
                }
            }
            is MatchWinViewHolder -> {
                with(holder.binding) {
                    txtTeam1.text = item.match.country1?.name
                    txtTeam2.text = item.match.country2?.name
                    txtGoal.text = item.match.goal

                    Glide.with(context)
                        .load(item.match.country1?.image)
                        .into(holder.binding.imgTeam1)

                    Glide.with(context)
                        .load(item.match.country2?.image)
                        .into(holder.binding.imgTeam2)
                }
            }
            is MatchFalseViewHolder -> {
                with(holder.binding) {
                    txtGroup.text = "Group ${item.match.group}"
                    txtTeam1.text = item.match.country1?.name
                    txtTeam2.text = item.match.country2?.name
                    txtGoal.text = item.match.goal

                    Glide.with(context)
                        .load(item.match.country1?.image)
                        .into(holder.binding.imgTeam1)

                    Glide.with(context)
                        .load(item.match.country2?.image)
                        .into(holder.binding.imgTeam2)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun getItemViewType(position: Int): Int {
        return if (list[position].historyMatch.id == null && list[position].historyMatch.time != null) TITLE
        else if (list[position].historyMatch.id == null && list[position].historyMatch.time == null) LOADING
        else if (list[position].historyMatch.isRight == true) MATCH_WIN
        else if (list[position].historyMatch.isRight == false) MATCH_FALSE
        else MATCH
    }

    @SuppressLint("NotifyDataSetChanged")
    fun updateData(newList: List<MyHistoryMatch>) {
        list = newList
        notifyDataSetChanged()
    }

    inner class MatchViewHolder(binding: ItemHistoryMatchBinding) :
        RecyclerView.ViewHolder(binding.root) {
        internal val binding: ItemHistoryMatchBinding

        init {
            this.binding = binding
        }
    }

    inner class MatchWinViewHolder(binding: ItemHistoryMatchWinBinding) :
        RecyclerView.ViewHolder(binding.root) {
        internal val binding: ItemHistoryMatchWinBinding

        init {
            this.binding = binding
        }
    }

    inner class MatchFalseViewHolder(binding: ItemHistoryMatchLoseBinding) :
        RecyclerView.ViewHolder(binding.root) {
        internal val binding: ItemHistoryMatchLoseBinding

        init {
            this.binding = binding
        }
    }

    inner class TitleViewHolder(binding: ItemTitleHistoryMatchBinding) :
        RecyclerView.ViewHolder(binding.root) {
        internal val binding: ItemTitleHistoryMatchBinding

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
        const val MATCH = 0
        const val MATCH_WIN = 1
        const val MATCH_FALSE = 2

        const val TITLE = 3
        const val LOADING = 4
    }
}