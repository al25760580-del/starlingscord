package androidx.fragment.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f extends w1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f2133c;

    public f(g animationInfo) {
        Intrinsics.checkNotNullParameter(animationInfo, "animationInfo");
        this.f2133c = animationInfo;
    }

    @Override // androidx.fragment.app.w1
    public final void b(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        g gVar = this.f2133c;
        x1 x1Var = gVar.f2178a;
        View view = x1Var.f2274c.mView;
        view.clearAnimation();
        container.endViewTransition(view);
        gVar.f2178a.c(this);
        if (FragmentManager.M(2)) {
            Log.v("FragmentManager", "Animation from operation " + x1Var + " has been cancelled.");
        }
    }

    @Override // androidx.fragment.app.w1
    public final void c(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        g gVar = this.f2133c;
        x1 x1Var = gVar.f2178a;
        if (gVar.a()) {
            x1Var.c(this);
            return;
        }
        Context context = container.getContext();
        View view = x1Var.f2274c.mView;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        k0 k0VarB = gVar.b(context);
        if (k0VarB == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Animation animation = (Animation) k0VarB.f2172a;
        if (animation == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (x1Var.f2272a != z1.f2289d) {
            view.startAnimation(animation);
            x1Var.c(this);
            return;
        }
        container.startViewTransition(view);
        l0 l0Var = new l0(animation, container, view);
        l0Var.setAnimationListener(new e(x1Var, container, view, this));
        view.startAnimation(l0Var);
        if (FragmentManager.M(2)) {
            Log.v("FragmentManager", "Animation from operation " + x1Var + " has started.");
        }
    }
}
