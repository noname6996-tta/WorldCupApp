package com.example.worldcup2022.view.fragment

import android.os.CountDownTimer
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import com.example.worldcup2022.LIST_DATES
import com.example.worldcup2022.LIST_MATCHS
import com.example.worldcup2022.adapter.HomeMatchPagerAdapter
import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.data.dto.worldcup.Match
import com.example.worldcup2022.data.dto.worldcup.ResponseMatch
import com.example.worldcup2022.databinding.FragmentHomeBinding
import com.example.worldcup2022.ui.component.main.MainNewActivity
import com.example.worldcup2022.ui.component.main.MainViewModel
import com.example.worldcup2022.utils.UtilsKotlin
import com.example.worldcup2022.utils.observe
import com.google.android.material.tabs.TabLayoutMediator
import com.orhanobut.hawk.Hawk
import com.proxglobal.worlcupapp.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    private lateinit var countDownTimer: CountDownTimer
    private val mainViewModel: MainViewModel by viewModels()
    override fun getDataBinding(): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(layoutInflater)
    }

    var listDatesOff = ArrayList<String>()
    var listDatesOnl = ArrayList<String>()


    override fun initView() {
        super.initView()
        MainNewActivity.binding.bottomMain.visibility = View.VISIBLE
        countDownTime()
        createListDateOff()
        setData()
    }

    override fun addEvent() {
        super.addEvent()
    }

    override fun addObservers() {
        super.addObservers()
        observe(mainViewModel.matchsLiveData, ::handleMatchsList)

    }

    override fun initData() {
        super.initData()

    }

    override fun onResume() {
        super.onResume()
        mainViewModel.getFullMatchs()
    }

    /**
     *
     */
    private fun countDownTime() {
        val currentTime = Calendar.getInstance().time
        val endDateDay = "20/11/2022 18:00:00"
        val format1 = SimpleDateFormat("dd/MM/yyyy hh:mm:ss", Locale.getDefault())
        val endDate = format1.parse(endDateDay)

        //milliseconds
        var different = endDate.time - currentTime.time
        if (different>0){
            binding.cardView.visibility = View.VISIBLE
            countDownTimer = object : CountDownTimer(different, 1000) {

                override fun onTick(millisUntilFinished: Long) {
                    var diff = millisUntilFinished
                    val secondsInMilli: Long = 1000
                    val minutesInMilli = secondsInMilli * 60
                    val hoursInMilli = minutesInMilli * 60
                    val daysInMilli = hoursInMilli * 24

                    val elapsedDays = diff / daysInMilli
                    diff %= daysInMilli

                    val elapsedHours = diff / hoursInMilli
                    diff %= hoursInMilli

                    val elapsedMinutes = diff / minutesInMilli
                    diff %= minutesInMilli

                    val elapsedSeconds = diff / secondsInMilli

                    binding.tvDayCount.text = elapsedDays.toString()
                    binding.tvHoursCount.text = elapsedHours.toString()
                    binding.tvMinutesCount.text = elapsedMinutes.toString()
                    binding.tvSeconds.text = elapsedSeconds.toString()
                }

                override fun onFinish() {

                }
            }.start()
        }else{
            binding.cardView.visibility = View.GONE
        }

    }

    /**
     *
     */
    private fun createListDateOff() {
        listDatesOff.add("20/11/2022")
        listDatesOff.add("21/11/2022")
        listDatesOff.add("22/11/2022")
        listDatesOff.add("23/11/2022")
        listDatesOff.add("24/11/2022")
        listDatesOff.add("25/11/2022")
        listDatesOff.add("26/11/2022")
        listDatesOff.add("27/11/2022")
        listDatesOff.add("28/11/2022")
        listDatesOff.add("29/11/2022")
        listDatesOff.add("30/11/2022")
        listDatesOff.add("01/12/2022")
        listDatesOff.add("02/12/2022")
        listDatesOff.add("03/12/2022")


    }

    private fun handleMatchsList(status: Resource<ResponseMatch>) {
        when (status) {
            is Resource.Loading -> {
                Log.e("Home", "handleMatchsList: Loading ")
            }
            is Resource.Success -> status.data?.let { bindListData(matchs = it) }
            is Resource.DataError -> {
                status.errorCode?.let { Log.e("Home", "handleMatchsList: Error " + it) }
            }
        }
    }

    private fun bindListData(matchs: ResponseMatch) {
        Hawk.put(LIST_MATCHS, matchs.data)
        createDateList(matchs.data as ArrayList<Match>)
    }

    private fun createDateList(list: ArrayList<Match>) {
        var listDates = ArrayList<String>()
        val itr = list.iterator()

        while (itr.hasNext()) {

            var date = itr.next().date
            if (listDates.size == 0) {
                listDates.add(date)
            } else {
                for (i in listDates.indices) {
                    if (listDates[i] == date) {
                        break
                    } else {
                        if (i == listDates.size - 1) {
                            listDates.add(date)
                        }
                    }
                }
            }


        }
        listDatesOnl = Hawk.get<ArrayList<String>>(LIST_DATES, ArrayList())
        if (listDates.size > listDatesOnl.size) {
            Hawk.put(LIST_DATES, listDates)
            setData()
        }

    }

    /**
     *
     */
    private fun setData() {
        listDatesOnl = Hawk.get<ArrayList<String>>(LIST_DATES, ArrayList())
        if (listDatesOnl.size > 0)
            binding.viewPagerHome.adapter = HomeMatchPagerAdapter(requireActivity(), listDatesOnl)
        else binding.viewPagerHome.adapter = HomeMatchPagerAdapter(requireActivity(), listDatesOff)

        TabLayoutMediator(
            binding.tabLayout,
            binding.viewPagerHome,
            false,
            false
        ) { tab, position ->
            if (listDatesOnl.size > 0)
                tab.text = UtilsKotlin().formatDate(UtilsKotlin().parseTime((listDatesOnl[position])))
            else tab.text = UtilsKotlin().formatDate(UtilsKotlin().parseTime((listDatesOff[position])))
        }.attach()
    }


}