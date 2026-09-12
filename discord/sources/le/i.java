package le;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import com.google.android.exoplayer2.Format;
import com.google.android.gms.internal.play_billing.v1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import je.e0;
import je.w;
import ke.o;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements o, a {
    public int F;
    public SurfaceTexture G;
    public byte[] J;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f15043d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f15044e = new AtomicBoolean(true);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f15045i = new g();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a3.f f15046v = new a3.f(8, false);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v1 f15047w = new v1();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final v1 f15048x = new v1();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float[] f15049y = new float[16];
    public final float[] E = new float[16];
    public volatile int H = 0;
    public int I = -1;

    @Override // le.a
    public final void a(long j, float[] fArr) {
        ((v1) this.f15046v.f70d).a(j, fArr);
    }

    @Override // le.a
    public final void b() {
        this.f15047w.b();
        a3.f fVar = this.f15046v;
        ((v1) fVar.f70d).b();
        fVar.f67a = false;
        this.f15044e.set(true);
    }

    public final SurfaceTexture c() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            je.b.h();
            this.f15045i.a();
            je.b.h();
            je.b.i("No current context", !e0.a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT));
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            je.b.h();
            int i7 = iArr[0];
            je.b.d(36197, i7);
            this.F = i7;
        } catch (je.h e10) {
            je.b.s("SceneRenderer", "Failed to initialize the renderer", e10);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.F);
        this.G = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: le.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f15042d.f15043d.set(true);
            }
        });
        return this.G;
    }

    @Override // ke.o
    public final void d(long j, long j5, Format format, MediaFormat mediaFormat) {
        int i7;
        ArrayList arrayListY;
        this.f15047w.a(j5, Long.valueOf(j));
        byte[] bArr = format.S;
        int i10 = format.T;
        byte[] bArr2 = this.J;
        int i11 = this.I;
        this.J = bArr;
        if (i10 == -1) {
            i10 = this.H;
        }
        this.I = i10;
        if (i11 == i10 && Arrays.equals(bArr2, this.J)) {
            return;
        }
        byte[] bArr3 = this.J;
        f fVar = null;
        if (bArr3 != null) {
            int i12 = this.I;
            w wVar = new w(bArr3);
            try {
                wVar.G(4);
                int iG = wVar.g();
                wVar.F(0);
                if (iG == 1886547818) {
                    wVar.G(8);
                    int i13 = wVar.f13861b;
                    int i14 = wVar.f13862c;
                    while (true) {
                        if (i13 < i14) {
                            int iG2 = wVar.g() + i13;
                            if (iG2 > i13 && iG2 <= i14) {
                                int iG3 = wVar.g();
                                if (iG3 != 2037673328 && iG3 != 1836279920) {
                                    wVar.F(iG2);
                                    i13 = iG2;
                                }
                                wVar.E(iG2);
                                arrayListY = yk.a.y(wVar);
                            }
                        }
                        arrayListY = null;
                    }
                } else {
                    arrayListY = yk.a.y(wVar);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (arrayListY != null) {
                int size = arrayListY.size();
                if (size == 1) {
                    e eVar = (e) arrayListY.get(0);
                    fVar = new f(eVar, eVar, i12);
                } else if (size == 2) {
                    fVar = new f((e) arrayListY.get(0), (e) arrayListY.get(1), i12);
                }
            }
        }
        if (fVar == null || !g.b(fVar)) {
            int i15 = this.I;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f2 = radians / 36;
            float f7 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 36; i16 < i19; i19 = 36) {
                float f10 = radians / 2.0f;
                float f11 = (i16 * f2) - f10;
                int i20 = i16 + 1;
                float f12 = (i20 * f2) - f10;
                int i21 = 0;
                while (i21 < 73) {
                    int i22 = i20;
                    float f13 = f12;
                    float f14 = radians;
                    int i23 = i17;
                    int i24 = i18;
                    int i25 = 0;
                    int i26 = 2;
                    while (i25 < i26) {
                        float f15 = i25 == 0 ? f11 : f13;
                        float f16 = radians2;
                        float f17 = i21 * f7;
                        float f18 = f11;
                        float f19 = f2;
                        double d6 = 50.0f;
                        double d7 = (f17 + 3.1415927f) - (f16 / 2.0f);
                        double d8 = f15;
                        fArr[i23] = -((float) (Math.cos(d8) * Math.sin(d7) * d6));
                        fArr[i23 + 1] = (float) (Math.sin(d8) * d6);
                        int i27 = i23 + 3;
                        fArr[i23 + 2] = (float) (Math.cos(d8) * Math.cos(d7) * d6);
                        fArr2[i24] = f17 / f16;
                        int i28 = i24 + 2;
                        fArr2[i24 + 1] = ((i16 + i25) * f19) / f14;
                        if ((i21 == 0 && i25 == 0) || (i21 == 72 && i25 == 1)) {
                            System.arraycopy(fArr, i23, fArr, i27, 3);
                            i23 += 6;
                            i7 = 2;
                            System.arraycopy(fArr2, i24, fArr2, i28, 2);
                            i24 += 4;
                        } else {
                            i7 = 2;
                            i23 = i27;
                            i24 = i28;
                        }
                        i25++;
                        i26 = i7;
                        radians2 = f16;
                        f11 = f18;
                        f2 = f19;
                    }
                    i21++;
                    i17 = i23;
                    i18 = i24;
                    i20 = i22;
                    f12 = f13;
                    radians = f14;
                    radians2 = radians2;
                    f2 = f2;
                }
                i16 = i20;
            }
            e eVar2 = new e(new v1(fArr, fArr2, 0, 1));
            fVar = new f(eVar2, eVar2, i15);
        }
        this.f15048x.a(j5, fVar);
    }
}
