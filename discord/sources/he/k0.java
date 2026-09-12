package he;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements l0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ad.f f10618v = new ad.f(0, -9223372036854775807L, false);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ad.f f10619w = new ad.f(2, -9223372036854775807L, false);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final ad.f f10620x = new ad.f(3, -9223372036854775807L, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExecutorService f10621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g0 f10622e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public IOException f10623i;

    public k0(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        int i7 = je.e0.f13788a;
        this.f10621d = Executors.newSingleThreadExecutor(new je.c0(strConcat, 0));
    }

    public final void a() {
        g0 g0Var = this.f10622e;
        je.b.l(g0Var);
        g0Var.a(false);
    }

    @Override // he.l0
    public final void b() {
        IOException iOException = this.f10623i;
        if (iOException != null) {
            throw iOException;
        }
        g0 g0Var = this.f10622e;
        if (g0Var != null) {
            int i7 = g0Var.f10604d;
            IOException iOException2 = g0Var.f10608w;
            if (iOException2 != null && g0Var.f10609x > i7) {
                throw iOException2;
            }
        }
    }

    public final boolean c() {
        return this.f10623i != null;
    }

    public final boolean d() {
        return this.f10622e != null;
    }

    public final void e(i0 i0Var) {
        g0 g0Var = this.f10622e;
        if (g0Var != null) {
            g0Var.a(true);
        }
        ExecutorService executorService = this.f10621d;
        if (i0Var != null) {
            executorService.execute(new a3.h(17, i0Var));
        }
        executorService.shutdown();
    }

    public final long f(h0 h0Var, f0 f0Var, int i7) {
        Looper looperMyLooper = Looper.myLooper();
        je.b.l(looperMyLooper);
        this.f10623i = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        g0 g0Var = new g0(this, looperMyLooper, h0Var, f0Var, i7, jElapsedRealtime);
        je.b.k(this.f10622e == null);
        this.f10622e = g0Var;
        g0Var.f10608w = null;
        this.f10621d.execute(g0Var);
        return jElapsedRealtime;
    }
}
