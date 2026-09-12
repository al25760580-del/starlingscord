package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class x4 extends v4 {
    public final /* synthetic */ y4 E;

    public x4(y4 y4Var) {
        this.E = y4Var;
    }

    @Override // com.google.android.gms.internal.play_billing.v4
    public final String c() {
        w4 w4Var = (w4) this.E.f6192d.get();
        return w4Var == null ? "Completer object has been garbage collected, future will fail soon" : s0.g.e("tag=[", String.valueOf(w4Var.f6180a), "]");
    }
}
