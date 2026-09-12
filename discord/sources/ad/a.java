package ad;

import com.google.android.exoplayer2.Format;
import gc.g0;
import gc.h1;
import je.e0;
import je.w;
import pc.l;
import pc.m;
import pc.x;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f315m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f316n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Format f324h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f325i;
    public long j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f326l;

    public a(m mVar, x xVar, e eVar) throws h1 {
        this.f317a = mVar;
        this.f318b = xVar;
        this.f319c = eVar;
        int i7 = eVar.f343e;
        int iMax = Math.max(1, i7 / 10);
        this.f323g = iMax;
        w wVar = new w((byte[]) eVar.f346w);
        wVar.n();
        int iN = wVar.n();
        this.f320d = iN;
        int i10 = eVar.f342d;
        int i11 = eVar.f344i;
        int i12 = (((i11 - (i10 * 4)) * 8) / (eVar.f345v * i10)) + 1;
        if (iN != i12) {
            throw h1.a("Expected frames per block: " + i12 + "; got: " + iN, null);
        }
        int iF = e0.f(iMax, iN);
        this.f321e = new byte[iF * i11];
        this.f322f = new w(iN * 2 * i10 * iF);
        int i13 = ((i11 * i7) * 8) / iN;
        g0 g0Var = new g0();
        g0Var.k = "audio/raw";
        g0Var.f9640f = i13;
        g0Var.f9641g = i13;
        g0Var.f9644l = iMax * 2 * i10;
        g0Var.f9656x = i10;
        g0Var.f9657y = i7;
        g0Var.f9658z = 2;
        this.f324h = new Format(g0Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x0135  */
    /* JADX WARN: Code duplicated, block: B:43:0x0045 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x010b A[EDGE_INSN: B:47:0x010b->B:35:0x010b BREAK  A[LOOP:1: B:17:0x004b->B:34:0x0101], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
    @Override // ad.b
    public final boolean a(l lVar, long j) {
        byte[] bArr;
        int i7;
        int i10;
        int i11;
        w wVar;
        int i12;
        int i13;
        int i14;
        byte[] bArr2;
        int i15;
        int i16;
        int i17;
        int iMin;
        int[] iArr;
        int i18;
        int i19;
        int i20;
        byte b10;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27 = this.k;
        e eVar = this.f319c;
        int i28 = i27 / (eVar.f342d * 2);
        int i29 = this.f323g;
        int i30 = this.f320d;
        int iF = e0.f(i29 - i28, i30);
        int i31 = eVar.f344i;
        int i32 = iF * i31;
        boolean z5 = j == 0;
        while (true) {
            bArr = this.f321e;
            if (z5 && (i25 = this.f325i) < i32) {
                i26 = lVar.read(bArr, this.f325i, (int) Math.min(i32 - i25, j));
                if (i26 == -1) {
                    break;
                }
                this.f325i += i26;
                bArr = this.f321e;
                if (z5) {
                }
            }
            i7 = this.f325i / i31;
            if (i7 > 0) {
                i11 = 0;
                while (true) {
                    wVar = this.f322f;
                    if (i11 < i7) {
                        break;
                    }
                    i13 = 0;
                    while (true) {
                        i14 = eVar.f342d;
                        if (i13 < i14) {
                            bArr2 = wVar.f13860a;
                            int i33 = (i13 * 4) + (i11 * i31);
                            i15 = (i14 * 4) + i33;
                            i16 = (i31 / i14) - 4;
                            i17 = (short) ((bArr[i33] & 255) | ((bArr[i33 + 1] & 255) << 8));
                            int i34 = i7;
                            iMin = Math.min(bArr[i33 + 2] & 255, 88);
                            iArr = f316n;
                            i18 = iArr[iMin];
                            i19 = ((i11 * i30 * i14) + i13) * 2;
                            bArr2[i19] = (byte) (i17 & 255);
                            bArr2[i19 + 1] = (byte) (i17 >> 8);
                            int i35 = i11;
                            i20 = 0;
                            while (i20 < i16 * 2) {
                                b10 = bArr[((i20 / 8) * i14 * 4) + i15 + ((i20 / 2) % 4)];
                                i21 = i20;
                                i22 = b10 & 255;
                                if (i21 % 2 == 0) {
                                    i23 = b10 & 15;
                                } else {
                                    i23 = i22 >> 4;
                                }
                                i24 = ((((i23 & 7) * 2) + 1) * i18) >> 3;
                                if ((i23 & 8) != 0) {
                                    i24 = -i24;
                                }
                                i17 = e0.i(i17 + i24, -32768, 32767);
                                i19 = (i14 * 2) + i19;
                                bArr2[i19] = (byte) (i17 & 255);
                                bArr2[i19 + 1] = (byte) (i17 >> 8);
                                iMin = e0.i(iMin + f315m[i23], 0, 88);
                                i18 = iArr[iMin];
                                i20 = i21 + 1;
                            }
                            i13++;
                            i7 = i34;
                            i11 = i35;
                        }
                    }
                    i11++;
                }
                int i36 = i7;
                int i37 = i30 * i36 * 2 * eVar.f342d;
                wVar.F(0);
                wVar.E(i37);
                this.f325i -= i36 * i31;
                int i38 = wVar.f13862c;
                this.f318b.d(i38, wVar);
                i12 = this.k + i38;
                this.k = i12;
                if (i12 / (eVar.f342d * 2) >= i29) {
                    d(i29);
                }
            }
            if (z5 && (i10 = this.k / (eVar.f342d * 2)) > 0) {
                d(i10);
            }
            return z5;
        }
        while (true) {
            bArr = this.f321e;
            if (z5) {
            }
            i7 = this.f325i / i31;
            if (i7 > 0) {
                i11 = 0;
                while (true) {
                    wVar = this.f322f;
                    if (i11 < i7) {
                        break;
                        break;
                    }
                    i13 = 0;
                    while (true) {
                        i14 = eVar.f342d;
                        if (i13 < i14) {
                            bArr2 = wVar.f13860a;
                            int i39 = (i13 * 4) + (i11 * i31);
                            i15 = (i14 * 4) + i39;
                            i16 = (i31 / i14) - 4;
                            i17 = (short) ((bArr[i39] & 255) | ((bArr[i39 + 1] & 255) << 8));
                            int i310 = i7;
                            iMin = Math.min(bArr[i39 + 2] & 255, 88);
                            iArr = f316n;
                            i18 = iArr[iMin];
                            i19 = ((i11 * i30 * i14) + i13) * 2;
                            bArr2[i19] = (byte) (i17 & 255);
                            bArr2[i19 + 1] = (byte) (i17 >> 8);
                            int i311 = i11;
                            i20 = 0;
                            while (i20 < i16 * 2) {
                                b10 = bArr[((i20 / 8) * i14 * 4) + i15 + ((i20 / 2) % 4)];
                                i21 = i20;
                                i22 = b10 & 255;
                                if (i21 % 2 == 0) {
                                    i23 = b10 & 15;
                                } else {
                                    i23 = i22 >> 4;
                                }
                                i24 = ((((i23 & 7) * 2) + 1) * i18) >> 3;
                                if ((i23 & 8) != 0) {
                                    i24 = -i24;
                                }
                                i17 = e0.i(i17 + i24, -32768, 32767);
                                i19 = (i14 * 2) + i19;
                                bArr2[i19] = (byte) (i17 & 255);
                                bArr2[i19 + 1] = (byte) (i17 >> 8);
                                iMin = e0.i(iMin + f315m[i23], 0, 88);
                                i18 = iArr[iMin];
                                i20 = i21 + 1;
                            }
                            i13++;
                            i7 = i310;
                            i11 = i311;
                        }
                    }
                    i11++;
                }
                int i312 = i7;
                int i313 = i30 * i312 * 2 * eVar.f342d;
                wVar.F(0);
                wVar.E(i313);
                this.f325i -= i312 * i31;
                int i314 = wVar.f13862c;
                this.f318b.d(i314, wVar);
                i12 = this.k + i314;
                this.k = i12;
                if (i12 / (eVar.f342d * 2) >= i29) {
                    d(i29);
                }
            }
            if (z5) {
                d(i10);
            }
            return z5;
            this.f325i += i26;
        }
    }

    @Override // ad.b
    public final void b(long j) {
        this.f325i = 0;
        this.j = j;
        this.k = 0;
        this.f326l = 0L;
    }

    @Override // ad.b
    public final void c(int i7, long j) {
        this.f317a.c(new g(this.f319c, this.f320d, i7, j));
        this.f318b.e(this.f324h);
    }

    public final void d(int i7) {
        long j = this.j;
        long j5 = this.f326l;
        e eVar = this.f319c;
        long jP = j + e0.P(j5, 1000000L, eVar.f343e);
        int i10 = i7 * 2 * eVar.f342d;
        this.f318b.c(jP, 1, i10, this.k - i10, null);
        this.f326l += (long) i7;
        this.k -= i10;
    }
}
