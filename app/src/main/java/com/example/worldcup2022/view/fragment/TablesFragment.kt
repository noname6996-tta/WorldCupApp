package com.example.worldcup2022.view.fragment

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.worldcup2022.adapter.MatchGroupAdapter
import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.data.dto.worldcup.Country
import com.example.worldcup2022.data.dto.worldcup.ResponseCountry
import com.example.worldcup2022.databinding.FragmentTablesBinding
import com.example.worldcup2022.ui.component.main.MainViewModel
import com.example.worldcup2022.utils.observe
import com.proxglobal.worlcupapp.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TablesFragment : BaseFragment<FragmentTablesBinding>() {
    private val mainViewModel: MainViewModel by viewModels()

    lateinit var arrCountrysA: ArrayList<Country>
    private val matchGroupAdapterA = MatchGroupAdapter()
    lateinit var arrCountrysB: ArrayList<Country>
    private val matchGroupAdapterB = MatchGroupAdapter()
    lateinit var arrCountrysC: ArrayList<Country>
    private val matchGroupAdapterC = MatchGroupAdapter()
    lateinit var arrCountrysD: ArrayList<Country>
    private val matchGroupAdapterD = MatchGroupAdapter()
    lateinit var arrCountrysE: ArrayList<Country>
    private val matchGroupAdapterE = MatchGroupAdapter()
    lateinit var arrCountrysF: ArrayList<Country>
    private val matchGroupAdapterF = MatchGroupAdapter()
    lateinit var arrCountrysG: ArrayList<Country>
    private val matchGroupAdapterG = MatchGroupAdapter()
    lateinit var arrCountrysH: ArrayList<Country>
    private val matchGroupAdapterH = MatchGroupAdapter()


    override fun getDataBinding(): FragmentTablesBinding {
        return FragmentTablesBinding.inflate(layoutInflater)
    }

    override fun initView() {
        super.initView()
        val linearLayoutManagerA = LinearLayoutManager(requireContext())
        linearLayoutManagerA.orientation = LinearLayoutManager.VERTICAL
        val linearLayoutManagerB = LinearLayoutManager(requireContext())
        linearLayoutManagerB.orientation = LinearLayoutManager.VERTICAL
        val linearLayoutManagerC = LinearLayoutManager(requireContext())
        linearLayoutManagerC.orientation = LinearLayoutManager.VERTICAL
        val linearLayoutManagerD = LinearLayoutManager(requireContext())
        linearLayoutManagerD.orientation = LinearLayoutManager.VERTICAL
        val linearLayoutManagerE = LinearLayoutManager(requireContext())
        linearLayoutManagerE.orientation = LinearLayoutManager.VERTICAL
        val linearLayoutManagerF = LinearLayoutManager(requireContext())
        linearLayoutManagerF.orientation = LinearLayoutManager.VERTICAL
        val linearLayoutManagerG = LinearLayoutManager(requireContext())
        linearLayoutManagerG.orientation = LinearLayoutManager.VERTICAL
        val linearLayoutManagerH = LinearLayoutManager(requireContext())
        linearLayoutManagerH.orientation = LinearLayoutManager.VERTICAL

        binding.recMatchGroupA.adapter = matchGroupAdapterA
        arrCountrysA = ArrayList()
        binding.recMatchGroupA.layoutManager = linearLayoutManagerA
        //
        binding.recMatchGroupB.adapter = matchGroupAdapterB
        arrCountrysB = ArrayList()
        binding.recMatchGroupB.layoutManager = linearLayoutManagerB
        //
        binding.recMatchGroupC.adapter = matchGroupAdapterC
        arrCountrysC = ArrayList()
        binding.recMatchGroupC.layoutManager = linearLayoutManagerC
        //
        binding.recMatchGroupD.adapter = matchGroupAdapterD
        arrCountrysD = ArrayList()
        binding.recMatchGroupD.layoutManager = linearLayoutManagerD
        //
        binding.recMatchGroupE.adapter = matchGroupAdapterE
        arrCountrysE = ArrayList()
        binding.recMatchGroupE.layoutManager = linearLayoutManagerE
        //
        binding.recMatchGroupF.adapter = matchGroupAdapterF
        arrCountrysF = ArrayList()
        binding.recMatchGroupF.layoutManager = linearLayoutManagerF
        //
        binding.recMatchGroupG.adapter = matchGroupAdapterG
        arrCountrysG = ArrayList()
        binding.recMatchGroupG.layoutManager = linearLayoutManagerG
        //
        binding.recMatchGroupH.adapter = matchGroupAdapterH
        arrCountrysH = ArrayList()
        binding.recMatchGroupH.layoutManager = linearLayoutManagerH
    }

    override fun initData() {
        super.initData()
//        try {
//            val fileInString: String =
//                requireContext().assets.open("country.json").bufferedReader().use { it.readText() }
//            var countrys: List<Country> =
//                Gson().fromJson(fileInString, object : TypeToken<List<Country>>() {}.type)
//            for (i in 0..countrys.size - 1) {
//                val country = countrys[i]
//                when(countrys[i].group){
//                    "A" -> arrCountrysA.add(countrys[i])
//                    "B" -> arrCountrysB.add(countrys[i])
//                    "C" -> arrCountrysC.add(countrys[i])
//                    "D" -> arrCountrysD.add(countrys[i])
//                    "E" -> arrCountrysE.add(countrys[i])
//                    "F" -> arrCountrysF.add(countrys[i])
//                    "G" -> arrCountrysG.add(countrys[i])
//                    "H" -> arrCountrysH.add(countrys[i])
//                    else -> {
//
//                    }
//                }
//            }
//        } catch (e: IOException) {
//
//        }
//        matchGroupAdapterA.setListMatchCountrys(arrCountrysA,requireContext())
//        //
//        matchGroupAdapterB.setListMatchCountrys(arrCountrysB,requireContext())
//        //
//        matchGroupAdapterC.setListMatchCountrys(arrCountrysC,requireContext())
//        //
//        matchGroupAdapterD.setListMatchCountrys(arrCountrysD,requireContext())
//        //
//        matchGroupAdapterE.setListMatchCountrys(arrCountrysE,requireContext())
//        //
//        matchGroupAdapterF.setListMatchCountrys(arrCountrysF,requireContext())
//        //
//        matchGroupAdapterG.setListMatchCountrys(arrCountrysG,requireContext())
//        //
//        matchGroupAdapterH.setListMatchCountrys(arrCountrysH,requireContext())
    }

    override fun addEvent() {
        super.addEvent()
        binding.viewMoreGroupDetalsGroupA.setOnClickListener {
            val action = TablesFragmentDirections.actionTablesFragmentToGroupDetalsFragment("A")
            findNavController().navigate(action)
        }
        binding.viewMoreGroupDetalsGroupB.setOnClickListener {
            val action = TablesFragmentDirections.actionTablesFragmentToGroupDetalsFragment("B")
            findNavController().navigate(action)
        }
        binding.viewMoreGroupDetalsGroupC.setOnClickListener {
            val action = TablesFragmentDirections.actionTablesFragmentToGroupDetalsFragment("C")
            findNavController().navigate(action)
        }
        binding.tvMoreGroupDetalsGroupD.setOnClickListener {
            val action = TablesFragmentDirections.actionTablesFragmentToGroupDetalsFragment("D")
            findNavController().navigate(action)
        }
        binding.tvMoreGroupDetalsGroupE.setOnClickListener {
            val action = TablesFragmentDirections.actionTablesFragmentToGroupDetalsFragment("E")
            findNavController().navigate(action)
        }
        binding.tvMoreGroupDetalsGroupF.setOnClickListener {
            val action = TablesFragmentDirections.actionTablesFragmentToGroupDetalsFragment("F")
            findNavController().navigate(action)
        }
        binding.tvMoreGroupDetalsGroupG.setOnClickListener {
            val action = TablesFragmentDirections.actionTablesFragmentToGroupDetalsFragment("G")
            findNavController().navigate(action)
        }
        binding.tvMoreGroupDetalsGroupH.setOnClickListener {
            val action = TablesFragmentDirections.actionTablesFragmentToGroupDetalsFragment("H")
            findNavController().navigate(action)
        }
    }

    override fun initViewModel() {
        super.initViewModel()
        mainViewModel.getFullCountry()
    }

    override fun addObservers() {
        super.addObservers()
        observe(mainViewModel.countrysLiveData, ::handleSoundsList)
    }

    private fun handleSoundsList(status: Resource<ResponseCountry>) {
        when (status) {
            is Resource.Loading -> {
                Log.e("handleCountryList", "handleCountryList: Loading ")
            }
            is Resource.Success -> status.data?.let { bindListData(matchs = it) }
            is Resource.DataError -> {
                status.errorCode?.let {
                    Log.e(
                        "handleCountryList",
                        "handleCountryList: Error " + it.toString()
                    )
                }
            }
        }
    }

    private fun bindListData(matchs: ResponseCountry) {
        arrCountrysA = ArrayList()
        arrCountrysB = ArrayList()
        arrCountrysC = ArrayList()
        arrCountrysD = ArrayList()
        arrCountrysE = ArrayList()
        arrCountrysF = ArrayList()
        arrCountrysG = ArrayList()
        arrCountrysH = ArrayList()

        for (i in 0..matchs.data.size - 1) {
            when (matchs.data[i].group) {
                "A" -> arrCountrysA.add(matchs.data[i])
                "B" -> arrCountrysB.add(matchs.data[i])
                "C" -> arrCountrysC.add(matchs.data[i])
                "D" -> arrCountrysD.add(matchs.data[i])
                "E" -> arrCountrysE.add(matchs.data[i])
                "F" -> arrCountrysF.add(matchs.data[i])
                "G" -> arrCountrysG.add(matchs.data[i])
                "H" -> arrCountrysH.add(matchs.data[i])
                else -> {
                }
            }
        }
        matchGroupAdapterA.setListMatchCountrys(arrCountrysA, requireContext())
        //
        matchGroupAdapterB.setListMatchCountrys(arrCountrysB, requireContext())
        //
        matchGroupAdapterC.setListMatchCountrys(arrCountrysC, requireContext())
        //
        matchGroupAdapterD.setListMatchCountrys(arrCountrysD, requireContext())
        //
        matchGroupAdapterE.setListMatchCountrys(arrCountrysE, requireContext())
        //
        matchGroupAdapterF.setListMatchCountrys(arrCountrysF, requireContext())
        //
        matchGroupAdapterG.setListMatchCountrys(arrCountrysG, requireContext())
        //
        matchGroupAdapterH.setListMatchCountrys(arrCountrysH, requireContext())
    }
}