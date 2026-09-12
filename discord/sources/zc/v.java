package zc;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f23873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je.v f23874b = new je.v(new byte[10], 10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23875c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public je.b0 f23877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23880h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23881i;
    public int j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f23882l;

    public v(h hVar) {
        this.f23873a = hVar;
    }

    @Override // zc.e0
    public final void a() {
        this.f23875c = 0;
        this.f23876d = 0;
        this.f23880h = false;
        this.f23873a.a();
    }

    @Override // zc.e0
    public final void b(je.b0 b0Var, pc.m mVar, d0 d0Var) {
        this.f23877e = b0Var;
        this.f23873a.e(mVar, d0Var);
    }

    @Override // zc.e0
    public final void c(int i7, je.w wVar) {
        int i10;
        int i11;
        int i12;
        je.b.l(this.f23877e);
        int i13 = i7 & 1;
        h hVar = this.f23873a;
        int i14 = 2;
        int i15 = 0;
        if (i13 != 0) {
            int i16 = this.f23875c;
            if (i16 != 0 && i16 != 1) {
                if (i16 == 2) {
                    je.b.N("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i16 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        je.b.N("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    hVar.d();
                }
            }
            this.f23875c = 1;
            this.f23876d = 0;
        }
        int i17 = i7;
        while (wVar.a() > 0) {
            int i18 = this.f23875c;
            if (i18 != 0) {
                je.v vVar = this.f23874b;
                if (i18 != 1) {
                    if (i18 == i14) {
                        if (d(wVar, vVar.f13853b, Math.min(10, this.f23881i)) && d(wVar, null, this.f23881i)) {
                            vVar.p(i15);
                            this.f23882l = -9223372036854775807L;
                            if (this.f23878f) {
                                vVar.s(4);
                                long jI = ((long) vVar.i(3)) << 30;
                                vVar.s(1);
                                long jI2 = ((long) (vVar.i(15) << 15)) | jI;
                                vVar.s(1);
                                long jI3 = jI2 | ((long) vVar.i(15));
                                vVar.s(1);
                                if (!this.f23880h && this.f23879g) {
                                    vVar.s(4);
                                    long jI4 = ((long) vVar.i(3)) << 30;
                                    vVar.s(1);
                                    long jI5 = jI4 | ((long) (vVar.i(15) << 15));
                                    vVar.s(1);
                                    long jI6 = jI5 | ((long) vVar.i(15));
                                    vVar.s(1);
                                    this.f23877e.b(jI6);
                                    this.f23880h = true;
                                }
                                this.f23882l = this.f23877e.b(jI3);
                            }
                            i17 |= this.k ? 4 : 0;
                            hVar.f(i17, this.f23882l);
                            this.f23875c = 3;
                            this.f23876d = 0;
                            i15 = 0;
                            i14 = 2;
                        }
                    } else {
                        if (i18 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = wVar.a();
                        int i19 = this.j;
                        int i20 = i19 == -1 ? i15 : iA - i19;
                        if (i20 > 0) {
                            iA -= i20;
                            wVar.E(wVar.f13861b + iA);
                        }
                        hVar.c(wVar);
                        int i21 = this.j;
                        if (i21 != -1) {
                            int i22 = i21 - iA;
                            this.j = i22;
                            if (i22 == 0) {
                                hVar.d();
                                this.f23875c = 1;
                                this.f23876d = i15;
                            }
                        }
                    }
                    i10 = i14;
                    i11 = i15;
                } else {
                    i11 = i15;
                    if (d(wVar, vVar.f13853b, 9)) {
                        vVar.p(i11);
                        int i23 = vVar.i(24);
                        if (i23 != 1) {
                            com.discord.chat.presentation.list.a.q(i23, "Unexpected start code prefix: ", "PesReader");
                            this.j = -1;
                            i12 = 0;
                            i10 = 2;
                        } else {
                            vVar.s(8);
                            int i24 = vVar.i(16);
                            vVar.s(5);
                            this.k = vVar.h();
                            i10 = 2;
                            vVar.s(2);
                            this.f23878f = vVar.h();
                            this.f23879g = vVar.h();
                            vVar.s(6);
                            int i25 = vVar.i(8);
                            this.f23881i = i25;
                            if (i24 == 0) {
                                this.j = -1;
                            } else {
                                int i26 = (i24 - 3) - i25;
                                this.j = i26;
                                if (i26 < 0) {
                                    je.b.N("PesReader", "Found negative packet payload size: " + this.j);
                                    this.j = -1;
                                }
                            }
                            i12 = 2;
                        }
                        this.f23875c = i12;
                        i11 = 0;
                        this.f23876d = 0;
                    } else {
                        i10 = 2;
                    }
                }
            } else {
                i10 = i14;
                i11 = i15;
                wVar.G(wVar.a());
            }
            i15 = i11;
            i14 = i10;
        }
    }

    public final boolean d(je.w wVar, byte[] bArr, int i7) {
        int iMin = Math.min(wVar.a(), i7 - this.f23876d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            wVar.G(iMin);
        } else {
            wVar.e(bArr, this.f23876d, iMin);
        }
        int i10 = this.f23876d + iMin;
        this.f23876d = i10;
        return i10 == i7;
    }
}
