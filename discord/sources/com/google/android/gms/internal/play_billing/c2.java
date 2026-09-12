package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c2 implements Cloneable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d2 f5993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d2 f5994e;

    public c2(d2 d2Var) {
        this.f5993d = d2Var;
        if (d2Var.h()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f5994e = d2Var.n();
    }

    public final d2 a() {
        d2 d2VarB = b();
        d2VarB.getClass();
        if (d2.i(d2VarB, true)) {
            return d2VarB;
        }
        throw new e3();
    }

    public final d2 b() {
        if (!this.f5994e.h()) {
            return this.f5994e;
        }
        this.f5994e.q();
        return this.f5994e;
    }

    public final void c() {
        if (this.f5994e.h()) {
            return;
        }
        d();
    }

    public final Object clone() {
        c2 c2Var = (c2) this.f5993d.j(5);
        c2Var.f5994e = b();
        return c2Var;
    }

    public final void d() {
        d2 d2VarN = this.f5993d.n();
        u2.f6145b.a(d2VarN.getClass()).f(d2VarN, this.f5994e);
        this.f5994e = d2VarN;
    }
}
