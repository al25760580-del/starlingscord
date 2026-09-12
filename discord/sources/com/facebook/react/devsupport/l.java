package com.facebook.react.devsupport;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DevSupportManagerBase f5199e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f5200i;

    public /* synthetic */ l(DevSupportManagerBase devSupportManagerBase, boolean z5, int i7) {
        this.f5198d = i7;
        this.f5199e = devSupportManagerBase;
        this.f5200i = z5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5198d) {
            case 0:
                DevSupportManagerBase.setFpsDebugEnabled$lambda$35(this.f5199e, this.f5200i);
                break;
            default:
                DevSupportManagerBase.setHotModuleReplacementEnabled$lambda$34(this.f5199e, this.f5200i);
                break;
        }
    }
}
