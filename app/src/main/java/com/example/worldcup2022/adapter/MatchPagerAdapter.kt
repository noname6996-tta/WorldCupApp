package com.example.worldcup2022.adapter

import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.worldcup2022.view.fragment.*

class MatchPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity){
    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> MatchInFragment()
            1 -> MatchGroupFragment()
            // tam thoi
            else -> {
                throw Resources.NotFoundException("Not Found")
            }
        }
    }
}