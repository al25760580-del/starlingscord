package app.rive.runtime.kotlin.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0012\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lapp/rive/runtime/kotlin/core/ImageDecoder;", "", "()V", "decodeToBitmap", "", "encoded", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ImageDecoder {
    public static final int $stable = 0;

    @NotNull
    public static final ImageDecoder INSTANCE = new ImageDecoder();

    private ImageDecoder() {
    }

    @NotNull
    public static final int[] decodeToBitmap(@NotNull byte[] encoded) {
        Intrinsics.checkNotNullParameter(encoded, "encoded");
        try {
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(encoded, 0, encoded.length, new BitmapFactory.Options());
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int[] iArr = new int[(width * height) + 2];
            iArr[0] = width;
            iArr[1] = height;
            bitmapDecodeByteArray.getPixels(iArr, 2, width, 0, 0, width, height);
            return iArr;
        } catch (Exception unused) {
            return new int[0];
        }
    }
}
