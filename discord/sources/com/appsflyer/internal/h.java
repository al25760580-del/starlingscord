package com.appsflyer.internal;

import android.app.Activity;
import android.content.Context;
import android.hardware.SensorEvent;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3875e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3876i;

    public /* synthetic */ h(int i7, Object obj, Object obj2) {
        this.f3874d = i7;
        this.f3875e = obj;
        this.f3876i = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws UnsupportedEncodingException {
        switch (this.f3874d) {
            case 0:
                AFb1lSDK.getMediationNetwork((AFb1lSDK) this.f3875e, (Activity) this.f3876i);
                break;
            case 1:
                ((AFa1uSDK) this.f3875e).getMediationNetwork((AFh1jSDK) this.f3876i);
                break;
            case 2:
                ((AFj1nSDK) this.f3875e).G_((SensorEvent) this.f3876i);
                break;
            case 3:
                AFj1uSDK.getMonetizationNetwork((AFj1uSDK) this.f3875e, (Context) this.f3876i);
                break;
            case 4:
                AFj1wSDK.getCurrencyIso4217Code((AFj1wSDK) this.f3875e, (Context) this.f3876i);
                break;
            default:
                ((AFj1zSDK) this.f3875e).AFAdRevenueData((Context) this.f3876i);
                break;
        }
    }
}
