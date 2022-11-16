package com.example.worldcup2022.view.fragment

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.worldcup2022.adapter.SquadAdapter
import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.data.dto.worldcup.Country
import com.example.worldcup2022.data.dto.worldcup.ResponseSquad
import com.example.worldcup2022.data.dto.worldcup.Squad
import com.example.worldcup2022.databinding.FragmentSquadBinding
import com.example.worldcup2022.ui.component.main.MainViewModel
import com.example.worldcup2022.utils.observe
import com.proxglobal.worlcupapp.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SquadFragment : BaseFragment<FragmentSquadBinding>() {
    private val mainViewModel: MainViewModel by viewModels()
    private var adapter  = SquadAdapter()
    private lateinit var arrSquads: ArrayList<Squad>
    override fun getDataBinding(): FragmentSquadBinding {
        return FragmentSquadBinding.inflate(layoutInflater)
    }

    val args : SquadFragmentArgs by navArgs()

    override fun addEvent() {
        super.addEvent()
    }

    override fun initViewModel() {
        super.initViewModel()
        mainViewModel.getFullSquads()
    }

    override fun addObservers() {
        super.addObservers()
        observe(mainViewModel.squadsLiveData, ::handleSoundsList)
    }

    override fun initData() {
        super.initData()
    }

    override fun initView() {
        super.initView()
        val country : Country= args.country
        if (country==null){

        } else {

        }
    }


    private fun handleSoundsList(status: Resource<ResponseSquad>) {
        when (status) {
            is Resource.Loading -> {
                Log.e("handleSquadsList", "handleSquadsList: Loading ")
            }
            is Resource.Success -> status.data?.let { bindListData(matchs = it) }
            is Resource.DataError -> {
                status.errorCode?.let { Log.e("handleSquadsList", "handleSquadsList: Error " + it.toString()) }
//                showDataView(false)
//                status.errorCode?.let { recipesListViewModel.showToastMessage(it)
            }
        }
    }

    private fun bindListData(matchs: ResponseSquad) {
        Log.e("handleSquadsList", "bindListData: " + matchs.data.size)
//        for (i in 0..matchs.data.size - 1) {
//            val sound = matchs.data[i]
//            arrSounds.add(sound)
//        }
//        adpter.setListSound(arrSounds, requireContext())
    }
}