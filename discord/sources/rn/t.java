package rn;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements Lazy, Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final s f19490i = new s(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19491v = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "e");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Function0 f19492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f19493e;

    @Override // kotlin.Lazy
    public final Object getValue() {
        Object obj = this.f19493e;
        g0 g0Var = g0.f19473a;
        if (obj != g0Var) {
            return obj;
        }
        Function0 function0 = this.f19492d;
        if (function0 != null) {
            Object objInvoke = function0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19491v;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, g0Var, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != g0Var) {
                }
            }
            this.f19492d = null;
            return objInvoke;
        }
        return this.f19493e;
    }

    public final String toString() {
        return this.f19493e != g0.f19473a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
