package com.margelo.nitro.core;

import androidx.annotation.Keep;
import ar.b0;
import ar.k0;
import com.facebook.jni.HybridData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 $*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003%&'B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0013\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0082 ¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082 ¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0014H\u0082 ¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005H\u0082 ¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u000bJ\u0015\u0010\u001a\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000fJ'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u001b¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00028\u0000H\u0086@¢\u0006\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/margelo/nitro/core/Promise;", "T", "", "<init>", "()V", "Lcom/facebook/jni/HybridData;", "hybridData", "(Lcom/facebook/jni/HybridData;)V", "result", "", "nativeResolve", "(Ljava/lang/Object;)V", "", "error", "nativeReject", "(Ljava/lang/Throwable;)V", "Lcom/margelo/nitro/core/Promise$OnResolvedCallback;", "callback", "addOnResolvedListener", "(Lcom/margelo/nitro/core/Promise$OnResolvedCallback;)V", "Lcom/margelo/nitro/core/Promise$OnRejectedCallback;", "addOnRejectedListener", "(Lcom/margelo/nitro/core/Promise$OnRejectedCallback;)V", "initHybrid", "()Lcom/facebook/jni/HybridData;", "resolve", "reject", "Lkotlin/Function1;", "listener", "then", "(Lkotlin/jvm/functions/Function1;)Lcom/margelo/nitro/core/Promise;", "catch", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mHybridData", "Lcom/facebook/jni/HybridData;", "Companion", "OnResolvedCallback", "OnRejectedCallback", "com/margelo/nitro/core/f", "react-native-nitro-modules_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@xa.a
public final class Promise<T> {

    @NotNull
    public static final f Companion = new f();

    @NotNull
    private static final CoroutineScope defaultScope = b0.b(k0.f2938a);

    @xa.a
    @Keep
    @NotNull
    private final HybridData mHybridData;

    @Keep
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\bã\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lcom/margelo/nitro/core/Promise$OnRejectedCallback;", "", "onRejected", "", "error", "", "react-native-nitro-modules_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @xa.a
    public interface OnRejectedCallback {
        @xa.a
        @Keep
        void onRejected(@NotNull Throwable error);
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bã\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H'¨\u0006\u0005"}, d2 = {"Lcom/margelo/nitro/core/Promise$OnResolvedCallback;", "", "onResolved", "", "result", "react-native-nitro-modules_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @xa.a
    public interface OnResolvedCallback {
        @xa.a
        @Keep
        void onResolved(Object result);
    }

    public Promise() {
        this.mHybridData = initHybrid();
    }

    private final native void addOnRejectedListener(OnRejectedCallback callback);

    private final native void addOnResolvedListener(OnResolvedCallback callback);

    private final native HybridData initHybrid();

    private final native void nativeReject(Throwable error);

    private final native void nativeResolve(Object result);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void then$lambda$0(Function1 function1, Object obj) {
        if (obj == null) {
            obj = null;
        }
        if (obj == null) {
            throw new Error("Failed to cast Object to T!");
        }
        function1.invoke(obj);
    }

    public final Object await(@NotNull Continuation frame) {
        vn.c cVar = new vn.c(wn.f.b(frame));
        then(new g(cVar, 0));
        m1242catch(new g(cVar, 1));
        Object objA = cVar.a();
        if (objA == wn.a.f22354d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objA;
    }

    @NotNull
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final Promise<T> m1242catch(@NotNull Function1<? super Throwable, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        addOnRejectedListener(new h(listener));
        return this;
    }

    public final void reject(@NotNull Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        nativeReject(error);
    }

    public final void resolve(T result) {
        nativeResolve(result);
    }

    @NotNull
    public final Promise<T> then(@NotNull final Function1<? super T, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        addOnResolvedListener(new OnResolvedCallback() { // from class: com.margelo.nitro.core.e
            @Override // com.margelo.nitro.core.Promise.OnResolvedCallback
            public final void onResolved(Object obj) {
                Promise.then$lambda$0(listener, obj);
            }
        });
        return this;
    }

    @xa.a
    @Keep
    private Promise(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
