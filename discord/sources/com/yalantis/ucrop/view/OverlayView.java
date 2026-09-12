package com.yalantis.ucrop.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.discord.R;
import in.b;

/* JADX INFO: loaded from: classes3.dex */
public class OverlayView extends View {
    public float E;
    public float[] F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public final Path K;
    public final Paint L;
    public final Paint M;
    public final Paint N;
    public final Paint O;
    public int P;
    public float Q;
    public float R;
    public int S;
    public final int T;
    public final int U;
    public final int V;
    public b W;
    public boolean a0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f7307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f7308e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7309i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7310v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float[] f7311w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7312x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f7313y;

    public OverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f7307d = new RectF();
        this.f7308e = new RectF();
        this.F = null;
        this.K = new Path();
        this.L = new Paint(1);
        this.M = new Paint(1);
        this.N = new Paint(1);
        this.O = new Paint(1);
        this.P = 0;
        this.Q = -1.0f;
        this.R = -1.0f;
        this.S = -1;
        this.T = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_threshold);
        this.U = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_min_size);
        this.V = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_area_line_length);
    }

    public final void a() {
        RectF rectF = this.f7307d;
        float f2 = rectF.left;
        float f7 = rectF.top;
        float f10 = rectF.right;
        float f11 = rectF.bottom;
        this.f7311w = new float[]{f2, f7, f10, f7, f10, f11, f2, f11};
        rectF.centerX();
        rectF.centerY();
        this.F = null;
        Path path = this.K;
        path.reset();
        path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
    }

    @NonNull
    public RectF getCropViewRect() {
        return this.f7307d;
    }

    public int getFreestyleCropMode() {
        return this.P;
    }

    public b getOverlayViewChangeListener() {
        return this.W;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        boolean z5 = this.I;
        RectF rectF = this.f7307d;
        if (z5) {
            canvas.clipPath(this.K, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.J);
        canvas.restore();
        if (this.I) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, this.L);
        }
        if (this.H) {
            if (this.F == null && !rectF.isEmpty()) {
                this.F = new float[(this.f7313y * 4) + (this.f7312x * 4)];
                int i7 = 0;
                for (int i10 = 0; i10 < this.f7312x; i10++) {
                    float[] fArr = this.F;
                    fArr[i7] = rectF.left;
                    float f2 = i10 + 1.0f;
                    fArr[i7 + 1] = ((f2 / (this.f7312x + 1)) * rectF.height()) + rectF.top;
                    float[] fArr2 = this.F;
                    int i11 = i7 + 3;
                    fArr2[i7 + 2] = rectF.right;
                    i7 += 4;
                    fArr2[i11] = ((f2 / (this.f7312x + 1)) * rectF.height()) + rectF.top;
                }
                for (int i12 = 0; i12 < this.f7313y; i12++) {
                    float f7 = i12 + 1.0f;
                    this.F[i7] = ((f7 / (this.f7313y + 1)) * rectF.width()) + rectF.left;
                    float[] fArr3 = this.F;
                    fArr3[i7 + 1] = rectF.top;
                    int i13 = i7 + 3;
                    fArr3[i7 + 2] = ((f7 / (this.f7313y + 1)) * rectF.width()) + rectF.left;
                    i7 += 4;
                    this.F[i13] = rectF.bottom;
                }
            }
            float[] fArr4 = this.F;
            if (fArr4 != null) {
                canvas.drawLines(fArr4, this.M);
            }
        }
        if (this.G) {
            canvas.drawRect(rectF, this.N);
        }
        if (this.P != 0) {
            canvas.save();
            RectF rectF2 = this.f7308e;
            rectF2.set(rectF);
            int i14 = this.V;
            float f10 = i14;
            float f11 = -i14;
            rectF2.inset(f10, f11);
            Region.Op op2 = Region.Op.DIFFERENCE;
            canvas.clipRect(rectF2, op2);
            rectF2.set(rectF);
            rectF2.inset(f11, f10);
            canvas.clipRect(rectF2, op2);
            canvas.drawRect(rectF, this.O);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        super.onLayout(z5, i7, i10, i11, i12);
        if (z5) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.f7309i = width - paddingLeft;
            this.f7310v = height - paddingTop;
            if (this.a0) {
                this.a0 = false;
                setTargetAspectRatio(this.E);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        RectF rectF = this.f7307d;
        if (rectF.isEmpty() || this.P == 0) {
            return false;
        }
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        if ((motionEvent.getAction() & 255) == 0) {
            double d6 = this.T;
            int i10 = -1;
            for (int i11 = 0; i11 < 8; i11 += 2) {
                double dSqrt = Math.sqrt(Math.pow(y5 - this.f7311w[i11 + 1], 2.0d) + Math.pow(x5 - this.f7311w[i11], 2.0d));
                if (dSqrt < d6) {
                    i10 = i11 / 2;
                    d6 = dSqrt;
                }
            }
            int i12 = (this.P == 1 && i10 < 0 && rectF.contains(x5, y5)) ? 4 : i10;
            this.S = i12;
            boolean z5 = i12 != -1;
            if (!z5) {
                this.Q = -1.0f;
                this.R = -1.0f;
                return z5;
            }
            if (this.Q < 0.0f) {
                this.Q = x5;
                this.R = y5;
            }
            return z5;
        }
        if ((motionEvent.getAction() & 255) != 2) {
            i7 = 1;
        } else if (motionEvent.getPointerCount() == 1) {
            if (this.S != -1) {
                float fMin = Math.min(Math.max(x5, getPaddingLeft()), getWidth() - getPaddingRight());
                float fMin2 = Math.min(Math.max(y5, getPaddingTop()), getHeight() - getPaddingBottom());
                RectF rectF2 = this.f7308e;
                rectF2.set(rectF);
                int i13 = this.S;
                if (i13 == 0) {
                    rectF2.set(fMin, fMin2, rectF.right, rectF.bottom);
                } else if (i13 == 1) {
                    rectF2.set(rectF.left, fMin2, fMin, rectF.bottom);
                } else if (i13 == 2) {
                    rectF2.set(rectF.left, rectF.top, fMin, fMin2);
                } else {
                    if (i13 != 3) {
                        if (i13 == 4) {
                            rectF2.offset(fMin - this.Q, fMin2 - this.R);
                            if (rectF2.left > getLeft() && rectF2.top > getTop() && rectF2.right < getRight() && rectF2.bottom < getBottom()) {
                                rectF.set(rectF2);
                                a();
                                postInvalidate();
                            }
                        }
                        this.Q = fMin;
                        this.R = fMin2;
                        return true;
                    }
                    rectF2.set(fMin, rectF.top, rectF.right, fMin2);
                }
                float fHeight = rectF2.height();
                float f2 = this.U;
                boolean z6 = fHeight >= f2;
                boolean z7 = rectF2.width() >= f2;
                rectF.set(z7 ? rectF2.left : rectF.left, z6 ? rectF2.top : rectF.top, z7 ? rectF2.right : rectF.right, z6 ? rectF2.bottom : rectF.bottom);
                if (z6 || z7) {
                    a();
                    postInvalidate();
                }
                this.Q = fMin;
                this.R = fMin2;
                return true;
            }
            i7 = 1;
        } else {
            i7 = 1;
        }
        if ((motionEvent.getAction() & 255) != i7) {
            return false;
        }
        this.Q = -1.0f;
        this.R = -1.0f;
        this.S = -1;
        b bVar = this.W;
        if (bVar == null) {
            return false;
        }
        ((UCropView) ((u4.b) bVar).f20945e).f7314d.setCropRect(rectF);
        return false;
    }

    public void setCircleDimmedLayer(boolean z5) {
        this.I = z5;
    }

    public void setCropFrameColor(int i7) {
        this.N.setColor(i7);
    }

    public void setCropFrameStrokeWidth(int i7) {
        this.N.setStrokeWidth(i7);
    }

    public void setCropGridColor(int i7) {
        this.M.setColor(i7);
    }

    public void setCropGridColumnCount(int i7) {
        this.f7313y = i7;
        this.F = null;
    }

    public void setCropGridCornerColor(int i7) {
        this.O.setColor(i7);
    }

    public void setCropGridRowCount(int i7) {
        this.f7312x = i7;
        this.F = null;
    }

    public void setCropGridStrokeWidth(int i7) {
        this.M.setStrokeWidth(i7);
    }

    public void setDimmedColor(int i7) {
        this.J = i7;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z5) {
        this.P = z5 ? 1 : 0;
    }

    public void setFreestyleCropMode(int i7) {
        this.P = i7;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(b bVar) {
        this.W = bVar;
    }

    public void setShowCropFrame(boolean z5) {
        this.G = z5;
    }

    public void setShowCropGrid(boolean z5) {
        this.H = z5;
    }

    public void setTargetAspectRatio(float f2) {
        this.E = f2;
        int i7 = this.f7309i;
        if (i7 <= 0) {
            this.a0 = true;
            return;
        }
        int i10 = (int) (i7 / f2);
        int i11 = this.f7310v;
        RectF rectF = this.f7307d;
        if (i10 > i11) {
            int i12 = (int) (i11 * f2);
            int i13 = (i7 - i12) / 2;
            rectF.set(getPaddingLeft() + i13, getPaddingTop(), getPaddingLeft() + i12 + i13, getPaddingTop() + this.f7310v);
        } else {
            int i14 = (i11 - i10) / 2;
            rectF.set(getPaddingLeft(), getPaddingTop() + i14, getPaddingLeft() + this.f7309i, getPaddingTop() + i10 + i14);
        }
        b bVar = this.W;
        if (bVar != null) {
            ((UCropView) ((u4.b) bVar).f20945e).f7314d.setCropRect(rectF);
        }
        a();
        postInvalidate();
    }
}
