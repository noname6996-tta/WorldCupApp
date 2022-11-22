package com.example.worldcup2022.data.dto.worldcup;

import android.os.Parcelable;
import com.squareup.moshi.Json;
import kotlinx.android.parcel.Parcelize;

/**
 * Created by TruyenDev on 14/11/2022.
 */
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001f"}, d2 = {"Lcom/example/worldcup2022/data/dto/worldcup/ResponseResultGuess;", "Landroid/os/Parcelable;", "status", "", "code", "", "data", "Lcom/example/worldcup2022/data/dto/worldcup/ResultGuess;", "(Ljava/lang/String;ILcom/example/worldcup2022/data/dto/worldcup/ResultGuess;)V", "getCode", "()I", "getData", "()Lcom/example/worldcup2022/data/dto/worldcup/ResultGuess;", "getStatus", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class ResponseResultGuess implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    private final int code = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.example.worldcup2022.data.dto.worldcup.ResultGuess data = null;
    public static final android.os.Parcelable.Creator<com.example.worldcup2022.data.dto.worldcup.ResponseResultGuess> CREATOR = null;
    
    /**
     * Created by TruyenDev on 14/11/2022.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.data.dto.worldcup.ResponseResultGuess copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String status, @com.squareup.moshi.Json(name = "code")
    int code, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "data")
    com.example.worldcup2022.data.dto.worldcup.ResultGuess data) {
        return null;
    }
    
    /**
     * Created by TruyenDev on 14/11/2022.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Created by TruyenDev on 14/11/2022.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Created by TruyenDev on 14/11/2022.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ResponseResultGuess() {
        super();
    }
    
    public ResponseResultGuess(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String status, @com.squareup.moshi.Json(name = "code")
    int code, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "data")
    com.example.worldcup2022.data.dto.worldcup.ResultGuess data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.data.dto.worldcup.ResultGuess component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.data.dto.worldcup.ResultGuess getData() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.example.worldcup2022.data.dto.worldcup.ResponseResultGuess> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.worldcup2022.data.dto.worldcup.ResponseResultGuess createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.worldcup2022.data.dto.worldcup.ResponseResultGuess[] newArray(int size) {
            return null;
        }
    }
}