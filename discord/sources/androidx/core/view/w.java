package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class w implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f1736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewTreeObserver f1737e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f1738i;

    public w(View view, Runnable runnable) {
        this.f1736d = view;
        this.f1737e = view.getViewTreeObserver();
        this.f1738i = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        w wVar = new w(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(wVar);
        view.addOnAttachStateChangeListener(wVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.f1737e.isAlive()) {
            this.f1737e.removeOnPreDrawListener(this);
        } else {
            this.f1736d.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f1736d.removeOnAttachStateChangeListener(this);
        this.f1738i.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f1737e = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f1737e.isAlive()) {
            this.f1737e.removeOnPreDrawListener(this);
        } else {
            this.f1736d.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f1736d.removeOnAttachStateChangeListener(this);
    }
}
