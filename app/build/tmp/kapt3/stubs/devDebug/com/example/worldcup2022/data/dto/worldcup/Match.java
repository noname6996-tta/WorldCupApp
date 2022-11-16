package com.example.worldcup2022.data.dto.worldcup;

import android.os.Parcelable;
import com.squareup.moshi.Json;
import kotlinx.android.parcel.Parcelize;

/**
 * Created by TruyenDev on 14/11/2022.
 */
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b=\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00d1\u0001\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0003\u0010\f\u001a\u00020\u0003\u0012\b\b\u0003\u0010\r\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0018\u001a\u00020\u0015\u0012\b\b\u0003\u0010\u0019\u001a\u00020\u0015\u0012\b\b\u0003\u0010\u001a\u001a\u00020\u0015\u00a2\u0006\u0002\u0010\u001bJ\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0011H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0015H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u0015H\u00c6\u0003J\t\u0010F\u001a\u00020\u0015H\u00c6\u0003J\t\u0010G\u001a\u00020\u0005H\u00c6\u0003J\t\u0010H\u001a\u00020\u0015H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\u0003H\u00c6\u0003J\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\t\u0010O\u001a\u00020\u0003H\u00c6\u0003J\u00d5\u0001\u0010P\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010\u0012\u001a\u00020\u00032\b\b\u0003\u0010\u0013\u001a\u00020\u00032\b\b\u0003\u0010\u0014\u001a\u00020\u00152\b\b\u0003\u0010\u0016\u001a\u00020\u00032\b\b\u0003\u0010\u0017\u001a\u00020\u00032\b\b\u0003\u0010\u0018\u001a\u00020\u00152\b\b\u0003\u0010\u0019\u001a\u00020\u00152\b\b\u0003\u0010\u001a\u001a\u00020\u0015H\u00c6\u0001J\t\u0010Q\u001a\u00020\u0015H\u00d6\u0001J\u0013\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010UH\u00d6\u0003J\t\u0010V\u001a\u00020\u0015H\u00d6\u0001J\t\u0010W\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\u0015H\u00d6\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001d\"\u0004\b$\u0010\u001fR\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u001a\u0010\u001a\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010\u0018\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00101\"\u0004\b5\u00103R\u001a\u0010\u0019\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00101\"\u0004\b7\u00103R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00101R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010!\u00a8\u0006]"}, d2 = {"Lcom/example/worldcup2022/data/dto/worldcup/Match;", "Landroid/os/Parcelable;", "id", "", "createdAt", "", "country1", "Lcom/example/worldcup2022/data/dto/worldcup/Country;", "country1Name", "country2", "country2Name", "group", "date", "dateTime", "dateFormat", "time", "stadium", "Lcom/example/worldcup2022/data/dto/worldcup/Stadium;", "goal", "history", "importId", "", "country1Goal", "country2Goal", "idcountry1", "idcountry2", "idStadium", "(Ljava/lang/String;JLcom/example/worldcup2022/data/dto/worldcup/Country;Ljava/lang/String;Lcom/example/worldcup2022/data/dto/worldcup/Country;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/example/worldcup2022/data/dto/worldcup/Stadium;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;III)V", "getCountry1", "()Lcom/example/worldcup2022/data/dto/worldcup/Country;", "setCountry1", "(Lcom/example/worldcup2022/data/dto/worldcup/Country;)V", "getCountry1Goal", "()Ljava/lang/String;", "getCountry1Name", "getCountry2", "setCountry2", "getCountry2Goal", "getCountry2Name", "getCreatedAt", "()J", "getDate", "getDateFormat", "getDateTime", "getGoal", "getGroup", "getHistory", "getId", "getIdStadium", "()I", "setIdStadium", "(I)V", "getIdcountry1", "setIdcountry1", "getIdcountry2", "setIdcountry2", "getImportId", "getStadium", "()Lcom/example/worldcup2022/data/dto/worldcup/Stadium;", "getTime", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_devDebug"})
public final class Match implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    private final long createdAt = 0L;
    @org.jetbrains.annotations.Nullable()
    private com.example.worldcup2022.data.dto.worldcup.Country country1;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String country1Name = null;
    @org.jetbrains.annotations.Nullable()
    private com.example.worldcup2022.data.dto.worldcup.Country country2;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String country2Name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String group = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String date = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String dateTime = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String dateFormat = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String time = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.worldcup2022.data.dto.worldcup.Stadium stadium = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String goal = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String history = null;
    private final int importId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String country1Goal = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String country2Goal = null;
    private int idcountry1;
    private int idcountry2;
    private int idStadium;
    public static final android.os.Parcelable.Creator<com.example.worldcup2022.data.dto.worldcup.Match> CREATOR = null;
    
    /**
     * Created by TruyenDev on 14/11/2022.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.data.dto.worldcup.Match copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "id")
    java.lang.String id, @com.squareup.moshi.Json(name = "createdAt")
    long createdAt, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "country1")
    com.example.worldcup2022.data.dto.worldcup.Country country1, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "country1Name")
    java.lang.String country1Name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "country2")
    com.example.worldcup2022.data.dto.worldcup.Country country2, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "country2Name")
    java.lang.String country2Name, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "group")
    java.lang.String group, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "date")
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "dateTime")
    java.lang.String dateTime, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "dateFormat")
    java.lang.String dateFormat, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "time")
    java.lang.String time, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "stadium")
    com.example.worldcup2022.data.dto.worldcup.Stadium stadium, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "goal")
    java.lang.String goal, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "history")
    java.lang.String history, @com.squareup.moshi.Json(name = "importId")
    int importId, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "country1Goal")
    java.lang.String country1Goal, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "country2Goal")
    java.lang.String country2Goal, @com.squareup.moshi.Json(name = "idcountry1")
    int idcountry1, @com.squareup.moshi.Json(name = "idcountry2")
    int idcountry2, @com.squareup.moshi.Json(name = "idStadium")
    int idStadium) {
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
    
    public Match() {
        super();
    }
    
    public Match(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "id")
    java.lang.String id, @com.squareup.moshi.Json(name = "createdAt")
    long createdAt, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "country1")
    com.example.worldcup2022.data.dto.worldcup.Country country1, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "country1Name")
    java.lang.String country1Name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "country2")
    com.example.worldcup2022.data.dto.worldcup.Country country2, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "country2Name")
    java.lang.String country2Name, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "group")
    java.lang.String group, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "date")
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "dateTime")
    java.lang.String dateTime, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "dateFormat")
    java.lang.String dateFormat, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "time")
    java.lang.String time, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "stadium")
    com.example.worldcup2022.data.dto.worldcup.Stadium stadium, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "goal")
    java.lang.String goal, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "history")
    java.lang.String history, @com.squareup.moshi.Json(name = "importId")
    int importId, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "country1Goal")
    java.lang.String country1Goal, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "country2Goal")
    java.lang.String country2Goal, @com.squareup.moshi.Json(name = "idcountry1")
    int idcountry1, @com.squareup.moshi.Json(name = "idcountry2")
    int idcountry2, @com.squareup.moshi.Json(name = "idStadium")
    int idStadium) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long getCreatedAt() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.worldcup2022.data.dto.worldcup.Country component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.worldcup2022.data.dto.worldcup.Country getCountry1() {
        return null;
    }
    
    public final void setCountry1(@org.jetbrains.annotations.Nullable()
    com.example.worldcup2022.data.dto.worldcup.Country p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountry1Name() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.worldcup2022.data.dto.worldcup.Country component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.worldcup2022.data.dto.worldcup.Country getCountry2() {
        return null;
    }
    
    public final void setCountry2(@org.jetbrains.annotations.Nullable()
    com.example.worldcup2022.data.dto.worldcup.Country p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountry2Name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGroup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateFormat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.data.dto.worldcup.Stadium component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.data.dto.worldcup.Stadium getStadium() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGoal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHistory() {
        return null;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int getImportId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountry1Goal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountry2Goal() {
        return null;
    }
    
    public final int component18() {
        return 0;
    }
    
    public final int getIdcountry1() {
        return 0;
    }
    
    public final void setIdcountry1(int p0) {
    }
    
    public final int component19() {
        return 0;
    }
    
    public final int getIdcountry2() {
        return 0;
    }
    
    public final void setIdcountry2(int p0) {
    }
    
    public final int component20() {
        return 0;
    }
    
    public final int getIdStadium() {
        return 0;
    }
    
    public final void setIdStadium(int p0) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.example.worldcup2022.data.dto.worldcup.Match> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.worldcup2022.data.dto.worldcup.Match createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.worldcup2022.data.dto.worldcup.Match[] newArray(int size) {
            return null;
        }
    }
}