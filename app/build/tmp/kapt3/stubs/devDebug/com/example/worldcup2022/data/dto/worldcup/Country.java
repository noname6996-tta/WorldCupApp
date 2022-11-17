package com.example.worldcup2022.data.dto.worldcup;

import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlinx.android.parcel.Parcelize;

/**
 * Created by TruyenDev on 14/11/2022.
 */
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B}\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0003\u0010\b\u001a\u00020\u0003\u0012\b\b\u0003\u0010\t\u001a\u00020\n\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n\u0012\b\b\u0003\u0010\f\u001a\u00020\n\u0012\b\b\u0003\u0010\r\u001a\u00020\n\u0012\b\b\u0003\u0010\u000e\u001a\u00020\n\u0012\b\b\u0003\u0010\u000f\u001a\u00020\n\u0012\b\b\u0003\u0010\u0010\u001a\u00020\n\u00a2\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\nH\u00d6\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015\u00a8\u0006\'"}, d2 = {"Lcom/example/worldcup2022/data/dto/worldcup/Country;", "Landroid/os/Parcelable;", "id", "", "createdAt", "", "name", "group", "image", "played", "", "won", "lost", "draw", "goalDifference", "point", "order", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIII)V", "getCreatedAt", "()J", "getDraw", "()I", "getGoalDifference", "getGroup", "()Ljava/lang/String;", "getId", "getImage", "getLost", "getName", "getOrder", "getPlayed", "getPoint", "getWon", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_devDebug"})
public final class Country implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    private final long createdAt = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String group = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String image = null;
    private final int played = 0;
    private final int won = 0;
    private final int lost = 0;
    private final int draw = 0;
    private final int goalDifference = 0;
    private final int point = 0;
    private final int order = 0;
    public static final android.os.Parcelable.Creator<com.example.worldcup2022.data.dto.worldcup.Country> CREATOR = null;
    
    public Country() {
        super();
    }
    
    public Country(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "id")
    java.lang.String id, @com.squareup.moshi.Json(name = "createdAt")
    long createdAt, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "group")
    java.lang.String group, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "image")
    java.lang.String image, @com.squareup.moshi.Json(name = "played")
    int played, @com.squareup.moshi.Json(name = "won")
    int won, @com.squareup.moshi.Json(name = "lost")
    int lost, @com.squareup.moshi.Json(name = "draw")
    int draw, @com.squareup.moshi.Json(name = "goalDifference")
    int goalDifference, @com.squareup.moshi.Json(name = "point")
    int point, @com.squareup.moshi.Json(name = "order")
    int order) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final long getCreatedAt() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGroup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImage() {
        return null;
    }
    
    public final int getPlayed() {
        return 0;
    }
    
    public final int getWon() {
        return 0;
    }
    
    public final int getLost() {
        return 0;
    }
    
    public final int getDraw() {
        return 0;
    }
    
    public final int getGoalDifference() {
        return 0;
    }
    
    public final int getPoint() {
        return 0;
    }
    
    public final int getOrder() {
        return 0;
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
    public static final class Creator implements android.os.Parcelable.Creator<com.example.worldcup2022.data.dto.worldcup.Country> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.worldcup2022.data.dto.worldcup.Country createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.worldcup2022.data.dto.worldcup.Country[] newArray(int size) {
            return null;
        }
    }
}