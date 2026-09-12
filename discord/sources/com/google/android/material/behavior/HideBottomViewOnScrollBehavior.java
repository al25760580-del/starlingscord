package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.discord.R;
import com.facebook.imageutils.JfifUtil;
import dl.i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import og.a;
import s0.g;
import v0.b;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TimeInterpolator f6249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TimeInterpolator f6250e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AccessibilityManager f6252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f6253h;
    public ViewPropertyAnimator k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f6246a = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6251f = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f6254i = true;
    public int j = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // v0.b
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i7) {
        this.f6251f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f6247b = io.sentry.config.a.S(view.getContext(), R.attr.motionDurationLong2, JfifUtil.MARKER_APP1);
        this.f6248c = io.sentry.config.a.S(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f6249d = io.sentry.config.a.T(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, lg.a.f15074d);
        this.f6250e = io.sentry.config.a.T(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, lg.a.f15073c);
        if (this.f6252g == null) {
            this.f6252g = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f6252g;
        if (accessibilityManager == null || this.f6253h != null) {
            return false;
        }
        a aVar = new a(this, view, 0);
        this.f6253h = aVar;
        accessibilityManager.addTouchExplorationStateChangeListener(aVar);
        view.addOnAttachStateChangeListener(new i(5, this));
        return false;
    }

    @Override // v0.b
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i7, int i10, int i11, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i7 <= 0) {
            if (i7 < 0) {
                s(view);
                return;
            }
            return;
        }
        if (this.j == 1) {
            return;
        }
        if (this.f6254i && (accessibilityManager = this.f6252g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 1;
        Iterator it = this.f6246a.iterator();
        if (it.hasNext()) {
            throw g.a(it);
        }
        this.k = view.animate().translationY(this.f6251f).setInterpolator(this.f6250e).setDuration(this.f6248c).setListener(new c(6, this));
    }

    @Override // v0.b
    public boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i10) {
        return i7 == 2;
    }

    public final void s(View view) {
        if (this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 2;
        Iterator it = this.f6246a.iterator();
        if (it.hasNext()) {
            throw g.a(it);
        }
        this.k = view.animate().translationY(0).setInterpolator(this.f6249d).setDuration(this.f6247b).setListener(new c(6, this));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
