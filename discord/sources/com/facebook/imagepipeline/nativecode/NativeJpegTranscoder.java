package com.facebook.imagepipeline.nativecode;

import a5.l0;
import android.graphics.ColorSpace;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import java.io.InputStream;
import java.io.OutputStream;
import n8.d;
import n8.i;
import pa.r;

/* JADX INFO: loaded from: classes3.dex */
@n8.c
public class NativeJpegTranscoder implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4917c;

    public static void e(InputStream inputStream, r rVar, int i7, int i10, int i11) {
        b.k();
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException();
        }
        if (!(i10 <= 16)) {
            throw new IllegalArgumentException();
        }
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i11 <= 100)) {
            throw new IllegalArgumentException();
        }
        d dVar = ta.c.f20668a;
        if (!(i7 >= 0 && i7 <= 270 && i7 % 90 == 0)) {
            throw new IllegalArgumentException();
        }
        i.b("no transformation requested", (i10 == 8 && i7 == 0) ? false : true);
        nativeTranscodeJpeg(inputStream, rVar, i7, i10, i11);
    }

    public static void f(InputStream inputStream, r rVar, int i7, int i10, int i11) {
        boolean z5;
        b.k();
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException();
        }
        if (!(i10 <= 16)) {
            throw new IllegalArgumentException();
        }
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i11 <= 100)) {
            throw new IllegalArgumentException();
        }
        d dVar = ta.c.f20668a;
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z5 = true;
                break;
            default:
                z5 = false;
                break;
        }
        if (!z5) {
            throw new IllegalArgumentException();
        }
        i.b("no transformation requested", (i10 == 8 && i7 == 1) ? false : true);
        nativeTranscodeJpegWithExifOrientation(inputStream, rVar, i7, i10, i11);
    }

    @n8.c
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i7, int i10, int i11);

    @n8.c
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i7, int i10, int i11);

    @Override // ta.a
    public final String a() {
        return "NativeJpegTranscoder";
    }

    @Override // ta.a
    public final boolean b(z9.c cVar) {
        return cVar == z9.b.f23618a;
    }

    @Override // ta.a
    public final boolean c(EncodedImage encodedImage, RotationOptions rotationOptions, ResizeOptions resizeOptions) {
        if (rotationOptions == null) {
            rotationOptions = RotationOptions.f4819c;
        }
        return ta.c.c(rotationOptions, resizeOptions, encodedImage, this.f4915a) < 8;
    }

    @Override // ta.a
    public final o9.d d(EncodedImage encodedImage, r rVar, RotationOptions rotationOptions, ResizeOptions resizeOptions, ColorSpace colorSpace) {
        Integer num = 85;
        if (rotationOptions == null) {
            rotationOptions = RotationOptions.f4819c;
        }
        int iQ = l0.q(rotationOptions, resizeOptions, encodedImage, this.f4916b);
        try {
            int iC = ta.c.c(rotationOptions, resizeOptions, encodedImage, this.f4915a);
            int iMax = Math.max(1, 8 / iQ);
            if (this.f4917c) {
                iC = iMax;
            }
            InputStream inputStream = encodedImage.getInputStream();
            if (ta.c.f20668a.contains(Integer.valueOf(encodedImage.getExifOrientation()))) {
                int iA = ta.c.a(rotationOptions, encodedImage);
                i.d(inputStream, "Cannot transcode from null input stream!");
                f(inputStream, rVar, iA, iC, num.intValue());
            } else {
                int iB = ta.c.b(rotationOptions, encodedImage);
                i.d(inputStream, "Cannot transcode from null input stream!");
                e(inputStream, rVar, iB, iC, num.intValue());
            }
            n8.a.b(inputStream);
            return new o9.d(iQ != 1 ? 0 : 1, 9);
        } catch (Throwable th2) {
            n8.a.b(null);
            throw th2;
        }
    }
}
