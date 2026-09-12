package ke;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends Surface {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f14382v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f14383w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f14385e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14386i;

    public k(j jVar, SurfaceTexture surfaceTexture, boolean z5) {
        super(surfaceTexture);
        this.f14385e = jVar;
        this.f14384d = z5;
    }

    public static int a(Context context) {
        String strEglQueryString;
        String strEglQueryString2;
        int i7 = e0.f13788a;
        if (i7 >= 24 && ((i7 >= 26 || !("samsung".equals(e0.f13790c) || "XT1650".equals(e0.f13791d))) && ((i7 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
            return (i7 >= 17 && (strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context")) ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean h(Context context) {
        try {
            if (!f14383w) {
                f14382v = a(context);
                f14383w = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f14382v != 0;
    }

    public static k i(Context context, boolean z5) {
        boolean z6 = false;
        je.b.k(!z5 || h(context));
        j jVar = new j("ExoPlayer:PlaceholderSurface");
        int i7 = z5 ? f14382v : 0;
        jVar.start();
        Handler handler = new Handler(jVar.getLooper(), jVar);
        jVar.f14378e = handler;
        jVar.f14377d = new je.e(handler);
        synchronized (jVar) {
            jVar.f14378e.obtainMessage(1, i7, 0).sendToTarget();
            while (jVar.f14381w == null && jVar.f14380v == null && jVar.f14379i == null) {
                try {
                    jVar.wait();
                } catch (InterruptedException unused) {
                    z6 = true;
                }
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = jVar.f14380v;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = jVar.f14379i;
        if (error != null) {
            throw error;
        }
        k kVar = jVar.f14381w;
        kVar.getClass();
        return kVar;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f14385e) {
            try {
                if (!this.f14386i) {
                    j jVar = this.f14385e;
                    jVar.f14378e.getClass();
                    jVar.f14378e.sendEmptyMessage(2);
                    this.f14386i = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
