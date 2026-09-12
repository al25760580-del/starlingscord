package qn;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements a {
    @Override // qn.a
    public final boolean isSatisfied(File imageFile) {
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        return Bitmap.CompressFormat.JPEG == pn.b.a(imageFile);
    }

    @Override // qn.a
    public final File satisfy(File imageFile) {
        Intrinsics.checkParameterIsNotNull(imageFile, "imageFile");
        Bitmap bitmapD = pn.b.d(imageFile);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        return pn.b.e(imageFile, bitmapD, 0, 8);
    }
}
