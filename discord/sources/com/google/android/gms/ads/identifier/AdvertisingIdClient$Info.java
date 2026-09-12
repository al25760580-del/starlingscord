package com.google.android.gms.ads.identifier;

/* JADX INFO: loaded from: classes3.dex */
public final class AdvertisingIdClient$Info {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5891b;

    public AdvertisingIdClient$Info(String str, boolean z5) {
        this.f5890a = str;
        this.f5891b = z5;
    }

    public final String toString() {
        String str = this.f5890a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
        sb2.append("{");
        sb2.append(str);
        sb2.append("}");
        sb2.append(this.f5891b);
        return sb2.toString();
    }
}
