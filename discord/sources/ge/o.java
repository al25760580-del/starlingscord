package ge;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes3.dex */
public final class o {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextPaint f10003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f10004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f10005h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f10006i;
    public Layout.Alignment j;
    public Bitmap k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f10007l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10008m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10009n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f10010o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10011p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f10012q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f10013r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10014s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10015t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10016u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10017v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10018w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f10019x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f10020y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f10021z;

    public o(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f10002e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f10001d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f9998a = fRound;
        this.f9999b = fRound;
        this.f10000c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f10003f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f10004g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f10005h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z5) {
        Canvas canvas2;
        if (!z5) {
            this.J.getClass();
            this.k.getClass();
            canvas.drawBitmap(this.k, (Rect) null, this.J, this.f10005h);
            return;
        }
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f10016u) > 0) {
            int i7 = this.f10016u;
            Paint paint = this.f10004g;
            paint.setColor(i7);
            canvas2 = canvas;
            canvas2.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        int i10 = this.f10018w;
        TextPaint textPaint = this.f10003f;
        if (i10 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f9998a);
            textPaint.setColor(this.f10017v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else {
            float f2 = this.f9999b;
            if (i10 == 2) {
                float f7 = this.f10000c;
                textPaint.setShadowLayer(f2, f7, f7, this.f10017v);
            } else if (i10 == 3 || i10 == 4) {
                boolean z6 = i10 == 3;
                int i11 = z6 ? -1 : this.f10017v;
                int i12 = z6 ? this.f10017v : -1;
                float f10 = f2 / 2.0f;
                textPaint.setColor(this.f10014s);
                textPaint.setStyle(Paint.Style.FILL);
                float f11 = -f10;
                textPaint.setShadowLayer(f2, f11, f11, i11);
                staticLayout2.draw(canvas2);
                textPaint.setShadowLayer(f2, f10, f10, i12);
            }
        }
        textPaint.setColor(this.f10014s);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }
}
