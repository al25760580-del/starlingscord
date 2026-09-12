package vk;

import android.graphics.PointF;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import android.view.Surface;
import com.google.firebase.messaging.r;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.webrtc.EglBase;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f21719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f21720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f21721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f21722e = new float[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21723f;

    public d() {
        ArrayList arrayList = new ArrayList();
        this.f21721d = arrayList;
        this.f21718a = false;
        arrayList.add(new tk.a());
    }

    @Override // vk.e
    public final boolean a() {
        return this.f21718a;
    }

    @Override // vk.e
    public final void b(qk.a aVar, long j) {
        f fVar = this.f21719b;
        synchronized (fVar.f21727v) {
            while (!fVar.f21728w) {
                try {
                    fVar.f21727v.wait(10000L);
                    if (!fVar.f21728w) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e10) {
                    throw new RuntimeException(e10);
                }
            }
            fVar.f21728w = false;
        }
        ls.d.j("before updateTexImage");
        fVar.f21724d.updateTexImage();
        ArrayList<tk.a> arrayList = this.f21721d;
        if (!this.f21723f) {
            for (tk.a aVar2 : arrayList) {
                if (aVar2 instanceof tk.a) {
                    f fVar2 = this.f21719b;
                    int i7 = fVar2.f21726i;
                    float[] fArr = new float[16];
                    fVar2.f21724d.getTransformMatrix(fArr);
                    aVar2.j = i7;
                    aVar2.f20821c = fArr;
                }
            }
            this.f21723f = true;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        for (tk.a aVar3 : arrayList) {
            FloatBuffer floatBuffer = aVar3.f20822d;
            floatBuffer.position(0);
            GLES20.glVertexAttribPointer(aVar3.k, 3, 5126, false, 20, (Buffer) aVar3.f20822d);
            ls.d.j("glVertexAttribPointer maPosition");
            GLES20.glEnableVertexAttribArray(aVar3.k);
            ls.d.j("glEnableVertexAttribArray aPositionHandle");
            floatBuffer.position(3);
            GLES20.glVertexAttribPointer(aVar3.f20828l, 2, 5126, false, 20, (Buffer) aVar3.f20822d);
            ls.d.j("glVertexAttribPointer aTextureHandle");
            GLES20.glEnableVertexAttribArray(aVar3.f20828l);
            ls.d.j("glEnableVertexAttribArray aTextureHandle");
            ls.d.j("onDrawFrame start");
            GLES20.glUseProgram(aVar3.f20825g);
            ls.d.j("glUseProgram");
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, aVar3.j);
            GLES20.glUniformMatrix4fv(aVar3.f20826h, 1, false, aVar3.f20820b, 0);
            GLES20.glUniformMatrix4fv(aVar3.f20827i, 1, false, aVar3.f20821c, 0);
            GLES20.glDrawArrays(5, 0, 4);
            ls.d.j("glDrawArrays");
        }
        GLES20.glFinish();
        r rVar = this.f21720c;
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) rVar.f6610d, (EGLSurface) rVar.f6612i, j);
        r rVar2 = this.f21720c;
        EGL14.eglSwapBuffers((EGLDisplay) rVar2.f6610d, (EGLSurface) rVar2.f6612i);
    }

    @Override // vk.e
    public final void c(Surface surface, MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        float f2;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        if (surface == null) {
            throw new IllegalArgumentException("GlVideoRenderer requires an output surface");
        }
        if (mediaFormat2 == null) {
            throw new IllegalArgumentException("GlVideoRenderer requires target media format");
        }
        int integer = mediaFormat2.containsKey("rotation-degrees") ? mediaFormat2.getInteger("rotation-degrees") : (mediaFormat == null || !mediaFormat.containsKey("rotation-degrees")) ? 0 : mediaFormat.getInteger("rotation-degrees");
        float integer2 = (mediaFormat2.containsKey("width") && mediaFormat2.containsKey("height")) ? mediaFormat2.getInteger("width") / mediaFormat2.getInteger("height") : 1.0f;
        r rVar = new r();
        rVar.f6610d = EGL14.EGL_NO_DISPLAY;
        rVar.f6611e = EGL14.EGL_NO_CONTEXT;
        rVar.f6612i = EGL14.EGL_NO_SURFACE;
        rVar.f6613v = surface;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        rVar.f6610d = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            throw new RuntimeException("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            rVar.f6610d = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig((EGLDisplay) rVar.f6610d, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
        }
        rVar.f6611e = EGL14.eglCreateContext((EGLDisplay) rVar.f6610d, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        r.a("eglCreateContext");
        if (((EGLContext) rVar.f6611e) == null) {
            throw new RuntimeException("null context");
        }
        rVar.f6612i = EGL14.eglCreateWindowSurface((EGLDisplay) rVar.f6610d, eGLConfigArr[0], (Surface) rVar.f6613v, new int[]{12344}, 0);
        r.a("eglCreateWindowSurface");
        EGLSurface eGLSurface = (EGLSurface) rVar.f6612i;
        if (eGLSurface == null) {
            throw new RuntimeException("surface was null");
        }
        if (!EGL14.eglMakeCurrent((EGLDisplay) rVar.f6610d, eGLSurface, eGLSurface, (EGLContext) rVar.f6611e)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
        this.f21720c = rVar;
        int i7 = -1;
        this.f21719b = new f((mediaFormat == null || !mediaFormat.containsKey("width")) ? -1 : mediaFormat.getInteger("width"), (mediaFormat == null || !mediaFormat.containsKey("height")) ? -1 : mediaFormat.getInteger("height"));
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.orthoM(fArr, 0, -integer2, integer2, -1.0f, 1.0f, -1.0f, 1.0f);
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        if (integer == 0) {
            f2 = 0.0f;
            f7 = 1.0f;
        } else if (integer != 90) {
            float fCos = -1.0f;
            if (integer == 180) {
                f2 = 0.0f;
            } else if (integer != 270) {
                double d6 = ((double) (integer / 180)) * 3.141592653589793d;
                float fSin = (float) Math.sin(d6);
                fCos = (float) Math.cos(d6);
                f2 = fSin;
            } else {
                f7 = 0.0f;
                f2 = -1.0f;
            }
            f7 = fCos;
        } else {
            f7 = 0.0f;
            f2 = 1.0f;
        }
        Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, f2, f7, 0.0f);
        float[] fArr3 = this.f21722e;
        Matrix.setIdentityM(fArr3, 0);
        Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
        for (tk.a aVar : this.f21721d) {
            Matrix.setIdentityM(aVar.f20821c, 0);
            int iS = ls.d.s(35633, "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main()\n{\ngl_Position = uMVPMatrix * aPosition;\nvTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}");
            aVar.f20823e = iS;
            if (iS == 0) {
                throw new RuntimeException("failed loading vertex shader");
            }
            int iS2 = ls.d.s(35632, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main()\n{\ngl_FragColor = texture2D(sTexture, vTextureCoord);\n}");
            aVar.f20824f = iS2;
            if (iS2 == 0) {
                aVar.a();
                throw new RuntimeException("failed loading fragment shader");
            }
            int i10 = aVar.f20823e;
            int iGlCreateProgram = GLES20.glCreateProgram();
            ls.d.j("glCreateProgram");
            if (iGlCreateProgram == 0) {
                Log.e("d", "Could not create glProgram");
            }
            GLES20.glAttachShader(iGlCreateProgram, i10);
            ls.d.j("glAttachShader");
            GLES20.glAttachShader(iGlCreateProgram, iS2);
            ls.d.j("glAttachShader");
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr2 = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr2, 0);
            if (iArr2[0] != 1) {
                Log.e("d", "Could not link glProgram: ");
                Log.e("d", GLES20.glGetProgramInfoLog(iGlCreateProgram));
                GLES20.glDeleteProgram(iGlCreateProgram);
                iGlCreateProgram = 0;
            }
            aVar.f20825g = iGlCreateProgram;
            if (iGlCreateProgram == 0) {
                aVar.a();
                throw new RuntimeException("failed creating glProgram");
            }
            aVar.k = GLES20.glGetAttribLocation(iGlCreateProgram, "aPosition");
            ls.d.j("glGetAttribLocation aPosition");
            if (aVar.k == i7) {
                throw new RuntimeException("Could not get attrib location for aPosition");
            }
            aVar.f20828l = GLES20.glGetAttribLocation(aVar.f20825g, "aTextureCoord");
            ls.d.j("glGetAttribLocation aTextureCoord");
            if (aVar.f20828l == i7) {
                throw new RuntimeException("Could not get attrib location for aTextureCoord");
            }
            aVar.f20826h = GLES20.glGetUniformLocation(aVar.f20825g, "uMVPMatrix");
            ls.d.j("glGetUniformLocation uMVPMatrix");
            if (aVar.f20826h == i7) {
                throw new RuntimeException("Could not get attrib location for uMVPMatrix");
            }
            aVar.f20827i = GLES20.glGetUniformLocation(aVar.f20825g, "uSTMatrix");
            ls.d.j("glGetUniformLocation uSTMatrix");
            if (aVar.f20827i == i7) {
                throw new RuntimeException("Could not get attrib location for uSTMatrix");
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr3, fArr3.length);
            e4.c cVar = aVar.f20819a;
            float f14 = fArrCopyOf[0];
            boolean z5 = f14 == 0.0f;
            float fAbs = 1.0f / (z5 ? Math.abs(fArrCopyOf[4]) : Math.abs(f14));
            if (z5) {
                PointF pointF = (PointF) cVar.f7966e;
                f10 = pointF.x;
                f11 = pointF.y * fAbs;
            } else {
                PointF pointF2 = (PointF) cVar.f7966e;
                f10 = pointF2.x * fAbs;
                f11 = pointF2.y;
            }
            if (z5) {
                PointF pointF3 = (PointF) cVar.f7967i;
                f13 = (pointF3.x * 2.0f) - 1.0f;
                f12 = (1.0f - (pointF3.y * 2.0f)) * fAbs;
            } else {
                PointF pointF4 = (PointF) cVar.f7967i;
                float f15 = fAbs * ((pointF4.x * 2.0f) - 1.0f);
                f12 = 1.0f - (pointF4.y * 2.0f);
                f13 = f15;
            }
            float[] fArr4 = new float[16];
            Matrix.setIdentityM(fArr4, 0);
            Matrix.translateM(fArr4, 0, f13, f12, 0.0f);
            cVar.getClass();
            Matrix.rotateM(fArr4, 0, 0.0f, 0.0f, 0.0f, 1.0f);
            Matrix.scaleM(fArr4, 0, f10, f11, 1.0f);
            float[] fArr5 = new float[16];
            Matrix.multiplyMM(fArr5, 0, fArrCopyOf, 0, fArr4, 0);
            aVar.f20820b = fArr5;
            i7 = -1;
        }
    }

    @Override // vk.e
    public final void release() {
        Iterator it = this.f21721d.iterator();
        while (it.hasNext()) {
            ((tk.a) it.next()).a();
        }
        f fVar = this.f21719b;
        Surface surface = fVar.f21725e;
        if (surface != null) {
            surface.release();
            fVar.f21725e = null;
        }
        r rVar = this.f21720c;
        EGLDisplay eGLDisplay = (EGLDisplay) rVar.f6610d;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglDestroySurface(eGLDisplay, (EGLSurface) rVar.f6612i);
            EGL14.eglDestroyContext((EGLDisplay) rVar.f6610d, (EGLContext) rVar.f6611e);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) rVar.f6610d);
            rVar.f6610d = EGL14.EGL_NO_DISPLAY;
            rVar.f6611e = EGL14.EGL_NO_CONTEXT;
            rVar.f6612i = EGL14.EGL_NO_SURFACE;
        }
        Surface surface2 = (Surface) rVar.f6613v;
        if (surface2 != null) {
            surface2.release();
            rVar.f6613v = null;
        }
    }

    @Override // vk.e
    public final void d(MediaFormat mediaFormat, MediaFormat mediaFormat2) {
    }
}
