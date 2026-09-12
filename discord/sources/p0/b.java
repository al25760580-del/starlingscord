package p0;

import java.util.ArrayList;
import n8.f;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f17736d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f17733a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f17734b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f17735c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17737e = false;

    public b(f fVar) {
        this.f17736d = new a(this, fVar);
    }

    public final void a(c cVar, int i7) {
        this.f17736d.g(cVar.j(i7), 1.0f);
        this.f17736d.g(cVar.j(i7), -1.0f);
    }

    public final void b(e eVar, e eVar2, e eVar3, int i7) {
        boolean z5 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z5 = true;
            }
            this.f17734b = i7;
        }
        if (z5) {
            this.f17736d.g(eVar, 1.0f);
            this.f17736d.g(eVar2, -1.0f);
            this.f17736d.g(eVar3, -1.0f);
        } else {
            this.f17736d.g(eVar, -1.0f);
            this.f17736d.g(eVar2, 1.0f);
            this.f17736d.g(eVar3, 1.0f);
        }
    }

    public final void c(e eVar, e eVar2, e eVar3, int i7) {
        boolean z5 = false;
        if (i7 != 0) {
            if (i7 < 0) {
                i7 *= -1;
                z5 = true;
            }
            this.f17734b = i7;
        }
        if (z5) {
            this.f17736d.g(eVar, 1.0f);
            this.f17736d.g(eVar2, -1.0f);
            this.f17736d.g(eVar3, 1.0f);
        } else {
            this.f17736d.g(eVar, -1.0f);
            this.f17736d.g(eVar2, 1.0f);
            this.f17736d.g(eVar3, -1.0f);
        }
    }

    public e d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f17733a == null && this.f17734b == 0.0f && this.f17736d.d() == 0;
    }

    public final e f(boolean[] zArr, e eVar) {
        int i7;
        int iD = this.f17736d.d();
        e eVar2 = null;
        float f2 = 0.0f;
        for (int i10 = 0; i10 < iD; i10++) {
            float f7 = this.f17736d.f(i10);
            if (f7 < 0.0f) {
                e eVarE = this.f17736d.e(i10);
                if ((zArr == null || !zArr[eVarE.f17759e]) && eVarE != eVar && (((i7 = eVarE.I) == 3 || i7 == 4) && f7 < f2)) {
                    f2 = f7;
                    eVar2 = eVarE;
                }
            }
        }
        return eVar2;
    }

    public final void g(e eVar) {
        e eVar2 = this.f17733a;
        if (eVar2 != null) {
            this.f17736d.g(eVar2, -1.0f);
            this.f17733a.f17760i = -1;
            this.f17733a = null;
        }
        float fH = this.f17736d.h(eVar, true) * (-1.0f);
        this.f17733a = eVar;
        if (fH == 1.0f) {
            return;
        }
        this.f17734b /= fH;
        a aVar = this.f17736d;
        int i7 = aVar.f17731h;
        for (int i10 = 0; i7 != -1 && i10 < aVar.f17724a; i10++) {
            float[] fArr = aVar.f17730g;
            fArr[i7] = fArr[i7] / fH;
            i7 = aVar.f17729f[i7];
        }
    }

    public final void h(c cVar, e eVar, boolean z5) {
        if (eVar.f17763x) {
            float fC = this.f17736d.c(eVar);
            this.f17734b = (eVar.f17762w * fC) + this.f17734b;
            this.f17736d.h(eVar, z5);
            if (z5) {
                eVar.b(this);
            }
            if (this.f17736d.d() == 0) {
                this.f17737e = true;
                cVar.f17741a = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z5) {
        a aVar = this.f17736d;
        aVar.getClass();
        float fC = aVar.c(bVar.f17733a);
        aVar.h(bVar.f17733a, z5);
        a aVar2 = bVar.f17736d;
        int iD = aVar2.d();
        for (int i7 = 0; i7 < iD; i7++) {
            e eVarE = aVar2.e(i7);
            aVar.a(eVarE, aVar2.c(eVarE) * fC, z5);
        }
        this.f17734b = (bVar.f17734b * fC) + this.f17734b;
        if (z5) {
            bVar.f17733a.b(this);
        }
        if (this.f17733a == null || this.f17736d.d() != 0) {
            return;
        }
        this.f17737e = true;
        cVar.f17741a = true;
    }

    public String toString() {
        boolean z5;
        String strJ = kk.b.j(this.f17733a == null ? "0" : "" + this.f17733a, " = ");
        if (this.f17734b != 0.0f) {
            StringBuilder sbN = kk.b.n(strJ);
            sbN.append(this.f17734b);
            strJ = sbN.toString();
            z5 = true;
        } else {
            z5 = false;
        }
        int iD = this.f17736d.d();
        for (int i7 = 0; i7 < iD; i7++) {
            e eVarE = this.f17736d.e(i7);
            if (eVarE != null) {
                float f2 = this.f17736d.f(i7);
                if (f2 != 0.0f) {
                    String string = eVarE.toString();
                    if (z5) {
                        if (f2 > 0.0f) {
                            strJ = kk.b.j(strJ, " + ");
                        } else {
                            strJ = kk.b.j(strJ, " - ");
                            f2 *= -1.0f;
                        }
                    } else if (f2 < 0.0f) {
                        strJ = kk.b.j(strJ, "- ");
                        f2 *= -1.0f;
                    }
                    strJ = f2 == 1.0f ? kk.b.j(strJ, string) : strJ + f2 + " " + string;
                    z5 = true;
                }
            }
        }
        return !z5 ? kk.b.j(strJ, "0.0") : strJ;
    }
}
