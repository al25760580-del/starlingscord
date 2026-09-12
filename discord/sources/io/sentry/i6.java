package io.sentry;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class i6 implements ISpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j4 f12744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j4 f12745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j6 f12746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e6 f12747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0 f12748e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a3.f f12751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public k6 f12752i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12749f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f12750g = new AtomicBoolean(false);
    public final ConcurrentHashMap j = new ConcurrentHashMap();
    public final ConcurrentHashMap k = new ConcurrentHashMap();

    public i6(e6 e6Var, u3 u3Var, j6 j6Var, a3.f fVar, gc.o oVar) {
        new ConcurrentHashMap();
        new io.sentry.util.a();
        this.f12746c = j6Var;
        j6Var.F = (String) fVar.f70d;
        this.f12747d = e6Var;
        com.facebook.imagepipeline.nativecode.c.H(u3Var, "Scopes are required");
        this.f12748e = u3Var;
        this.f12751h = fVar;
        this.f12752i = oVar;
        j4 j4Var = (j4) fVar.f68b;
        if (j4Var != null) {
            this.f12744a = j4Var;
        } else {
            this.f12744a = u3Var.l().getDateProvider().now();
        }
    }

    @Override // io.sentry.ISpan
    public final m6 a() {
        return this.f12746c.f12788y;
    }

    @Override // io.sentry.ISpan
    public final ISpan c(String str, j4 j4Var, k1 k1Var) {
        return r("activity.load", str, j4Var, k1Var, new a3.f(6, false));
    }

    @Override // io.sentry.ISpan
    public final void e(Number number, String str) {
        if (this.f12749f) {
            this.f12748e.l().getLogger().q(SentryLevel.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.k.put(str, new io.sentry.protocol.l(number, null));
        e6 e6Var = this.f12747d;
        i6 i6Var = e6Var.f12643b;
        if (i6Var == this || i6Var.k.containsKey(str)) {
            return;
        }
        e6Var.e(number, str);
    }

    @Override // io.sentry.ISpan
    public final void f(m6 m6Var) {
        q(m6Var, this.f12748e.l().getDateProvider().now());
    }

    @Override // io.sentry.ISpan
    public final void g() {
        f(this.f12746c.f12788y);
    }

    @Override // io.sentry.ISpan
    public final String getDescription() {
        return this.f12746c.f12787x;
    }

    @Override // io.sentry.ISpan
    public final void h(Object obj, String str) {
        ConcurrentHashMap concurrentHashMap = this.j;
        if (obj == null) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, obj);
        }
    }

    @Override // io.sentry.ISpan
    public final boolean isFinished() {
        return this.f12749f;
    }

    @Override // io.sentry.ISpan
    public final void j(String str) {
        this.f12746c.f12787x = str;
    }

    @Override // io.sentry.ISpan
    public final ISpan l(String str) {
        if (this.f12749f) {
            return t2.f13155a;
        }
        l6 l6Var = this.f12746c.f12783e;
        e6 e6Var = this.f12747d;
        e6Var.getClass();
        a3.f fVar = new a3.f(6, false);
        j6 j6Var = e6Var.f12643b.f12746c;
        j6 j6Var2 = new j6(j6Var.f12782d, new l6(), l6Var, str, null, j6Var.f12785v, null, "manual");
        j6Var2.f12787x = null;
        j6Var2.I = k1.SENTRY;
        return e6Var.v(j6Var2, fVar);
    }

    @Override // io.sentry.ISpan
    public final void n(String str, Long l6, c2 c2Var) {
        if (this.f12749f) {
            this.f12748e.l().getLogger().q(SentryLevel.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.k.put(str, new io.sentry.protocol.l(l6, c2Var.apiName()));
        e6 e6Var = this.f12747d;
        i6 i6Var = e6Var.f12643b;
        if (i6Var == this || i6Var.k.containsKey(str)) {
            return;
        }
        e6Var.n(str, l6, c2Var);
    }

    @Override // io.sentry.ISpan
    public final j6 o() {
        return this.f12746c;
    }

    @Override // io.sentry.ISpan
    public final j4 p() {
        return this.f12745b;
    }

    @Override // io.sentry.ISpan
    public final void q(m6 m6Var, j4 j4Var) {
        List<i6> list;
        j4 j4Var2;
        j4 j4Var3;
        if (this.f12749f || !this.f12750g.compareAndSet(false, true)) {
            return;
        }
        j6 j6Var = this.f12746c;
        j6Var.f12788y = m6Var;
        l6 l6Var = j6Var.f12783e;
        if (j4Var == null) {
            j4Var = this.f12748e.l().getDateProvider().now();
        }
        this.f12745b = j4Var;
        a3.f fVar = this.f12751h;
        fVar.getClass();
        if (fVar.f67a) {
            e6 e6Var = this.f12747d;
            i6 i6Var = e6Var.f12643b;
            CopyOnWriteArrayList<i6> copyOnWriteArrayList = e6Var.f12644c;
            if (!i6Var.f12746c.f12783e.equals(l6Var)) {
                list = copyOnWriteArrayList;
                ArrayList arrayList = new ArrayList();
                for (i6 i6Var2 : copyOnWriteArrayList) {
                    l6 l6Var2 = i6Var2.f12746c.f12784i;
                    if (l6Var2 != null && l6Var2.equals(l6Var)) {
                        arrayList.add(i6Var2);
                    }
                }
                list = arrayList;
            }
            list = copyOnWriteArrayList;
            j4 j4Var4 = null;
            j4 j4Var5 = null;
            for (i6 i6Var3 : list) {
                if (j4Var4 == null || i6Var3.f12744a.b(j4Var4) < 0) {
                    j4Var4 = i6Var3.f12744a;
                }
                if (j4Var5 == null || ((j4Var3 = i6Var3.f12745b) != null && j4Var3.b(j4Var5) > 0)) {
                    j4Var5 = i6Var3.f12745b;
                }
            }
            if (fVar.f67a && j4Var5 != null && (((j4Var2 = this.f12745b) == null || j4Var2.b(j4Var5) > 0) && this.f12745b != null)) {
                this.f12745b = j4Var5;
            }
        }
        k6 k6Var = this.f12752i;
        if (k6Var != null) {
            k6Var.c(this);
        }
        this.f12749f = true;
    }

    @Override // io.sentry.ISpan
    public final ISpan r(String str, String str2, j4 j4Var, k1 k1Var, a3.f fVar) {
        if (this.f12749f) {
            return t2.f13155a;
        }
        l6 l6Var = this.f12746c.f12783e;
        e6 e6Var = this.f12747d;
        j6 j6Var = e6Var.f12643b.f12746c;
        j6 j6Var2 = new j6(j6Var.f12782d, new l6(), l6Var, str, null, j6Var.f12785v, null, "manual");
        j6Var2.f12787x = str2;
        j6Var2.I = k1Var;
        fVar.f68b = j4Var;
        return e6Var.v(j6Var2, fVar);
    }

    @Override // io.sentry.ISpan
    public final j4 s() {
        return this.f12744a;
    }

    public final Boolean t() {
        e9.b bVar = this.f12746c.f12785v;
        if (bVar == null) {
            return null;
        }
        return (Boolean) bVar.f8109d;
    }

    public i6(q6 q6Var, e6 e6Var, u3 u3Var, r6 r6Var) {
        new ConcurrentHashMap();
        new io.sentry.util.a();
        this.f12746c = q6Var;
        q6Var.F = (String) r6Var.f70d;
        this.f12747d = e6Var;
        this.f12748e = u3Var;
        this.f12752i = null;
        j4 j4Var = (j4) r6Var.f68b;
        if (j4Var != null) {
            this.f12744a = j4Var;
        } else {
            this.f12744a = u3Var.l().getDateProvider().now();
        }
        this.f12751h = r6Var;
    }
}
