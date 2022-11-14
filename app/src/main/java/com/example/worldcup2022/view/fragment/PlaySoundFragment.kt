package com.example.worldcup2022.view.fragment

import android.content.Context
import android.media.AudioManager
import android.media.MediaPlayer
import android.view.MotionEvent
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import androidx.navigation.fragment.findNavController
import com.example.worldcup2022.R
import com.example.worldcup2022.databinding.FragmentPlaySoundBinding
import com.example.worldcup2022.view.activity.MainActivity
import com.proxglobal.worlcupapp.base.BaseFragment


class PlaySoundFragment : BaseFragment<FragmentPlaySoundBinding>() {
    lateinit var mediaPlayer: MediaPlayer
    lateinit var audioManager: AudioManager
    override fun getDataBinding(): FragmentPlaySoundBinding {
        return FragmentPlaySoundBinding.inflate(layoutInflater)
    }

    override fun initView() {
        super.initView()
        MainActivity.binding.bottomMain.visibility = View.GONE
    }
    override fun initData() {
        super.initData()
        mediaPlayer = MediaPlayer.create(requireContext(), com.example.worldcup2022.R.raw.drum_sound)
    }

    override fun addEvent() {
        super.addEvent()
        binding.viewBack.setOnClickListener {
            MainActivity.binding.bottomMain.visibility = View.VISIBLE
            findNavController().navigateUp()
        }
        binding.imgPlay.setOnPressListener(
            onPress = {
                playMusic()
            },
            onRelease = {
                stopPlayMusic()
            }
        )
        eventSeekBar()

    }

    private fun playMusic() {
        mediaPlayer.start()
        var anima = AnimationUtils.loadAnimation(requireContext(),R.anim.zoom_in)
        binding.imgPlay.startAnimation(anima)
    }

    private fun stopPlayMusic() {
        mediaPlayer.pause()
    }

    fun View.setOnPressListener(
        onPress: (view: View) -> Unit,
        onRelease: (view: View) -> Unit
    ) {
        setOnTouchListener { v, event ->
            when (event.actionMasked) {
                MotionEvent.ACTION_DOWN -> {
                    onPress(v)
                }
                MotionEvent.ACTION_UP -> {
                    onRelease(v)
                }
            }
            false
        }
    }

    private fun eventSeekBar(){
        try {
            audioManager = requireActivity().getSystemService(Context.AUDIO_SERVICE) as AudioManager
            binding.seekBar.setMax(
                audioManager
                    .getStreamMaxVolume(AudioManager.STREAM_MUSIC)
            )
            binding.seekBar.setProgress(
                audioManager
                    .getStreamVolume(AudioManager.STREAM_MUSIC)
            )


            binding.seekBar.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
                override fun onStopTrackingTouch(arg0: SeekBar) {}
                override fun onStartTrackingTouch(arg0: SeekBar) {}
                override fun onProgressChanged(arg0: SeekBar, progress: Int, arg2: Boolean) {
                    audioManager.setStreamVolume(
                        AudioManager.STREAM_MUSIC,
                        progress, 0
                    )
                }
            })

        } catch (e : java.lang.Exception){
            e.printStackTrace()
        }


    }
}