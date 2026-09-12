package com.discord.media.engine.video.egl_renderer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ EglRenderer f4463e;

    public /* synthetic */ a(EglRenderer eglRenderer, int i7) {
        this.f4462d = i7;
        this.f4463e = eglRenderer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4462d) {
            case 0:
                this.f4463e.renderFrameOnRenderThread();
                break;
            default:
                EglRenderer.logStatisticsRunnable$lambda$2(this.f4463e);
                break;
        }
    }
}
