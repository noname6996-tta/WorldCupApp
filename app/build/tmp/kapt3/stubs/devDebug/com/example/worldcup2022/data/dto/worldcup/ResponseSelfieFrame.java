package com.example.worldcup2022.data.dto.worldcup;

import com.squareup.moshi.Json;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/example/worldcup2022/data/dto/worldcup/ResponseSelfieFrame;", "", "status", "", "code", "", "data", "", "Lcom/example/worldcup2022/data/dto/worldcup/SelfieFrame;", "(Ljava/lang/String;ILjava/util/List;)V", "getCode", "()I", "getData", "()Ljava/util/List;", "getStatus", "()Ljava/lang/String;", "app_devDebug"})
public final class ResponseSelfieFrame {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    private final int code = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.worldcup2022.data.dto.worldcup.SelfieFrame> data = null;
    
    public ResponseSelfieFrame() {
        super();
    }
    
    public ResponseSelfieFrame(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String status, @com.squareup.moshi.Json(name = "code")
    int code, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "data")
    java.util.List<com.example.worldcup2022.data.dto.worldcup.SelfieFrame> data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final int getCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.worldcup2022.data.dto.worldcup.SelfieFrame> getData() {
        return null;
    }
}