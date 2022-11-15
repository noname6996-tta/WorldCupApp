package com.example.worldcup2022.model;

import com.google.gson.annotations.SerializedName;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0011H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\u008b\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010D\u001a\u00020\u0011H\u00d6\u0001J\t\u0010E\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001e\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0018\"\u0004\b(\u0010\u001aR\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001a\u00a8\u0006F"}, d2 = {"Lcom/example/worldcup2022/model/ResponeMatch;", "", "id", "", "country1", "Lcom/example/worldcup2022/model/ResponseCountry;", "country1Name", "country2", "country2Name", "group", "date", "time", "goal", "history", "country1Goal", "country2Goal", "importId", "", "(Ljava/lang/String;Lcom/example/worldcup2022/model/ResponseCountry;Lcom/example/worldcup2022/model/ResponseCountry;Lcom/example/worldcup2022/model/ResponseCountry;Lcom/example/worldcup2022/model/ResponseCountry;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getCountry1", "()Lcom/example/worldcup2022/model/ResponseCountry;", "setCountry1", "(Lcom/example/worldcup2022/model/ResponseCountry;)V", "getCountry1Goal", "()Ljava/lang/String;", "setCountry1Goal", "(Ljava/lang/String;)V", "getCountry1Name", "setCountry1Name", "getCountry2", "setCountry2", "getCountry2Goal", "setCountry2Goal", "getCountry2Name", "setCountry2Name", "getDate", "setDate", "getGoal", "setGoal", "getGroup", "setGroup", "getHistory", "setHistory", "getId", "setId", "getImportId", "()I", "setImportId", "(I)V", "getTime", "setTime", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class ResponeMatch {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "id")
    private java.lang.String id;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "country1")
    private com.example.worldcup2022.model.ResponseCountry country1;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "country1Name")
    private com.example.worldcup2022.model.ResponseCountry country1Name;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "country2")
    private com.example.worldcup2022.model.ResponseCountry country2;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "country2Name")
    private com.example.worldcup2022.model.ResponseCountry country2Name;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "group")
    private java.lang.String group;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "date")
    private java.lang.String date;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "time")
    private java.lang.String time;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "goal")
    private java.lang.String goal;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "history")
    private java.lang.String history;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "country1Goal")
    private java.lang.String country1Goal;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "country2Goal")
    private java.lang.String country2Goal;
    @com.google.gson.annotations.SerializedName(value = "importId")
    private int importId;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.model.ResponeMatch copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.model.ResponseCountry country1, @org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.model.ResponseCountry country1Name, @org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.model.ResponseCountry country2, @org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.model.ResponseCountry country2Name, @org.jetbrains.annotations.NotNull()
    java.lang.String group, @org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String time, @org.jetbrains.annotations.NotNull()
    java.lang.String goal, @org.jetbrains.annotations.NotNull()
    java.lang.String history, @org.jetbrains.annotations.NotNull()
    java.lang.String country1Goal, @org.jetbrains.annotations.NotNull()
    java.lang.String country2Goal, int importId) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ResponeMatch(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.model.ResponseCountry country1, @org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.model.ResponseCountry country1Name, @org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.model.ResponseCountry country2, @org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.model.ResponseCountry country2Name, @org.jetbrains.annotations.NotNull()
    java.lang.String group, @org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String time, @org.jetbrains.annotations.NotNull()
    java.lang.String goal, @org.jetbrains.annotations.NotNull()
    java.lang.String history, @org.jetbrains.annotations.NotNull()
    java.lang.String country1Goal, @org.jetbrains.annotations.NotNull()
    java.lang.String country2Goal, int importId) {
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
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.model.ResponseCountry component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.model.ResponseCountry getCountry1() {
        return null;
    }
    
    public final void setCountry1(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.model.ResponseCountry p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.model.ResponseCountry component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.model.ResponseCountry getCountry1Name() {
        return null;
    }
    
    public final void setCountry1Name(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.model.ResponseCountry p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.model.ResponseCountry component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.model.ResponseCountry getCountry2() {
        return null;
    }
    
    public final void setCountry2(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.model.ResponseCountry p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.model.ResponseCountry component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.model.ResponseCountry getCountry2Name() {
        return null;
    }
    
    public final void setCountry2Name(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.model.ResponseCountry p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGroup() {
        return null;
    }
    
    public final void setGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTime() {
        return null;
    }
    
    public final void setTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGoal() {
        return null;
    }
    
    public final void setGoal(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHistory() {
        return null;
    }
    
    public final void setHistory(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountry1Goal() {
        return null;
    }
    
    public final void setCountry1Goal(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountry2Goal() {
        return null;
    }
    
    public final void setCountry2Goal(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int getImportId() {
        return 0;
    }
    
    public final void setImportId(int p0) {
    }
}