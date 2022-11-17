package com.example.worldcup2022.view.fragment

import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.worldcup2022.adapter.GroupMatchAdapter
import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.databinding.FragmentGroupinfoBinding
import com.example.worldcup2022.data.dto.worldcup.Match
import com.example.worldcup2022.data.dto.worldcup.ResponseMatch
import com.example.worldcup2022.ui.component.main.MainNewActivity
import com.example.worldcup2022.ui.component.main.MainViewModel
import com.example.worldcup2022.utils.observe

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.proxglobal.worlcupapp.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import java.io.IOException
import kotlin.collections.ArrayList

@AndroidEntryPoint
class GroupInfoFragment : BaseFragment<FragmentGroupinfoBinding>() {
    private val groupMathAdapter = GroupMatchAdapter()
    lateinit var matchs: List<Match>
    lateinit var arrMatchs: ArrayList<Match>
    val args: GroupInfoFragmentArgs by navArgs()
    override fun getDataBinding(): FragmentGroupinfoBinding {
        return FragmentGroupinfoBinding.inflate(layoutInflater)
    }
    private val mainViewModel: MainViewModel by viewModels()
    override fun initView() {
        super.initView()
        binding.recGroupMatch.adapter = groupMathAdapter
        arrMatchs = ArrayList()
        val linearLayoutManager = LinearLayoutManager(requireContext())
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.recGroupMatch.layoutManager = linearLayoutManager

        binding.imgbackGroup.setOnClickListener {
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

    override fun initViewModel() {
        super.initViewModel()
        mainViewModel.getMatchsByGroup(args.groupName)
    }

    override fun addObservers() {
        super.addObservers()
        observe(mainViewModel.matchsByGroupLiveData, ::handleMatchList)
    }

    private fun handleMatchList(status: Resource<ResponseMatch>) {
        when (status) {
            is Resource.Loading -> {
                Log.e("handleMatchList", "handleMatchList: Loading ")
            }
            is Resource.Success -> status.data?.let { bindListDataMatchByGroup(matchs = it) }
            is Resource.DataError -> {
                status.errorCode?.let {
                    Log.e(
                        "handleMatchList",
                        "handleMatchList: Error " + it.toString()
                    )
                }
            }
        }
    }

    private fun bindListDataMatchByGroup(matchs: ResponseMatch) {
        arrMatchs = ArrayList()
        for (i in 0..matchs.data.size - 1) {
            if (matchs.data[i].group.equals(args.groupName)) {
                arrMatchs.add(matchs.data[i])
                Log.e("adasdasdasda",matchs.data[i].toString())
            }
        }
        groupMathAdapter.setListMatch(arrMatchs, requireContext())
    }
}