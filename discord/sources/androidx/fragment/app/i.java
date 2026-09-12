package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i extends w1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f2160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AnimatorSet f2161d;

    public i(g animatorInfo) {
        Intrinsics.checkNotNullParameter(animatorInfo, "animatorInfo");
        this.f2160c = animatorInfo;
    }

    @Override // androidx.fragment.app.w1
    public final void b(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        AnimatorSet animatorSet = this.f2161d;
        g gVar = this.f2160c;
        if (animatorSet == null) {
            gVar.f2178a.c(this);
            return;
        }
        x1 x1Var = gVar.f2178a;
        if (!x1Var.f2278g) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            k.f2171a.a(animatorSet);
        }
        if (FragmentManager.M(2)) {
            StringBuilder sb2 = new StringBuilder("Animator from operation ");
            sb2.append(x1Var);
            sb2.append(" has been canceled");
            sb2.append(x1Var.f2278g ? " with seeking." : ".");
            sb2.append(' ');
            Log.v("FragmentManager", sb2.toString());
        }
    }

    @Override // androidx.fragment.app.w1
    public final void c(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        x1 x1Var = this.f2160c.f2178a;
        AnimatorSet animatorSet = this.f2161d;
        if (animatorSet == null) {
            x1Var.c(this);
            return;
        }
        animatorSet.start();
        if (FragmentManager.M(2)) {
            Log.v("FragmentManager", "Animator from operation " + x1Var + " has started.");
        }
    }

    @Override // androidx.fragment.app.w1
    public final void d(BackEventCompat backEvent, ViewGroup container) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        Intrinsics.checkNotNullParameter(container, "container");
        x1 x1Var = this.f2160c.f2178a;
        AnimatorSet animatorSet = this.f2161d;
        if (animatorSet == null) {
            x1Var.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !x1Var.f2274c.mTransitioning) {
            return;
        }
        if (FragmentManager.M(2)) {
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + x1Var);
        }
        long jA = j.f2164a.a(animatorSet);
        long j = (long) (backEvent.f699c * jA);
        if (j == 0) {
            j = 1;
        }
        if (j == jA) {
            j = jA - 1;
        }
        if (FragmentManager.M(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + x1Var);
        }
        k.f2171a.b(animatorSet, j);
    }

    @Override // androidx.fragment.app.w1
    public final void e(ViewGroup container) {
        i iVar;
        Intrinsics.checkNotNullParameter(container, "container");
        g gVar = this.f2160c;
        if (gVar.a()) {
            return;
        }
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        k0 k0VarB = gVar.b(context);
        this.f2161d = k0VarB != null ? (AnimatorSet) k0VarB.f2173b : null;
        x1 x1Var = gVar.f2178a;
        Fragment fragment = x1Var.f2274c;
        boolean z5 = x1Var.f2272a == z1.f2291i;
        View view = fragment.mView;
        container.startViewTransition(view);
        AnimatorSet animatorSet = this.f2161d;
        if (animatorSet != null) {
            iVar = this;
            animatorSet.addListener(new h(container, view, z5, x1Var, iVar));
        } else {
            iVar = this;
        }
        AnimatorSet animatorSet2 = iVar.f2161d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
