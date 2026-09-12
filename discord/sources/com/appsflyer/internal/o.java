package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AFj1rSDK f3889e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Runnable f3890i;

    public /* synthetic */ o(AFj1rSDK aFj1rSDK, Runnable runnable, int i7) {
        this.f3888d = i7;
        this.f3889e = aFj1rSDK;
        this.f3890i = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3888d) {
            case 0:
                this.f3889e.component4(this.f3890i);
                break;
            case 1:
                this.f3889e.getRevenue(this.f3890i);
                break;
            case 2:
                this.f3889e.AFAdRevenueData(this.f3890i);
                break;
            default:
                this.f3889e.getCurrencyIso4217Code(this.f3890i);
                break;
        }
    }
}
