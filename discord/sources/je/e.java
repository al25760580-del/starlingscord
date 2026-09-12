package je;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f13781y = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f13782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f13783e = new int[1];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EGLDisplay f13784i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public EGLContext f13785v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public EGLSurface f13786w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public SurfaceTexture f13787x;

    public e(Handler handler) {
        this.f13782d = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f13782d.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f13787x;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
