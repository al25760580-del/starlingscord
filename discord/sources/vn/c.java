package vn;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.r;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Continuation, CoroutineStackFrame {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final b f21783e = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f21784i = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "result");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Continuation f21785d;
    private volatile Object result;

    public c(Continuation delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        wn.a aVar = wn.a.f22355e;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f21785d = delegate;
        this.result = aVar;
    }

    public final Object a() {
        Object obj = this.result;
        wn.a aVar = wn.a.f22355e;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21784i;
            wn.a aVar2 = wn.a.f22354d;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return wn.a.f22354d;
        }
        if (obj == wn.a.f22356i) {
            return wn.a.f22354d;
        }
        if (obj instanceof r) {
            throw ((r) obj).f19489d;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f21785d;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f21785d.getContext();
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            wn.a aVar = wn.a.f22355e;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21784i;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    }
                }
                return;
            }
            wn.a aVar2 = wn.a.f22354d;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f21784i;
            wn.a aVar3 = wn.a.f22356i;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                    this.f21785d.resumeWith(obj);
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == aVar2);
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f21785d;
    }
}
