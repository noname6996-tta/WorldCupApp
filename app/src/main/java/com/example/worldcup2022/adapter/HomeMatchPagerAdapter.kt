package com.example.worldcup2022.adapter

import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.worldcup2022.view.fragment.HomeMatchFragment

class HomeMatchPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity){
    override fun getItemCount() = 14

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> HomeMatchFragment().newInstance("2022-11-20T00:00:00+0300")
            1 -> HomeMatchFragment().newInstance("2022-11-21T00:00:00+0300")
            2 -> HomeMatchFragment().newInstance("2022-11-22T00:00:00+0300")
            3 -> HomeMatchFragment().newInstance("2022-11-23T00:00:00+0300")
            4 -> HomeMatchFragment().newInstance("2022-11-24T00:00:00+0300")
            5 -> HomeMatchFragment().newInstance("2022-11-25T00:00:00+0300")
            6 -> HomeMatchFragment().newInstance("2022-11-26T00:00:00+0300")
            7 -> HomeMatchFragment().newInstance("2022-11-27T00:00:00+0300")
            8 -> HomeMatchFragment().newInstance("2022-11-28T00:00:00+0300")
            9 -> HomeMatchFragment().newInstance("2022-11-29T00:00:00+0300")
            10 -> HomeMatchFragment().newInstance("2022-11-30T00:00:00+0300")
            11 -> HomeMatchFragment().newInstance("2022-12-1T00:00:00+0300")
            12 -> HomeMatchFragment().newInstance("2022-12-2T00:00:00+0300")
            13 -> HomeMatchFragment().newInstance("2022-12-3T00:00:00+0300")
            // tam thoi
            else -> {
                throw Resources.NotFoundException("Not Found")
            }
        }
    }
}