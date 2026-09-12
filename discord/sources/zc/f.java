package zc;

import com.google.android.exoplayer2.Format;
import gc.g0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f23715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pc.x f23716d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23718f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23719g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f23720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Format f23721i;
    public int j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je.w f23713a = new je.w(new byte[18]);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23717e = 0;
    public long k = -9223372036854775807L;

    public f(String str) {
        this.f23714b = str;
    }

    @Override // zc.h
    public final void a() {
        this.f23717e = 0;
        this.f23718f = 0;
        this.f23719g = 0;
        this.k = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0233  */
    /* JADX WARN: Code duplicated, block: B:67:0x023b  */
    /* JADX WARN: Code duplicated, block: B:69:0x023e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0242  */
    /* JADX WARN: Code duplicated, block: B:73:0x0258  */
    /* JADX WARN: Code duplicated, block: B:75:0x0269  */
    /* JADX WARN: Code duplicated, block: B:76:0x0275  */
    @Override // zc.h
    public final void c(je.w wVar) {
        int i7;
        int i10;
        int i11;
        byte b10;
        int i12;
        int i13;
        int i14;
        int i15;
        byte b11;
        int i16;
        byte b12;
        int i17;
        je.v vVar;
        je.b.l(this.f23716d);
        while (wVar.a() > 0) {
            int i18 = this.f23717e;
            int i19 = 8;
            int i20 = 2;
            je.w wVar2 = this.f23713a;
            if (i18 == 0) {
                while (wVar.a() > 0) {
                    int i21 = this.f23719g << 8;
                    this.f23719g = i21;
                    int iU = i21 | wVar.u();
                    this.f23719g = iU;
                    if (iU == 2147385345 || iU == -25230976 || iU == 536864768 || iU == -14745368) {
                        byte[] bArr = wVar2.f13860a;
                        bArr[0] = (byte) ((iU >> 24) & 255);
                        bArr[1] = (byte) ((iU >> 16) & 255);
                        bArr[2] = (byte) ((iU >> 8) & 255);
                        bArr[3] = (byte) (iU & 255);
                        this.f23718f = 4;
                        this.f23719g = 0;
                        this.f23717e = 1;
                        break;
                    }
                }
            } else if (i18 == 1) {
                byte[] bArr2 = wVar2.f13860a;
                int iMin = Math.min(wVar.a(), 18 - this.f23718f);
                wVar.e(bArr2, this.f23718f, iMin);
                int i22 = this.f23718f + iMin;
                this.f23718f = i22;
                if (i22 == 18) {
                    byte[] bArr3 = wVar2.f13860a;
                    if (this.f23721i == null) {
                        String str = this.f23715c;
                        i10 = 0;
                        if (bArr3[0] == 127) {
                            vVar = new je.v(bArr3, bArr3.length);
                            i7 = 8;
                            i17 = 2;
                        } else {
                            byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length);
                            byte b13 = bArrCopyOf[0];
                            if (b13 == -2 || b13 == -1) {
                                for (int i23 = 0; i23 < bArrCopyOf.length - 1; i23 += 2) {
                                    byte b14 = bArrCopyOf[i23];
                                    int i24 = i23 + 1;
                                    bArrCopyOf[i23] = bArrCopyOf[i24];
                                    bArrCopyOf[i24] = b14;
                                }
                            }
                            je.v vVar2 = new je.v(bArrCopyOf, bArrCopyOf.length);
                            if (bArrCopyOf[0] == 31) {
                                je.v vVar3 = new je.v(bArrCopyOf, bArrCopyOf.length);
                                while (vVar3.b() >= 16) {
                                    vVar3.s(i20);
                                    int i25 = vVar3.i(14) & 16383;
                                    int iMin2 = Math.min(8 - vVar2.f13855d, 14);
                                    int i26 = i20;
                                    int i27 = vVar2.f13855d;
                                    int i28 = (8 - i27) - iMin2;
                                    byte[] bArr4 = vVar2.f13853b;
                                    int i29 = vVar2.f13854c;
                                    byte b15 = (byte) (bArr4[i29] & ((65280 >> i27) | ((1 << i28) - 1)));
                                    bArr4[i29] = b15;
                                    int i30 = 14 - iMin2;
                                    bArr4[i29] = (byte) (b15 | ((i25 >>> i30) << i28));
                                    int i31 = i29 + 1;
                                    while (i30 > i19) {
                                        vVar2.f13853b[i31] = (byte) (i25 >>> (i30 - 8));
                                        i30 -= 8;
                                        i31++;
                                        i19 = i19;
                                    }
                                    int i32 = i19;
                                    int i33 = 8 - i30;
                                    byte[] bArr5 = vVar2.f13853b;
                                    byte b16 = (byte) (bArr5[i31] & ((1 << i33) - 1));
                                    bArr5[i31] = b16;
                                    bArr5[i31] = (byte) (((i25 & ((1 << i30) - 1)) << i33) | b16);
                                    vVar2.s(14);
                                    vVar2.a();
                                    i20 = i26;
                                    i19 = i32;
                                }
                            }
                            i7 = i19;
                            i17 = i20;
                            vVar2.o(bArrCopyOf, bArrCopyOf.length);
                            vVar = vVar2;
                        }
                        vVar.s(60);
                        int i34 = ic.a.j[vVar.i(6)];
                        int i35 = ic.a.k[vVar.i(4)];
                        int i36 = vVar.i(5);
                        int i37 = i36 >= 29 ? -1 : (ic.a.f11480l[i36] * 1000) / 2;
                        vVar.s(10);
                        int i38 = i34 + (vVar.i(i17) > 0 ? 1 : 0);
                        g0 g0Var = new g0();
                        g0Var.f9635a = str;
                        g0Var.k = "audio/vnd.dts";
                        g0Var.f9640f = i37;
                        g0Var.f9656x = i38;
                        g0Var.f9657y = i35;
                        g0Var.f9646n = null;
                        g0Var.f9637c = this.f23714b;
                        Format format = new Format(g0Var);
                        this.f23721i = format;
                        this.f23716d.e(format);
                    } else {
                        i7 = 8;
                        i10 = 0;
                    }
                    byte b17 = bArr3[i10];
                    if (b17 != -2) {
                        if (b17 == -1) {
                            i16 = ((bArr3[7] & 3) << 12) | ((bArr3[6] & 255) << 4);
                            b12 = bArr3[9];
                        } else if (b17 != 31) {
                            i11 = ((bArr3[5] & 3) << 12) | ((bArr3[6] & 255) << 4);
                            b10 = bArr3[7];
                        } else {
                            i16 = ((bArr3[6] & 3) << 12) | ((bArr3[7] & 255) << 4);
                            b12 = bArr3[i7];
                        }
                        i13 = (i16 | ((b12 & 60) >> 2)) + 1;
                        i12 = 1;
                        if (i12 != 0) {
                            i13 = (i13 * 16) / 14;
                        }
                        this.j = i13;
                        if (b17 != -2) {
                            if (b17 != -1) {
                                i14 = (bArr3[4] & 7) << 4;
                                b11 = bArr3[7];
                            } else if (b17 != 31) {
                                i14 = (bArr3[4] & 1) << 6;
                                i15 = bArr3[5] & 252;
                            } else {
                                i14 = (bArr3[5] & 7) << 4;
                                b11 = bArr3[6];
                            }
                            i15 = b11 & 60;
                        } else {
                            i14 = (bArr3[5] & 1) << 6;
                            i15 = bArr3[4] & 252;
                        }
                        this.f23720h = (int) ((((long) ((((i15 >> 2) | i14) + 1) * 32)) * 1000000) / ((long) this.f23721i.W));
                        wVar2.F(i10);
                        this.f23716d.d(18, wVar2);
                        this.f23717e = 2;
                    } else {
                        i11 = ((bArr3[4] & 3) << 12) | ((bArr3[7] & 255) << 4);
                        b10 = bArr3[6];
                    }
                    i13 = (i11 | ((b10 & 240) >> 4)) + 1;
                    i12 = i10;
                    if (i12 != 0) {
                        i13 = (i13 * 16) / 14;
                    }
                    this.j = i13;
                    if (b17 != -2) {
                        if (b17 != -1) {
                            i14 = (bArr3[4] & 7) << 4;
                            b11 = bArr3[7];
                        } else if (b17 != 31) {
                            i14 = (bArr3[4] & 1) << 6;
                            i15 = bArr3[5] & 252;
                        } else {
                            i14 = (bArr3[5] & 7) << 4;
                            b11 = bArr3[6];
                        }
                        i15 = b11 & 60;
                    } else {
                        i14 = (bArr3[5] & 1) << 6;
                        i15 = bArr3[4] & 252;
                    }
                    this.f23720h = (int) ((((long) ((((i15 >> 2) | i14) + 1) * 32)) * 1000000) / ((long) this.f23721i.W));
                    wVar2.F(i10);
                    this.f23716d.d(18, wVar2);
                    this.f23717e = 2;
                }
            } else {
                if (i18 != 2) {
                    throw new IllegalStateException();
                }
                int iMin3 = Math.min(wVar.a(), this.j - this.f23718f);
                this.f23716d.d(iMin3, wVar);
                int i39 = this.f23718f + iMin3;
                this.f23718f = i39;
                int i40 = this.j;
                if (i39 == i40) {
                    long j = this.k;
                    if (j != -9223372036854775807L) {
                        this.f23716d.c(j, 1, i40, 0, null);
                        this.k += this.f23720h;
                    }
                    this.f23717e = 0;
                }
            }
        }
    }

    @Override // zc.h
    public final void e(pc.m mVar, d0 d0Var) {
        d0Var.a();
        d0Var.b();
        this.f23715c = d0Var.f23692e;
        d0Var.b();
        this.f23716d = mVar.x(d0Var.f23691d, 1);
    }

    @Override // zc.h
    public final void f(int i7, long j) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    @Override // zc.h
    public final void d() {
    }
}
