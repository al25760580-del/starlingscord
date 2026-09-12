package androidx.fragment.app;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f2178a;

    public l(x1 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.f2178a = operation;
    }

    public final boolean a() {
        z1 z1Var;
        x1 x1Var = this.f2178a;
        View view = x1Var.f2274c.mView;
        z1 z1Var2 = z1.f2290e;
        if (view != null) {
            Intrinsics.checkNotNullParameter(view, "<this>");
            float alpha = view.getAlpha();
            z1Var = z1.f2292v;
            if (alpha != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    z1Var = z1Var2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(kk.b.h(visibility, "Unknown visibility "));
                    }
                    z1Var = z1.f2291i;
                }
            }
        } else {
            z1Var = null;
        }
        z1 z1Var3 = x1Var.f2272a;
        if (z1Var != z1Var3) {
            return (z1Var == z1Var2 || z1Var3 == z1Var2) ? false : true;
        }
        return true;
    }
}
