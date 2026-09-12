package io.sentry.android.core;

import android.view.Choreographer;
import io.sentry.ISpan;
import io.sentry.e5;
import io.sentry.j4;
import io.sentry.t2;
import io.sentry.v2;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 implements io.sentry.t0, io.sentry.android.core.internal.util.n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f12216h = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e5 f12217i = new e5(new Date(0), 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12218a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.o f12220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile String f12221d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.sentry.util.a f12219b = new io.sentry.util.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TreeSet f12222e = new TreeSet(new cl.b(20));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConcurrentSkipListSet f12223f = new ConcurrentSkipListSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f12224g = 16666666;

    public h1(SentryAndroidOptions sentryAndroidOptions, io.sentry.android.core.internal.util.o oVar) {
        this.f12220c = oVar;
        this.f12218a = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
    }

    public static long g(j4 j4Var) {
        if (j4Var instanceof e5) {
            return j4Var.b(f12217i);
        }
        return System.nanoTime() - ((System.currentTimeMillis() * 1000000) - j4Var.d());
    }

    @Override // io.sentry.android.core.internal.util.n
    public final void b(long j, long j5, long j7, long j10, boolean z5, boolean z6, float f2) {
        ConcurrentSkipListSet concurrentSkipListSet = this.f12223f;
        if (concurrentSkipListSet.size() > 3600) {
            return;
        }
        long j11 = (long) (f12216h / ((double) f2));
        this.f12224g = j11;
        if (z5 || z6) {
            concurrentSkipListSet.add(new g1(j, j5, j7, j10, z5, z6, j11));
        }
    }

    public final void d() {
        io.sentry.r rVarA = this.f12219b.a();
        try {
            if (this.f12221d != null) {
                this.f12220c.b(this.f12221d);
                this.f12221d = null;
            }
            this.f12223f.clear();
            this.f12222e.clear();
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

    /* JADX WARN: Code duplicated, block: B:86:0x016b  */
    public final void e(ISpan iSpan) {
        io.sentry.r rVar;
        Throwable th2;
        j4 j4VarP;
        TreeSet treeSet;
        io.sentry.util.a aVar;
        int i7;
        int i10;
        long j;
        long j5;
        long j7;
        long jLongValue;
        Field field;
        Iterator it;
        TreeSet treeSet2 = this.f12222e;
        if (!this.f12218a || (iSpan instanceof t2) || (iSpan instanceof v2)) {
            return;
        }
        io.sentry.util.a aVar2 = this.f12219b;
        io.sentry.r rVarA = aVar2.a();
        try {
            if (!treeSet2.contains(iSpan)) {
                rVarA.close();
                return;
            }
            rVarA.close();
            io.sentry.r rVarA2 = aVar2.a();
            try {
                boolean zRemove = treeSet2.remove(iSpan);
                ConcurrentSkipListSet concurrentSkipListSet = this.f12223f;
                if (zRemove && (j4VarP = iSpan.p()) != null) {
                    long jG = g(iSpan.s());
                    long jG2 = g(j4VarP);
                    long j10 = jG2 - jG;
                    if (j10 <= 0) {
                        rVarA2.close();
                        treeSet = treeSet2;
                        aVar = aVar2;
                    } else {
                        long j11 = this.f12224g;
                        int i11 = 1;
                        if (concurrentSkipListSet.isEmpty()) {
                            treeSet = treeSet2;
                            aVar = aVar2;
                            rVar = rVarA2;
                            i7 = 0;
                            i10 = 0;
                            j = 0;
                            j5 = 0;
                            j7 = 0;
                        } else {
                            Iterator it2 = concurrentSkipListSet.tailSet(new g1(jG)).iterator();
                            i7 = 0;
                            i10 = 0;
                            j = 0;
                            j5 = 0;
                            j7 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    treeSet = treeSet2;
                                    aVar = aVar2;
                                    break;
                                }
                                g1 g1Var = (g1) it2.next();
                                treeSet = treeSet2;
                                aVar = aVar2;
                                long j12 = g1Var.f12194d;
                                long j13 = g1Var.f12197v;
                                long j14 = g1Var.f12200y;
                                long j15 = g1Var.f12195e;
                                if (j12 > jG2) {
                                    break;
                                }
                                if (j12 < jG || j15 > jG2) {
                                    if ((jG > j12 && jG < j15) || (jG2 > j12 && jG2 < j15)) {
                                        rVar = rVarA2;
                                        it = it2;
                                        try {
                                            long jMin = Math.min(j13 - Math.max(0L, Math.max(0L, jG - j12) - j14), j10);
                                            long jMin2 = Math.min(jG2, j15) - Math.max(jG, g1Var.f12194d);
                                            int i12 = io.sentry.android.core.internal.util.o.M;
                                            boolean z5 = jMin2 > j14;
                                            j += jMin2;
                                            if (jMin2 > io.sentry.android.core.internal.util.o.L) {
                                                j7 += jMin;
                                                i10++;
                                            } else if (z5) {
                                                j5 += jMin;
                                                i7++;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    }
                                    it2 = it;
                                    treeSet2 = treeSet;
                                    aVar2 = aVar;
                                    rVarA2 = rVar;
                                    j11 = j14;
                                } else {
                                    try {
                                        long j16 = g1Var.f12196i;
                                        boolean z6 = g1Var.f12198w;
                                        j += j16;
                                        if (g1Var.f12199x) {
                                            j7 += j13;
                                            i10++;
                                        } else if (z6) {
                                            j5 += j13;
                                            i7++;
                                        }
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        rVar = rVarA2;
                                    }
                                }
                                rVar = rVarA2;
                                it = it2;
                                it2 = it;
                                treeSet2 = treeSet;
                                aVar2 = aVar;
                                rVarA2 = rVar;
                                j11 = j14;
                                th = th3;
                                th2 = th;
                                try {
                                    rVar.close();
                                    throw th2;
                                } catch (Throwable th5) {
                                    th2.addSuppressed(th5);
                                    throw th2;
                                }
                            }
                            rVar = rVarA2;
                        }
                        int iCeil = i7 + i10;
                        io.sentry.android.core.internal.util.o oVar = this.f12220c;
                        Choreographer choreographer = oVar.G;
                        if (choreographer == null || (field = oVar.H) == null) {
                            jLongValue = -1;
                        } else {
                            try {
                                Long l6 = (Long) field.get(choreographer);
                                if (l6 != null) {
                                    jLongValue = l6.longValue();
                                } else {
                                    jLongValue = -1;
                                }
                            } catch (IllegalAccessException unused) {
                            }
                        }
                        if (jLongValue != -1) {
                            long jMax = Math.max(0L, jG2 - jLongValue);
                            if (jMax > j11) {
                                boolean z7 = jMax > io.sentry.android.core.internal.util.o.L;
                                long jMax2 = Math.max(0L, jMax - j11);
                                j += jMax;
                                if (z7) {
                                    j7 += jMax2;
                                    i10++;
                                } else {
                                    j5 += jMax2;
                                    i7++;
                                }
                            } else {
                                i11 = 0;
                            }
                            long j17 = j10 - j;
                            iCeil = iCeil + i11 + (j17 > 0 ? (int) Math.ceil(j17 / j11) : 0);
                        }
                        double d6 = (j5 + j7) / 1.0E9d;
                        iSpan.h(Integer.valueOf(iCeil), "frames.total");
                        iSpan.h(Integer.valueOf(i7), "frames.slow");
                        iSpan.h(Integer.valueOf(i10), "frames.frozen");
                        iSpan.h(Double.valueOf(d6), "frames.delay");
                        if (iSpan instanceof io.sentry.f1) {
                            iSpan.e(Integer.valueOf(iCeil), "frames_total");
                            iSpan.e(Integer.valueOf(i7), "frames_slow");
                            iSpan.e(Integer.valueOf(i10), "frames_frozen");
                            iSpan.e(Double.valueOf(d6), "frames_delay");
                        }
                        rVar.close();
                    }
                } else {
                    rVarA2.close();
                    treeSet = treeSet2;
                    aVar = aVar2;
                }
                io.sentry.r rVarA3 = aVar.a();
                try {
                    if (treeSet.isEmpty()) {
                        d();
                    } else {
                        concurrentSkipListSet.headSet(new g1(g(((ISpan) treeSet.first()).s()))).clear();
                    }
                    rVarA3.close();
                } catch (Throwable th6) {
                    try {
                        rVarA3.close();
                        throw th6;
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                        throw th6;
                    }
                }
            } catch (Throwable th8) {
                th = th8;
                rVar = rVarA2;
            }
        } catch (Throwable th9) {
            try {
                rVarA.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public final void f(ISpan iSpan) {
        String str;
        if (!this.f12218a || (iSpan instanceof t2) || (iSpan instanceof v2)) {
            return;
        }
        io.sentry.r rVarA = this.f12219b.a();
        try {
            this.f12222e.add(iSpan);
            if (this.f12221d == null) {
                io.sentry.android.core.internal.util.o oVar = this.f12220c;
                if (oVar.f12326y) {
                    String strR = ls.l.r();
                    oVar.f12325x.put(strR, this);
                    oVar.c();
                    str = strR;
                } else {
                    str = null;
                }
                this.f12221d = str;
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
}
