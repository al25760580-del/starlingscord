package og;

import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.internal.play_billing.u0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import xr.m;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17256b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f17257c;

    public c(SwipeDismissBehavior swipeDismissBehavior) {
        this.f17257c = swipeDismissBehavior;
    }

    @Override // xr.m
    public final void I(int i7, View view) {
        this.f17256b = i7;
        this.f17255a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f17257c;
            swipeDismissBehavior.f6266c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f6266c = false;
        }
    }

    @Override // xr.m
    public final void K(View view, int i7, int i10) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f17257c;
        float f2 = width * swipeDismissBehavior.f6268e;
        float width2 = view.getWidth() * swipeDismissBehavior.f6269f;
        float fAbs = Math.abs(i7 - this.f17255a);
        if (fAbs <= f2) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f2) / (width2 - f2))), 1.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    @Override // xr.m
    public final void L(float f2, float f7, View view) {
        int i7;
        int left;
        int i10;
        this.f17256b = -1;
        int width = view.getWidth();
        boolean z5 = false;
        SwipeDismissBehavior swipeDismissBehavior = this.f17257c;
        if (f2 != 0.0f) {
            boolean z6 = view.getLayoutDirection() == 1;
            int i11 = swipeDismissBehavior.f6267d;
            if (i11 != 2 && (i11 != 0 ? i11 != 1 || (!z6 ? f2 < 0.0f : f2 > 0.0f) : !z6 ? f2 > 0.0f : f2 < 0.0f)) {
                i7 = this.f17255a;
            } else {
                if (f2 >= 0.0f) {
                    left = view.getLeft();
                    i10 = this.f17255a;
                    if (left < i10) {
                        i7 = this.f17255a - width;
                    } else {
                        i7 = i10 + width;
                    }
                } else {
                    i7 = this.f17255a - width;
                }
                z5 = true;
            }
        } else {
            if (Math.abs(view.getLeft() - this.f17255a) >= Math.round(view.getWidth() * 0.5f)) {
                if (f2 >= 0.0f) {
                    left = view.getLeft();
                    i10 = this.f17255a;
                    if (left < i10) {
                        i7 = this.f17255a - width;
                    } else {
                        i7 = i10 + width;
                    }
                } else {
                    i7 = this.f17255a - width;
                }
                z5 = true;
            } else {
                i7 = this.f17255a;
            }
        }
        if (swipeDismissBehavior.f6264a.q(i7, view.getTop())) {
            view.postOnAnimation(new u0(swipeDismissBehavior, view, z5));
        }
    }

    @Override // xr.m
    public final boolean W(int i7, View view) {
        int i10 = this.f17256b;
        return (i10 == -1 || i10 == i7) && this.f17257c.s(view);
    }

    @Override // xr.m
    public final int d(int i7, View view) {
        int width;
        int width2;
        int width3;
        boolean z5 = view.getLayoutDirection() == 1;
        int i10 = this.f17257c.f6267d;
        if (i10 == 0) {
            if (z5) {
                width = this.f17255a - view.getWidth();
                width2 = this.f17255a;
            } else {
                width = this.f17255a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i10 != 1) {
            width = this.f17255a - view.getWidth();
            width2 = view.getWidth() + this.f17255a;
        } else if (z5) {
            width = this.f17255a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f17255a - view.getWidth();
            width2 = this.f17255a;
        }
        return Math.min(Math.max(width, i7), width2);
    }

    @Override // xr.m
    public final int e(int i7, View view) {
        return view.getTop();
    }

    @Override // xr.m
    public final int w(View view) {
        return view.getWidth();
    }

    @Override // xr.m
    public final void J(int i7) {
    }
}
