package n3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Matrix f16329p = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f16330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f16331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f16332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f16333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Paint f16334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PathMeasure f16335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f16336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f16337h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f16338i;
    public float j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f16339l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f16340m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f16341n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s.e f16342o;

    public m() {
        this.f16332c = new Matrix();
        this.f16337h = 0.0f;
        this.f16338i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.f16339l = 255;
        this.f16340m = null;
        this.f16341n = null;
        this.f16342o = new s.e(0);
        this.f16336g = new j();
        this.f16330a = new Path();
        this.f16331b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(j jVar, Matrix matrix, Canvas canvas, int i7, int i10) {
        int i11;
        float f2;
        int i12;
        Matrix matrix2 = jVar.f16317a;
        ArrayList arrayList = jVar.f16318b;
        matrix2.set(matrix);
        Matrix matrix3 = jVar.f16317a;
        matrix3.preConcat(jVar.j);
        canvas.save();
        char c8 = 0;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            k kVar = (k) arrayList.get(i13);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i7, i10);
            } else {
                if (kVar instanceof l) {
                    l lVar = (l) kVar;
                    float f7 = i7 / this.j;
                    float f10 = i10 / this.k;
                    float fMin = Math.min(f7, f10);
                    Matrix matrix4 = this.f16332c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f7, f10);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c8], fArr[1]);
                    boolean z5 = c8;
                    i11 = i13;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f11 = (fArr[z5 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f11) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.f16330a;
                        path.reset();
                        b1.e[] eVarArr = lVar.f16326a;
                        if (eVarArr != null) {
                            e4.f.k0(eVarArr, path);
                        }
                        Path path2 = this.f16331b;
                        path2.reset();
                        if (lVar instanceof h) {
                            path2.setFillType(lVar.f16328c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            i iVar = (i) lVar;
                            float f12 = iVar.f16313i;
                            if (f12 != 0.0f || iVar.j != 1.0f) {
                                float f13 = iVar.k;
                                float f14 = (f12 + f13) % 1.0f;
                                float f15 = (iVar.j + f13) % 1.0f;
                                if (this.f16335f == null) {
                                    this.f16335f = new PathMeasure();
                                }
                                this.f16335f.setPath(path, z5);
                                float length = this.f16335f.getLength();
                                float f16 = f14 * length;
                                float f17 = f15 * length;
                                path.reset();
                                if (f16 > f17) {
                                    this.f16335f.getSegment(f16, length, path, true);
                                    f2 = 0.0f;
                                    this.f16335f.getSegment(0.0f, f17, path, true);
                                } else {
                                    f2 = 0.0f;
                                    this.f16335f.getSegment(f16, f17, path, true);
                                }
                                path.rLineTo(f2, f2);
                            }
                            path2.addPath(path, matrix4);
                            a1.d dVar = iVar.f16310f;
                            float f18 = 255.0f;
                            if (((Shader) dVar.f18i) == null && dVar.f17e == 0) {
                                f18 = 255.0f;
                                i12 = 16777215;
                            } else {
                                if (this.f16334e == null) {
                                    i12 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.f16334e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i12 = 16777215;
                                }
                                Paint paint2 = this.f16334e;
                                Shader shader = (Shader) dVar.f18i;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(iVar.f16312h * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i14 = dVar.f17e;
                                    float f19 = iVar.f16312h;
                                    PorterDuff.Mode mode = p.G;
                                    paint2.setColor((i14 & i12) | (((int) (Color.alpha(i14) * f19)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(iVar.f16328c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            a1.d dVar2 = iVar.f16308d;
                            if (((Shader) dVar2.f18i) != null || dVar2.f17e != 0) {
                                if (this.f16333d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f16333d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f16333d;
                                Paint.Join join = iVar.f16315m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = iVar.f16314l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(iVar.f16316n);
                                Shader shader2 = (Shader) dVar2.f18i;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(iVar.f16311g * f18));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i15 = dVar2.f17e;
                                    float f20 = iVar.f16311g;
                                    PorterDuff.Mode mode2 = p.G;
                                    paint4.setColor((i15 & i12) | (((int) (Color.alpha(i15) * f20)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(iVar.f16309e * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i13 = i11 + 1;
                c8 = 0;
            }
            i11 = i13;
            i13 = i11 + 1;
            c8 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f16339l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i7) {
        this.f16339l = i7;
    }

    public m(m mVar) {
        this.f16332c = new Matrix();
        this.f16337h = 0.0f;
        this.f16338i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.f16339l = 255;
        this.f16340m = null;
        this.f16341n = null;
        s.e eVar = new s.e(0);
        this.f16342o = eVar;
        this.f16336g = new j(mVar.f16336g, eVar);
        this.f16330a = new Path(mVar.f16330a);
        this.f16331b = new Path(mVar.f16331b);
        this.f16337h = mVar.f16337h;
        this.f16338i = mVar.f16338i;
        this.j = mVar.j;
        this.k = mVar.k;
        this.f16339l = mVar.f16339l;
        this.f16340m = mVar.f16340m;
        String str = mVar.f16340m;
        if (str != null) {
            eVar.put(str, this);
        }
        this.f16341n = mVar.f16341n;
    }
}
