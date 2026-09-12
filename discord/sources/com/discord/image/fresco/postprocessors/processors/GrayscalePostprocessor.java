package com.discord.image.fresco.postprocessors.processors;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.request.BasePostprocessor;
import i8.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/discord/image/fresco/postprocessors/processors/GrayscalePostprocessor;", "Lcom/facebook/imagepipeline/request/BasePostprocessor;", "<init>", "()V", "process", "", "destBitmap", "Landroid/graphics/Bitmap;", "sourceBitmap", "getName", "", "getPostprocessorCacheKey", "Lcom/facebook/cache/common/CacheKey;", "fresco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GrayscalePostprocessor extends BasePostprocessor {

    @NotNull
    public static final GrayscalePostprocessor INSTANCE = new GrayscalePostprocessor();

    private GrayscalePostprocessor() {
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
    @NotNull
    public String getName() {
        Intrinsics.checkNotNullExpressionValue("GrayscalePostprocessor", "getSimpleName(...)");
        return "GrayscalePostprocessor";
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor, com.facebook.imagepipeline.request.Postprocessor
    @NotNull
    public CacheKey getPostprocessorCacheKey() {
        return new d(getName());
    }

    @Override // com.facebook.imagepipeline.request.BasePostprocessor
    public void process(@NotNull Bitmap destBitmap, @NotNull Bitmap sourceBitmap) {
        Intrinsics.checkNotNullParameter(destBitmap, "destBitmap");
        Intrinsics.checkNotNullParameter(sourceBitmap, "sourceBitmap");
        super.process(destBitmap, sourceBitmap);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        new Canvas(destBitmap).drawBitmap(sourceBitmap, 0.0f, 0.0f, paint);
    }
}
