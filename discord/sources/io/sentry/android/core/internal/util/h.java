package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.android.core.k0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f12300d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f12301e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Runnable f12302i;

    public h(View view, Runnable runnable) {
        this.f12301e = new AtomicReference(view);
        this.f12302i = runnable;
    }

    public static void a(Activity activity, Runnable runnable, k0 k0Var) {
        Window window = activity.getWindow();
        if (window != null) {
            View viewPeekDecorView = window.peekDecorView();
            if (viewPeekDecorView != null) {
                b(viewPeekDecorView, runnable, k0Var);
            } else {
                Window.Callback callback = window.getCallback();
                window.setCallback(new io.sentry.android.core.performance.h(callback != null ? callback : new io.sentry.android.core.internal.gestures.b(), new cb.a(7, window, callback, runnable, k0Var)));
            }
        }
    }

    public static void b(View view, Runnable runnable, k0 k0Var) {
        h hVar = new h(view, runnable);
        k0Var.getClass();
        if (Build.VERSION.SDK_INT >= 26 || (view.getViewTreeObserver().isAlive() && view.isAttachedToWindow())) {
            view.getViewTreeObserver().addOnDrawListener(hVar);
        } else {
            view.addOnAttachStateChangeListener(new dl.i(1, hVar));
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        View view = (View) this.f12301e.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new com.discord.tti_measurement_view.a(this, view, 1));
        this.f12300d.postAtFrontOfQueue(this.f12302i);
    }
}
