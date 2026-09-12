package io.sentry.android.core;

import android.content.Context;
import android.os.SystemClock;
import io.sentry.SentryLevel;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.b4;
import io.sentry.c4;
import io.sentry.g2;
import io.sentry.l1;
import io.sentry.w5;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f12173a = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final io.sentry.util.a f12174b = new io.sentry.util.a();

    public static void a(w5 w5Var, boolean z5, boolean z6) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (l1 l1Var : w5Var.getIntegrations()) {
            if (z5 && (l1Var instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(l1Var);
            }
            if (z6 && (l1Var instanceof SentryTimberIntegration)) {
                arrayList.add(l1Var);
            }
            if (l1Var instanceof SystemEventsBreadcrumbsIntegration) {
                arrayList3.add(l1Var);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i7 = 0; i7 < arrayList2.size() - 1; i7++) {
                w5Var.getIntegrations().remove((l1) arrayList2.get(i7));
            }
        }
        if (arrayList.size() > 1) {
            for (int i10 = 0; i10 < arrayList.size() - 1; i10++) {
                w5Var.getIntegrations().remove((l1) arrayList.get(i10));
            }
        }
        if (arrayList3.size() > 1) {
            for (int i11 = 0; i11 < arrayList3.size() - 1; i11++) {
                w5Var.getIntegrations().remove((l1) arrayList3.get(i11));
            }
        }
    }

    public static void b(Context context, m0 m0Var, b4 b4Var) {
        try {
            io.sentry.r rVarA = f12174b.a();
            try {
                c4.g(new g2(5), new e(m0Var, context, b4Var));
                io.sentry.x0 x0VarF = c4.f();
                if (l0.i()) {
                    if (x0VarF.l().isEnableAutoSessionTracking()) {
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        x0VarF.r(null, new gc.o(18, atomicBoolean));
                        if (!atomicBoolean.get()) {
                            x0VarF.p();
                        }
                    }
                    x0VarF.l().getReplayController().start();
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
        } catch (IllegalAccessException e10) {
            m0Var.g(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e10);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e10);
        } catch (InstantiationException e11) {
            m0Var.g(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e11);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e11);
        } catch (NoSuchMethodException e12) {
            m0Var.g(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e12);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e12);
        } catch (InvocationTargetException e13) {
            m0Var.g(SentryLevel.FATAL, "Fatal error during SentryAndroid.init(...)", e13);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e13);
        }
    }
}
