package com.example.worldcup2022.view.fragment;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.example.worldcup2022.R;
import com.example.worldcup2022.databinding.FragmentPlaySoundBinding;
import com.example.worldcup2022.ui.component.main.MainNewActivity;
import com.proxglobal.worlcupapp.base.BaseFragment;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002JP\u0010\u0018\u001a\u00020\u0011*\u00020\u00192!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0019\u00a2\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00110\u001b2!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u0019\u00a2\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00110\u001bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006 "}, d2 = {"Lcom/example/worldcup2022/view/fragment/PlaySoundFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentPlaySoundBinding;", "()V", "audioManager", "Landroid/media/AudioManager;", "getAudioManager", "()Landroid/media/AudioManager;", "setAudioManager", "(Landroid/media/AudioManager;)V", "mediaPlayer", "Landroid/media/MediaPlayer;", "getMediaPlayer", "()Landroid/media/MediaPlayer;", "setMediaPlayer", "(Landroid/media/MediaPlayer;)V", "addEvent", "", "eventSeekBar", "getDataBinding", "initData", "initView", "playMusic", "stopPlayMusic", "setOnPressListener", "Landroid/view/View;", "onPress", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "view", "onRelease", "app_devDebug"})
public final class PlaySoundFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentPlaySoundBinding> {
    public android.media.MediaPlayer mediaPlayer;
    public android.media.AudioManager audioManager;
    
    public PlaySoundFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.media.MediaPlayer getMediaPlayer() {
        return null;
    }
    
    public final void setMediaPlayer(@org.jetbrains.annotations.NotNull()
    android.media.MediaPlayer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.media.AudioManager getAudioManager() {
        return null;
    }
    
    public final void setAudioManager(@org.jetbrains.annotations.NotNull()
    android.media.AudioManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.worldcup2022.databinding.FragmentPlaySoundBinding getDataBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    @java.lang.Override()
    public void initData() {
    }
    
    @java.lang.Override()
    public void addEvent() {
    }
    
    private final void playMusic() {
    }
    
    private final void stopPlayMusic() {
    }
    
    public final void setOnPressListener(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setOnPressListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> onPress, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> onRelease) {
    }
    
    private final void eventSeekBar() {
    }
}