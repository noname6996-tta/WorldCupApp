package com.example.worldcup2022.view.fragment

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.worldcup2022.adapter.MatchGroupAdapter
import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.data.dto.worldcup.Country
import com.example.worldcup2022.data.dto.worldcup.ResponseCountry
import com.example.worldcup2022.databinding.FragmentMatchGroupBinding
import com.example.worldcup2022.ui.component.main.MainViewModel
import com.example.worldcup2022.utils.observe
import com.google.common.reflect.TypeToken
import com.google.gson.Gson
import com.proxglobal.worlcupapp.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import java.io.IOException

@AndroidEntryPoint
class MatchGroupFragment : BaseFragment<FragmentMatchGroupBinding>() {
    companion object {
        lateinit var group: String
    }

    private val mainViewModel: MainViewModel by viewModels()
    lateinit var arrCountrys: ArrayList<Country>
    private val matchGroupAdapter = MatchGroupAdapter()
    override fun getDataBinding(): FragmentMatchGroupBinding {
        return FragmentMatchGroupBinding.inflate(layoutInflater)
    }

    override fun initView() {
        super.initView()
        binding.recMatchGroup.adapter = matchGroupAdapter
        arrCountrys = ArrayList()

        val linearLayoutManager = LinearLayoutManager(requireContext())
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.recMatchGroup.layoutManager = linearLayoutManager

        binding.textView5.text = "Group " + group + " "
    }

    override fun initData() {
        super.initData()
        try {
            val fileInString: String =
                requireContext().assets.open("country.json").bufferedReader().use { it.readText() }
            var countrys: List<Country> =
                Gson().fromJson(fileInString, object : TypeToken<List<Country>>() {}.type)
            for (i in 0..countrys.size - 1) {
                if (countrys[i].group.equals(group)) {
                    arrCountrys.add(countrys[i])
                }
            }
        } catch (e: IOException) {

        }

        matchGroupAdapter.setListMatchCountrys(arrCountrys,requireContext())
    }

    override fun addEvent() {
        super.addEvent()
        binding.tvMoreGroupDetals.setOnClickListener {
            val action = MatchFragmentDirections.actionMatchFragmentToGroupDetalsFragment(group)
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
        arrCountrys = ArrayList()
        for (i in 0..matchs.data.size - 1) {
            if (matchs.data[i].group.equals(group)) {
                arrCountrys.add(matchs.data[i])
            }
        }
        arrCountrys.reverse()
        matchGroupAdapter.setListMatchCountrys(arrCountrys, requireContext())
    }
}