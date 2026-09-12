package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsControllerCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mo.c0 f1606a;

    public WindowInsetsControllerCompat(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f1606a = new m2(windowInsetsController, new ue.i(windowInsetsController));
        } else {
            this.f1606a = new l2(windowInsetsController, new ue.i(windowInsetsController));
        }
    }

    public final void a(int i7) {
        this.f1606a.z(i7);
    }

    public final void b(boolean z5) {
        this.f1606a.H(z5);
    }

    public final void c(boolean z5) {
        this.f1606a.I(z5);
    }

    public final void d() {
        this.f1606a.K();
    }

    public final void e(int i7) {
        this.f1606a.L(i7);
    }

    public WindowInsetsControllerCompat(Window window, View view) {
        ue.i iVar = new ue.i();
        if (Build.VERSION.SDK_INT >= 30) {
            b0 b0Var = new b0(view);
            b0Var.f1631e = view;
            iVar.f21117d = b0Var;
        } else {
            iVar.f21117d = new u4.c(view);
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            this.f1606a = new m2(window, iVar);
            return;
        }
        if (i7 >= 30) {
            this.f1606a = new l2(window, iVar);
        } else if (i7 >= 26) {
            this.f1606a = new j2(window, iVar);
        } else {
            this.f1606a = new i2(window, iVar);
        }
    }
}
