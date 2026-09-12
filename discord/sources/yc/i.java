package yc;

import a5.l0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import ei.e0;
import gc.g0;
import gc.h1;
import ic.n0;
import java.util.ArrayList;
import java.util.Arrays;
import je.v;
import je.w;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public hp.e f23271n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f23272o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f23273p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public n0 f23274q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public u4.c f23275r;

    @Override // yc.h
    public final void a(long j) {
        this.f23266g = j;
        this.f23273p = j != 0;
        n0 n0Var = this.f23274q;
        this.f23272o = n0Var != null ? n0Var.f11582e : 0;
    }

    @Override // yc.h
    public final long b(w wVar) {
        byte b10 = wVar.f13860a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        hp.e eVar = this.f23271n;
        je.b.l(eVar);
        int i7 = eVar.f10987d;
        n0 n0Var = (n0) eVar.f10988e;
        int i10 = !((com.reactnativecommunity.webview.h[]) eVar.f10991w)[(b10 >> 1) & (255 >>> (8 - i7))].f7044a ? n0Var.f11582e : n0Var.f11583f;
        long j = this.f23273p ? (this.f23272o + i10) / 4 : 0;
        byte[] bArr = wVar.f13860a;
        int length = bArr.length;
        int i11 = wVar.f13862c + 4;
        if (length < i11) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i11);
            wVar.D(bArrCopyOf, bArrCopyOf.length);
        } else {
            wVar.E(i11);
        }
        byte[] bArr2 = wVar.f13860a;
        int i12 = wVar.f13862c;
        bArr2[i12 - 4] = (byte) (j & 255);
        bArr2[i12 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i12 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i12 - 1] = (byte) ((j >>> 24) & 255);
        this.f23273p = true;
        this.f23272o = i10;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x03af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:168:0x03b2  */
    @Override // yc.h
    public final boolean c(w wVar, long j, e4.e eVar) throws h1 {
        hp.e eVar2;
        if (this.f23271n != null) {
            ((Format) eVar.f7971e).getClass();
            return false;
        }
        n0 n0Var = this.f23274q;
        int i7 = 4;
        if (n0Var != null) {
            u4.c cVar = this.f23275r;
            if (cVar == null) {
                this.f23275r = l0.N(wVar, true, true);
            } else {
                int i10 = wVar.f13862c;
                byte[] bArr = new byte[i10];
                System.arraycopy(wVar.f13860a, 0, bArr, 0, i10);
                int i11 = n0Var.f11578a;
                int i12 = 5;
                l0.S(5, wVar, false);
                int iU = wVar.u() + 1;
                v vVar = new v(wVar.f13860a);
                int i13 = 8;
                vVar.s(wVar.f13861b * 8);
                int i14 = 0;
                while (true) {
                    int i15 = 16;
                    if (i14 < iU) {
                        int i16 = i13;
                        if (vVar.i(24) != 5653314) {
                            throw h1.a("expected code book to start with [0x56, 0x43, 0x42] at " + ((vVar.f13855d * 8) + vVar.f13856e), null);
                        }
                        int i17 = vVar.i(16);
                        int i18 = vVar.i(24);
                        if (vVar.h()) {
                            vVar.s(i12);
                            int i19 = 0;
                            while (i19 < i18) {
                                int i20 = 0;
                                for (int i21 = i18 - i19; i21 > 0; i21 >>>= 1) {
                                    i20++;
                                }
                                i19 += vVar.i(i20);
                            }
                        } else {
                            boolean zH = vVar.h();
                            for (int i22 = 0; i22 < i18; i22++) {
                                if (!zH) {
                                    vVar.s(i12);
                                } else if (vVar.h()) {
                                    vVar.s(i12);
                                }
                            }
                        }
                        int i23 = vVar.i(4);
                        if (i23 > 2) {
                            throw h1.a("lookup type greater than 2 not decodable: " + i23, null);
                        }
                        if (i23 == 1 || i23 == 2) {
                            vVar.s(32);
                            vVar.s(32);
                            int i24 = vVar.i(4) + 1;
                            vVar.s(1);
                            vVar.s((int) ((i23 == 1 ? i17 != 0 ? (long) Math.floor(Math.pow(i18, 1.0d / ((double) i17))) : 0L : ((long) i18) * ((long) i17)) * ((long) i24)));
                        }
                        i14++;
                        i13 = i16;
                        i12 = 5;
                    } else {
                        int i25 = i13;
                        int i26 = 6;
                        int i27 = vVar.i(6) + 1;
                        for (int i28 = 0; i28 < i27; i28++) {
                            if (vVar.i(16) != 0) {
                                throw h1.a("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i29 = 1;
                        int i30 = vVar.i(6) + 1;
                        int i31 = 0;
                        while (true) {
                            int i32 = 3;
                            if (i31 >= i30) {
                                int i33 = vVar.i(i26) + 1;
                                int i34 = 0;
                                while (i34 < i33) {
                                    if (vVar.i(16) > 2) {
                                        throw h1.a("residueType greater than 2 is not decodable", null);
                                    }
                                    vVar.s(24);
                                    vVar.s(24);
                                    vVar.s(24);
                                    int i35 = vVar.i(i26) + 1;
                                    int i36 = 8;
                                    vVar.s(8);
                                    int[] iArr = new int[i35];
                                    for (int i37 = 0; i37 < i35; i37++) {
                                        iArr[i37] = ((vVar.h() ? vVar.i(5) : 0) * 8) + vVar.i(3);
                                    }
                                    int i38 = 0;
                                    while (i38 < i35) {
                                        int i39 = 0;
                                        while (i39 < i36) {
                                            if ((iArr[i38] & (1 << i39)) != 0) {
                                                vVar.s(i36);
                                            }
                                            i39++;
                                            i36 = 8;
                                        }
                                        i38++;
                                        i36 = 8;
                                    }
                                    i34++;
                                    i26 = 6;
                                }
                                int i40 = vVar.i(i26) + 1;
                                for (int i41 = 0; i41 < i40; i41++) {
                                    int i42 = vVar.i(16);
                                    if (i42 != 0) {
                                        je.b.r("VorbisUtil", "mapping type other than 0 not supported: " + i42);
                                    } else {
                                        int i43 = vVar.h() ? vVar.i(4) + 1 : 1;
                                        if (vVar.h()) {
                                            int i44 = vVar.i(8) + 1;
                                            for (int i45 = 0; i45 < i44; i45++) {
                                                int i46 = i11 - 1;
                                                int i47 = 0;
                                                for (int i48 = i46; i48 > 0; i48 >>>= 1) {
                                                    i47++;
                                                }
                                                vVar.s(i47);
                                                int i49 = 0;
                                                while (i46 > 0) {
                                                    i49++;
                                                    i46 >>>= 1;
                                                }
                                                vVar.s(i49);
                                            }
                                        }
                                        if (vVar.i(2) != 0) {
                                            throw h1.a("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i43 > 1) {
                                            for (int i50 = 0; i50 < i11; i50++) {
                                                vVar.s(4);
                                            }
                                        }
                                        for (int i51 = 0; i51 < i43; i51++) {
                                            vVar.s(8);
                                            vVar.s(8);
                                            vVar.s(8);
                                        }
                                    }
                                }
                                int i52 = vVar.i(6);
                                int i53 = i52 + 1;
                                com.reactnativecommunity.webview.h[] hVarArr = new com.reactnativecommunity.webview.h[i53];
                                for (int i54 = 0; i54 < i53; i54++) {
                                    boolean zH2 = vVar.h();
                                    vVar.i(16);
                                    vVar.i(16);
                                    vVar.i(8);
                                    com.reactnativecommunity.webview.h hVar = new com.reactnativecommunity.webview.h();
                                    hVar.f7044a = zH2;
                                    hVarArr[i54] = hVar;
                                }
                                if (!vVar.h()) {
                                    throw h1.a("framing bit after modes not set as expected", null);
                                }
                                int i55 = 0;
                                while (i52 > 0) {
                                    i55++;
                                    i52 >>>= 1;
                                }
                                eVar2 = new hp.e(n0Var, cVar, bArr, hVarArr, i55);
                                break;
                            }
                            int i56 = vVar.i(i15);
                            if (i56 == 0) {
                                int i57 = i25;
                                vVar.s(i57);
                                vVar.s(16);
                                vVar.s(16);
                                vVar.s(6);
                                vVar.s(i57);
                                int i58 = vVar.i(4) + 1;
                                int i59 = 0;
                                while (i59 < i58) {
                                    vVar.s(i57);
                                    i59++;
                                    i57 = 8;
                                }
                            } else {
                                if (i56 != i29) {
                                    throw h1.a("floor type greater than 1 not decodable: " + i56, null);
                                }
                                int i60 = vVar.i(5);
                                int[] iArr2 = new int[i60];
                                int i61 = -1;
                                for (int i62 = 0; i62 < i60; i62++) {
                                    int i63 = vVar.i(i7);
                                    iArr2[i62] = i63;
                                    if (i63 > i61) {
                                        i61 = i63;
                                    }
                                }
                                int i64 = i61 + 1;
                                int[] iArr3 = new int[i64];
                                int i65 = 0;
                                while (i65 < i64) {
                                    iArr3[i65] = vVar.i(i32) + 1;
                                    int i66 = vVar.i(2);
                                    int i67 = i25;
                                    if (i66 > 0) {
                                        vVar.s(i67);
                                    }
                                    int[] iArr4 = iArr3;
                                    int i68 = 0;
                                    for (int i69 = 1; i68 < (i69 << i66); i69 = 1) {
                                        vVar.s(i67);
                                        i68++;
                                        i67 = 8;
                                    }
                                    i65++;
                                    iArr3 = iArr4;
                                    i25 = 8;
                                    i32 = 3;
                                }
                                int[] iArr5 = iArr3;
                                vVar.s(2);
                                int i70 = vVar.i(4);
                                int i71 = 0;
                                int i72 = 0;
                                for (int i73 = 0; i73 < i60; i73++) {
                                    i71 += iArr5[iArr2[i73]];
                                    while (i72 < i71) {
                                        vVar.s(i70);
                                        i72++;
                                    }
                                }
                            }
                            i31++;
                            i25 = 8;
                            i26 = 6;
                            i7 = 4;
                            i15 = 16;
                            i29 = 1;
                        }
                    }
                }
            }
            this.f23271n = eVar2;
            if (eVar2 == null) {
                return true;
            }
            n0 n0Var2 = (n0) eVar2.f10988e;
            ArrayList arrayList = new ArrayList();
            arrayList.add((byte[]) n0Var2.f11584g);
            arrayList.add((byte[]) eVar2.f10990v);
            Metadata metadataL = l0.L(e0.m((String[]) ((u4.c) eVar2.f10989i).f20946d));
            g0 g0Var = new g0();
            g0Var.k = "audio/vorbis";
            g0Var.f9640f = n0Var2.f11581d;
            g0Var.f9641g = n0Var2.f11580c;
            g0Var.f9656x = n0Var2.f11578a;
            g0Var.f9657y = n0Var2.f11579b;
            g0Var.f9645m = arrayList;
            g0Var.f9643i = metadataL;
            eVar.f7971e = new Format(g0Var);
            return true;
        }
        l0.S(1, wVar, false);
        wVar.m();
        int iU2 = wVar.u();
        int iM = wVar.m();
        int i74 = wVar.i();
        if (i74 <= 0) {
            i74 = -1;
        }
        int i75 = wVar.i();
        int i76 = i75 > 0 ? i75 : -1;
        wVar.i();
        int iU3 = wVar.u();
        int iPow = (int) Math.pow(2.0d, iU3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iU3 & 240) >> 4);
        wVar.u();
        byte[] bArrCopyOf = Arrays.copyOf(wVar.f13860a, wVar.f13862c);
        n0 n0Var3 = new n0();
        n0Var3.f11578a = iU2;
        n0Var3.f11579b = iM;
        n0Var3.f11580c = i74;
        n0Var3.f11581d = i76;
        n0Var3.f11582e = iPow;
        n0Var3.f11583f = iPow2;
        n0Var3.f11584g = bArrCopyOf;
        this.f23274q = n0Var3;
        eVar2 = null;
        this.f23271n = eVar2;
        if (eVar2 == null) {
            return true;
        }
        n0 n0Var4 = (n0) eVar2.f10988e;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((byte[]) n0Var4.f11584g);
        arrayList2.add((byte[]) eVar2.f10990v);
        Metadata metadataL2 = l0.L(e0.m((String[]) ((u4.c) eVar2.f10989i).f20946d));
        g0 g0Var2 = new g0();
        g0Var2.k = "audio/vorbis";
        g0Var2.f9640f = n0Var4.f11581d;
        g0Var2.f9641g = n0Var4.f11580c;
        g0Var2.f9656x = n0Var4.f11578a;
        g0Var2.f9657y = n0Var4.f11579b;
        g0Var2.f9645m = arrayList2;
        g0Var2.f9643i = metadataL2;
        eVar.f7971e = new Format(g0Var2);
        return true;
    }

    @Override // yc.h
    public final void d(boolean z5) {
        super.d(z5);
        if (z5) {
            this.f23271n = null;
            this.f23274q = null;
            this.f23275r = null;
        }
        this.f23272o = 0;
        this.f23273p = false;
    }
}
