package zc;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.exoplayer2.Format;
import gc.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final je.v f23648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final je.w f23649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f23650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f23651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pc.x f23652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23655i;
    public long j;
    public Format k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23656l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f23657m;

    public b(String str, int i7) {
        this.f23647a = i7;
        switch (i7) {
            case 1:
                je.v vVar = new je.v(new byte[16], 16);
                this.f23648b = vVar;
                this.f23649c = new je.w(vVar.f13853b);
                this.f23653g = 0;
                this.f23654h = 0;
                this.f23655i = false;
                this.f23657m = -9223372036854775807L;
                this.f23650d = str;
                break;
            default:
                je.v vVar2 = new je.v(new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT], IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                this.f23648b = vVar2;
                this.f23649c = new je.w(vVar2.f13853b);
                this.f23653g = 0;
                this.f23657m = -9223372036854775807L;
                this.f23650d = str;
                break;
        }
    }

    @Override // zc.h
    public final void a() {
        switch (this.f23647a) {
            case 0:
                this.f23653g = 0;
                this.f23654h = 0;
                this.f23655i = false;
                this.f23657m = -9223372036854775807L;
                break;
            default:
                this.f23653g = 0;
                this.f23654h = 0;
                this.f23655i = false;
                this.f23657m = -9223372036854775807L;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:178:0x031d  */
    /* JADX WARN: Code duplicated, block: B:200:0x035f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // zc.h
    public final void c(je.w wVar) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        byte b10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        switch (this.f23647a) {
            case 0:
                je.b.l(this.f23652f);
                while (wVar.a() > 0) {
                    int i26 = this.f23653g;
                    je.w wVar2 = this.f23649c;
                    if (i26 == 0) {
                        while (wVar.a() > 0) {
                            if (this.f23655i) {
                                int iU = wVar.u();
                                if (iU == 119) {
                                    this.f23655i = false;
                                    this.f23653g = 1;
                                    byte[] bArr = wVar2.f13860a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f23654h = 2;
                                }
                                this.f23655i = iU == 11;
                            } else {
                                this.f23655i = wVar.u() == 11;
                            }
                            break;
                        }
                    } else if (i26 == 1) {
                        byte[] bArr2 = wVar2.f13860a;
                        int iMin = Math.min(wVar.a(), 128 - this.f23654h);
                        wVar.e(bArr2, this.f23654h, iMin);
                        int i27 = this.f23654h + iMin;
                        this.f23654h = i27;
                        if (i27 == 128) {
                            je.v vVar = this.f23648b;
                            vVar.p(0);
                            int[] iArr = ic.a.f11476f;
                            int[] iArr2 = ic.a.f11474d;
                            int iG = vVar.g();
                            vVar.s(40);
                            Object[] objArr = vVar.i(5) > 10;
                            vVar.p(iG);
                            if (objArr == true) {
                                vVar.s(16);
                                int i28 = vVar.i(2);
                                if (i28 == 0) {
                                    b10 = 0;
                                } else if (i28 != 1) {
                                    b10 = i28 != 2 ? (byte) -1 : (byte) 2;
                                } else {
                                    b10 = 1;
                                }
                                vVar.s(3);
                                i12 = (vVar.i(11) + 1) * 2;
                                int i29 = vVar.i(2);
                                if (i29 == 3) {
                                    i13 = ic.a.f11475e[vVar.i(2)];
                                    i15 = 3;
                                    i16 = 6;
                                } else {
                                    int i30 = vVar.i(2);
                                    int i31 = ic.a.f11473c[i30];
                                    i13 = iArr2[i29];
                                    i15 = i30;
                                    i16 = i31;
                                }
                                i14 = i16 * IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                                int i32 = (i12 * i13) / (i16 * 32);
                                int i33 = vVar.i(3);
                                boolean zH = vVar.h();
                                i11 = iArr[i33] + (zH ? 1 : 0);
                                vVar.s(10);
                                if (vVar.h()) {
                                    vVar.s(8);
                                }
                                if (i33 == 0) {
                                    vVar.s(5);
                                    if (vVar.h()) {
                                        vVar.s(8);
                                    }
                                }
                                if (b10 == 1 && vVar.h()) {
                                    vVar.s(16);
                                }
                                if (vVar.h()) {
                                    if (i33 > 2) {
                                        vVar.s(2);
                                    }
                                    if ((i33 & 1) == 0 || i33 <= 2) {
                                        i21 = 6;
                                    } else {
                                        i21 = 6;
                                        vVar.s(6);
                                    }
                                    if ((i33 & 4) != 0) {
                                        vVar.s(i21);
                                    }
                                    if (zH && vVar.h()) {
                                        vVar.s(5);
                                    }
                                    if (b10 != 0) {
                                        i17 = i15;
                                    } else {
                                        if (vVar.h()) {
                                            i22 = 6;
                                            vVar.s(6);
                                        } else {
                                            i22 = 6;
                                        }
                                        if (i33 == 0 && vVar.h()) {
                                            vVar.s(i22);
                                        }
                                        if (vVar.h()) {
                                            vVar.s(i22);
                                        }
                                        int i34 = vVar.i(2);
                                        if (i34 == 1) {
                                            vVar.s(5);
                                            i24 = 2;
                                        } else {
                                            if (i34 == 2) {
                                                vVar.s(12);
                                            } else if (i34 == 3) {
                                                int i35 = vVar.i(5);
                                                if (vVar.h()) {
                                                    vVar.s(5);
                                                    if (vVar.h()) {
                                                        i25 = 4;
                                                        vVar.s(4);
                                                    } else {
                                                        i25 = 4;
                                                    }
                                                    if (vVar.h()) {
                                                        vVar.s(i25);
                                                    }
                                                    if (vVar.h()) {
                                                        vVar.s(i25);
                                                    }
                                                    if (vVar.h()) {
                                                        vVar.s(i25);
                                                    }
                                                    if (vVar.h()) {
                                                        vVar.s(i25);
                                                    }
                                                    if (vVar.h()) {
                                                        vVar.s(i25);
                                                    }
                                                    if (vVar.h()) {
                                                        vVar.s(i25);
                                                    }
                                                    if (vVar.h()) {
                                                        if (vVar.h()) {
                                                            vVar.s(i25);
                                                        }
                                                        if (vVar.h()) {
                                                            vVar.s(i25);
                                                        }
                                                    }
                                                }
                                                if (vVar.h()) {
                                                    vVar.s(5);
                                                    if (vVar.h()) {
                                                        vVar.s(7);
                                                        if (vVar.h()) {
                                                            i23 = 8;
                                                            vVar.s(8);
                                                        } else {
                                                            i23 = 8;
                                                        }
                                                    } else {
                                                        i23 = 8;
                                                    }
                                                } else {
                                                    i23 = 8;
                                                }
                                                i24 = 2;
                                                vVar.s((i35 + 2) * i23);
                                                vVar.c();
                                            }
                                            i24 = 2;
                                        }
                                        if (i33 < i24) {
                                            if (vVar.h()) {
                                                vVar.s(14);
                                            }
                                            if (i33 == 0 && vVar.h()) {
                                                vVar.s(14);
                                            }
                                        }
                                        if (vVar.h()) {
                                            i17 = i15;
                                            if (i17 == 0) {
                                                vVar.s(5);
                                            } else {
                                                for (int i36 = 0; i36 < i16; i36++) {
                                                    if (vVar.h()) {
                                                        vVar.s(5);
                                                    }
                                                }
                                            }
                                        } else {
                                            i17 = i15;
                                        }
                                    }
                                } else {
                                    i17 = i15;
                                }
                                if (vVar.h()) {
                                    vVar.s(5);
                                    if (i33 == 2) {
                                        vVar.s(4);
                                    }
                                    if (i33 >= 6) {
                                        vVar.s(2);
                                    }
                                    if (vVar.h()) {
                                        i20 = 8;
                                        vVar.s(8);
                                    } else {
                                        i20 = 8;
                                    }
                                    if (i33 == 0 && vVar.h()) {
                                        vVar.s(i20);
                                    }
                                    i18 = 3;
                                    if (i29 < 3) {
                                        vVar.r();
                                    }
                                } else {
                                    i18 = 3;
                                }
                                if (b10 == 0 && i17 != i18) {
                                    vVar.r();
                                }
                                if (b10 == 2 && (i17 == i18 || vVar.h())) {
                                    i19 = 6;
                                    vVar.s(6);
                                } else {
                                    i19 = 6;
                                }
                                str = (vVar.h() && vVar.i(i19) == 1 && vVar.i(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                i7 = i32;
                            } else {
                                vVar.s(32);
                                int i37 = vVar.i(2);
                                String str2 = i37 == 3 ? null : "audio/ac3";
                                int i38 = vVar.i(6);
                                i7 = ic.a.f11477g[i38 / 2] * 1000;
                                int iC = ic.a.c(i37, i38);
                                vVar.s(8);
                                int i39 = vVar.i(3);
                                if ((i39 & 1) == 0 || i39 == 1) {
                                    i10 = 2;
                                } else {
                                    i10 = 2;
                                    vVar.s(2);
                                }
                                if ((i39 & 4) != 0) {
                                    vVar.s(i10);
                                }
                                if (i39 == i10) {
                                    vVar.s(i10);
                                }
                                int i40 = i37 < 3 ? iArr2[i37] : -1;
                                i11 = iArr[i39] + (vVar.h() ? 1 : 0);
                                i12 = iC;
                                i13 = i40;
                                i14 = 1536;
                                str = str2;
                            }
                            Format format = this.k;
                            if (format == null || i11 != format.V || i13 != format.W || !je.e0.a(str, format.I)) {
                                g0 g0Var = new g0();
                                g0Var.f9635a = this.f23651e;
                                g0Var.k = str;
                                g0Var.f9656x = i11;
                                g0Var.f9657y = i13;
                                g0Var.f9637c = this.f23650d;
                                g0Var.f9641g = i7;
                                if ("audio/ac3".equals(str)) {
                                    g0Var.f9640f = i7;
                                }
                                Format format2 = new Format(g0Var);
                                this.k = format2;
                                this.f23652f.e(format2);
                            }
                            this.f23656l = i12;
                            this.j = (((long) i14) * 1000000) / ((long) this.k.W);
                            wVar2.F(0);
                            this.f23652f.d(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, wVar2);
                            this.f23653g = 2;
                        }
                    } else if (i26 == 2) {
                        int iMin2 = Math.min(wVar.a(), this.f23656l - this.f23654h);
                        this.f23652f.d(iMin2, wVar);
                        int i41 = this.f23654h + iMin2;
                        this.f23654h = i41;
                        int i42 = this.f23656l;
                        if (i41 == i42) {
                            long j = this.f23657m;
                            if (j != -9223372036854775807L) {
                                this.f23652f.c(j, 1, i42, 0, null);
                                this.f23657m += this.j;
                            }
                            this.f23653g = 0;
                        }
                    }
                }
                break;
            default:
                je.b.l(this.f23652f);
                while (wVar.a() > 0) {
                    int i43 = this.f23653g;
                    je.w wVar3 = this.f23649c;
                    if (i43 == 0) {
                        while (wVar.a() > 0) {
                            if (this.f23655i) {
                                int iU2 = wVar.u();
                                this.f23655i = iU2 == 172;
                                if (iU2 == 64 || iU2 == 65) {
                                    Object[] objArr2 = iU2 == 65;
                                    this.f23653g = 1;
                                    byte[] bArr3 = wVar3.f13860a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (objArr2 == true ? 65 : 64);
                                    this.f23654h = 2;
                                }
                            } else {
                                this.f23655i = wVar.u() == 172;
                            }
                            break;
                        }
                    } else if (i43 == 1) {
                        byte[] bArr4 = wVar3.f13860a;
                        int iMin3 = Math.min(wVar.a(), 16 - this.f23654h);
                        wVar.e(bArr4, this.f23654h, iMin3);
                        int i44 = this.f23654h + iMin3;
                        this.f23654h = i44;
                        if (i44 == 16) {
                            je.v vVar2 = this.f23648b;
                            vVar2.p(0);
                            gc.l lVarH = ic.a.h(vVar2);
                            int i45 = lVarH.f9744a;
                            Format format3 = this.k;
                            if (format3 == null || 2 != format3.V || i45 != format3.W || !"audio/ac4".equals(format3.I)) {
                                g0 g0Var2 = new g0();
                                g0Var2.f9635a = this.f23651e;
                                g0Var2.k = "audio/ac4";
                                g0Var2.f9656x = 2;
                                g0Var2.f9657y = i45;
                                g0Var2.f9637c = this.f23650d;
                                Format format4 = new Format(g0Var2);
                                this.k = format4;
                                this.f23652f.e(format4);
                            }
                            this.f23656l = lVarH.f9745b;
                            this.j = (((long) lVarH.f9746c) * 1000000) / ((long) this.k.W);
                            wVar3.F(0);
                            this.f23652f.d(16, wVar3);
                            this.f23653g = 2;
                        }
                    } else if (i43 == 2) {
                        int iMin4 = Math.min(wVar.a(), this.f23656l - this.f23654h);
                        this.f23652f.d(iMin4, wVar);
                        int i46 = this.f23654h + iMin4;
                        this.f23654h = i46;
                        int i47 = this.f23656l;
                        if (i46 == i47) {
                            long j5 = this.f23657m;
                            if (j5 != -9223372036854775807L) {
                                this.f23652f.c(j5, 1, i47, 0, null);
                                this.f23657m += this.j;
                            }
                            this.f23653g = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override // zc.h
    public final void d() {
        int i7 = this.f23647a;
    }

    @Override // zc.h
    public final void e(pc.m mVar, d0 d0Var) {
        switch (this.f23647a) {
            case 0:
                d0Var.a();
                d0Var.b();
                this.f23651e = d0Var.f23692e;
                d0Var.b();
                this.f23652f = mVar.x(d0Var.f23691d, 1);
                break;
            default:
                d0Var.a();
                d0Var.b();
                this.f23651e = d0Var.f23692e;
                d0Var.b();
                this.f23652f = mVar.x(d0Var.f23691d, 1);
                break;
        }
    }

    @Override // zc.h
    public final void f(int i7, long j) {
        switch (this.f23647a) {
            case 0:
                if (j != -9223372036854775807L) {
                    this.f23657m = j;
                }
                break;
            default:
                if (j != -9223372036854775807L) {
                    this.f23657m = j;
                }
                break;
        }
    }

    private final void b() {
    }

    private final void g() {
    }
}
