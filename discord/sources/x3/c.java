package x3;

import a4.e;
import a4.i;
import a5.t;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.discord.jank_stats.JankRecordStore;
import com.google.android.gms.internal.play_billing.u0;
import e4.j;
import e4.l;
import e4.o;
import e4.r;
import f4.k;
import j8.d;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import v3.q;
import v3.z;
import w3.g;

/* JADX INFO: loaded from: classes.dex */
public final class c implements g, e, w3.c {
    public static final String L = q.f("GreedyScheduler");
    public final r E;
    public final v3.b F;
    public Boolean H;
    public final i I;
    public final h4.b J;
    public final d K;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f22614d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f22616i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f22617v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final w3.e f22620y;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f22615e = new HashMap();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f22618w = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final l f22619x = new l(21);
    public final HashMap G = new HashMap();

    public c(Context context, v3.b bVar, c4.l lVar, w3.e eVar, r rVar, h4.b bVar2) {
        this.f22614d = context;
        ph.c cVar = bVar.f21384f;
        this.f22616i = new a(this, cVar, bVar.f21381c);
        this.K = new d(cVar, rVar);
        this.J = bVar2;
        this.I = new i(lVar);
        this.F = bVar;
        this.f22620y = eVar;
        this.E = rVar;
    }

    @Override // w3.g
    public final boolean a() {
        return false;
    }

    @Override // a4.e
    public final void b(o oVar, a4.c cVar) {
        j jVarH = a.a.h(oVar);
        boolean z5 = cVar instanceof a4.a;
        r rVar = this.E;
        d dVar = this.K;
        String str = L;
        l lVar = this.f22619x;
        if (!z5) {
            q.d().a(str, "Constraints not met: Cancelling work ID " + jVarH);
            w3.j workSpecId = lVar.v(jVarH);
            if (workSpecId != null) {
                dVar.a(workSpecId);
                int i7 = ((a4.b) cVar).f121a;
                rVar.getClass();
                Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
                rVar.O(workSpecId, i7);
                return;
            }
            return;
        }
        if (lVar.g(jVarH)) {
            return;
        }
        q.d().a(str, "Constraints met: Scheduling work ID " + jVarH);
        w3.j workSpecId2 = lVar.w(jVarH);
        dVar.b(workSpecId2);
        rVar.getClass();
        Intrinsics.checkNotNullParameter(workSpecId2, "workSpecId");
        Intrinsics.checkNotNullParameter(workSpecId2, "workSpecId");
        ((h4.b) rVar.f8035i).a(new t((w3.e) rVar.f8034e, workSpecId2, (io.sentry.internal.debugmeta.c) null));
    }

    @Override // w3.g
    public final void c(String str) {
        Runnable runnable;
        if (this.H == null) {
            this.H = Boolean.valueOf(k.a(this.f22614d, this.F));
        }
        boolean zBooleanValue = this.H.booleanValue();
        String str2 = L;
        if (!zBooleanValue) {
            q.d().e(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f22617v) {
            this.f22620y.a(this);
            this.f22617v = true;
        }
        q.d().a(str2, "Cancelling work ID " + str);
        a aVar = this.f22616i;
        if (aVar != null && (runnable = (Runnable) aVar.f22611d.remove(str)) != null) {
            ((Handler) aVar.f22609b.f18031d).removeCallbacks(runnable);
        }
        for (w3.j workSpecId : this.f22619x.u(str)) {
            this.K.a(workSpecId);
            r rVar = this.E;
            rVar.getClass();
            Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
            rVar.O(workSpecId, -512);
        }
    }

    @Override // w3.g
    public final void d(o... oVarArr) {
        long jMax;
        if (this.H == null) {
            this.H = Boolean.valueOf(k.a(this.f22614d, this.F));
        }
        if (!this.H.booleanValue()) {
            q.d().e(L, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f22617v) {
            this.f22620y.a(this);
            this.f22617v = true;
        }
        HashSet<o> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (o spec : oVarArr) {
            if (!this.f22619x.g(a.a.h(spec))) {
                synchronized (this.f22618w) {
                    try {
                        j jVarH = a.a.h(spec);
                        b bVar = (b) this.G.get(jVarH);
                        if (bVar == null) {
                            int i7 = spec.k;
                            this.F.f21381c.getClass();
                            bVar = new b(i7, System.currentTimeMillis());
                            this.G.put(jVarH, bVar);
                        }
                        jMax = (((long) Math.max((spec.k - bVar.f22612a) - 5, 0)) * JankRecordStore.FLUSH_INTERVAL_MS) + bVar.f22613b;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                long jMax2 = Math.max(spec.a(), jMax);
                this.F.f21381c.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (spec.f7999b == z.f21435d) {
                    if (jCurrentTimeMillis < jMax2) {
                        a aVar = this.f22616i;
                        if (aVar != null) {
                            ph.c cVar = aVar.f22609b;
                            HashMap map = aVar.f22611d;
                            Runnable runnable = (Runnable) map.remove(spec.f7998a);
                            if (runnable != null) {
                                ((Handler) cVar.f18031d).removeCallbacks(runnable);
                            }
                            u0 u0Var = new u0(aVar, spec, 25, false);
                            map.put(spec.f7998a, u0Var);
                            aVar.f22610c.getClass();
                            ((Handler) cVar.f18031d).postDelayed(u0Var, jMax2 - System.currentTimeMillis());
                        }
                    } else if (spec.b()) {
                        v3.e eVar = spec.j;
                        if (eVar.f21396c) {
                            q.d().a(L, "Ignoring " + spec + ". Requires device idle.");
                        } else if (eVar.a()) {
                            q.d().a(L, "Ignoring " + spec + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(spec);
                            hashSet2.add(spec.f7998a);
                        }
                    } else if (!this.f22619x.g(a.a.h(spec))) {
                        q.d().a(L, "Starting work for " + spec.f7998a);
                        l lVar = this.f22619x;
                        lVar.getClass();
                        Intrinsics.checkNotNullParameter(spec, "spec");
                        w3.j workSpecId = lVar.w(a.a.h(spec));
                        this.K.b(workSpecId);
                        r rVar = this.E;
                        rVar.getClass();
                        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
                        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
                        ((h4.b) rVar.f8035i).a(new t((w3.e) rVar.f8034e, workSpecId, (io.sentry.internal.debugmeta.c) null));
                    }
                }
            }
        }
        synchronized (this.f22618w) {
            try {
                if (!hashSet.isEmpty()) {
                    q.d().a(L, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (o oVar : hashSet) {
                        j jVarH2 = a.a.h(oVar);
                        if (!this.f22615e.containsKey(jVarH2)) {
                            this.f22615e.put(jVarH2, a4.l.a(this.I, oVar, this.J.f10328b, this));
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // w3.c
    public final void e(j jVar, boolean z5) {
        Job job;
        w3.j jVarV = this.f22619x.v(jVar);
        if (jVarV != null) {
            this.K.a(jVarV);
        }
        synchronized (this.f22618w) {
            job = (Job) this.f22615e.remove(jVar);
        }
        if (job != null) {
            q.d().a(L, "Stopping tracking for " + jVar);
            job.f(null);
        }
        if (z5) {
            return;
        }
        synchronized (this.f22618w) {
            this.G.remove(jVar);
        }
    }
}
