package io.sentry;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class p3 implements IScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f1 f12866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f12867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public io.sentry.protocol.h0 f12868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public io.sentry.protocol.p f12870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f12871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile Object f12872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f12873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f12874i;
    public final CopyOnWriteArrayList j;
    public volatile w5 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile h6 f12875l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final io.sentry.util.a f12876m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final io.sentry.util.a f12877n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final io.sentry.util.a f12878o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final io.sentry.protocol.c f12879p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f12880q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e4.m f12881r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public io.sentry.protocol.v f12882s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public z0 f12883t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Map f12884u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final io.sentry.featureflags.b f12885v;

    public p3(w5 w5Var) {
        io.sentry.featureflags.b bVar;
        this.f12867b = new WeakReference(null);
        this.f12871f = new ArrayList();
        this.f12873h = new ConcurrentHashMap();
        this.f12874i = new ConcurrentHashMap();
        this.j = new CopyOnWriteArrayList();
        this.f12876m = new io.sentry.util.a();
        this.f12877n = new io.sentry.util.a();
        this.f12878o = new io.sentry.util.a();
        this.f12879p = new io.sentry.protocol.c();
        this.f12880q = new CopyOnWriteArrayList();
        this.f12882s = io.sentry.protocol.v.f13055e;
        this.f12883t = q2.f13080a;
        this.f12884u = Collections.synchronizedMap(new WeakHashMap());
        com.facebook.imagepipeline.nativecode.c.H(w5Var, "SentryOptions is required.");
        this.k = w5Var;
        this.f12872g = b(this.k.getMaxBreadcrumbs());
        if (w5Var.getMaxFeatureFlags() > 0) {
            io.sentry.featureflags.a aVar = new io.sentry.featureflags.a();
            new io.sentry.util.a();
            aVar.f12678d = new CopyOnWriteArrayList();
            bVar = aVar;
        } else {
            bVar = io.sentry.featureflags.c.f12679d;
        }
        this.f12885v = bVar;
        this.f12881r = new e4.m();
    }

    public static Queue b(int i7) {
        return i7 > 0 ? new n6(new f(i7)) : new x();
    }

    @Override // io.sentry.IScope
    public final h6 A(n3 n3Var) {
        r rVarA = this.f12876m.a();
        try {
            n3Var.a(this.f12875l);
            h6 h6VarClone = this.f12875l != null ? this.f12875l.clone() : null;
            rVarA.close();
            return h6VarClone;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.IScope
    public final void B(String str) {
        this.f12869d = str;
        io.sentry.protocol.c cVar = this.f12879p;
        io.sentry.protocol.a aVarD = cVar.d();
        if (aVarD == null) {
            aVarD = new io.sentry.protocol.a();
            cVar.n(aVarD);
        }
        if (str == null) {
            aVarD.F = null;
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            aVarD.F = arrayList;
        }
        Iterator<w0> it = this.k.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().g(cVar);
        }
    }

    @Override // io.sentry.IScope
    public final z0 C() {
        return this.f12883t;
    }

    @Override // io.sentry.IScope
    public final Map D() {
        return xr.m.F(this.f12873h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    @Override // io.sentry.IScope
    public final void E() {
        this.f12872g.clear();
        Iterator<w0> it = this.k.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().a(this.f12872g);
        }
    }

    @Override // io.sentry.IScope
    public final List F() {
        return this.j;
    }

    @Override // io.sentry.IScope
    public final void G(Object obj, String str) {
        if (str == null) {
            return;
        }
        this.f12879p.k(obj, str);
        Iterator<w0> it = this.k.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().g(this.f12879p);
        }
    }

    @Override // io.sentry.IScope
    public final List H() {
        return new CopyOnWriteArrayList(this.f12880q);
    }

    @Override // io.sentry.IScope
    public final void I(SentryEvent sentryEvent) {
        if (!this.k.isTracingEnabled() || sentryEvent.a() == null) {
            return;
        }
        Map map = this.f12884u;
        Throwable thA = sentryEvent.a();
        com.facebook.imagepipeline.nativecode.c.H(thA, "throwable cannot be null");
        while (thA.getCause() != null && thA.getCause() != thA) {
            thA = thA.getCause();
        }
    }

    @Override // io.sentry.IScope
    public final io.sentry.protocol.c J() {
        return this.f12879p;
    }

    @Override // io.sentry.IScope
    public final void K() {
        this.f12875l = null;
    }

    @Override // io.sentry.IScope
    public final e4.m L(m3 m3Var) {
        r rVarA = this.f12878o.a();
        try {
            m3Var.d(this.f12881r);
            e4.m mVar = new e4.m(this.f12881r);
            rVarA.close();
            return mVar;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.IScope
    public final void M(o3 o3Var) {
        r rVarA = this.f12877n.a();
        try {
            o3Var.b(this.f12866a);
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.IScope
    public final void N(io.sentry.protocol.v vVar) {
    }

    @Override // io.sentry.IScope
    public final void O(f1 f1Var) {
        r rVarA = this.f12877n.a();
        try {
            this.f12866a = f1Var;
            for (w0 w0Var : this.k.getScopeObservers()) {
                if (f1Var != null) {
                    w0Var.l(f1Var.getName());
                    w0Var.e(f1Var.o(), this);
                } else {
                    w0Var.l(null);
                    w0Var.e(null, this);
                }
            }
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.IScope
    public final List P() {
        return this.f12871f;
    }

    @Override // io.sentry.IScope
    public final io.sentry.protocol.h0 Q() {
        return this.f12868c;
    }

    @Override // io.sentry.IScope
    public final io.sentry.protocol.p R() {
        return this.f12870e;
    }

    @Override // io.sentry.IScope
    public final List S() {
        return yk.a.H(this.j);
    }

    @Override // io.sentry.IScope
    public final String T() {
        f1 f1Var = this.f12866a;
        if (f1Var != null) {
            return f1Var.getName();
        }
        return null;
    }

    @Override // io.sentry.IScope
    public final String a() {
        return this.f12869d;
    }

    @Override // io.sentry.IScope
    public final void c(Breadcrumb breadcrumb) {
        g(breadcrumb, null);
    }

    @Override // io.sentry.IScope
    public final void clear() {
        this.f12868c = null;
        this.f12870e = null;
        this.f12869d = null;
        this.f12871f.clear();
        E();
        this.f12873h.clear();
        this.f12874i.clear();
        this.j.clear();
        r();
        this.f12880q.clear();
    }

    @Override // io.sentry.IScope
    /* JADX INFO: renamed from: clone */
    public final IScope m1261clone() {
        return new p3(this);
    }

    @Override // io.sentry.IScope
    public final void f(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            this.f12873h.remove(str);
            for (w0 w0Var : this.k.getScopeObservers()) {
                w0Var.n(str);
                w0Var.d(this.f12873h);
            }
            return;
        }
        this.f12873h.put(str, str2);
        for (w0 w0Var2 : this.k.getScopeObservers()) {
            w0Var2.f(str, str2);
            w0Var2.d(this.f12873h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.Queue] */
    @Override // io.sentry.IScope
    public final void g(Breadcrumb breadcrumb, Hint hint) {
        if (breadcrumb == null || (this.f12872g instanceof x)) {
            return;
        }
        if (hint == null) {
            hint = new Hint();
        }
        h5 beforeBreadcrumb = this.k.getBeforeBreadcrumb();
        if (beforeBreadcrumb != null) {
            try {
                breadcrumb = beforeBreadcrumb.execute(breadcrumb, hint);
            } catch (Throwable th2) {
                this.k.getLogger().g(SentryLevel.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb.", th2);
                if (th2.getMessage() != null) {
                    breadcrumb.c(th2.getMessage(), "sentry:message");
                }
            }
        }
        if (breadcrumb == null) {
            this.k.getLogger().q(SentryLevel.INFO, "Breadcrumb was dropped by beforeBreadcrumb", new Object[0]);
            return;
        }
        this.f12872g.add(breadcrumb);
        for (w0 w0Var : this.k.getScopeObservers()) {
            w0Var.c(breadcrumb);
            w0Var.a(this.f12872g);
        }
    }

    @Override // io.sentry.IScope
    public final Map getExtras() {
        return this.f12874i;
    }

    @Override // io.sentry.IScope
    public final io.sentry.protocol.h h() {
        return this.f12885v.h();
    }

    @Override // io.sentry.IScope
    public final void i(List list) {
        if (list == null) {
            return;
        }
        this.f12871f = new ArrayList(list);
        Iterator<w0> it = this.k.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().i(list);
        }
    }

    @Override // io.sentry.IScope
    public final void j(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            this.f12874i.remove(str);
            for (w0 w0Var : this.k.getScopeObservers()) {
                w0Var.b(str);
                w0Var.h(this.f12874i);
            }
            return;
        }
        this.f12874i.put(str, str2);
        for (w0 w0Var2 : this.k.getScopeObservers()) {
            w0Var2.j(str, str2);
            w0Var2.h(this.f12874i);
        }
    }

    @Override // io.sentry.IScope
    public final void k(io.sentry.protocol.v vVar) {
        this.f12882s = vVar;
        Iterator<w0> it = this.k.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().k(vVar);
        }
    }

    @Override // io.sentry.IScope
    public final w5 l() {
        return this.k;
    }

    @Override // io.sentry.IScope
    public final void m(io.sentry.protocol.h0 h0Var) {
        this.f12868c = h0Var;
        Iterator<w0> it = this.k.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().m(h0Var);
        }
    }

    @Override // io.sentry.IScope
    public final f1 n() {
        return this.f12866a;
    }

    @Override // io.sentry.IScope
    public final h6 o() {
        r rVarA = this.f12876m.a();
        try {
            h6 h6Var = null;
            if (this.f12875l != null) {
                h6 h6Var2 = this.f12875l;
                h6Var2.getClass();
                h6Var2.b(io.sentry.config.a.y());
                this.k.getContinuousProfiler().d();
                h6 h6VarClone = this.f12875l.clone();
                this.f12875l = null;
                h6Var = h6VarClone;
            }
            rVarA.close();
            return h6Var;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.IScope
    public final io.sentry.internal.debugmeta.c p() {
        r rVarA = this.f12876m.a();
        try {
            if (this.f12875l != null) {
                h6 h6Var = this.f12875l;
                h6Var.getClass();
                h6Var.b(io.sentry.config.a.y());
                this.k.getContinuousProfiler().d();
            }
            h6 h6Var2 = this.f12875l;
            io.sentry.internal.debugmeta.c cVar = null;
            if (this.k.getRelease() != null) {
                String distinctId = this.k.getDistinctId();
                io.sentry.protocol.h0 h0Var = this.f12868c;
                this.f12875l = new h6(g6.Ok, io.sentry.config.a.y(), io.sentry.config.a.y(), 0, distinctId, ls.l.r(), Boolean.TRUE, null, null, h0Var != null ? h0Var.f12959v : null, null, this.k.getEnvironment(), this.k.getRelease(), null);
                cVar = new io.sentry.internal.debugmeta.c(10, this.f12875l.clone(), h6Var2 != null ? h6Var2.clone() : null);
            } else {
                this.k.getLogger().q(SentryLevel.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
            }
            rVarA.close();
            return cVar;
        } catch (Throwable th2) {
            try {
                rVarA.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    @Override // io.sentry.IScope
    public final void q(e4.m mVar) {
        this.f12881r = mVar;
        j6 j6Var = new j6((io.sentry.protocol.v) mVar.f7993e, (l6) mVar.f7994i, "default", null);
        j6Var.F = "auto";
        Iterator<w0> it = this.k.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().e(j6Var, this);
        }
    }

    @Override // io.sentry.IScope
    public final void r() {
        r rVarA = this.f12877n.a();
        try {
            this.f12866a = null;
            rVarA.close();
            for (w0 w0Var : this.k.getScopeObservers()) {
                w0Var.l(null);
                w0Var.e(null, this);
            }
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.IScope
    public final io.sentry.featureflags.b s() {
        return this.f12885v;
    }

    @Override // io.sentry.IScope
    public final ISpan t() {
        ISpan iSpanI;
        ISpan iSpan = (ISpan) this.f12867b.get();
        if (iSpan != null) {
            return iSpan;
        }
        f1 f1Var = this.f12866a;
        return (f1Var == null || (iSpanI = f1Var.i()) == null) ? f1Var : iSpanI;
    }

    @Override // io.sentry.IScope
    public final void u(String str) {
        if (str == null) {
            return;
        }
        this.f12879p.m(str);
    }

    @Override // io.sentry.IScope
    public final h6 v() {
        return this.f12875l;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    @Override // io.sentry.IScope
    public final Queue w() {
        return this.f12872g;
    }

    @Override // io.sentry.IScope
    public final SentryLevel x() {
        return null;
    }

    @Override // io.sentry.IScope
    public final io.sentry.protocol.v y() {
        return this.f12882s;
    }

    @Override // io.sentry.IScope
    public final e4.m z() {
        return this.f12881r;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m1265clone() {
        return new p3(this);
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.Collection] */
    public p3(p3 p3Var) {
        io.sentry.protocol.h0 h0Var;
        io.sentry.protocol.p pVar = null;
        this.f12867b = new WeakReference(null);
        this.f12871f = new ArrayList();
        this.f12873h = new ConcurrentHashMap();
        this.f12874i = new ConcurrentHashMap();
        this.j = new CopyOnWriteArrayList();
        this.f12876m = new io.sentry.util.a();
        this.f12877n = new io.sentry.util.a();
        this.f12878o = new io.sentry.util.a();
        this.f12879p = new io.sentry.protocol.c();
        this.f12880q = new CopyOnWriteArrayList();
        this.f12882s = io.sentry.protocol.v.f13055e;
        this.f12883t = q2.f13080a;
        this.f12884u = Collections.synchronizedMap(new WeakHashMap());
        this.f12866a = p3Var.f12866a;
        this.f12867b = p3Var.f12867b;
        this.f12875l = p3Var.f12875l;
        this.k = p3Var.k;
        this.f12883t = p3Var.f12883t;
        io.sentry.protocol.h0 h0Var2 = p3Var.f12868c;
        if (h0Var2 != null) {
            h0Var = new io.sentry.protocol.h0();
            h0Var.f12956d = h0Var2.f12956d;
            h0Var.f12958i = h0Var2.f12958i;
            h0Var.f12957e = h0Var2.f12957e;
            h0Var.f12959v = h0Var2.f12959v;
            h0Var.f12960w = h0Var2.f12960w;
            h0Var.f12961x = h0Var2.f12961x;
            h0Var.f12962y = xr.m.F(h0Var2.f12962y);
            h0Var.E = xr.m.F(h0Var2.E);
        } else {
            h0Var = null;
        }
        this.f12868c = h0Var;
        this.f12869d = p3Var.f12869d;
        this.f12882s = p3Var.f12882s;
        io.sentry.protocol.p pVar2 = p3Var.f12870e;
        if (pVar2 != null) {
            pVar = new io.sentry.protocol.p();
            pVar.f13013d = pVar2.f13013d;
            pVar.f13017w = pVar2.f13017w;
            pVar.f13014e = pVar2.f13014e;
            pVar.f13015i = pVar2.f13015i;
            pVar.f13018x = xr.m.F(pVar2.f13018x);
            pVar.f13019y = xr.m.F(pVar2.f13019y);
            pVar.F = xr.m.F(pVar2.F);
            pVar.I = xr.m.F(pVar2.I);
            pVar.f13016v = pVar2.f13016v;
            pVar.G = pVar2.G;
            pVar.E = pVar2.E;
            pVar.H = pVar2.H;
        }
        this.f12870e = pVar;
        this.f12871f = new ArrayList(p3Var.f12871f);
        this.j = new CopyOnWriteArrayList(p3Var.j);
        Breadcrumb[] breadcrumbArr = (Breadcrumb[]) p3Var.f12872g.toArray(new Breadcrumb[0]);
        Queue queueB = b(p3Var.k.getMaxBreadcrumbs());
        for (Breadcrumb breadcrumb : breadcrumbArr) {
            queueB.add(new Breadcrumb(breadcrumb));
        }
        this.f12872g = queueB;
        ConcurrentHashMap concurrentHashMap = p3Var.f12873h;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (entry != null) {
                concurrentHashMap2.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.f12873h = concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3 = p3Var.f12874i;
        ConcurrentHashMap concurrentHashMap4 = new ConcurrentHashMap();
        for (Map.Entry entry2 : concurrentHashMap3.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap4.put((String) entry2.getKey(), entry2.getValue());
            }
        }
        this.f12874i = concurrentHashMap4;
        this.f12879p = new io.sentry.protocol.c(p3Var.f12879p);
        this.f12880q = new CopyOnWriteArrayList(p3Var.f12880q);
        this.f12885v = p3Var.f12885v.m1258clone();
        this.f12881r = new e4.m(p3Var.f12881r);
    }
}
