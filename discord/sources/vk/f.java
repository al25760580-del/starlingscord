package vk;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SurfaceTexture f21724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f21725e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f21726i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f21727v = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f21728w;

    public f(int i7, int i10) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i11 = iArr[0];
        GLES20.glBindTexture(36197, i11);
        ls.d.j("glBindTexture textureID");
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        ls.d.j("glTexParameter");
        this.f21726i = i11;
        SurfaceTexture surfaceTexture = new SurfaceTexture(i11);
        this.f21724d = surfaceTexture;
        if (i7 != -1 && i10 != -1) {
            surfaceTexture.setDefaultBufferSize(i7, i10);
        }
        this.f21725e = new Surface(surfaceTexture);
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.f21727v) {
            try {
                if (this.f21728w) {
                    throw new RuntimeException("frameAvailable already set, frame could be dropped");
                }
                this.f21728w = true;
                this.f21727v.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
