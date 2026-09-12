package com.google.android.gms.internal.play_billing;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p0 extends b1 implements x0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Object f6084v = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final w0 f6085w = new w0(a1.class);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final boolean f6086x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final z1 f6087y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Object f6088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile j0 f6089e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile o0 f6090i;

    static {
        boolean z5;
        z1 m0Var;
        Throwable th2;
        Throwable th3;
        try {
            z5 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z5 = false;
        }
        f6086x = z5;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th4 = null;
        if (property == null || property.contains("Android")) {
            try {
                m0Var = new n0();
            } catch (Error | Exception e10) {
                try {
                    m0Var = new l0();
                } catch (Error | Exception e11) {
                    th4 = e11;
                    m0Var = new m0();
                }
                th2 = th4;
                th3 = e10;
            }
        } else {
            try {
                m0Var = new l0();
            } catch (NoClassDefFoundError unused2) {
                m0Var = new m0();
            }
        }
        th2 = null;
        th3 = null;
        f6087y = m0Var;
        if (th2 != null) {
            w0 w0Var = f6085w;
            Logger loggerA = w0Var.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            w0Var.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    public final void d(o0 o0Var) {
        o0Var.f6079a = null;
        while (true) {
            o0 o0Var2 = this.f6090i;
            if (o0Var2 != o0.f6078c) {
                o0 o0Var3 = null;
                while (o0Var2 != null) {
                    o0 o0Var4 = o0Var2.f6080b;
                    if (o0Var2.f6079a != null) {
                        o0Var3 = o0Var2;
                    } else if (o0Var3 != null) {
                        o0Var3.f6080b = o0Var4;
                        if (o0Var3.f6079a == null) {
                        }
                    } else if (!f6087y.G(this, o0Var2, o0Var4)) {
                    }
                    o0Var2 = o0Var4;
                }
                return;
            }
            return;
        }
    }
}
