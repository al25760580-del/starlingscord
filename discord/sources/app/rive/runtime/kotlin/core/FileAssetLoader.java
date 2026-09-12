package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.errors.RiveException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\t\u0010\u0005\u001a\u00020\u0006H\u0084 J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0096 J\u0011\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0086 J\u0019\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0082 J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H&J\u000e\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0014¨\u0006\u0015"}, d2 = {"Lapp/rive/runtime/kotlin/core/FileAssetLoader;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "()V", "acquire", "", "constructor", "", "cppDelete", "", "pointer", "cppRef", "cppSetRendererType", "rendererType", "loadContents", "", "asset", "Lapp/rive/runtime/kotlin/core/FileAsset;", "inBandBytes", "", "setRendererType", "Lapp/rive/runtime/kotlin/core/RendererType;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class FileAssetLoader extends NativeObject {
    public static final int $stable = 0;

    public FileAssetLoader() throws RiveException {
        super(0L);
        setCppPointer(constructor());
        getRefs().incrementAndGet();
        getCppPointer();
    }

    private final native void cppSetRendererType(long pointer, int rendererType);

    @Override // app.rive.runtime.kotlin.core.NativeObject, app.rive.runtime.kotlin.core.RefCount
    public int acquire() {
        cppRef(getCppPointer());
        return super.acquire();
    }

    public final native long constructor();

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long pointer);

    public final native void cppRef(long pointer);

    public abstract boolean loadContents(@NotNull FileAsset asset, @NotNull byte[] inBandBytes);

    public final void setRendererType(@NotNull RendererType rendererType) {
        Intrinsics.checkNotNullParameter(rendererType, "rendererType");
        cppSetRendererType(getCppPointer(), rendererType.getValue());
    }
}
