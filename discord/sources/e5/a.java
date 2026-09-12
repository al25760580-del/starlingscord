package e5;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class a extends FrameLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f8036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8037e;

    public float getAspectRatio() {
        return this.f8036d;
    }

    public int getResizeMode() {
        return this.f8037e;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        float f2;
        float f7;
        super.onMeasure(i7, i10);
        if (this.f8036d == 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        float f12 = (this.f8036d / (f10 / f11)) - 1.0f;
        if (Math.abs(f12) <= 0.01f) {
            return;
        }
        int i11 = this.f8037e;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        int i12 = (int) (this.f8036d * f11);
                        if (i12 < measuredWidth) {
                            float f13 = i12;
                            float f14 = f10 / f13;
                            measuredWidth = (int) (f13 * f14);
                            measuredHeight = (int) (f11 * f14);
                        } else {
                            measuredWidth = i12;
                        }
                    } else if (f12 > 0.0f) {
                        f2 = this.f8036d;
                    } else {
                        f7 = this.f8036d;
                    }
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
            f7 = this.f8036d;
            measuredWidth = (int) (f11 * f7);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        f2 = this.f8036d;
        measuredHeight = (int) (f10 / f2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f2) {
        if (this.f8036d != f2) {
            this.f8036d = f2;
            requestLayout();
        }
    }

    public void setResizeMode(int i7) {
        if (this.f8037e != i7) {
            this.f8037e = i7;
            requestLayout();
        }
    }
}
