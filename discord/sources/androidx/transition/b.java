package androidx.transition;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import m3.b0;
import m3.l;
import m3.m;
import m3.n;
import m3.o;
import mf.f;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final DecelerateInterpolator f2795g0 = new DecelerateInterpolator();
    public static final AccelerateInterpolator h0 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final m f2796i0 = new m(0);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final m f2797j0 = new m(1);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final n f2798k0 = new n(0);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final m f2799l0 = new m(2);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final m f2800m0 = new m(3);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final n f2801n0 = new n(1);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final o f2802f0;

    public b(int i7) {
        n nVar = f2801n0;
        this.f2802f0 = nVar;
        if (i7 == 3) {
            this.f2802f0 = f2796i0;
        } else if (i7 == 5) {
            this.f2802f0 = f2799l0;
        } else if (i7 == 48) {
            this.f2802f0 = f2798k0;
        } else if (i7 == 80) {
            this.f2802f0 = nVar;
        } else if (i7 == 8388611) {
            this.f2802f0 = f2797j0;
        } else {
            if (i7 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f2802f0 = f2800m0;
        }
        l lVar = new l();
        lVar.f15427a = i7;
        this.T = lVar;
    }

    @Override // androidx.transition.c
    public final ObjectAnimator S(ViewGroup viewGroup, View view, b0 b0Var, b0 b0Var2) {
        if (b0Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) b0Var2.f15372a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return f.g(view, b0Var2, iArr[0], iArr[1], this.f2802f0.b(view, viewGroup), this.f2802f0.c(view, viewGroup), translationX, translationY, f2795g0, this);
    }

    @Override // androidx.transition.c
    public final ObjectAnimator T(ViewGroup viewGroup, View view, b0 b0Var, b0 b0Var2) {
        if (b0Var == null) {
            return null;
        }
        int[] iArr = (int[]) b0Var.f15372a.get("android:slide:screenPosition");
        return f.g(view, b0Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f2802f0.b(view, viewGroup), this.f2802f0.c(view, viewGroup), h0, this);
    }

    @Override // androidx.transition.c, androidx.transition.Transition
    public final void d(b0 b0Var) {
        c.Q(b0Var);
        int[] iArr = new int[2];
        b0Var.f15373b.getLocationOnScreen(iArr);
        b0Var.f15372a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Transition
    public final void g(b0 b0Var) {
        c.Q(b0Var);
        int[] iArr = new int[2];
        b0Var.f15373b.getLocationOnScreen(iArr);
        b0Var.f15372a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Transition
    public final boolean v() {
        return true;
    }
}
