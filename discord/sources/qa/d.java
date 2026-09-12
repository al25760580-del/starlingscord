package qa;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;

/* JADX INFO: loaded from: classes3.dex */
public interface d {
    CloseableReference a(EncodedImage encodedImage, Bitmap.Config config);

    CloseableReference b(EncodedImage encodedImage, Bitmap.Config config, int i7, ColorSpace colorSpace);
}
