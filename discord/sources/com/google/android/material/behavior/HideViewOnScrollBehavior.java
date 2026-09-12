package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.discord.R;
import com.facebook.imageutils.JfifUtil;
import dl.i;
import io.sentry.config.a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import s0.g;
import v0.b;
import v0.d;

/* JADX INFO: loaded from: classes3.dex */
public class HideViewOnScrollBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f6255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AccessibilityManager f6256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public og.a f6257c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TimeInterpolator f6261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TimeInterpolator f6262h;
    public ViewPropertyAnimator k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f6258d = new LinkedHashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6263i = 0;
    public int j = 2;

    public HideViewOnScrollBehavior() {
    }

    @Override // v0.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i7) {
        if (this.f6256b == null) {
            this.f6256b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f6256b;
        if (accessibilityManager != null && this.f6257c == null) {
            og.a aVar = new og.a(this, view, 1);
            this.f6257c = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            view.addOnAttachStateChangeListener(new i(6, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i10 = ((d) view.getLayoutParams()).f21327c;
        if (i10 == 80 || i10 == 81) {
            s(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i10, i7);
            s((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.f6263i = this.f6255a.E(view, marginLayoutParams);
        this.f6259e = a.S(view.getContext(), R.attr.motionDurationLong2, JfifUtil.MARKER_APP1);
        this.f6260f = a.S(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f6261g = a.T(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, lg.a.f15074d);
        this.f6262h = a.T(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, lg.a.f15073c);
        return false;
    }

    @Override // v0.b
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i7, int i10, int i11, int[] iArr) {
        if (i7 <= 0) {
            if (i7 < 0) {
                t(view);
                return;
            }
            return;
        }
        if (this.j == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.f6256b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.j = 1;
            Iterator it = this.f6258d.iterator();
            if (it.hasNext()) {
                throw g.a(it);
            }
            this.k = this.f6255a.J(this.f6263i, view).setInterpolator(this.f6262h).setDuration(this.f6260f).setListener(new c(7, this));
        }
    }

    @Override // v0.b
    public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i7, int i10) {
        return i7 == 2;
    }

    public final void s(int i7) {
        a aVar = this.f6255a;
        if (aVar == null || aVar.I() != i7) {
            if (i7 == 0) {
                this.f6255a = new og.b(2);
            } else if (i7 == 1) {
                this.f6255a = new og.b(0);
            } else {
                if (i7 != 2) {
                    throw new IllegalArgumentException(g.d(i7, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
                }
                this.f6255a = new og.b(1);
            }
        }
    }

    public final void t(View view) {
        if (this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.j = 2;
        Iterator it = this.f6258d.iterator();
        if (it.hasNext()) {
            throw g.a(it);
        }
        this.f6255a.getClass();
        this.k = this.f6255a.J(0, view).setInterpolator(this.f6261g).setDuration(this.f6259e).setListener(new c(7, this));
    }

    public HideViewOnScrollBehavior(@NonNull Context context, AttributeSet attributeSet) {
    }
}
