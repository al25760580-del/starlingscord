package p0;

import java.util.Arrays;
import n8.f;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f17725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f17726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17724a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17727d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f17728e = new int[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f17729f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f17730g = new float[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17731h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17732i = -1;
    public boolean j = false;

    public a(b bVar, f fVar) {
        this.f17725b = bVar;
        this.f17726c = fVar;
    }

    public final void a(e eVar, float f2, boolean z5) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i7 = this.f17731h;
            b bVar = this.f17725b;
            if (i7 == -1) {
                this.f17731h = 0;
                this.f17730g[0] = f2;
                this.f17728e[0] = eVar.f17759e;
                this.f17729f[0] = -1;
                eVar.H++;
                eVar.a(bVar);
                this.f17724a++;
                if (this.j) {
                    return;
                }
                int i10 = this.f17732i + 1;
                this.f17732i = i10;
                int[] iArr = this.f17728e;
                if (i10 >= iArr.length) {
                    this.j = true;
                    this.f17732i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i11 = -1;
            for (int i12 = 0; i7 != -1 && i12 < this.f17724a; i12++) {
                int i13 = this.f17728e[i7];
                int i14 = eVar.f17759e;
                if (i13 == i14) {
                    float[] fArr = this.f17730g;
                    float f7 = fArr[i7] + f2;
                    if (f7 > -0.001f && f7 < 0.001f) {
                        f7 = 0.0f;
                    }
                    fArr[i7] = f7;
                    if (f7 == 0.0f) {
                        if (i7 == this.f17731h) {
                            this.f17731h = this.f17729f[i7];
                        } else {
                            int[] iArr2 = this.f17729f;
                            iArr2[i11] = iArr2[i7];
                        }
                        if (z5) {
                            eVar.b(bVar);
                        }
                        if (this.j) {
                            this.f17732i = i7;
                        }
                        eVar.H--;
                        this.f17724a--;
                        return;
                    }
                    return;
                }
                if (i13 < i14) {
                    i11 = i7;
                }
                i7 = this.f17729f[i7];
            }
            int length = this.f17732i;
            int i15 = length + 1;
            if (this.j) {
                int[] iArr3 = this.f17728e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i15;
            }
            int[] iArr4 = this.f17728e;
            if (length >= iArr4.length && this.f17724a < iArr4.length) {
                int i16 = 0;
                while (true) {
                    int[] iArr5 = this.f17728e;
                    if (i16 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i16] == -1) {
                        length = i16;
                        break;
                    }
                    i16++;
                }
            }
            int[] iArr6 = this.f17728e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i17 = this.f17727d * 2;
                this.f17727d = i17;
                this.j = false;
                this.f17732i = length - 1;
                this.f17730g = Arrays.copyOf(this.f17730g, i17);
                this.f17728e = Arrays.copyOf(this.f17728e, this.f17727d);
                this.f17729f = Arrays.copyOf(this.f17729f, this.f17727d);
            }
            this.f17728e[length] = eVar.f17759e;
            this.f17730g[length] = f2;
            if (i11 != -1) {
                int[] iArr7 = this.f17729f;
                iArr7[length] = iArr7[i11];
                iArr7[i11] = length;
            } else {
                this.f17729f[length] = this.f17731h;
                this.f17731h = length;
            }
            eVar.H++;
            eVar.a(bVar);
            this.f17724a++;
            if (!this.j) {
                this.f17732i++;
            }
            int i18 = this.f17732i;
            int[] iArr8 = this.f17728e;
            if (i18 >= iArr8.length) {
                this.j = true;
                this.f17732i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i7 = this.f17731h;
        for (int i10 = 0; i7 != -1 && i10 < this.f17724a; i10++) {
            e eVar = ((e[]) this.f17726c.f16511i)[this.f17728e[i7]];
            if (eVar != null) {
                eVar.b(this.f17725b);
            }
            i7 = this.f17729f[i7];
        }
        this.f17731h = -1;
        this.f17732i = -1;
        this.j = false;
        this.f17724a = 0;
    }

    public final float c(e eVar) {
        int i7 = this.f17731h;
        for (int i10 = 0; i7 != -1 && i10 < this.f17724a; i10++) {
            if (this.f17728e[i7] == eVar.f17759e) {
                return this.f17730g[i7];
            }
            i7 = this.f17729f[i7];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f17724a;
    }

    public final e e(int i7) {
        int i10 = this.f17731h;
        for (int i11 = 0; i10 != -1 && i11 < this.f17724a; i11++) {
            if (i11 == i7) {
                return ((e[]) this.f17726c.f16511i)[this.f17728e[i10]];
            }
            i10 = this.f17729f[i10];
        }
        return null;
    }

    public final float f(int i7) {
        int i10 = this.f17731h;
        for (int i11 = 0; i10 != -1 && i11 < this.f17724a; i11++) {
            if (i11 == i7) {
                return this.f17730g[i10];
            }
            i10 = this.f17729f[i10];
        }
        return 0.0f;
    }

    public final void g(e eVar, float f2) {
        if (f2 == 0.0f) {
            h(eVar, true);
            return;
        }
        int i7 = this.f17731h;
        b bVar = this.f17725b;
        if (i7 == -1) {
            this.f17731h = 0;
            this.f17730g[0] = f2;
            this.f17728e[0] = eVar.f17759e;
            this.f17729f[0] = -1;
            eVar.H++;
            eVar.a(bVar);
            this.f17724a++;
            if (this.j) {
                return;
            }
            int i10 = this.f17732i + 1;
            this.f17732i = i10;
            int[] iArr = this.f17728e;
            if (i10 >= iArr.length) {
                this.j = true;
                this.f17732i = iArr.length - 1;
                return;
            }
            return;
        }
        int i11 = -1;
        for (int i12 = 0; i7 != -1 && i12 < this.f17724a; i12++) {
            int i13 = this.f17728e[i7];
            int i14 = eVar.f17759e;
            if (i13 == i14) {
                this.f17730g[i7] = f2;
                return;
            }
            if (i13 < i14) {
                i11 = i7;
            }
            i7 = this.f17729f[i7];
        }
        int length = this.f17732i;
        int i15 = length + 1;
        if (this.j) {
            int[] iArr2 = this.f17728e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i15;
        }
        int[] iArr3 = this.f17728e;
        if (length >= iArr3.length && this.f17724a < iArr3.length) {
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f17728e;
                if (i16 >= iArr4.length) {
                    break;
                }
                if (iArr4[i16] == -1) {
                    length = i16;
                    break;
                }
                i16++;
            }
        }
        int[] iArr5 = this.f17728e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i17 = this.f17727d * 2;
            this.f17727d = i17;
            this.j = false;
            this.f17732i = length - 1;
            this.f17730g = Arrays.copyOf(this.f17730g, i17);
            this.f17728e = Arrays.copyOf(this.f17728e, this.f17727d);
            this.f17729f = Arrays.copyOf(this.f17729f, this.f17727d);
        }
        this.f17728e[length] = eVar.f17759e;
        this.f17730g[length] = f2;
        if (i11 != -1) {
            int[] iArr6 = this.f17729f;
            iArr6[length] = iArr6[i11];
            iArr6[i11] = length;
        } else {
            this.f17729f[length] = this.f17731h;
            this.f17731h = length;
        }
        eVar.H++;
        eVar.a(bVar);
        int i18 = this.f17724a + 1;
        this.f17724a = i18;
        if (!this.j) {
            this.f17732i++;
        }
        int[] iArr7 = this.f17728e;
        if (i18 >= iArr7.length) {
            this.j = true;
        }
        if (this.f17732i >= iArr7.length) {
            this.j = true;
            this.f17732i = iArr7.length - 1;
        }
    }

    public final float h(e eVar, boolean z5) {
        int i7 = this.f17731h;
        if (i7 == -1) {
            return 0.0f;
        }
        int i10 = 0;
        int i11 = -1;
        while (i7 != -1 && i10 < this.f17724a) {
            if (this.f17728e[i7] == eVar.f17759e) {
                if (i7 == this.f17731h) {
                    this.f17731h = this.f17729f[i7];
                } else {
                    int[] iArr = this.f17729f;
                    iArr[i11] = iArr[i7];
                }
                if (z5) {
                    eVar.b(this.f17725b);
                }
                eVar.H--;
                this.f17724a--;
                this.f17728e[i7] = -1;
                if (this.j) {
                    this.f17732i = i7;
                }
                return this.f17730g[i7];
            }
            i10++;
            i11 = i7;
            i7 = this.f17729f[i7];
        }
        return 0.0f;
    }

    public final String toString() {
        int i7 = this.f17731h;
        String string = "";
        for (int i10 = 0; i7 != -1 && i10 < this.f17724a; i10++) {
            StringBuilder sbN = kk.b.n(kk.b.j(string, " -> "));
            sbN.append(this.f17730g[i7]);
            sbN.append(" : ");
            StringBuilder sbN2 = kk.b.n(sbN.toString());
            sbN2.append(((e[]) this.f17726c.f16511i)[this.f17728e[i7]]);
            string = sbN2.toString();
            i7 = this.f17729f[i7];
        }
        return string;
    }
}
