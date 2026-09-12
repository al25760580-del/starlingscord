package androidx.core.view;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.core.graphics.Insets;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class h1 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1 f1665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WindowInsetsCompat f1666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WindowInsetsCompat f1667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f1669e;

    public h1(p1 p1Var, WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i7, View view) {
        this.f1665a = p1Var;
        this.f1666b = windowInsetsCompat;
        this.f1667c = windowInsetsCompat2;
        this.f1668d = i7;
        this.f1669e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        x1 t1Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        p1 p1Var = this.f1665a;
        o1 o1Var = p1Var.f1715a;
        o1Var.d(animatedFraction);
        WindowInsetsCompat windowInsetsCompat = this.f1666b;
        f2 f2Var = windowInsetsCompat.f1605a;
        float fB = o1Var.b();
        PathInterpolator pathInterpolator = k1.f1687e;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            t1Var = new w1(windowInsetsCompat);
        } else if (i7 >= 31) {
            t1Var = new v1(windowInsetsCompat);
        } else if (i7 >= 30) {
            t1Var = new u1(windowInsetsCompat);
        } else {
            t1Var = i7 >= 29 ? new t1(windowInsetsCompat) : new r1(windowInsetsCompat);
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((this.f1668d & i10) == 0) {
                t1Var.c(i10, f2Var.f(i10));
            } else {
                Insets insetsF = f2Var.f(i10);
                Insets insetsF2 = this.f1667c.f1605a.f(i10);
                float f2 = 1.0f - fB;
                t1Var.c(i10, WindowInsetsCompat.e(insetsF, (int) (((double) ((insetsF.f1556a - insetsF2.f1556a) * f2)) + 0.5d), (int) (((double) ((insetsF.f1557b - insetsF2.f1557b) * f2)) + 0.5d), (int) (((double) ((insetsF.f1558c - insetsF2.f1558c) * f2)) + 0.5d), (int) (((double) ((insetsF.f1559d - insetsF2.f1559d) * f2)) + 0.5d)));
            }
        }
        k1.g(this.f1669e, t1Var.b(), Collections.singletonList(p1Var));
    }
}
