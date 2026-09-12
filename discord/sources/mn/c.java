package mn;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.yalantis.ucrop.view.UCropView;
import ga.l;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends f {
    public final RectF M;
    public final Matrix N;
    public float O;
    public float P;
    public in.a Q;
    public a R;
    public b S;
    public float T;
    public float U;
    public int V;
    public int W;
    public long a0;

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = new RectF();
        this.N = new Matrix();
        this.P = 10.0f;
        this.S = null;
        this.V = 0;
        this.W = 0;
        this.a0 = 500L;
    }

    public final void e(float f2, float f7) {
        RectF rectF = this.M;
        float fMin = Math.min(Math.min(rectF.width() / f2, rectF.width() / f7), Math.min(rectF.height() / f7, rectF.height() / f2));
        this.U = fMin;
        this.T = fMin * this.P;
    }

    public final void f() {
        removeCallbacks(this.R);
        removeCallbacks(this.S);
    }

    public final boolean g(float[] fArr) {
        Matrix matrix = this.N;
        matrix.reset();
        matrix.setRotate(-getCurrentAngle());
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        matrix.mapPoints(fArrCopyOf);
        RectF rectF = this.M;
        float f2 = rectF.left;
        float f7 = rectF.top;
        float f10 = rectF.right;
        float f11 = rectF.bottom;
        float[] fArr2 = {f2, f7, f10, f7, f10, f11, f2, f11};
        matrix.mapPoints(fArr2);
        return c9.a.J(fArrCopyOf).contains(c9.a.J(fArr2));
    }

    public in.a getCropBoundsChangeListener() {
        return this.Q;
    }

    public float getMaxScale() {
        return this.T;
    }

    public float getMinScale() {
        return this.U;
    }

    public float getTargetAspectRatio() {
        return this.O;
    }

    public final void h(float f2, float f7, float f10) {
        Matrix matrix = this.f15931v;
        if (f2 > 1.0f && getCurrentScale() * f2 <= getMaxScale()) {
            if (f2 != 0.0f) {
                matrix.postScale(f2, f2, f7, f10);
                setImageMatrix(matrix);
                e eVar = this.f15934y;
                if (eVar != null) {
                    ((hn.c) eVar).d(a(matrix));
                    return;
                }
                return;
            }
            return;
        }
        if (f2 >= 1.0f || getCurrentScale() * f2 < getMinScale() || f2 == 0.0f) {
            return;
        }
        matrix.postScale(f2, f2, f7, f10);
        setImageMatrix(matrix);
        e eVar2 = this.f15934y;
        if (eVar2 != null) {
            ((hn.c) eVar2).d(a(matrix));
        }
    }

    public final void i(float f2, float f7, float f10) {
        if (f2 <= getMaxScale()) {
            h(f2 / getCurrentScale(), f7, f10);
        }
    }

    public void setCropBoundsChangeListener(in.a aVar) {
        this.Q = aVar;
    }

    public void setCropRect(RectF rectF) {
        this.O = rectF.width() / rectF.height();
        this.M.set(rectF.left - getPaddingLeft(), rectF.top - getPaddingTop(), rectF.right - getPaddingRight(), rectF.bottom - getPaddingBottom());
        Drawable drawable = getDrawable();
        if (drawable != null) {
            e(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        setImageToWrapCropBounds(true);
    }

    public void setImageToWrapCropBounds(boolean z5) {
        float fMax;
        if (this.H) {
            float[] fArr = this.f15928d;
            if (g(fArr)) {
                return;
            }
            float[] fArr2 = this.f15929e;
            float f2 = fArr2[0];
            float f7 = fArr2[1];
            float currentScale = getCurrentScale();
            RectF rectF = this.M;
            float fCenterX = rectF.centerX() - f2;
            float fCenterY = rectF.centerY() - f7;
            Matrix matrix = this.N;
            matrix.reset();
            matrix.setTranslate(fCenterX, fCenterY);
            float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
            matrix.mapPoints(fArrCopyOf);
            boolean zG = g(fArrCopyOf);
            if (zG) {
                matrix.reset();
                matrix.setRotate(-getCurrentAngle());
                float[] fArrCopyOf2 = Arrays.copyOf(fArr, fArr.length);
                float f10 = rectF.left;
                float f11 = rectF.top;
                float f12 = rectF.right;
                float f13 = rectF.bottom;
                float[] fArr3 = {f10, f11, f12, f11, f12, f13, f10, f13};
                matrix.mapPoints(fArrCopyOf2);
                matrix.mapPoints(fArr3);
                RectF rectFJ = c9.a.J(fArrCopyOf2);
                RectF rectFJ2 = c9.a.J(fArr3);
                float f14 = rectFJ.left - rectFJ2.left;
                float f15 = rectFJ.top - rectFJ2.top;
                float f16 = rectFJ.right - rectFJ2.right;
                float f17 = rectFJ.bottom - rectFJ2.bottom;
                fMax = 0.0f;
                if (f14 <= 0.0f) {
                    f14 = 0.0f;
                }
                if (f15 <= 0.0f) {
                    f15 = 0.0f;
                }
                if (f16 >= 0.0f) {
                    f16 = 0.0f;
                }
                if (f17 >= 0.0f) {
                    f17 = 0.0f;
                }
                float[] fArr4 = {f14, f15, f16, f17};
                matrix.reset();
                matrix.setRotate(getCurrentAngle());
                matrix.mapPoints(fArr4);
                fCenterX = -(fArr4[0] + fArr4[2]);
                fCenterY = -(fArr4[1] + fArr4[3]);
            } else {
                RectF rectF2 = new RectF(rectF);
                matrix.reset();
                matrix.setRotate(getCurrentAngle());
                matrix.mapRect(rectF2);
                float[] fArr5 = {(float) Math.sqrt(Math.pow(fArr[1] - fArr[3], 2.0d) + Math.pow(fArr[0] - fArr[2], 2.0d)), (float) Math.sqrt(Math.pow(fArr[3] - fArr[5], 2.0d) + Math.pow(fArr[2] - fArr[4], 2.0d))};
                fMax = (Math.max(rectF2.width() / fArr5[0], rectF2.height() / fArr5[1]) * currentScale) - currentScale;
            }
            float f18 = fCenterY;
            float f19 = fMax;
            if (z5) {
                a aVar = new a(this, this.a0, f2, f7, fCenterX, f18, currentScale, f19, zG);
                this.R = aVar;
                post(aVar);
            } else {
                d(fCenterX, f18);
                if (zG == 0) {
                    i(currentScale + f19, rectF.centerX(), rectF.centerY());
                }
            }
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("Animation duration cannot be negative value.");
        }
        this.a0 = j;
    }

    public void setMaxResultImageSizeX(int i7) {
        this.V = i7;
    }

    public void setMaxResultImageSizeY(int i7) {
        this.W = i7;
    }

    public void setMaxScaleMultiplier(float f2) {
        this.P = f2;
    }

    public void setTargetAspectRatio(float f2) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            this.O = f2;
            return;
        }
        if (f2 == 0.0f) {
            this.O = drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
        } else {
            this.O = f2;
        }
        in.a aVar = this.Q;
        if (aVar != null) {
            ((UCropView) ((l) aVar).f9547e).f7315e.setTargetAspectRatio(this.O);
        }
    }
}
