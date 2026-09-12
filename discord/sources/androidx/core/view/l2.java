package androidx.core.view;

import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.animation.LinearInterpolator;
import androidx.collection.SimpleArrayMap;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class l2 extends mo.c0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WindowInsetsController f1696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ue.i f1697i;
    public final Window j;

    public l2(WindowInsetsController windowInsetsController, ue.i iVar) {
        new SimpleArrayMap(0);
        this.f1696h = windowInsetsController;
        this.f1697i = iVar;
    }

    @Override // mo.c0
    public boolean B() {
        this.f1696h.setSystemBarsAppearance(0, 0);
        return (this.f1696h.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // mo.c0
    public final void H(boolean z5) {
        Window window = this.j;
        if (z5) {
            if (window != null) {
                S(16);
            }
            this.f1696h.setSystemBarsAppearance(16, 16);
        } else {
            if (window != null) {
                T(16);
            }
            this.f1696h.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // mo.c0
    public final void I(boolean z5) {
        Window window = this.j;
        if (z5) {
            if (window != null) {
                S(8192);
            }
            this.f1696h.setSystemBarsAppearance(8, 8);
        } else {
            if (window != null) {
                T(8192);
            }
            this.f1696h.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // mo.c0
    public void K() {
        Window window = this.j;
        if (window == null) {
            this.f1696h.setSystemBarsBehavior(2);
            return;
        }
        window.getDecorView().setTag(356039078, 2);
        T(RecyclerView.ItemAnimator.FLAG_MOVED);
        S(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
    }

    @Override // mo.c0
    public final void L(int i7) {
        if ((i7 & 8) != 0) {
            ((u4.c) this.f1697i.f21117d).z();
        }
        this.f1696h.show(i7 & (-9));
    }

    public final void S(int i7) {
        View decorView = this.j.getDecorView();
        decorView.setSystemUiVisibility(i7 | decorView.getSystemUiVisibility());
    }

    public final void T(int i7) {
        View decorView = this.j.getDecorView();
        decorView.setSystemUiVisibility((~i7) & decorView.getSystemUiVisibility());
    }

    @Override // mo.c0
    public final void j(LinearInterpolator linearInterpolator, CancellationSignal cancellationSignal, tl.a aVar) {
        this.f1696h.controlWindowInsetsAnimation(8, -1L, linearInterpolator, cancellationSignal, new k2(aVar));
    }

    @Override // mo.c0
    public final void z(int i7) {
        if ((i7 & 8) != 0) {
            ((u4.c) this.f1697i.f21117d).v();
        }
        this.f1696h.hide(i7 & (-9));
    }

    public l2(Window window, ue.i iVar) {
        this(window.getInsetsController(), iVar);
        this.j = window;
    }
}
