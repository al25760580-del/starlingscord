package lh;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import s0.g;
import xr.m;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0.b f15086b;

    public /* synthetic */ b(v0.b bVar, int i7) {
        this.f15085a = i7;
        this.f15086b = bVar;
    }

    @Override // xr.m
    public final void J(int i7) {
        switch (this.f15085a) {
            case 0:
                if (i7 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f15086b;
                    if (sideSheetBehavior.f6422g) {
                        sideSheetBehavior.s(1);
                    }
                }
                break;
            default:
                if (i7 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f15086b;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.H(1);
                    }
                }
                break;
        }
    }

    @Override // xr.m
    public final void K(View view, int i7, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f15085a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f15086b;
                WeakReference weakReference = sideSheetBehavior.f6430q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f6416a.b0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f6434u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f6416a.h(i7);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw g.a(it);
                }
                return;
            default:
                ((BottomSheetBehavior) this.f15086b).w(i10);
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0145  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // xr.m
    public final void L(float f2, float f7, View view) {
        int i7;
        switch (this.f15085a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f15086b;
                if (!sideSheetBehavior.f6416a.D(f2)) {
                    if (!sideSheetBehavior.f6416a.U(view, f2)) {
                        if (f2 == 0.0f || Math.abs(f2) <= Math.abs(f7)) {
                            int left = view.getLeft();
                            i7 = Math.abs(left - sideSheetBehavior.f6416a.r()) < Math.abs(left - sideSheetBehavior.f6416a.t()) ? 3 : 5;
                        }
                    } else if (sideSheetBehavior.f6416a.G(f2, f7) || sideSheetBehavior.f6416a.E(view)) {
                    }
                }
                sideSheetBehavior.u(view, i7, true);
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f15086b;
                int i10 = 6;
                if (f7 < 0.0f) {
                    if (bottomSheetBehavior.f6272b) {
                        i10 = 3;
                    } else {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        bottomSheetBehavior.getClass();
                        if (top <= bottomSheetBehavior.E) {
                            i10 = 3;
                        }
                    }
                } else if (bottomSheetBehavior.I && bottomSheetBehavior.I(view, f7)) {
                    if (Math.abs(f2) >= Math.abs(f7) || f7 <= bottomSheetBehavior.f6276d) {
                        if (view.getTop() > (bottomSheetBehavior.z() + bottomSheetBehavior.V) / 2) {
                            i10 = 5;
                        } else if (bottomSheetBehavior.f6272b || Math.abs(view.getTop() - bottomSheetBehavior.z()) < Math.abs(view.getTop() - bottomSheetBehavior.E)) {
                            i10 = 3;
                        }
                    } else {
                        i10 = 5;
                    }
                } else if (f7 == 0.0f || Math.abs(f2) > Math.abs(f7)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.f6272b) {
                        int i11 = bottomSheetBehavior.E;
                        if (top2 < i11) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior.G)) {
                                i10 = 3;
                            } else {
                                bottomSheetBehavior.getClass();
                            }
                        } else if (Math.abs(top2 - i11) < Math.abs(top2 - bottomSheetBehavior.G)) {
                            bottomSheetBehavior.getClass();
                        } else {
                            i10 = 4;
                        }
                    } else if (Math.abs(top2 - bottomSheetBehavior.D) < Math.abs(top2 - bottomSheetBehavior.G)) {
                        i10 = 3;
                    } else {
                        i10 = 4;
                    }
                } else if (bottomSheetBehavior.f6272b) {
                    i10 = 4;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.E) < Math.abs(top3 - bottomSheetBehavior.G)) {
                        bottomSheetBehavior.getClass();
                    } else {
                        i10 = 4;
                    }
                }
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.J(view, i10, true);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0031  */
    @Override // xr.m
    public final boolean W(int i7, View view) {
        WeakReference weakReference;
        WeakReference weakReference2;
        switch (this.f15085a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f15086b;
                return (sideSheetBehavior.f6423h == 1 || (weakReference = sideSheetBehavior.f6429p) == null || weakReference.get() != view) ? false : true;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f15086b;
                int i10 = bottomSheetBehavior.N;
                if (i10 != 1 && !bottomSheetBehavior.f6275c0) {
                    if (i10 == 3 && bottomSheetBehavior.a0 == i7) {
                        WeakReference weakReference3 = bottomSheetBehavior.X;
                        View view2 = weakReference3 != null ? (View) weakReference3.get() : null;
                        if (view2 == null || !view2.canScrollVertically(-1)) {
                            SystemClock.uptimeMillis();
                            weakReference2 = bottomSheetBehavior.W;
                            if (weakReference2 == null) {
                            }
                        }
                    } else {
                        SystemClock.uptimeMillis();
                        weakReference2 = bottomSheetBehavior.W;
                        if (weakReference2 == null && weakReference2.get() == view) {
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override // xr.m
    public final int d(int i7, View view) {
        switch (this.f15085a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f15086b;
                return yk.a.f(i7, sideSheetBehavior.f6416a.v(), sideSheetBehavior.f6416a.u());
            default:
                return view.getLeft();
        }
    }

    @Override // xr.m
    public final int e(int i7, View view) {
        switch (this.f15085a) {
            case 0:
                return view.getTop();
            default:
                return yk.a.f(i7, ((BottomSheetBehavior) this.f15086b).z(), x());
        }
    }

    @Override // xr.m
    public int w(View view) {
        switch (this.f15085a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f15086b;
                return sideSheetBehavior.f6425l + sideSheetBehavior.f6428o;
            default:
                return super.w(view);
        }
    }

    @Override // xr.m
    public int x() {
        switch (this.f15085a) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f15086b;
                return bottomSheetBehavior.I ? bottomSheetBehavior.V : bottomSheetBehavior.G;
            default:
                return super.x();
        }
    }
}
