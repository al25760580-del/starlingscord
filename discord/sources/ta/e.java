package ta;

import a5.l0;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import kotlin.jvm.internal.Intrinsics;
import pa.r;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20670a;

    public e(boolean z5) {
        this.f20670a = z5;
    }

    @Override // ta.a
    public final String a() {
        return "SimpleImageTranscoder";
    }

    @Override // ta.a
    public final boolean b(z9.c imageFormat) {
        Intrinsics.checkNotNullParameter(imageFormat, "imageFormat");
        return imageFormat == z9.b.k || imageFormat == z9.b.f23618a;
    }

    @Override // ta.a
    public final boolean c(EncodedImage encodedImage, RotationOptions rotationOptions, ResizeOptions resizeOptions) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (rotationOptions == null) {
            rotationOptions = RotationOptions.f4819c;
        }
        return this.f20670a && l0.q(rotationOptions, resizeOptions, encodedImage, RecyclerView.ItemAnimator.FLAG_MOVED) > 1;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // ta.a
    public final o9.d d(EncodedImage encodedImage, r outputStream, RotationOptions rotationOptions, ResizeOptions resizeOptions, ColorSpace colorSpace) throws Throwable {
        Matrix matrix;
        Bitmap bitmapCreateBitmap;
        Integer num = 85;
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        RotationOptions rotationOptions2 = rotationOptions == null ? RotationOptions.f4819c : rotationOptions;
        int iQ = !this.f20670a ? 1 : l0.q(rotationOptions2, resizeOptions, encodedImage, RecyclerView.ItemAnimator.FLAG_MOVED);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = iQ;
        if (colorSpace != null && Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = colorSpace;
        }
        int i7 = 9;
        int i10 = 2;
        try {
            Matrix matrix2 = null;
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(encodedImage.getInputStream(), null, options);
            if (bitmapDecodeStream == null) {
                o8.a.g("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new o9.d(i10, i7);
            }
            n8.d dVar = c.f20668a;
            Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
            Intrinsics.checkNotNullParameter(rotationOptions2, "rotationOptions");
            try {
                try {
                    if (c.f20668a.contains(Integer.valueOf(encodedImage.getExifOrientation()))) {
                        int iA = c.a(rotationOptions2, encodedImage);
                        Matrix matrix3 = new Matrix();
                        if (iA == 2) {
                            matrix3.setScale(-1.0f, 1.0f);
                        } else if (iA == 7) {
                            matrix3.setRotate(-90.0f);
                            matrix3.postScale(-1.0f, 1.0f);
                        } else {
                            if (iA != 4) {
                                if (iA == 5) {
                                    matrix3.setRotate(90.0f);
                                    matrix3.postScale(-1.0f, 1.0f);
                                }
                                if (matrix != null) {
                                    try {
                                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, false);
                                    } catch (OutOfMemoryError e10) {
                                        e = e10;
                                        bitmapCreateBitmap = bitmapDecodeStream;
                                        o8.a.h("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                                        o9.d dVar2 = new o9.d(i10, i7);
                                        bitmapCreateBitmap.recycle();
                                        bitmapDecodeStream.recycle();
                                        return dVar2;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bitmapCreateBitmap = bitmapDecodeStream;
                                        bitmapCreateBitmap.recycle();
                                        bitmapDecodeStream.recycle();
                                        throw th;
                                    }
                                } else {
                                    bitmapCreateBitmap = bitmapDecodeStream;
                                }
                                bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, num.intValue(), outputStream);
                                o9.d dVar3 = new o9.d(iQ > 1 ? 0 : 1, i7);
                                bitmapCreateBitmap.recycle();
                                bitmapDecodeStream.recycle();
                                return dVar3;
                            }
                            matrix3.setRotate(180.0f);
                            matrix3.postScale(-1.0f, 1.0f);
                        }
                        matrix = matrix3;
                        if (matrix != null) {
                            bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, false);
                        } else {
                            bitmapCreateBitmap = bitmapDecodeStream;
                        }
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, num.intValue(), outputStream);
                        o9.d dVar4 = new o9.d(iQ > 1 ? 0 : 1, i7);
                        bitmapCreateBitmap.recycle();
                        bitmapDecodeStream.recycle();
                        return dVar4;
                    }
                    int iB = c.b(rotationOptions2, encodedImage);
                    if (iB != 0) {
                        matrix2 = new Matrix();
                        matrix2.setRotate(iB);
                    }
                    bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, num.intValue(), outputStream);
                    o9.d dVar5 = new o9.d(iQ > 1 ? 0 : 1, i7);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return dVar5;
                } catch (OutOfMemoryError e11) {
                    e = e11;
                    o8.a.h("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                    o9.d dVar6 = new o9.d(i10, i7);
                    bitmapCreateBitmap.recycle();
                    bitmapDecodeStream.recycle();
                    return dVar6;
                }
            } catch (Throwable th3) {
                th = th3;
                bitmapCreateBitmap.recycle();
                bitmapDecodeStream.recycle();
                throw th;
            }
            matrix = matrix2;
            if (matrix != null) {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, false);
            } else {
                bitmapCreateBitmap = bitmapDecodeStream;
            }
        } catch (OutOfMemoryError e12) {
            o8.a.h("SimpleImageTranscoder", "Out-Of-Memory during transcode", e12);
            return new o9.d(i10, i7);
        }
    }
}
