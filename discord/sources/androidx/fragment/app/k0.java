package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cloneable f2173b;

    public k0(FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f2172a = fragmentManager;
        this.f2173b = new CopyOnWriteArrayList();
    }

    public void a(Fragment f2, Bundle bundle, boolean z5) {
        Intrinsics.checkNotNullParameter(f2, "f");
        FragmentManager fragmentManager = (FragmentManager) this.f2172a;
        Fragment fragment = fragmentManager.f2063y;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f2053o.a(f2, bundle, true);
        }
        for (o0 o0Var : (CopyOnWriteArrayList) this.f2173b) {
            if (z5) {
                o0Var.getClass();
            }
            o0Var.f2211a.onFragmentActivityCreated(fragmentManager, f2, bundle);
        }
    }

    public void b(Fragment f2, boolean z5) {
        Intrinsics.checkNotNullParameter(f2, "f");
        FragmentManager fragmentManager = (FragmentManager) this.f2172a;
        FragmentActivity fragmentActivity = fragmentManager.f2061w.f2038e;
        Fragment fragment = fragmentManager.f2063y;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f2053o.b(f2, true);
        }
        for (o0 o0Var : (CopyOnWriteArrayList) this.f2173b) {
            if (z5) {
                o0Var.getClass();
            }
            o0Var.f2211a.onFragmentAttached(fragmentManager, f2, fragmentActivity);
        }
    }

    public void c(Fragment f2, Bundle bundle, boolean z5) {
        Intrinsics.checkNotNullParameter(f2, "f");
        FragmentManager fragmentManager = (FragmentManager) this.f2172a;
        Fragment fragment = fragmentManager.f2063y;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f2053o.c(f2, bundle, true);
        }
        for (o0 o0Var : (CopyOnWriteArrayList) this.f2173b) {
            if (z5) {
                o0Var.getClass();
            }
            o0Var.f2211a.onFragmentCreated(fragmentManager, f2, bundle);
        }
    }

    public void d(Fragment f2, boolean z5) {
        Intrinsics.checkNotNullParameter(f2, "f");
        FragmentManager fragmentManager = (FragmentManager) this.f2172a;
        Fragment fragment = fragmentManager.f2063y;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f2053o.d(f2, true);
        }
        for (o0 o0Var : (CopyOnWriteArrayList) this.f2173b) {
            if (z5) {
                o0Var.getClass();
            }
            o0Var.f2211a.onFragmentDestroyed(fragmentManager, f2);
        }
    }

    public void e(Fragment f2, boolean z5) {
        Intrinsics.checkNotNullParameter(f2, "f");
        FragmentManager fragmentManager = (FragmentManager) this.f2172a;
        Fragment fragment = fragmentManager.f2063y;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f2053o.e(f2, true);
        }
        for (o0 o0Var : (CopyOnWriteArrayList) this.f2173b) {
            if (z5) {
                o0Var.getClass();
            }
            o0Var.f2211a.onFragmentDetached(fragmentManager, f2);
        }
    }

    public void f(Fragment f2, boolean z5) {
        Intrinsics.checkNotNullParameter(f2, "f");
        FragmentManager fragmentManager = (FragmentManager) this.f2172a;
        Fragment fragment = fragmentManager.f2063y;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f2053o.f(f2, true);
        }
        for (o0 o0Var : (CopyOnWriteArrayList) this.f2173b) {
            if (z5) {
                o0Var.getClass();
            }
            o0Var.f2211a.onFragmentPaused(fragmentManager, f2);
        }
    }

    public void g(Fragment f2, boolean z5) {
        Intrinsics.checkNotNullParameter(f2, "f");
        FragmentManager fragmentManager = (FragmentManager) this.f2172a;
        FragmentActivity fragmentActivity = fragmentManager.f2061w.f2038e;
        Fragment fragment = fragmentManager.f2063y;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f2053o.g(f2, true);
        }
        for (o0 o0Var : (CopyOnWriteArrayList) this.f2173b) {
            if (z5) {
                o0Var.getClass();
            }
            o0Var.f2211a.onFragmentPreAttached(fragmentManager, f2, fragmentActivity);
        }
    }

    public void h(Fragment f2, Bundle bundle, boolean z5) {
        Intrinsics.checkNotNullParameter(f2, "f");
        FragmentManager fragmentManager = (FragmentManager) this.f2172a;
        Fragment fragment = fragmentManager.f2063y;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f2053o.h(f2, bundle, true);
        }
        for (o0 o0Var : (CopyOnWriteArrayList) this.f2173b) {
            if (z5) {
                o0Var.getClass();
            }
            o0Var.f2211a.onFragmentPreCreated(fragmentManager, f2, bundle);
        }
    }

    public void i(Fragment f2, boolean z5) {
        Intrinsics.checkNotNullParameter(f2, "f");
        FragmentManager fragmentManager = (FragmentManager) this.f2172a;
        Fragment fragment = fragmentManager.f2063y;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f2053o.i(f2, true);
        }
        for (o0 o0Var : (CopyOnWriteArrayList) this.f2173b) {
            if (z5) {
                o0Var.getClass();
            }
            o0Var.f2211a.onFragmentResumed(fragmentManager, f2);
        }
    }

    public void j(Fragment f2, Bundle outState, boolean z5) {
        Intrinsics.checkNotNullParameter(f2, "f");
        Intrinsics.checkNotNullParameter(outState, "outState");
        FragmentManager fragmentManager = (FragmentManager) this.f2172a;
        Fragment fragment = fragmentManager.f2063y;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f2053o.j(f2, outState, true);
        }
        for (o0 o0Var : (CopyOnWriteArrayList) this.f2173b) {
            if (z5) {
                o0Var.getClass();
            }
            o0Var.f2211a.onFragmentSaveInstanceState(fragmentManager, f2, outState);
        }
    }

    public void k(Fragment f2, boolean z5) {
        Intrinsics.checkNotNullParameter(f2, "f");
        FragmentManager fragmentManager = (FragmentManager) this.f2172a;
        Fragment fragment = fragmentManager.f2063y;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f2053o.k(f2, true);
        }
        for (o0 o0Var : (CopyOnWriteArrayList) this.f2173b) {
            if (z5) {
                o0Var.getClass();
            }
            o0Var.f2211a.onFragmentStarted(fragmentManager, f2);
        }
    }

    public void l(Fragment f2, boolean z5) {
        Intrinsics.checkNotNullParameter(f2, "f");
        FragmentManager fragmentManager = (FragmentManager) this.f2172a;
        Fragment fragment = fragmentManager.f2063y;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f2053o.l(f2, true);
        }
        for (o0 o0Var : (CopyOnWriteArrayList) this.f2173b) {
            if (z5) {
                o0Var.getClass();
            }
            o0Var.f2211a.onFragmentStopped(fragmentManager, f2);
        }
    }

    public void m(Fragment f2, View v6, Bundle bundle, boolean z5) {
        Intrinsics.checkNotNullParameter(f2, "f");
        Intrinsics.checkNotNullParameter(v6, "v");
        FragmentManager fragmentManager = (FragmentManager) this.f2172a;
        Fragment fragment = fragmentManager.f2063y;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f2053o.m(f2, v6, bundle, true);
        }
        for (o0 o0Var : (CopyOnWriteArrayList) this.f2173b) {
            if (z5) {
                o0Var.getClass();
            }
            o0Var.f2211a.onFragmentViewCreated(fragmentManager, f2, v6, bundle);
        }
    }

    public void n(Fragment f2, boolean z5) {
        Intrinsics.checkNotNullParameter(f2, "f");
        FragmentManager fragmentManager = (FragmentManager) this.f2172a;
        Fragment fragment = fragmentManager.f2063y;
        if (fragment != null) {
            FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.f2053o.n(f2, true);
        }
        for (o0 o0Var : (CopyOnWriteArrayList) this.f2173b) {
            if (z5) {
                o0Var.getClass();
            }
            o0Var.f2211a.onFragmentViewDestroyed(fragmentManager, f2);
        }
    }

    public k0(Animation animation) {
        this.f2172a = animation;
        this.f2173b = null;
    }

    public k0(Animator animator) {
        this.f2172a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2173b = animatorSet;
        animatorSet.play(animator);
    }
}
