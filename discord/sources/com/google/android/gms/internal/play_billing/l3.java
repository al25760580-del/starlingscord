package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class l3 extends z1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f6044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f6045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f6046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f6047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f6048f;

    public l3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f6044b = atomicReferenceFieldUpdater;
        this.f6045c = atomicReferenceFieldUpdater2;
        this.f6046d = atomicReferenceFieldUpdater3;
        this.f6047e = atomicReferenceFieldUpdater4;
        this.f6048f = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final boolean B(v4 v4Var, u4 u4Var, u4 u4Var2) {
        return z1.k(this.f6046d, v4Var, u4Var, u4Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final void i(u4 u4Var, u4 u4Var2) {
        this.f6045c.lazySet(u4Var, u4Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final void r(u4 u4Var, Thread thread) {
        this.f6044b.lazySet(u4Var, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final boolean t(v4 v4Var, k2 k2Var, k2 k2Var2) {
        return z1.k(this.f6047e, v4Var, k2Var, k2Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final boolean w(v4 v4Var, Object obj, Object obj2) {
        return z1.k(this.f6048f, v4Var, obj, obj2);
    }
}
