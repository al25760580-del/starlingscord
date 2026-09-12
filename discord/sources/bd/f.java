package bd;

import a5.i0;
import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f3144g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f3145h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f3146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f3147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f3148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f3149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0 f3150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3151f;

    public f(MediaCodec mediaCodec, HandlerThread handlerThread) {
        i0 i0Var = new i0(0);
        this.f3146a = mediaCodec;
        this.f3147b = handlerThread;
        this.f3150e = i0Var;
        this.f3149d = new AtomicReference();
    }

    public static e b() {
        ArrayDeque arrayDeque = f3144g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new e();
                }
                return (e) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        if (this.f3151f) {
            try {
                d dVar = this.f3148c;
                dVar.getClass();
                dVar.removeCallbacksAndMessages(null);
                i0 i0Var = this.f3150e;
                i0Var.l();
                d dVar2 = this.f3148c;
                dVar2.getClass();
                dVar2.obtainMessage(2).sendToTarget();
                i0Var.h();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }
}
