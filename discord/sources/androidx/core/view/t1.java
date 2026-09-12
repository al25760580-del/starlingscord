package androidx.core.view;

import android.view.WindowInsets;
import androidx.core.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public class t1 extends x1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f1728c;

    public t1() {
        this.f1728c = s1.d();
    }

    @Override // androidx.core.view.x1
    public WindowInsetsCompat b() {
        a();
        WindowInsetsCompat windowInsetsCompatG = WindowInsetsCompat.g(null, this.f1728c.build());
        windowInsetsCompatG.f1605a.q(this.f1743b);
        return windowInsetsCompatG;
    }

    @Override // androidx.core.view.x1
    public void d(Insets insets) {
        this.f1728c.setMandatorySystemGestureInsets(insets.d());
    }

    @Override // androidx.core.view.x1
    public void e(Insets insets) {
        this.f1728c.setStableInsets(insets.d());
    }

    @Override // androidx.core.view.x1
    public void f(Insets insets) {
        this.f1728c.setSystemGestureInsets(insets.d());
    }

    @Override // androidx.core.view.x1
    public void g(Insets insets) {
        this.f1728c.setSystemWindowInsets(insets.d());
    }

    @Override // androidx.core.view.x1
    public void h(Insets insets) {
        this.f1728c.setTappableElementInsets(insets.d());
    }

    public t1(WindowInsetsCompat windowInsetsCompat) {
        WindowInsets.Builder builderD;
        super(windowInsetsCompat);
        WindowInsets windowInsetsF = windowInsetsCompat.f();
        if (windowInsetsF != null) {
            builderD = s1.e(windowInsetsF);
        } else {
            builderD = s1.d();
        }
        this.f1728c = builderD;
    }
}
