package com.example.worldcup2022.view.fragment

import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import androidx.viewpager2.widget.ViewPager2
import com.example.worldcup2022.LIST_DATES
import com.example.worldcup2022.LIST_MATCHS
import com.example.worldcup2022.R
import com.example.worldcup2022.adapter.HomeMatchPagerAdapter
import com.example.worldcup2022.adapter.InstallAppAdapter
import com.example.worldcup2022.data.Data
import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.data.dto.worldcup.Match
import com.example.worldcup2022.data.dto.worldcup.ResponseMatch
import com.example.worldcup2022.databinding.FragmentHomeBinding
import com.example.worldcup2022.ui.component.main.MainNewActivity
import com.example.worldcup2022.ui.component.main.MainViewModel
import com.example.worldcup2022.utils.UtilsKotlin
import com.example.worldcup2022.utils.observe
import com.google.android.material.tabs.TabLayoutMediator
import com.google.firebase.analytics.FirebaseAnalytics
import com.orhanobut.hawk.Hawk
import com.proxglobal.worlcupapp.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.*


@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    private lateinit var countDownTimer: CountDownTimer
    private lateinit var adapter: InstallAppAdapter
    private val mainViewModel: MainViewModel by viewModels()
    override fun getDataBinding(): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(layoutInflater)
    }

    var listDatesOff = ArrayList<String>()
    var listDatesOnl = ArrayList<String>()

    var handler: Handler? = null
    var timer: Timer? = null
    var update: Runnable? = null
    override fun initView() {
        super.initView()
        countDownTime()
        createListDateOff()
        setData()
        setBanner()

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
        if (different > 0) {
            binding.cardView.visibility = View.VISIBLE
            binding.vpInstallApp.visibility = View.GONE
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
        } else {
            binding.cardView.visibility = View.GONE
            binding.vpInstallApp.visibility = View.VISIBLE

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
            var date =UtilsKotlin().formatDate_dd_MM_yyyy( UtilsKotlin().parseTime_yyyy_MM_dd_T_HH_mm_ssZ(itr.next().dateFormat))
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

        if (listDatesOnl.size > 0) {
            binding.viewPagerHome.adapter = HomeMatchPagerAdapter(childFragmentManager, viewLifecycleOwner.lifecycle, listDatesOnl)
            for (i in 0..listDatesOnl.size) {
                val currentTime = Calendar.getInstance().time
                val endDateDay = listDatesOnl[i]
                val format1 = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
                val endDate = format1.parse(endDateDay)
                if (endDate!!.time > currentTime.time) {
                    binding.viewPagerHome.currentItem = i - 1
                    break
                }
            }
        } else binding.viewPagerHome.adapter = HomeMatchPagerAdapter(childFragmentManager, viewLifecycleOwner.lifecycle, listDatesOff)


        TabLayoutMediator(
            binding.tabLayout,
            binding.viewPagerHome,
            false,
            false) { tab, position ->
            if (listDatesOnl.size > 0){
                tab.text = UtilsKotlin().formatDate(UtilsKotlin().parseTime((listDatesOnl[position])))
            }

            else tab.text =
                UtilsKotlin().formatDate(UtilsKotlin().parseTime((listDatesOff[position])))
        }.attach()
    }

    /**
     *
     */
    private fun setBanner() {
        val list = ArrayList<Int>()
        list.add(R.drawable.ic_banner_1)
        list.add(R.drawable.ic_banner_2)
        adapter = InstallAppAdapter(requireContext(), list)
        adapter.setOnClickItemListener {
            FirebaseAnalytics.getInstance(requireContext()).logEvent("Home_click_adbanner", Bundle())
            if (it %2== 0) {
                UtilsKotlin().openApp(requireActivity(), "com.screen.mirroring.miracast.tv.cast.smart.view")
            } else {
                UtilsKotlin().openApp(requireActivity(), "com.last.fm.live.radio.stations")
            }
        }
        binding.vpInstallApp.adapter = adapter
        binding.vpInstallApp.currentItem = 1
        onInfinitePageChangeCallback(list.size + 2)
        if (handler == null) {
            handler = Handler(Looper.myLooper()!!)
        }

        update = Runnable {
            if (binding.vpInstallApp.currentItem == 3) { //adapter is your custom ViewPager's adapter
                binding.vpInstallApp.setCurrentItem(0, false)
            } else {
                binding.vpInstallApp.setCurrentItem(binding.vpInstallApp.currentItem + 1, true);
            }
            handler!!.postDelayed(update!!, 3000)
        }

        handler!!.removeCallbacksAndMessages(null)
        handler!!.postDelayed(update!!, 3000)


    }


    private fun onInfinitePageChangeCallback(listSize: Int) {
        binding.vpInstallApp.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)

                if (state == ViewPager2.SCROLL_STATE_IDLE) {
                    when (binding.vpInstallApp.currentItem) {
                        listSize - 1 -> binding.vpInstallApp.setCurrentItem(1, false)
                        0 -> binding.vpInstallApp.setCurrentItem(listSize - 2, false)
                    }
                }
            }

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)

                if (position != 0 && position != listSize - 1) {
                    // pageIndicatorView.setSelected(position-1)
                }
            }
        })

    }


}