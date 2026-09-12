package com.android.billingclient.api;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class BillingConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3782a;

    public BillingConfig(String str, int i7) {
        this.f3782a = str;
    }

    public BillingConfig(String str) {
        this.f3782a = new JSONObject(str).optString("countryCode");
    }
}
