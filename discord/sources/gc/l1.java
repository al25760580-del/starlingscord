package gc;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.Timeline;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f9747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f9748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final je.y f9749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f9751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Looper f9752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9755i;

    public l1(e0 e0Var, k1 k1Var, Timeline timeline, int i7, je.y yVar, Looper looper) {
        this.f9748b = e0Var;
        this.f9747a = k1Var;
        this.f9752f = looper;
        this.f9749c = yVar;
    }

    public final synchronized void a(long j) {
        boolean z5;
        je.b.k(this.f9753g);
        je.b.k(this.f9752f.getThread() != Thread.currentThread());
        this.f9749c.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (true) {
            z5 = this.f9755i;
            if (z5 || j <= 0) {
                break;
            }
            this.f9749c.getClass();
            wait(j);
            this.f9749c.getClass();
            j = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z5) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z5) {
        this.f9754h = z5 | this.f9754h;
        this.f9755i = true;
        notifyAll();
    }

    public final void c() {
        je.b.k(!this.f9753g);
        this.f9753g = true;
        e0 e0Var = this.f9748b;
        synchronized (e0Var) {
            if (!e0Var.V && e0Var.G.getThread().isAlive()) {
                e0Var.E.a(14, this).b();
                return;
            }
            je.b.N("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
