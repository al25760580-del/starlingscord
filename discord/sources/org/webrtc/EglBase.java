package org.webrtc;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: classes4.dex */
public interface EglBase {
    public static final int EGL_OPENGL_ES2_BIT = 4;
    public static final int EGL_OPENGL_ES3_BIT = 64;
    public static final int EGL_RECORDABLE_ANDROID = 12610;
    public static final Object lock = new Object();
    public static final int[] CONFIG_PLAIN = configBuilder().createConfigAttributes();
    public static final int[] CONFIG_RGBA = configBuilder().setHasAlphaChannel(true).createConfigAttributes();
    public static final int[] CONFIG_PIXEL_BUFFER = configBuilder().setSupportsPixelBuffer(true).createConfigAttributes();
    public static final int[] CONFIG_PIXEL_RGBA_BUFFER = configBuilder().setHasAlphaChannel(true).setSupportsPixelBuffer(true).createConfigAttributes();
    public static final int[] CONFIG_RECORDABLE = configBuilder().setIsRecordable(true).createConfigAttributes();

    public static class ConfigBuilder {
        private boolean hasAlphaChannel;
        private boolean isRecordable;
        private int openGlesVersion = 2;
        private boolean supportsPixelBuffer;

        public int[] createConfigAttributes() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(12324);
            arrayList.add(8);
            arrayList.add(12323);
            arrayList.add(8);
            arrayList.add(12322);
            arrayList.add(8);
            if (this.hasAlphaChannel) {
                arrayList.add(12321);
                arrayList.add(8);
            }
            int i7 = this.openGlesVersion;
            if (i7 == 2 || i7 == 3) {
                arrayList.add(12352);
                arrayList.add(Integer.valueOf(this.openGlesVersion == 3 ? 64 : 4));
            }
            if (this.supportsPixelBuffer) {
                arrayList.add(12339);
                arrayList.add(5);
            }
            if (this.isRecordable) {
                arrayList.add(Integer.valueOf(EglBase.EGL_RECORDABLE_ANDROID));
                arrayList.add(1);
            }
            arrayList.add(12344);
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
            }
            return iArr;
        }

        public ConfigBuilder setHasAlphaChannel(boolean z5) {
            this.hasAlphaChannel = z5;
            return this;
        }

        public ConfigBuilder setIsRecordable(boolean z5) {
            this.isRecordable = z5;
            return this;
        }

        public ConfigBuilder setOpenGlesVersion(int i7) {
            if (i7 < 1 || i7 > 3) {
                throw new IllegalArgumentException(s0.g.d(i7, "OpenGL ES version ", " not supported"));
            }
            this.openGlesVersion = i7;
            return this;
        }

        public ConfigBuilder setSupportsPixelBuffer(boolean z5) {
            this.supportsPixelBuffer = z5;
            return this;
        }
    }

    public interface Context {
        public static final long NO_CONTEXT = 0;

        long getNativeEglContext();
    }

    public interface EglConnection extends RefCounted {
        static EglConnection create(Context context, int[] iArr) {
            if (context == null) {
                return createEgl14(iArr);
            }
            if (context instanceof EglBase14.Context) {
                return new EglBase14Impl.EglConnection(((EglBase14.Context) context).getRawContext(), iArr);
            }
            if (context instanceof EglBase10.Context) {
                return new EglBase10Impl.EglConnection(((EglBase10.Context) context).getRawContext(), iArr);
            }
            throw new IllegalArgumentException("Unrecognized Context");
        }

        static EglConnection createEgl10(int[] iArr) {
            return new EglBase10Impl.EglConnection(null, iArr);
        }

        static EglConnection createEgl14(int[] iArr) {
            return new EglBase14Impl.EglConnection(null, iArr);
        }
    }

    static ConfigBuilder configBuilder() {
        return new ConfigBuilder();
    }

    static EglBase create(EglConnection eglConnection) {
        if (eglConnection == null) {
            return create();
        }
        if (eglConnection instanceof EglBase14Impl.EglConnection) {
            return new EglBase14Impl((EglBase14Impl.EglConnection) eglConnection);
        }
        if (eglConnection instanceof EglBase10Impl.EglConnection) {
            return new EglBase10Impl((EglBase10Impl.EglConnection) eglConnection);
        }
        throw new IllegalArgumentException("Unrecognized EglConnection");
    }

    static EglBase10 createEgl10(int[] iArr) {
        return new EglBase10Impl(null, iArr);
    }

    static EglBase14 createEgl14(int[] iArr) {
        return new EglBase14Impl(null, iArr);
    }

    static int getOpenGlesVersionFromConfig(int[] iArr) {
        for (int i7 = 0; i7 < iArr.length - 1; i7++) {
            if (iArr[i7] == 12352) {
                int i10 = iArr[i7 + 1];
                if (i10 != 4) {
                    return i10 != 64 ? 1 : 3;
                }
                return 2;
            }
        }
        return 1;
    }

    void createDummyPbufferSurface();

    void createPbufferSurface(int i7, int i10);

    void createSurface(SurfaceTexture surfaceTexture);

    void createSurface(Surface surface);

    void detachCurrent();

    Context getEglBaseContext();

    boolean hasSurface();

    void makeCurrent();

    void release();

    void releaseSurface();

    int surfaceHeight();

    int surfaceWidth();

    void swapBuffers();

    void swapBuffers(long j);

    static EglBase10 createEgl10(EglBase10.Context context, int[] iArr) {
        return new EglBase10Impl(context == null ? null : context.getRawContext(), iArr);
    }

    static EglBase14 createEgl14(EglBase14.Context context, int[] iArr) {
        return new EglBase14Impl(context == null ? null : context.getRawContext(), iArr);
    }

    static EglBase10 createEgl10(EGLContext eGLContext, int[] iArr) {
        return new EglBase10Impl(eGLContext, iArr);
    }

    static EglBase14 createEgl14(android.opengl.EGLContext eGLContext, int[] iArr) {
        return new EglBase14Impl(eGLContext, iArr);
    }

    static EglBase create(Context context, int[] iArr) {
        if (context == null) {
            return createEgl14(iArr);
        }
        if (context instanceof EglBase14.Context) {
            return createEgl14((EglBase14.Context) context, iArr);
        }
        if (context instanceof EglBase10.Context) {
            return createEgl10((EglBase10.Context) context, iArr);
        }
        throw new IllegalArgumentException("Unrecognized Context");
    }

    static EglBase create() {
        return create(null, CONFIG_PLAIN);
    }

    static EglBase create(Context context) {
        return create(context, CONFIG_PLAIN);
    }
}
