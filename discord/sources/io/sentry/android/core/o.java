package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import androidx.appcompat.widget.b4;
import io.sentry.SentryLevel;
import io.sentry.android.distribution.DistributionIntegration;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.replay.DefaultReplayBreadcrumbConverter;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.d2;
import io.sentry.e2;
import io.sentry.f2;
import io.sentry.g2;
import io.sentry.g5;
import io.sentry.l2;
import io.sentry.s2;
import io.sentry.x2;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {
    public static void a(SentryAndroidOptions sentryAndroidOptions, Context context, k0 k0Var, io.sentry.util.f fVar, b4 b4Var, boolean z5) {
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.i)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new io.sentry.android.core.cache.b(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof e2) {
            sentryAndroidOptions.setConnectionStatusProvider(new io.sentry.android.core.internal.util.c(context, k0Var, sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            sentryAndroidOptions.addScopeObserver(new io.sentry.cache.g(sentryAndroidOptions));
            sentryAndroidOptions.addOptionsObserver(new io.sentry.cache.e(sentryAndroidOptions));
        }
        sentryAndroidOptions.addEventProcessor(new io.sentry.m(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new n0(context, k0Var, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new b1(sentryAndroidOptions, b4Var));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, k0Var));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new h0(context, k0Var, sentryAndroidOptions));
        if (sentryAndroidOptions.getTransportGate() instanceof io.sentry.transport.k) {
            sentryAndroidOptions.setTransportGate(new m0(sentryAndroidOptions));
        }
        io.sentry.android.core.performance.f fVarB = io.sentry.android.core.performance.f.b();
        if (sentryAndroidOptions.getModulesLoader() instanceof io.sentry.internal.modules.e) {
            sentryAndroidOptions.setModulesLoader(new io.sentry.internal.modules.f(context, sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            sentryAndroidOptions.setDebugMetaLoader(new e4.l(context, sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getVersionDetector() instanceof x2) {
            sentryAndroidOptions.setVersionDetector(new u4.b(16, sentryAndroidOptions));
        }
        io.sentry.util.e eVar = new io.sentry.util.e(new g5(fVar, sentryAndroidOptions));
        boolean zA = io.sentry.util.f.a(sentryAndroidOptions, "androidx.compose.ui.node.Owner");
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new io.sentry.android.core.internal.gestures.a(eVar));
            if (zA && io.sentry.util.f.a(sentryAndroidOptions, "io.sentry.compose.gestures.ComposeGestureTargetLocator")) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zA && io.sentry.util.f.a(sentryAndroidOptions, "io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter")) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        if (sentryAndroidOptions.getThreadChecker() instanceof io.sentry.util.thread.b) {
            sentryAndroidOptions.setThreadChecker(io.sentry.android.core.internal.util.e.f12290a);
        }
        if (sentryAndroidOptions.getSocketTagger() instanceof s2) {
            sentryAndroidOptions.setSocketTagger(u.f12421d);
        }
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new m());
            sentryAndroidOptions.addPerformanceCollector(new h(sentryAndroidOptions.getLogger()));
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                io.sentry.android.core.internal.util.o frameMetricsCollector = sentryAndroidOptions.getFrameMetricsCollector();
                com.facebook.imagepipeline.nativecode.c.H(frameMetricsCollector, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.addPerformanceCollector(new h1(sentryAndroidOptions, frameMetricsCollector));
            }
        }
        if (sentryAndroidOptions.getCompositePerformanceCollector() instanceof d2) {
            sentryAndroidOptions.setCompositePerformanceCollector(new io.sentry.q(sentryAndroidOptions));
        }
        if (z5 && (sentryAndroidOptions.getReplayController().getReplayBreadcrumbConverter() instanceof l2)) {
            sentryAndroidOptions.getReplayController().setBreadcrumbConverter(new DefaultReplayBreadcrumbConverter(sentryAndroidOptions));
        }
        io.sentry.r rVarA = io.sentry.android.core.performance.f.N.a();
        try {
            io.sentry.g1 g1Var = fVarB.E;
            g gVar = fVarB.F;
            fVarB.E = null;
            fVarB.F = null;
            rVarA.close();
            io.sentry.k compositePerformanceCollector = sentryAndroidOptions.getCompositePerformanceCollector();
            if (sentryAndroidOptions.isProfilingEnabled() || sentryAndroidOptions.getProfilesSampleRate() != null) {
                sentryAndroidOptions.setContinuousProfiler(f2.f12669d);
                if (gVar != null) {
                    gVar.a(true);
                }
                if (g1Var != null) {
                    sentryAndroidOptions.setTransactionProfiler(g1Var);
                    return;
                }
                io.sentry.android.core.internal.util.o frameMetricsCollector2 = sentryAndroidOptions.getFrameMetricsCollector();
                com.facebook.imagepipeline.nativecode.c.H(frameMetricsCollector2, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.setTransactionProfiler(new v(context, k0Var, frameMetricsCollector2, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService()));
                return;
            }
            sentryAndroidOptions.setTransactionProfiler(g2.f12685w);
            if (g1Var != null) {
                g1Var.close();
            }
            if (gVar == null) {
                io.sentry.android.core.internal.util.o frameMetricsCollector3 = sentryAndroidOptions.getFrameMetricsCollector();
                com.facebook.imagepipeline.nativecode.c.H(frameMetricsCollector3, "options.getFrameMetricsCollector is required");
                sentryAndroidOptions.setContinuousProfiler(new g(k0Var, frameMetricsCollector3, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService()));
            } else {
                sentryAndroidOptions.setContinuousProfiler(gVar);
                io.sentry.protocol.v vVar = gVar.L;
                if (!gVar.F || vVar.equals(io.sentry.protocol.v.f13055e)) {
                    return;
                }
                compositePerformanceCollector.a(vVar.toString());
            }
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

    public static void b(Context context, SentryAndroidOptions sentryAndroidOptions, k0 k0Var, io.sentry.util.f fVar, b4 b4Var, boolean z5, boolean z6, boolean z7, boolean z10) {
        io.sentry.util.e eVar = new io.sentry.util.e(new com.discord.crash_reporting.b(sentryAndroidOptions));
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new ga.l(16, new com.discord.crash_reporting.b(sentryAndroidOptions)), eVar));
        sentryAndroidOptions.addIntegration(new NdkIntegration(io.sentry.util.f.c("io.sentry.android.ndk.SentryNdk", sentryAndroidOptions.getLogger())));
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31) {
            sentryAndroidOptions.addIntegration(new TombstoneIntegration(context));
        }
        sentryAndroidOptions.addIntegration(new EnvelopeFileObserverIntegration.OutboxEnvelopeFileObserverIntegration(0));
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new u4.b(17, new com.discord.crash_reporting.b(sentryAndroidOptions)), eVar));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(i7 >= 30 ? new AnrV2Integration(context) : new AnrIntegration(context));
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, k0Var, b4Var));
            sentryAndroidOptions.addIntegration(new ActivityBreadcrumbsIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application, fVar));
            if (z5) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().q(SentryLevel.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z6) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, k0Var));
        if (z7) {
            ReplayIntegration replayIntegration = new ReplayIntegration(context, io.sentry.transport.d.f13180d);
            sentryAndroidOptions.addIntegration(replayIntegration);
            sentryAndroidOptions.setReplayController(replayIntegration);
        }
        if (z10) {
            DistributionIntegration distributionIntegration = new DistributionIntegration(context);
            sentryAndroidOptions.setDistributionController(distributionIntegration);
            sentryAndroidOptions.addIntegration(distributionIntegration);
        }
        sentryAndroidOptions.getFeedbackOptions().getClass();
    }
}
