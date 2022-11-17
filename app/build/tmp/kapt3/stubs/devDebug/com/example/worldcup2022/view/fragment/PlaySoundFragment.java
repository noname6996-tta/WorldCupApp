package com.example.worldcup2022.view.fragment;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.bumptech.glide.Glide;
import com.example.worldcup2022.R;
import com.example.worldcup2022.data.dto.worldcup.Sound;
import com.example.worldcup2022.databinding.FragmentPlaySoundBinding;
import com.example.worldcup2022.ui.component.main.MainNewActivity;
import com.proxglobal.worlcupapp.base.BaseFragment;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u0002H\u0016J\b\u0010 \u001a\u00020\u001dH\u0016J\b\u0010!\u001a\u00020\u001dH\u0016J\b\u0010\"\u001a\u00020\u001dH\u0002J\b\u0010#\u001a\u00020\u001dH\u0002JP\u0010$\u001a\u00020\u001d*\u00020%2!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110%\u00a2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u001d0\'2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110%\u00a2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0004\u0012\u00020\u001d0\'R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006-"}, d2 = {"Lcom/example/worldcup2022/view/fragment/PlaySoundFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentPlaySoundBinding;", "()V", "anima", "Landroid/view/animation/Animation;", "getAnima", "()Landroid/view/animation/Animation;", "setAnima", "(Landroid/view/animation/Animation;)V", "args", "Lcom/example/worldcup2022/view/fragment/PlaySoundFragmentArgs;", "getArgs", "()Lcom/example/worldcup2022/view/fragment/PlaySoundFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "audioManager", "Landroid/media/AudioManager;", "getAudioManager", "()Landroid/media/AudioManager;", "setAudioManager", "(Landroid/media/AudioManager;)V", "mediaPlayer", "Landroid/media/MediaPlayer;", "getMediaPlayer", "()Landroid/media/MediaPlayer;", "setMediaPlayer", "(Landroid/media/MediaPlayer;)V", "addEvent", "", "eventSeekBar", "getDataBinding", "initData", "initView", "playMusic", "stopPlayMusic", "setOnPressListener", "Landroid/view/View;", "onPress", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "view", "onRelease", "Companion", "app_devDebug"})
public final class PlaySoundFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentPlaySoundBinding> {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.worldcup2022.view.fragment.PlaySoundFragment.Companion Companion = null;
    public static com.example.worldcup2022.data.dto.worldcup.Sound sound;
    public android.view.animation.Animation anima;
    @org.jetbrains.annotations.NotNull()
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    public android.media.MediaPlayer mediaPlayer;
    public android.media.AudioManager audioManager;
    
    public PlaySoundFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.animation.Animation getAnima() {
        return null;
    }
    
    public final void setAnima(@org.jetbrains.annotations.NotNull()
    android.view.animation.Animation p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.view.fragment.PlaySoundFragmentArgs getArgs() {
        return null;
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/worldcup2022/view/fragment/PlaySoundFragment$Companion;", "", "()V", "sound", "Lcom/example/worldcup2022/data/dto/worldcup/Sound;", "getSound", "()Lcom/example/worldcup2022/data/dto/worldcup/Sound;", "setSound", "(Lcom/example/worldcup2022/data/dto/worldcup/Sound;)V", "app_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.worldcup2022.data.dto.worldcup.Sound getSound() {
            return null;
        }
        
        public final void setSound(@org.jetbrains.annotations.NotNull()
        com.example.worldcup2022.data.dto.worldcup.Sound p0) {
        }
    }
}