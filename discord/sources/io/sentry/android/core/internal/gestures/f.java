package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.facebook.react.uimanager.ViewProps;
import gc.o;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.x;
import io.sentry.f1;
import io.sentry.m6;
import io.sentry.protocol.g0;
import io.sentry.q6;
import io.sentry.r6;
import io.sentry.v3;
import io.sentry.x0;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f12234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0 f12235e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SentryAndroidOptions f12236i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public io.sentry.internal.gestures.b f12237v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public f1 f12238w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d f12239x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e f12240y;

    public f(Activity activity, v3 v3Var, SentryAndroidOptions sentryAndroidOptions) {
        d dVar = d.Unknown;
        this.f12239x = dVar;
        e eVar = new e();
        eVar.f12232c = dVar;
        eVar.f12230a = 0.0f;
        eVar.f12231b = 0.0f;
        this.f12240y = eVar;
        this.f12234d = new WeakReference(activity);
        this.f12235e = v3Var;
        this.f12236i = sentryAndroidOptions;
    }

    public final void a(io.sentry.internal.gestures.b bVar, d dVar, Map map, MotionEvent motionEvent) {
        String str;
        if (this.f12236i.isEnableUserInteractionBreadcrumbs()) {
            int i7 = c.f12229a[dVar.ordinal()];
            if (i7 == 1) {
                str = "click";
            } else if (i7 != 2) {
                str = i7 != 3 ? "unknown" : "swipe";
            } else {
                str = ViewProps.SCROLL;
            }
            Hint hint = new Hint();
            hint.d(motionEvent, "android:motionEvent");
            hint.d(bVar.f12761a.get(), "android:view");
            String str2 = bVar.f12763c;
            String str3 = bVar.f12762b;
            Breadcrumb breadcrumb = new Breadcrumb();
            breadcrumb.f12008w = "user";
            breadcrumb.f12010y = "ui.".concat(str);
            if (str2 != null) {
                breadcrumb.c(str2, "view.id");
            }
            if (str3 != null) {
                breadcrumb.c(str3, "view.class");
            }
            for (Map.Entry entry : map.entrySet()) {
                breadcrumb.f12009x.put((String) entry.getKey(), entry.getValue());
            }
            breadcrumb.F = SentryLevel.INFO;
            this.f12235e.g(breadcrumb, hint);
        }
    }

    public final View b(String str) {
        Activity activity = (Activity) this.f12234d.get();
        SentryAndroidOptions sentryAndroidOptions = this.f12236i;
        if (activity == null) {
            sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, s0.g.e("Activity is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, s0.g.e("Window is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            return decorView;
        }
        sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, s0.g.e("DecorView is null in ", str, ". No breadcrumb captured."), new Object[0]);
        return null;
    }

    public final void c(io.sentry.internal.gestures.b bVar, d dVar) {
        String str;
        boolean z5 = dVar == d.Click || !(dVar == this.f12239x && bVar.equals(this.f12237v));
        SentryAndroidOptions sentryAndroidOptions = this.f12236i;
        boolean zIsTracingEnabled = sentryAndroidOptions.isTracingEnabled();
        x0 x0Var = this.f12235e;
        if (!zIsTracingEnabled || !sentryAndroidOptions.isEnableUserInteractionTracing()) {
            if (z5) {
                if (sentryAndroidOptions.isEnableAutoTraceIdGeneration()) {
                    x0Var.r(null, new io.sentry.react.b(1));
                }
                this.f12237v = bVar;
                this.f12239x = dVar;
                return;
            }
            return;
        }
        Activity activity = (Activity) this.f12234d.get();
        if (activity == null) {
            sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String str2 = bVar.f12763c;
        if (str2 == null) {
            com.facebook.imagepipeline.nativecode.c.H(null, "UiElement.tag can't be null");
            str2 = null;
        }
        f1 f1Var = this.f12238w;
        if (f1Var != null) {
            if (!z5 && !f1Var.isFinished()) {
                sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, s0.g.e("The view with id: ", str2, " already has an ongoing transaction assigned. Rescheduling finish"), new Object[0]);
                if (sentryAndroidOptions.getIdleTimeout() != null) {
                    this.f12238w.m();
                    return;
                }
                return;
            }
            d(m6.OK);
        }
        String str3 = activity.getClass().getSimpleName() + "." + str2;
        int i7 = c.f12229a[dVar.ordinal()];
        if (i7 == 1) {
            str = "click";
        } else if (i7 != 2) {
            str = i7 != 3 ? "unknown" : "swipe";
        } else {
            str = ViewProps.SCROLL;
        }
        String strConcat = "ui.action.".concat(str);
        r6 r6Var = new r6();
        r6Var.f13092f = true;
        long deadlineTimeout = sentryAndroidOptions.getDeadlineTimeout();
        r6Var.f13094h = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
        r6Var.f13093g = sentryAndroidOptions.getIdleTimeout();
        r6Var.f67a = true;
        r6Var.f70d = "auto.ui.gesture_listener." + bVar.f12764d;
        f1 f1VarK = x0Var.k(new q6(str3, g0.COMPONENT, strConcat, null), r6Var);
        x0Var.r(null, new x(1, this, f1VarK));
        this.f12238w = f1VarK;
        this.f12237v = bVar;
        this.f12239x = dVar;
    }

    public final void d(m6 m6Var) {
        f1 f1Var = this.f12238w;
        if (f1Var != null) {
            if (f1Var.a() == null) {
                this.f12238w.f(m6Var);
            } else {
                this.f12238w.g();
            }
        }
        this.f12235e.r(null, new o(19, this));
        this.f12238w = null;
        if (this.f12237v != null) {
            this.f12237v = null;
        }
        this.f12239x = d.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        e eVar = this.f12240y;
        eVar.f12233d = null;
        eVar.f12232c = d.Unknown;
        eVar.f12230a = 0.0f;
        eVar.f12231b = 0.0f;
        eVar.f12230a = motionEvent.getX();
        eVar.f12231b = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f7) {
        this.f12240y.f12232c = d.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f7) {
        View viewB = b("onScroll");
        if (viewB != null && motionEvent != null) {
            e eVar = this.f12240y;
            if (((d) eVar.f12232c) == d.Unknown) {
                float x5 = motionEvent.getX();
                float y5 = motionEvent.getY();
                io.sentry.internal.gestures.a aVar = io.sentry.internal.gestures.a.SCROLLABLE;
                SentryAndroidOptions sentryAndroidOptions = this.f12236i;
                io.sentry.internal.gestures.b bVarA = h.a(sentryAndroidOptions, viewB, x5, y5, aVar);
                if (bVarA == null) {
                    sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                    eVar.f12232c = d.Scroll;
                    return false;
                }
                ILogger logger = sentryAndroidOptions.getLogger();
                SentryLevel sentryLevel = SentryLevel.DEBUG;
                StringBuilder sb2 = new StringBuilder("Scroll target found: ");
                String str = bVarA.f12763c;
                if (str == null) {
                    com.facebook.imagepipeline.nativecode.c.H(null, "UiElement.tag can't be null");
                    str = null;
                }
                sb2.append(str);
                logger.q(sentryLevel, sb2.toString(), new Object[0]);
                eVar.f12233d = bVarA;
                eVar.f12232c = d.Scroll;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View viewB = b("onSingleTapUp");
        if (viewB != null && motionEvent != null) {
            float x5 = motionEvent.getX();
            float y5 = motionEvent.getY();
            io.sentry.internal.gestures.a aVar = io.sentry.internal.gestures.a.CLICKABLE;
            SentryAndroidOptions sentryAndroidOptions = this.f12236i;
            io.sentry.internal.gestures.b bVarA = h.a(sentryAndroidOptions, viewB, x5, y5, aVar);
            if (bVarA == null) {
                sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            d dVar = d.Click;
            a(bVarA, dVar, Collections.EMPTY_MAP, motionEvent);
            c(bVarA, dVar);
        }
        return false;
    }
}
