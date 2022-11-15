package com.example.worldcup2022.view.fragment

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.worldcup2022.adapter.SimulationSoundAdapter
import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.data.dto.worldcup.ResponseSound
import com.example.worldcup2022.data.dto.worldcup.Sound
import com.example.worldcup2022.databinding.FragmentSimulationSoundBinding
import com.example.worldcup2022.ui.component.main.MainViewModel
import com.example.worldcup2022.utils.observe
import com.proxglobal.worlcupapp.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class SimulationSoundFragment : BaseFragment<FragmentSimulationSoundBinding>() {
    private val mainViewModel: MainViewModel by viewModels()
    private var adpter = SimulationSoundAdapter()
    private lateinit var arrSounds: ArrayList<Sound>
    override fun getDataBinding(): FragmentSimulationSoundBinding {
        return FragmentSimulationSoundBinding.inflate(layoutInflater)
    }

    override fun addEvent() {
        super.addEvent()
        if (checkForInternet(requireContext())){
            adpter.setClickShowMatch {
                PlaySoundFragment.sound = it
                val action = WcFunFragmentDirections.actionWcFunFragmentToPlaySoundFragment(1)
                findNavController().navigate(action)
            }
        }
        else {
            binding.imgDrum.setOnClickListener {
                val action = WcFunFragmentDirections.actionWcFunFragmentToPlaySoundFragment(2)
                findNavController().navigate(action)
            }
        }

    }

    override fun initView() {
        super.initView()
        binding.recSound.adapter = adpter

        val layoutManager = GridLayoutManager(requireContext(), 3)
        binding.recSound.layoutManager = layoutManager


    }

    override fun initData() {
        super.initData()
        arrSounds = ArrayList()
    }


    override fun initViewModel() {
        super.initViewModel()
        mainViewModel.getFullSounds()
    }

    override fun addObservers() {
        super.addObservers()
        observe(mainViewModel.soundsLiveData, ::handleSoundsList)
    }

    private fun handleSoundsList(status: Resource<ResponseSound>) {
        when (status) {
            is Resource.Loading -> {
                Log.e("TAG", "handleSoundsList: Loading ")
            }
            is Resource.Success -> status.data?.let { bindListData(matchs = it) }
            is Resource.DataError -> {
                status.errorCode?.let { Log.e("TAG", "handleSoundsList: Error " + it.toString()) }
                binding.layoutConstrainOffline.visibility = View.VISIBLE
                binding.recSound.visibility = View.GONE
//                showDataView(false)
//                status.errorCode?.let { recipesListViewModel.showToastMessage(it)
            }
        }
    }

    private fun bindListData(matchs: ResponseSound) {
        Log.e("BBBBBBB", "bindListData: " + matchs.data.size)
        binding.layoutConstrainOffline.visibility = View.GONE
        binding.recSound.visibility = View.VISIBLE
        for (i in 0..matchs.data.size - 1) {
            val sound = matchs.data[i]
            arrSounds.add(sound)
        }
        adpter.setListSound(arrSounds, requireContext())
    }

    fun checkForInternet(context: Context): Boolean {
        // register activity with the connectivity manager service
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        // if the android version is equal to M
        // or greater we need to use the
        // NetworkCapabilities to check what type of
        // network has the internet connection
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

            // Returns a Network object corresponding to
            // the currently active default data network.
            val network = connectivityManager.activeNetwork ?: return false

            // Representation of the capabilities of an active network.
            val activeNetwork = connectivityManager.getNetworkCapabilities(network) ?: return false

            return when {
                // Indicates this network uses a Wi-Fi transport,
                // or WiFi has network connectivity
                activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true

                // Indicates this network uses a Cellular transport. or
                // Cellular has network connectivity
                activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true

                // else return false
                else -> false
            }
        } else {
            // if the android version is below M
            @Suppress("DEPRECATION") val networkInfo =
                connectivityManager.activeNetworkInfo ?: return false
            @Suppress("DEPRECATION")
            return networkInfo.isConnected
        }
    }

}