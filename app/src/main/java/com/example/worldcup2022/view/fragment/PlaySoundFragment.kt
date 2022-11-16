package com.example.worldcup2022.view.fragment

import android.content.ContentValues.TAG
import android.content.Context
import android.media.AudioManager
import android.media.MediaPlayer
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.worldcup2022.R
import com.example.worldcup2022.data.dto.worldcup.Sound
import com.example.worldcup2022.databinding.FragmentPlaySoundBinding
import com.example.worldcup2022.ui.component.main.MainNewActivity

import com.proxglobal.worlcupapp.base.BaseFragment
import java.io.IOException


class PlaySoundFragment : BaseFragment<FragmentPlaySoundBinding>() {
    companion object {
        lateinit var sound: Sound
    }
    lateinit var anima : Animation
    val args: PlaySoundFragmentArgs by navArgs()
    lateinit var mediaPlayer: MediaPlayer
    lateinit var audioManager: AudioManager
    override fun getDataBinding(): FragmentPlaySoundBinding {
        return FragmentPlaySoundBinding.inflate(layoutInflater)
    }

    override fun initView() {
        super.initView()
        MainNewActivity.binding.bottomMain.visibility = View.GONE
    }
    override fun initData() {
        super.initData()
        val isInternet = args.isInternet
        if (isInternet==2){
            mediaPlayer = MediaPlayer.create(requireContext(), com.example.worldcup2022.R.raw.drum_sound)
        } else if (isInternet==1) {
            mediaPlayer = MediaPlayer()
            mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC)
            try {
                mediaPlayer.setDataSource(sound.sound)
                mediaPlayer.prepare()
                binding.tvNameSound.text = sound.name+"  "
                Glide.with(requireContext()).load(sound.image)
                    .error(R.drawable.ic_launcher_background).placeholder(R.drawable.ic_launcher_background)
                    .into(binding.imgPlay)
            } catch (e: IOException) {
                e.printStackTrace()
            }
            Log.v(TAG,"Music is streaming")
        }

    }

    override fun addEvent() {
        super.addEvent()
        binding.viewBack.setOnClickListener {
            MainNewActivity.binding.bottomMain.visibility = View.VISIBLE
            findNavController().navigateUp()
        }
        binding.imgPlay.setOnPressListener(
            onPress = {
                playMusic()
                mediaPlayer.isLooping = true;
                anima.repeatCount = 100000
            },
            onRelease = {
                stopPlayMusic()
            }
        )
        eventSeekBar()

    }

    private fun playMusic() {
        mediaPlayer.start()
        anima = AnimationUtils.loadAnimation(requireContext(),R.anim.zoom_in)
        anima.repeatCount = Animation.INFINITE;
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