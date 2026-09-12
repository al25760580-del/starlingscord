package bd;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements di.j, je.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3131e;

    public /* synthetic */ b(int i7, int i10) {
        this.f3130d = i10;
        this.f3131e = i7;
    }

    @Override // di.j
    public Object get() {
        switch (this.f3130d) {
            case 0:
                return new HandlerThread(c.c(this.f3131e, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.c(this.f3131e, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }

    @Override // je.j
    public void invoke(Object obj) {
        ((com.google.android.exoplayer2.e) obj).onRepeatModeChanged(this.f3131e);
    }
}
