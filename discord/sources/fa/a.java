package fa;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imageutils.BitmapUtil;
import kotlin.jvm.internal.Intrinsics;
import pa.e;
import r8.b;
import u4.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends PlatformBitmapFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f9050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f9051b;

    public a(e bitmapPool, c closeableReferenceFactory) {
        Intrinsics.checkNotNullParameter(bitmapPool, "bitmapPool");
        Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
        this.f9050a = bitmapPool;
        this.f9051b = closeableReferenceFactory;
    }

    @Override // com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory
    public final CloseableReference a(int i7, int i10, Bitmap.Config bitmapConfig) {
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        int sizeInByteForBitmap = BitmapUtil.getSizeInByteForBitmap(i7, i10, bitmapConfig);
        e eVar = this.f9050a;
        Bitmap bitmap = (Bitmap) eVar.get(sizeInByteForBitmap);
        if (bitmap.getAllocationByteCount() < BitmapUtil.getPixelSizeForBitmapConfig(bitmapConfig) * i7 * i10) {
            throw new IllegalStateException("Check failed.");
        }
        bitmap.reconfigure(i7, i10, bitmapConfig);
        b bVarO = CloseableReference.O(bitmap, eVar, (u4.b) this.f9051b.f20946d);
        Intrinsics.checkNotNullExpressionValue(bVarO, "create(...)");
        return bVarO;
    }
}
