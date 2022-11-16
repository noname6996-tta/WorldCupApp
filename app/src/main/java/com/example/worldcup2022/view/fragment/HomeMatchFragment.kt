package com.example.worldcup2022.view.fragment

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.worldcup2022.LIST_MATCHS
import com.example.worldcup2022.adapter.HomeMathAdapter
import com.example.worldcup2022.data.Data.parseTime
import com.example.worldcup2022.data.dto.worldcup.Match
import com.example.worldcup2022.databinding.FragmentHomematchBinding
import com.example.worldcup2022.utils.UtilsKotlin
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.orhanobut.hawk.Hawk
import com.proxglobal.worlcupapp.base.BaseFragment
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class HomeMatchFragment : BaseFragment<FragmentHomematchBinding>() {
    companion object {
        private const val ARG_DATE = "ARG_DATE"
    }

    private val homeMatchAdapter = HomeMathAdapter()
    lateinit var matchs: List<Match>
    lateinit var matchsOnl: List<com.example.worldcup2022.data.dto.worldcup.Match>
    lateinit var arrMatchs: ArrayList<Match>

    private var daymatch: String = ""
    fun newInstance(date: String): HomeMatchFragment {
        val args = Bundle()
        args.putString(ARG_DATE, date)
        val fragment = HomeMatchFragment()
        fragment.arguments = args
        return fragment
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            daymatch = requireArguments().getString(ARG_DATE, "")
        }
    }


    override fun initView() {
        super.initView()
        binding.recHomeMatch.adapter = homeMatchAdapter
        arrMatchs = ArrayList()
        val linearLayoutManager = LinearLayoutManager(requireContext())
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.recHomeMatch.layoutManager = linearLayoutManager
        setTime()
        binding.tvAllGroup.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToHomeGroupFragment()
            findNavController().navigate(action)
        }
    }

    override fun initData() {
        super.initData()
        try {
            val fileInString: String =
                requireContext().assets.open("match.json").bufferedReader().use { it.readText() }
            arrMatchs.clear()
            matchs = Gson().fromJson(fileInString, object : TypeToken<List<Match>>() {}.type)

            if (matchsOnl.isNotEmpty()) {
                for (i in 0..matchsOnl.size - 1) {
                    val calendar1 = Calendar.getInstance().apply {
                        timeInMillis = parseTime(matchsOnl[i].dateFormat)
                    }.time
                    val day1 = SimpleDateFormat("dd", Locale.ENGLISH).format(calendar1)
                    val calendar2 = Calendar.getInstance().apply {
                        timeInMillis = UtilsKotlin().parseTime(daymatch)
                    }.time
                    val day2 = SimpleDateFormat("dd", Locale.ENGLISH).format(calendar2)
                    if (day1.equals(day2)) {
                        arrMatchs.add(matchsOnl[i])
                    }
                }
            } else {
                for (i in 0..matchs.size - 1) {
                    val calendar1 = Calendar.getInstance().apply {
                        timeInMillis = parseTime(matchs[i].dateFormat)
                    }.time
                    val day1 = SimpleDateFormat("dd", Locale.ENGLISH).format(calendar1)
                    val calendar2 = Calendar.getInstance().apply {
                        timeInMillis = UtilsKotlin().parseTime(daymatch)
                    }.time
                    val day2 = SimpleDateFormat("dd", Locale.ENGLISH).format(calendar2)
                    if (day1.equals(day2)) {
                        arrMatchs.add(matchs[i])
                    }
                }
            }


        } catch (e: IOException) {

        }
        homeMatchAdapter.setListMatch(arrMatchs, requireContext())

    }

    override fun getDataBinding(): FragmentHomematchBinding {
        return FragmentHomematchBinding.inflate(layoutInflater)
    }

    private fun setTime() {
        matchsOnl = Hawk.get<ArrayList<com.example.worldcup2022.data.dto.worldcup.Match>>(LIST_MATCHS, ArrayList())
        val time = UtilsKotlin().parseTime(daymatch)
        val calendar = Calendar.getInstance().apply {
            timeInMillis = time
        }
        val month = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH)
        val day = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH)
        val date = calendar[Calendar.DAY_OF_MONTH]
        val year = calendar[Calendar.YEAR]
        val trueTime = "$day, $date $month $year "
        binding.tvDavMatch.text = trueTime
    }

    override fun addEvent() {
        super.addEvent()
        homeMatchAdapter.setClickShowMatch {
            val action = HomeFragmentDirections.actionHomeFragmentToMatchFragment(it)
            findNavController().navigate(action)
        }
    }
}