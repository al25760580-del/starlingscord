package ke;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final s f14398w = new s();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile long f14399d = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f14400e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Choreographer f14401i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14402v;

    public s() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i7 = e0.f13788a;
        Handler handler = new Handler(looper, this);
        this.f14400e = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f14399d = j;
        Choreographer choreographer = this.f14401i;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 0) {
            try {
                this.f14401i = Choreographer.getInstance();
                return true;
            } catch (RuntimeException e10) {
                je.b.O("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
                return true;
            }
        }
        if (i7 == 1) {
            Choreographer choreographer = this.f14401i;
            if (choreographer != null) {
                int i10 = this.f14402v + 1;
                this.f14402v = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        } else {
            if (i7 != 2) {
                return false;
            }
            Choreographer choreographer2 = this.f14401i;
            if (choreographer2 != null) {
                int i11 = this.f14402v - 1;
                this.f14402v = i11;
                if (i11 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f14399d = -9223372036854775807L;
                    return true;
                }
            }
        }
        return true;
    }
}
