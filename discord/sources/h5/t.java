package h5;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class t extends View {
    public float E;
    public float F;
    public float G;
    public boolean H;
    public boolean I;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Paint f10381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f10382e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Path f10383i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public s f10384v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10385w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10386x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f10387y;

    public t(Context context) {
        super(context);
        this.f10385w = 0;
        this.f10386x = 0;
        this.f10387y = 1.0f;
        this.E = 1.0f;
        this.F = 0.75f;
        this.G = 0.5f;
        this.H = true;
        this.I = true;
        Paint paint = new Paint(1);
        this.f10381d = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f10382e = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f10383i = path;
    }

    public final void a(int i7, int i10) {
        int iRound;
        int iRound2;
        if (i7 <= 0 || i10 <= 0) {
            return;
        }
        float f2 = i7;
        float f7 = i10;
        float f10 = f2 / f7;
        float f11 = this.f10387y / this.E;
        float f12 = this.F;
        if (f10 <= f11) {
            iRound2 = Math.round(f2 * f12);
            iRound = Math.round(iRound2 / f11);
        } else {
            iRound = Math.round(f7 * f12);
            iRound2 = Math.round(iRound * f11);
        }
        int i11 = (i7 - iRound2) / 2;
        int iRound3 = Math.round((i10 - iRound) * this.G);
        this.f10384v = new s(i11, iRound3, iRound2 + i11, iRound + iRound3);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f2;
        s sVar = this.f10384v;
        if (sVar == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float f7 = sVar.f10378b;
        float f10 = sVar.f10377a;
        float f11 = sVar.f10379c;
        float f12 = sVar.f10380d;
        float f13 = this.f10385w;
        float f14 = this.f10386x;
        boolean z5 = this.H;
        boolean z6 = this.I;
        Paint paint = this.f10382e;
        Paint paint2 = this.f10381d;
        Path path = this.f10383i;
        if (f14 <= 0.0f) {
            if (z5) {
                path.reset();
                path.moveTo(f10, f7);
                path.lineTo(f11, f7);
                path.lineTo(f11, f12);
                path.lineTo(f10, f12);
                path.lineTo(f10, f7);
                path.moveTo(0.0f, 0.0f);
                float f15 = width;
                path.lineTo(f15, 0.0f);
                float f16 = height;
                path.lineTo(f15, f16);
                path.lineTo(0.0f, f16);
                path.lineTo(0.0f, 0.0f);
                canvas.drawPath(path, paint2);
            }
            if (z6) {
                path.reset();
                float f17 = f7 + f13;
                path.moveTo(f10, f17);
                path.lineTo(f10, f7);
                float f18 = f10 + f13;
                path.lineTo(f18, f7);
                float f19 = f11 - f13;
                path.moveTo(f19, f7);
                path.lineTo(f11, f7);
                path.lineTo(f11, f17);
                float f20 = f12 - f13;
                path.moveTo(f11, f20);
                path.lineTo(f11, f12);
                path.lineTo(f19, f12);
                path.moveTo(f18, f12);
                path.lineTo(f10, f12);
                path.lineTo(f10, f20);
                canvas.drawPath(path, paint);
                return;
            }
            return;
        }
        float fMin = Math.min(f14, Math.max(f13 - 1.0f, 0.0f));
        if (z5) {
            path.reset();
            float f21 = f7 + fMin;
            path.moveTo(f10, f21);
            float f22 = f10 + fMin;
            path.quadTo(f10, f7, f22, f7);
            float f23 = f11 - fMin;
            path.lineTo(f23, f7);
            path.quadTo(f11, f7, f11, f21);
            f2 = fMin;
            float f24 = f12 - f2;
            path.lineTo(f11, f24);
            path.quadTo(f11, f12, f23, f12);
            path.lineTo(f22, f12);
            path.quadTo(f10, f12, f10, f24);
            path.lineTo(f10, f21);
            path.moveTo(0.0f, 0.0f);
            float f25 = width;
            path.lineTo(f25, 0.0f);
            float f26 = height;
            path.lineTo(f25, f26);
            path.lineTo(0.0f, f26);
            path.lineTo(0.0f, 0.0f);
            canvas.drawPath(path, paint2);
        } else {
            f2 = fMin;
        }
        if (z6) {
            path.reset();
            float f27 = f7 + f13;
            path.moveTo(f10, f27);
            float f28 = f7 + f2;
            path.lineTo(f10, f28);
            float f29 = f10 + f2;
            path.quadTo(f10, f7, f29, f7);
            float f30 = f10 + f13;
            path.lineTo(f30, f7);
            float f31 = f11 - f13;
            path.moveTo(f31, f7);
            float f32 = f11 - f2;
            path.lineTo(f32, f7);
            path.quadTo(f11, f7, f11, f28);
            path.lineTo(f11, f27);
            float f33 = f12 - f13;
            path.moveTo(f11, f33);
            float f34 = f12 - f2;
            path.lineTo(f11, f34);
            path.quadTo(f11, f12, f32, f12);
            path.lineTo(f31, f12);
            path.moveTo(f30, f12);
            path.lineTo(f29, f12);
            path.quadTo(f10, f12, f10, f34);
            path.lineTo(f10, f33);
            canvas.drawPath(path, paint);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
        a(i11 - i7, i12 - i10);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        a(getMeasuredWidth(), getMeasuredHeight());
    }
}
