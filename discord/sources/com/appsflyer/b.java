package com.appsflyer;

import com.appsflyer.internal.AFh1ySDK;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AFh1ySDK[] f3836e;

    public /* synthetic */ b(AFh1ySDK[] aFh1ySDKArr, int i7) {
        this.f3835d = i7;
        this.f3836e = aFh1ySDKArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3835d) {
            case 0:
                AFLogger.AFAdRevenueData(this.f3836e);
                break;
            default:
                AFLogger.getMonetizationNetwork(this.f3836e);
                break;
        }
    }
}
