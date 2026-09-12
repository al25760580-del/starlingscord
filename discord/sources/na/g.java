package na;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.imageutils.BitmapUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends a implements d {
    public static final /* synthetic */ int F = 0;
    public final int E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CloseableReference f16527v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile Bitmap f16528w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k f16529x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f16530y;

    public g(Bitmap bitmap, r8.c cVar, k kVar) {
        this.f16528w = bitmap;
        Bitmap bitmap2 = this.f16528w;
        cVar.getClass();
        this.f16527v = CloseableReference.O(bitmap2, cVar, CloseableReference.f4623x);
        this.f16529x = kVar;
        this.f16530y = 0;
        this.E = 0;
    }

    @Override // na.a, na.c
    public final k G() {
        return this.f16529x;
    }

    @Override // na.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        CloseableReference closeableReference;
        synchronized (this) {
            closeableReference = this.f16527v;
            this.f16527v = null;
            this.f16528w = null;
        }
        if (closeableReference != null) {
            closeableReference.close();
        }
    }

    public final void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        o8.a.x("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", g.class.getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // na.c, com.facebook.imagepipeline.image.ImageInfo
    public final int getHeight() {
        int i7;
        if (this.f16530y % 180 != 0 || (i7 = this.E) == 5 || i7 == 7) {
            Bitmap bitmap = this.f16528w;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getWidth();
        }
        Bitmap bitmap2 = this.f16528w;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getHeight();
    }

    @Override // na.c, com.facebook.imagepipeline.image.ImageInfo
    public final int getWidth() {
        int i7;
        if (this.f16530y % 180 != 0 || (i7 = this.E) == 5 || i7 == 7) {
            Bitmap bitmap = this.f16528w;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getHeight();
        }
        Bitmap bitmap2 = this.f16528w;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getWidth();
    }

    @Override // na.c
    public final synchronized boolean isClosed() {
        return this.f16527v == null;
    }

    @Override // na.c
    public final int j() {
        return BitmapUtil.getSizeInBytes(this.f16528w);
    }

    public g(CloseableReference closeableReference, k kVar, int i7, int i10) {
        CloseableReference closeableReferenceF = closeableReference.f();
        closeableReferenceF.getClass();
        this.f16527v = closeableReferenceF;
        this.f16528w = (Bitmap) closeableReferenceF.q();
        this.f16529x = kVar;
        this.f16530y = i7;
        this.E = i10;
    }
}
