package sj;

import com.google.zxing.Result;
import e4.r;
import ij.b;
import ij.d;
import ij.h;
import ij.j;
import ij.l;
import ij.m;
import java.text.DecimalFormat;
import java.util.Map;
import ph.c;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m[] f20277b = new m[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f20278a = new c(7);

    @Override // ij.j
    public final Result a(r rVar, Map map) throws b, d, h {
        byte[] bArr;
        String strValueOf;
        if (map == null || !map.containsKey(ij.c.f11794d)) {
            throw h.f11808i;
        }
        mj.b bVarE = rVar.E();
        int i7 = bVarE.f15839d;
        int i10 = bVarE.f15840e;
        int i11 = -1;
        int i12 = i10;
        int i13 = -1;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = 0;
            while (true) {
                int i16 = bVarE.f15841i;
                if (i15 < i16) {
                    int i17 = bVarE.f15842v[(i16 * i14) + i15];
                    if (i17 != 0) {
                        if (i14 < i12) {
                            i12 = i14;
                        }
                        if (i14 > i13) {
                            i13 = i14;
                        }
                        int i18 = i15 << 5;
                        if (i18 < i7) {
                            int i19 = 0;
                            while ((i17 << (31 - i19)) == 0) {
                                i19++;
                            }
                            int i20 = i19 + i18;
                            if (i20 < i7) {
                                i7 = i20;
                            }
                        }
                        if (i18 + 31 > i11) {
                            int i21 = 31;
                            while ((i17 >>> i21) == 0) {
                                i21--;
                            }
                            int i22 = i18 + i21;
                            if (i22 > i11) {
                                i11 = i22;
                            }
                        }
                    }
                    i15++;
                }
            }
        }
        int[] iArr = (i11 < i7 || i13 < i12) ? null : new int[]{i7, i12, (i11 - i7) + 1, (i13 - i12) + 1};
        if (iArr == null) {
            throw h.f11808i;
        }
        int i23 = iArr[0];
        int i24 = iArr[1];
        int i25 = iArr[2];
        int i26 = iArr[3];
        int[] iArr2 = new int[33];
        for (int i27 = 0; i27 < 33; i27++) {
            int i28 = (((i26 / 2) + (i27 * i26)) / 33) + i24;
            for (int i29 = 0; i29 < 30; i29++) {
                if (bVarE.b((((((i27 & 1) * i25) / 2) + ((i25 / 2) + (i29 * i25))) / 30) + i23, i28)) {
                    int i30 = (i29 / 32) + i27;
                    iArr2[i30] = iArr2[i30] | (1 << (i29 & 31));
                }
            }
        }
        c cVar = this.f20278a;
        cVar.getClass();
        byte[] bArr2 = new byte[144];
        for (int i31 = 0; i31 < 33; i31++) {
            int[] iArr3 = tj.a.f20817a[i31];
            for (int i32 = 0; i32 < 30; i32++) {
                int i33 = iArr3[i32];
                if (i33 >= 0 && ((iArr2[(i32 / 32) + i31] >>> (i32 & 31)) & 1) != 0) {
                    int i34 = i33 / 6;
                    bArr2[i34] = (byte) (bArr2[i34] | ((byte) (1 << (5 - (i33 % 6)))));
                }
            }
        }
        cVar.l(bArr2, 0, 10, 10, 0);
        int i35 = bArr2[0] & 15;
        if (i35 == 2 || i35 == 3 || i35 == 4) {
            cVar.l(bArr2, 20, 84, 40, 1);
            cVar.l(bArr2, 20, 84, 40, 2);
            bArr = new byte[94];
        } else {
            if (i35 != 5) {
                throw d.a();
            }
            cVar.l(bArr2, 20, 68, 56, 1);
            cVar.l(bArr2, 20, 68, 56, 2);
            bArr = new byte[78];
        }
        System.arraycopy(bArr2, 0, bArr, 0, 10);
        System.arraycopy(bArr2, 20, bArr, 10, bArr.length - 10);
        StringBuilder sb2 = new StringBuilder(144);
        if (i35 == 2 || i35 == 3) {
            if (i35 == 2) {
                strValueOf = new DecimalFormat("0000000000".substring(0, tj.a.a(bArr, new byte[]{39, 40, 41, 42, 31, 32}))).format(tj.a.a(bArr, new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2}));
            } else {
                String[] strArr = tj.a.f20818b;
                strValueOf = String.valueOf(new char[]{strArr[0].charAt(tj.a.a(bArr, new byte[]{39, 40, 41, 42, 31, 32})), strArr[0].charAt(tj.a.a(bArr, new byte[]{33, 34, 35, 36, 25, 26})), strArr[0].charAt(tj.a.a(bArr, new byte[]{27, 28, 29, 30, 19, 20})), strArr[0].charAt(tj.a.a(bArr, new byte[]{21, 22, 23, 24, 13, 14})), strArr[0].charAt(tj.a.a(bArr, new byte[]{15, 16, 17, 18, 7, 8})), strArr[0].charAt(tj.a.a(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String str = decimalFormat.format(tj.a.a(bArr, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38}));
            String str2 = decimalFormat.format(tj.a.a(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52}));
            sb2.append(tj.a.b(bArr, 10, 84));
            if (sb2.toString().startsWith("[)>\u001e01\u001d")) {
                sb2.insert(9, strValueOf + (char) 29 + str + (char) 29 + str2 + (char) 29);
            } else {
                sb2.insert(0, strValueOf + (char) 29 + str + (char) 29 + str2 + (char) 29);
            }
        } else if (i35 == 4) {
            sb2.append(tj.a.b(bArr, 1, 93));
        } else if (i35 == 5) {
            sb2.append(tj.a.b(bArr, 1, 77));
        }
        String string = sb2.toString();
        String strValueOf2 = String.valueOf(i35);
        Result result = new Result(string, bArr, f20277b, ij.a.G);
        if (strValueOf2 != null) {
            result.b(l.f11818i, strValueOf2);
        }
        return result;
    }

    @Override // ij.j
    public final void reset() {
    }
}
