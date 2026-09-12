package com.facebook.webpsupport;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.TypedValue;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import n8.c;

/* JADX INFO: loaded from: classes3.dex */
@c
public class WebpBitmapFactoryImpl {
    @c
    private static Bitmap createBitmap(int i7, int i10, BitmapFactory.Options options) {
        Bitmap bitmap;
        if (options != null && (bitmap = options.inBitmap) != null && bitmap.isMutable()) {
            return options.inBitmap;
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        throw null;
    }

    @c
    private static byte[] getInTempStorageFromOptions(BitmapFactory.Options options) {
        byte[] bArr;
        return (options == null || (bArr = options.inTempStorage) == null) ? new byte[8192] : bArr;
    }

    @c
    private static float getScaleFromOptions(BitmapFactory.Options options) {
        float f2 = 1.0f;
        if (options != null) {
            int i7 = options.inSampleSize;
            f2 = i7 > 1 ? 1.0f / i7 : 1.0f;
            if (options.inScaled) {
                int i10 = options.inDensity;
                int i11 = options.inTargetDensity;
                int i12 = options.inScreenDensity;
                if (i10 != 0 && i11 != 0 && i10 != i12) {
                    return i11 / i10;
                }
            }
        }
        return f2;
    }

    @c
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i7, int i10, BitmapFactory.Options options) {
        com.facebook.imagepipeline.nativecode.c.q();
        return originalDecodeByteArray(bArr, i7, i10, options);
    }

    @c
    public static Bitmap hookDecodeFile(String str, BitmapFactory.Options options) {
        Bitmap bitmapHookDecodeStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                bitmapHookDecodeStream = hookDecodeStream(fileInputStream, null, options);
                fileInputStream.close();
                return bitmapHookDecodeStream;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Exception unused) {
            return bitmapHookDecodeStream;
        }
    }

    @c
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        byte[] bArr;
        com.facebook.imagepipeline.nativecode.c.q();
        long jNativeSeek = nativeSeek(fileDescriptor, 0L, false);
        if (jNativeSeek == -1) {
            Bitmap bitmapHookDecodeStream = hookDecodeStream(new FileInputStream(fileDescriptor), rect, options);
            setPaddingDefaultValues(rect);
            return bitmapHookDecodeStream;
        }
        InputStream fileInputStream = new FileInputStream(fileDescriptor);
        if (!fileInputStream.markSupported()) {
            fileInputStream = new BufferedInputStream(fileInputStream, 20);
        }
        try {
            fileInputStream.mark(20);
            if (options == null || (bArr = options.inTempStorage) == null || bArr.length < 20) {
                bArr = new byte[20];
            }
            try {
                fileInputStream.read(bArr, 0, 20);
                fileInputStream.reset();
            } catch (IOException unused) {
            }
            nativeSeek(fileDescriptor, jNativeSeek, true);
            return originalDecodeFileDescriptor(fileDescriptor, rect, options);
        } finally {
            try {
                fileInputStream.close();
            } catch (Throwable unused2) {
            }
        }
    }

    @c
    public static Bitmap hookDecodeResource(Resources resources, int i7, BitmapFactory.Options options) {
        TypedValue typedValue = new TypedValue();
        Bitmap bitmapHookDecodeResourceStream = null;
        try {
            InputStream inputStreamOpenRawResource = resources.openRawResource(i7, typedValue);
            try {
                bitmapHookDecodeResourceStream = hookDecodeResourceStream(resources, typedValue, inputStreamOpenRawResource, null, options);
                if (inputStreamOpenRawResource != null) {
                    inputStreamOpenRawResource.close();
                }
            } catch (Throwable th2) {
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Exception unused) {
        }
        if (bitmapHookDecodeResourceStream != null || options == null || options.inBitmap == null) {
            return bitmapHookDecodeResourceStream;
        }
        throw new IllegalArgumentException("Problem decoding into existing bitmap");
    }

    @c
    public static Bitmap hookDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (options.inDensity == 0 && typedValue != null) {
            int i7 = typedValue.density;
            if (i7 == 0) {
                options.inDensity = 160;
            } else if (i7 != 65535) {
                options.inDensity = i7;
            }
        }
        if (options.inTargetDensity == 0 && resources != null) {
            options.inTargetDensity = resources.getDisplayMetrics().densityDpi;
        }
        return hookDecodeStream(inputStream, rect, options);
    }

    @c
    public static Bitmap hookDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        com.facebook.imagepipeline.nativecode.c.q();
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream, 20);
        }
        return originalDecodeStream(inputStream, rect, options);
    }

    @c
    private static native Bitmap nativeDecodeByteArray(byte[] bArr, int i7, int i10, BitmapFactory.Options options, float f2, byte[] bArr2);

    @c
    private static native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f2, byte[] bArr);

    @c
    private static native long nativeSeek(FileDescriptor fileDescriptor, long j, boolean z5);

    @c
    private static Bitmap originalDecodeByteArray(byte[] bArr, int i7, int i10, BitmapFactory.Options options) {
        return BitmapFactory.decodeByteArray(bArr, i7, i10, options);
    }

    @c
    private static Bitmap originalDecodeFile(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    @c
    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
    }

    @c
    private static Bitmap originalDecodeResource(Resources resources, int i7, BitmapFactory.Options options) {
        return BitmapFactory.decodeResource(resources, i7, options);
    }

    @c
    private static Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
    }

    @c
    private static Bitmap originalDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }

    @c
    private static void setBitmapSize(BitmapFactory.Options options, int i7, int i10) {
        if (options != null) {
            options.outWidth = i7;
            options.outHeight = i10;
        }
    }

    @c
    private static boolean setOutDimensions(BitmapFactory.Options options, int i7, int i10) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        options.outWidth = i7;
        options.outHeight = i10;
        return true;
    }

    @c
    private static void setPaddingDefaultValues(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    @c
    @SuppressLint({"NewApi"})
    private static boolean shouldPremultiply(BitmapFactory.Options options) {
        if (options != null) {
            return options.inPremultiplied;
        }
        return true;
    }

    @c
    private static Bitmap originalDecodeByteArray(byte[] bArr, int i7, int i10) {
        return BitmapFactory.decodeByteArray(bArr, i7, i10);
    }

    @c
    private static Bitmap originalDecodeFile(String str) {
        return BitmapFactory.decodeFile(str);
    }

    @c
    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    @c
    private static Bitmap originalDecodeResource(Resources resources, int i7) {
        return BitmapFactory.decodeResource(resources, i7);
    }

    @c
    private static Bitmap originalDecodeStream(InputStream inputStream) {
        return BitmapFactory.decodeStream(inputStream);
    }

    @c
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i7, int i10) {
        return hookDecodeByteArray(bArr, i7, i10, null);
    }

    @c
    public static Bitmap hookDecodeFile(String str) {
        return hookDecodeFile(str, null);
    }

    @c
    public static Bitmap hookDecodeStream(InputStream inputStream) {
        return hookDecodeStream(inputStream, null, null);
    }

    @c
    public static Bitmap hookDecodeResource(Resources resources, int i7) {
        return hookDecodeResource(resources, i7, null);
    }

    @c
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return hookDecodeFileDescriptor(fileDescriptor, null, null);
    }
}
