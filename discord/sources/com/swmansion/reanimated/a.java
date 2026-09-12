package com.swmansion.reanimated;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DrawPassDetector f7108e;

    public /* synthetic */ a(DrawPassDetector drawPassDetector, int i7) {
        this.f7107d = i7;
        this.f7108e = drawPassDetector;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7107d) {
            case 0:
                this.f7108e.lambda$new$0();
                break;
            default:
                this.f7108e.invalidateOnUiThread();
                break;
        }
    }
}
