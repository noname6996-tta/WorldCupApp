package com.example.worldcup2022.data.remote.moshiFactories;

import com.squareup.moshi.*;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.AbstractMap.SimpleEntry;
import kotlin.collections.Map.Entry;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty1;

/**
 * This class encodes Kotlin classes using their properties. It decodes them by first invoking the
 * constructor, and then by setting any additional properties that exist, if any.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002\u001e\u001fB9\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u001c\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0015\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0016\u00a2\u0006\u0002\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016R\'\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006 "}, d2 = {"Lcom/example/worldcup2022/data/remote/moshiFactories/MyKotlinJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "constructor", "Lkotlin/reflect/KFunction;", "bindings", "", "Lcom/example/worldcup2022/data/remote/moshiFactories/MyKotlinJsonAdapter$Binding;", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "(Lkotlin/reflect/KFunction;Ljava/util/List;Lcom/squareup/moshi/JsonReader$Options;)V", "getBindings", "()Ljava/util/List;", "getConstructor", "()Lkotlin/reflect/KFunction;", "getOptions", "()Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V", "toString", "", "Binding", "IndexedParameterMap", "app_devDebug"})
public final class MyKotlinJsonAdapter<T extends java.lang.Object> extends com.squareup.moshi.JsonAdapter<T> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.reflect.KFunction<T> constructor = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.worldcup2022.data.remote.moshiFactories.MyKotlinJsonAdapter.Binding<T, java.lang.Object>> bindings = null;
    @org.jetbrains.annotations.NotNull()
    private final com.squareup.moshi.JsonReader.Options options = null;
    
    public MyKotlinJsonAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KFunction<? extends T> constructor, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.worldcup2022.data.remote.moshiFactories.MyKotlinJsonAdapter.Binding<T, java.lang.Object>> bindings, @org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader.Options options) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.reflect.KFunction<T> getConstructor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.worldcup2022.data.remote.moshiFactories.MyKotlinJsonAdapter.Binding<T, java.lang.Object>> getBindings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.squareup.moshi.JsonReader.Options getOptions() {
        return null;
    }
    
    @java.lang.Override()
    public T fromJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    @java.lang.Override()
    public void toJson(@org.jetbrains.annotations.NotNull()
    com.squareup.moshi.JsonWriter writer, @org.jetbrains.annotations.Nullable()
    T value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u0003B9\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007H\u00c6\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\tH\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003JQ\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\u0013\u0010\u001d\u001a\u00028\u00022\u0006\u0010\u001e\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u001fJ\t\u0010 \u001a\u00020!H\u00d6\u0001J\u001b\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00028\u0002\u00a2\u0006\u0002\u0010%J\t\u0010&\u001a\u00020\u0005H\u00d6\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\'"}, d2 = {"Lcom/example/worldcup2022/data/remote/moshiFactories/MyKotlinJsonAdapter$Binding;", "K", "P", "", "name", "", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "property", "Lkotlin/reflect/KProperty1;", "parameter", "Lkotlin/reflect/KParameter;", "(Ljava/lang/String;Lcom/squareup/moshi/JsonAdapter;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KParameter;)V", "getAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "getName", "()Ljava/lang/String;", "getParameter", "()Lkotlin/reflect/KParameter;", "getProperty", "()Lkotlin/reflect/KProperty1;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "get", "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "", "set", "", "result", "(Ljava/lang/Object;Ljava/lang/Object;)V", "toString", "app_devDebug"})
    public static final class Binding<K extends java.lang.Object, P extends java.lang.Object> {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull()
        private final com.squareup.moshi.JsonAdapter<P> adapter = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.reflect.KProperty1<K, P> property = null;
        @org.jetbrains.annotations.Nullable()
        private final kotlin.reflect.KParameter parameter = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.worldcup2022.data.remote.moshiFactories.MyKotlinJsonAdapter.Binding<K, P> copy(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        com.squareup.moshi.JsonAdapter<P> adapter, @org.jetbrains.annotations.NotNull()
        kotlin.reflect.KProperty1<K, ? extends P> property, @org.jetbrains.annotations.Nullable()
        kotlin.reflect.KParameter parameter) {
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
        
        public Binding(@org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        com.squareup.moshi.JsonAdapter<P> adapter, @org.jetbrains.annotations.NotNull()
        kotlin.reflect.KProperty1<K, ? extends P> property, @org.jetbrains.annotations.Nullable()
        kotlin.reflect.KParameter parameter) {
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
        public final com.squareup.moshi.JsonAdapter<P> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.squareup.moshi.JsonAdapter<P> getAdapter() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.reflect.KProperty1<K, P> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.reflect.KProperty1<K, P> getProperty() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.reflect.KParameter component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final kotlin.reflect.KParameter getParameter() {
            return null;
        }
        
        public final P get(K value) {
            return null;
        }
        
        public final void set(K result, P value) {
        }
    }
    
    /**
     * A simple [Map] that uses parameter indexes instead of sorting or hashing.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0096\u0002R(\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000b0\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0017"}, d2 = {"Lcom/example/worldcup2022/data/remote/moshiFactories/MyKotlinJsonAdapter$IndexedParameterMap;", "Lkotlin/collections/AbstractMap;", "Lkotlin/reflect/KParameter;", "", "parameterKeys", "", "parameterValues", "", "(Ljava/util/List;[Ljava/lang/Object;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "getParameterKeys", "()Ljava/util/List;", "getParameterValues", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "containsKey", "", "key", "get", "app_devDebug"})
    public static final class IndexedParameterMap extends kotlin.collections.AbstractMap<kotlin.reflect.KParameter, java.lang.Object> {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<kotlin.reflect.KParameter> parameterKeys = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Object[] parameterValues = null;
        
        public IndexedParameterMap(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends kotlin.reflect.KParameter> parameterKeys, @org.jetbrains.annotations.NotNull()
        java.lang.Object[] parameterValues) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<kotlin.reflect.KParameter> getParameterKeys() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] getParameterValues() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.Set<java.util.Map.Entry<kotlin.reflect.KParameter, java.lang.Object>> getEntries() {
            return null;
        }
        
        @java.lang.Override()
        public final boolean containsKey(java.lang.Object key) {
            return false;
        }
        
        @java.lang.Override()
        public boolean containsKey(@org.jetbrains.annotations.NotNull()
        kotlin.reflect.KParameter key) {
            return false;
        }
        
        @java.lang.Override()
        public final java.lang.Object get(java.lang.Object key) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Object get(@org.jetbrains.annotations.NotNull()
        kotlin.reflect.KParameter key) {
            return null;
        }
        
        @java.lang.Override()
        public final java.lang.Object getOrDefault(java.lang.Object key, java.lang.Object defaultValue) {
            return null;
        }
        
        @java.lang.Override()
        public java.lang.Object getOrDefault(kotlin.reflect.KParameter key, java.lang.Object defaultValue) {
            return null;
        }
    }
}