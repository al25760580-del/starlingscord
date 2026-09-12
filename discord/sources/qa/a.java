package qa;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.imageutils.BitmapUtil;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b {
    @Override // qa.b
    public final int d(int i7, int i10, BitmapFactory.Options options) {
        Intrinsics.checkNotNullParameter(options, "options");
        Bitmap.Config config = options.inPreferredConfig;
        if (config != null) {
            return BitmapUtil.getSizeInByteForBitmap(i7, i10, config);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
