package com.facebook.react.fabric.mounting;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SurfaceMountingManager f5246e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5247i;

    public /* synthetic */ d(SurfaceMountingManager surfaceMountingManager, int i7, int i10) {
        this.f5245d = i10;
        this.f5246e = surfaceMountingManager;
        this.f5247i = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5245d) {
            case 0:
                SurfaceMountingManager.markViewInTransition$lambda$6(this.f5246e, this.f5247i);
                break;
            default:
                SurfaceMountingManager.addViewAt$lambda$8(this.f5246e, this.f5247i);
                break;
        }
    }
}
