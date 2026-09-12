package m3;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.discord.R;

/* JADX INFO: loaded from: classes.dex */
public final class f extends androidx.transition.c {
    public f(int i7) {
        if ((i7 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f2804d0 = i7;
    }

    public static float V(b0 b0Var, float f2) {
        Float f7;
        return (b0Var == null || (f7 = (Float) b0Var.f15372a.get("android:fade:transitionAlpha")) == null) ? f2 : f7.floatValue();
    }

    @Override // androidx.transition.c
    public final ObjectAnimator S(ViewGroup viewGroup, View view, b0 b0Var, b0 b0Var2) {
        d0.f15392a.getClass();
        return U(V(b0Var, 0.0f), 1.0f, view);
    }

    @Override // androidx.transition.c
    public final ObjectAnimator T(ViewGroup viewGroup, View view, b0 b0Var, b0 b0Var2) {
        e0 e0Var = d0.f15392a;
        e0Var.getClass();
        ObjectAnimator objectAnimatorU = U(V(b0Var, 1.0f), 0.0f, view);
        if (objectAnimatorU == null) {
            e0Var.G(view, V(b0Var2, 1.0f));
        }
        return objectAnimatorU;
    }

    public final ObjectAnimator U(float f2, float f7, View view) {
        if (f2 == f7) {
            return null;
        }
        d0.f15392a.G(view, f2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, d0.f15393b, f7);
        e eVar = new e(view);
        objectAnimatorOfFloat.addListener(eVar);
        q().a(eVar);
        return objectAnimatorOfFloat;
    }

    @Override // androidx.transition.Transition
    public final void g(b0 b0Var) {
        androidx.transition.c.Q(b0Var);
        View view = b0Var.f15373b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(d0.f15392a.p(view)) : Float.valueOf(0.0f);
        }
        b0Var.f15372a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // androidx.transition.Transition
    public final boolean v() {
        return true;
    }
}
