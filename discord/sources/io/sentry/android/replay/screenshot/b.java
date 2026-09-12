package io.sentry.android.replay.screenshot;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CanvasStrategy f12485e;

    public /* synthetic */ b(CanvasStrategy canvasStrategy, int i7) {
        this.f12484d = i7;
        this.f12485e = canvasStrategy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12484d) {
            case 0:
                CanvasStrategy.pictureRenderTask$lambda$3(this.f12485e);
                break;
            default:
                CanvasStrategy.close$lambda$6(this.f12485e);
                break;
        }
    }
}
