package com.example.worldcup2022.utils;

import androidx.test.espresso.IdlingResource;

/**
 * Contains a static reference to [IdlingResource], only available in the 'mock' build type.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/worldcup2022/utils/EspressoIdlingResource;", "", "()V", "RESOURCE", "", "countingIdlingResource", "Lcom/example/worldcup2022/utils/SimpleCountingIdlingResource;", "decrement", "", "increment", "app_debug"})
public final class EspressoIdlingResource {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.worldcup2022.utils.EspressoIdlingResource INSTANCE = null;
    private static final java.lang.String RESOURCE = "GLOBAL";
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static final com.example.worldcup2022.utils.SimpleCountingIdlingResource countingIdlingResource = null;
    
    private EspressoIdlingResource() {
        super();
    }
    
    public final void increment() {
    }
    
    public final void decrement() {
    }
}