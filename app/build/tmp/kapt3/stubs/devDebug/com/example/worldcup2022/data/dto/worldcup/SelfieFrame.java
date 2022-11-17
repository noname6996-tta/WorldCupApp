package com.example.worldcup2022.data.dto.worldcup;

import android.os.Parcelable;
import com.squareup.moshi.Json;
import kotlinx.parcelize.Parcelize;

@kotlinx.parcelize.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0003\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019H\u00d6\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011\u00a8\u0006\u001f"}, d2 = {"Lcom/example/worldcup2022/data/dto/worldcup/SelfieFrame;", "Landroid/os/Parcelable;", "id", "", "createAt", "", "name", "group", "linkImage", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreateAt", "()J", "setCreateAt", "(J)V", "getGroup", "()Ljava/lang/String;", "setGroup", "(Ljava/lang/String;)V", "getId", "setId", "getLinkImage", "setLinkImage", "getName", "setName", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_devDebug"})
public final class SelfieFrame implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String id;
    private long createAt;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String group;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String linkImage;
    public static final android.os.Parcelable.Creator<com.example.worldcup2022.data.dto.worldcup.SelfieFrame> CREATOR = null;
    
    public SelfieFrame() {
        super();
    }
    
    public SelfieFrame(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "id")
    java.lang.String id, @com.squareup.moshi.Json(name = "createAt")
    long createAt, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "group")
    java.lang.String group, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "image")
    java.lang.String linkImage) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getCreateAt() {
        return 0L;
    }
    
    public final void setCreateAt(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGroup() {
        return null;
    }
    
    public final void setGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLinkImage() {
        return null;
    }
    
    public final void setLinkImage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.example.worldcup2022.data.dto.worldcup.SelfieFrame> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.worldcup2022.data.dto.worldcup.SelfieFrame createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.worldcup2022.data.dto.worldcup.SelfieFrame[] newArray(int size) {
            return null;
        }
    }
}