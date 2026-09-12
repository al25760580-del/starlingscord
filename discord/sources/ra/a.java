package ra;

import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.nativecode.NativeRoundingFilter;
import com.facebook.imagepipeline.request.BasePostprocessor;
import i8.d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends BasePostprocessor {
    private static final boolean ENABLE_ANTI_ALIASING = true;
    private CacheKey mCacheKey;
    private final boolean mEnableAntiAliasing = true;

    @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
    public CacheKey getPostprocessorCacheKey() {
        if (this.mCacheKey == null) {
            if (this.mEnableAntiAliasing) {
                this.mCacheKey = new d("RoundAsCirclePostprocessor#AntiAliased");
            } else {
                this.mCacheKey = new d("RoundAsCirclePostprocessor");
            }
        }
        return this.mCacheKey;
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor
    public void process(Bitmap bitmap) {
        NativeRoundingFilter.toCircleFast(bitmap, this.mEnableAntiAliasing);
    }
}
