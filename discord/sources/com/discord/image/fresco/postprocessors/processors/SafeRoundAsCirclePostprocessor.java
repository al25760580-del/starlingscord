package com.discord.image.fresco.postprocessors.processors;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ra.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/discord/image/fresco/postprocessors/processors/SafeRoundAsCirclePostprocessor;", "Lra/a;", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "", "process", "(Landroid/graphics/Bitmap;)V", "Companion", "fresco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SafeRoundAsCirclePostprocessor extends a {
    private static final int MIN_SIZE = 2;

    @Override // ra.a, com.facebook.imagepipeline.request.BasePostprocessor
    public void process(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < 2 || height < 2) {
            return;
        }
        super.process(bitmap);
    }
}
