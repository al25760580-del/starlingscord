package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x1 f2149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f2150e;

    public h(ViewGroup viewGroup, View view, boolean z5, x1 x1Var, i iVar) {
        this.f2146a = viewGroup;
        this.f2147b = view;
        this.f2148c = z5;
        this.f2149d = x1Var;
        this.f2150e = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        ViewGroup viewGroup = this.f2146a;
        View viewToAnimate = this.f2147b;
        viewGroup.endViewTransition(viewToAnimate);
        boolean z5 = this.f2148c;
        x1 x1Var = this.f2149d;
        if (z5 || x1Var.f2272a == z1.f2291i) {
            z1 z1Var = x1Var.f2272a;
            Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
            z1Var.a(viewToAnimate, viewGroup);
        }
        i iVar = this.f2150e;
        iVar.f2160c.f2178a.c(iVar);
        if (FragmentManager.M(2)) {
            Log.v("FragmentManager", "Animator from operation " + x1Var + " has ended.");
        }
    }
}
