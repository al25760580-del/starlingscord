package app.rive.core;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import app.rive.RiveLog;
import app.rive.RiveShutdownException;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018BE\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0002\u0010\u0012J\b\u0010\u0016\u001a\u00020\u0017H\u0015R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lapp/rive/core/RiveEGLSurface;", "Lapp/rive/core/RiveSurface;", "Ljava/lang/AutoCloseable;", "eglSurface", "Landroid/opengl/EGLSurface;", ViewProps.DISPLAY, "Landroid/opengl/EGLDisplay;", "closeableSurface", "Lapp/rive/core/CloseableSurface;", "commandQueue", "Lapp/rive/core/CommandQueue;", "renderTargetPointer", "", "drawKey", "Lapp/rive/core/DrawKey;", "width", "", "height", "(Landroid/opengl/EGLSurface;Landroid/opengl/EGLDisplay;Lapp/rive/core/CloseableSurface;Lapp/rive/core/CommandQueue;JJIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "surfaceNativePointer", "getSurfaceNativePointer", "()J", "dispose", "", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRenderContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderContext.kt\napp/rive/core/RiveEGLSurface\n+ 2 RiveLog.kt\napp/rive/RiveLog\n*L\n1#1,622:1\n57#2:623\n*S KotlinDebug\n*F\n+ 1 RenderContext.kt\napp/rive/core/RiveEGLSurface\n*L\n560#1:623\n*E\n"})
public final class RiveEGLSurface extends RiveSurface implements AutoCloseable {

    @NotNull
    public static final String TAG = "Rive/EGLSurface";

    @NotNull
    private final CloseableSurface closeableSurface;

    @NotNull
    private final EGLDisplay display;

    @NotNull
    private final EGLSurface eglSurface;
    public static final int $stable = 8;

    public /* synthetic */ RiveEGLSurface(EGLSurface eGLSurface, EGLDisplay eGLDisplay, CloseableSurface closeableSurface, CommandQueue commandQueue, long j, long j5, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(eGLSurface, eGLDisplay, closeableSurface, commandQueue, j, j5, i7, i10);
    }

    @Override // app.rive.core.RiveSurface
    public void dispose() throws RiveShutdownException {
        RiveLog.INSTANCE.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.core.RiveEGLSurface.dispose.1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "Destroying EGL surface";
            }
        });
        if (!EGL14.eglDestroySurface(this.display, this.eglSurface)) {
            throw new RiveShutdownException("Unable to destroy EGL surface", null, 2, null);
        }
        this.closeableSurface.close();
        super.dispose();
    }

    @Override // app.rive.core.RiveSurface
    public long getSurfaceNativePointer() {
        return this.eglSurface.getNativeHandle();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private RiveEGLSurface(EGLSurface eglSurface, EGLDisplay display, CloseableSurface closeableSurface, CommandQueue commandQueue, long j, long j5, int i7, int i10) {
        super(commandQueue, j, j5, i7, i10, null);
        Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(closeableSurface, "closeableSurface");
        Intrinsics.checkNotNullParameter(commandQueue, "commandQueue");
        this.eglSurface = eglSurface;
        this.display = display;
        this.closeableSurface = closeableSurface;
    }
}
