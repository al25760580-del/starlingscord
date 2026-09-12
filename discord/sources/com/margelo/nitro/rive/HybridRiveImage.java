package com.margelo.nitro.rive;

import androidx.annotation.Keep;
import app.rive.runtime.kotlin.core.RiveRenderImage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/margelo/nitro/rive/HybridRiveImage;", "Lcom/margelo/nitro/rive/HybridRiveImageSpec;", "renderImage", "Lapp/rive/runtime/kotlin/core/RiveRenderImage;", "dataSize", "", "<init>", "(Lapp/rive/runtime/kotlin/core/RiveRenderImage;I)V", "getRenderImage", "()Lapp/rive/runtime/kotlin/core/RiveRenderImage;", "byteSize", "", "getByteSize", "()D", "rive-app_react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HybridRiveImage extends HybridRiveImageSpec {
    private final int dataSize;

    @NotNull
    private final RiveRenderImage renderImage;

    public HybridRiveImage(@NotNull RiveRenderImage renderImage, int i7) {
        Intrinsics.checkNotNullParameter(renderImage, "renderImage");
        this.renderImage = renderImage;
        this.dataSize = i7;
    }

    @Override // com.margelo.nitro.rive.HybridRiveImageSpec
    public double getByteSize() {
        return this.dataSize;
    }

    @NotNull
    public final RiveRenderImage getRenderImage() {
        return this.renderImage;
    }
}
