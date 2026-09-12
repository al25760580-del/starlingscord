package com.google.android.exoplayer2;

import gc.g;
import gc.l;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class DeviceInfo implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5499e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5500i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f5501v = null;

    static {
        new l(0).a();
        int i7 = e0.f13788a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public DeviceInfo(l lVar) {
        this.f5498d = lVar.f9744a;
        this.f5499e = lVar.f9745b;
        this.f5500i = lVar.f9746c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return this.f5498d == deviceInfo.f5498d && this.f5499e == deviceInfo.f5499e && this.f5500i == deviceInfo.f5500i && e0.a(this.f5501v, deviceInfo.f5501v);
    }

    public final int hashCode() {
        int i7 = (((((527 + this.f5498d) * 31) + this.f5499e) * 31) + this.f5500i) * 31;
        String str = this.f5501v;
        return i7 + (str == null ? 0 : str.hashCode());
    }
}
