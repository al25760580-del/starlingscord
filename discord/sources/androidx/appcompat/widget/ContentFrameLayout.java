package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public h1 E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TypedValue f852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f853e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TypedValue f854i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TypedValue f855v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TypedValue f856w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TypedValue f857x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Rect f858y;

    public ContentFrameLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f858y = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f856w == null) {
            this.f856w = new TypedValue();
        }
        return this.f856w;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f857x == null) {
            this.f857x = new TypedValue();
        }
        return this.f857x;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f854i == null) {
            this.f854i = new TypedValue();
        }
        return this.f854i;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f855v == null) {
            this.f855v = new TypedValue();
        }
        return this.f855v;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f852d == null) {
            this.f852d = new TypedValue();
        }
        return this.f852d;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f853e == null) {
            this.f853e = new TypedValue();
        }
        return this.f853e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h1 h1Var = this.E;
        if (h1Var != null) {
            h1Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        n nVar;
        super.onDetachedFromWindow();
        h1 h1Var = this.E;
        if (h1Var != null) {
            androidx.appcompat.app.a aVar = (androidx.appcompat.app.a) ((ue.i) h1Var).f21117d;
            i1 i1Var = aVar.O;
            if (i1Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) i1Var;
                actionBarOverlayLayout.e();
                ActionMenuView actionMenuView = ((x3) actionBarOverlayLayout.f818w).f1164a.f865d;
                if (actionMenuView != null && (nVar = actionMenuView.Q) != null) {
                    nVar.l();
                    h hVar = nVar.R;
                    if (hVar != null && hVar.b()) {
                        hVar.f16210i.dismiss();
                    }
                }
            }
            if (aVar.T != null) {
                aVar.I.getDecorView().removeCallbacks(aVar.U);
                if (aVar.T.isShowing()) {
                    try {
                        aVar.T.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                aVar.T = null;
            }
            androidx.core.view.c1 c1Var = aVar.V;
            if (c1Var != null) {
                c1Var.b();
            }
            n.j jVar = aVar.Q(0).f11272h;
            if (jVar != null) {
                jVar.c(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int iMakeMeasureSpec;
        boolean z5;
        int iMakeMeasureSpec2;
        int i11;
        int i12;
        float fraction;
        int i13;
        int i14;
        float fraction2;
        int i15;
        int i16;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z6 = true;
        boolean z7 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        Rect rect = this.f858y;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i7;
            z5 = false;
        } else {
            TypedValue typedValue = z7 ? this.f855v : this.f854i;
            if (typedValue == null || (i15 = typedValue.type) == 0) {
                iMakeMeasureSpec = i7;
                z5 = false;
            } else {
                if (i15 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i15 == 6) {
                        int i17 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i17, i17);
                    } else {
                        i16 = 0;
                    }
                    if (i16 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i16 - (rect.left + rect.right), View.MeasureSpec.getSize(i7)), 1073741824);
                        z5 = true;
                    } else {
                        iMakeMeasureSpec = i7;
                        z5 = false;
                    }
                }
                i16 = (int) fraction3;
                if (i16 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i16 - (rect.left + rect.right), View.MeasureSpec.getSize(i7)), 1073741824);
                    z5 = true;
                } else {
                    iMakeMeasureSpec = i7;
                    z5 = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i10;
        } else {
            TypedValue typedValue2 = z7 ? this.f856w : this.f857x;
            if (typedValue2 == null || (i13 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i10;
            } else {
                if (i13 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i13 == 6) {
                        int i18 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i18, i18);
                    } else {
                        i14 = 0;
                    }
                    if (i14 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i14 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i10)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i10;
                    }
                }
                i14 = (int) fraction2;
                if (i14 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i14 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i10)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i10;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z5 || mode != Integer.MIN_VALUE) {
            z6 = false;
        } else {
            TypedValue typedValue3 = z7 ? this.f853e : this.f852d;
            if (typedValue3 == null || (i11 = typedValue3.type) == 0) {
                z6 = false;
            } else {
                if (i11 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i11 == 6) {
                        int i19 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i19, i19);
                    } else {
                        i12 = 0;
                    }
                    if (i12 > 0) {
                        i12 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i12) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                    } else {
                        z6 = false;
                    }
                }
                i12 = (int) fraction;
                if (i12 > 0) {
                    i12 -= rect.left + rect.right;
                }
                if (measuredWidth < i12) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                } else {
                    z6 = false;
                }
            }
        }
        if (z6) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(h1 h1Var) {
        this.E = h1Var;
    }
}
