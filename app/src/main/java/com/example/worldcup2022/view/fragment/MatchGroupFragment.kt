package com.example.worldcup2022.view.fragment

import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.worldcup2022.R
import com.example.worldcup2022.adapter.MatchGroupAdapter
import com.example.worldcup2022.databinding.FragmentMatchGroupBinding
import com.example.worldcup2022.data.dto.worldcup.Country
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.proxglobal.worlcupapp.base.BaseFragment
import java.io.IOException

class MatchGroupFragment : BaseFragment<FragmentMatchGroupBinding>(){
    companion object {
        lateinit var group : String
    }
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

        binding.textView5.text = "Group "+ group+" "
    }

    override fun initData() {
        super.initData()
        try {
            val fileInString: String =
                requireContext().assets.open("country.json").bufferedReader().use { it.readText() }
            var countrys: List<Country> =
                Gson().fromJson(fileInString, object : TypeToken<List<Country>>() {}.type)
            for (i in 0..countrys.size - 1) {
                val country = countrys[i]
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
}