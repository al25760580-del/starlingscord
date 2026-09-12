package ca;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.google.firebase.messaging.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i8.b f3547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f3548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aa.b f3549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f3550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f3551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final aa.a[] f3553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f3554h = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f3555i = new Rect();
    public final boolean j;
    public final Paint k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bitmap f3556l;

    public a(i8.b bVar, r rVar, Rect rect, boolean z5) {
        this.f3547a = bVar;
        this.f3548b = rVar;
        aa.b bVar2 = (aa.b) rVar.f6611e;
        this.f3549c = bVar2;
        int[] frameDurationMs = bVar2.p();
        this.f3551e = frameDurationMs;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(frameDurationMs, "frameDurationMs");
        int length = frameDurationMs.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (frameDurationMs[i7] < 11) {
                frameDurationMs[i7] = 100;
            }
        }
        i8.b bVar3 = this.f3547a;
        int[] frameDurationMs2 = this.f3551e;
        bVar3.getClass();
        Intrinsics.checkNotNullParameter(frameDurationMs2, "frameDurationMs");
        int i10 = 0;
        for (int i11 : frameDurationMs2) {
            i10 += i11;
        }
        this.f3552f = i10;
        i8.b bVar4 = this.f3547a;
        int[] frameDurationsMs = this.f3551e;
        bVar4.getClass();
        Intrinsics.checkNotNullParameter(frameDurationsMs, "frameDurationsMs");
        int[] iArr = new int[frameDurationsMs.length];
        int length2 = frameDurationsMs.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length2; i13++) {
            iArr[i13] = i12;
            i12 += frameDurationsMs[i13];
        }
        this.f3550d = a(this.f3549c, rect);
        this.j = z5;
        this.f3553g = new aa.a[this.f3549c.k()];
        for (int i14 = 0; i14 < this.f3549c.k(); i14++) {
            this.f3553g[i14] = this.f3549c.o(i14);
        }
        Paint paint = new Paint();
        this.k = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static Rect a(aa.b bVar, Rect rect) {
        return rect == null ? new Rect(0, 0, bVar.getWidth(), bVar.getHeight()) : new Rect(0, 0, Math.min(rect.width(), bVar.getWidth()), Math.min(rect.height(), bVar.getHeight()));
    }

    public final void b(Canvas canvas, float f2, float f7, aa.a aVar) {
        if (aVar.f293f == 2) {
            int iCeil = (int) Math.ceil(aVar.f290c * f2);
            int iCeil2 = (int) Math.ceil(aVar.f291d * f7);
            int iCeil3 = (int) Math.ceil(aVar.f288a * f2);
            int iCeil4 = (int) Math.ceil(aVar.f289b * f7);
            canvas.drawRect(new Rect(iCeil3, iCeil4, iCeil + iCeil3, iCeil2 + iCeil4), this.k);
        }
    }

    public final synchronized Bitmap c(int i7, int i10) {
        try {
            Bitmap bitmap = this.f3556l;
            if (bitmap != null && (bitmap.getWidth() < i7 || this.f3556l.getHeight() < i10)) {
                synchronized (this) {
                    Bitmap bitmap2 = this.f3556l;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        this.f3556l = null;
                    }
                }
            }
            if (this.f3556l == null) {
                this.f3556l = Bitmap.createBitmap(i7, i10, Bitmap.Config.ARGB_8888);
            }
            this.f3556l.eraseColor(0);
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f3556l;
    }

    public final void d(Canvas canvas, int i7) {
        aa.b bVar = this.f3549c;
        aa.c cVarM = bVar.m(i7);
        try {
            if (cVarM.getWidth() > 0 && cVarM.getHeight() > 0) {
                if (bVar.n()) {
                    f(canvas, cVarM);
                } else {
                    e(canvas, cVarM);
                }
            }
        } finally {
            cVarM.dispose();
        }
    }

    public final void e(Canvas canvas, aa.c cVar) {
        int width;
        int height;
        int iB;
        int iC;
        if (this.j) {
            float fMax = Math.max(cVar.getWidth() / Math.min(cVar.getWidth(), canvas.getWidth()), cVar.getHeight() / Math.min(cVar.getHeight(), canvas.getHeight()));
            width = (int) (cVar.getWidth() / fMax);
            height = (int) (cVar.getHeight() / fMax);
            iB = (int) (cVar.b() / fMax);
            iC = (int) (cVar.c() / fMax);
        } else {
            width = cVar.getWidth();
            height = cVar.getHeight();
            iB = cVar.b();
            iC = cVar.c();
        }
        synchronized (this) {
            Bitmap bitmapC = c(width, height);
            this.f3556l = bitmapC;
            cVar.a(width, height, bitmapC);
            canvas.save();
            canvas.translate(iB, iC);
            canvas.drawBitmap(this.f3556l, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
        }
    }

    public final void f(Canvas canvas, aa.c cVar) {
        double dWidth = ((double) this.f3550d.width()) / ((double) this.f3549c.getWidth());
        double dHeight = ((double) this.f3550d.height()) / ((double) this.f3549c.getHeight());
        int iRound = (int) Math.round(((double) cVar.getWidth()) * dWidth);
        int iRound2 = (int) Math.round(((double) cVar.getHeight()) * dHeight);
        int iB = (int) (((double) cVar.b()) * dWidth);
        int iC = (int) (((double) cVar.c()) * dHeight);
        synchronized (this) {
            try {
                int iWidth = this.f3550d.width();
                int iHeight = this.f3550d.height();
                c(iWidth, iHeight);
                Bitmap bitmap = this.f3556l;
                if (bitmap != null) {
                    cVar.a(iRound, iRound2, bitmap);
                }
                this.f3554h.set(0, 0, iWidth, iHeight);
                this.f3555i.set(iB, iC, iWidth + iB, iHeight + iC);
                Bitmap bitmap2 = this.f3556l;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, this.f3554h, this.f3555i, (Paint) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g(Canvas canvas, aa.c cVar, aa.a aVar, aa.a aVar2) {
        Rect rect = this.f3550d;
        if (rect == null || rect.width() <= 0 || this.f3550d.height() <= 0) {
            return;
        }
        float width = canvas.getWidth() / this.f3550d.width();
        if (aVar2 != null) {
            b(canvas, width, width, aVar2);
        }
        int width2 = cVar.getWidth();
        int height = cVar.getHeight();
        Rect rect2 = new Rect(0, 0, width2, height);
        int i7 = (int) (width2 * width);
        int i10 = (int) (height * width);
        int iB = (int) (cVar.b() * width);
        int iC = (int) (cVar.c() * width);
        Rect rect3 = new Rect(iB, iC, i7 + iB, i10 + iC);
        if (aVar.f292e == 2) {
            canvas.drawRect(rect3, this.k);
        }
        synchronized (this) {
            Bitmap bitmapC = c(width2, height);
            cVar.a(width2, height, bitmapC);
            canvas.drawBitmap(bitmapC, rect2, rect3, (Paint) null);
        }
    }

    public final void h(Canvas canvas, aa.c cVar, aa.a aVar, aa.a aVar2) {
        float f2;
        float f7;
        float f10;
        float f11;
        int width = this.f3549c.getWidth();
        int height = this.f3549c.getHeight();
        float f12 = width;
        float f13 = height;
        int width2 = cVar.getWidth();
        int height2 = cVar.getHeight();
        int iB = cVar.b();
        int iC = cVar.c();
        if (f12 > canvas.getWidth() || f13 > canvas.getHeight()) {
            int iMin = Math.min(canvas.getWidth(), width);
            int iMin2 = Math.min(canvas.getHeight(), height);
            float f14 = f12 / f13;
            if (iMin > iMin2) {
                f7 = iMin;
                f2 = f7 / f14;
            } else {
                f2 = iMin2;
                f7 = f2 * f14;
            }
            f10 = f7 / f12;
            f11 = f2 / f13;
            width2 = (int) Math.ceil(cVar.getWidth() * f10);
            height2 = (int) Math.ceil(cVar.getHeight() * f11);
            iB = (int) Math.ceil(cVar.b() * f10);
            iC = (int) Math.ceil(cVar.c() * f11);
        } else {
            f10 = 1.0f;
            f11 = 1.0f;
        }
        Rect rect = new Rect(0, 0, width2, height2);
        Rect rect2 = new Rect(iB, iC, iB + width2, iC + height2);
        if (aVar2 != null) {
            b(canvas, f10, f11, aVar2);
        }
        if (aVar.f292e == 2) {
            canvas.drawRect(rect2, this.k);
        }
        synchronized (this) {
            Bitmap bitmapC = c(width2, height2);
            cVar.a(width2, height2, bitmapC);
            canvas.drawBitmap(bitmapC, rect, rect2, (Paint) null);
        }
    }
}
