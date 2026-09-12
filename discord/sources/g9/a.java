package g9;

import a3.e;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.ScalingUtils$ScaleType;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kk.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ScalingUtils$ScaleType f9503e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9506h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9510n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9511o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9512p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9513q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9514r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f9515s;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap f9504f = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f9507i = 80;
    public final Paint j = new Paint(1);
    public final Matrix k = new Matrix();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f9508l = new Rect();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RectF f9509m = new RectF();

    public a() {
        b();
    }

    public final void a(Canvas canvas, String str, String str2, int i7) {
        String strJ = b.j(str, ": ");
        Paint paint = this.j;
        float fMeasureText = paint.measureText(strJ);
        float fMeasureText2 = paint.measureText(str2);
        paint.setColor(1711276032);
        int i10 = this.f9513q;
        int i11 = this.f9514r;
        canvas.drawRect(i10 - 4, i11 + 8, i10 + fMeasureText + fMeasureText2 + 4.0f, i11 + this.f9512p + 8, paint);
        paint.setColor(-1);
        canvas.drawText(strJ, this.f9513q, this.f9514r, paint);
        paint.setColor(i7);
        canvas.drawText(str2, this.f9513q + fMeasureText, this.f9514r, paint);
        this.f9514r += this.f9512p;
    }

    public final void b() {
        this.f9500b = -1;
        this.f9501c = -1;
        this.f9502d = -1;
        this.f9504f = new HashMap();
        this.f9505g = -1;
        this.f9506h = -1;
        this.f9499a = ViewProps.NONE;
        invalidateSelf();
        this.f9515s = -1L;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.j;
        paint.setStyle(style);
        paint.setStrokeWidth(2.0f);
        paint.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        Paint.Style style2 = Paint.Style.FILL;
        paint.setStyle(style2);
        paint.setColor(0);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        paint.setStyle(style2);
        paint.setStrokeWidth(0.0f);
        paint.setColor(-1);
        this.f9513q = this.f9510n;
        this.f9514r = this.f9511o;
        a(canvas, "ID", this.f9499a, -1);
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        Locale locale = Locale.US;
        a(canvas, "D", iWidth + "x" + iHeight, -1);
        if (bounds.height() > 0) {
            a(canvas, "DAR", String.valueOf(Float.valueOf(bounds.width() / bounds.height())), -1);
        }
        int i7 = this.f9500b;
        int i10 = this.f9501c;
        ScalingUtils$ScaleType scalingUtils$ScaleType = this.f9503e;
        int iWidth2 = getBounds().width();
        int iHeight2 = getBounds().height();
        int i11 = -65536;
        if (iWidth2 > 0 && iHeight2 > 0 && i7 > 0 && i10 > 0) {
            if (scalingUtils$ScaleType != null) {
                Rect rect = this.f9508l;
                rect.top = 0;
                rect.left = 0;
                rect.right = iWidth2;
                rect.bottom = iHeight2;
                Matrix matrix = this.k;
                matrix.reset();
                scalingUtils$ScaleType.getTransform(matrix, this.f9508l, i7, i10, 0.0f, 0.0f);
                RectF rectF = this.f9509m;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i7;
                rectF.bottom = i10;
                matrix.mapRect(rectF);
                int iWidth3 = (int) rectF.width();
                int iHeight3 = (int) rectF.height();
                iWidth2 = Math.min(iWidth2, iWidth3);
                iHeight2 = Math.min(iHeight2, iHeight3);
            }
            float f2 = iWidth2;
            float f7 = f2 * 0.1f;
            float f10 = f2 * 0.5f;
            float f11 = iHeight2;
            float f12 = 0.1f * f11;
            float f13 = f11 * 0.5f;
            int iAbs = Math.abs(i7 - iWidth2);
            int iAbs2 = Math.abs(i10 - iHeight2);
            float f14 = iAbs;
            if (f14 < f7 && iAbs2 < f12) {
                i11 = -16711936;
            } else if (f14 < f10 && iAbs2 < f13) {
                i11 = -256;
            }
        }
        a(canvas, "I", this.f9500b + "x" + this.f9501c, i11);
        int i12 = this.f9501c;
        if (i12 > 0) {
            a(canvas, "IAR", String.valueOf(Float.valueOf(this.f9500b / i12)), -1);
        }
        a(canvas, "I", (this.f9502d / IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) + " KiB", -1);
        int i13 = this.f9505g;
        if (i13 > 0) {
            a(canvas, "anim", e.g(i13, this.f9506h, "f ", ", l "), -1);
        }
        ScalingUtils$ScaleType scalingUtils$ScaleType2 = this.f9503e;
        if (scalingUtils$ScaleType2 != null) {
            a(canvas, "scale", String.valueOf(scalingUtils$ScaleType2), -1);
        }
        long j = this.f9515s;
        if (j >= 0) {
            a(canvas, "t", j + " ms", -1);
        }
        for (Map.Entry entry : this.f9504f.entrySet()) {
            a(canvas, (String) entry.getKey(), (String) entry.getValue(), -1);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iMin = Math.min(40, Math.max(10, Math.min(rect.width() / 8, rect.height() / 9)));
        this.j.setTextSize(iMin);
        int i7 = iMin + 8;
        this.f9512p = i7;
        int i10 = this.f9507i;
        if (i10 == 80) {
            this.f9512p = i7 * (-1);
        }
        this.f9510n = rect.left + 10;
        this.f9511o = i10 == 80 ? rect.bottom - 10 : rect.top + 20;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
