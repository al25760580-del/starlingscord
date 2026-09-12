package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Looper;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.b5;
import io.sentry.f4;
import io.sentry.f6;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.y5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements io.sentry.b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f12351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k0 f12352e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SentryAndroidOptions f12353i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Future f12354v;

    public n0(Context context, k0 k0Var, SentryAndroidOptions sentryAndroidOptions) {
        Future futureSubmit;
        new io.sentry.util.a();
        Context applicationContext = context.getApplicationContext();
        this.f12351d = applicationContext != null ? applicationContext : context;
        this.f12352e = k0Var;
        com.facebook.imagepipeline.nativecode.c.H(sentryAndroidOptions, "The options object is required.");
        this.f12353i = sentryAndroidOptions;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            futureSubmit = executorServiceNewSingleThreadExecutor.submit(new com.facebook.react.runtime.o(8, this, sentryAndroidOptions));
        } catch (RejectedExecutionException e10) {
            sentryAndroidOptions.getLogger().g(SentryLevel.WARNING, "Device info caching task rejected.", e10);
            futureSubmit = null;
        }
        this.f12354v = futureSubmit;
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    public final void a(f4 f4Var, Hint hint) {
        Boolean bool;
        io.sentry.protocol.a aVarD = f4Var.f12671e.d();
        if (aVarD == null) {
            aVarD = new io.sentry.protocol.a();
        }
        aVarD.f12911w = (String) l0.f12346c.a(this.f12351d);
        io.sentry.android.core.performance.g gVarA = io.sentry.android.core.performance.f.b().a(this.f12353i);
        p0 p0Var = null;
        if (gVarA.c()) {
            b5 b5VarB = gVarA.b();
            aVarD.f12908e = b5VarB == null ? null : io.sentry.config.a.z(Double.valueOf(b5VarB.f12492d / 1000000.0d).longValue());
        }
        if (!a5.l0.J(hint) && aVarD.H == null && (bool = f0.f12181w.f12185v) != null) {
            aVarD.H = Boolean.valueOf(!bool.booleanValue());
        }
        Context context = this.f12351d;
        SentryAndroidOptions sentryAndroidOptions = this.f12353i;
        ILogger logger = sentryAndroidOptions.getLogger();
        k0 k0Var = this.f12352e;
        PackageInfo packageInfoF = l0.f(context, logger, k0Var);
        if (packageInfoF != null) {
            String strH = l0.h(packageInfoF, k0Var);
            if (f4Var.I == null) {
                f4Var.I = strH;
            }
            Future future = this.f12354v;
            if (future != null) {
                try {
                    p0Var = (p0) future.get();
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().g(SentryLevel.ERROR, "Failed to retrieve device info", th2);
                }
            } else {
                sentryAndroidOptions.getLogger().q(SentryLevel.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            l0.k(packageInfoF, k0Var, p0Var, aVarD);
        }
        f4Var.f12671e.n(aVarD);
    }

    public final void b(f4 f4Var, boolean z5, boolean z6) {
        io.sentry.protocol.h0 h0Var = f4Var.F;
        if (h0Var == null) {
            h0Var = new io.sentry.protocol.h0();
            f4Var.F = h0Var;
        }
        String str = h0Var.f12957e;
        SentryAndroidOptions sentryAndroidOptions = this.f12353i;
        if (str == null) {
            h0Var.f12957e = (String) sentryAndroidOptions.getRuntimeManager().h(new gc.o(14, this));
        }
        if (h0Var.f12959v == null && sentryAndroidOptions.isSendDefaultPii()) {
            h0Var.f12959v = "{{auto}}";
        }
        io.sentry.protocol.c cVar = f4Var.f12671e;
        io.sentry.protocol.f fVarE = cVar.e();
        Future future = this.f12354v;
        if (fVarE == null) {
            if (future != null) {
                try {
                    cVar.p(((p0) future.get()).a(z5, z6));
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().g(SentryLevel.ERROR, "Failed to retrieve device info", th2);
                }
            } else {
                sentryAndroidOptions.getLogger().q(SentryLevel.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            io.sentry.protocol.o oVarG = cVar.g();
            if (future != null) {
                try {
                    cVar.s(((p0) future.get()).f12365g);
                } catch (Throwable th3) {
                    sentryAndroidOptions.getLogger().g(SentryLevel.ERROR, "Failed to retrieve os system", th3);
                }
            } else {
                sentryAndroidOptions.getLogger().q(SentryLevel.ERROR, "Failed to retrieve device info", new Object[0]);
            }
            if (oVarG != null) {
                String str2 = oVarG.f13006d;
                cVar.k(oVarG, (str2 == null || str2.isEmpty()) ? "os_1" : "os_" + str2.trim().toLowerCase(Locale.ROOT));
            }
        }
        if (future == null) {
            sentryAndroidOptions.getLogger().q(SentryLevel.ERROR, "Failed to retrieve device info", new Object[0]);
            return;
        }
        try {
            a3.n nVar = ((p0) future.get()).f12363e;
            if (nVar != null) {
                HashMap map = new HashMap();
                map.put("isSideLoaded", String.valueOf(nVar.f106b));
                String str3 = nVar.f105a;
                if (str3 != null) {
                    map.put("installerStore", str3);
                }
                for (Map.Entry entry : map.entrySet()) {
                    f4Var.c((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th4) {
            sentryAndroidOptions.getLogger().g(SentryLevel.ERROR, "Error getting side loaded info.", th4);
        }
    }

    @Override // io.sentry.b0
    public final y5 c(y5 y5Var, Hint hint) {
        boolean zD = d(y5Var, hint);
        if (zD) {
            a(y5Var, hint);
        }
        b(y5Var, false, zD);
        return y5Var;
    }

    public final boolean d(f4 f4Var, Hint hint) {
        if (a5.l0.O(hint)) {
            return true;
        }
        this.f12353i.getLogger().q(SentryLevel.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", f4Var.f12670d);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    @Override // io.sentry.b0
    public final SentryEvent f(SentryEvent sentryEvent, Hint hint) {
        io.sentry.protocol.a0 a0Var;
        List list;
        boolean z5;
        boolean zD = d(sentryEvent, hint);
        if (zD) {
            a(sentryEvent, hint);
            f6 f6Var = sentryEvent.P;
            if ((f6Var != null ? f6Var.f12677a : null) != null) {
                boolean zJ = a5.l0.J(hint);
                f6 f6Var2 = sentryEvent.P;
                for (io.sentry.protocol.c0 c0Var : f6Var2 != null ? f6Var2.f12677a : null) {
                    io.sentry.android.core.internal.util.e.f12290a.getClass();
                    Long l6 = c0Var.f12925d;
                    if (l6 == null) {
                        z5 = false;
                    } else if (Looper.getMainLooper().getThread().getId() == l6.longValue()) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (c0Var.f12930x == null) {
                        c0Var.f12930x = Boolean.valueOf(z5);
                    }
                    if (!zJ && c0Var.E == null) {
                        c0Var.E = Boolean.valueOf(z5);
                    }
                }
            }
        }
        b(sentryEvent, true, zD);
        ArrayList arrayListD = sentryEvent.d();
        if (arrayListD != null && arrayListD.size() > 1) {
            io.sentry.protocol.u uVar = (io.sentry.protocol.u) kk.b.e(1, arrayListD);
            if ("java.lang".equals(uVar.f13050i) && (a0Var = uVar.f13052w) != null && (list = a0Var.f12914d) != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(((SentryStackFrame) it.next()).f12905x)) {
                        Collections.reverse(arrayListD);
                        break;
                    }
                }
            }
        }
        return sentryEvent;
    }

    @Override // io.sentry.b0
    public final io.sentry.protocol.d0 g(io.sentry.protocol.d0 d0Var, Hint hint) {
        boolean zD = d(d0Var, hint);
        if (zD) {
            a(d0Var, hint);
        }
        b(d0Var, false, zD);
        return d0Var;
    }
}
