package io.sentry;

import java.util.Iterator;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends TimerTask {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12826e;

    public /* synthetic */ n(int i7, Object obj) {
        this.f12825d = i7;
        this.f12826e = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f12825d) {
            case 0:
                Iterator it = ((q) this.f12826e).f13074d.iterator();
                while (it.hasNext()) {
                    ((u0) it.next()).c();
                }
                break;
            case 1:
                io.sentry.android.core.x0 x0Var = (io.sentry.android.core.x0) this.f12826e;
                v3 v3Var = x0Var.f12448x;
                if (x0Var.f12449y) {
                    v3Var.o();
                }
                v3Var.l().getReplayController().stop();
                v3Var.l().getContinuousProfiler().a(false);
                break;
            default:
                io.sentry.transport.p pVar = (io.sentry.transport.p) this.f12826e;
                Iterator it2 = pVar.f13199v.iterator();
                while (it2.hasNext()) {
                    ((io.sentry.transport.o) it2.next()).onRateLimitChanged(pVar);
                }
                break;
        }
    }
}
