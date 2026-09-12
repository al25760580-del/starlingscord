package le;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.Log;
import com.google.android.gms.internal.play_billing.v1;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements GLSurfaceView.Renderer, c {
    public float E;
    public final /* synthetic */ k H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f15050d;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float[] f15053v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float[] f15054w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float[] f15055x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f15056y;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f15051e = new float[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f15052i = new float[16];
    public final float[] F = new float[16];
    public final float[] G = new float[16];

    public j(k kVar, i iVar) {
        this.H = kVar;
        float[] fArr = new float[16];
        this.f15053v = fArr;
        float[] fArr2 = new float[16];
        this.f15054w = fArr2;
        float[] fArr3 = new float[16];
        this.f15055x = fArr3;
        this.f15050d = iVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.E = 3.1415927f;
    }

    @Override // le.c
    public final synchronized void a(float f2, float[] fArr) {
        float[] fArr2 = this.f15053v;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f7 = -f2;
        this.E = f7;
        Matrix.setRotateM(this.f15054w, 0, -this.f15056y, (float) Math.cos(f7), (float) Math.sin(this.E), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        float[] fArr;
        Object objN;
        Object objN2;
        Object objN3;
        synchronized (this) {
            Matrix.multiplyMM(this.G, 0, this.f15053v, 0, this.f15055x, 0);
            Matrix.multiplyMM(this.F, 0, this.f15054w, 0, this.G, 0);
        }
        Matrix.multiplyMM(this.f15052i, 0, this.f15051e, 0, this.F, 0);
        i iVar = this.f15050d;
        float[] fArr2 = this.f15052i;
        GLES20.glClear(16384);
        try {
            je.b.h();
        } catch (je.h e10) {
            je.b.s("SceneRenderer", "Failed to draw a frame", e10);
        }
        if (iVar.f15043d.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = iVar.G;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                je.b.h();
            } catch (je.h e11) {
                je.b.s("SceneRenderer", "Failed to draw a frame", e11);
            }
            if (iVar.f15044e.compareAndSet(true, false)) {
                Matrix.setIdentityM(iVar.f15049y, 0);
            }
            long timestamp = iVar.G.getTimestamp();
            v1 v1Var = iVar.f15047w;
            synchronized (v1Var) {
                objN = v1Var.n(timestamp, false);
            }
            Long l6 = (Long) objN;
            if (l6 != null) {
                a3.f fVar = iVar.f15046v;
                float[] fArr3 = iVar.f15049y;
                long jLongValue = l6.longValue();
                v1 v1Var2 = (v1) fVar.f70d;
                synchronized (v1Var2) {
                    objN3 = v1Var2.n(jLongValue, true);
                }
                float[] fArr4 = (float[]) objN3;
                if (fArr4 != null) {
                    float[] fArr5 = (float[]) fVar.f69c;
                    float f2 = fArr4[0];
                    float f7 = -fArr4[1];
                    float f10 = -fArr4[2];
                    float length = Matrix.length(f2, f7, f10);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f2 / length, f7 / length, f10 / length);
                    } else {
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!fVar.f67a) {
                        a3.f.e((float[]) fVar.f68b, (float[]) fVar.f69c);
                        fVar.f67a = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) fVar.f68b, 0, (float[]) fVar.f69c, 0);
                }
            }
            v1 v1Var3 = iVar.f15048x;
            synchronized (v1Var3) {
                objN2 = v1Var3.n(timestamp, true);
            }
            f fVar2 = (f) objN2;
            if (fVar2 != null) {
                g gVar = iVar.f15045i;
                gVar.getClass();
                if (g.b(fVar2)) {
                    gVar.f15034a = fVar2.f15031c;
                    v1 v1Var4 = fVar2.f15029a.f15028a[0];
                    v1 v1Var5 = new v1();
                    float[] fArr6 = (float[]) v1Var4.f6156i;
                    v1Var5.f6154d = fArr6.length / 3;
                    v1Var5.f6156i = je.b.p(fArr6);
                    v1Var5.f6157v = je.b.p((float[]) v1Var4.f6157v);
                    int i7 = v1Var4.f6155e;
                    if (i7 == 1) {
                        v1Var5.f6155e = 5;
                    } else if (i7 != 2) {
                        v1Var5.f6155e = 4;
                    } else {
                        v1Var5.f6155e = 6;
                    }
                    gVar.f15035b = v1Var5;
                    if (!fVar2.f15032d) {
                        v1 v1Var6 = fVar2.f15030b.f15028a[0];
                        float[] fArr7 = (float[]) v1Var6.f6156i;
                        int length2 = fArr7.length;
                        je.b.p(fArr7);
                        je.b.p((float[]) v1Var6.f6157v);
                    }
                }
            }
        }
        Matrix.multiplyMM(iVar.E, 0, fArr2, 0, iVar.f15049y, 0);
        g gVar2 = iVar.f15045i;
        int i10 = iVar.F;
        float[] fArr8 = iVar.E;
        v1 v1Var7 = gVar2.f15035b;
        if (v1Var7 == null) {
            return;
        }
        int i11 = gVar2.f15034a;
        if (i11 == 1) {
            fArr = g.j;
        } else {
            fArr = i11 == 2 ? g.k : g.f15033i;
        }
        GLES20.glUniformMatrix3fv(gVar2.f15038e, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(gVar2.f15037d, 1, false, fArr8, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(gVar2.f15041h, 0);
        try {
            je.b.h();
        } catch (je.h e12) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e12);
        }
        GLES20.glVertexAttribPointer(gVar2.f15039f, 3, 5126, false, 12, (Buffer) v1Var7.f6156i);
        try {
            je.b.h();
        } catch (je.h e13) {
            Log.e("ProjectionRenderer", "Failed to load position data", e13);
        }
        GLES20.glVertexAttribPointer(gVar2.f15040g, 2, 5126, false, 8, (Buffer) v1Var7.f6157v);
        try {
            je.b.h();
        } catch (je.h e14) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e14);
        }
        GLES20.glDrawArrays(v1Var7.f6155e, 0, v1Var7.f6154d);
        try {
            je.b.h();
        } catch (je.h e15) {
            Log.e("ProjectionRenderer", "Failed to render", e15);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i7, int i10) {
        GLES20.glViewport(0, 0, i7, i10);
        float f2 = i7 / i10;
        Matrix.perspectiveM(this.f15051e, 0, f2 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f2))) * 2.0d) : 90.0f, f2, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        k kVar = this.H;
        kVar.f15061w.post(new io.sentry.react.d(6, kVar, this.f15050d.c()));
    }
}
