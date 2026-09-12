package io.sentry;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class j6 implements y1 {
    public ConcurrentHashMap E;
    public String F;
    public Map G;
    public ConcurrentHashMap H;
    public k1 I;
    public c J;
    public final fj.c K;
    public final io.sentry.protocol.v L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io.sentry.protocol.v f12782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l6 f12783e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l6 f12784i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public transient e9.b f12785v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f12786w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f12787x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public m6 f12788y;

    public j6(io.sentry.protocol.v vVar, l6 l6Var, String str, l6 l6Var2) {
        this(vVar, l6Var, l6Var2, str, null, null, null, "manual");
    }

    public final void a(e9.b bVar) {
        this.f12785v = bVar;
        c cVar = this.J;
        if (cVar == null || bVar == null) {
            return;
        }
        Boolean bool = (Boolean) bVar.f8109d;
        Charset charset = io.sentry.util.l.f13233a;
        cVar.b("sentry-sampled", bool == null ? null : bool.toString());
        Double d6 = (Double) bVar.f8111i;
        if (d6 != null && cVar.f12506e) {
            cVar.f12505d = d6;
        }
        Double d7 = (Double) bVar.f8110e;
        if (d7 != null) {
            cVar.f12504c = d7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6)) {
            return false;
        }
        j6 j6Var = (j6) obj;
        return this.f12782d.equals(j6Var.f12782d) && this.f12783e.equals(j6Var.f12783e) && com.facebook.imagepipeline.nativecode.c.r(this.f12784i, j6Var.f12784i) && this.f12786w.equals(j6Var.f12786w) && com.facebook.imagepipeline.nativecode.c.r(this.f12787x, j6Var.f12787x) && this.f12788y == j6Var.f12788y;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12782d, this.f12783e, this.f12784i, this.f12786w, this.f12787x, this.f12788y});
    }

    @Override // io.sentry.y1
    public final void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        y2Var.v("trace_id");
        this.f12782d.serialize(y2Var, iLogger);
        y2Var.v("span_id");
        this.f12783e.serialize(y2Var, iLogger);
        l6 l6Var = this.f12784i;
        if (l6Var != null) {
            y2Var.v("parent_span_id");
            l6Var.serialize(y2Var, iLogger);
        }
        y2Var.v("op").f(this.f12786w);
        if (this.f12787x != null) {
            y2Var.v("description").f(this.f12787x);
        }
        if (this.f12788y != null) {
            y2Var.v("status").r(iLogger, this.f12788y);
        }
        if (this.F != null) {
            y2Var.v("origin").r(iLogger, this.F);
        }
        if (!this.E.isEmpty()) {
            y2Var.v("tags").r(iLogger, this.E);
        }
        if (!this.G.isEmpty()) {
            y2Var.v("data").r(iLogger, this.G);
        }
        ConcurrentHashMap concurrentHashMap = this.H;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                y2Var.v(str).r(iLogger, this.H.get(str));
            }
        }
        y2Var.l();
    }

    public j6(io.sentry.protocol.v vVar, l6 l6Var, l6 l6Var2, String str, String str2, e9.b bVar, m6 m6Var, String str3) {
        this.E = new ConcurrentHashMap();
        this.F = "manual";
        this.G = new ConcurrentHashMap();
        this.I = k1.SENTRY;
        this.K = new fj.c(21);
        this.L = io.sentry.protocol.v.f13055e;
        com.facebook.imagepipeline.nativecode.c.H(vVar, "traceId is required");
        this.f12782d = vVar;
        com.facebook.imagepipeline.nativecode.c.H(l6Var, "spanId is required");
        this.f12783e = l6Var;
        com.facebook.imagepipeline.nativecode.c.H(str, "operation is required");
        this.f12786w = str;
        this.f12784i = l6Var2;
        this.f12787x = str2;
        this.f12788y = m6Var;
        this.F = str3;
        a(bVar);
        io.sentry.util.thread.a threadChecker = c4.f().l().getThreadChecker();
        this.G.put("thread.id", String.valueOf(threadChecker.b()));
        this.G.put("thread.name", threadChecker.a());
    }

    public j6(j6 j6Var) {
        this.E = new ConcurrentHashMap();
        this.F = "manual";
        this.G = new ConcurrentHashMap();
        this.I = k1.SENTRY;
        this.K = new fj.c(21);
        this.L = io.sentry.protocol.v.f13055e;
        this.f12782d = j6Var.f12782d;
        this.f12783e = j6Var.f12783e;
        this.f12784i = j6Var.f12784i;
        a(j6Var.f12785v);
        this.f12786w = j6Var.f12786w;
        this.f12787x = j6Var.f12787x;
        this.f12788y = j6Var.f12788y;
        ConcurrentHashMap concurrentHashMapF = xr.m.F(j6Var.E);
        if (concurrentHashMapF != null) {
            this.E = concurrentHashMapF;
        }
        ConcurrentHashMap concurrentHashMapF2 = xr.m.F(j6Var.H);
        if (concurrentHashMapF2 != null) {
            this.H = concurrentHashMapF2;
        }
        this.J = j6Var.J;
        ConcurrentHashMap concurrentHashMapF3 = xr.m.F(j6Var.G);
        if (concurrentHashMapF3 != null) {
            this.G = concurrentHashMapF3;
        }
    }
}
