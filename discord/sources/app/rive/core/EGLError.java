package app.rive.core;

import a3.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lapp/rive/core/EGLError;", "", "()V", "EGL_ERROR_MAP", "", "", "", "getEGL_ERROR_MAP", "()Ljava/util/Map;", "errorString", "eglError", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EGLError {

    @NotNull
    public static final EGLError INSTANCE = new EGLError();

    @NotNull
    private static final Map<Integer, String> EGL_ERROR_MAP = w0.g(new Pair(12288, "EGL_SUCCESS"), new Pair(12289, "EGL_NOT_INITIALIZED"), new Pair(12290, "EGL_BAD_ACCESS"), new Pair(12291, "EGL_BAD_ALLOC"), new Pair(12292, "EGL_BAD_ATTRIBUTE"), new Pair(12294, "EGL_BAD_CONTEXT"), new Pair(12293, "EGL_BAD_CONFIG"), new Pair(12295, "EGL_BAD_CURRENT_SURFACE"), new Pair(12296, "EGL_BAD_DISPLAY"), new Pair(12301, "EGL_BAD_SURFACE"), new Pair(12297, "EGL_BAD_MATCH"), new Pair(12300, "EGL_BAD_PARAMETER"), new Pair(12298, "EGL_BAD_NATIVE_PIXMAP"), new Pair(12299, "EGL_BAD_NATIVE_WINDOW"), new Pair(12302, "EGL_CONTEXT_LOST"));
    public static final int $stable = 8;

    private EGLError() {
    }

    @NotNull
    public final String errorString(int eglError) {
        String str = EGL_ERROR_MAP.get(Integer.valueOf(eglError));
        if (str != null) {
            return str;
        }
        String string = Integer.toString(eglError, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return e.l("Unknown EGL error 0x", string);
    }

    @NotNull
    public final Map<Integer, String> getEGL_ERROR_MAP() {
        return EGL_ERROR_MAP;
    }
}
