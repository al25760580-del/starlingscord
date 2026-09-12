package ta;

import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n8.d f20668a;

    static {
        n8.d dVar = new n8.d(4);
        Collections.addAll(dVar, 2, 7, 4, 5);
        Intrinsics.checkNotNullExpressionValue(dVar, "of(...)");
        f20668a = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int a(RotationOptions rotationOptions, EncodedImage encodedImage) {
        int i7;
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        Integer numValueOf = Integer.valueOf(encodedImage.getExifOrientation());
        n8.d dVar = f20668a;
        int iIndexOf = dVar.indexOf(numValueOf);
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("Only accepts inverted exif orientations");
        }
        if (rotationOptions.a()) {
            i7 = 0;
        } else {
            if (rotationOptions.a()) {
                throw new IllegalStateException("Rotation is set to use EXIF");
            }
            i7 = rotationOptions.f4822a;
        }
        E e10 = dVar.get(((i7 / 90) + iIndexOf) % dVar.size());
        Intrinsics.checkNotNullExpressionValue(e10, "get(...)");
        return ((Number) e10).intValue();
    }

    public static final int b(RotationOptions rotationOptions, EncodedImage encodedImage) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        int i7 = rotationOptions.f4822a;
        if (i7 == -2) {
            return 0;
        }
        int rotationAngle = encodedImage.getRotationAngle();
        int rotationAngle2 = (rotationAngle == 90 || rotationAngle == 180 || rotationAngle == 270) ? encodedImage.getRotationAngle() : 0;
        if (rotationOptions.a()) {
            return rotationAngle2;
        }
        if (rotationOptions.a()) {
            throw new IllegalStateException("Rotation is set to use EXIF");
        }
        return (i7 + rotationAngle2) % 360;
    }

    public static final int c(RotationOptions rotationOptions, ResizeOptions resizeOptions, EncodedImage encodedImage, boolean z5) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (z5 && resizeOptions != null) {
            int iB = b(rotationOptions, encodedImage);
            int iA = f20668a.contains(Integer.valueOf(encodedImage.getExifOrientation())) ? a(rotationOptions, encodedImage) : 0;
            boolean z6 = iB == 90 || iB == 270 || iA == 5 || iA == 7;
            float height = z6 ? encodedImage.getHeight() : encodedImage.getWidth();
            float width = z6 ? encodedImage.getWidth() : encodedImage.getHeight();
            float fMax = Math.max(resizeOptions.f4817a / height, resizeOptions.f4818b / width);
            if (height * fMax > 2048.0f) {
                fMax = 2048.0f / height;
            }
            if (width * fMax > 2048.0f) {
                fMax = 2048.0f / width;
            }
            int i7 = (int) ((fMax * 8) + 0.6666667f);
            if (i7 <= 8) {
                if (i7 < 1) {
                    return 1;
                }
                return i7;
            }
        }
        return 8;
    }
}
