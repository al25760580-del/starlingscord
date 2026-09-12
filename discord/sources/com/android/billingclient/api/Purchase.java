package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.c0;
import com.google.android.gms.internal.play_billing.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Purchase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JSONObject f3820c;

    public Purchase(String str, String str2) {
        this.f3818a = str;
        this.f3819b = str2;
        this.f3820c = new JSONObject(str);
        int i7 = u.f6139i;
        Object[] objArr = c0.F;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f3818a, purchase.f3818a) && TextUtils.equals(this.f3819b, purchase.f3819b);
    }

    public final int hashCode() {
        return this.f3818a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f3818a));
    }
}
