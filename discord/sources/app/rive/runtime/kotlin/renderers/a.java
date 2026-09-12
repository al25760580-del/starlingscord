package app.rive.runtime.kotlin.renderers;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Renderer f2879e;

    public /* synthetic */ a(Renderer renderer, int i7) {
        this.f2878d = i7;
        this.f2879e = renderer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2878d) {
            case 0:
                Renderer.removeFrameCallback$lambda$4(this.f2879e);
                break;
            default:
                Renderer.scheduleFrame$lambda$3(this.f2879e);
                break;
        }
    }
}
