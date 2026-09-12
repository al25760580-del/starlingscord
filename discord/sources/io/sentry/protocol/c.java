package io.sentry.protocol;

import com.discord.js_watchdog.SharedPreferencesKey;
import io.sentry.ILogger;
import io.sentry.e3;
import io.sentry.j6;
import io.sentry.y1;
import io.sentry.y2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class c implements y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f12923d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io.sentry.util.a f12924e = new io.sentry.util.a();

    public c() {
    }

    public boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f12923d.containsKey(obj);
    }

    public Set b() {
        return this.f12923d.entrySet();
    }

    public Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.f12923d.get(obj);
    }

    public a d() {
        return (a) x(a.class, "app");
    }

    public f e() {
        return (f) x(f.class, "device");
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        return this.f12923d.equals(((c) obj).f12923d);
    }

    public h f() {
        return (h) x(h.class, "flags");
    }

    public o g() {
        return (o) x(o.class, "os");
    }

    public x h() {
        return (x) x(x.class, "runtime");
    }

    public final int hashCode() {
        return this.f12923d.hashCode();
    }

    public j6 i() {
        return (j6) x(j6.class, SharedPreferencesKey.TRACE);
    }

    public Enumeration j() {
        return this.f12923d.keys();
    }

    public Object k(Object obj, String str) {
        if (str == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f12923d;
        return obj == null ? concurrentHashMap.remove(str) : concurrentHashMap.put(str, obj);
    }

    public void l(c cVar) {
        if (cVar == null) {
            return;
        }
        this.f12923d.putAll(cVar.f12923d);
    }

    public Object m(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.f12923d.remove(obj);
    }

    public void n(a aVar) {
        k(aVar, "app");
    }

    public void o(b bVar) {
        k(bVar, "browser");
    }

    public void p(f fVar) {
        k(fVar, "device");
    }

    public void q(h hVar) {
        k(hVar, "flags");
    }

    public void r(k kVar) {
        k(kVar, "gpu");
    }

    public void s(o oVar) {
        k(oVar, "os");
    }

    @Override // io.sentry.y1
    public void serialize(y2 y2Var, ILogger iLogger) {
        y2Var.q();
        ArrayList<String> list = Collections.list(j());
        Collections.sort(list);
        for (String str : list) {
            Object objC = c(str);
            if (objC != null) {
                y2Var.v(str).r(iLogger, objC);
            }
        }
        y2Var.l();
    }

    public void t(r rVar) {
        io.sentry.r rVarA = this.f12924e.a();
        try {
            k(rVar, "response");
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

    public void u(x xVar) {
        k(xVar, "runtime");
    }

    public void v(e0 e0Var) {
        k(e0Var, "spring");
    }

    public void w(j6 j6Var) {
        com.facebook.imagepipeline.nativecode.c.H(j6Var, "traceContext is required");
        k(j6Var, SharedPreferencesKey.TRACE);
    }

    public final Object x(Class cls, String str) {
        Object objC = c(str);
        if (cls.isInstance(objC)) {
            return cls.cast(objC);
        }
        return null;
    }

    public c(c cVar) {
        for (Map.Entry entry : cVar.b()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof a)) {
                    a aVar = (a) value;
                    a aVar2 = new a();
                    aVar2.f12913y = aVar.f12913y;
                    aVar2.f12907d = aVar.f12907d;
                    aVar2.f12911w = aVar.f12911w;
                    aVar2.f12908e = aVar.f12908e;
                    aVar2.f12912x = aVar.f12912x;
                    aVar2.f12910v = aVar.f12910v;
                    aVar2.f12909i = aVar.f12909i;
                    aVar2.E = xr.m.F(aVar.E);
                    aVar2.H = aVar.H;
                    List list = aVar.F;
                    aVar2.F = list != null ? new ArrayList(list) : null;
                    aVar2.G = aVar.G;
                    aVar2.I = aVar.I;
                    aVar2.J = aVar.J;
                    aVar2.K = xr.m.F(aVar.K);
                    n(aVar2);
                } else if ("browser".equals(entry.getKey()) && (value instanceof b)) {
                    b bVar = (b) value;
                    b bVar2 = new b();
                    bVar2.f12919d = bVar.f12919d;
                    bVar2.f12920e = bVar.f12920e;
                    bVar2.f12921i = xr.m.F(bVar.f12921i);
                    o(bVar2);
                } else if ("device".equals(entry.getKey()) && (value instanceof f)) {
                    f fVar = (f) value;
                    f fVar2 = new f();
                    fVar2.f12939d = fVar.f12939d;
                    fVar2.f12941e = fVar.f12941e;
                    fVar2.f12944i = fVar.f12944i;
                    fVar2.f12945v = fVar.f12945v;
                    fVar2.f12946w = fVar.f12946w;
                    fVar2.f12947x = fVar.f12947x;
                    fVar2.F = fVar.F;
                    fVar2.G = fVar.G;
                    fVar2.H = fVar.H;
                    fVar2.I = fVar.I;
                    fVar2.J = fVar.J;
                    fVar2.K = fVar.K;
                    fVar2.L = fVar.L;
                    fVar2.M = fVar.M;
                    fVar2.N = fVar.N;
                    fVar2.O = fVar.O;
                    fVar2.P = fVar.P;
                    fVar2.Q = fVar.Q;
                    fVar2.R = fVar.R;
                    fVar2.S = fVar.S;
                    fVar2.T = fVar.T;
                    fVar2.U = fVar.U;
                    fVar2.V = fVar.V;
                    fVar2.X = fVar.X;
                    fVar2.Z = fVar.Z;
                    fVar2.a0 = fVar.a0;
                    fVar2.E = fVar.E;
                    String[] strArr = fVar.f12948y;
                    fVar2.f12948y = strArr != null ? (String[]) strArr.clone() : null;
                    fVar2.Y = fVar.Y;
                    TimeZone timeZone = fVar.W;
                    fVar2.W = timeZone != null ? (TimeZone) timeZone.clone() : null;
                    fVar2.f12937b0 = fVar.f12937b0;
                    fVar2.f12938c0 = fVar.f12938c0;
                    fVar2.f12940d0 = fVar.f12940d0;
                    fVar2.f12942e0 = fVar.f12942e0;
                    fVar2.f12943f0 = xr.m.F(fVar.f12943f0);
                    p(fVar2);
                } else if ("os".equals(entry.getKey()) && (value instanceof o)) {
                    o oVar = (o) value;
                    o oVar2 = new o();
                    oVar2.f13006d = oVar.f13006d;
                    oVar2.f13007e = oVar.f13007e;
                    oVar2.f13008i = oVar.f13008i;
                    oVar2.f13009v = oVar.f13009v;
                    oVar2.f13010w = oVar.f13010w;
                    oVar2.f13011x = oVar.f13011x;
                    oVar2.f13012y = xr.m.F(oVar.f13012y);
                    s(oVar2);
                } else if ("runtime".equals(entry.getKey()) && (value instanceof x)) {
                    x xVar = (x) value;
                    x xVar2 = new x();
                    xVar2.f13060d = xVar.f13060d;
                    xVar2.f13061e = xVar.f13061e;
                    xVar2.f13062i = xVar.f13062i;
                    xVar2.f13063v = xr.m.F(xVar.f13063v);
                    u(xVar2);
                } else if ("feedback".equals(entry.getKey()) && (value instanceof i)) {
                    i iVar = (i) value;
                    i iVar2 = new i();
                    iVar2.f12963d = iVar.f12963d;
                    iVar2.f12964e = iVar.f12964e;
                    iVar2.f12965i = iVar.f12965i;
                    iVar2.f12966v = iVar.f12966v;
                    iVar2.f12967w = iVar.f12967w;
                    iVar2.f12968x = iVar.f12968x;
                    iVar2.f12969y = xr.m.F(iVar.f12969y);
                    k(iVar2, "feedback");
                } else if ("gpu".equals(entry.getKey()) && (value instanceof k)) {
                    k kVar = (k) value;
                    k kVar2 = new k();
                    kVar2.f12984d = kVar.f12984d;
                    kVar2.f12985e = kVar.f12985e;
                    kVar2.f12986i = kVar.f12986i;
                    kVar2.f12987v = kVar.f12987v;
                    kVar2.f12988w = kVar.f12988w;
                    kVar2.f12989x = kVar.f12989x;
                    kVar2.f12990y = kVar.f12990y;
                    kVar2.E = kVar.E;
                    kVar2.F = kVar.F;
                    kVar2.G = xr.m.F(kVar.G);
                    r(kVar2);
                } else if (SharedPreferencesKey.TRACE.equals(entry.getKey()) && (value instanceof j6)) {
                    w(new j6((j6) value));
                } else if ("profile".equals(entry.getKey()) && (value instanceof e3)) {
                    e3 e3Var = (e3) value;
                    e3 e3Var2 = new e3();
                    e3Var2.f12637d = e3Var.f12637d;
                    ConcurrentHashMap concurrentHashMapF = xr.m.F(e3Var.f12638e);
                    if (concurrentHashMapF != null) {
                        e3Var2.f12638e = concurrentHashMapF;
                    }
                    k(e3Var2, "profile");
                } else if ("response".equals(entry.getKey()) && (value instanceof r)) {
                    r rVar = (r) value;
                    r rVar2 = new r();
                    rVar2.f13032d = rVar.f13032d;
                    rVar2.f13033e = xr.m.F(rVar.f13033e);
                    rVar2.f13037x = xr.m.F(rVar.f13037x);
                    rVar2.f13034i = rVar.f13034i;
                    rVar2.f13035v = rVar.f13035v;
                    rVar2.f13036w = rVar.f13036w;
                    t(rVar2);
                } else if ("spring".equals(entry.getKey()) && (value instanceof e0)) {
                    e0 e0Var = (e0) value;
                    e0 e0Var2 = new e0();
                    e0Var2.f12935d = e0Var.f12935d;
                    e0Var2.f12936e = xr.m.F(e0Var.f12936e);
                    v(e0Var2);
                } else {
                    k(value, (String) entry.getKey());
                }
            }
        }
    }
}
