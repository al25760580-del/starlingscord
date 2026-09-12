package he;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends Handler implements Runnable {
    public boolean E;
    public volatile boolean F;
    public final /* synthetic */ k0 G;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0 f10605e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f10606i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f0 f10607v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public IOException f10608w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10609x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Thread f10610y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(k0 k0Var, Looper looper, h0 h0Var, f0 f0Var, int i7, long j) {
        super(looper);
        this.G = k0Var;
        this.f10605e = h0Var;
        this.f10607v = f0Var;
        this.f10604d = i7;
        this.f10606i = j;
    }

    public final void a(boolean z5) {
        this.F = z5;
        this.f10608w = null;
        if (hasMessages(0)) {
            this.E = true;
            removeMessages(0);
            if (!z5) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.E = true;
                    this.f10605e.t();
                    Thread thread = this.f10610y;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z5) {
            this.G.f10622e = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            f0 f0Var = this.f10607v;
            f0Var.getClass();
            f0Var.p(this.f10605e, jElapsedRealtime, jElapsedRealtime - this.f10606i, true);
            this.f10607v = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.F) {
            return;
        }
        int i7 = message.what;
        if (i7 == 0) {
            this.f10608w = null;
            k0 k0Var = this.G;
            ExecutorService executorService = k0Var.f10621d;
            g0 g0Var = k0Var.f10622e;
            g0Var.getClass();
            executorService.execute(g0Var);
            return;
        }
        if (i7 == 3) {
            throw ((Error) message.obj);
        }
        this.G.f10622e = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.f10606i;
        f0 f0Var = this.f10607v;
        f0Var.getClass();
        if (this.E) {
            f0Var.p(this.f10605e, jElapsedRealtime, j, false);
            return;
        }
        int i10 = message.what;
        if (i10 == 1) {
            try {
                f0Var.e(this.f10605e, jElapsedRealtime, j);
                return;
            } catch (RuntimeException e10) {
                je.b.s("LoadTask", "Unexpected exception handling load completed", e10);
                this.G.f10623i = new j0(e10);
                return;
            }
        }
        if (i10 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f10608w = iOException;
        int i11 = this.f10609x + 1;
        this.f10609x = i11;
        ad.f fVarN = f0Var.n(this.f10605e, jElapsedRealtime, j, iOException, i11);
        int i12 = fVarN.f347a;
        if (i12 == 3) {
            this.G.f10623i = this.f10608w;
            return;
        }
        if (i12 != 2) {
            if (i12 == 1) {
                this.f10609x = 1;
            }
            long jMin = fVarN.f348b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f10609x - 1) * 1000, 5000);
            }
            k0 k0Var2 = this.G;
            je.b.k(k0Var2.f10622e == null);
            k0Var2.f10622e = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(0, jMin);
            } else {
                this.f10608w = null;
                k0Var2.f10621d.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z5;
        try {
            synchronized (this) {
                z5 = this.E;
                this.f10610y = Thread.currentThread();
            }
            if (!z5) {
                je.b.c("load:".concat(this.f10605e.getClass().getSimpleName()));
                try {
                    this.f10605e.l();
                    je.b.t();
                } catch (Throwable th2) {
                    je.b.t();
                    throw th2;
                }
            }
            synchronized (this) {
                this.f10610y = null;
                Thread.interrupted();
            }
            if (this.F) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e10) {
            if (this.F) {
                return;
            }
            obtainMessage(2, e10).sendToTarget();
        } catch (Exception e11) {
            if (this.F) {
                return;
            }
            je.b.s("LoadTask", "Unexpected exception loading stream", e11);
            obtainMessage(2, new j0(e11)).sendToTarget();
        } catch (OutOfMemoryError e12) {
            if (this.F) {
                return;
            }
            je.b.s("LoadTask", "OutOfMemory error loading stream", e12);
            obtainMessage(2, new j0(e12)).sendToTarget();
        } catch (Error e13) {
            if (!this.F) {
                je.b.s("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(3, e13).sendToTarget();
            }
            throw e13;
        }
    }
}
