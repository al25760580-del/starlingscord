package app.rive.core;

import a3.e;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import app.rive.RiveInitializationException;
import app.rive.RiveLog;
import app.rive.RiveRenderException;
import app.rive.RiveShutdownException;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00018B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0019H\u0082 J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082 J\u0011\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0019H\u0082 J\u0011\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0019H\u0082 J2\u0010\"\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0010ø\u0001\u0000¢\u0006\u0004\b(\u0010)J*\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020,2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0010ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u0019H\u0002J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\u001cHÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"Lapp/rive/core/RenderContextGL;", "Lapp/rive/core/RenderContext;", "Lapp/rive/core/CheckableAutoCloseable;", ViewProps.DISPLAY, "Landroid/opengl/EGLDisplay;", "config", "Landroid/opengl/EGLConfig;", "context", "Landroid/opengl/EGLContext;", "(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;)V", "getConfig", "()Landroid/opengl/EGLConfig;", "getContext", "()Landroid/opengl/EGLContext;", "cppPointer", "Lapp/rive/core/UniquePointer;", "getCppPointer", "()Lapp/rive/core/UniquePointer;", "getDisplay", "()Landroid/opengl/EGLDisplay;", "component1", "component2", "component3", "copy", "cppConstructor", "", "cppCreateRiveRenderTarget", "width", "", "height", "cppDelete", "", "pointer", "cppDeleteRiveRenderTarget", "createImageSurface", "Lapp/rive/core/RiveSurface;", "drawKey", "Lapp/rive/core/DrawKey;", "commandQueue", "Lapp/rive/core/CommandQueue;", "createImageSurface-i4dAsZ4$kotlin_release", "(IIJLapp/rive/core/CommandQueue;)Lapp/rive/core/RiveSurface;", "createSurface", "surface", "Lapp/rive/core/CloseableSurface;", "createSurface-mDlYe8U$kotlin_release", "(Lapp/rive/core/CloseableSurface;JLapp/rive/core/CommandQueue;)Lapp/rive/core/RiveSurface;", "dispose", "address", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRenderContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderContext.kt\napp/rive/core/RenderContextGL\n+ 2 RiveLog.kt\napp/rive/RiveLog\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,622:1\n57#2:623\n69#2,2:624\n57#2:626\n69#2,2:627\n57#2:629\n57#2:630\n69#2,2:631\n57#2:633\n57#2:635\n69#2,2:636\n1#3:634\n*S KotlinDebug\n*F\n+ 1 RenderContext.kt\napp/rive/core/RenderContextGL\n*L\n269#1:623\n273#1:624,2\n277#1:626\n281#1:627,2\n285#1:629\n313#1:630\n323#1:631,2\n334#1:633\n389#1:635\n398#1:636,2\n*E\n"})
public final /* data */ class RenderContextGL extends RenderContext implements CheckableAutoCloseable {

    @NotNull
    public static final String TAG = "Rive/RenderContextGL";

    @NotNull
    private final EGLConfig config;

    @NotNull
    private final EGLContext context;

    @NotNull
    private final UniquePointer cppPointer;

    @NotNull
    private final EGLDisplay display;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\b\u0010\f\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lapp/rive/core/RenderContextGL$Companion;", "", "()V", "TAG", "", "createConfig", "Landroid/opengl/EGLConfig;", ViewProps.DISPLAY, "Landroid/opengl/EGLDisplay;", "createContext", "Landroid/opengl/EGLContext;", "config", "createDisplay", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRenderContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderContext.kt\napp/rive/core/RenderContextGL$Companion\n+ 2 RiveLog.kt\napp/rive/RiveLog\n*L\n1#1,622:1\n57#2:623\n69#2,2:624\n57#2:626\n69#2,2:627\n57#2:629\n57#2:630\n69#2,2:631\n69#2,2:633\n57#2:635\n57#2:636\n69#2,2:637\n*S KotlinDebug\n*F\n+ 1 RenderContext.kt\napp/rive/core/RenderContextGL$Companion\n*L\n133#1:623\n137#1:624,2\n141#1:626\n146#1:627,2\n149#1:629\n179#1:630\n194#1:631,2\n200#1:633,2\n210#1:635\n236#1:636\n246#1:637,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EGLConfig createConfig(final EGLDisplay display) throws RiveInitializationException {
            final EGLConfig eGLConfig;
            RenderContextGL$Companion$createConfig$1 renderContextGL$Companion$createConfig$1 = new Function0<String>() { // from class: app.rive.core.RenderContextGL$Companion$createConfig$1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Choosing EGL config";
                }
            };
            RiveLog riveLog = RiveLog.INSTANCE;
            riveLog.getLogger().d(RenderContextGL.TAG, renderContextGL$Companion$createConfig$1);
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!EGL14.eglChooseConfig(display, new int[]{12352, 4, 12339, 5, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr, 0)) {
                final String strErrorString = EGLError.INSTANCE.errorString(EGL14.eglGetError());
                riveLog.getLogger().e(RenderContextGL.TAG, null, new Function0<String>() { // from class: app.rive.core.RenderContextGL$Companion$createConfig$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return e.l("eglChooseConfig failed with error: ", strErrorString);
                    }
                });
                throw new RiveInitializationException(e.l("EGL config creation failed: ", strErrorString), new Throwable(strErrorString));
            }
            if (iArr[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                riveLog.getLogger().e(RenderContextGL.TAG, null, new Function0<String>() { // from class: app.rive.core.RenderContextGL$Companion$createConfig$3
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "eglChooseConfig could not find a suitable config";
                    }
                });
                throw new RiveInitializationException("Unable to find a suitable EGL config", null, 2, null);
            }
            Intrinsics.checkNotNull(eGLConfig);
            riveLog.getLogger().d(RenderContextGL.TAG, new Function0<String>() { // from class: app.rive.core.RenderContextGL$Companion$createConfig$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    int iCreateConfig$attr = RenderContextGL.Companion.createConfig$attr(display, eGLConfig, 12324);
                    int iCreateConfig$attr2 = RenderContextGL.Companion.createConfig$attr(display, eGLConfig, 12323);
                    int iCreateConfig$attr3 = RenderContextGL.Companion.createConfig$attr(display, eGLConfig, 12322);
                    int iCreateConfig$attr4 = RenderContextGL.Companion.createConfig$attr(display, eGLConfig, 12321);
                    int iCreateConfig$attr5 = RenderContextGL.Companion.createConfig$attr(display, eGLConfig, 12325);
                    int iCreateConfig$attr6 = RenderContextGL.Companion.createConfig$attr(display, eGLConfig, 12326);
                    StringBuilder sbR = e.r(iCreateConfig$attr, "EGL config chosen successfully:\n  R=", iCreateConfig$attr2, "\n  G=", "\n  B=");
                    e.z(sbR, iCreateConfig$attr3, "\n  A=", iCreateConfig$attr4, "\n  Depth=");
                    sbR.append(iCreateConfig$attr5);
                    sbR.append("\n  Stencil=");
                    sbR.append(iCreateConfig$attr6);
                    return sbR.toString();
                }
            });
            return eGLConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int createConfig$attr(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i7) {
            int[] iArr = new int[1];
            EGL14.eglGetConfigAttrib(eGLDisplay, eGLConfig, i7, iArr, 0);
            return iArr[0];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EGLContext createContext(EGLDisplay display, EGLConfig config) throws RiveInitializationException {
            RenderContextGL$Companion$createContext$1 renderContextGL$Companion$createContext$1 = new Function0<String>() { // from class: app.rive.core.RenderContextGL$Companion$createContext$1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Creating EGL context";
                }
            };
            RiveLog riveLog = RiveLog.INSTANCE;
            riveLog.getLogger().d(RenderContextGL.TAG, renderContextGL$Companion$createContext$1);
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(display, config, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
            if (!Intrinsics.areEqual(eGLContextEglCreateContext, EGL14.EGL_NO_CONTEXT)) {
                Intrinsics.checkNotNull(eGLContextEglCreateContext);
                return eGLContextEglCreateContext;
            }
            final String strErrorString = EGLError.INSTANCE.errorString(EGL14.eglGetError());
            riveLog.getLogger().e(RenderContextGL.TAG, null, new Function0<String>() { // from class: app.rive.core.RenderContextGL$Companion$createContext$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return e.l("eglCreateContext failed with error: ", strErrorString);
                }
            });
            throw new RiveInitializationException("Unable to create EGL context", new Throwable(strErrorString));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EGLDisplay createDisplay() throws RiveInitializationException {
            RenderContextGL$Companion$createDisplay$1 renderContextGL$Companion$createDisplay$1 = new Function0<String>() { // from class: app.rive.core.RenderContextGL$Companion$createDisplay$1
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Getting EGL display";
                }
            };
            RiveLog riveLog = RiveLog.INSTANCE;
            riveLog.getLogger().d(RenderContextGL.TAG, renderContextGL$Companion$createDisplay$1);
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            if (Intrinsics.areEqual(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
                final String strErrorString = EGLError.INSTANCE.errorString(EGL14.eglGetError());
                riveLog.getLogger().e(RenderContextGL.TAG, null, new Function0<String>() { // from class: app.rive.core.RenderContextGL$Companion$createDisplay$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return e.l("eglGetDisplay failed with error: ", strErrorString);
                    }
                });
                throw new RiveInitializationException("Unable to get EGL display", new Throwable(strErrorString));
            }
            riveLog.getLogger().d(RenderContextGL.TAG, new Function0<String>() { // from class: app.rive.core.RenderContextGL$Companion$createDisplay$3
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Initializing EGL";
                }
            });
            final int[] iArr = new int[1];
            final int[] iArr2 = new int[1];
            if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr2, 0)) {
                riveLog.getLogger().d(RenderContextGL.TAG, new Function0<String>() { // from class: app.rive.core.RenderContextGL$Companion$createDisplay$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return e.g(iArr[0], iArr2[0], "EGL initialized with version ", ".");
                    }
                });
                Intrinsics.checkNotNull(eGLDisplayEglGetDisplay);
                return eGLDisplayEglGetDisplay;
            }
            final String strErrorString2 = EGLError.INSTANCE.errorString(EGL14.eglGetError());
            riveLog.getLogger().e(RenderContextGL.TAG, null, new Function0<String>() { // from class: app.rive.core.RenderContextGL$Companion$createDisplay$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return e.l("eglInitialize failed with error: ", strErrorString2);
                }
            });
            throw new RiveInitializationException("Unable to initialize EGL", new Throwable(strErrorString2));
        }

        private Companion() {
        }
    }

    public RenderContextGL() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ RenderContextGL copy$default(RenderContextGL renderContextGL, EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            eGLDisplay = renderContextGL.display;
        }
        if ((i7 & 2) != 0) {
            eGLConfig = renderContextGL.config;
        }
        if ((i7 & 4) != 0) {
            eGLContext = renderContextGL.context;
        }
        return renderContextGL.copy(eGLDisplay, eGLConfig, eGLContext);
    }

    private final native long cppConstructor(long display, long context);

    private final native long cppCreateRiveRenderTarget(int width, int height);

    private final native void cppDelete(long pointer);

    private final native void cppDeleteRiveRenderTarget(long pointer);

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispose(long address) throws RiveShutdownException {
        AnonymousClass1 anonymousClass1 = new Function0<String>() { // from class: app.rive.core.RenderContextGL.dispose.1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "Destroying EGL context";
            }
        };
        RiveLog riveLog = RiveLog.INSTANCE;
        riveLog.getLogger().d(TAG, anonymousClass1);
        if (!EGL14.eglDestroyContext(this.display, this.context)) {
            final String strErrorString = EGLError.INSTANCE.errorString(EGL14.eglGetError());
            riveLog.getLogger().e(TAG, null, new Function0<String>() { // from class: app.rive.core.RenderContextGL.dispose.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return e.l("eglDestroyContext failed with error: ", strErrorString);
                }
            });
            throw new RiveShutdownException("Unable to destroy EGL context", new Throwable(strErrorString));
        }
        riveLog.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.core.RenderContextGL.dispose.3
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "Terminating EGL display";
            }
        });
        if (EGL14.eglTerminate(this.display)) {
            riveLog.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.core.RenderContextGL.dispose.5
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "Deleting RenderContextGL native object";
                }
            });
            cppDelete(address);
        } else {
            final String strErrorString2 = EGLError.INSTANCE.errorString(EGL14.eglGetError());
            riveLog.getLogger().e(TAG, null, new Function0<String>() { // from class: app.rive.core.RenderContextGL.dispose.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return e.l("eglTerminate failed with error: ", strErrorString2);
                }
            });
            throw new RiveShutdownException("Unable to terminate EGL display", new Throwable(strErrorString2));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EGLDisplay getDisplay() {
        return this.display;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EGLConfig getConfig() {
        return this.config;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EGLContext getContext() {
        return this.context;
    }

    @NotNull
    public final RenderContextGL copy(@NotNull EGLDisplay display, @NotNull EGLConfig config, @NotNull EGLContext context) {
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(context, "context");
        return new RenderContextGL(display, config, context);
    }

    @Override // app.rive.core.RenderContext
    @NotNull
    /* JADX INFO: renamed from: createImageSurface-i4dAsZ4$kotlin_release */
    public RiveSurface mo214createImageSurfacei4dAsZ4$kotlin_release(final int width, final int height, long drawKey, @NotNull CommandQueue commandQueue) throws Throwable {
        EGLSurface eGLSurface;
        Throwable th2;
        long jCppCreateRiveRenderTarget;
        Intrinsics.checkNotNullParameter(commandQueue, "commandQueue");
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Image surfaces require a positive width and height.");
        }
        Function0<String> function0 = new Function0<String>() { // from class: app.rive.core.RenderContextGL$createImageSurface$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return g.c(width, "Creating EGL PBuffer surface (", height, " x ", ")");
            }
        };
        RiveLog riveLog = RiveLog.INSTANCE;
        riveLog.getLogger().d(TAG, function0);
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.display, this.config, new int[]{12375, width, 12374, height, 12344}, 0);
        if (Intrinsics.areEqual(eGLSurfaceEglCreatePbufferSurface, EGL14.EGL_NO_SURFACE)) {
            final String strErrorString = EGLError.INSTANCE.errorString(EGL14.eglGetError());
            riveLog.getLogger().e(TAG, null, new Function0<String>() { // from class: app.rive.core.RenderContextGL$createImageSurface$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return e.l("eglCreatePbufferSurface failed with error: ", strErrorString);
                }
            });
            throw new RiveRenderException("Unable to create EGL PBuffer surface", new Throwable(strErrorString));
        }
        try {
            jCppCreateRiveRenderTarget = cppCreateRiveRenderTarget(width, height);
            try {
                Intrinsics.checkNotNull(eGLSurfaceEglCreatePbufferSurface);
                eGLSurface = eGLSurfaceEglCreatePbufferSurface;
                try {
                    return new RiveEGLPBufferSurface(eGLSurface, this.display, commandQueue, jCppCreateRiveRenderTarget, drawKey, width, height, null);
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    if (jCppCreateRiveRenderTarget != 0) {
                        cppDeleteRiveRenderTarget(jCppCreateRiveRenderTarget);
                    }
                    EGL14.eglDestroySurface(this.display, eGLSurface);
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                eGLSurface = eGLSurfaceEglCreatePbufferSurface;
            }
        } catch (Throwable th5) {
            eGLSurface = eGLSurfaceEglCreatePbufferSurface;
            th2 = th5;
            jCppCreateRiveRenderTarget = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0087  */
    @Override // app.rive.core.RenderContext
    @NotNull
    /* JADX INFO: renamed from: createSurface-mDlYe8U$kotlin_release */
    public RiveSurface mo215createSurfacemDlYe8U$kotlin_release(@NotNull CloseableSurface surface, long drawKey, @NotNull CommandQueue commandQueue) throws Throwable {
        EGLSurface eGLSurface;
        long jCppCreateRiveRenderTarget;
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(commandQueue, "commandQueue");
        if (!surface.getSurface().isValid()) {
            throw new RiveRenderException("Unable to create Android Surface", null, 2, null);
        }
        RenderContextGL$createSurface$1 renderContextGL$createSurface$1 = new Function0<String>() { // from class: app.rive.core.RenderContextGL$createSurface$1
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "Creating EGL window surface";
            }
        };
        RiveLog riveLog = RiveLog.INSTANCE;
        riveLog.getLogger().d(TAG, renderContextGL$createSurface$1);
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.display, this.config, surface.getSurface(), new int[]{12344}, 0);
        if (Intrinsics.areEqual(eGLSurfaceEglCreateWindowSurface, EGL14.EGL_NO_SURFACE)) {
            final String strErrorString = EGLError.INSTANCE.errorString(EGL14.eglGetError());
            riveLog.getLogger().e(TAG, null, new Function0<String>() { // from class: app.rive.core.RenderContextGL$createSurface$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return e.l("eglCreateWindowSurface failed with error: ", strErrorString);
                }
            });
            throw new RiveRenderException("Unable to create EGL surface", new Throwable(strErrorString));
        }
        try {
            int[] iArr = new int[2];
            EGL14.eglQuerySurface(this.display, eGLSurfaceEglCreateWindowSurface, 12375, iArr, 0);
            EGL14.eglQuerySurface(this.display, eGLSurfaceEglCreateWindowSurface, 12374, iArr, 1);
            final int i7 = iArr[0];
            final int i10 = iArr[1];
            riveLog.getLogger().d(TAG, new Function0<String>() { // from class: app.rive.core.RenderContextGL$createSurface$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return g.c(i7, "Created EGL surface (", i10, " x ", ")");
                }
            });
            eGLSurface = eGLSurfaceEglCreateWindowSurface;
            try {
                jCppCreateRiveRenderTarget = cppCreateRiveRenderTarget(i7, i10);
                try {
                    Intrinsics.checkNotNull(eGLSurface);
                    return new RiveEGLSurface(eGLSurface, this.display, surface, commandQueue, jCppCreateRiveRenderTarget, drawKey, i7, i10, null);
                } catch (Throwable th2) {
                    th = th2;
                    if (jCppCreateRiveRenderTarget != 0) {
                        cppDeleteRiveRenderTarget(jCppCreateRiveRenderTarget);
                    }
                    EGL14.eglDestroySurface(this.display, eGLSurface);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                jCppCreateRiveRenderTarget = 0;
                if (jCppCreateRiveRenderTarget != 0) {
                    cppDeleteRiveRenderTarget(jCppCreateRiveRenderTarget);
                }
                EGL14.eglDestroySurface(this.display, eGLSurface);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            eGLSurface = eGLSurfaceEglCreateWindowSurface;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenderContextGL)) {
            return false;
        }
        RenderContextGL renderContextGL = (RenderContextGL) other;
        return Intrinsics.areEqual(this.display, renderContextGL.display) && Intrinsics.areEqual(this.config, renderContextGL.config) && Intrinsics.areEqual(this.context, renderContextGL.context);
    }

    @NotNull
    public final EGLConfig getConfig() {
        return this.config;
    }

    @NotNull
    public final EGLContext getContext() {
        return this.context;
    }

    @Override // app.rive.core.RenderContext
    @NotNull
    public UniquePointer getCppPointer() {
        return this.cppPointer;
    }

    @NotNull
    public final EGLDisplay getDisplay() {
        return this.display;
    }

    public int hashCode() {
        return this.context.hashCode() + ((this.config.hashCode() + (this.display.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "RenderContextGL(display=" + this.display + ", config=" + this.config + ", context=" + this.context + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RenderContextGL(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        eGLDisplay = (i7 & 1) != 0 ? INSTANCE.createDisplay() : eGLDisplay;
        eGLConfig = (i7 & 2) != 0 ? INSTANCE.createConfig(eGLDisplay) : eGLConfig;
        this(eGLDisplay, eGLConfig, (i7 & 4) != 0 ? INSTANCE.createContext(eGLDisplay, eGLConfig) : eGLContext);
    }

    public RenderContextGL(@NotNull EGLDisplay display, @NotNull EGLConfig config, @NotNull EGLContext context) {
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(context, "context");
        this.display = display;
        this.config = config;
        this.context = context;
        this.cppPointer = new UniquePointer(cppConstructor(display.getNativeHandle(), context.getNativeHandle()), TAG, new RenderContextGL$cppPointer$1(this));
    }
}
