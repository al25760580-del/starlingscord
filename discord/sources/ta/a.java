package ta;

import android.graphics.ColorSpace;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import pa.r;

/* JADX INFO: loaded from: classes3.dex */
public interface a {
    String a();

    boolean b(z9.c cVar);

    boolean c(EncodedImage encodedImage, RotationOptions rotationOptions, ResizeOptions resizeOptions);

    o9.d d(EncodedImage encodedImage, r rVar, RotationOptions rotationOptions, ResizeOptions resizeOptions, ColorSpace colorSpace);
}
