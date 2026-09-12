package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WindowInsetsCompat f1684a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f1686c;

    public k0(View view, t tVar) {
        this.f1685b = view;
        this.f1686c = tVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsetsCompat windowInsetsCompatG = WindowInsetsCompat.g(view, windowInsets);
        int i7 = Build.VERSION.SDK_INT;
        t tVar = this.f1686c;
        if (i7 < 30) {
            l0.a(windowInsets, this.f1685b);
            if (windowInsetsCompatG.equals(this.f1684a)) {
                return tVar.a(view, windowInsetsCompatG).f();
            }
        }
        this.f1684a = windowInsetsCompatG;
        WindowInsetsCompat windowInsetsCompatA = tVar.a(view, windowInsetsCompatG);
        if (i7 >= 30) {
            return windowInsetsCompatA.f();
        }
        WeakHashMap weakHashMap = u0.f1729a;
        j0.c(view);
        return windowInsetsCompatA.f();
    }
}
