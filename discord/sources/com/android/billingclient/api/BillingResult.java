package com.android.billingclient.api;

import a3.e;
import a5.g;
import com.google.android.gms.internal.play_billing.b0;
import com.google.android.gms.internal.play_billing.h;
import com.google.android.gms.internal.play_billing.r;

/* JADX INFO: loaded from: classes.dex */
public final class BillingResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3790c;

    public static g a() {
        g gVar = new g();
        gVar.f185e = 0;
        gVar.f186i = "";
        return gVar;
    }

    public final String toString() {
        int i7 = this.f3788a;
        int i10 = r.f6105a;
        b0 b0Var = h.f6016i;
        Integer numValueOf = Integer.valueOf(i7);
        return e.m("Response Code: ", (!b0Var.containsKey(numValueOf) ? h.RESPONSE_CODE_UNSPECIFIED : (h) b0Var.get(numValueOf)).toString(), ", Debug Message: ", this.f3790c);
    }
}
