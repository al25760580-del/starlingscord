package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends z1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6039b = AtomicReferenceFieldUpdater.newUpdater(o0.class, Thread.class, "a");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6040c = AtomicReferenceFieldUpdater.newUpdater(o0.class, o0.class, "b");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6041d = AtomicReferenceFieldUpdater.newUpdater(p0.class, o0.class, "i");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6042e = AtomicReferenceFieldUpdater.newUpdater(p0.class, j0.class, "e");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6043f = AtomicReferenceFieldUpdater.newUpdater(p0.class, Object.class, "d");

    @Override // com.google.android.gms.internal.play_billing.z1
    public final boolean A(a1 a1Var, j0 j0Var, j0 j0Var2) {
        return z1.j(f6042e, a1Var, j0Var, j0Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final boolean E(p0 p0Var, Object obj, Object obj2) {
        return z1.j(f6043f, p0Var, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final boolean G(p0 p0Var, o0 o0Var, o0 o0Var2) {
        return z1.j(f6041d, p0Var, o0Var, o0Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final j0 e(a1 a1Var) {
        return (j0) f6042e.getAndSet(a1Var, j0.f6023d);
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final o0 o(a1 a1Var) {
        return (o0) f6041d.getAndSet(a1Var, o0.f6078c);
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final void s(o0 o0Var, o0 o0Var2) {
        f6040c.lazySet(o0Var, o0Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final void v(o0 o0Var, Thread thread) {
        f6039b.lazySet(o0Var, thread);
    }
}
