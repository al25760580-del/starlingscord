package le;

import android.opengl.GLES20;
import android.util.Log;
import com.google.android.gms.internal.play_billing.v1;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float[] f15033i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v1 f15035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hp.e f15036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15041h;

    public static boolean b(f fVar) {
        e eVar = fVar.f15029a;
        e eVar2 = fVar.f15030b;
        v1[] v1VarArr = eVar.f15028a;
        if (v1VarArr.length == 1 && v1VarArr[0].f6154d == 0) {
            v1[] v1VarArr2 = eVar2.f15028a;
            if (v1VarArr2.length == 1 && v1VarArr2[0].f6154d == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        try {
            hp.e eVar = new hp.e("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f15036c = eVar;
            this.f15037d = GLES20.glGetUniformLocation(eVar.f10987d, "uMvpMatrix");
            this.f15038e = GLES20.glGetUniformLocation(this.f15036c.f10987d, "uTexMatrix");
            this.f15039f = this.f15036c.g("aPosition");
            this.f15040g = this.f15036c.g("aTexCoords");
            this.f15041h = GLES20.glGetUniformLocation(this.f15036c.f10987d, "uTexture");
        } catch (je.h e10) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e10);
        }
    }
}
