package com.facebook.react.devsupport.perfmonitor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ PerfMonitorOverlayManager f5208e;

    public /* synthetic */ a(PerfMonitorOverlayManager perfMonitorOverlayManager, int i7) {
        this.f5207d = i7;
        this.f5208e = perfMonitorOverlayManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5207d) {
            case 0:
                PerfMonitorOverlayManager.onPerfIssueAdded$lambda$5(this.f5208e);
                break;
            case 1:
                PerfMonitorOverlayManager.onPerfIssueAdded$lambda$7(this.f5208e);
                break;
            case 2:
                PerfMonitorOverlayManager.onPerfIssueAdded$lambda$7$lambda$6(this.f5208e);
                break;
            case 3:
                PerfMonitorOverlayManager.disable$lambda$1(this.f5208e);
                break;
            default:
                PerfMonitorOverlayManager.enable$lambda$0(this.f5208e);
                break;
        }
    }
}
