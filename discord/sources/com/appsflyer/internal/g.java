package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3873e;

    public /* synthetic */ g(int i7, Object obj) {
        this.f3872d = i7;
        this.f3873e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3872d) {
            case 0:
                AFb1lSDK.getRevenue((AFb1lSDK) this.f3873e);
                break;
            case 1:
                AFa1uSDK.getMediationNetwork((AFc1bSDK) this.f3873e);
                break;
            default:
                ((AFd1oSDK) this.f3873e).getRevenue();
                break;
        }
    }
}
