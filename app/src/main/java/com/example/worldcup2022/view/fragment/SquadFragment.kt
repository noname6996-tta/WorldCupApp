package com.example.worldcup2022.view.fragment

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.worldcup2022.R
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
    private var adapterGoalkeeper = SquadAdapter()
    private var adapterDefenders = SquadAdapter()
    private var adapterMidfielders = SquadAdapter()
    private var adapterForwards = SquadAdapter()
    private lateinit var arrSquadsGoalkeeper: ArrayList<Squad>
    private lateinit var arrSquadsDefenders: ArrayList<Squad>
    private lateinit var arrSquadsMidfielders: ArrayList<Squad>
    private lateinit var arrSquadsForwards: ArrayList<Squad>
    override fun getDataBinding(): FragmentSquadBinding {
        return FragmentSquadBinding.inflate(layoutInflater)
    }

    val args: SquadFragmentArgs by navArgs()

    override fun addEvent() {
        super.addEvent()
        binding.viewBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    override fun initViewModel() {
        super.initViewModel()
        val country: Country = args.country
        if (country == null) {

        } else {
            mainViewModel.getFullSquads(country.id)
            Glide.with(requireContext()).load(country.image)
                .error(R.drawable.logo)
                .into(binding.imgCountryFlag)
            binding.tvNameCountry.text = country.name.trim().toString()+" "
        }

    }

    override fun addObservers() {
        super.addObservers()
        observe(mainViewModel.squadsLiveData, ::handleSoundsList)
    }

    override fun initData() {
        super.initData()
        arrSquadsDefenders = ArrayList()
        arrSquadsForwards = ArrayList()
        arrSquadsGoalkeeper = ArrayList()
        arrSquadsMidfielders = ArrayList()
    }


    override fun initView() {
        super.initView()
        binding.recGoalkeeper.adapter = adapterGoalkeeper
        binding.recDefenders.adapter = adapterDefenders
        binding.recMidgielders.adapter = adapterMidfielders
        binding.recForwards.adapter = adapterForwards

        setLayoutManager(binding.recGoalkeeper)
        setLayoutManager(binding.recDefenders)
        setLayoutManager(binding.recMidgielders)
        setLayoutManager(binding.recForwards)



    }

    private fun setLayoutManager(a : RecyclerView){
        val linearLayoutManager = LinearLayoutManager(requireContext())
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        a.layoutManager = linearLayoutManager
    }


    private fun handleSoundsList(status: Resource<ResponseSquad>) {
        when (status) {
            is Resource.Loading -> {
                Log.e("handleSquadsList", "handleSquadsList: Loading ")
            }
            is Resource.Success -> status.data?.let { bindListData(matchs = it) }
            is Resource.DataError -> {
                status.errorCode?.let {
                    Log.e(
                        "handleSquadsList",
                        "handleSquadsList: Error " + it.toString()
                    )
                }
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
        for (i in 0 until matchs.data.size) {
            val squad = matchs.data[i]
            when (squad.position) {
                "COACH" -> {
                    binding.tvNameCoach.text = squad.name
                    Glide.with(requireContext()).load("https://"+squad.image)
                        .error(R.drawable.logo)
                        .into(binding.imgCoach)
                }
                "FORWARDS" -> {
                    arrSquadsForwards.add(squad)
                }
                "MIDFIELDERS" -> {
                    arrSquadsMidfielders.add(squad)
                }
                "DEFENDERS" -> {
                    arrSquadsDefenders.add(squad)
                }
                "GOALKEEPERS" -> {
                    arrSquadsGoalkeeper.add(squad)
                }
            }
        }
        adapterDefenders.setListSquad(arrSquadsDefenders,requireContext())
        Log.e("arraysize",arrSquadsDefenders.size.toString()+"_" +arrSquadsForwards.size.toString()+"_" +arrSquadsGoalkeeper.size.toString() +"_"+arrSquadsMidfielders.size.toString() +" ")
        adapterForwards.setListSquad(arrSquadsForwards,requireContext())
        adapterGoalkeeper.setListSquad(arrSquadsGoalkeeper,requireContext())
        adapterMidfielders.setListSquad(arrSquadsMidfielders,requireContext())
    }

}