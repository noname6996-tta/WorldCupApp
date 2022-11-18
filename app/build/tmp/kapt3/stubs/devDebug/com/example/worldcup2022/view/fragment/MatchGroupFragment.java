package com.example.worldcup2022.view.fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.Glide;
import com.example.worldcup2022.R;
import com.example.worldcup2022.adapter.MatchGroupAdapter;
import com.example.worldcup2022.databinding.FragmentMatchGroupBinding;
import com.example.worldcup2022.data.dto.worldcup.Country;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.proxglobal.worlcupapp.base.BaseFragment;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/worldcup2022/view/fragment/MatchGroupFragment;", "Lcom/proxglobal/worlcupapp/base/BaseFragment;", "Lcom/example/worldcup2022/databinding/FragmentMatchGroupBinding;", "()V", "arrCountrys", "Ljava/util/ArrayList;", "Lcom/example/worldcup2022/data/dto/worldcup/Country;", "Lkotlin/collections/ArrayList;", "getArrCountrys", "()Ljava/util/ArrayList;", "setArrCountrys", "(Ljava/util/ArrayList;)V", "matchGroupAdapter", "Lcom/example/worldcup2022/adapter/MatchGroupAdapter;", "addEvent", "", "getDataBinding", "initData", "initView", "Companion", "app_devDebug"})
public final class MatchGroupFragment extends com.proxglobal.worlcupapp.base.BaseFragment<com.example.worldcup2022.databinding.FragmentMatchGroupBinding> {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.worldcup2022.view.fragment.MatchGroupFragment.Companion Companion = null;
    public static java.lang.String group;
    public java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> arrCountrys;
    private final com.example.worldcup2022.adapter.MatchGroupAdapter matchGroupAdapter = null;
    
    public MatchGroupFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> getArrCountrys() {
        return null;
    }
    
    public final void setArrCountrys(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.worldcup2022.data.dto.worldcup.Country> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.worldcup2022.databinding.FragmentMatchGroupBinding getDataBinding() {
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/worldcup2022/view/fragment/MatchGroupFragment$Companion;", "", "()V", "group", "", "getGroup", "()Ljava/lang/String;", "setGroup", "(Ljava/lang/String;)V", "app_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getGroup() {
            return null;
        }
        
        public final void setGroup(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
}