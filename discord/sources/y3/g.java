package y3;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.PowerManager;
import androidx.appcompat.widget.u0;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import ar.b1;
import e4.o;
import f4.l;
import f4.u;
import f4.v;
import f4.w;
import kotlinx.coroutines.CoroutineDispatcher;
import v3.q;
import w3.j;

/* JADX INFO: loaded from: classes.dex */
public final class g implements a4.e, u {
    public static final String L = q.f("DelayMetCommandHandler");
    public final l E;
    public final h4.a F;
    public PowerManager.WakeLock G;
    public boolean H;
    public final j I;
    public final CoroutineDispatcher J;
    public volatile b1 K;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f23177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23178e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e4.j f23179i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final i f23180v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a4.i f23181w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f23182x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f23183y;

    public g(Context context, int i7, i iVar, j jVar) {
        this.f23177d = context;
        this.f23178e = i7;
        this.f23180v = iVar;
        this.f23179i = jVar.f22032a;
        this.I = jVar;
        c4.l lVar = iVar.f23190w.j;
        h4.b bVar = iVar.f23187e;
        this.E = bVar.f10327a;
        this.F = bVar.f10330d;
        this.J = bVar.f10328b;
        this.f23181w = new a4.i(lVar);
        this.H = false;
        this.f23183y = 0;
        this.f23182x = new Object();
    }

    public static void a(g gVar) {
        boolean z5;
        int i7 = gVar.f23178e;
        h4.a aVar = gVar.F;
        Context context = gVar.f23177d;
        String str = L;
        i iVar = gVar.f23180v;
        e4.j jVar = gVar.f23179i;
        String str2 = jVar.f7984a;
        if (gVar.f23183y >= 2) {
            q.d().a(str, "Already stopped work for " + str2);
            return;
        }
        gVar.f23183y = 2;
        q.d().a(str, "Stopping work for WorkSpec " + str2);
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        c.c(intent, jVar);
        aVar.execute(new u0(iVar, intent, i7, 5));
        w3.e eVar = iVar.f23189v;
        String str3 = jVar.f7984a;
        synchronized (eVar.k) {
            z5 = eVar.c(str3) != null;
        }
        if (!z5) {
            q.d().a(str, "Processor does not have WorkSpec " + str2 + ". No need to reschedule");
            return;
        }
        q.d().a(str, "WorkSpec " + str2 + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        c.c(intent2, jVar);
        aVar.execute(new u0(iVar, intent2, i7, 5));
    }

    public static void c(g gVar) {
        if (gVar.f23183y != 0) {
            q.d().a(L, "Already started work for " + gVar.f23179i);
            return;
        }
        gVar.f23183y = 1;
        q.d().a(L, "onAllConstraintsMet for " + gVar.f23179i);
        if (!gVar.f23180v.f23189v.g(gVar.I, null)) {
            gVar.d();
            return;
        }
        w wVar = gVar.f23180v.f23188i;
        e4.j jVar = gVar.f23179i;
        synchronized (wVar.f8871d) {
            q.d().a(w.f8867e, "Starting timer for " + jVar);
            wVar.a(jVar);
            v vVar = new v(wVar, jVar);
            wVar.f8869b.put(jVar, vVar);
            wVar.f8870c.put(jVar, gVar);
            ((Handler) wVar.f8868a.f18031d).postDelayed(vVar, 600000L);
        }
    }

    @Override // a4.e
    public final void b(o oVar, a4.c cVar) {
        boolean z5 = cVar instanceof a4.a;
        l lVar = this.E;
        if (z5) {
            lVar.execute(new f(this, 1));
        } else {
            lVar.execute(new f(this, 0));
        }
    }

    public final void d() {
        synchronized (this.f23182x) {
            try {
                if (this.K != null) {
                    this.K.f(null);
                }
                this.f23180v.f23188i.a(this.f23179i);
                PowerManager.WakeLock wakeLock = this.G;
                if (wakeLock != null && wakeLock.isHeld()) {
                    q.d().a(L, "Releasing wakelock " + this.G + "for WorkSpec " + this.f23179i);
                    this.G.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        String str = this.f23179i.f7984a;
        Context context = this.f23177d;
        StringBuilder sbO = kk.b.o(str, " (");
        sbO.append(this.f23178e);
        sbO.append(")");
        this.G = f4.o.a(context, sbO.toString());
        q qVarD = q.d();
        String str2 = L;
        qVarD.a(str2, "Acquiring wakelock " + this.G + "for WorkSpec " + str);
        this.G.acquire();
        o oVarN = this.f23180v.f23190w.f22048c.t().n(str);
        if (oVarN == null) {
            this.E.execute(new f(this, 0));
            return;
        }
        boolean zB = oVarN.b();
        this.H = zB;
        if (zB) {
            this.K = a4.l.a(this.f23181w, oVarN, this.J, this);
            return;
        }
        q.d().a(str2, "No constraints for " + str);
        this.E.execute(new f(this, 1));
    }

    public final void f(boolean z5) {
        q qVarD = q.d();
        StringBuilder sb2 = new StringBuilder("onExecuted ");
        e4.j jVar = this.f23179i;
        sb2.append(jVar);
        sb2.append(", ");
        sb2.append(z5);
        qVarD.a(L, sb2.toString());
        d();
        int i7 = this.f23178e;
        i iVar = this.f23180v;
        h4.a aVar = this.F;
        Context context = this.f23177d;
        if (z5) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            c.c(intent, jVar);
            aVar.execute(new u0(iVar, intent, i7, 5));
        }
        if (this.H) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            aVar.execute(new u0(iVar, intent2, i7, 5));
        }
    }
}
