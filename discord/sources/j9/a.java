package j9;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import com.facebook.drawee.view.DraweeHolder;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends ReplacementSpan {
    public final DraweeHolder E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13710e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Rect f13711i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f13712v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Paint.FontMetricsInt f13713w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Drawable f13714x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Rect f13715y;

    public a(DraweeHolder draweeHolder, int i7) {
        Drawable drawableC = draweeHolder.c();
        Rect rect = new Rect();
        this.f13713w = new Paint.FontMetricsInt();
        this.f13714x = drawableC;
        this.f13712v = i7;
        this.f13715y = rect;
        b();
        this.E = draweeHolder;
    }

    public final int a(int i7, int i10) {
        Rect rect = this.f13715y;
        int i11 = this.f13712v;
        if (i11 == 0) {
            return (i10 - this.f13710e) - rect.bottom;
        }
        if (i11 != 2) {
            return (-this.f13710e) - rect.bottom;
        }
        int i12 = (i10 - i7) + rect.top;
        int i13 = rect.bottom;
        return ((((i12 + i13) - this.f13710e) / 2) + i7) - i13;
    }

    public final void b() {
        Rect bounds = this.f13714x.getBounds();
        this.f13711i = bounds;
        int iWidth = bounds.width();
        Rect rect = this.f13715y;
        this.f13709d = iWidth + rect.left + rect.right;
        this.f13710e = this.f13711i.height();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f2, int i11, int i12, int i13, Paint paint) {
        Paint.FontMetricsInt fontMetricsInt = this.f13713w;
        paint.getFontMetricsInt(fontMetricsInt);
        int iA = a(fontMetricsInt.ascent, fontMetricsInt.descent) + i12;
        float f7 = f2 + this.f13715y.left;
        canvas.translate(f7, iA);
        this.f13714x.draw(canvas);
        canvas.translate(-f7, -iA);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        int i11;
        b();
        if (fontMetricsInt == null) {
            return this.f13709d;
        }
        int iA = a(fontMetricsInt.ascent, fontMetricsInt.descent);
        int i12 = this.f13710e + iA;
        int i13 = this.f13712v;
        Rect rect = this.f13715y;
        if (i13 == 2) {
            i11 = iA - rect.top;
            i12 += rect.bottom;
        } else {
            i11 = iA - rect.top;
        }
        if (i11 < fontMetricsInt.ascent) {
            fontMetricsInt.ascent = i11;
        }
        if (i11 < fontMetricsInt.top) {
            fontMetricsInt.top = i11;
        }
        if (i12 > fontMetricsInt.descent) {
            fontMetricsInt.descent = i12;
        }
        if (i12 > fontMetricsInt.bottom) {
            fontMetricsInt.bottom = i12;
        }
        return this.f13709d;
    }
}
