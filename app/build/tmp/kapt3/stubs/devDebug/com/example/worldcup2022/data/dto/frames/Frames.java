package com.example.worldcup2022.data.dto.frames;

import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlinx.android.parcel.Parcelize;

/**
 * Created by TruyenDev on 29/10/2022.
 */
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0003\u0010\b\u001a\u00020\t\u0012\b\b\u0003\u0010\n\u001a\u00020\u000b\u0012\b\b\u0003\u0010\f\u001a\u00020\u0003\u0012\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\tH\u00c6\u0003J\t\u0010$\u001a\u00020\u000bH\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0003Ji\u0010\'\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u00032\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0001J\t\u0010(\u001a\u00020\tH\u00d6\u0001J\u0013\u0010)\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010+H\u00d6\u0003J\t\u0010,\u001a\u00020\tH\u00d6\u0001J\t\u0010-\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u00063"}, d2 = {"Lcom/example/worldcup2022/data/dto/frames/Frames;", "Landroid/os/Parcelable;", "name", "", "name_vi", "folder", "icon", "cover", "totalImage", "", "lock", "", "openPackageName", "defines", "", "Lcom/example/worldcup2022/data/dto/frames/DefinesFrames;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/util/List;)V", "getCover", "()Ljava/lang/String;", "getDefines", "()Ljava/util/List;", "getFolder", "getIcon", "getLock", "()Z", "getName", "getName_vi", "getOpenPackageName", "getTotalImage", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_devDebug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Frames implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name_vi = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String folder = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String icon = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cover = null;
    private final int totalImage = 0;
    private final boolean lock = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String openPackageName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.worldcup2022.data.dto.frames.DefinesFrames> defines = null;
    public static final android.os.Parcelable.Creator<com.example.worldcup2022.data.dto.frames.Frames> CREATOR = null;
    
    /**
     * Created by TruyenDev on 29/10/2022.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.data.dto.frames.Frames copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "name_vi")
    java.lang.String name_vi, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "folder")
    java.lang.String folder, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "icon")
    java.lang.String icon, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "cover")
    java.lang.String cover, @com.squareup.moshi.Json(name = "totalImage")
    int totalImage, @com.squareup.moshi.Json(name = "lock")
    boolean lock, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "openPackageName")
    java.lang.String openPackageName, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "defines")
    java.util.List<com.example.worldcup2022.data.dto.frames.DefinesFrames> defines) {
        return null;
    }
    
    /**
     * Created by TruyenDev on 29/10/2022.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Created by TruyenDev on 29/10/2022.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Created by TruyenDev on 29/10/2022.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Frames() {
        super();
    }
    
    public Frames(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "name_vi")
    java.lang.String name_vi, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "folder")
    java.lang.String folder, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "icon")
    java.lang.String icon, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "cover")
    java.lang.String cover, @com.squareup.moshi.Json(name = "totalImage")
    int totalImage, @com.squareup.moshi.Json(name = "lock")
    boolean lock, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "openPackageName")
    java.lang.String openPackageName, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "defines")
    java.util.List<com.example.worldcup2022.data.dto.frames.DefinesFrames> defines) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName_vi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFolder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCover() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getTotalImage() {
        return 0;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getLock() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOpenPackageName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.worldcup2022.data.dto.frames.DefinesFrames> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.worldcup2022.data.dto.frames.DefinesFrames> getDefines() {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.example.worldcup2022.data.dto.frames.Frames> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.worldcup2022.data.dto.frames.Frames createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.worldcup2022.data.dto.frames.Frames[] newArray(int size) {
            return null;
        }
    }
}