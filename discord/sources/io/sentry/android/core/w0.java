package io.sentry.android.core;

import ag.m1;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.IScope;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.a6;
import io.sentry.b5;
import io.sentry.c4;
import io.sentry.f3;
import io.sentry.g6;
import io.sentry.h6;
import io.sentry.l4;
import io.sentry.p4;
import io.sentry.r3;
import io.sentry.s4;
import io.sentry.t3;
import io.sentry.v4;
import io.sentry.w3;
import io.sentry.w5;
import io.sentry.z3;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w0 {
    public static void a(io.sentry.android.core.performance.g gVar, ArrayList arrayList) {
        long jA = 0;
        if (gVar.f12385i == 0) {
            c4.f().l().getLogger().q(SentryLevel.WARNING, "Can not convert not-started TimeSpan to Map for Hybrid SDKs.", new Object[0]);
            return;
        }
        if (gVar.f12386v == 0) {
            c4.f().l().getLogger().q(SentryLevel.WARNING, "Can not convert not-stopped TimeSpan to Map for Hybrid SDKs.", new Object[0]);
            return;
        }
        HashMap map = new HashMap();
        map.put("description", gVar.f12383d);
        map.put("start_timestamp_ms", Long.valueOf(gVar.f12384e));
        if (gVar.c()) {
            jA = gVar.a() + gVar.f12384e;
        }
        map.put("end_timestamp_ms", Long.valueOf(jA));
        arrayList.add(map);
    }

    public static void b(Context context, k0 k0Var, SentryAndroidOptions sentryAndroidOptions) {
        List listH;
        List listH2;
        List listH3;
        List listH4;
        com.facebook.imagepipeline.nativecode.c.H(sentryAndroidOptions, "The options object is required.");
        try {
            sentryAndroidOptions.getLogger();
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) l0.f12347d.a(context) : (ApplicationInfo) l0.f12348e.a(context);
            Bundle bundle = applicationInfo != null ? applicationInfo.metaData : null;
            ILogger logger = sentryAndroidOptions.getLogger();
            if (bundle != null) {
                sentryAndroidOptions.setDebug(f(bundle, logger, "io.sentry.debug", sentryAndroidOptions.isDebug()));
                if (sentryAndroidOptions.isDebug()) {
                    String strName = sentryAndroidOptions.getDiagnosticLevel().name();
                    Locale locale = Locale.ROOT;
                    String strJ = j(bundle, logger, "io.sentry.debug.level", strName.toLowerCase(locale));
                    if (strJ != null) {
                        sentryAndroidOptions.setDiagnosticLevel(SentryLevel.valueOf(strJ.toUpperCase(locale)));
                    }
                }
                sentryAndroidOptions.setAnrEnabled(f(bundle, logger, "io.sentry.anr.enable", sentryAndroidOptions.isAnrEnabled()));
                sentryAndroidOptions.setEnableAutoSessionTracking(f(bundle, logger, "io.sentry.auto-session-tracking.enable", sentryAndroidOptions.isEnableAutoSessionTracking()));
                if (sentryAndroidOptions.getSampleRate() == null) {
                    double dG = g(bundle, logger, "io.sentry.sample-rate");
                    if (dG != -1.0d) {
                        sentryAndroidOptions.setSampleRate(Double.valueOf(dG));
                    }
                }
                sentryAndroidOptions.setAnrReportInDebug(f(bundle, logger, "io.sentry.anr.report-debug", sentryAndroidOptions.isAnrReportInDebug()));
                sentryAndroidOptions.setAnrTimeoutIntervalMillis(i(bundle, logger, "io.sentry.anr.timeout-interval-millis", sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                sentryAndroidOptions.setAttachAnrThreadDump(f(bundle, logger, "io.sentry.anr.attach-thread-dumps", sentryAndroidOptions.isAttachAnrThreadDump()));
                String strJ2 = j(bundle, logger, "io.sentry.dsn", sentryAndroidOptions.getDsn());
                boolean zF = f(bundle, logger, "io.sentry.enabled", sentryAndroidOptions.isEnabled());
                if (!zF || (strJ2 != null && strJ2.isEmpty())) {
                    sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android", new Object[0]);
                } else if (strJ2 == null) {
                    sentryAndroidOptions.getLogger().q(SentryLevel.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                }
                sentryAndroidOptions.setEnabled(zF);
                sentryAndroidOptions.setDsn(strJ2);
                sentryAndroidOptions.setEnableNdk(f(bundle, logger, "io.sentry.ndk.enable", sentryAndroidOptions.isEnableNdk()));
                sentryAndroidOptions.setEnableScopeSync(f(bundle, logger, "io.sentry.ndk.scope-sync.enable", sentryAndroidOptions.isEnableScopeSync()));
                String strJ3 = j(bundle, logger, "io.sentry.ndk.sdk-name", sentryAndroidOptions.getNativeSdkName());
                if (strJ3 != null) {
                    sentryAndroidOptions.setNativeSdkName(strJ3);
                }
                sentryAndroidOptions.setRelease(j(bundle, logger, "io.sentry.release", sentryAndroidOptions.getRelease()));
                sentryAndroidOptions.setEnvironment(j(bundle, logger, "io.sentry.environment", sentryAndroidOptions.getEnvironment()));
                sentryAndroidOptions.setSessionTrackingIntervalMillis(i(bundle, logger, "io.sentry.session-tracking.timeout-interval-millis", sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                sentryAndroidOptions.setMaxBreadcrumbs((int) i(bundle, logger, "io.sentry.max-breadcrumbs", sentryAndroidOptions.getMaxBreadcrumbs()));
                sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(f(bundle, logger, "io.sentry.breadcrumbs.activity-lifecycle", sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(f(bundle, logger, "io.sentry.breadcrumbs.app-lifecycle", sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableSystemEventBreadcrumbs(f(bundle, logger, "io.sentry.breadcrumbs.system-events", sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                sentryAndroidOptions.setEnableAppComponentBreadcrumbs(f(bundle, logger, "io.sentry.breadcrumbs.app-components", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(f(bundle, logger, "io.sentry.breadcrumbs.user-interaction", sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(f(bundle, logger, "io.sentry.breadcrumbs.network-events", sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                sentryAndroidOptions.setEnableUncaughtExceptionHandler(f(bundle, logger, "io.sentry.uncaught-exception-handler.enable", sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                sentryAndroidOptions.setAttachThreads(f(bundle, logger, "io.sentry.attach-threads", sentryAndroidOptions.isAttachThreads()));
                sentryAndroidOptions.setAttachScreenshot(f(bundle, logger, "io.sentry.attach-screenshot", sentryAndroidOptions.isAttachScreenshot()));
                sentryAndroidOptions.setAttachViewHierarchy(f(bundle, logger, "io.sentry.attach-view-hierarchy", sentryAndroidOptions.isAttachViewHierarchy()));
                sentryAndroidOptions.setSendClientReports(f(bundle, logger, "io.sentry.send-client-reports", sentryAndroidOptions.isSendClientReports()));
                if (f(bundle, logger, "io.sentry.auto-init", true)) {
                    sentryAndroidOptions.setInitPriority(io.sentry.j1.LOW);
                }
                sentryAndroidOptions.setForceInit(f(bundle, logger, "io.sentry.force-init", sentryAndroidOptions.isForceInit()));
                sentryAndroidOptions.setCollectAdditionalContext(f(bundle, logger, "io.sentry.additional-context", sentryAndroidOptions.isCollectAdditionalContext()));
                sentryAndroidOptions.setCollectExternalStorageContext(f(bundle, logger, "io.sentry.external-storage-context", sentryAndroidOptions.isCollectExternalStorageContext()));
                if (sentryAndroidOptions.getTracesSampleRate() == null) {
                    double dG2 = g(bundle, logger, "io.sentry.traces.sample-rate");
                    if (dG2 != -1.0d) {
                        sentryAndroidOptions.setTracesSampleRate(Double.valueOf(dG2));
                    }
                }
                sentryAndroidOptions.setTraceSampling(f(bundle, logger, "io.sentry.traces.trace-sampling", sentryAndroidOptions.isTraceSampling()));
                sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(f(bundle, logger, "io.sentry.traces.activity.enable", sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(f(bundle, logger, "io.sentry.traces.activity.auto-finish.enable", sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                    double dG3 = g(bundle, logger, "io.sentry.traces.profiling.sample-rate");
                    if (dG3 != -1.0d) {
                        sentryAndroidOptions.setProfilesSampleRate(Double.valueOf(dG3));
                    }
                }
                if (sentryAndroidOptions.getProfileSessionSampleRate() == null) {
                    double dG4 = g(bundle, logger, "io.sentry.traces.profiling.session-sample-rate");
                    if (dG4 != -1.0d) {
                        sentryAndroidOptions.setProfileSessionSampleRate(Double.valueOf(dG4));
                    }
                }
                String strName2 = sentryAndroidOptions.getProfileLifecycle().name();
                Locale locale2 = Locale.ROOT;
                String strJ4 = j(bundle, logger, "io.sentry.traces.profiling.lifecycle", strName2.toLowerCase(locale2));
                if (strJ4 != null) {
                    sentryAndroidOptions.setProfileLifecycle(f3.valueOf(strJ4.toUpperCase(locale2)));
                }
                sentryAndroidOptions.setStartProfilerOnAppStart(f(bundle, logger, "io.sentry.traces.profiling.start-on-app-start", sentryAndroidOptions.isStartProfilerOnAppStart()));
                sentryAndroidOptions.setEnableUserInteractionTracing(f(bundle, logger, "io.sentry.traces.user-interaction.enable", sentryAndroidOptions.isEnableUserInteractionTracing()));
                sentryAndroidOptions.setEnableTimeToFullDisplayTracing(f(bundle, logger, "io.sentry.traces.time-to-full-display.enable", sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                long jI = i(bundle, logger, "io.sentry.traces.idle-timeout", -1L);
                if (jI != -1) {
                    sentryAndroidOptions.setIdleTimeout(Long.valueOf(jI));
                }
                List<String> listH5 = h(bundle, logger, "io.sentry.traces.trace-propagation-targets");
                if (bundle.containsKey("io.sentry.traces.trace-propagation-targets") && listH5 == null) {
                    sentryAndroidOptions.setTracePropagationTargets(Collections.EMPTY_LIST);
                } else if (listH5 != null) {
                    sentryAndroidOptions.setTracePropagationTargets(listH5);
                }
                sentryAndroidOptions.setEnableFramesTracking(f(bundle, logger, "io.sentry.traces.frames-tracking", true));
                sentryAndroidOptions.setProguardUuid(j(bundle, logger, "io.sentry.proguard-uuid", sentryAndroidOptions.getProguardUuid()));
                io.sentry.protocol.t sdkVersion = sentryAndroidOptions.getSdkVersion();
                if (sdkVersion == null) {
                    sdkVersion = new io.sentry.protocol.t("", "");
                }
                String strK = k(bundle, logger, "io.sentry.sdk.name", sdkVersion.a());
                com.facebook.imagepipeline.nativecode.c.H(strK, "name is required.");
                sdkVersion.f13043d = strK;
                String strK2 = k(bundle, logger, "io.sentry.sdk.version", sdkVersion.b());
                com.facebook.imagepipeline.nativecode.c.H(strK2, "version is required.");
                sdkVersion.f13044e = strK2;
                sentryAndroidOptions.setSdkVersion(sdkVersion);
                sentryAndroidOptions.setSendDefaultPii(f(bundle, logger, "io.sentry.send-default-pii", sentryAndroidOptions.isSendDefaultPii()));
                List listH6 = h(bundle, logger, "io.sentry.gradle-plugin-integrations");
                if (listH6 != null) {
                    Iterator it = listH6.iterator();
                    while (it.hasNext()) {
                        v4.d().a((String) it.next());
                    }
                }
                sentryAndroidOptions.setEnableRootCheck(f(bundle, logger, "io.sentry.enable-root-check", sentryAndroidOptions.isEnableRootCheck()));
                sentryAndroidOptions.setSendModules(f(bundle, logger, "io.sentry.send-modules", sentryAndroidOptions.isSendModules()));
                sentryAndroidOptions.setEnablePerformanceV2(f(bundle, logger, "io.sentry.performance-v2.enable", sentryAndroidOptions.isEnablePerformanceV2()));
                sentryAndroidOptions.setEnableAppStartProfiling(f(bundle, logger, "io.sentry.profiling.enable-app-start", sentryAndroidOptions.isEnableAppStartProfiling()));
                sentryAndroidOptions.setEnableScopePersistence(f(bundle, logger, "io.sentry.enable-scope-persistence", sentryAndroidOptions.isEnableScopePersistence()));
                sentryAndroidOptions.setEnableAutoTraceIdGeneration(f(bundle, logger, "io.sentry.traces.enable-auto-id-generation", sentryAndroidOptions.isEnableAutoTraceIdGeneration()));
                sentryAndroidOptions.setDeadlineTimeout(i(bundle, logger, "io.sentry.traces.deadline-timeout", sentryAndroidOptions.getDeadlineTimeout()));
                if (sentryAndroidOptions.getSessionReplay().f() == null) {
                    double dG5 = g(bundle, logger, "io.sentry.session-replay.session-sample-rate");
                    if (dG5 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().q(Double.valueOf(dG5));
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().e() == null) {
                    double dG6 = g(bundle, logger, "io.sentry.session-replay.on-error-sample-rate");
                    if (dG6 != -1.0d) {
                        sentryAndroidOptions.getSessionReplay().p(Double.valueOf(dG6));
                    }
                }
                sentryAndroidOptions.getSessionReplay().j(f(bundle, logger, "io.sentry.session-replay.mask-all-text", true));
                sentryAndroidOptions.getSessionReplay().i(f(bundle, logger, "io.sentry.session-replay.mask-all-images", true));
                sentryAndroidOptions.getSessionReplay().h(f(bundle, logger, "io.sentry.session-replay.debug", false));
                String strJ5 = j(bundle, logger, "io.sentry.session-replay.screenshot-strategy", null);
                if (strJ5 != null) {
                    if ("canvas".equals(strJ5.toLowerCase(Locale.ROOT))) {
                        sentryAndroidOptions.getSessionReplay().f12061o = w3.CANVAS;
                    } else {
                        sentryAndroidOptions.getSessionReplay().f12061o = w3.PIXEL_COPY;
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().a().isEmpty() && (listH4 = h(bundle, logger, "io.sentry.session-replay.network-detail-allow-urls")) != null && !listH4.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = listH4.iterator();
                    while (it2.hasNext()) {
                        String strTrim = ((String) it2.next()).trim();
                        if (!strTrim.isEmpty()) {
                            arrayList.add(strTrim);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().l(arrayList);
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().b().isEmpty() && (listH3 = h(bundle, logger, "io.sentry.session-replay.network-detail-deny-urls")) != null && !listH3.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = listH3.iterator();
                    while (it3.hasNext()) {
                        String strTrim2 = ((String) it3.next()).trim();
                        if (!strTrim2.isEmpty()) {
                            arrayList2.add(strTrim2);
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().m(arrayList2);
                    }
                }
                sentryAndroidOptions.getSessionReplay().k(f(bundle, logger, "io.sentry.session-replay.network-capture-bodies", sentryAndroidOptions.getSessionReplay().g()));
                if (sentryAndroidOptions.getSessionReplay().c().size() == a6.f12048u.size() && (listH2 = h(bundle, logger, "io.sentry.session-replay.network-request-headers")) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it4 = listH2.iterator();
                    while (it4.hasNext()) {
                        String strTrim3 = ((String) it4.next()).trim();
                        if (!strTrim3.isEmpty()) {
                            arrayList3.add(strTrim3);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().n(arrayList3);
                    }
                }
                if (sentryAndroidOptions.getSessionReplay().d().size() == a6.f12048u.size() && (listH = h(bundle, logger, "io.sentry.session-replay.network-response-headers")) != null && !listH.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it5 = listH.iterator();
                    while (it5.hasNext()) {
                        String strTrim4 = ((String) it5.next()).trim();
                        if (!strTrim4.isEmpty()) {
                            arrayList4.add(strTrim4);
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        sentryAndroidOptions.getSessionReplay().o(arrayList4);
                    }
                }
                sentryAndroidOptions.setIgnoredErrors(h(bundle, logger, "io.sentry.ignored-errors"));
                List listH7 = h(bundle, logger, "io.sentry.in-app-includes");
                if (listH7 != null && !listH7.isEmpty()) {
                    Iterator it6 = listH7.iterator();
                    while (it6.hasNext()) {
                        sentryAndroidOptions.addInAppInclude((String) it6.next());
                    }
                }
                List listH8 = h(bundle, logger, "io.sentry.in-app-excludes");
                if (listH8 != null && !listH8.isEmpty()) {
                    Iterator it7 = listH8.iterator();
                    while (it7.hasNext()) {
                        sentryAndroidOptions.addInAppExclude((String) it7.next());
                    }
                }
                sentryAndroidOptions.getLogs().b(f(bundle, logger, "io.sentry.logs.enabled", sentryAndroidOptions.getLogs().a()));
                sentryAndroidOptions.getMetrics().b(f(bundle, logger, "io.sentry.metrics.enabled", sentryAndroidOptions.getMetrics().a()));
                s4 feedbackOptions = sentryAndroidOptions.getFeedbackOptions();
                feedbackOptions.h(f(bundle, logger, "io.sentry.feedback.is-name-required", feedbackOptions.b()));
                feedbackOptions.k(f(bundle, logger, "io.sentry.feedback.show-name", feedbackOptions.e()));
                feedbackOptions.g(f(bundle, logger, "io.sentry.feedback.is-email-required", feedbackOptions.a()));
                feedbackOptions.j(f(bundle, logger, "io.sentry.feedback.show-email", feedbackOptions.d()));
                feedbackOptions.l(f(bundle, logger, "io.sentry.feedback.use-sentry-user", feedbackOptions.f()));
                feedbackOptions.i(f(bundle, logger, "io.sentry.feedback.show-branding", feedbackOptions.c()));
            }
            sentryAndroidOptions.getLogger().q(SentryLevel.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().g(SentryLevel.ERROR, "Failed to read configuration from android manifest metadata.", th2);
        }
    }

    public static void c(byte[] bArr, boolean z5) {
        final w5 w5VarL = c4.f().l();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                io.sentry.c1 serializer = w5VarL.getSerializer();
                e4.c cVarA = w5VarL.getEnvelopeReader().a(byteArrayInputStream);
                if (cVarA == null) {
                    byteArrayInputStream.close();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                final boolean z6 = false;
                final g6 g6Var = null;
                for (p4 p4Var : (Iterable) cVarA.f7967i) {
                    arrayList.add(p4Var);
                    SentryEvent sentryEventG = p4Var.g(serializer);
                    if (sentryEventG != null) {
                        if (sentryEventG.e() != null) {
                            g6Var = g6.Crashed;
                        }
                        if ((sentryEventG.e() != null) || sentryEventG.f()) {
                            z6 = true;
                        }
                    }
                }
                final AtomicReference atomicReference = new AtomicReference();
                c4.d(null, new r3() { // from class: io.sentry.android.core.v0
                    @Override // io.sentry.r3
                    public final void g(IScope iScope) {
                        h6 h6VarV = iScope.v();
                        if (h6VarV == null) {
                            w5VarL.getLogger().q(SentryLevel.INFO, "Session is null on updateSession", new Object[0]);
                        } else if (h6VarV.d(g6Var, null, z6, null)) {
                            if (h6VarV.f12722y == g6.Crashed) {
                                h6VarV.b(io.sentry.config.a.y());
                                iScope.K();
                            }
                            atomicReference.set(h6VarV);
                        }
                    }
                });
                h6 h6Var = (h6) atomicReference.get();
                if (h6Var != null) {
                    arrayList.add(p4.d(serializer, h6Var));
                    if (z5 && c4.f().l().getThreadChecker().c()) {
                        try {
                            w5VarL.getExecutorService().submit(new z3(w5VarL, 4));
                        } catch (Throwable th2) {
                            w5VarL.getLogger().g(SentryLevel.WARNING, "Submission of deletion of the current session file rejected.", th2);
                        }
                    } else {
                        d(w5VarL);
                    }
                    if (z5) {
                        c4.f().p();
                    }
                }
                c4.f().i(new e4.c((l4) cVarA.f7966e, arrayList), new Hint());
                byteArrayInputStream.close();
                return;
            } catch (Throwable th3) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            w5VarL.getLogger().g(SentryLevel.ERROR, "Failed to capture envelope", th5);
        }
        w5VarL.getLogger().g(SentryLevel.ERROR, "Failed to capture envelope", th5);
    }

    public static void d(w5 w5Var) {
        String cacheDirPath = w5Var.getCacheDirPath();
        if (cacheDirPath == null) {
            w5Var.getLogger().q(SentryLevel.INFO, "Cache dir is not set, not deleting the current session.", new Object[0]);
            return;
        }
        if (!w5Var.isEnableAutoSessionTracking()) {
            w5Var.getLogger().q(SentryLevel.DEBUG, "Session tracking is disabled, bailing from deleting current session file.", new Object[0]);
            return;
        }
        int i7 = io.sentry.cache.c.G;
        if (new File(cacheDirPath, "session.json").delete()) {
            return;
        }
        w5Var.getLogger().q(SentryLevel.WARNING, "Failed to delete the current session file.", new Object[0]);
    }

    public static IScope e() {
        AtomicReference atomicReference = new AtomicReference();
        c4.d(t3.COMBINED, new gc.o(16, atomicReference));
        return (IScope) atomicReference.get();
    }

    public static boolean f(Bundle bundle, ILogger iLogger, String str, boolean z5) {
        boolean z6 = bundle.getBoolean(str, z5);
        iLogger.q(SentryLevel.DEBUG, str + " read: " + z6, new Object[0]);
        return z6;
    }

    public static double g(Bundle bundle, ILogger iLogger, String str) {
        double dDoubleValue = Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue();
        if (dDoubleValue == -1.0d) {
            dDoubleValue = Integer.valueOf(bundle.getInt(str, -1)).doubleValue();
        }
        iLogger.q(SentryLevel.DEBUG, str + " read: " + dDoubleValue, new Object[0]);
        return dDoubleValue;
    }

    public static List h(Bundle bundle, ILogger iLogger, String str) {
        String string = bundle.getString(str);
        iLogger.q(SentryLevel.DEBUG, kk.b.k(str, " read: ", string), new Object[0]);
        if (string != null) {
            return Arrays.asList(string.split(",", -1));
        }
        return null;
    }

    public static long i(Bundle bundle, ILogger iLogger, String str, long j) {
        long j5 = bundle.getInt(str, (int) j);
        iLogger.q(SentryLevel.DEBUG, str + " read: " + j5, new Object[0]);
        return j5;
    }

    public static String j(Bundle bundle, ILogger iLogger, String str, String str2) {
        String string = bundle.getString(str, str2);
        iLogger.q(SentryLevel.DEBUG, kk.b.k(str, " read: ", string), new Object[0]);
        return string;
    }

    public static String k(Bundle bundle, ILogger iLogger, String str, String str2) {
        String string = bundle.getString(str, str2);
        iLogger.q(SentryLevel.DEBUG, kk.b.k(str, " read: ", string), new Object[0]);
        return string;
    }

    public static HashMap l(Context context, SentryAndroidOptions sentryAndroidOptions, IScope iScope) {
        HashMap map = new HashMap();
        if (iScope != null) {
            try {
                ILogger logger = sentryAndroidOptions.getLogger();
                m1 m1Var = new m1(map);
                ArrayDeque arrayDeque = m1Var.f545d;
                p0 p0VarC = p0.c(context, sentryAndroidOptions);
                iScope.J().p(p0VarC.a(true, true));
                iScope.J().s(p0VarC.f12365g);
                io.sentry.protocol.h0 h0VarQ = iScope.Q();
                if (h0VarQ == null) {
                    h0VarQ = new io.sentry.protocol.h0();
                    iScope.m(h0VarQ);
                }
                if (h0VarQ.f12957e == null) {
                    try {
                        h0VarQ.f12957e = (String) sentryAndroidOptions.getRuntimeManager().h(new com.discord.chat.input.views.d(context, 7));
                    } catch (RuntimeException e10) {
                        logger.g(SentryLevel.ERROR, "Could not retrieve installation ID", e10);
                    }
                }
                io.sentry.protocol.a aVarD = iScope.J().d();
                if (aVarD == null) {
                    aVarD = new io.sentry.protocol.a();
                }
                aVarD.f12911w = (String) l0.f12346c.a(context);
                io.sentry.android.core.performance.g gVarA = io.sentry.android.core.performance.f.b().a(sentryAndroidOptions);
                if (gVarA.c()) {
                    b5 b5VarB = gVarA.b();
                    aVarD.f12908e = b5VarB == null ? null : io.sentry.config.a.z(Double.valueOf(b5VarB.f12492d / 1000000.0d).longValue());
                }
                k0 k0Var = new k0(sentryAndroidOptions.getLogger());
                PackageInfo packageInfoF = l0.f(context, sentryAndroidOptions.getLogger(), k0Var);
                if (packageInfoF != null) {
                    l0.k(packageInfoF, k0Var, p0VarC, aVarD);
                }
                iScope.J().n(aVarD);
                arrayDeque.add("user");
                m1Var.h(logger, iScope.Q());
                arrayDeque.add("contexts");
                m1Var.h(logger, iScope.J());
                arrayDeque.add("tags");
                m1Var.h(logger, iScope.D());
                arrayDeque.add("extras");
                m1Var.h(logger, iScope.getExtras());
                arrayDeque.add("fingerprint");
                m1Var.h(logger, iScope.P());
                arrayDeque.add("level");
                m1Var.h(logger, iScope.x());
                arrayDeque.add("breadcrumbs");
                m1Var.h(logger, iScope.w());
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().g(SentryLevel.ERROR, "Could not serialize scope.", th2);
                return new HashMap();
            }
        }
        return map;
    }
}
