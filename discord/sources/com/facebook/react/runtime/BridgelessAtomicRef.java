package com.facebook.react.runtime;

import android.annotation.SuppressLint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u001a\u001bB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0011\u001a\u00028\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0007¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0017\u001a\u00020\u0018J\u000b\u0010\u0019\u001a\u00028\u0000¢\u0006\u0002\u0010\u0007R \u0010\u0003\u001a\u0004\u0018\u00018\u00008GX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001e\u0010\n\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\u0005R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/facebook/react/runtime/BridgelessAtomicRef;", "T", "", "value", "<init>", "(Ljava/lang/Object;)V", "getNullable", "()Ljava/lang/Object;", "setValue", "Ljava/lang/Object;", "initialValue", "getInitialValue", "setInitialValue", "state", "Lcom/facebook/react/runtime/BridgelessAtomicRef$State;", "failureMessage", "", "getOrCreate", "provider", "Lcom/facebook/react/runtime/BridgelessAtomicRef$Provider;", "(Lcom/facebook/react/runtime/BridgelessAtomicRef$Provider;)Ljava/lang/Object;", "andReset", "getAndReset", "reset", "", "get", "Provider", "State", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BridgelessAtomicRef<T> {

    @NotNull
    private volatile String failureMessage;
    private T initialValue;

    @NotNull
    private volatile State state;
    private volatile T value;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bà\u0080\u0001\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\r\u0010\u0003\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/facebook/react/runtime/BridgelessAtomicRef$Provider;", "T", "", "get", "()Ljava/lang/Object;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Provider<T> {
        T get();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/runtime/BridgelessAtomicRef$State;", "", "<init>", "(Ljava/lang/String;I)V", "Init", "Creating", "Success", "Failure", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum State {
        Init,
        Creating,
        Success,
        Failure;

        private static final /* synthetic */ EnumEntries $ENTRIES = com.facebook.imagepipeline.nativecode.b.l(values());

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BridgelessAtomicRef() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(defaultConstructorMarker, 1, defaultConstructorMarker);
    }

    public final synchronized T get() {
        T t5;
        t5 = this.value;
        if (t5 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        return t5;
    }

    public final synchronized T getAndReset() {
        T t5;
        t5 = get();
        reset();
        return t5;
    }

    public final T getInitialValue() {
        return this.initialValue;
    }

    public final synchronized T getNullable() {
        return this.value;
    }

    @SuppressLint({"CatchGeneralException"})
    public final T getOrCreate(@NotNull Provider<T> provider) {
        boolean z5;
        T t5;
        T t10;
        Intrinsics.checkNotNullParameter(provider, "provider");
        synchronized (this) {
            State state = this.state;
            State state2 = State.Success;
            if (state == state2) {
                return get();
            }
            if (this.state == State.Failure) {
                throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.failureMessage);
            }
            State state3 = this.state;
            State state4 = State.Creating;
            boolean z6 = false;
            if (state3 != state4) {
                this.state = state4;
                z5 = true;
            } else {
                z5 = false;
            }
            Unit unit = Unit.f14616a;
            if (z5) {
                try {
                    this.value = provider.get();
                    synchronized (this) {
                        this.state = state2;
                        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                        notifyAll();
                        t5 = get();
                    }
                    return t5;
                } catch (RuntimeException e10) {
                    synchronized (this) {
                        this.state = State.Failure;
                        this.failureMessage = String.valueOf(e10.getMessage());
                        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                        notifyAll();
                        Unit unit2 = Unit.f14616a;
                        throw new RuntimeException("BridgelessAtomicRef: Failed to create object.", e10);
                    }
                }
            }
            synchronized (this) {
                while (this.state == State.Creating) {
                    try {
                        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                        wait();
                    } catch (InterruptedException unused) {
                        z6 = true;
                    }
                }
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                if (this.state == State.Failure) {
                    throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.failureMessage);
                }
                t10 = get();
            }
            return t10;
        }
    }

    public final synchronized void reset() {
        this.value = this.initialValue;
        this.state = State.Init;
        this.failureMessage = "";
    }

    public final void setInitialValue(T t5) {
        this.initialValue = t5;
    }

    public final void setValue(T t5) {
        this.value = t5;
    }

    public BridgelessAtomicRef(T t5) {
        this.value = t5;
        this.initialValue = this.value;
        this.state = State.Init;
        this.failureMessage = "";
    }

    public /* synthetic */ BridgelessAtomicRef(Object obj, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : obj);
    }
}
