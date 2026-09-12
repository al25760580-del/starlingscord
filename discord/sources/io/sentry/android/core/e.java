package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Process;
import io.sentry.IScope;
import io.sentry.SentryLevel;
import io.sentry.b4;
import io.sentry.f5;
import io.sentry.o3;
import io.sentry.t3;
import io.sentry.w5;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements o3, b4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12176e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f12177i;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3) {
        this.f12175d = obj;
        this.f12176e = obj2;
        this.f12177i = obj3;
    }

    @Override // io.sentry.o3
    public void b(io.sentry.f1 f1Var) {
        ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) this.f12175d;
        IScope iScope = (IScope) this.f12176e;
        io.sentry.f1 f1Var2 = (io.sentry.f1) this.f12177i;
        if (f1Var == null) {
            iScope.O(f1Var2);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f12074v;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", f1Var2.getName());
        }
    }

    @Override // io.sentry.b4
    public void c(w5 w5Var) {
        m0 m0Var = (m0) this.f12175d;
        Context context = (Context) this.f12176e;
        b4 b4Var = (b4) this.f12177i;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) w5Var;
        boolean zA = io.sentry.util.f.a(sentryAndroidOptions, "timber.log.Timber");
        boolean z5 = true;
        if (!io.sentry.util.f.a(sentryAndroidOptions, "androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks") || !io.sentry.util.f.a(sentryAndroidOptions, "io.sentry.android.fragment.FragmentLifecycleIntegration")) {
            z5 = false;
        }
        boolean z6 = zA && io.sentry.util.f.a(sentryAndroidOptions, "io.sentry.android.timber.SentryTimberIntegration");
        boolean zA2 = io.sentry.util.f.a(sentryAndroidOptions, "io.sentry.android.replay.ReplayIntegration");
        boolean zA3 = io.sentry.util.f.a(sentryAndroidOptions, "io.sentry.android.distribution.DistributionIntegration");
        k0 k0Var = new k0(m0Var);
        io.sentry.util.f fVar = new io.sentry.util.f();
        m0 m0Var2 = new m0(3);
        androidx.appcompat.widget.b4 b4Var2 = new androidx.appcompat.widget.b4();
        b4Var2.f911i = new ConcurrentHashMap();
        b4Var2.f912v = new WeakHashMap();
        b4Var2.f914x = new io.sentry.util.a();
        b4Var2.f915y = new io.sentry.util.e(new gc.o(25, fVar, sentryAndroidOptions.getLogger()));
        b4Var2.f909d = new io.sentry.util.e(new hm.a(16));
        b4Var2.f910e = sentryAndroidOptions;
        b4Var2.f913w = m0Var2;
        com.facebook.imagepipeline.nativecode.c.H(context, "The context is required.");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        sentryAndroidOptions.setLogger(m0Var);
        sentryAndroidOptions.setFatalLogger(new u());
        sentryAndroidOptions.setDefaultScopeType(t3.CURRENT);
        sentryAndroidOptions.setOpenTelemetryMode(f5.OFF);
        sentryAndroidOptions.setDateProvider(new e1());
        sentryAndroidOptions.setRuntimeManager(new io.sentry.android.core.internal.util.d());
        sentryAndroidOptions.getLogs().f12852b = new u();
        sentryAndroidOptions.getMetrics().f12891b = new u();
        sentryAndroidOptions.setFlushTimeoutMillis(4000L);
        sentryAndroidOptions.setFrameMetricsCollector(new io.sentry.android.core.internal.util.o(applicationContext, m0Var, k0Var));
        w0.b(applicationContext, k0Var, sentryAndroidOptions);
        sentryAndroidOptions.setCacheDirPath((String) sentryAndroidOptions.getRuntimeManager().h(new com.discord.chat.input.views.d(applicationContext, 5)));
        PackageInfo packageInfoG = l0.g(applicationContext, k0Var);
        if (packageInfoG != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(packageInfoG.packageName + "@" + packageInfoG.versionName + "+" + l0.h(packageInfoG, k0Var));
            }
            String str = packageInfoG.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId((String) sentryAndroidOptions.getRuntimeManager().h(new com.discord.chat.input.views.d(applicationContext, 6)));
            } catch (RuntimeException e10) {
                sentryAndroidOptions.getLogger().g(SentryLevel.ERROR, "Could not generate distinct Id.", e10);
            }
        }
        f0 f0Var = f0.f12181w;
        if (f0Var.f12183e == null) {
            io.sentry.r rVarA = f0Var.f12182d.a();
            try {
                f0Var.g(sentryAndroidOptions.getLogger());
                rVarA.close();
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
        o.b(context, sentryAndroidOptions, k0Var, fVar, b4Var2, z5, z6, zA2, zA3);
        boolean z7 = z5;
        try {
            b4Var.c(sentryAndroidOptions);
        } catch (Throwable th4) {
            sentryAndroidOptions.getLogger().g(SentryLevel.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th4);
        }
        io.sentry.android.core.performance.f fVarB = io.sentry.android.core.performance.f.b();
        if (sentryAndroidOptions.isEnablePerformanceV2()) {
            io.sentry.android.core.performance.g gVar = fVarB.f12378i;
            if (gVar.f12385i == 0) {
                gVar.d(Process.getStartUptimeMillis());
            }
        }
        if (context.getApplicationContext() instanceof Application) {
            fVarB.d((Application) context.getApplicationContext());
        }
        io.sentry.android.core.performance.g gVar2 = fVarB.f12379v;
        if (gVar2.f12385i == 0) {
            gVar2.d(d1.f12173a);
        }
        o.a(sentryAndroidOptions, context, k0Var, fVar, b4Var2, zA2);
        d1.a(sentryAndroidOptions, z7, z6);
    }
}
