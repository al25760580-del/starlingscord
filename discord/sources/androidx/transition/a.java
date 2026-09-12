package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ViewProps;
import fh.g;
import java.util.HashMap;
import m3.b0;
import m3.d0;
import mo.c0;
import vi.d;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Transition {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String[] f2790d0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final g f2791e0 = new g(PointF.class, "topLeft", 5);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final g f2792f0 = new g(PointF.class, "bottomRight", 6);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final g f2793g0 = new g(PointF.class, "bottomRight", 7);
    public static final g h0 = new g(PointF.class, "topLeft", 8);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final g f2794i0 = new g(PointF.class, ViewProps.POSITION, 9);

    public static void Q(b0 b0Var) {
        View view = b0Var.f15373b;
        HashMap map = b0Var.f15372a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // androidx.transition.Transition
    public final void d(b0 b0Var) {
        Q(b0Var);
    }

    @Override // androidx.transition.Transition
    public final void g(b0 b0Var) {
        Q(b0Var);
    }

    @Override // androidx.transition.Transition
    public final Animator l(ViewGroup viewGroup, b0 b0Var, b0 b0Var2) {
        int i7;
        a aVar;
        Animator animatorOfObject;
        if (b0Var != null) {
            HashMap map = b0Var.f15372a;
            if (b0Var2 != null) {
                HashMap map2 = b0Var2.f15372a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = b0Var2.f15373b;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i10 = rect.left;
                    int i11 = rect2.left;
                    int i12 = rect.top;
                    int i13 = rect2.top;
                    int i14 = rect.right;
                    int i15 = rect2.right;
                    int i16 = rect.bottom;
                    int i17 = rect2.bottom;
                    int i18 = i14 - i10;
                    int i19 = i16 - i12;
                    int i20 = i15 - i11;
                    int i21 = i17 - i13;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i18 == 0 || i19 == 0) && (i20 == 0 || i21 == 0)) {
                        i7 = 0;
                    } else {
                        i7 = (i10 == i11 && i12 == i13) ? 0 : 1;
                        if (i14 != i15 || i16 != i17) {
                            i7++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i7++;
                    }
                    int i22 = i7;
                    if (i22 > 0) {
                        d0.a(view, i10, i12, i14, i16);
                        if (i22 != 2) {
                            aVar = this;
                            if (i10 == i11 && i12 == i13) {
                                aVar.V.getClass();
                                animatorOfObject = ObjectAnimator.ofObject(view, f2793g0, (TypeConverter) null, d.p(i14, i16, i15, i17));
                            } else {
                                aVar.V.getClass();
                                animatorOfObject = ObjectAnimator.ofObject(view, h0, (TypeConverter) null, d.p(i10, i12, i11, i13));
                            }
                        } else if (i18 == i20 && i19 == i21) {
                            aVar = this;
                            aVar.V.getClass();
                            animatorOfObject = ObjectAnimator.ofObject(view, f2794i0, (TypeConverter) null, d.p(i10, i12, i11, i13));
                        } else {
                            aVar = this;
                            m3.d dVar = new m3.d(view);
                            aVar.V.getClass();
                            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(dVar, f2791e0, (TypeConverter) null, d.p(i10, i12, i11, i13));
                            aVar.V.getClass();
                            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(dVar, f2792f0, (TypeConverter) null, d.p(i14, i16, i15, i17));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
                            animatorSet.addListener(new m3.b(dVar));
                            animatorOfObject = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            c0.O(viewGroup4, true);
                            aVar.q().a(new m3.c(viewGroup4));
                        }
                        return animatorOfObject;
                    }
                }
            }
        }
        return null;
    }

    @Override // androidx.transition.Transition
    public final String[] s() {
        return f2790d0;
    }
}
