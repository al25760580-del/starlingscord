package bh;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.Transition;
import java.util.HashMap;
import m3.b0;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends Transition {
    @Override // androidx.transition.Transition
    public final void d(b0 b0Var) {
        View view = b0Var.f15373b;
        if (view instanceof TextView) {
            b0Var.f15372a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.Transition
    public final void g(b0 b0Var) {
        View view = b0Var.f15373b;
        if (view instanceof TextView) {
            b0Var.f15372a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.Transition
    public final Animator l(ViewGroup viewGroup, b0 b0Var, b0 b0Var2) {
        if (b0Var == null || b0Var2 == null || !(b0Var.f15373b instanceof TextView)) {
            return null;
        }
        View view = b0Var2.f15373b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap map = b0Var.f15372a;
        HashMap map2 = b0Var2.f15372a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new m(0, textView));
        return valueAnimatorOfFloat;
    }
}
