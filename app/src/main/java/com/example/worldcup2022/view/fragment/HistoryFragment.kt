package com.example.worldcup2022.view.fragment

import android.util.Log
import androidx.fragment.app.viewModels
import com.example.worldcup2022.LIST_MATCHS
import com.example.worldcup2022.R
import com.example.worldcup2022.USER_ID
import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.data.dto.worldcup.Match
import com.example.worldcup2022.data.dto.worldcup.ResponseMatch
import com.example.worldcup2022.data.dto.worldcup.ResponseResultGuess
import com.example.worldcup2022.databinding.FragmentHistoryBinding
import com.example.worldcup2022.ui.component.main.MainViewModel
import com.example.worldcup2022.utils.observe
import com.orhanobut.hawk.Hawk
import com.proxglobal.worlcupapp.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HistoryFragment : BaseFragment<FragmentHistoryBinding>() {
    private val mainViewModel: MainViewModel by viewModels()
    override fun getDataBinding(): FragmentHistoryBinding {
        return FragmentHistoryBinding.inflate(layoutInflater)


    }

    override fun initView() {
        super.initView()
        binding.tv45.text= String.format(getString(R.string.predicted_number_of_matches_empty), getString(R.string.empty))
        binding.tv76.text= String.format(getString(R.string.number_of_correct_guesses_empty), getString(R.string.empty))
        binding.Numere.text= String.format(getString(R.string.number_of_wrong_guesses_empty), getString(R.string.empty))
        binding.textView6.text= String.format(getString(R.string.odds_of_guessing_correctly_empty), getString(R.string.empty))

    }

    override fun initData() {
        super.initData()


        observe(mainViewModel.resultGuessLiveData, ::handleResultGuess)
    }

    override fun onResume() {
        super.onResume()
        val userId = Hawk.get<String>(USER_ID, "")
        if (userId.isNotEmpty()) {
            mainViewModel.getResultGuess(userId)
        }
    }
    /**
     *
     */
    private fun handleResultGuess(status: Resource<ResponseResultGuess>) {
        when (status) {
            is Resource.Loading -> {
                Log.e("Home", "handleResultGuess: Loading ")
            }
            is Resource.Success -> status.data?.let { bindResultGuess(result = it) }
            is Resource.DataError -> {
                status.errorCode?.let { Log.e("Home", "handleResultGuess: Error " + it) }
            }
        }
    }

    private fun bindResultGuess(result: ResponseResultGuess) {
        binding.tv45.text= String.format(getString(R.string.predicted_number_of_matches_empty), result.data.total)
        binding.tv76.text= String.format(getString(R.string.number_of_correct_guesses_empty), result.data.rightCount)
        binding.Numere.text= String.format(getString(R.string.number_of_wrong_guesses_empty), result.data.wrongCount)
        if (result.data.total>0){
            binding.textView6.text= String.format(getString(R.string.odds_of_guessing_correctly_empty), result.data.rightCount/result.data.total)
        }else{
            binding.textView6.text= String.format(getString(R.string.odds_of_guessing_correctly_empty), getString(R.string.empty))
        }


    }

}