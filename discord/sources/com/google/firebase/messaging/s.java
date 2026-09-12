package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Log;
import androidx.activity.ComponentDialog;
import androidx.appcompat.widget.b4;
import androidx.core.app.FrameMetricsAggregator;
import androidx.work.WorkerParameters;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import app.rive.runtime.kotlin.RiveAnimationView;
import ar.b1;
import com.discord.chat.presentation.message.view.media.ViewAttachedListener;
import com.discord.chat.presentation.message.view.media.ViewScrollStateListener;
import com.discord.theme.ThemeModule;
import com.discord.view.ScreenOverride;
import com.facebook.react.modules.devloading.DevLoadingModule;
import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.reactnativecommunity.webview.RNCWebViewManager;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenContainer;
import com.swmansion.rnscreens.ScreenFragmentWrapper;
import com.swmansion.rnscreens.ScreenStack;
import com.swmansion.worklets.AndroidUIScheduler;
import gc.l1;
import io.sentry.c4;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.Call;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6615e;

    public /* synthetic */ s(int i7, Object obj) {
        this.f6614d = i7;
        this.f6615e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Screen screenA;
        int i7 = 0;
        switch (this.f6614d) {
            case 0:
                zl.e eVar = (zl.e) this.f6615e;
                synchronized (((ArrayDeque) eVar.f24047v)) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) eVar.f24044d).edit();
                    String str = (String) eVar.f24045e;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) eVar.f24047v).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) eVar.f24046i);
                    }
                    editorEdit.putString(str, sb2.toString()).commit();
                    break;
                }
                return;
            case 1:
                d0 d0Var = (d0) this.f6615e;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + d0Var.f6573a.getAction() + " finishing.");
                d0Var.f6574b.d(null);
                return;
            case 2:
                RNCWebViewManager.lambda$scheduleLoad$31((com.reactnativecommunity.webview.j) this.f6615e);
                return;
            case 3:
                ScreenContainer screenContainer = (ScreenContainer) this.f6615e;
                int i10 = ScreenContainer.f7147d;
                screenContainer.performUpdates();
                return;
            case 4:
                ScreenFragmentWrapper screenFragmentWrapper = (ScreenFragmentWrapper) this.f6615e;
                ScreenStack.Companion companion = ScreenStack.Companion;
                if (screenFragmentWrapper == null || (screenA = screenFragmentWrapper.a()) == null) {
                    return;
                }
                screenA.bringToFront();
                return;
            case 5:
                DevLoadingModule.hide$lambda$1((DevLoadingModule) this.f6615e);
                return;
            case 6:
                androidx.activity.a aVar = (androidx.activity.a) this.f6615e;
                Runnable runnable = aVar.f717e;
                if (runnable != null) {
                    Intrinsics.checkNotNull(runnable);
                    runnable.run();
                    aVar.f717e = null;
                    return;
                }
                return;
            case 7:
                ComponentDialog.a((ComponentDialog) this.f6615e);
                return;
            case 8:
                ((Call) this.f6615e).cancel();
                return;
            case 9:
                em.e eVar2 = ((em.m) this.f6615e).f8467d;
                if (eVar2 != null) {
                    RiveAnimationView.play$default(eVar2, null, null, false, 7, null);
                    return;
                }
                return;
            case 10:
                AndroidUIScheduler androidUIScheduler = (AndroidUIScheduler) this.f6615e;
                synchronized (androidUIScheduler.f7268b) {
                    try {
                        if (androidUIScheduler.f7268b.get()) {
                            androidUIScheduler.triggerUI();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 11:
                ThemeModule.updateTheme$lambda$1((ThemeModule) this.f6615e);
                return;
            case 12:
                ((ScreenOverride) this.f6615e).startRemovalTransition();
                return;
            case 13:
                l1 l1Var = (l1) this.f6615e;
                try {
                    synchronized (l1Var) {
                    }
                    try {
                        l1Var.f9747a.c(l1Var.f9750d, l1Var.f9751e);
                        return;
                    } finally {
                        l1Var.b(true);
                    }
                } catch (com.google.android.exoplayer2.b e10) {
                    je.b.s("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
                    throw new RuntimeException(e10);
                }
            case 14:
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) this.f6615e;
                int i11 = DefaultTimeBar.f5764n0;
                defaultTimeBar.d(false);
                return;
            case 15:
                hc.u uVar = (hc.u) this.f6615e;
                AnalyticsListener$EventTime analyticsListener$EventTimeC = uVar.c();
                uVar.i(analyticsListener$EventTimeC, 1028, new hc.i(analyticsListener$EventTimeC, 2));
                uVar.f10476x.d();
                return;
            case 16:
                ConstraintTrackingWorker this$0 = (ConstraintTrackingWorker) this.f6615e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.E.f9490d instanceof g4.a) {
                    return;
                }
                Object obj = this$0.f21414e.f2814b.f21405a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                String str2 = obj instanceof String ? (String) obj : null;
                v3.q qVarD = v3.q.d();
                Intrinsics.checkNotNullExpressionValue(qVarD, "get()");
                if (str2 == null || str2.length() == 0) {
                    qVarD.b(i4.a.f11388a, "No worker to delegate to.");
                    g4.j future = this$0.E;
                    Intrinsics.checkNotNullExpressionValue(future, "future");
                    future.j(new v3.l());
                    return;
                }
                v3.b0 b0Var = this$0.f21414e.f2817e;
                Context context = this$0.f21413d;
                WorkerParameters workerParameters = this$0.f2850w;
                b0Var.getClass();
                v3.p pVarA = v3.b0.a(context, str2, workerParameters);
                this$0.F = pVarA;
                if (pVarA == null) {
                    qVarD.a(i4.a.f11388a, "No worker to delegate to.");
                    g4.j future2 = this$0.E;
                    Intrinsics.checkNotNullExpressionValue(future2, "future");
                    future2.j(new v3.l());
                    return;
                }
                w3.o oVarA = w3.o.a(this$0.f21413d);
                Intrinsics.checkNotNullExpressionValue(oVarA, "getInstance(applicationContext)");
                e4.p pVarT = oVarA.f22048c.t();
                String string = this$0.f21414e.f2813a.toString();
                Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
                e4.o oVarN = pVarT.n(string);
                if (oVarN == null) {
                    g4.j future3 = this$0.E;
                    Intrinsics.checkNotNullExpressionValue(future3, "future");
                    String str3 = i4.a.f11388a;
                    future3.j(new v3.l());
                    return;
                }
                c4.l lVar = oVarA.j;
                Intrinsics.checkNotNullExpressionValue(lVar, "workManagerImpl.trackers");
                a4.i iVar = new a4.i(lVar);
                CoroutineDispatcher coroutineDispatcher = oVarA.f22049d.f10328b;
                Intrinsics.checkNotNullExpressionValue(coroutineDispatcher, "workManagerImpl.workTask…r.taskCoroutineDispatcher");
                this$0.E.a(new s(17, a4.l.a(iVar, oVarN, coroutineDispatcher, this$0)), new f4.n(0));
                if (!iVar.a(oVarN)) {
                    qVarD.a(i4.a.f11388a, "Constraints not met for delegate " + str2 + ". Requesting retry.");
                    g4.j future4 = this$0.E;
                    Intrinsics.checkNotNullExpressionValue(future4, "future");
                    future4.j(new v3.m());
                    return;
                }
                qVarD.a(i4.a.f11388a, "Constraints met for delegate ".concat(str2));
                try {
                    v3.p pVar = this$0.F;
                    Intrinsics.checkNotNull(pVar);
                    g4.j jVarD = pVar.d();
                    Intrinsics.checkNotNullExpressionValue(jVarD, "delegate!!.startWork()");
                    jVarD.a(new com.mkuczera.haptic.a(8, this$0, jVarD), this$0.f21414e.f2815c);
                    return;
                } catch (Throwable th3) {
                    String str4 = i4.a.f11388a;
                    String strE = s0.g.e("Delegated worker ", str2, " threw exception in startWork.");
                    if (qVarD.f21419a <= 3) {
                        Log.d(str4, strE, th3);
                    }
                    synchronized (this$0.f2851x) {
                        try {
                            if (!this$0.f2852y) {
                                g4.j future5 = this$0.E;
                                Intrinsics.checkNotNullExpressionValue(future5, "future");
                                future5.j(new v3.l());
                                return;
                            } else {
                                qVarD.a(str4, "Constraints were unmet, Retrying.");
                                g4.j future6 = this$0.E;
                                Intrinsics.checkNotNullExpressionValue(future6, "future");
                                future6.j(new v3.m());
                                return;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            case 17:
                b1 job = (b1) this.f6615e;
                Intrinsics.checkNotNullParameter(job, "$job");
                job.f(null);
                return;
            case 18:
                ViewAttachedListener.isAttachedRunnable$lambda$1((ViewAttachedListener) this.f6615e);
                return;
            case 19:
                ViewScrollStateListener.isScrollingStoppedRunnable$lambda$0((ViewScrollStateListener) this.f6615e);
                return;
            case 20:
                ((im.b) this.f6615e).m();
                return;
            case 21:
                ((im.h) this.f6615e).M();
                return;
            case 22:
                ((im.i) this.f6615e).a(false);
                return;
            case 23:
                ((im.s) this.f6615e).a(false);
                return;
            case 24:
                ((im.a0) this.f6615e).m();
                return;
            case 25:
                File[] fileArrListFiles = ((File) this.f6615e).listFiles();
                if (fileArrListFiles == null) {
                    return;
                }
                int length = fileArrListFiles.length;
                while (i7 < length) {
                    File file = fileArrListFiles[i7];
                    if (file.lastModified() < c4.f12518f - TimeUnit.MINUTES.toMillis(5L)) {
                        a.a.d(file);
                    }
                    i7++;
                }
                return;
            case 26:
                r rVar = (r) this.f6615e;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) rVar.f6610d;
                while (i7 < 40) {
                    try {
                        scheduledThreadPoolExecutor.schedule((bc.a) rVar.f6612i, 365L, TimeUnit.DAYS).cancel(true);
                        i7++;
                    } catch (RejectedExecutionException unused) {
                        return;
                    }
                }
                scheduledThreadPoolExecutor.purge();
                return;
            case 27:
                io.sentry.android.core.a aVar2 = (io.sentry.android.core.a) this.f6615e;
                aVar2.E = SystemClock.uptimeMillis();
                aVar2.F.set(false);
                return;
            case 28:
                ((FrameMetricsAggregator) ((io.sentry.util.e) ((b4) this.f6615e).f909d).a()).b();
                return;
            default:
                ((io.sentry.android.core.g) this.f6615e).h(true);
                return;
        }
    }

    public /* synthetic */ s(gc.e0 e0Var, l1 l1Var) {
        this.f6614d = 13;
        this.f6615e = l1Var;
    }

    public /* synthetic */ s(io.sentry.android.core.a aVar, hm.a aVar2) {
        this.f6614d = 27;
        this.f6615e = aVar;
    }
}
