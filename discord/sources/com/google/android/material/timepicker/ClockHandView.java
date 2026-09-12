package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.h0;
import com.discord.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class ClockHandView extends View {
    public static final /* synthetic */ int K = 0;
    public final int E;
    public float F;
    public boolean G;
    public double H;
    public int I;
    public int J;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ValueAnimator f6481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6482e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f6483i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f6484v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f6485w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Paint f6486x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final RectF f6487y;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f6481d = valueAnimator;
        this.f6483i = new ArrayList();
        Paint paint = new Paint();
        this.f6486x = paint;
        this.f6487y = new RectF();
        this.J = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kg.a.k, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        io.sentry.config.a.S(context, R.attr.motionDurationLong2, h0.DEFAULT_DRAG_ANIMATION_DURATION);
        io.sentry.config.a.T(context, R.attr.motionEasingEmphasizedInterpolator, lg.a.f15072b);
        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f6484v = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.E = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f6485w = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i7 = ClockHandView.K;
                this.f6493a.c(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimator.addListener(new e());
    }

    public final int a(int i7) {
        return i7 == 2 ? Math.round(this.I * 0.66f) : this.I;
    }

    public final void b(float f2) {
        this.f6481d.cancel();
        c(f2);
    }

    public final void c(float f2) {
        float f7 = f2 % 360.0f;
        this.F = f7;
        this.H = Math.toRadians(f7 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.J);
        float fCos = (((float) Math.cos(this.H)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.H))) + height;
        float f10 = this.f6484v;
        this.f6487y.set(fCos - f10, fSin - f10, fCos + f10, fSin + f10);
        Iterator it = this.f6483i.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((f) it.next());
            if (Math.abs(clockFaceView.N - f7) > 0.001f) {
                clockFaceView.N = f7;
                clockFaceView.d();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iA = a(this.J);
        float f2 = width;
        float f7 = iA;
        float fCos = (((float) Math.cos(this.H)) * f7) + f2;
        float f10 = height;
        float fSin = (f7 * ((float) Math.sin(this.H))) + f10;
        Paint paint = this.f6486x;
        paint.setStrokeWidth(0.0f);
        int i7 = this.f6484v;
        canvas.drawCircle(fCos, fSin, i7, paint);
        double dSin = Math.sin(this.H);
        double d6 = iA - i7;
        paint.setStrokeWidth(this.E);
        canvas.drawLine(f2, f10, width + ((int) (Math.cos(this.H) * d6)), height + ((int) (d6 * dSin)), paint);
        canvas.drawCircle(f2, f10, this.f6485w, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        super.onLayout(z5, i7, i10, i11, i12);
        if (this.f6481d.isRunning()) {
            return;
        }
        b(this.F);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        boolean z6;
        int actionMasked = motionEvent.getActionMasked();
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        boolean z7 = false;
        if (actionMasked == 0) {
            this.G = false;
            z5 = true;
            z6 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z6 = this.G;
            if (this.f6482e) {
                this.J = ((float) Math.hypot((double) (x5 - ((float) (getWidth() / 2))), (double) (y5 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + TypedValue.applyDimension(1, (float) 12, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z5 = false;
        } else {
            z6 = false;
            z5 = false;
        }
        boolean z10 = this.G;
        int degrees = (int) Math.toDegrees(Math.atan2(y5 - (getHeight() / 2), x5 - (getWidth() / 2)));
        int i7 = degrees + 90;
        if (i7 < 0) {
            i7 = degrees + 450;
        }
        float f2 = i7;
        boolean z11 = this.F != f2;
        if (z5 && z11) {
            z7 = true;
        } else if (z11 || z6) {
            b(f2);
            z7 = true;
        }
        this.G = z10 | z7;
        return true;
    }
}
