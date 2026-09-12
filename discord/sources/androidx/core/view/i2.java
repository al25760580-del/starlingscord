package androidx.core.view;

import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes.dex */
public class i2 extends mo.c0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Window f1680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ue.i f1681i;

    public i2(Window window, ue.i iVar) {
        this.f1680h = window;
        this.f1681i = iVar;
    }

    @Override // mo.c0
    public final boolean B() {
        return (this.f1680h.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // mo.c0
    public final void I(boolean z5) {
        if (!z5) {
            T(8192);
            return;
        }
        Window window = this.f1680h;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        S(8192);
    }

    @Override // mo.c0
    public final void K() {
        this.f1680h.getDecorView().setTag(356039078, 2);
        T(RecyclerView.ItemAnimator.FLAG_MOVED);
        S(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
    }

    @Override // mo.c0
    public final void L(int i7) {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i7 & i10) != 0) {
                if (i10 == 1) {
                    T(4);
                    this.f1680h.clearFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
                } else if (i10 == 2) {
                    T(2);
                } else if (i10 == 8) {
                    ((u4.c) this.f1681i.f21117d).z();
                }
            }
        }
    }

    public final void S(int i7) {
        View decorView = this.f1680h.getDecorView();
        decorView.setSystemUiVisibility(i7 | decorView.getSystemUiVisibility());
    }

    public final void T(int i7) {
        View decorView = this.f1680h.getDecorView();
        decorView.setSystemUiVisibility((~i7) & decorView.getSystemUiVisibility());
    }

    @Override // mo.c0
    public final void z(int i7) {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i7 & i10) != 0) {
                if (i10 == 1) {
                    S(4);
                } else if (i10 == 2) {
                    S(2);
                } else if (i10 == 8) {
                    ((u4.c) this.f1681i.f21117d).v();
                }
            }
        }
    }

    @Override // mo.c0
    public final void j(LinearInterpolator linearInterpolator, CancellationSignal cancellationSignal, tl.a aVar) {
    }
}
