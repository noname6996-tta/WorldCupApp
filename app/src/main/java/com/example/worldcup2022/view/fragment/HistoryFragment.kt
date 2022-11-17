package com.example.worldcup2022.view.fragment

import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.worldcup2022.LIST_DATES
import com.example.worldcup2022.LIST_MATCHS
import com.example.worldcup2022.R
import com.example.worldcup2022.USER_ID
import com.example.worldcup2022.adapter.HistoryMatchAdapter
import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.data.dto.worldcup.*
import com.example.worldcup2022.databinding.FragmentHistoryBinding
import com.example.worldcup2022.ui.component.main.MainViewModel
import com.example.worldcup2022.utils.UtilsKotlin
import com.example.worldcup2022.utils.observe
import com.orhanobut.hawk.Hawk
import com.proxglobal.worlcupapp.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.*

@AndroidEntryPoint
class HistoryFragment : BaseFragment<FragmentHistoryBinding>() {
    private val mainViewModel: MainViewModel by viewModels()
    private lateinit var adapter: HistoryMatchAdapter
    var listDatesOnl = ArrayList<String>()
    var listMatchgOnl = ArrayList<Match>()



    override fun getDataBinding(): FragmentHistoryBinding {
        return FragmentHistoryBinding.inflate(layoutInflater)


    }

    override fun onDestroyView() {
        super.onDestroyView()
        mainViewModel.historyMatchLiveDataPrivate.value = null
    }

    override fun initView() {
        super.initView()
        binding.tv45.text = String.format(getString(R.string.predicted_number_of_matches_empty), getString(R.string.empty))
        binding.tv76.text = String.format(getString(R.string.number_of_correct_guesses_empty), getString(R.string.empty))
        binding.Numere.text = String.format(getString(R.string.number_of_wrong_guesses_empty), getString(R.string.empty))
        binding.textView6.text = String.format(getString(R.string.odds_of_guessing_correctly_empty), getString(R.string.empty))

        adapter = HistoryMatchAdapter(requireContext())
        binding.rcvList.adapter = adapter
        binding.rcvList.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
    }

    override fun addObservers() {
        observe(mainViewModel.historyMatchLiveData, ::handleHistoryMatchList)
    }

    override fun initData() {


        observe(mainViewModel.resultGuessLiveData, ::handleResultGuess)

    }

    private var handleUpdateData = Handler(Looper.getMainLooper())
    private fun handleHistoryMatchList(status: Resource<ResponseHistoryMatch>) {
        when (status) {
            is Resource.Loading -> {
                if (mainViewModel.nextPageHistoryMatch.value == 0) {
                    showLoadingView()
                }
            }
            is Resource.Success -> status.data?.let {
                handleUpdateData.removeCallbacksAndMessages(null)
                handleUpdateData.post {
                    bindListData(historyMatchs = it)
                }
            }
            is Resource.DataError -> {
                status.errorCode?.let {
                    Log.d(
                        "ntduc_debug", "handleHistoryMatchList: Error " + it
                    )
                }
            }
        }
    }

//                showDataView(false)
//                status.errorCode?.let { recipesListViewModel.showToastMessage(it)


    override fun onResume() {
        super.onResume()
        val userId = Hawk.get<String>(USER_ID, "")
        if (userId.isNotEmpty()) {
            mainViewModel.getResultGuess(userId)
        }
        listDatesOnl = Hawk.get<ArrayList<String>>(LIST_DATES, ArrayList())
        listMatchgOnl = Hawk.get<java.util.ArrayList<Match>>(LIST_MATCHS, java.util.ArrayList())
        if (listMatchgOnl.size > 0) {
            mainViewModel.nextPageHistoryMatch.value = 0
            mainViewModel.getHistoryMatchViaID(userId)
        } else {
            binding.layoutLoading.root.visibility = View.GONE
            binding.noItem.visibility = View.VISIBLE
            binding.rcvList.visibility = View.INVISIBLE
        }
    }

    /**
     *
     */
    private fun handleResultGuess(status: Resource<ResponseResultGuess>) {
        when (status) {
            is Resource.Loading -> {
            }
            is Resource.Success -> status.data?.let { bindResultGuess(result = it) }
            is Resource.DataError -> {
                status.errorCode?.let {  }
            }
        }
    }

    private fun showLoadingView() {
        binding.layoutLoading.root.visibility = View.VISIBLE
        binding.noItem.visibility = View.INVISIBLE
        binding.rcvList.visibility = View.INVISIBLE
    }

    private fun bindListData(historyMatchs: ResponseHistoryMatch) {
        if (historyMatchs.data != null) {
            if (mainViewModel.nextPageHighlight.value == 0) {
                if (historyMatchs.data.isEmpty()) {
                    binding.layoutLoading.root.visibility = View.GONE
                    binding.noItem.visibility = View.VISIBLE
                    binding.rcvList.visibility = View.INVISIBLE
                    return
                }
                adapter.list = listOf()
            }
            mainViewModel.nextPageHistoryMatch.value = mainViewModel.nextPageHistoryMatch.value!! + 1
            mainViewModel.maxPageHistoryMatch.value = historyMatchs.myPage?.totalPages ?: 0
            lifecycleScope.launch(Dispatchers.IO) {
                val temp = arrayListOf<MyHistoryMatch>()
                temp.addAll(adapter.list)
                if (temp.size > 0 && temp.last().historyMatch.id == null && temp.last().historyMatch.time == null) temp.removeLast()

                val listFolderDate = arrayListOf<MyFolderDate>()
                historyMatchs.data.forEach {
                    val pos = checkDate(
                        it, listFolderDate
                    )
                    if (pos >= 0) {
                        listFolderDate[pos].list.add(it)
                    } else {
                        val folder = MyFolderDate(
                            title = getNameDate(it.time!!), list = arrayListOf()
                        )
                        folder.list.add(it)
                        listFolderDate.add(folder)
                    }
                }

                val listMyHistoryMatch = arrayListOf<MyHistoryMatch>()
                listFolderDate.forEach {
                    val title = MyHistoryMatch()
                    title.historyMatch.time = it.title
                    if (!adapter.list.contains(title)) {
                        listMyHistoryMatch.add(title)
                    }

                    it.list.forEach { historyMatch ->
                        val match = listMatchgOnl.filter { it.id == historyMatch.matchId }[0]
                        listMyHistoryMatch.add(
                            MyHistoryMatch(
                                historyMatch = historyMatch, match = match
                            )
                        )
                    }
                }

                temp.addAll(listMyHistoryMatch)
                if (mainViewModel.nextPageHighlight.value!! == mainViewModel.maxPageHighlight.value!!) {
                    adapter.isLoadMore = false
                } else {
                    temp.add(MyHistoryMatch())
                    adapter.isLoadMore = true
                }
                withContext(Dispatchers.Main) {
                    binding.layoutLoading.root.visibility = View.GONE
                    binding.noItem.visibility = View.INVISIBLE
                    binding.rcvList.visibility = View.VISIBLE

                    adapter.updateData(temp)
                }
            }
        } else {
            Log.d("ntduc_debug", "bindListData: data null")
        }
    }

    private fun checkDate(
        historyMatch: HistoryMatch, listFolderDate: ArrayList<MyFolderDate>
    ): Int {
        for (i in listFolderDate.indices) {
            if (getNameDate(historyMatch.time!!) == listFolderDate[i].title) {
                return i
            }
        }
        return -1
    }

    private fun getNameDate(time: String): String {
        val t = UtilsKotlin().parseTime(time)
        val calendar = Calendar.getInstance().apply {
            timeInMillis = t
        }
        val month = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH)
        val day = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH)
        val date = calendar[Calendar.DAY_OF_MONTH]
        val year = calendar[Calendar.YEAR]
        val trueTime = "$day, $date $month $year "
        return trueTime
    }


    data class MyFolderDate(
        var title: String, var list: ArrayList<HistoryMatch> = arrayListOf()
    )

    private fun bindResultGuess(result: ResponseResultGuess) {
        binding.tv45.text = String.format(getString(R.string.predicted_number_of_matches_empty), result.data.total)
        binding.tv76.text = String.format(getString(R.string.number_of_correct_guesses_empty), result.data.rightCount)
        binding.Numere.text = String.format(getString(R.string.number_of_wrong_guesses_empty), result.data.wrongCount)
        if (result.data.total > 0) {
            binding.textView6.text = String.format(getString(R.string.odds_of_guessing_correctly_empty), result.data.rightCount / result.data.total)
        } else {
            binding.textView6.text = String.format(getString(R.string.odds_of_guessing_correctly_empty), getString(R.string.empty))
        }


    }

}
