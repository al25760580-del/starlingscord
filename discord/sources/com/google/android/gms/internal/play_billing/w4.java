package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f6180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y4 f6181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z4 f6182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6183d;

    public final void a(Object obj) {
        this.f6183d = true;
        y4 y4Var = this.f6181b;
        if (y4Var != null) {
            x4 x4Var = y4Var.f6193e;
            x4Var.getClass();
            if (obj == null) {
                obj = v4.f6165y;
            }
            if (v4.f6164x.w(x4Var, null, obj)) {
                v4.d(x4Var);
                this.f6180a = null;
                this.f6181b = null;
                this.f6182c = null;
            }
        }
    }

    public final void finalize() {
        z4 z4Var;
        y4 y4Var = this.f6181b;
        if (y4Var != null) {
            x4 x4Var = y4Var.f6193e;
            if (!x4Var.isDone()) {
                if (v4.f6164x.w(x4Var, null, new x1(new n1("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.f6180a)), 1)))) {
                    v4.d(x4Var);
                }
            }
        }
        if (this.f6183d || (z4Var = this.f6182c) == null) {
            return;
        }
        z4Var.i(null);
    }
}
