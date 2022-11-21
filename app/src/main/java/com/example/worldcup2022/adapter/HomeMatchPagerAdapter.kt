package com.example.worldcup2022.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.worldcup2022.view.fragment.HomeMatchFragment

class HomeMatchPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle, val list: ArrayList<String>) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return if (list.size > 0) {
            list.size
        } else {
            14
        }
    }


    override fun createFragment(position: Int): Fragment {
        return HomeMatchFragment().newInstance(list[position])

    }
}