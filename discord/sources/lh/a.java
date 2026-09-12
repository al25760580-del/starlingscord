package lh;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends zs.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f15083n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SideSheetBehavior f15084o;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i7) {
        this.f15083n = i7;
        this.f15084o = sideSheetBehavior;
    }

    @Override // zs.a
    public final int B() {
        switch (this.f15083n) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // zs.a
    public final boolean D(float f2) {
        switch (this.f15083n) {
            case 0:
                return f2 > 0.0f;
            default:
                return f2 < 0.0f;
        }
    }

    @Override // zs.a
    public final boolean E(View view) {
        switch (this.f15083n) {
            case 0:
                return view.getRight() < (r() - t()) / 2;
            default:
                return view.getLeft() > (r() + this.f15084o.f6426m) / 2;
        }
    }

    @Override // zs.a
    public final boolean G(float f2, float f7) {
        switch (this.f15083n) {
            case 0:
                return Math.abs(f2) > Math.abs(f7) && Math.abs(f2) > ((float) 500);
            default:
                return Math.abs(f2) > Math.abs(f7) && Math.abs(f2) > ((float) 500);
        }
    }

    @Override // zs.a
    public final boolean U(View view, float f2) {
        switch (this.f15083n) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f15084o;
                float fAbs = Math.abs((f2 * sideSheetBehavior.k) + left);
                sideSheetBehavior.getClass();
                return fAbs > 0.5f;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f15084o;
                float fAbs2 = Math.abs((f2 * sideSheetBehavior2.k) + right);
                sideSheetBehavior2.getClass();
                return fAbs2 > 0.5f;
        }
    }

    @Override // zs.a
    public final void b0(ViewGroup.MarginLayoutParams marginLayoutParams, int i7, int i10) {
        switch (this.f15083n) {
            case 0:
                if (i7 <= this.f15084o.f6426m) {
                    marginLayoutParams.leftMargin = i10;
                }
                break;
            default:
                int i11 = this.f15084o.f6426m;
                if (i7 <= i11) {
                    marginLayoutParams.rightMargin = i11 - i7;
                }
                break;
        }
    }

    @Override // zs.a
    public final int g(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f15083n) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // zs.a
    public final float h(int i7) {
        switch (this.f15083n) {
            case 0:
                float fT = t();
                return (i7 - fT) / (r() - fT);
            default:
                float f2 = this.f15084o.f6426m;
                return (f2 - i7) / (f2 - r());
        }
    }

    @Override // zs.a
    public final int r() {
        switch (this.f15083n) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f15084o;
                return Math.max(0, sideSheetBehavior.f6427n + sideSheetBehavior.f6428o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f15084o;
                return Math.max(0, (sideSheetBehavior2.f6426m - sideSheetBehavior2.f6425l) - sideSheetBehavior2.f6428o);
        }
    }

    @Override // zs.a
    public final int t() {
        switch (this.f15083n) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f15084o;
                return (-sideSheetBehavior.f6425l) - sideSheetBehavior.f6428o;
            default:
                return this.f15084o.f6426m;
        }
    }

    @Override // zs.a
    public final int u() {
        switch (this.f15083n) {
            case 0:
                return this.f15084o.f6428o;
            default:
                return this.f15084o.f6426m;
        }
    }

    @Override // zs.a
    public final int v() {
        switch (this.f15083n) {
            case 0:
                return -this.f15084o.f6425l;
            default:
                return r();
        }
    }

    @Override // zs.a
    public final int w(View view) {
        switch (this.f15083n) {
            case 0:
                return view.getRight() + this.f15084o.f6428o;
            default:
                return view.getLeft() - this.f15084o.f6428o;
        }
    }

    @Override // zs.a
    public final int x(CoordinatorLayout coordinatorLayout) {
        switch (this.f15083n) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }
}
