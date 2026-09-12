package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.discord.R;
import nn.a;

/* JADX INFO: loaded from: classes3.dex */
public class HorizontalProgressWheelView extends View {
    public final int E;
    public boolean F;
    public float G;
    public int H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f7323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f7324e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f7325i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Paint f7326v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Paint f7327w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f7328x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f7329y;

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f7323d = new Rect();
        this.H = getContext().getColor(R.color.ucrop_color_widget_rotate_mid_line);
        this.f7328x = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_width_horizontal_wheel_progress_line);
        this.f7329y = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_height_horizontal_wheel_progress_line);
        this.E = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_margin_horizontal_wheel_progress_line);
        Paint paint = new Paint(1);
        this.f7326v = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f7326v.setStrokeWidth(this.f7328x);
        this.f7326v.setColor(getResources().getColor(R.color.ucrop_color_progress_wheel_line));
        Paint paint2 = new Paint(this.f7326v);
        this.f7327w = paint2;
        paint2.setColor(this.H);
        this.f7327w.setStrokeCap(Paint.Cap.ROUND);
        this.f7327w.setStrokeWidth(getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_width_middle_wheel_progress_line));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = this.f7323d;
        canvas.getClipBounds(rect);
        int iWidth = rect.width();
        int i7 = this.f7328x;
        int i10 = this.E;
        int i11 = iWidth / (i7 + i10);
        float f2 = this.G % (i10 + i7);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i11 / 4;
            if (i12 < i13) {
                this.f7326v.setAlpha((int) ((i12 / i13) * 255.0f));
            } else if (i12 > (i11 * 3) / 4) {
                this.f7326v.setAlpha((int) (((i11 - i12) / i13) * 255.0f));
            } else {
                this.f7326v.setAlpha(255);
            }
            float f7 = -f2;
            canvas.drawLine(rect.left + f7 + ((this.f7328x + this.E) * i12), rect.centerY() - (this.f7329y / 4.0f), f7 + rect.left + ((this.f7328x + this.E) * i12), rect.centerY() + (this.f7329y / 4.0f), this.f7326v);
        }
        canvas.drawLine(rect.centerX(), rect.centerY() - (this.f7329y / 2.0f), rect.centerX(), (this.f7329y / 2.0f) + rect.centerY(), this.f7327w);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f7325i = motionEvent.getX();
            return true;
        }
        if (action == 1) {
            a aVar = this.f7324e;
            if (aVar != null) {
                this.F = false;
                aVar.a();
            }
        } else if (action == 2) {
            float x5 = motionEvent.getX() - this.f7325i;
            if (x5 != 0.0f) {
                if (!this.F) {
                    this.F = true;
                    a aVar2 = this.f7324e;
                    if (aVar2 != null) {
                        aVar2.c();
                    }
                }
                this.G -= x5;
                postInvalidate();
                this.f7325i = motionEvent.getX();
                a aVar3 = this.f7324e;
                if (aVar3 != null) {
                    aVar3.b(-x5);
                    return true;
                }
            }
        }
        return true;
    }

    public void setMiddleLineColor(int i7) {
        this.H = i7;
        this.f7327w.setColor(i7);
        invalidate();
    }

    public void setScrollingListener(a aVar) {
        this.f7324e = aVar;
    }
}
