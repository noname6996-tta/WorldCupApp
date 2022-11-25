package com.example.worldcup2022.utils;

import androidx.test.espresso.IdlingResource;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * An simple counter implementation of [IdlingResource] that determines idleness by
 * maintaining an internal counter. When the counter is 0 - it is considered to be idle, when it is
 * non-zero it is not idle. This is very similar to the way a [java.util.concurrent.Semaphore]
 * behaves.
 *
 *
 * This class can then be used to wrap up operations that while in progress should block tests from
 * accessing the UI.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0006\u0010\f\u001a\u00020\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/worldcup2022/utils/SimpleCountingIdlingResource;", "Landroidx/test/espresso/IdlingResource;", "resourceName", "", "(Ljava/lang/String;)V", "counter", "Ljava/util/concurrent/atomic/AtomicInteger;", "resourceCallback", "Landroidx/test/espresso/IdlingResource$ResourceCallback;", "decrement", "", "getName", "increment", "isIdleNow", "", "registerIdleTransitionCallback", "app_debug"})
public final class SimpleCountingIdlingResource implements androidx.test.espresso.IdlingResource {
    private final java.lang.String resourceName = null;
    private final java.util.concurrent.atomic.AtomicInteger counter = null;
    @kotlin.jvm.Volatile()
    private volatile androidx.test.espresso.IdlingResource.ResourceCallback resourceCallback;
    
    public SimpleCountingIdlingResource(@org.jetbrains.annotations.NotNull()
    java.lang.String resourceName) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getName() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isIdleNow() {
        return false;
    }
    
    @java.lang.Override()
    public void registerIdleTransitionCallback(@org.jetbrains.annotations.NotNull()
    androidx.test.espresso.IdlingResource.ResourceCallback resourceCallback) {
    }
    
    /**
     * Increments the count of in-flight transactions to the resource being monitored.
     */
    public final void increment() {
    }
    
    /**
     * Decrements the count of in-flight transactions to the resource being monitored.
     * If this operation results in the counter falling below 0 - an exception is raised.
     *
     * @throws IllegalStateException if the counter is below 0.
     */
    public final void decrement() {
    }
}