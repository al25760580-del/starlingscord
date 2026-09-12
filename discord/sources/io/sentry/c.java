package io.sentry;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final hs.c f12501f = new hs.c(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f12502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.sentry.util.a f12503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Double f12504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Double f12505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12506e;

    public c() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f12503b = new io.sentry.util.a();
        this.f12502a = concurrentHashMap;
        this.f12504c = null;
        this.f12505d = null;
        this.f12506e = true;
    }

    public final String a(String str) {
        return (String) this.f12502a.get(str);
    }

    public final void b(String str, String str2) {
        if (this.f12506e) {
            ConcurrentHashMap concurrentHashMap = this.f12502a;
            if (str2 == null) {
                concurrentHashMap.remove(str);
            } else {
                concurrentHashMap.put(str, str2);
            }
        }
    }

    public final void c(io.sentry.protocol.v vVar, io.sentry.protocol.v vVar2, w5 w5Var, e9.b bVar, String str, io.sentry.protocol.g0 g0Var) {
        b("sentry-trace_id", vVar.toString());
        b("sentry-public_key", w5Var.retrieveParsedDsn().f13285b);
        b("sentry-release", w5Var.getRelease());
        b("sentry-environment", w5Var.getEnvironment());
        if (g0Var == null || io.sentry.protocol.g0.URL.equals(g0Var)) {
            str = null;
        }
        b("sentry-transaction", str);
        if (vVar2 != null && !io.sentry.protocol.v.f13055e.equals(vVar2)) {
            b("sentry-replay_id", vVar2.toString());
        }
        Double d6 = bVar == null ? null : (Double) bVar.f8110e;
        if (this.f12506e) {
            this.f12504c = d6;
        }
        Boolean bool = bVar == null ? null : (Boolean) bVar.f8109d;
        b("sentry-sampled", bool == null ? null : bool.toString());
        Double d7 = bVar != null ? (Double) bVar.f8111i : null;
        if (this.f12506e) {
            this.f12505d = d7;
        }
    }

    public final o6 d() {
        String strA = a("sentry-trace_id");
        String strA2 = a("sentry-replay_id");
        String strA3 = a("sentry-public_key");
        if (strA == null || strA3 == null) {
            return null;
        }
        io.sentry.protocol.v vVar = new io.sentry.protocol.v(strA);
        String strA4 = a("sentry-release");
        String strA5 = a("sentry-environment");
        String strA6 = a("sentry-user_id");
        String strA7 = a("sentry-transaction");
        Double d6 = this.f12504c;
        boolean zE0 = e4.f.e0(d6, false);
        hs.c cVar = f12501f;
        String str = !zE0 ? null : ((DecimalFormat) cVar.get()).format(d6);
        String strA8 = a("sentry-sampled");
        io.sentry.protocol.v vVar2 = strA2 == null ? null : new io.sentry.protocol.v(strA2);
        Double d7 = this.f12505d;
        o6 o6Var = new o6(vVar, strA3, strA4, strA5, strA6, strA7, str, strA8, vVar2, e4.f.e0(d7, false) ? ((DecimalFormat) cVar.get()).format(d7) : null);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        r rVarA = this.f12503b.a();
        try {
            for (Map.Entry entry : this.f12502a.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                if (!b.f12489a.contains(str2) && str3 != null) {
                    concurrentHashMap.put(str2.replaceFirst("sentry-", ""), str3);
                }
            }
            rVarA.close();
            o6Var.H = concurrentHashMap;
            return o6Var;
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
}
