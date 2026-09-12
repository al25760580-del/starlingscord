package com.facebook.imagepipeline.nativecode;

import a3.e;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import androidx.datastore.preferences.protobuf.d1;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imageutils.BitmapUtil;
import com.facebook.soloader.f;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import n8.i;
import pa.q;
import qa.d;

/* JADX INFO: loaded from: classes3.dex */
@n8.c
public abstract class DalvikPurgeableDecoder implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f4913b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pa.c f4914a;

    @f
    public static class OreoUtils {
        private OreoUtils() {
        }

        public static void a(BitmapFactory.Options options, ColorSpace colorSpace) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
    }

    static {
        List list = a.f4921a;
        ib.a.z("imagepipeline");
        f4913b = new byte[]{-1, -39};
    }

    public DalvikPurgeableDecoder() {
        if (pa.d.f17810c == null) {
            synchronized (pa.d.class) {
                try {
                    if (pa.d.f17810c == null) {
                        pa.d.f17810c = new pa.c(pa.d.f17809b, pa.d.f17808a);
                    }
                    Unit unit = Unit.f14616a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        pa.c cVar = pa.d.f17810c;
        Intrinsics.checkNotNull(cVar);
        this.f4914a = cVar;
    }

    public static boolean e(int i7, CloseableReference closeableReference) {
        q qVar = (q) closeableReference.q();
        return i7 >= 2 && qVar.i(i7 + (-2)) == -1 && qVar.i(i7 - 1) == -39;
    }

    @n8.c
    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // qa.d
    public final CloseableReference a(EncodedImage encodedImage, Bitmap.Config config) {
        int sampleSize = encodedImage.getSampleSize();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = sampleSize;
        options.inMutable = true;
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(options, null);
        }
        CloseableReference byteBufferRef = encodedImage.getByteBufferRef();
        byteBufferRef.getClass();
        try {
            return f(c(byteBufferRef, options));
        } finally {
            byteBufferRef.close();
        }
    }

    @Override // qa.d
    public final CloseableReference b(EncodedImage encodedImage, Bitmap.Config config, int i7, ColorSpace colorSpace) {
        int sampleSize = encodedImage.getSampleSize();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = sampleSize;
        options.inMutable = true;
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.a(options, colorSpace);
        }
        CloseableReference byteBufferRef = encodedImage.getByteBufferRef();
        byteBufferRef.getClass();
        try {
            return f(d(byteBufferRef, i7, options));
        } finally {
            byteBufferRef.close();
        }
    }

    public abstract Bitmap c(CloseableReference closeableReference, BitmapFactory.Options options);

    public abstract Bitmap d(CloseableReference closeableReference, int i7, BitmapFactory.Options options);

    public final r8.b f(Bitmap bitmap) throws Throwable {
        int i7;
        long j;
        int i10;
        bitmap.getClass();
        try {
            nativePinBitmap(bitmap);
            pa.c cVar = this.f4914a;
            synchronized (cVar) {
                int sizeInBytes = BitmapUtil.getSizeInBytes(bitmap);
                int i11 = cVar.f17803a;
                if (i11 < cVar.f17805c) {
                    long j5 = cVar.f17804b + ((long) sizeInBytes);
                    if (j5 <= cVar.f17806d) {
                        cVar.f17803a = i11 + 1;
                        cVar.f17804b = j5;
                        return CloseableReference.O(bitmap, this.f4914a.f17807e, CloseableReference.f4623x);
                    }
                }
                int sizeInBytes2 = BitmapUtil.getSizeInBytes(bitmap);
                bitmap.recycle();
                Locale locale = Locale.US;
                pa.c cVar2 = this.f4914a;
                synchronized (cVar2) {
                    i7 = cVar2.f17803a;
                }
                pa.c cVar3 = this.f4914a;
                synchronized (cVar3) {
                    j = cVar3.f17804b;
                }
                pa.c cVar4 = this.f4914a;
                synchronized (cVar4) {
                    i10 = cVar4.f17805c;
                }
                int iB = this.f4914a.b();
                StringBuilder sbR = e.r(sizeInBytes2, "Attempted to pin a bitmap of size ", i7, " bytes. The current pool count is ", ", the current pool size is ");
                sbR.append(j);
                sbR.append(" bytes. The current pool max count is ");
                sbR.append(i10);
                sbR.append(", the current pool max size is ");
                sbR.append(iB);
                sbR.append(" bytes.");
                throw new d1(sbR.toString());
            }
        } catch (Exception e10) {
            bitmap.recycle();
            i.h(e10);
            throw null;
        }
    }
}
