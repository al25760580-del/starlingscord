package com.facebook.react.modules.debug;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FpsDebugFrameCallback f5258e;

    public /* synthetic */ b(FpsDebugFrameCallback fpsDebugFrameCallback, int i7) {
        this.f5257d = i7;
        this.f5258e = fpsDebugFrameCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5257d) {
            case 0:
                FpsDebugFrameCallback.start$lambda$0(this.f5258e);
                break;
            default:
                FpsDebugFrameCallback.stop$lambda$1(this.f5258e);
                break;
        }
    }
}
