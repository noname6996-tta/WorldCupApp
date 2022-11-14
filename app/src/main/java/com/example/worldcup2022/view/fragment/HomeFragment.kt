package com.example.worldcup2022.view.fragment

import android.os.CountDownTimer
import android.view.View
import com.example.worldcup2022.adapter.HomeMatchPagerAdapter
import com.example.worldcup2022.databinding.FragmentHomeBinding
import com.example.worldcup2022.ui.component.main.MainNewActivity

import com.google.android.material.tabs.TabLayoutMediator
import com.proxglobal.worlcupapp.base.BaseFragment
import java.text.SimpleDateFormat
import java.util.*

class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    private lateinit var countDownTimer: CountDownTimer

    override fun getDataBinding(): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(layoutInflater)
    }

    override fun initView() {
        super.initView()
        MainNewActivity.binding.bottomMain.visibility = View.VISIBLE
        countDownTime()
        binding.viewPagerHome.adapter = HomeMatchPagerAdapter(requireActivity())
        TabLayoutMediator(
            binding.tabLayout,
            binding.viewPagerHome,
            false,
            false
        ) { tab, position ->
            when (position) {
                0 -> tab.text = "Su 20 Nov"
                1 -> tab.text = "Mo 21 Nov"
                2 -> tab.text = "Tu 22 Nov"
                3 -> tab.text = "We 23 Nov"
                4 -> tab.text = "Th 24 Nov"
                5 -> tab.text = "Fr 25 Nov"
                6 -> tab.text = "Sa 26 Nov"
                7 -> tab.text = "Su 27 Nov"
                8 -> tab.text = "Mo 28 Nov"
                9 -> tab.text = "Tu 29 Nov"
                10 -> tab.text = "We 30 Nov"
                11 -> tab.text = "Th 1 Dec"
                12 -> tab.text = "Fr 2 Dec"
                13 -> tab.text = "Sa 3 Dec"
                // tam thoi
            }
        }.attach()
    }

    override fun addEvent() {
        super.addEvent()
    }

    override fun addObservers() {
        super.addObservers()
    }

    override fun initData() {
        super.initData()

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
    }


}