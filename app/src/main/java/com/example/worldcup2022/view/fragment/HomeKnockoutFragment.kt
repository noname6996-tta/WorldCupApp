package com.example.worldcup2022.view.fragment

import android.util.Log
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import com.example.worldcup2022.LIST_MATCHS
import com.example.worldcup2022.R
import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.data.dto.worldcup.Match
import com.example.worldcup2022.data.dto.worldcup.ResponseMatch
import com.example.worldcup2022.databinding.FragmentKnockoutStageBinding
import com.example.worldcup2022.ui.component.main.MainViewModel
import com.example.worldcup2022.utils.observe
import com.orhanobut.hawk.Hawk
import com.proxglobal.worlcupapp.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HomeKnockoutFragment : BaseFragment<FragmentKnockoutStageBinding>() {
    private val mainViewModel: MainViewModel by viewModels()
    lateinit var matchsOnl: List<com.example.worldcup2022.data.dto.worldcup.Match>

    override fun getDataBinding(): FragmentKnockoutStageBinding {
        return FragmentKnockoutStageBinding.inflate(layoutInflater)
    }

    override fun initData() {
        super.initData()
    }

    override fun initView() {
        super.initView()
    }

    override fun initViewModel() {
        super.initViewModel()
        mainViewModel.getFullMatchs()
    }

    override fun addObservers() {
        super.addObservers()
        observe(mainViewModel.matchsLiveData, ::handleMatchsList)
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
        matchsOnl = Hawk.get<ArrayList<com.example.worldcup2022.data.dto.worldcup.Match>>(
            LIST_MATCHS, ArrayList()
        )
        if (matchsOnl.isNotEmpty()) {
            for (i in 0..matchsOnl.size - 1) {
                var day = matchsOnl[i].dateFormat
                when(day) {
                    "2022-12-03T18:00:00+0300" -> {
                        Glide.with(requireContext()).load(matchsOnl[i].country1?.image)
                            .error(R.drawable.logo)
                            .into(binding.imgA1)
                        Glide.with(requireContext()).load(matchsOnl[i].country2?.image)
                            .error(R.drawable.logo)
                            .into(binding.imgA1)
                    }
                    "2022-12-03T22:00:00+0300" -> {
                        Glide.with(requireContext()).load(matchsOnl[i].country1?.image)
                            .error(R.drawable.logo)
                            .into(binding.imgC1)
                        Glide.with(requireContext()).load(matchsOnl[i].country2?.image)
                            .error(R.drawable.logo)
                            .into(binding.imgD2)
                    }
                    "2022-12-04T18:00:00+0300" -> {
                        Glide.with(requireContext()).load(matchsOnl[i].country1?.image)
                            .error(R.drawable.logo)
                            .into(binding.imgD1)
                        Glide.with(requireContext()).load(matchsOnl[i].country2?.image)
                            .error(R.drawable.logo)
                            .into(binding.imgC2)
                    }
                    "2022-12-04T22:00:00+0300" -> {
                        Glide.with(requireContext()).load(matchsOnl[i].country1?.image)
                            .error(R.drawable.logo)
                            .into(binding.imgB1)
                        Glide.with(requireContext()).load(matchsOnl[i].country2?.image)
                            .error(R.drawable.logo)
                            .into(binding.imgA2)
                    }
                    "2022-12-05T18:00:00+0300" -> {
                        Glide.with(requireContext()).load(matchsOnl[i].country1?.image)
                            .error(R.drawable.logo)
                            .into(binding.imgE1)
                        Glide.with(requireContext()).load(matchsOnl[i].country2?.image)
                            .error(R.drawable.logo)
                            .into(binding.imgF2)
                    }
                    "2022-12-05T22:00:00+0300" -> {
                        Glide.with(requireContext()).load(matchsOnl[i].country1?.image)
                            .error(R.drawable.logo)
                            .into(binding.imgG1)
                        Glide.with(requireContext()).load(matchsOnl[i].country2?.image)
                            .error(R.drawable.logo)
                            .into(binding.imgH2)
                    }
                    "2022-12-06T18:00:00+0300" -> {
                        Glide.with(requireContext()).load(matchsOnl[i].country1?.image)
                            .error(R.drawable.logo)
                            .into(binding.imgF1)
                        Glide.with(requireContext()).load(matchsOnl[i].country2?.image)
                            .error(R.drawable.logo)
                            .into(binding.imgE2)
                    }
                    "2022-12-06T22:00:00+0300" -> {
                        Glide.with(requireContext()).load(matchsOnl[i].country1?.image)
                            .error(R.drawable.logo)
                            .into(binding.imgH1)
                        Glide.with(requireContext()).load(matchsOnl[i].country2?.image)
                            .error(R.drawable.logo)
                            .into(binding.imgG2)
                    }
                    "2022-12-09T18:00:00+0300" -> {
                        Glide.with(requireContext()).load(matchsOnl[i].country1?.image)
                            .error(R.drawable.logo)
                            .into(binding.img14team3)
                        Glide.with(requireContext()).load(matchsOnl[i].country2?.image)
                            .error(R.drawable.logo)
                            .into(binding.img14team4)
                    }
                }
            }
        }
    }
}


