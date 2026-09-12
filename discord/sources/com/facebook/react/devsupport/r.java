package com.facebook.react.devsupport;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LogBoxModule f5213e;

    public /* synthetic */ r(LogBoxModule logBoxModule, int i7) {
        this.f5212d = i7;
        this.f5213e = logBoxModule;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5212d) {
            case 0:
                LogBoxModule.hide$lambda$1(this.f5213e);
                break;
            case 1:
                LogBoxModule.invalidate$lambda$2(this.f5213e);
                break;
            default:
                LogBoxModule.show$lambda$0(this.f5213e);
                break;
        }
    }
}
