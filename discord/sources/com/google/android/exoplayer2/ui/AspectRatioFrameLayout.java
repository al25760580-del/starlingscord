package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import ge.a;
import ge.b;
import ge.k;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f5760v = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f5761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f5762e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5763i;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5763i = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, k.f9985a, 0, 0);
            try {
                this.f5763i = typedArrayObtainStyledAttributes.getInt(0, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        this.f5761d = new b(this, 0);
    }

    public int getResizeMode() {
        return this.f5763i;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        float f2;
        float f7;
        super.onMeasure(i7, i10);
        if (this.f5762e <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        float f12 = (this.f5762e / (f10 / f11)) - 1.0f;
        float fAbs = Math.abs(f12);
        b bVar = this.f5761d;
        if (fAbs <= 0.01f) {
            if (bVar.f9965e) {
                return;
            }
            bVar.f9965e = true;
            ((AspectRatioFrameLayout) bVar.f9966i).post(bVar);
            return;
        }
        int i11 = this.f5763i;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f2 = this.f5762e;
                } else if (i11 == 4) {
                    if (f12 > 0.0f) {
                        f2 = this.f5762e;
                    } else {
                        f7 = this.f5762e;
                    }
                }
                measuredWidth = (int) (f11 * f2);
            } else {
                f7 = this.f5762e;
            }
            measuredHeight = (int) (f10 / f7);
        } else if (f12 > 0.0f) {
            f7 = this.f5762e;
            measuredHeight = (int) (f10 / f7);
        } else {
            f2 = this.f5762e;
            measuredWidth = (int) (f11 * f2);
        }
        if (!bVar.f9965e) {
            bVar.f9965e = true;
            ((AspectRatioFrameLayout) bVar.f9966i).post(bVar);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f2) {
        if (this.f5762e != f2) {
            this.f5762e = f2;
            requestLayout();
        }
    }

    public void setResizeMode(int i7) {
        if (this.f5763i != i7) {
            this.f5763i = i7;
            requestLayout();
        }
    }

    public void setAspectRatioListener(a aVar) {
    }
}
