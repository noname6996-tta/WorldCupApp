package com.example.worldcup2022.view.fragment

import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.worldcup2022.adapter.GroupMatchAdapter
import com.example.worldcup2022.databinding.FragmentGroupinfoBinding
import com.example.worldcup2022.model.Match
import com.example.worldcup2022.view.activity.MainActivity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.proxglobal.worlcupapp.base.BaseFragment
import java.io.IOException
import kotlin.collections.ArrayList

class GroupInfoFragment : BaseFragment<FragmentGroupinfoBinding>() {
    private val groupMathAdapter = GroupMatchAdapter()
    lateinit var matchs: List<Match>
    lateinit var arrMatchs: ArrayList<Match>
    val args: GroupInfoFragmentArgs by navArgs()
    override fun getDataBinding(): FragmentGroupinfoBinding {
        return FragmentGroupinfoBinding.inflate(layoutInflater)
    }

    override fun initView() {
        super.initView()
        MainActivity.binding.bottomMain.visibility = View.GONE
        binding.recGroupMatch.adapter = groupMathAdapter
        arrMatchs = ArrayList()
        val linearLayoutManager = LinearLayoutManager(requireContext())
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.recGroupMatch.layoutManager = linearLayoutManager

        binding.imgbackGroup.setOnClickListener {
            MainActivity.binding.bottomMain.visibility = View.VISIBLE
            findNavController().popBackStack()

        }

    }

    override fun initData() {
        super.initData()
        var groupName = args.groupName
        binding.tvGroupname.text = "Group $groupName "
        try {
            val fileInString: String =
                requireContext().assets.open("match.json").bufferedReader().use { it.readText() }
            matchs = Gson().fromJson(fileInString, object : TypeToken<List<Match>>() {}.type)
            for (i in 0..matchs.size - 1) {
                if (matchs[i].group.equals(groupName)) {
                    arrMatchs.add(matchs[i])
                }
            }

        } catch (e: IOException) {

        }
        groupMathAdapter.setListMatch(arrMatchs,requireContext())
    }

    override fun addEvent() {
        super.addEvent()
        groupMathAdapter.setClickShowMatch {
            val action = GroupInfoFragmentDirections.actionGroupInfoFragmentToMatchFragment(it)
            findNavController().navigate(action)
        }
    }
}