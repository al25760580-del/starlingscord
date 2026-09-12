package f4;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f8838e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayDeque f8839i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Runnable f8840v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Executor f8841w;

    public l(Executor executor) {
        this.f8837d = 0;
        this.f8841w = executor;
        this.f8839i = new ArrayDeque();
        this.f8838e = new Object();
    }

    public final void a() {
        switch (this.f8837d) {
            case 0:
                Runnable runnable = (Runnable) this.f8839i.poll();
                this.f8840v = runnable;
                if (runnable != null) {
                    this.f8841w.execute(runnable);
                    return;
                }
                return;
            default:
                synchronized (this.f8838e) {
                    try {
                        Runnable runnable2 = (Runnable) this.f8839i.poll();
                        this.f8840v = runnable2;
                        if (runnable2 != null) {
                            ((n) this.f8841w).execute(runnable2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f8837d) {
            case 0:
                synchronized (this.f8838e) {
                    try {
                        this.f8839i.add(new hi.o(8, this, runnable));
                        if (this.f8840v == null) {
                            a();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f8838e) {
                    try {
                        this.f8839i.add(new com.mkuczera.haptic.a(7, this, runnable));
                        if (this.f8840v == null) {
                            a();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
        }
    }

    public l(n nVar) {
        this.f8837d = 1;
        this.f8838e = new Object();
        this.f8839i = new ArrayDeque();
        this.f8841w = nVar;
    }
}
