package io.sentry;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Timer;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class e6 implements f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i6 f12643b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u3 f12645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12646e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile c6 f12648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile c6 f12649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile Timer f12650i;
    public final io.sentry.util.a j;
    public final io.sentry.util.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f12651l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f12652m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final io.sentry.protocol.g0 f12653n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final k1 f12654o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final io.sentry.protocol.c f12655p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f12656q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r6 f12657r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.v f12642a = new io.sentry.protocol.v();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f12644c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d6 f12647f = d6.f12628c;

    public e6(q6 q6Var, u3 u3Var, r6 r6Var, k kVar) {
        this.f12650i = null;
        io.sentry.util.a aVar = new io.sentry.util.a();
        this.j = aVar;
        this.k = new io.sentry.util.a();
        this.f12651l = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f12652m = atomicBoolean;
        io.sentry.protocol.c cVar = new io.sentry.protocol.c();
        this.f12655p = cVar;
        i6 i6Var = new i6(q6Var, this, u3Var, r6Var);
        this.f12643b = i6Var;
        this.f12646e = q6Var.M;
        this.f12654o = q6Var.I;
        this.f12645d = u3Var;
        Boolean bool = Boolean.TRUE;
        kVar = bool.equals(i6Var.t()) ? kVar : null;
        this.f12656q = kVar;
        this.f12653n = q6Var.N;
        this.f12657r = r6Var;
        y(i6Var);
        io.sentry.protocol.v vVarX = x();
        if (!vVarX.equals(io.sentry.protocol.v.f13055e) && bool.equals(i6Var.t())) {
            cVar.k(new e3(vVarX), "profile");
        }
        if (kVar != null) {
            kVar.e(this);
        }
        if (r6Var.f13093g == null && r6Var.f13094h == null) {
            return;
        }
        boolean z5 = true;
        this.f12650i = new Timer(true);
        Long l6 = r6Var.f13094h;
        if (l6 != null) {
            r rVarA = aVar.a();
            try {
                if (this.f12650i != null) {
                    t();
                    atomicBoolean.set(true);
                    this.f12649h = new c6(this, 1);
                    try {
                        this.f12650i.schedule(this.f12649h, l6.longValue());
                    } catch (Throwable th2) {
                        this.f12645d.l().getLogger().g(SentryLevel.WARNING, "Failed to schedule finish timer", th2);
                        m6 m6VarA = a();
                        if (m6VarA == null) {
                            m6VarA = m6.DEADLINE_EXCEEDED;
                        }
                        if (this.f12657r.f13093g == null) {
                            z5 = false;
                        }
                        d(m6VarA, z5, null);
                        this.f12652m.set(false);
                    }
                }
                rVarA.close();
            } catch (Throwable th3) {
                try {
                    rVarA.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        m();
    }

    @Override // io.sentry.ISpan
    public final m6 a() {
        return this.f12643b.f12746c.f12788y;
    }

    @Override // io.sentry.ISpan
    public final o6 b() {
        u3 u3Var = this.f12645d;
        if (u3Var.l().isTraceSampling()) {
            i6 i6Var = this.f12643b;
            j6 j6Var = i6Var.f12746c;
            j6 j6Var2 = i6Var.f12746c;
            c cVar = j6Var.J;
            if (cVar != null) {
                r rVarA = this.k.a();
                try {
                    if (cVar.f12506e) {
                        AtomicReference atomicReference = new AtomicReference();
                        if (u3Var.isEnabled()) {
                            try {
                                atomicReference.set(u3Var.f13219e.b(null).y());
                            } catch (Throwable th2) {
                                u3Var.l().getLogger().g(SentryLevel.ERROR, "Error in the 'configureScope' callback.", th2);
                            }
                        } else {
                            u3Var.l().getLogger().q(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                        }
                        cVar.c(j6Var2.f12782d, (io.sentry.protocol.v) atomicReference.get(), u3Var.l(), j6Var2.f12785v, this.f12646e, this.f12653n);
                        cVar.f12506e = false;
                    }
                    rVarA.close();
                    return cVar.d();
                } catch (Throwable th3) {
                    try {
                        rVarA.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            }
        }
        return null;
    }

    @Override // io.sentry.ISpan
    public final ISpan c(String str, j4 j4Var, k1 k1Var) {
        return r("activity.load", str, j4Var, k1Var, new a3.f(6, false));
    }

    @Override // io.sentry.f1
    public final void d(m6 m6Var, boolean z5, Hint hint) {
        if (this.f12643b.f12749f) {
            return;
        }
        j4 j4VarNow = this.f12645d.l().getDateProvider().now();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.f12644c);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            i6 i6Var = (i6) listIterator.previous();
            i6Var.f12752i = null;
            i6Var.q(m6Var, j4VarNow);
        }
        w(m6Var, j4VarNow, z5, hint);
    }

    @Override // io.sentry.ISpan
    public final void e(Number number, String str) {
        this.f12643b.e(number, str);
    }

    @Override // io.sentry.ISpan
    public final void f(m6 m6Var) {
        q(m6Var, null);
    }

    @Override // io.sentry.ISpan
    public final void g() {
        q(a(), null);
    }

    @Override // io.sentry.ISpan
    public final String getDescription() {
        return this.f12643b.f12746c.f12787x;
    }

    @Override // io.sentry.f1
    public final String getName() {
        return this.f12646e;
    }

    @Override // io.sentry.ISpan
    public final void h(Object obj, String str) {
        i6 i6Var = this.f12643b;
        if (i6Var.f12749f) {
            this.f12645d.l().getLogger().q(SentryLevel.DEBUG, "The transaction is already finished. Data %s cannot be set", str);
        } else {
            i6Var.h(obj, str);
        }
    }

    @Override // io.sentry.f1
    public final ISpan i() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(this.f12644c);
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (listIterator.hasPrevious()) {
            i6 i6Var = (i6) listIterator.previous();
            if (!i6Var.f12749f) {
                return i6Var;
            }
        }
        return null;
    }

    @Override // io.sentry.ISpan
    public final boolean isFinished() {
        return this.f12643b.f12749f;
    }

    @Override // io.sentry.ISpan
    public final void j(String str) {
        i6 i6Var = this.f12643b;
        if (i6Var.f12749f) {
            this.f12645d.l().getLogger().q(SentryLevel.DEBUG, "The transaction is already finished. Description %s cannot be set", str);
        } else {
            i6Var.f12746c.f12787x = str;
        }
    }

    @Override // io.sentry.f1
    public final io.sentry.protocol.v k() {
        return this.f12642a;
    }

    @Override // io.sentry.ISpan
    public final ISpan l(String str) {
        return r(str, null, null, k1.SENTRY, new a3.f(6, false));
    }

    @Override // io.sentry.f1
    public final void m() {
        Long l6;
        r rVarA = this.j.a();
        try {
            if (this.f12650i != null && (l6 = this.f12657r.f13093g) != null) {
                u();
                this.f12651l.set(true);
                this.f12648g = new c6(this, 0);
                try {
                    this.f12650i.schedule(this.f12648g, l6.longValue());
                } catch (Throwable th2) {
                    this.f12645d.l().getLogger().g(SentryLevel.WARNING, "Failed to schedule finish timer", th2);
                    m6 m6VarA = a();
                    if (m6VarA == null) {
                        m6VarA = m6.OK;
                    }
                    q(m6VarA, null);
                    this.f12651l.set(false);
                }
            }
            rVarA.close();
        } catch (Throwable th3) {
            try {
                rVarA.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // io.sentry.ISpan
    public final void makeCurrent() {
        u3 u3Var = this.f12645d;
        if (!u3Var.isEnabled()) {
            u3Var.l().getLogger().q(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            u3Var.f13219e.b(null).O(this);
        } catch (Throwable th2) {
            u3Var.l().getLogger().g(SentryLevel.ERROR, "Error in the 'configureScope' callback.", th2);
        }
    }

    @Override // io.sentry.ISpan
    public final void n(String str, Long l6, c2 c2Var) {
        this.f12643b.n(str, l6, c2Var);
    }

    @Override // io.sentry.ISpan
    public final j6 o() {
        return this.f12643b.f12746c;
    }

    @Override // io.sentry.ISpan
    public final j4 p() {
        return this.f12643b.f12745b;
    }

    @Override // io.sentry.ISpan
    public final void q(m6 m6Var, j4 j4Var) {
        w(m6Var, j4Var, true, null);
    }

    @Override // io.sentry.ISpan
    public final ISpan r(String str, String str2, j4 j4Var, k1 k1Var, a3.f fVar) {
        boolean z5 = this.f12643b.f12749f;
        t2 t2Var = t2.f13155a;
        if (z5 || !this.f12654o.equals(k1Var)) {
            return t2Var;
        }
        int size = this.f12644c.size();
        u3 u3Var = this.f12645d;
        if (size < u3Var.l().getMaxSpans()) {
            return this.f12643b.r(str, str2, j4Var, k1Var, fVar);
        }
        u3Var.l().getLogger().q(SentryLevel.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
        return t2Var;
    }

    @Override // io.sentry.ISpan
    public final j4 s() {
        return this.f12643b.f12744a;
    }

    public final void t() {
        r rVarA = this.j.a();
        try {
            if (this.f12649h != null) {
                this.f12649h.cancel();
                this.f12652m.set(false);
                this.f12649h = null;
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

    public final void u() {
        r rVarA = this.j.a();
        try {
            if (this.f12648g != null) {
                this.f12648g.cancel();
                this.f12651l.set(false);
                this.f12648g = null;
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

    public final ISpan v(j6 j6Var, a3.f fVar) {
        boolean z5 = this.f12643b.f12749f;
        t2 t2Var = t2.f13155a;
        if (!z5 && this.f12654o.equals(j6Var.I)) {
            u3 u3Var = this.f12645d;
            if (!io.sentry.util.k.a((String) fVar.f70d, u3Var.l().getIgnoredSpanOrigins())) {
                l6 l6Var = j6Var.f12784i;
                String str = j6Var.f12786w;
                String str2 = j6Var.f12787x;
                CopyOnWriteArrayList copyOnWriteArrayList = this.f12644c;
                if (copyOnWriteArrayList.size() >= u3Var.l().getMaxSpans()) {
                    u3Var.l().getLogger().q(SentryLevel.WARNING, "Span operation: %s, description: %s dropped due to limit reached. Returning NoOpSpan.", str, str2);
                    return t2Var;
                }
                com.facebook.imagepipeline.nativecode.c.H(l6Var, "parentSpanId is required");
                com.facebook.imagepipeline.nativecode.c.H(str, "operation is required");
                u();
                i6 i6Var = new i6(this, this.f12645d, j6Var, fVar, new gc.o(11, this));
                y(i6Var);
                copyOnWriteArrayList.add(i6Var);
                k kVar = this.f12656q;
                if (kVar != null) {
                    kVar.d(i6Var);
                }
                return i6Var;
            }
        }
        return t2Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    public final void w(m6 m6Var, j4 j4Var, boolean z5, Hint hint) {
        g3 g3VarF;
        j4 j4Var2 = this.f12643b.f12745b;
        if (j4Var == null) {
            j4Var = j4Var2;
        }
        if (j4Var == null) {
            j4Var = this.f12645d.l().getDateProvider().now();
        }
        Iterator it = this.f12644c.iterator();
        while (it.hasNext()) {
            ((i6) it.next()).f12751h.getClass();
        }
        this.f12647f = new d6(true, m6Var);
        if (this.f12643b.f12749f) {
            return;
        }
        if (this.f12657r.f13092f) {
            ListIterator listIterator = this.f12644c.listIterator();
            while (listIterator.hasNext()) {
                i6 i6Var = (i6) listIterator.next();
                if (!i6Var.f12749f && i6Var.f12745b == null) {
                    return;
                }
            }
        }
        AtomicReference atomicReference = new AtomicReference();
        i6 i6Var2 = this.f12643b;
        i6Var2.f12752i = new ac.b(this, i6Var2.f12752i, atomicReference, 8);
        i6Var2.q(this.f12647f.f12630b, j4Var);
        Boolean bool = Boolean.TRUE;
        if (bool.equals(this.f12643b.t())) {
            e9.b bVar = this.f12643b.f12746c.f12785v;
            if (bool.equals(bVar == null ? null : (Boolean) bVar.f8112v)) {
                g3VarF = this.f12645d.l().getTransactionProfiler().f(this, (List) atomicReference.get(), this.f12645d.l());
            } else {
                g3VarF = null;
            }
        } else {
            g3VarF = null;
        }
        if (this.f12645d.l().isContinuousProfilingEnabled()) {
            f3 profileLifecycle = this.f12645d.l().getProfileLifecycle();
            f3 f3Var = f3.TRACE;
            if (profileLifecycle == f3Var && this.f12643b.f12746c.L.equals(io.sentry.protocol.v.f13055e)) {
                this.f12645d.l().getContinuousProfiler().b(f3Var);
            }
        }
        if (atomicReference.get() != null) {
            ((List) atomicReference.get()).clear();
        }
        u3 u3Var = this.f12645d;
        if (u3Var.isEnabled()) {
            try {
                IScope iScopeB = u3Var.f13219e.b(null);
                iScopeB.M(new bc.i(26, this, iScopeB));
            } catch (Throwable th2) {
                u3Var.l().getLogger().g(SentryLevel.ERROR, "Error in the 'configureScope' callback.", th2);
            }
        } else {
            u3Var.l().getLogger().q(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
        }
        io.sentry.protocol.d0 d0Var = new io.sentry.protocol.d0(this);
        if (this.f12650i != null) {
            r rVarA = this.j.a();
            try {
                if (this.f12650i != null) {
                    u();
                    t();
                    this.f12650i.cancel();
                    this.f12650i = null;
                }
                rVarA.close();
            } catch (Throwable th3) {
                try {
                    rVarA.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        if (z5 && this.f12644c.isEmpty() && this.f12657r.f13093g != null) {
            this.f12645d.l().getLogger().q(SentryLevel.DEBUG, "Dropping idle transaction %s because it has no child spans", this.f12646e);
        } else {
            d0Var.Q.putAll(this.f12643b.k);
            this.f12645d.v(d0Var, b(), hint, g3VarF);
        }
    }

    public final io.sentry.protocol.v x() {
        i6 i6Var = this.f12643b;
        return !i6Var.f12746c.L.equals(io.sentry.protocol.v.f13055e) ? i6Var.f12746c.L : this.f12645d.l().getContinuousProfiler().e();
    }

    public final void y(i6 i6Var) {
        io.sentry.util.thread.a threadChecker = this.f12645d.l().getThreadChecker();
        io.sentry.protocol.v vVarX = x();
        if (!vVarX.equals(io.sentry.protocol.v.f13055e) && Boolean.TRUE.equals(i6Var.t())) {
            i6Var.h(vVarX.toString(), "profiler_id");
        }
        i6Var.h(String.valueOf(threadChecker.b()), "thread.id");
        i6Var.h(threadChecker.a(), "thread.name");
    }
}
