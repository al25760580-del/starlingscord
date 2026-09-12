package ke;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Locale;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public je.e f14377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f14378e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Error f14379i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RuntimeException f14380v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public k f14381w;

    public final void a(int i7) throws je.h {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.f14377d.getClass();
        je.e eVar = this.f14377d;
        int[] iArr = eVar.f13783e;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        je.b.i("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr2 = new int[2];
        je.b.i("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1));
        eVar.f13784i = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, je.e.f13781y, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z5 = zEglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        int i10 = e0.f13788a;
        je.b.i(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z5);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eVar.f13784i, eGLConfig, EGL14.EGL_NO_CONTEXT, i7 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        je.b.i("eglCreateContext failed", eGLContextEglCreateContext != null);
        eVar.f13785v = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = eVar.f13784i;
        if (i7 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i7 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            je.b.i("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        je.b.i("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        eVar.f13786w = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        je.b.h();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        eVar.f13787x = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(eVar);
        SurfaceTexture surfaceTexture2 = this.f14377d.f13787x;
        surfaceTexture2.getClass();
        this.f14381w = new k(this, surfaceTexture2, i7 != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.f14377d.getClass();
        je.e eVar = this.f14377d;
        eVar.f13782d.removeCallbacks(eVar);
        try {
            SurfaceTexture surfaceTexture = eVar.f13787x;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, eVar.f13783e, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = eVar.f13784i;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = eVar.f13784i;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = eVar.f13786w;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(eVar.f13784i, eVar.f13786w);
            }
            EGLContext eGLContext = eVar.f13785v;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eVar.f13784i, eGLContext);
            }
            if (e0.f13788a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = eVar.f13784i;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(eVar.f13784i);
            }
            eVar.f13784i = null;
            eVar.f13785v = null;
            eVar.f13786w = null;
            eVar.f13787x = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        try {
            if (i7 == 1) {
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (Error e10) {
                    je.b.s("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f14379i = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    je.b.s("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f14380v = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (je.h e12) {
                    je.b.s("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f14380v = new IllegalStateException(e12);
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i7 == 2) {
                try {
                    b();
                    quit();
                    return true;
                } catch (Throwable th2) {
                    try {
                        je.b.s("PlaceholderSurface", "Failed to release placeholder surface", th2);
                        return true;
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th3) {
            synchronized (this) {
                notify();
                throw th3;
            }
        }
    }
}
