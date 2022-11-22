package com.example.worldcup2022.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MatchPagerAdapter(fragmentActivity: FragmentActivity, var fragments: ArrayList<Fragment>) :
    FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount() = fragments.size

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }
}