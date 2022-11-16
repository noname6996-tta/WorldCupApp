package com.example.worldcup2022.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u000f\u0010\u0011B\u001f\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u0012\u0013\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/example/worldcup2022/data/Resource;", "T", "", "data", "errorCode", "", "(Ljava/lang/Object;Ljava/lang/Integer;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "toString", "", "DataError", "Loading", "Success", "Lcom/example/worldcup2022/data/Resource$Success;", "Lcom/example/worldcup2022/data/Resource$Loading;", "Lcom/example/worldcup2022/data/Resource$DataError;", "app_devDebug"})
public abstract class Resource<T extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable()
    private final T data = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer errorCode = null;
    
    private Resource(T data, java.lang.Integer errorCode) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getErrorCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/worldcup2022/data/Resource$Success;", "T", "Lcom/example/worldcup2022/data/Resource;", "data", "(Ljava/lang/Object;)V", "app_devDebug"})
    public static final class Success<T extends java.lang.Object> extends com.example.worldcup2022.data.Resource<T> {
        
        public Success(T data) {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/worldcup2022/data/Resource$Loading;", "T", "Lcom/example/worldcup2022/data/Resource;", "data", "(Ljava/lang/Object;)V", "app_devDebug"})
    public static final class Loading<T extends java.lang.Object> extends com.example.worldcup2022.data.Resource<T> {
        
        public Loading() {
            super(null, null);
        }
        
        public Loading(@org.jetbrains.annotations.Nullable()
        T data) {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/worldcup2022/data/Resource$DataError;", "T", "Lcom/example/worldcup2022/data/Resource;", "errorCode", "", "(I)V", "app_devDebug"})
    public static final class DataError<T extends java.lang.Object> extends com.example.worldcup2022.data.Resource<T> {
        
        public DataError(int errorCode) {
            super(null, null);
        }
    }
}