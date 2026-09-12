package com.mkuczera.haptic;

import a5.i0;
import a5.u;
import android.media.AudioTrack;
import android.os.Process;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewParent;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.view.m;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.fabric.FabricUIManager;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;
import com.google.common.util.concurrent.ListenableFuture;
import com.swmansion.reanimated.ReanimatedModule;
import com.swmansion.reanimated.layoutReanimation.SharedTransitionManager;
import f4.l;
import f4.q;
import g4.j;
import gc.b0;
import gc.j1;
import gc.n1;
import gc.u1;
import gc.w;
import gc.y;
import hc.p;
import ic.j0;
import io.sentry.Breadcrumb;
import io.sentry.ILogger;
import io.sentry.ISpan;
import io.sentry.SentryLevel;
import io.sentry.SpotlightIntegration;
import io.sentry.a1;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.AnrIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.f0;
import io.sentry.android.core.internal.util.o;
import io.sentry.android.replay.capture.BufferCaptureStrategy;
import io.sentry.android.replay.util.ReplayExecutorService;
import io.sentry.cache.g;
import io.sentry.cache.tape.e;
import io.sentry.j6;
import io.sentry.ndk.NativeScope;
import io.sentry.protocol.h0;
import io.sentry.protocol.v;
import io.sentry.r;
import io.sentry.u3;
import io.sentry.util.h;
import io.sentry.w5;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPOutputStream;
import je.e0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import md.s;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7006e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f7007i;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f7005d = i7;
        this.f7006e = obj;
        this.f7007i = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z5;
        String strC = null;
        boolean z6 = true;
        int i7 = 0;
        switch (this.f7005d) {
            case 0:
                ((View) this.f7006e).performHapticFeedback(((Integer) this.f7007i).intValue());
                return;
            case 1:
                ((ReanimatedModule) this.f7006e).lambda$initialize$2((FabricUIManager) this.f7007i);
                return;
            case 2:
                ((ReanimatedModule) this.f7006e).lambda$initialize$3((ReactApplicationContext) this.f7007i);
                return;
            case 3:
                ((SharedTransitionManager) this.f7006e).lambda$finishSharedAnimation$1((ViewParent) this.f7007i);
                return;
            case 4:
                ComponentActivity componentActivity = (ComponentActivity) this.f7006e;
                componentActivity.getLifecycle().a(new m(1, (OnBackPressedDispatcher) this.f7007i, componentActivity));
                return;
            case 5:
                q qVar = (q) this.f7006e;
                j jVar = (j) this.f7007i;
                if (qVar.f8851d.f9490d instanceof g4.a) {
                    jVar.cancel(true);
                    return;
                } else {
                    jVar.l(qVar.f8854v.a());
                    return;
                }
            case 6:
                com.google.android.exoplayer2.c cVar = (com.google.android.exoplayer2.c) this.f7006e;
                b0 b0Var = (b0) this.f7007i;
                int i10 = cVar.F - b0Var.f9566c;
                cVar.F = i10;
                if (b0Var.f9567d) {
                    cVar.G = b0Var.f9568e;
                    cVar.H = true;
                }
                if (b0Var.f9569f) {
                    cVar.I = b0Var.f9570g;
                }
                if (i10 == 0) {
                    Timeline timeline = b0Var.f9565b.f9714a;
                    if (!cVar.f5650g0.f9714a.p() && timeline.p()) {
                        cVar.h0 = -1;
                        cVar.f5653i0 = 0L;
                    }
                    if (!timeline.p()) {
                        List listAsList = Arrays.asList(((n1) timeline).E);
                        je.b.k(listAsList.size() == cVar.f5657o.size());
                        for (int i11 = 0; i11 < listAsList.size(); i11++) {
                            ((y) cVar.f5657o.get(i11)).f9949b = (Timeline) listAsList.get(i11);
                        }
                    }
                    long j = -9223372036854775807L;
                    if (cVar.H) {
                        if (b0Var.f9565b.f9715b.equals(cVar.f5650g0.f9715b) && b0Var.f9565b.f9717d == cVar.f5650g0.f9729r) {
                            z6 = false;
                        }
                        if (z6) {
                            if (timeline.p() || b0Var.f9565b.f9715b.a()) {
                                j = b0Var.f9565b.f9717d;
                            } else {
                                j1 j1Var = b0Var.f9565b;
                                s sVar = j1Var.f9715b;
                                long j5 = j1Var.f9717d;
                                Object obj = sVar.f15689a;
                                u1 u1Var = cVar.f5656n;
                                timeline.g(obj, u1Var);
                                j = j5 + u1Var.f9890w;
                            }
                        }
                        z5 = z6;
                    } else {
                        z5 = false;
                    }
                    long j7 = j;
                    cVar.H = false;
                    cVar.v0(b0Var.f9565b, 1, cVar.I, z5, cVar.G, j7, -1, false);
                    return;
                }
                return;
            case 7:
                l lVar = (l) this.f7006e;
                Runnable runnable = (Runnable) this.f7007i;
                lVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    lVar.a();
                }
            case 8:
                ConstraintTrackingWorker this$0 = (ConstraintTrackingWorker) this.f7006e;
                ListenableFuture innerFuture = (ListenableFuture) this.f7007i;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(innerFuture, "$innerFuture");
                synchronized (this$0.f2851x) {
                    try {
                        if (this$0.f2852y) {
                            j future = this$0.E;
                            Intrinsics.checkNotNullExpressionValue(future, "future");
                            String str = i4.a.f11388a;
                            future.j(new v3.m());
                        } else {
                            this$0.E.l(innerFuture);
                        }
                        Unit unit = Unit.f14616a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 9:
                u this$1 = (u) this.f7006e;
                Runnable runnable2 = (Runnable) this.f7007i;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(runnable2, "$runnable");
                try {
                    this$1.getClass();
                    Process.setThreadPriority(10);
                    break;
                } catch (Throwable unused) {
                }
                runnable2.run();
                return;
            case 10:
                e4.l lVar2 = (e4.l) this.f7006e;
                String str2 = (String) this.f7007i;
                w wVar = (w) lVar2.f7990i;
                int i12 = e0.f13788a;
                hc.u uVar = (hc.u) wVar.f9916d.f5659q;
                AnalyticsListener$EventTime analyticsListener$EventTimeH = uVar.h();
                uVar.i(analyticsListener$EventTimeH, 1012, new p(analyticsListener$EventTimeH, str2, i7));
                return;
            case 11:
                AudioTrack audioTrack = (AudioTrack) this.f7006e;
                i0 i0Var = (i0) this.f7007i;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    i0Var.p();
                    synchronized (j0.f11525g0) {
                        try {
                            int i13 = j0.f11526i0 - 1;
                            j0.f11526i0 = i13;
                            if (i13 == 0) {
                                j0.h0.shutdown();
                                j0.h0 = null;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th4) {
                    i0Var.p();
                    synchronized (j0.f11525g0) {
                        try {
                            int i14 = j0.f11526i0 - 1;
                            j0.f11526i0 = i14;
                            if (i14 == 0) {
                                j0.h0.shutdown();
                                j0.h0 = null;
                            }
                            throw th4;
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
            case 12:
                ((a1) this.f7007i).b(((u3) this.f7006e).l().getShutdownTimeoutMillis());
                return;
            case 13:
                SpotlightIntegration spotlightIntegration = (SpotlightIntegration) this.f7006e;
                e4.c cVar2 = (e4.c) this.f7007i;
                try {
                    w5 w5Var = spotlightIntegration.f12021d;
                    if (w5Var == null) {
                        throw new IllegalArgumentException("SentryOptions are required to send envelopes.");
                    }
                    HttpURLConnection httpURLConnectionF = SpotlightIntegration.f(w5Var.getSpotlightConnectionUrl() != null ? spotlightIntegration.f12021d.getSpotlightConnectionUrl() : h.f13226a ? "http://10.0.2.2:8969/stream" : "http://localhost:8969/stream");
                    try {
                        OutputStream outputStream = httpURLConnectionF.getOutputStream();
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                            try {
                                spotlightIntegration.f12021d.getSerializer().a(cVar2, gZIPOutputStream);
                                gZIPOutputStream.close();
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                spotlightIntegration.f12022e.q(SentryLevel.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionF.getResponseCode()));
                                return;
                            } catch (Throwable th6) {
                                try {
                                    gZIPOutputStream.close();
                                    throw th6;
                                } catch (Throwable th7) {
                                    th6.addSuppressed(th7);
                                    throw th6;
                                }
                            }
                        } catch (Throwable th8) {
                            if (outputStream == null) {
                                throw th8;
                            }
                            try {
                                outputStream.close();
                                throw th8;
                            } catch (Throwable th9) {
                                th8.addSuppressed(th9);
                                throw th8;
                            }
                            return;
                        }
                    } catch (Throwable th10) {
                        try {
                            spotlightIntegration.f12022e.g(SentryLevel.ERROR, "An exception occurred while submitting the envelope to the Sentry server.", th10);
                            spotlightIntegration.f12022e.q(SentryLevel.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionF.getResponseCode()));
                        } finally {
                            spotlightIntegration.f12022e.q(SentryLevel.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionF.getResponseCode()));
                            SpotlightIntegration.c(httpURLConnectionF);
                        }
                    }
                } catch (Exception e10) {
                    spotlightIntegration.f12022e.g(SentryLevel.ERROR, "An exception occurred while creating the connection to spotlight.", e10);
                    return;
                }
                break;
            case 14:
                ActivityLifecycleIntegration.f((ISpan) this.f7006e, (ISpan) this.f7007i);
                return;
            case 15:
                AnrIntegration anrIntegration = (AnrIntegration) this.f7006e;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f7007i;
                r rVarA = anrIntegration.f12082i.a();
                try {
                    if (!anrIntegration.f12081e) {
                        anrIntegration.c(sentryAndroidOptions);
                        break;
                    }
                    rVarA.close();
                    return;
                } catch (Throwable th11) {
                    try {
                        rVarA.close();
                        throw th11;
                    } catch (Throwable th12) {
                        th11.addSuppressed(th12);
                        throw th11;
                    }
                }
            case 16:
                ((f0) this.f7006e).f((ILogger) this.f7007i);
                return;
            case 17:
                o oVar = (o) this.f7006e;
                ILogger iLogger = (ILogger) this.f7007i;
                try {
                    oVar.G = Choreographer.getInstance();
                    return;
                } catch (Throwable th13) {
                    iLogger.g(SentryLevel.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th13);
                    return;
                }
            case 18:
                io.sentry.android.ndk.d dVar = (io.sentry.android.ndk.d) this.f7006e;
                Breadcrumb breadcrumb = (Breadcrumb) this.f7007i;
                w5 w5Var2 = dVar.f12467a;
                SentryLevel sentryLevel = breadcrumb.F;
                String lowerCase = sentryLevel != null ? sentryLevel.name().toLowerCase(Locale.ROOT) : null;
                String strG = io.sentry.config.a.G(breadcrumb.b());
                try {
                    ConcurrentHashMap concurrentHashMap = breadcrumb.f12009x;
                    if (!concurrentHashMap.isEmpty()) {
                        strC = w5Var2.getSerializer().c(concurrentHashMap);
                    }
                    break;
                } catch (Throwable th14) {
                    w5Var2.getLogger().e(SentryLevel.ERROR, th14, "Breadcrumb data is not serializable.", new Object[0]);
                }
                String str3 = strC;
                NativeScope nativeScope = dVar.f12468b;
                String str4 = breadcrumb.f12007v;
                String str5 = breadcrumb.f12010y;
                String str6 = breadcrumb.f12008w;
                nativeScope.getClass();
                NativeScope.nativeAddBreadcrumb(lowerCase, str4, str5, str6, strG, str3);
                return;
            case 19:
                io.sentry.android.ndk.d dVar2 = (io.sentry.android.ndk.d) this.f7006e;
                h0 h0Var = (h0) this.f7007i;
                NativeScope nativeScope2 = dVar2.f12468b;
                if (h0Var == null) {
                    nativeScope2.getClass();
                    NativeScope.nativeRemoveUser();
                    return;
                }
                String str7 = h0Var.f12957e;
                String str8 = h0Var.f12956d;
                String str9 = h0Var.f12959v;
                String str10 = h0Var.f12958i;
                nativeScope2.getClass();
                NativeScope.nativeSetUser(str7, str8, str9, str10);
                return;
            case 20:
                io.sentry.android.ndk.d dVar3 = (io.sentry.android.ndk.d) this.f7006e;
                j6 j6Var = (j6) this.f7007i;
                NativeScope nativeScope3 = dVar3.f12468b;
                String string = j6Var.f12782d.toString();
                String string2 = j6Var.f12783e.toString();
                nativeScope3.getClass();
                NativeScope.nativeSetTrace(string, string2);
                return;
            case 21:
                BufferCaptureStrategy.stop$lambda$0((File) this.f7006e, (BufferCaptureStrategy) this.f7007i);
                return;
            case 22:
                ReplayExecutorService.submit$lambda$0((Runnable) this.f7006e, (ReplayExecutorService) this.f7007i);
                return;
            case 23:
                ((g) this.f7006e).r((v) this.f7007i, "replay.json");
                return;
            case 24:
                g gVar = (g) this.f7006e;
                String str11 = (String) this.f7007i;
                if (str11 == null) {
                    gVar.o("transaction.json");
                    return;
                } else {
                    gVar.r(str11, "transaction.json");
                    return;
                }
            case 25:
                g gVar2 = (g) this.f7006e;
                h0 h0Var2 = (h0) this.f7007i;
                if (h0Var2 == null) {
                    gVar2.o("user.json");
                    return;
                } else {
                    gVar2.r(h0Var2, "user.json");
                    return;
                }
            case 26:
                ((g) this.f7006e).r((Collection) this.f7007i, "fingerprint.json");
                return;
            case 27:
                g gVar3 = (g) this.f7006e;
                try {
                    ((e) gVar3.f12543b.a()).i((Breadcrumb) this.f7007i);
                    return;
                } catch (IOException e11) {
                    gVar3.f12542a.getLogger().g(SentryLevel.ERROR, "Failed to add breadcrumb to file queue", e11);
                    return;
                }
            case 28:
                ((g) this.f7006e).r((io.sentry.protocol.c) this.f7007i, "contexts.json");
                return;
            default:
                g gVar4 = (g) this.f7006e;
                try {
                    ((Runnable) this.f7007i).run();
                    return;
                } catch (Throwable th15) {
                    gVar4.f12542a.getLogger().g(SentryLevel.ERROR, "Serialization task failed", th15);
                    return;
                }
        }
    }

    public /* synthetic */ a(ActivityLifecycleIntegration activityLifecycleIntegration, ISpan iSpan, ISpan iSpan2) {
        this.f7005d = 14;
        this.f7006e = iSpan;
        this.f7007i = iSpan2;
    }
}
