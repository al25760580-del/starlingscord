package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import io.sentry.SentryLevel;
import io.sentry.d4;
import io.sentry.p6;
import io.sentry.w5;
import io.sentry.z1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes3.dex */
public final class SentryPerformanceProvider extends q0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final long f12116w = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Application f12117e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m0 f12118i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k0 f12119v;

    public SentryPerformanceProvider() {
        new io.sentry.util.a();
        m0 m0Var = new m0(1);
        this.f12118i = m0Var;
        this.f12119v = new k0(m0Var);
    }

    public final void a(Context context, d4 d4Var, io.sentry.android.core.performance.f fVar) {
        boolean z5 = d4Var.F;
        m0 m0Var = this.f12118i;
        if (!z5) {
            m0Var.q(SentryLevel.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        g gVar = new g(this.f12119v, new io.sentry.android.core.internal.util.o(context.getApplicationContext(), m0Var, this.f12119v), m0Var, d4Var.f12623w, d4Var.E, new com.google.firebase.messaging.r(7));
        fVar.E = null;
        fVar.F = gVar;
        m0Var.q(SentryLevel.DEBUG, "App start continuous profiling started.", new Object[0]);
        w5 w5VarEmpty = w5.empty();
        w5VarEmpty.setProfileSessionSampleRate(Double.valueOf(d4Var.F ? 1.0d : 0.0d));
        gVar.c(d4Var.I, new p6(w5VarEmpty));
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    public final void b(Context context, d4 d4Var, io.sentry.android.core.performance.f fVar) {
        boolean z5 = d4Var.f12621i;
        e9.b bVar = new e9.b(Boolean.valueOf(z5), d4Var.f12622v, (Double) null, Boolean.valueOf(d4Var.f12619d), d4Var.f12620e);
        fVar.G = bVar;
        boolean zBooleanValue = ((Boolean) bVar.f8112v).booleanValue();
        m0 m0Var = this.f12118i;
        if (!zBooleanValue || !z5) {
            m0Var.q(SentryLevel.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        v vVar = new v(context, this.f12119v, new io.sentry.android.core.internal.util.o(context, m0Var, this.f12119v), m0Var, d4Var.f12623w, d4Var.f12624x, d4Var.E, new com.google.firebase.messaging.r(7));
        fVar.F = null;
        fVar.E = vVar;
        m0Var.q(SentryLevel.DEBUG, "App start profiling started.", new Object[0]);
        vVar.start();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        io.sentry.android.core.performance.f fVarB = io.sentry.android.core.performance.f.b();
        Context context = getContext();
        fVarB.f12379v.d(f12116w);
        this.f12119v.getClass();
        fVarB.f12378i.d(Process.getStartUptimeMillis());
        if (context instanceof Application) {
            this.f12117e = (Application) context;
        }
        Application application = this.f12117e;
        if (application != null) {
            fVarB.d(application);
        }
        Context context2 = getContext();
        m0 m0Var = this.f12118i;
        if (context2 == null) {
            m0Var.q(SentryLevel.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return true;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        try {
            File file = new File(context2.getCacheDir(), "sentry");
            StrictMode.setThreadPolicy(threadPolicy);
            StrictMode.setVmPolicy(vmPolicy);
            File file2 = new File(file, "app_start_profiling_config");
            if (!file2.exists() || !file2.canRead()) {
                return true;
            }
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                try {
                    d4 d4Var = (d4) new z1(w5.empty()).d(bufferedReader, d4.class);
                    if (d4Var == null) {
                        m0Var.q(SentryLevel.WARNING, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start.", new Object[0]);
                    } else if (d4Var.f12625y && d4Var.H) {
                        a(context2, d4Var, fVarB);
                    } else if (!d4Var.f12624x) {
                        m0Var.q(SentryLevel.INFO, "Profiling is not enabled. App start profiling will not start.", new Object[0]);
                    } else if (d4Var.G) {
                        b(context2, d4Var, fVarB);
                    }
                    bufferedReader.close();
                    return true;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e10) {
                m0Var.g(SentryLevel.ERROR, "App start profiling config file not found. ", e10);
                return true;
            } catch (Throwable th4) {
                m0Var.g(SentryLevel.ERROR, "Error reading app start profiling config file. ", th4);
                return true;
            }
        } catch (Throwable th5) {
            StrictMode.setThreadPolicy(threadPolicy);
            StrictMode.setVmPolicy(vmPolicy);
            throw th5;
        }
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        io.sentry.r rVarA = io.sentry.android.core.performance.f.N.a();
        try {
            v vVar = io.sentry.android.core.performance.f.b().E;
            if (vVar != null) {
                vVar.close();
            }
            g gVar = io.sentry.android.core.performance.f.b().F;
            if (gVar != null) {
                gVar.a(true);
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
