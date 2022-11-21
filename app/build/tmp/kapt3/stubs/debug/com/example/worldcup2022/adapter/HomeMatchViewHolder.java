package com.example.worldcup2022.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.worldcup2022.R;
import com.example.worldcup2022.data.dto.worldcup.Country;
import com.example.worldcup2022.data.dto.worldcup.Match;
import com.example.worldcup2022.data.dto.worldcup.Stadium;
import com.example.worldcup2022.databinding.ItemMatchBinding;
import com.example.worldcup2022.databinding.ItemNativeAdsBinding;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/worldcup2022/adapter/HomeMatchViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/worldcup2022/databinding/ItemMatchBinding;", "(Lcom/example/worldcup2022/databinding/ItemMatchBinding;)V", "getBinding", "()Lcom/example/worldcup2022/databinding/ItemMatchBinding;", "app_debug"})
public final class HomeMatchViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.NotNull()
    private final com.example.worldcup2022.databinding.ItemMatchBinding binding = null;
    
    public HomeMatchViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.databinding.ItemMatchBinding binding) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.databinding.ItemMatchBinding getBinding() {
        return null;
    }
}