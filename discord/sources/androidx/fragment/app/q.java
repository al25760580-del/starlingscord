package androidx.fragment.app;

import android.transition.Transition;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2237d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(x1 operation, boolean z5, boolean z6) {
        super(operation);
        Intrinsics.checkNotNullParameter(operation, "operation");
        Fragment fragment = operation.f2274c;
        z1 z1Var = operation.f2272a;
        z1 z1Var2 = z1.f2290e;
        this.f2235b = z1Var == z1Var2 ? z5 ? fragment.getReenterTransition() : fragment.getEnterTransition() : z5 ? fragment.getReturnTransition() : fragment.getExitTransition();
        this.f2236c = operation.f2272a == z1Var2 ? z5 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
        this.f2237d = z6 ? z5 ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
    }

    public final t1 b() {
        Object obj = this.f2235b;
        t1 t1VarC = c(obj);
        Object obj2 = this.f2237d;
        t1 t1VarC2 = c(obj2);
        if (t1VarC == null || t1VarC2 == null || t1VarC == t1VarC2) {
            return t1VarC == null ? t1VarC2 : t1VarC;
        }
        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f2178a.f2274c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
    }

    public final t1 c(Object obj) {
        if (obj == null) {
            return null;
        }
        r1 r1Var = m1.f2198a;
        if (obj instanceof Transition) {
            return r1Var;
        }
        t1 t1Var = m1.f2199b;
        if (t1Var != null && t1Var.g(obj)) {
            return t1Var;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f2178a.f2274c + " is not a valid framework Transition or AndroidX Transition");
    }
}
