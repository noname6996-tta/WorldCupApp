package com.example.worldcup2022.view.fragment

import android.content.Intent
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.view.inputmethod.EditorInfo
import androidx.core.net.toUri
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.worldcup2022.adapter.HighlightAdapter
import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.data.dto.worldcup.Highlight
import com.example.worldcup2022.data.dto.worldcup.ResponseHighlight
import com.example.worldcup2022.databinding.FragmentVideowcBinding
import com.example.worldcup2022.ui.component.main.MainViewModel
import com.example.worldcup2022.utils.observe
import com.ntduc.activityutils.hideKeyboard
import com.ntduc.videoplayer.video.player.VideoPlayerActivity
import com.proxglobal.worlcupapp.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@AndroidEntryPoint
class VideoWcFragment : BaseFragment<FragmentVideowcBinding>() {
    private val mainViewModel: MainViewModel by viewModels()
    private lateinit var adapter: HighlightAdapter

    override fun getDataBinding(): FragmentVideowcBinding {
        return FragmentVideowcBinding.inflate(layoutInflater)
    }

    override fun initView() {
        adapter = HighlightAdapter(requireContext())
        binding.rcvList.adapter = adapter

        val layoutManager =
            GridLayoutManager(requireContext(), 2, GridLayoutManager.VERTICAL, false)
        layoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                return if (adapter.getItemViewType(position) == HighlightAdapter.LOADING) {
                    2
                } else 1
            }
        }
        binding.rcvList.layoutManager = layoutManager
    }

    override fun addEvent() {
        binding.btnDeleteSearch.setOnClickListener {
            binding.edtSearch.setText("")
            requireActivity().hideKeyboard()
        }

        binding.edtSearch.setOnEditorActionListener { _, i, _ ->
            if (i == EditorInfo.IME_ACTION_SEARCH) {
                requireActivity().hideKeyboard()
                return@setOnEditorActionListener true
            }
            return@setOnEditorActionListener false
        }

        binding.edtSearch.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun afterTextChanged(s: Editable?) {}

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                binding.btnDeleteSearch.visibility = if (s.isEmpty()) View.GONE else View.VISIBLE

                mainViewModel.currentPageHighlight = 0
                mainViewModel.getHighlightsViaSearch(s, mainViewModel.currentPageHighlight)
            }
        })

        binding.rcvList.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                val grid = binding.rcvList.layoutManager as GridLayoutManager
                if (adapter.isLoadMore && grid.findLastCompletelyVisibleItemPosition() == adapter.list.size - 1) {
                    mainViewModel.loadMoreHighlights(binding.edtSearch.text, adapter.list)
                }
            }
        })

        adapter.setOnClickItemListener {
            val intentOpenVideo = Intent(requireContext(), VideoPlayerActivity::class.java)
            intentOpenVideo.setDataAndType(it.image?.toUri(), null)
            intentOpenVideo.putExtra(VideoPlayerActivity.API_TITLE, it.name)
            intentOpenVideo.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
            startActivity(intentOpenVideo)
        }
    }

    override fun addObservers() {
        observe(mainViewModel.highlightLiveData, ::handleHighlightsList)
    }

    override fun initData() {
        mainViewModel.currentPageHighlight = 0
        mainViewModel.getHighlightsViaSearch(
            binding.edtSearch.text,
            mainViewModel.currentPageHighlight
        )
    }

    private fun handleHighlightsList(status: Resource<ResponseHighlight>) {
        when (status) {
            is Resource.Loading -> {
                if (mainViewModel.currentPageHighlight == 0) {
                    showLoadingView()
                }
            }
            is Resource.Success -> status.data?.let { bindListData(highlights = it) }
            is Resource.DataError -> {
                status.errorCode?.let { Log.d("ntduc_debug", "handleHighlightsList: Error " + it) }

//                showDataView(false)
//                status.errorCode?.let { recipesListViewModel.showToastMessage(it)
            }
        }
    }

    private fun showLoadingView() {
        binding.layoutLoading.root.visibility = View.VISIBLE
        binding.noItem.visibility = View.INVISIBLE
        binding.rcvList.visibility = View.INVISIBLE
    }

    private fun bindListData(highlights: ResponseHighlight) {
        if (highlights.data != null) {
            if (mainViewModel.currentPageHighlight == 0) {
                if (highlights.data.isEmpty()) {
                    binding.layoutLoading.root.visibility = View.GONE
                    binding.noItem.visibility = View.VISIBLE
                    binding.rcvList.visibility = View.INVISIBLE
                    return
                }
                adapter.list = listOf()
            }

            lifecycleScope.launch(Dispatchers.IO) {
                mainViewModel.maxPageHighlight = highlights.myPage?.totalPages ?: 0
                val temp = arrayListOf<Highlight>()
                temp.addAll(adapter.list)
                if (temp.size > 0 && temp.last().id == null) temp.removeLast()
                temp.addAll(highlights.data)
                mainViewModel.currentPageHighlight++
                if (mainViewModel.currentPageHighlight == mainViewModel.maxPageHighlight) {
                    adapter.isLoadMore = false
                } else {
                    temp.add(Highlight())
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
}