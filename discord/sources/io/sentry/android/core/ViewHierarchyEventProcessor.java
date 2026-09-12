package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ViewHierarchyEventProcessor implements io.sentry.b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SentryAndroidOptions f12135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.g f12136e;

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        com.facebook.imagepipeline.nativecode.c.H(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f12135d = sentryAndroidOptions;
        this.f12136e = new io.sentry.android.core.internal.util.g(2000L, 3);
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            c9.a.c("ViewHierarchy");
        }
    }

    public static void a(View view, io.sentry.protocol.j0 j0Var, List list) {
        if (view instanceof ViewGroup) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw s0.g.a(it);
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt != null) {
                    io.sentry.protocol.j0 j0VarD = d(childAt);
                    arrayList.add(j0VarD);
                    a(childAt, j0VarD, list);
                }
            }
            j0Var.H = arrayList;
        }
    }

    public static io.sentry.protocol.i0 b(Activity activity, List list, io.sentry.util.thread.a aVar, ILogger iLogger) {
        ILogger iLogger2;
        Throwable th2;
        if (activity == null) {
            iLogger.q(SentryLevel.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            iLogger.q(SentryLevel.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            iLogger.q(SentryLevel.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        try {
            if (aVar.c()) {
                try {
                    ArrayList arrayList = new ArrayList(1);
                    io.sentry.protocol.i0 i0Var = new io.sentry.protocol.i0("android_view_system", arrayList);
                    io.sentry.protocol.j0 j0VarD = d(viewPeekDecorView);
                    arrayList.add(j0VarD);
                    a(viewPeekDecorView, j0VarD, list);
                    return i0Var;
                } catch (Throwable th3) {
                    th2 = th3;
                    iLogger2 = iLogger;
                }
            } else {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                AtomicReference atomicReference = new AtomicReference(null);
                iLogger2 = iLogger;
                try {
                    activity.runOnUiThread(new com.facebook.react.devsupport.h(atomicReference, viewPeekDecorView, list, countDownLatch, iLogger2, 4));
                    if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                        return (io.sentry.protocol.i0) atomicReference.get();
                    }
                    return null;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            iLogger2 = iLogger;
        }
        th2 = th;
        iLogger2.g(SentryLevel.ERROR, "Failed to process view hierarchy.", th2);
        return null;
    }

    public static io.sentry.protocol.j0 d(View view) {
        io.sentry.protocol.j0 j0Var = new io.sentry.protocol.j0();
        j0Var.f12978e = mf.f.t(view);
        try {
            j0Var.f12979i = io.sentry.android.core.internal.gestures.h.b(view);
        } catch (Throwable unused) {
        }
        j0Var.f12983y = Double.valueOf(view.getX());
        j0Var.E = Double.valueOf(view.getY());
        j0Var.f12981w = Double.valueOf(view.getWidth());
        j0Var.f12982x = Double.valueOf(view.getHeight());
        j0Var.G = Double.valueOf(view.getAlpha());
        int visibility = view.getVisibility();
        if (visibility == 0) {
            j0Var.F = ViewProps.VISIBLE;
        } else if (visibility == 4) {
            j0Var.F = "invisible";
        } else if (visibility == 8) {
            j0Var.F = "gone";
        }
        return j0Var;
    }

    @Override // io.sentry.b0
    public final SentryEvent f(SentryEvent sentryEvent, Hint hint) {
        if (sentryEvent.f()) {
            SentryAndroidOptions sentryAndroidOptions = this.f12135d;
            if (!sentryAndroidOptions.isAttachViewHierarchy()) {
                sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
                return sentryEvent;
            }
            if (!a5.l0.J(hint)) {
                boolean zA = this.f12136e.a();
                sentryAndroidOptions.getBeforeViewHierarchyCaptureCallback();
                if (!zA) {
                    WeakReference weakReference = (WeakReference) m0.f12349e.f12350d;
                    io.sentry.protocol.i0 i0VarB = b(weakReference != null ? (Activity) weakReference.get() : null, sentryAndroidOptions.getViewHierarchyExporters(), sentryAndroidOptions.getThreadChecker(), sentryAndroidOptions.getLogger());
                    if (i0VarB != null) {
                        hint.f12016e = new io.sentry.a(i0VarB);
                    }
                }
            }
        }
        return sentryEvent;
    }

    @Override // io.sentry.b0
    public final io.sentry.protocol.d0 g(io.sentry.protocol.d0 d0Var, Hint hint) {
        return d0Var;
    }
}
