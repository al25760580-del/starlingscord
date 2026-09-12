package o4;

import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class h implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t4.b f17130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f17132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f17133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f17134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f17135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f17136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f17137h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f17138i = Float.NaN;
    public float j = Float.NaN;
    public int k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float[] f17139l = new float[9];

    public h(a aVar, t4.b bVar, e9.b bVar2) {
        this.f17131b = aVar;
        this.f17130a = bVar;
        e eVarL0 = ((r4.a) bVar2.f8109d).l0();
        this.f17132c = (f) eVarL0;
        eVarL0.a(this);
        bVar.e(eVarL0);
        i iVarL0 = ((r4.b) bVar2.f8110e).l0();
        this.f17133d = iVarL0;
        iVarL0.a(this);
        bVar.e(iVarL0);
        i iVarL1 = ((r4.b) bVar2.f8111i).l0();
        this.f17134e = iVarL1;
        iVarL1.a(this);
        bVar.e(iVarL1);
        i iVarL2 = ((r4.b) bVar2.f8112v).l0();
        this.f17135f = iVarL2;
        iVarL2.a(this);
        bVar.e(iVarL2);
        i iVarL3 = ((r4.b) bVar2.f8113w).l0();
        this.f17136g = iVarL3;
        iVarL3.a(this);
        bVar.e(iVarL3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o4.a] */
    @Override // o4.a
    public final void a() {
        this.f17131b.a();
    }

    public final void b(m4.a aVar, Matrix matrix, int i7) {
        float fK = this.f17134e.k() * 0.017453292f;
        float fFloatValue = ((Float) this.f17135f.e()).floatValue();
        double d6 = fK;
        float fSin = ((float) Math.sin(d6)) * fFloatValue;
        float fCos = ((float) Math.cos(d6 + 3.141592653589793d)) * fFloatValue;
        Matrix matrixE = this.f17130a.f20613w.e();
        float[] fArr = this.f17139l;
        matrixE.getValues(fArr);
        float f2 = fArr[0];
        float f7 = fArr[4];
        matrix.getValues(fArr);
        float f10 = fArr[0] / f2;
        float f11 = fSin * f10;
        float f12 = fCos * (fArr[4] / f7);
        int iIntValue = ((Integer) this.f17132c.e()).intValue();
        int iArgb = Color.argb(Math.round((((Float) this.f17133d.e()).floatValue() * i7) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        float fMax = Math.max(((Float) this.f17136g.e()).floatValue() * f10 * 0.33f, Float.MIN_VALUE);
        if (this.f17137h == fMax && this.f17138i == f11 && this.j == f12 && this.k == iArgb) {
            return;
        }
        this.f17137h = fMax;
        this.f17138i = f11;
        this.j = f12;
        this.k = iArgb;
        aVar.setShadowLayer(fMax, f11, f12, iArgb);
    }

    public final void c(e4.c cVar) {
        this.f17133d.j(new g(cVar));
    }
}
