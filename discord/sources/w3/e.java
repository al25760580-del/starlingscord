package w3;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.appcompat.widget.b4;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class e implements d4.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f22015l = v3.q.f("Processor");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f22017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v3.b f22018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h4.b f22019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WorkDatabase f22020e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f22022g = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f22021f = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashSet f22024i = new HashSet();
    public final ArrayList j = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f22016a = null;
    public final Object k = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f22023h = new HashMap();

    public e(Context context, v3.b bVar, h4.b bVar2, WorkDatabase workDatabase) {
        this.f22017b = context;
        this.f22018c = bVar;
        this.f22019d = bVar2;
        this.f22020e = workDatabase;
    }

    public static boolean d(String str, r rVar, int i7) {
        if (rVar == null) {
            v3.q.d().a(f22015l, "WorkerWrapper could not be found for " + str);
            return false;
        }
        rVar.N = i7;
        rVar.h();
        rVar.M.cancel(true);
        if (rVar.f22059v == null || !(rVar.M.f9490d instanceof g4.a)) {
            v3.q.d().a(r.O, "WorkSpec " + rVar.f22058i + " is already done. Not interrupting.");
        } else {
            rVar.f22059v.e(i7);
        }
        v3.q.d().a(f22015l, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(c cVar) {
        synchronized (this.k) {
            this.j.add(cVar);
        }
    }

    public final r b(String str) {
        r rVar = (r) this.f22021f.remove(str);
        boolean z5 = rVar != null;
        if (!z5) {
            rVar = (r) this.f22022g.remove(str);
        }
        this.f22023h.remove(str);
        if (z5) {
            synchronized (this.k) {
                try {
                    if (this.f22021f.isEmpty()) {
                        Context context = this.f22017b;
                        String str2 = d4.b.G;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.f22017b.startService(intent);
                        } catch (Throwable th2) {
                            v3.q.d().c(f22015l, "Unable to stop foreground service", th2);
                        }
                        PowerManager.WakeLock wakeLock = this.f22016a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f22016a = null;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return rVar;
    }

    public final r c(String str) {
        r rVar = (r) this.f22021f.get(str);
        return rVar == null ? (r) this.f22022g.get(str) : rVar;
    }

    public final void e(c cVar) {
        synchronized (this.k) {
            this.j.remove(cVar);
        }
    }

    public final void f(String str, v3.h hVar) {
        synchronized (this.k) {
            try {
                v3.q.d().e(f22015l, "Moving WorkSpec (" + str + ") to the foreground");
                r rVar = (r) this.f22022g.remove(str);
                if (rVar != null) {
                    if (this.f22016a == null) {
                        PowerManager.WakeLock wakeLockA = f4.o.a(this.f22017b, "ProcessorForegroundLck");
                        this.f22016a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f22021f.put(str, rVar);
                    Intent intentC = d4.b.c(this.f22017b, a.a.h(rVar.f22058i), hVar);
                    Context context = this.f22017b;
                    if (Build.VERSION.SDK_INT >= 26) {
                        y0.a.c(context, intentC);
                    } else {
                        context.startService(intentC);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean g(j jVar, io.sentry.internal.debugmeta.c cVar) {
        boolean z5;
        e4.j jVar2 = jVar.f22032a;
        String str = jVar2.f7984a;
        ArrayList arrayList = new ArrayList();
        e4.o oVar = (e4.o) this.f22020e.n(new com.facebook.react.runtime.q(this, arrayList, str));
        if (oVar == null) {
            v3.q.d().g(f22015l, "Didn't find WorkSpec for id " + jVar2);
            this.f22019d.f10330d.execute(new io.sentry.react.d(27, this, jVar2));
            return false;
        }
        synchronized (this.k) {
            try {
                synchronized (this.k) {
                    z5 = c(str) != null;
                }
                if (z5) {
                    Set set = (Set) this.f22023h.get(str);
                    if (((j) set.iterator().next()).f22032a.f7985b == jVar2.f7985b) {
                        set.add(jVar);
                        v3.q.d().a(f22015l, "Work " + jVar2 + " is already enqueued for processing");
                    } else {
                        this.f22019d.f10330d.execute(new io.sentry.react.d(27, this, jVar2));
                    }
                    return false;
                }
                if (oVar.f8015t != jVar2.f7985b) {
                    this.f22019d.f10330d.execute(new io.sentry.react.d(27, this, jVar2));
                    return false;
                }
                Context context = this.f22017b;
                v3.b bVar = this.f22018c;
                h4.b bVar2 = this.f22019d;
                WorkDatabase workDatabase = this.f22020e;
                b4 b4Var = new b4();
                new io.sentry.internal.debugmeta.c(22);
                b4Var.f909d = context.getApplicationContext();
                b4Var.f911i = bVar2;
                b4Var.f910e = this;
                b4Var.f912v = bVar;
                b4Var.f913w = workDatabase;
                b4Var.f914x = oVar;
                b4Var.f915y = arrayList;
                r rVar = new r(b4Var);
                g4.j jVar3 = rVar.L;
                jVar3.a(new org.webrtc.h(this, jVar3, rVar, 3), this.f22019d.f10330d);
                this.f22022g.put(str, rVar);
                HashSet hashSet = new HashSet();
                hashSet.add(jVar);
                this.f22023h.put(str, hashSet);
                this.f22019d.f10327a.execute(rVar);
                v3.q.d().a(f22015l, e.class.getSimpleName() + ": processing " + jVar2);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
