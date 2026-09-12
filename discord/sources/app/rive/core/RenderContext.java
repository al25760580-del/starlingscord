package app.rive.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J2\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¤\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Lapp/rive/core/RenderContext;", "Lapp/rive/core/CheckableAutoCloseable;", "()V", "closed", "", "getClosed", "()Z", "cppPointer", "Lapp/rive/core/UniquePointer;", "getCppPointer", "()Lapp/rive/core/UniquePointer;", "nativeObjectPointer", "", "getNativeObjectPointer", "()J", "close", "", "createImageSurface", "Lapp/rive/core/RiveSurface;", "width", "", "height", "drawKey", "Lapp/rive/core/DrawKey;", "commandQueue", "Lapp/rive/core/CommandQueue;", "createImageSurface-i4dAsZ4$kotlin_release", "(IIJLapp/rive/core/CommandQueue;)Lapp/rive/core/RiveSurface;", "createSurface", "surface", "Lapp/rive/core/CloseableSurface;", "createSurface-mDlYe8U$kotlin_release", "(Lapp/rive/core/CloseableSurface;JLapp/rive/core/CommandQueue;)Lapp/rive/core/RiveSurface;", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class RenderContext implements CheckableAutoCloseable {
    public static final int $stable = 0;

    @Override // app.rive.core.CheckableAutoCloseable, java.lang.AutoCloseable
    public void close() {
        getCppPointer().close();
    }

    @NotNull
    /* JADX INFO: renamed from: createImageSurface-i4dAsZ4$kotlin_release, reason: not valid java name */
    public abstract RiveSurface mo214createImageSurfacei4dAsZ4$kotlin_release(int width, int height, long drawKey, @NotNull CommandQueue commandQueue);

    @NotNull
    /* JADX INFO: renamed from: createSurface-mDlYe8U$kotlin_release, reason: not valid java name */
    public abstract RiveSurface mo215createSurfacemDlYe8U$kotlin_release(@NotNull CloseableSurface surface, long drawKey, @NotNull CommandQueue commandQueue);

    @Override // app.rive.core.CheckableAutoCloseable
    public boolean getClosed() {
        return getCppPointer().getClosed();
    }

    @NotNull
    public abstract UniquePointer getCppPointer();

    public final long getNativeObjectPointer() {
        return getCppPointer().getPointer();
    }
}
