package ic;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f11584g;

    public n0(mj.b bVar, int i7, int i10, int i11) throws ij.h {
        this.f11584g = bVar;
        int i12 = bVar.f15840e;
        this.f11578a = i12;
        int i13 = bVar.f15839d;
        this.f11579b = i13;
        int i14 = i7 / 2;
        int i15 = i10 - i14;
        this.f11580c = i15;
        int i16 = i10 + i14;
        this.f11581d = i16;
        int i17 = i11 - i14;
        this.f11583f = i17;
        int i18 = i11 + i14;
        this.f11582e = i18;
        if (i17 < 0 || i15 < 0 || i18 >= i12 || i16 >= i13) {
            throw ij.h.f11808i;
        }
    }

    public boolean a(int i7, int i10, int i11, boolean z5) {
        mj.b bVar = (mj.b) this.f11584g;
        if (z5) {
            while (i7 <= i10) {
                if (bVar.b(i7, i11)) {
                    return true;
                }
                i7++;
            }
            return false;
        }
        while (i7 <= i10) {
            if (bVar.b(i11, i7)) {
                return true;
            }
            i7++;
        }
        return false;
    }

    public ij.m[] b() throws ij.h {
        int i7 = this.f11578a;
        int i10 = this.f11579b;
        int i11 = this.f11580c;
        int i12 = this.f11581d;
        int i13 = this.f11583f;
        int i14 = this.f11582e;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = true;
        while (z13) {
            boolean z14 = false;
            boolean zA = true;
            while (true) {
                if ((!zA && z6) || i12 >= i10) {
                    break;
                }
                zA = a(i13, i14, i12, false);
                if (zA) {
                    i12++;
                    z6 = true;
                    z14 = true;
                } else if (!z6) {
                    i12++;
                }
            }
            if (i12 < i10) {
                boolean zA2 = true;
                while (true) {
                    if ((!zA2 && z7) || i14 >= i7) {
                        break;
                    }
                    zA2 = a(i11, i12, i14, true);
                    if (zA2) {
                        i14++;
                        z7 = true;
                        z14 = true;
                    } else if (!z7) {
                        i14++;
                    }
                }
                if (i14 < i7) {
                    boolean zA3 = true;
                    while (true) {
                        if ((!zA3 && z10) || i11 < 0) {
                            break;
                        }
                        zA3 = a(i13, i14, i11, false);
                        if (zA3) {
                            i11--;
                            z10 = true;
                            z14 = true;
                        } else if (!z10) {
                            i11--;
                        }
                    }
                    if (i11 >= 0) {
                        z13 = z14;
                        boolean zA4 = true;
                        while (true) {
                            if ((!zA4 && z12) || i13 < 0) {
                                break;
                            }
                            zA4 = a(i11, i12, i13, true);
                            if (zA4) {
                                i13--;
                                z13 = true;
                                z12 = true;
                            } else if (!z12) {
                                i13--;
                            }
                        }
                        if (i13 >= 0) {
                            if (z13) {
                                z11 = true;
                            }
                        }
                    }
                }
            }
            z5 = true;
            break;
        }
        if (z5 || !z11) {
            throw ij.h.f11808i;
        }
        int i15 = i12 - i11;
        ij.m mVarC = null;
        ij.m mVarC2 = null;
        for (int i16 = 1; mVarC2 == null && i16 < i15; i16++) {
            mVarC2 = c(i11, i14 - i16, i11 + i16, i14);
        }
        if (mVarC2 == null) {
            throw ij.h.f11808i;
        }
        ij.m mVarC3 = null;
        for (int i17 = 1; mVarC3 == null && i17 < i15; i17++) {
            mVarC3 = c(i11, i13 + i17, i11 + i17, i13);
        }
        if (mVarC3 == null) {
            throw ij.h.f11808i;
        }
        ij.m mVarC4 = null;
        for (int i18 = 1; mVarC4 == null && i18 < i15; i18++) {
            mVarC4 = c(i12, i13 + i18, i12 - i18, i13);
        }
        if (mVarC4 == null) {
            throw ij.h.f11808i;
        }
        for (int i19 = 1; mVarC == null && i19 < i15; i19++) {
            mVarC = c(i12, i14 - i19, i12 - i19, i14);
        }
        if (mVarC == null) {
            throw ij.h.f11808i;
        }
        float f2 = mVarC.f11823a;
        float f7 = mVarC.f11824b;
        float f10 = mVarC2.f11823a;
        float f11 = mVarC2.f11824b;
        float f12 = mVarC4.f11823a;
        float f13 = mVarC4.f11824b;
        float f14 = mVarC3.f11823a;
        float f15 = mVarC3.f11824b;
        return f2 < ((float) i10) / 2.0f ? new ij.m[]{new ij.m(f14 - 1.0f, f15 + 1.0f), new ij.m(f10 + 1.0f, f11 + 1.0f), new ij.m(f12 - 1.0f, f13 - 1.0f), new ij.m(f2 + 1.0f, f7 - 1.0f)} : new ij.m[]{new ij.m(f14 + 1.0f, f15 + 1.0f), new ij.m(f10 + 1.0f, f11 - 1.0f), new ij.m(f12 - 1.0f, f13 + 1.0f), new ij.m(f2 - 1.0f, f7 - 1.0f)};
    }

    public ij.m c(float f2, float f7, float f10, float f11) {
        float f12 = f2 - f10;
        float f13 = f7 - f11;
        int iY = w3.q.y((float) Math.sqrt((f13 * f13) + (f12 * f12)));
        float f14 = iY;
        float f15 = (f10 - f2) / f14;
        float f16 = (f11 - f7) / f14;
        for (int i7 = 0; i7 < iY; i7++) {
            float f17 = i7;
            int iY2 = w3.q.y((f17 * f15) + f2);
            int iY3 = w3.q.y((f17 * f16) + f7);
            if (((mj.b) this.f11584g).b(iY2, iY3)) {
                return new ij.m(iY2, iY3);
            }
        }
        return null;
    }

    public boolean d(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        if ((i7 & (-2097152)) != -2097152 || (i10 = (i7 >>> 19) & 3) == 1 || (i11 = (i7 >>> 17) & 3) == 0 || (i12 = (i7 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i7 >>> 10) & 3) == 3) {
            return false;
        }
        this.f11578a = i10;
        this.f11584g = a.f11481m[3 - i11];
        int i14 = a.f11482n[i13];
        this.f11580c = i14;
        if (i10 == 2) {
            this.f11580c = i14 / 2;
        } else if (i10 == 0) {
            this.f11580c = i14 / 4;
        }
        int i15 = (i7 >>> 9) & 1;
        int i16 = 1152;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalArgumentException();
                }
                i16 = 384;
            }
        } else if (i10 != 3) {
            i16 = 576;
        }
        this.f11583f = i16;
        if (i11 == 3) {
            int i17 = i10 == 3 ? a.f11483o[i12 - 1] : a.f11484p[i12 - 1];
            this.f11582e = i17;
            this.f11579b = (((i17 * 12) / this.f11580c) + i15) * 4;
        } else {
            if (i10 == 3) {
                int i18 = i11 == 2 ? a.f11485q[i12 - 1] : a.f11486r[i12 - 1];
                this.f11582e = i18;
                this.f11579b = ((i18 * 144) / this.f11580c) + i15;
            } else {
                int i19 = a.f11487s[i12 - 1];
                this.f11582e = i19;
                this.f11579b = (((i11 == 1 ? 72 : 144) * i19) / this.f11580c) + i15;
            }
        }
        this.f11581d = ((i7 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }

    public n0(mj.b bVar) {
        this(bVar, 10, bVar.f15839d / 2, bVar.f15840e / 2);
    }
}
