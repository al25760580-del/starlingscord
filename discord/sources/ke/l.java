package ke;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements GLSurfaceView.Renderer {
    public static final String[] E = {"y_tex", "u_tex", "v_tex"};
    public static final FloatBuffer F = je.b.p(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f14387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f14388e = new int[3];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f14389i = new int[3];

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int[] f14390v = new int[3];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int[] f14391w = new int[3];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AtomicReference f14392x = new AtomicReference();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public hp.e f14393y;

    public l(m mVar) {
        this.f14387d = mVar;
        for (int i7 = 0; i7 < 3; i7++) {
            int[] iArr = this.f14390v;
            this.f14391w[i7] = -1;
            iArr[i7] = -1;
        }
    }

    public final void a() {
        int[] iArr = this.f14388e;
        try {
            GLES20.glGenTextures(3, iArr, 0);
            for (int i7 = 0; i7 < 3; i7++) {
                hp.e eVar = this.f14393y;
                GLES20.glUniform1i(GLES20.glGetUniformLocation(eVar.f10987d, E[i7]), i7);
                GLES20.glActiveTexture(33984 + i7);
                je.b.d(3553, iArr[i7]);
            }
            je.b.h();
        } catch (je.h e10) {
            Log.e("VideoDecoderGLSV", "Failed to set up the textures", e10);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        if (this.f14392x.getAndSet(null) != null) {
            throw new ClassCastException();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i7, int i10) {
        GLES20.glViewport(0, 0, i7, i10);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int[] iArr = this.f14389i;
        try {
            hp.e eVar = new hp.e("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f14393y = eVar;
            GLES20.glVertexAttribPointer(eVar.g("in_pos"), 2, 5126, false, 0, (Buffer) F);
            iArr[0] = this.f14393y.g("in_tc_y");
            iArr[1] = this.f14393y.g("in_tc_u");
            iArr[2] = this.f14393y.g("in_tc_v");
            GLES20.glGetUniformLocation(this.f14393y.f10987d, "mColorConversion");
            je.b.h();
            a();
            je.b.h();
        } catch (je.h e10) {
            Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e10);
        }
    }
}
