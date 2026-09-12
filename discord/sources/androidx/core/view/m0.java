package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {
    public static WindowInsetsCompat a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        WindowInsetsCompat windowInsetsCompatG = WindowInsetsCompat.g(null, rootWindowInsets);
        f2 f2Var = windowInsetsCompatG.f1605a;
        f2Var.r(windowInsetsCompatG);
        f2Var.d(view.getRootView());
        return windowInsetsCompatG;
    }

    public static void b(View view, int i7, int i10) {
        view.setScrollIndicators(i7, i10);
    }
}
