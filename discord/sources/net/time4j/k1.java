package net.time4j;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 implements vr.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final as.d f16655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f16656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k1 f16657c;

    static {
        as.d j1Var;
        String property = System.getProperty("java.vm.name");
        Iterator it = vr.c.f21955b.d(as.d.class).iterator();
        do {
            if (!it.hasNext()) {
                j1Var = null;
                break;
            }
            j1Var = (as.d) it.next();
        } while (!property.equals(j1Var.b()));
        if (j1Var == null) {
            j1Var = new j1();
        }
        f16655a = j1Var;
        f16656b = Boolean.getBoolean("net.time4j.systemclock.nanoTime");
        a();
        f16657c = new k1();
        a();
    }

    public static long a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jNanoTime = 0;
        int i7 = 0;
        while (i7 < 10) {
            jNanoTime = f16656b ? System.nanoTime() : f16655a.a();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (jCurrentTimeMillis == jCurrentTimeMillis2) {
                break;
            }
            i7++;
            jCurrentTimeMillis = jCurrentTimeMillis2;
        }
        return yk.a.E(yk.a.C(as.c.F.b(yk.a.k(1000, jCurrentTimeMillis)), 1000000000L) + ((long) (yk.a.m(1000, jCurrentTimeMillis) * 1000000)), jNanoTime);
    }
}
