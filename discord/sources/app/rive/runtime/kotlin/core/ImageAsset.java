package app.rive.runtime.kotlin.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0082 J\u0011\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0003H\u0082 J\u0011\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0003H\u0082 J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003H\u0082 R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\n¨\u0006\u001c"}, d2 = {"Lapp/rive/runtime/kotlin/core/ImageAsset;", "Lapp/rive/runtime/kotlin/core/FileAsset;", "address", "", "rendererTypeIdx", "", "(JI)V", "height", "", "getHeight", "()F", "value", "Lapp/rive/runtime/kotlin/core/RiveRenderImage;", "image", "getImage", "()Lapp/rive/runtime/kotlin/core/RiveRenderImage;", "setImage", "(Lapp/rive/runtime/kotlin/core/RiveRenderImage;)V", "width", "getWidth", "cppGetRenderImage", "cppAsset", "cppImageAssetHeight", "cppPointer", "cppImageAssetWidth", "cppSetRenderImage", "", "cppRenderImage", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ImageAsset extends FileAsset {
    public static final int $stable = 0;

    public ImageAsset(long j, int i7) {
        super(j, i7, null);
    }

    private final native long cppGetRenderImage(long cppAsset);

    private final native float cppImageAssetHeight(long cppPointer);

    private final native float cppImageAssetWidth(long cppPointer);

    private final native void cppSetRenderImage(long cppAsset, long cppRenderImage);

    public final float getHeight() {
        return cppImageAssetHeight(getCppPointer());
    }

    @NotNull
    public final RiveRenderImage getImage() {
        return new RiveRenderImage(cppGetRenderImage(getCppPointer()));
    }

    public final float getWidth() {
        return cppImageAssetWidth(getCppPointer());
    }

    public final void setImage(@NotNull RiveRenderImage value) {
        Intrinsics.checkNotNullParameter(value, "value");
        cppSetRenderImage(getCppPointer(), value.getCppPointer());
    }
}
