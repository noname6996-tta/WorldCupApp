package com.example.worldcup2022.view.fragment

import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import com.example.worldcup2022.LIST_MATCHS
import com.example.worldcup2022.R
import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.data.dto.worldcup.Match
import com.example.worldcup2022.data.dto.worldcup.ResponseMatch
import com.example.worldcup2022.databinding.FragmentKnockoutStageBinding
import com.example.worldcup2022.ui.component.main.MainViewModel
import com.example.worldcup2022.utils.UtilsKotlin
import com.example.worldcup2022.utils.observe
import com.orhanobut.hawk.Hawk
import com.proxglobal.worlcupapp.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HomeKnockoutFragment : BaseFragment<FragmentKnockoutStageBinding>() {
    private val mainViewModel: MainViewModel by viewModels()
    lateinit var matchsOnl: List<com.example.worldcup2022.data.dto.worldcup.Match>
    lateinit var date: String
    lateinit var imgTeam1: String
    lateinit var imgTeam2 : String
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
                        setData("2022-12-03T18:00:00+0300",matchsOnl[i].country1?.image.toString(),matchsOnl[i].country2?.image.toString(),binding.match49,binding.imgA1,binding.imgB2)
                    }
                    "2022-12-03T22:00:00+0300" -> {
                        setData("2022-12-03T22:00:00+0300",matchsOnl[i].country1?.image.toString(),matchsOnl[i].country2?.image.toString(),binding.match50,binding.imgC1,binding.imgD2)
                    }
                    "2022-12-04T18:00:00+0300" -> {
                        setData("2022-12-04T18:00:00+0300",matchsOnl[i].country1?.image.toString(),matchsOnl[i].country2?.image.toString(),binding.match52,binding.imgD1,binding.imgC2)
                    }
                    "2022-12-04T22:00:00+0300" -> {
                        setData("2022-12-04T22:00:00+0300",matchsOnl[i].country1?.image.toString(),matchsOnl[i].country2?.image.toString(),binding.match51,binding.imgB1,binding.imgA2)
                    }
                    "2022-12-05T18:00:00+0300" -> {
                        setData("2022-12-05T18:00:00+0300",matchsOnl[i].country1?.image.toString(),matchsOnl[i].country2?.image.toString(),binding.match53,binding.imgE1,binding.imgF2)
                    }
                    "2022-12-05T22:00:00+0300" -> {
                        setData("2022-12-05T22:00:00+0300",matchsOnl[i].country1?.image.toString(),matchsOnl[i].country2?.image.toString(),binding.match54,binding.imgG1,binding.imgH2)
                    }
                    "2022-12-06T18:00:00+0300" -> {
                        setData("2022-12-06T18:00:00+0300",matchsOnl[i].country1?.image.toString(),matchsOnl[i].country2?.image.toString(),binding.match55,binding.imgF1,binding.imgE2)
                    }
                    "2022-12-06T22:00:00+0300" -> {
                        setData("2022-12-06T22:00:00+0300",matchsOnl[i].country1?.image.toString(),matchsOnl[i].country2?.image.toString(),binding.match56,binding.imgH1,binding.imgG2)
                    }
                    "2022-12-09T18:00:00+0300" -> {
                        setData("2022-12-09T18:00:00+0300",matchsOnl[i].country1?.image.toString(),matchsOnl[i].country2?.image.toString(),binding.match58,binding.img14team3,binding.img14team4)
                    }
                    "2022-12-9T22:00:00+0300" -> {
                        setData("2022-12-09T18:00:00+0300",matchsOnl[i].country1?.image.toString(),matchsOnl[i].country2?.image.toString(),binding.match57,binding.img14team1,binding.img14team2)
                    }
                    "2022-12-10T18:00:00+0300" -> {
                        setData("2022-12-10T18:00:00+0300",matchsOnl[i].country1?.image.toString(),matchsOnl[i].country2?.image.toString(),binding.match60,binding.img14team7,binding.img14team8)
                    }
                    "2022-12-13T22:00:00+0300" -> {
                        setData("2022-12-13T22:00:00+0300",matchsOnl[i].country1?.image.toString(),matchsOnl[i].country2?.image.toString(),binding.match61,binding.img12team1,binding.img12team2)
                    }
                    "2022-12-14T22:00:00+0300" -> {
                        setData("2022-12-14T22:00:00+0300",matchsOnl[i].country1?.image.toString(),matchsOnl[i].country2?.image.toString(),binding.match62,binding.img12team3,binding.img12team4)
                    }
                    "2022-12-17T18:00:00+0300" -> {
                        setData("2022-12-17T18:00:00+0300",matchsOnl[i].country1?.image.toString(),matchsOnl[i].country2?.image.toString(),binding.match63,binding.img3placeTeam1,binding.img3placeTeam2)
                    }
                    "2022-12-18T18:00:00+0300" -> {
                        setData("2022-12-18T18:00:00+0300",matchsOnl[i].country1?.image.toString(),matchsOnl[i].country2?.image.toString(),binding.match64,binding.imgFinal1,binding.imgFinal2)
                    }
                }
            }
        }
    }

    private fun setData( time: String,imgTeam1: String,imgTeam2: String,textView: TextView,imageViewTeam1: ImageView,imageViewTeam2: ImageView){
        var text = UtilsKotlin().formatDate(UtilsKotlin().parseTime_yyyy_MM_dd_T_HH_mm_ssZ(time))
        val separated: List<String> = text.split(" ")
        textView.setText(separated[2]+" "+ separated[1])
        Glide.with(requireContext()).load(imgTeam1)
            .error(R.drawable.logo)
            .into(imageViewTeam1)
        Glide.with(requireContext()).load(imgTeam2)
            .error(R.drawable.logo)
            .into(imageViewTeam2)
    }
}


