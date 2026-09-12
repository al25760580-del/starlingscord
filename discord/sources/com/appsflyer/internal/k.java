package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AFd1ySDK f3879e;

    public /* synthetic */ k(AFd1ySDK aFd1ySDK, int i7) {
        this.f3878d = i7;
        this.f3879e = aFd1ySDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3878d) {
            case 0:
                AFd1ySDK.getRevenue(this.f3879e);
                break;
            case 1:
                AFd1ySDK.getMediationNetwork(this.f3879e);
                break;
            default:
                AFd1ySDK.getCurrencyIso4217Code(this.f3879e);
                break;
        }
    }
}
