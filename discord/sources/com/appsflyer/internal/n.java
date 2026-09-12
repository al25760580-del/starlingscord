package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AFj1oSDK f3887e;

    public /* synthetic */ n(AFj1oSDK aFj1oSDK, int i7) {
        this.f3886d = i7;
        this.f3887e = aFj1oSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3886d) {
            case 0:
                this.f3887e.areAllFieldsValid();
                break;
            case 1:
                this.f3887e.component1();
                break;
            default:
                this.f3887e.component3();
                break;
        }
    }
}
