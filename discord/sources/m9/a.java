package m9;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import kotlin.jvm.internal.Intrinsics;
import o9.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlatformBitmapFactory f15470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f15471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pf.b f15472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r9.a f15473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o9.a f15475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f15476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bitmap.Config f15477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f15478i;
    public Rect j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15479l;

    public a(PlatformBitmapFactory platformBitmapFactory, b bitmapFrameCache, pf.b animationInformation, r9.a bitmapFrameRenderer, boolean z5, o9.a aVar, c cVar) {
        Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
        Intrinsics.checkNotNullParameter(bitmapFrameCache, "bitmapFrameCache");
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        Intrinsics.checkNotNullParameter(bitmapFrameRenderer, "bitmapFrameRenderer");
        this.f15470a = platformBitmapFactory;
        this.f15471b = bitmapFrameCache;
        this.f15472c = animationInformation;
        this.f15473d = bitmapFrameRenderer;
        this.f15474e = z5;
        this.f15475f = aVar;
        this.f15476g = cVar;
        this.f15477h = Bitmap.Config.ARGB_8888;
        this.f15478i = new Paint(6);
        new Path();
        new Matrix();
        e();
    }

    public final void a() {
        if (!this.f15474e) {
            this.f15471b.clear();
            return;
        }
        o9.a aVar = this.f15475f;
        if (aVar != null) {
            aVar.c();
        }
    }

    public final boolean b(int i7, CloseableReference closeableReference, Canvas canvas, int i10) {
        if (closeableReference == null || !CloseableReference.z(closeableReference)) {
            return false;
        }
        Object objQ = closeableReference.q();
        Intrinsics.checkNotNullExpressionValue(objQ, "get(...)");
        Bitmap bitmap = (Bitmap) objQ;
        Rect rect = this.j;
        Paint paint = this.f15478i;
        if (rect == null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        } else {
            rect.width();
            rect.height();
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
        }
        if (i10 == 3 || this.f15474e) {
            return true;
        }
        this.f15471b.l(i7, closeableReference);
        return true;
    }

    public final boolean c(Canvas canvas, int i7, int i10) throws Throwable {
        CloseableReference closeableReferenceF;
        boolean zB;
        CloseableReference closeableReference = null;
        try {
            boolean z5 = false;
            int i11 = 1;
            if (this.f15474e) {
                o9.a aVar = this.f15475f;
                CloseableReference closeableReferenceB = aVar != null ? aVar.b(i7, canvas.getWidth(), canvas.getHeight()) : null;
                if (closeableReferenceB != null) {
                    try {
                        if (closeableReferenceB.u()) {
                            Object objQ = closeableReferenceB.q();
                            Intrinsics.checkNotNullExpressionValue(objQ, "get(...)");
                            Bitmap bitmap = (Bitmap) objQ;
                            Paint paint = this.f15478i;
                            Rect rect = this.j;
                            if (rect == null) {
                                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                            } else {
                                rect.width();
                                rect.height();
                                canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
                            }
                            closeableReferenceB.close();
                            return true;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        closeableReference = closeableReferenceB;
                        CloseableReference.l(closeableReference);
                        throw th;
                    }
                }
                if (aVar != null) {
                    aVar.g(canvas.getWidth(), canvas.getHeight());
                }
                CloseableReference.l(closeableReferenceB);
                return false;
            }
            b bVar = this.f15471b;
            if (i10 == 0) {
                closeableReferenceF = bVar.f(i7);
                zB = b(i7, closeableReferenceF, canvas, 0);
            } else if (i10 == 1) {
                closeableReferenceF = bVar.e();
                if (d(i7, closeableReferenceF) && b(i7, closeableReferenceF, canvas, 1)) {
                    z5 = true;
                }
                zB = z5;
                i11 = 2;
            } else {
                if (i10 != 2) {
                    if (i10 == 3) {
                        closeableReferenceF = bVar.c();
                        zB = b(i7, closeableReferenceF, canvas, 3);
                        i11 = -1;
                    }
                    return false;
                }
                try {
                    closeableReferenceF = this.f15470a.a(this.k, this.f15479l, this.f15477h);
                    if (d(i7, closeableReferenceF) && b(i7, closeableReferenceF, canvas, 2)) {
                        z5 = true;
                    }
                    zB = z5;
                    i11 = 3;
                } catch (RuntimeException e10) {
                    o8.a.s(a.class, "Failed to create frame bitmap", e10);
                }
            }
            CloseableReference.l(closeableReferenceF);
            return (zB || i11 == -1) ? zB : c(canvas, i7, i11);
        } catch (Throwable th3) {
            th = th3;
            CloseableReference.l(closeableReference);
            throw th;
        }
    }

    public final boolean d(int i7, CloseableReference closeableReference) {
        if (closeableReference == null || !closeableReference.u()) {
            return false;
        }
        Object objQ = closeableReference.q();
        Intrinsics.checkNotNullExpressionValue(objQ, "get(...)");
        boolean zM = this.f15473d.m(i7, (Bitmap) objQ);
        if (!zM) {
            closeableReference.close();
        }
        return zM;
    }

    public final void e() {
        r9.a aVar = this.f15473d;
        int width = ((ca.a) aVar.f19216c).f3549c.getWidth();
        this.k = width;
        if (width == -1) {
            Rect rect = this.j;
            this.k = rect != null ? rect.width() : -1;
        }
        int height = ((ca.a) aVar.f19216c).f3549c.getHeight();
        this.f15479l = height;
        if (height == -1) {
            Rect rect2 = this.j;
            this.f15479l = rect2 != null ? rect2.height() : -1;
        }
    }
}
