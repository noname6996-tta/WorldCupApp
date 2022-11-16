package com.example.worldcup2022.view.fragment

import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.worldcup2022.adapter.HomeMathAdapterBorder
import com.example.worldcup2022.adapter.MatchGroupAdapter
import com.example.worldcup2022.databinding.FragmentGroupDetalsBinding
import com.example.worldcup2022.data.dto.worldcup.Country
import com.example.worldcup2022.data.dto.worldcup.Match
import com.example.worldcup2022.ui.component.main.MainNewActivity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.proxglobal.worlcupapp.base.BaseFragment
import java.io.IOException
import kotlin.collections.ArrayList

class GroupDetalsFragment : BaseFragment<FragmentGroupDetalsBinding>(){
    val args : GroupInfoFragmentArgs by navArgs()
    var groupMatch : String = ""
    lateinit var arrCountrys: ArrayList<Country>
    private val matchGroupAdapter = MatchGroupAdapter()

    private val homeMatchAdapter = HomeMathAdapterBorder()
    lateinit var matchs: List<Match>
    lateinit var arrMatchs: java.util.ArrayList<Match>
    override fun getDataBinding(): FragmentGroupDetalsBinding {
        return FragmentGroupDetalsBinding.inflate(layoutInflater)
    }

    override fun initView() {
        super.initView()
        MainNewActivity.binding.bottomMain.visibility = View.GONE
        groupMatch = args.groupName
        binding.textView5.text = "Group "+groupMatch+" "
        binding.tvLogoGroupName.text = "Group "+groupMatch+" "
        binding.recMatchGroup.adapter = matchGroupAdapter
        arrCountrys = ArrayList()

        val linearLayoutManager = LinearLayoutManager(requireContext())
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.recMatchGroup.layoutManager = linearLayoutManager

        binding.recAllMatch.adapter = homeMatchAdapter
        arrMatchs = ArrayList()
        val linearLayoutManager2 = LinearLayoutManager(requireContext())
        linearLayoutManager2.orientation = LinearLayoutManager.VERTICAL
        binding.recAllMatch.layoutManager = linearLayoutManager2
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
                if (countrys[i].group.equals(groupMatch)) {
                    arrCountrys.add(countrys[i])
                }
            }
        } catch (e: IOException) {

        }
        matchGroupAdapter.setListMatchCountrys(arrCountrys,requireContext())


        try {
            val fileInString: String =
                requireContext().assets.open("match.json").bufferedReader().use { it.readText() }
            matchs = Gson().fromJson(fileInString, object : TypeToken<List<Match>>() {}.type)
            for (i in 0..matchs.size - 1) {
                if (matchs[i].group.equals(groupMatch)){
                    arrMatchs.add(matchs[i])
                }
            }

        } catch (e: IOException) {

        }
        homeMatchAdapter.setListMatch(arrMatchs, requireContext())
    }

    override fun addEvent() {
        super.addEvent()
        binding.vireBack.setOnClickListener {
            MainNewActivity.binding.bottomMain.visibility = View.VISIBLE
            findNavController().popBackStack()
        }
        homeMatchAdapter.setClickShowMatch{
            val action = GroupDetalsFragmentDirections.actionGroupDetalsFragmentToMatchFragment(it)
            findNavController().navigate(action)
        }

    }
}