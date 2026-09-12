package p0;

import ag.t;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e[] f17754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e[] f17755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public io.sentry.internal.debugmeta.c f17757i;

    @Override // p0.b
    public final e d(boolean[] zArr) {
        int i7 = -1;
        for (int i10 = 0; i10 < this.f17756h; i10++) {
            e[] eVarArr = this.f17754f;
            e eVar = eVarArr[i10];
            if (!zArr[eVar.f17759e]) {
                io.sentry.internal.debugmeta.c cVar = this.f17757i;
                cVar.f12759e = eVar;
                int i11 = 8;
                if (i7 != -1) {
                    e eVar2 = eVarArr[i7];
                    while (i11 >= 0) {
                        float f2 = eVar2.E[i11];
                        float f7 = ((e) cVar.f12759e).E[i11];
                        if (f7 != f2) {
                            if (f7 >= f2) {
                                break;
                            }
                            i7 = i10;
                            break;
                            break;
                        }
                        i11--;
                    }
                } else {
                    while (i11 >= 0) {
                        float f10 = ((e) cVar.f12759e).E[i11];
                        if (f10 > 0.0f) {
                            break;
                        }
                        if (f10 < 0.0f) {
                            i7 = i10;
                            break;
                        }
                        i11--;
                    }
                }
            }
        }
        if (i7 == -1) {
            return null;
        }
        return this.f17754f[i7];
    }

    @Override // p0.b
    public final boolean e() {
        return this.f17756h == 0;
    }

    @Override // p0.b
    public final void i(c cVar, b bVar, boolean z5) {
        e eVar = bVar.f17733a;
        if (eVar == null) {
            return;
        }
        float[] fArr = eVar.E;
        a aVar = bVar.f17736d;
        int iD = aVar.d();
        for (int i7 = 0; i7 < iD; i7++) {
            e eVarE = aVar.e(i7);
            float f2 = aVar.f(i7);
            io.sentry.internal.debugmeta.c cVar2 = this.f17757i;
            cVar2.f12759e = eVarE;
            if (eVarE.f17758d) {
                boolean z6 = true;
                for (int i10 = 0; i10 < 9; i10++) {
                    float[] fArr2 = ((e) cVar2.f12759e).E;
                    float f7 = (fArr[i10] * f2) + fArr2[i10];
                    fArr2[i10] = f7;
                    if (Math.abs(f7) < 1.0E-4f) {
                        ((e) cVar2.f12759e).E[i10] = 0.0f;
                    } else {
                        z6 = false;
                    }
                }
                if (z6) {
                    ((d) cVar2.f12760i).k((e) cVar2.f12759e);
                }
            } else {
                for (int i11 = 0; i11 < 9; i11++) {
                    float f10 = fArr[i11];
                    if (f10 != 0.0f) {
                        float f11 = f10 * f2;
                        if (Math.abs(f11) < 1.0E-4f) {
                            f11 = 0.0f;
                        }
                        ((e) cVar2.f12759e).E[i11] = f11;
                    } else {
                        ((e) cVar2.f12759e).E[i11] = 0.0f;
                    }
                }
                j(eVarE);
            }
            this.f17734b = (bVar.f17734b * f2) + this.f17734b;
        }
        k(eVar);
    }

    public final void j(e eVar) {
        int i7;
        int i10 = this.f17756h + 1;
        e[] eVarArr = this.f17754f;
        if (i10 > eVarArr.length) {
            e[] eVarArr2 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
            this.f17754f = eVarArr2;
            this.f17755g = (e[]) Arrays.copyOf(eVarArr2, eVarArr2.length * 2);
        }
        e[] eVarArr3 = this.f17754f;
        int i11 = this.f17756h;
        eVarArr3[i11] = eVar;
        int i12 = i11 + 1;
        this.f17756h = i12;
        if (i12 > 1 && eVarArr3[i11].f17759e > eVar.f17759e) {
            int i13 = 0;
            while (true) {
                i7 = this.f17756h;
                if (i13 >= i7) {
                    break;
                }
                this.f17755g[i13] = this.f17754f[i13];
                i13++;
            }
            Arrays.sort(this.f17755g, 0, i7, new t(9));
            for (int i14 = 0; i14 < this.f17756h; i14++) {
                this.f17754f[i14] = this.f17755g[i14];
            }
        }
        eVar.f17758d = true;
        eVar.a(this);
    }

    public final void k(e eVar) {
        int i7 = 0;
        while (i7 < this.f17756h) {
            if (this.f17754f[i7] == eVar) {
                while (true) {
                    int i10 = this.f17756h;
                    if (i7 >= i10 - 1) {
                        this.f17756h = i10 - 1;
                        eVar.f17758d = false;
                        return;
                    } else {
                        e[] eVarArr = this.f17754f;
                        int i11 = i7 + 1;
                        eVarArr[i7] = eVarArr[i11];
                        i7 = i11;
                    }
                }
            } else {
                i7++;
            }
        }
    }

    @Override // p0.b
    public final String toString() {
        io.sentry.internal.debugmeta.c cVar = this.f17757i;
        String str = " goal -> (" + this.f17734b + ") : ";
        for (int i7 = 0; i7 < this.f17756h; i7++) {
            cVar.f12759e = this.f17754f[i7];
            str = str + cVar + " ";
        }
        return str;
    }
}
