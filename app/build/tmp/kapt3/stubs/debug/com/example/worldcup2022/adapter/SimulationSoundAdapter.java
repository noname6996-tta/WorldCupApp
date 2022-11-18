package com.example.worldcup2022.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.worldcup2022.R;
import com.example.worldcup2022.data.dto.worldcup.Sound;
import com.example.worldcup2022.databinding.ItemSoundBinding;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J \u0010\u0016\u001a\u00020\n2\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007J\u001c\u0010\u0018\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/worldcup2022/adapter/SimulationSoundAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/worldcup2022/adapter/SimulationSoundViewHolder;", "()V", "context", "Landroid/content/Context;", "onClickSound", "Lkotlin/Function2;", "Lcom/example/worldcup2022/data/dto/worldcup/Sound;", "", "", "sounds", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setClickShowMatch", "sound", "setListSound", "app_debug"})
public final class SimulationSoundAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.worldcup2022.adapter.SimulationSoundViewHolder> {
    private java.util.List<com.example.worldcup2022.data.dto.worldcup.Sound> sounds;
    private android.content.Context context;
    private kotlin.jvm.functions.Function2<? super com.example.worldcup2022.data.dto.worldcup.Sound, ? super java.lang.Boolean, kotlin.Unit> onClickSound;
    
    public SimulationSoundAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.worldcup2022.adapter.SimulationSoundViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void setListSound(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.worldcup2022.data.dto.worldcup.Sound> sounds, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void setClickShowMatch(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.example.worldcup2022.data.dto.worldcup.Sound, ? super java.lang.Boolean, kotlin.Unit> sound) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.adapter.SimulationSoundViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
}