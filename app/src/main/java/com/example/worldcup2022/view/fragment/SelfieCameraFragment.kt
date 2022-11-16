package com.example.worldcup2022.view.fragment

import android.Manifest
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.core.view.isVisible
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.example.worldcup2022.R
import com.example.worldcup2022.data.Resource
import com.example.worldcup2022.data.dto.worldcup.SelfieFrame
import com.example.worldcup2022.databinding.FragmentSelfieCameraBinding
import com.example.worldcup2022.databinding.ItemSelfieFrameBinding
import com.example.worldcup2022.ui.component.main.MainViewModel
import com.example.worldcup2022.utils.setOnClickListenerWithScaleAnimation
import com.permissionx.guolindev.PermissionX
import com.proxglobal.worlcupapp.base.BaseFragment

class SelfieCameraFragment : BaseFragment<FragmentSelfieCameraBinding>() {
    override fun getDataBinding(): FragmentSelfieCameraBinding {
        return FragmentSelfieCameraBinding.inflate(layoutInflater)
    }

    private val adapter by lazy { SelfieFrameAdapter {
        goToCameraFragment(it)
    } }
    private val mainViewModel by activityViewModels<MainViewModel>()

    override fun addObservers() {
        super.addObservers()
        mainViewModel.selfieFrames.observe(viewLifecycleOwner) {
            when (it) {
                is Resource.Success -> {
                    adapter.submitList(it.data!!.data)
                }
                else -> {

                }
            }
        }
    }

    override fun initView() {
        super.initView()
        binding.rvSelfieFrame.let {
            it.layoutManager = LinearLayoutManager(requireContext())
            it.adapter = adapter
        }
        requireActivity().findViewById<View>(R.id.bottomMain).isVisible = true
    }

    override fun initData() {
        super.initData()
        mainViewModel.getSelfieFrame()
    }

    private fun goToCameraFragment(item: SelfieFrame) {
        PermissionX.init(this).permissions(Manifest.permission.CAMERA)
            .request { allGranted, grantedList, deniedList ->
                if (allGranted) {
                    findNavController().navigate(
                        R.id.action_wcFunFragment_to_cameraFragment,
                        bundleOf("link" to item.linkImage),
                        navOptions {
                            anim {
                                enter = R.anim.slide_in_left
                            }
                        }
                    )
                }
            }
    }

    override fun onResume() {
        super.onResume()
    }
}

class SelfieFrameViewHolder(private val binding: ItemSelfieFrameBinding, private val onItemClick: (SelfieFrame) -> Unit) :
    RecyclerView.ViewHolder(binding.root) {
    fun bindData(item: SelfieFrame) {
//        binding.skeleton.showSkeleton()
        Glide.with(itemView)
            .load(item.linkImage)
//            .addListener(object : RequestListener<Drawable> {
//                override fun onLoadFailed(
//                    e: GlideException?,
//                    model: Any?,
//                    target: Target<Drawable>?,
//                    isFirstResource: Boolean
//                ): Boolean {
//                    return false
//                }
//
//                override fun onResourceReady(
//                    resource: Drawable?,
//                    model: Any?,
//                    target: Target<Drawable>?,
//                    dataSource: DataSource?,
//                    isFirstResource: Boolean
//                ): Boolean {
//                    binding.skeleton.showOriginal()
//                   return false
//                }
//
//            })
            .override(500,500)
            .into(binding.ivSelfieFrame)


        binding.ivSelfieFrame.setOnClickListener {
            onItemClick(item)
        }
    }
}

class SelfieFrameAdapter(private val onItemClick: (SelfieFrame) -> Unit) :
    ListAdapter<SelfieFrame, SelfieFrameViewHolder>(DIFF_CALLBACK) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelfieFrameViewHolder {
        val binding =
            ItemSelfieFrameBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SelfieFrameViewHolder(binding, onItemClick)
    }

    override fun onBindViewHolder(holder: SelfieFrameViewHolder, position: Int) {
        holder.bindData(getItem(position))
    }

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<SelfieFrame>() {
            override fun areContentsTheSame(oldItem: SelfieFrame, newItem: SelfieFrame): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areItemsTheSame(oldItem: SelfieFrame, newItem: SelfieFrame): Boolean {
                return oldItem.id == newItem.id
            }
        }
    }

}

