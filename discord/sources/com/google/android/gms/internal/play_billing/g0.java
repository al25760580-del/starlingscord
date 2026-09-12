package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a1 f6013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0 f6014e;

    public g0(a1 a1Var, x0 x0Var) {
        this.f6013d = a1Var;
        this.f6014e = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6013d.f6088d != this) {
            return;
        }
        x0 x0Var = this.f6014e;
        if (p0.f6087y.E(this.f6013d, this, a1.h(x0Var))) {
            a1.j(this.f6013d);
        }
    }
}
