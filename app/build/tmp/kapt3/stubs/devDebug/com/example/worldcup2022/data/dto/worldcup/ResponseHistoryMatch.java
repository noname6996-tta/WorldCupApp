package com.example.worldcup2022.data.dto.worldcup;

import android.os.Parcelable;
import com.squareup.moshi.Json;
import kotlinx.android.parcel.Parcelize;

/**
 * Created by DucNT on 16/11/2022.
 */
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u00c6\u0003JD\u0010\u0019\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003J\t\u0010 \u001a\u00020\u0005H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\'"}, d2 = {"Lcom/example/worldcup2022/data/dto/worldcup/ResponseHistoryMatch;", "Landroid/os/Parcelable;", "status", "", "code", "", "data", "", "Lcom/example/worldcup2022/data/dto/worldcup/HistoryMatch;", "myPage", "Lcom/example/worldcup2022/data/dto/worldcup/MyPage;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/example/worldcup2022/data/dto/worldcup/MyPage;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getData", "()Ljava/util/List;", "getMyPage", "()Lcom/example/worldcup2022/data/dto/worldcup/MyPage;", "getStatus", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/example/worldcup2022/data/dto/worldcup/MyPage;)Lcom/example/worldcup2022/data/dto/worldcup/ResponseHistoryMatch;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_devDebug"})
public final class ResponseHistoryMatch implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer code = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.example.worldcup2022.data.dto.worldcup.HistoryMatch> data = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.worldcup2022.data.dto.worldcup.MyPage myPage = null;
    public static final android.os.Parcelable.Creator<com.example.worldcup2022.data.dto.worldcup.ResponseHistoryMatch> CREATOR = null;
    
    /**
     * Created by DucNT on 16/11/2022.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.data.dto.worldcup.ResponseHistoryMatch copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "code")
    java.lang.Integer code, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "data")
    java.util.List<com.example.worldcup2022.data.dto.worldcup.HistoryMatch> data, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "myPage")
    com.example.worldcup2022.data.dto.worldcup.MyPage myPage) {
        return null;
    }
    
    /**
     * Created by DucNT on 16/11/2022.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Created by DucNT on 16/11/2022.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Created by DucNT on 16/11/2022.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ResponseHistoryMatch() {
        super();
    }
    
    public ResponseHistoryMatch(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String status, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "code")
    java.lang.Integer code, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "data")
    java.util.List<com.example.worldcup2022.data.dto.worldcup.HistoryMatch> data, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "myPage")
    com.example.worldcup2022.data.dto.worldcup.MyPage myPage) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.worldcup2022.data.dto.worldcup.HistoryMatch> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.worldcup2022.data.dto.worldcup.HistoryMatch> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.worldcup2022.data.dto.worldcup.MyPage component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.worldcup2022.data.dto.worldcup.MyPage getMyPage() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.example.worldcup2022.data.dto.worldcup.ResponseHistoryMatch> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.worldcup2022.data.dto.worldcup.ResponseHistoryMatch createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.worldcup2022.data.dto.worldcup.ResponseHistoryMatch[] newArray(int size) {
            return null;
        }
    }
}