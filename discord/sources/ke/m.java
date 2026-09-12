package ke;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends GLSurfaceView implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f14394e = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f14395d;

    public m(Context context) {
        super(context, null);
        l lVar = new l(this);
        this.f14395d = lVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(lVar);
        setRenderMode(0);
    }

    public void setOutputBuffer(lc.h hVar) {
        l lVar = this.f14395d;
        if (lVar.f14392x.getAndSet(hVar) != null) {
            throw new ClassCastException();
        }
        lVar.f14387d.requestRender();
    }

    @Deprecated
    public n getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
