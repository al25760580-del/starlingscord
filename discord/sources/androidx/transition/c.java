package androidx.transition;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import m3.b0;
import m3.i0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends Transition {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String[] f2803e0 = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f2804d0 = 3;

    public static void Q(b0 b0Var) {
        View view = b0Var.f15373b;
        int visibility = view.getVisibility();
        HashMap map = b0Var.f15372a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static i0 R(b0 b0Var, b0 b0Var2) {
        i0 i0Var = new i0();
        i0Var.f15419a = false;
        i0Var.f15420b = false;
        if (b0Var != null) {
            HashMap map = b0Var.f15372a;
            if (map.containsKey("android:visibility:visibility")) {
                i0Var.f15421c = ((Integer) map.get("android:visibility:visibility")).intValue();
                i0Var.f15423e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                i0Var.f15421c = -1;
                i0Var.f15423e = null;
            }
        } else {
            i0Var.f15421c = -1;
            i0Var.f15423e = null;
        }
        if (b0Var2 != null) {
            HashMap map2 = b0Var2.f15372a;
            if (map2.containsKey("android:visibility:visibility")) {
                i0Var.f15422d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                i0Var.f15424f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                i0Var.f15422d = -1;
                i0Var.f15424f = null;
            }
        } else {
            i0Var.f15422d = -1;
            i0Var.f15424f = null;
        }
        if (b0Var != null && b0Var2 != null) {
            int i7 = i0Var.f15421c;
            int i10 = i0Var.f15422d;
            if (i7 != i10 || i0Var.f15423e != i0Var.f15424f) {
                if (i7 != i10) {
                    if (i7 == 0) {
                        i0Var.f15420b = false;
                        i0Var.f15419a = true;
                        return i0Var;
                    }
                    if (i10 == 0) {
                        i0Var.f15420b = true;
                        i0Var.f15419a = true;
                        return i0Var;
                    }
                } else {
                    if (i0Var.f15424f == null) {
                        i0Var.f15420b = false;
                        i0Var.f15419a = true;
                        return i0Var;
                    }
                    if (i0Var.f15423e == null) {
                        i0Var.f15420b = true;
                        i0Var.f15419a = true;
                        return i0Var;
                    }
                }
            }
        } else {
            if (b0Var == null && i0Var.f15422d == 0) {
                i0Var.f15420b = true;
                i0Var.f15419a = true;
                return i0Var;
            }
            if (b0Var2 == null && i0Var.f15421c == 0) {
                i0Var.f15420b = false;
                i0Var.f15419a = true;
            }
        }
        return i0Var;
    }

    public abstract ObjectAnimator S(ViewGroup viewGroup, View view, b0 b0Var, b0 b0Var2);

    public abstract ObjectAnimator T(ViewGroup viewGroup, View view, b0 b0Var, b0 b0Var2);

    @Override // androidx.transition.Transition
    public void d(b0 b0Var) {
        Q(b0Var);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:58:0x0126  */
    /* JADX WARN: Code duplicated, block: B:61:0x012f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0135  */
    /* JADX WARN: Code duplicated, block: B:65:0x013d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0153  */
    /* JADX WARN: Code duplicated, block: B:69:0x016f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:74:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:83:0x0204  */
    /* JADX WARN: Code duplicated, block: B:86:0x020b  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (R(p(r5, false), t(r5, false)).f15419a != false) goto L9;
     */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator l(android.view.ViewGroup r25, m3.b0 r26, m3.b0 r27) {
        /*
            Method dump skipped, instruction units count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.c.l(android.view.ViewGroup, m3.b0, m3.b0):android.animation.Animator");
    }

    @Override // androidx.transition.Transition
    public final String[] s() {
        return f2803e0;
    }

    @Override // androidx.transition.Transition
    public final boolean w(b0 b0Var, b0 b0Var2) {
        if (b0Var == null && b0Var2 == null) {
            return false;
        }
        if (b0Var != null && b0Var2 != null && b0Var2.f15372a.containsKey("android:visibility:visibility") != b0Var.f15372a.containsKey("android:visibility:visibility")) {
            return false;
        }
        i0 i0VarR = R(b0Var, b0Var2);
        if (i0VarR.f15419a) {
            return i0VarR.f15421c == 0 || i0VarR.f15422d == 0;
        }
        return false;
    }
}
