package com.example.worldcup2022.view.fragment

import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.worldcup2022.R
import com.example.worldcup2022.adapter.StadiumAdapter
import com.example.worldcup2022.databinding.FragmentStadiumBinding
import com.example.worldcup2022.model.Match
import com.example.worldcup2022.model.Stadium
import com.example.worldcup2022.view.activity.MainActivity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.proxglobal.worlcupapp.base.BaseFragment
import java.io.IOException

class StadiumFragment :BaseFragment<FragmentStadiumBinding>(){
    val args : StadiumFragmentArgs by navArgs()
    private val stadiumAdapter = StadiumAdapter()
    lateinit var stadium:  List<Stadium>
    lateinit var arrStadium: ArrayList<Stadium>
    override fun getDataBinding(): FragmentStadiumBinding {
        return FragmentStadiumBinding.inflate(layoutInflater)
    }

    override fun initData() {
        super.initData()
    }

    override fun initView() {
        binding.recAllStadium.adapter = stadiumAdapter
        super.initView()
        val id = args.idStadium
        try {
            val fileInString: String =
                requireContext().assets.open("Stadium.json").bufferedReader().use { it.readText() }
            var stadiums: List<Stadium> =
                Gson().fromJson(fileInString, object : TypeToken<List<Stadium>>() {}.type)
            for (i in 0..stadiums.size - 1) {
                val stadium = stadiums[i]
                if (id == stadium.id) {
                    binding.tvNameSatdium.text = stadium.name
                    binding.tvLocation.text = stadium.location
                    binding.tvCapacity.text = stadium.capacity
                    binding.tvOpened.text = stadium.opened
                    binding.tvDescStadium.text = stadium.content
                    Glide.with(requireContext()).load(stadium.image)
                        .error(R.drawable.ic_launcher_background).placeholder(R.drawable.ic_launcher_background)
                        .into(binding.imgStadium)
                }
            }
        } catch (e: IOException) {

        }

        arrStadium = ArrayList()
        val linearLayoutManager = LinearLayoutManager(requireContext())
        linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        binding.recAllStadium.layoutManager = linearLayoutManager

        //
        try {
            val fileInString: String =
                requireContext().assets.open("Stadium.json").bufferedReader().use { it.readText() }
            var stadiums: List<Stadium> =
                Gson().fromJson(fileInString, object : TypeToken<List<Stadium>>() {}.type)
            for (i in 0..stadiums.size - 1) {
                val stadium = stadiums[i]
                if (id != stadium.id){
                    arrStadium.add(stadium)
                }

            }
        } catch (e: IOException) {

        }

        stadiumAdapter.setListStadium(arrStadium,requireContext())
        stadiumAdapter.setClickShowMatch {
            val action = StadiumFragmentDirections.actionStadiumFragmentToStadiumSecondFragment(it.id)
            findNavController().navigate(action)
        }
    }

    override fun addEvent() {
        super.addEvent()
        binding.viewBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

}