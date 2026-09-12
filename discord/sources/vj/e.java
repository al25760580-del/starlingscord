package vj;

import com.google.zxing.Result;
import ij.h;
import ij.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import w3.q;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f21695i = {1, 10, 34, 70, 126};
    public static final int[] j = {4, 20, 48, 81};
    public static final int[] k = {0, 161, 961, 2015, 2715};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f21696l = {0, 336, 1036, 1516};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f21697m = {8, 6, 4, 3, 1};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f21698n = {2, 4, 6, 8};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[][] f21699o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f21700g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f21701h = new ArrayList();

    public static void j(ArrayList arrayList, d dVar) {
        if (dVar == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar2 = (d) it.next();
            if (dVar2.f21688a == dVar.f21688a) {
                dVar2.f21694d++;
                return;
            }
        }
        arrayList.add(dVar);
    }

    @Override // uj.h
    public final Result b(int i7, mj.a aVar, Map map) throws h {
        d dVarL = l(aVar, false, i7, map);
        ArrayList<d> arrayList = this.f21700g;
        j(arrayList, dVarL);
        aVar.e();
        d dVarL2 = l(aVar, true, i7, map);
        ArrayList<d> arrayList2 = this.f21701h;
        j(arrayList2, dVarL2);
        aVar.e();
        for (d dVar : arrayList) {
            int i10 = dVar.f21694d;
            c cVar = dVar.f21693c;
            if (i10 > 1) {
                for (d dVar2 : arrayList2) {
                    int i11 = dVar2.f21694d;
                    c cVar2 = dVar2.f21693c;
                    if (i11 > 1) {
                        int i12 = ((dVar2.f21689b * 16) + dVar.f21689b) % 79;
                        int i13 = (cVar.f21690a * 9) + cVar2.f21690a;
                        if (i13 > 72) {
                            i13--;
                        }
                        if (i13 > 8) {
                            i13--;
                        }
                        if (i12 == i13) {
                            String strValueOf = String.valueOf((((long) dVar.f21688a) * 4537077) + ((long) dVar2.f21688a));
                            StringBuilder sb2 = new StringBuilder(14);
                            for (int length = 13 - strValueOf.length(); length > 0; length--) {
                                sb2.append('0');
                            }
                            sb2.append(strValueOf);
                            int i14 = 0;
                            for (int i15 = 0; i15 < 13; i15++) {
                                int iCharAt = sb2.charAt(i15) - '0';
                                if ((i15 & 1) == 0) {
                                    iCharAt *= 3;
                                }
                                i14 += iCharAt;
                            }
                            int i16 = 10 - (i14 % 10);
                            if (i16 == 10) {
                                i16 = 0;
                            }
                            sb2.append(i16);
                            m[] mVarArr = cVar.f21692c;
                            m[] mVarArr2 = cVar2.f21692c;
                            return new Result(sb2.toString(), null, new m[]{mVarArr[0], mVarArr[1], mVarArr2[0], mVarArr2[1]}, ij.a.J);
                        }
                    }
                }
            }
        }
        throw h.f11808i;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0095 A[PHI: r14 r15
      0x0095: PHI (r14v12 boolean) = (r14v4 boolean), (r14v15 boolean) binds: [B:48:0x00b5, B:36:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r15v10 boolean) = (r15v2 boolean), (r15v13 boolean) binds: [B:48:0x00b5, B:36:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x009c A[PHI: r14 r15
      0x009c: PHI (r14v7 boolean) = (r14v4 boolean), (r14v15 boolean) binds: [B:50:0x00b8, B:38:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r15v5 boolean) = (r15v2 boolean), (r15v13 boolean) binds: [B:50:0x00b8, B:38:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1 A[PHI: r14 r15
      0x00a1: PHI (r14v6 boolean) = (r14v4 boolean), (r14v15 boolean) binds: [B:50:0x00b8, B:38:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x00a1: PHI (r15v4 boolean) = (r15v2 boolean), (r15v13 boolean) binds: [B:50:0x00b8, B:38:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    public final b k(mj.a aVar, c cVar, boolean z5) throws h {
        int[] iArr;
        float[] fArr;
        float[] fArr2;
        int[] iArr2;
        int[] iArr3;
        boolean z6;
        boolean z7;
        boolean z10;
        boolean z11;
        boolean z12;
        int[] iArr4 = cVar.f21691b;
        int i7 = 0;
        while (true) {
            iArr = this.f21683b;
            if (i7 >= iArr.length) {
                break;
            }
            iArr[i7] = 0;
            i7++;
        }
        if (z5) {
            uj.h.f(iArr4[0], aVar, iArr);
        } else {
            uj.h.e(iArr4[1] + 1, aVar, iArr);
            int i10 = 0;
            for (int length = iArr.length - 1; i10 < length; length--) {
                int i11 = iArr[i10];
                iArr[i10] = iArr[length];
                iArr[length] = i11;
                i10++;
            }
        }
        int i12 = z5 ? 16 : 15;
        float fA = q.A(iArr) / i12;
        int i13 = 0;
        while (true) {
            int length2 = iArr.length;
            fArr = this.f21685d;
            fArr2 = this.f21684c;
            iArr2 = this.f21687f;
            iArr3 = this.f21686e;
            if (i13 >= length2) {
                break;
            }
            float f2 = iArr[i13] / fA;
            int i14 = (int) (0.5f + f2);
            if (i14 <= 0) {
                i14 = 1;
            } else if (i14 > 8) {
                i14 = 8;
            }
            int i15 = i13 / 2;
            if ((i13 & 1) == 0) {
                iArr3[i15] = i14;
                fArr2[i15] = f2 - i14;
            } else {
                iArr2[i15] = i14;
                fArr[i15] = f2 - i14;
            }
            i13++;
        }
        int iA = q.A(iArr3);
        int iA2 = q.A(iArr2);
        if (z5) {
            if (iA > 12) {
                z6 = false;
                z7 = true;
            } else if (iA < 4) {
                z7 = false;
                z6 = true;
            } else {
                z6 = false;
                z7 = false;
            }
            if (iA2 > 12) {
                z10 = false;
                z11 = true;
            } else if (iA2 < 4) {
                z11 = false;
                z10 = true;
            } else {
                z10 = false;
                z11 = false;
            }
        } else {
            if (iA > 11) {
                z6 = false;
                z7 = true;
            } else if (iA < 5) {
                z7 = false;
                z6 = true;
            } else {
                z6 = false;
                z7 = false;
            }
            if (iA2 > 10) {
                z10 = false;
                z11 = true;
            } else if (iA2 < 4) {
                z11 = false;
                z10 = true;
            } else {
                z10 = false;
                z11 = false;
            }
        }
        int i16 = (iA + iA2) - i12;
        boolean z13 = (iA & 1) == z5;
        boolean z14 = (iA2 & 1) == 1;
        if (i16 != 1) {
            z12 = true;
            if (i16 != -1) {
                if (i16 != 0) {
                    throw h.f11808i;
                }
                if (z13) {
                    if (!z14) {
                        throw h.f11808i;
                    }
                    if (iA < iA2) {
                        z6 = true;
                        z11 = true;
                    } else {
                        z7 = true;
                        z10 = true;
                    }
                } else if (z14) {
                    throw h.f11808i;
                }
            } else if (z13) {
                if (z14) {
                    throw h.f11808i;
                }
                z6 = true;
            } else {
                if (!z14) {
                    throw h.f11808i;
                }
                z10 = true;
            }
        } else if (z13) {
            if (z14) {
                throw h.f11808i;
            }
            z7 = true;
            z12 = true;
        } else {
            if (!z14) {
                throw h.f11808i;
            }
            z11 = true;
            z12 = true;
        }
        if (z6) {
            if (z7) {
                throw h.f11808i;
            }
            a.h(fArr2, iArr3);
        }
        if (z7) {
            a.g(fArr2, iArr3);
        }
        if (z10) {
            if (z11) {
                throw h.f11808i;
            }
            a.h(fArr2, iArr2);
        }
        if (z11) {
            a.g(fArr, iArr2);
        }
        int i17 = 0;
        int i18 = 0;
        for (int length3 = iArr3.length - 1; length3 >= 0; length3--) {
            int i19 = iArr3[length3];
            i17 = (i17 * 9) + i19;
            i18 += i19;
        }
        int i20 = 0;
        int i21 = 0;
        for (int length4 = iArr2.length - 1; length4 >= 0; length4--) {
            int i22 = iArr2[length4];
            i20 = (i20 * 9) + i22;
            i21 += i22;
        }
        int i23 = (i20 * 3) + i17;
        if (!z5) {
            if ((i21 & 1) != 0 || i21 > 10 || i21 < 4) {
                throw h.f11808i;
            }
            int i24 = (10 - i21) / 2;
            int i25 = f21698n[i24];
            return new b((m3.m.D(iArr2, 9 - i25, false) * j[i24]) + m3.m.D(iArr3, i25, true) + f21696l[i24], i23);
        }
        if ((i18 & 1) != 0 || i18 > 12 || i18 < 4) {
            throw h.f11808i;
        }
        int i26 = (12 - i18) / 2;
        int i27 = f21697m[i26];
        return new b((m3.m.D(iArr3, i27, false) * f21695i[i26]) + m3.m.D(iArr2, 9 - i27, z12) + k[i26], i23);
    }

    public final d l(mj.a aVar, boolean z5, int i7, Map map) {
        try {
            c cVarN = n(aVar, i7, z5, m(aVar, z5));
            if (map != null && map.get(ij.c.F) != null) {
                throw new ClassCastException();
            }
            b bVarK = k(aVar, cVarN, true);
            b bVarK2 = k(aVar, cVarN, false);
            return new d((bVarK.f21688a * 1597) + bVarK2.f21688a, (bVarK2.f21689b * 4) + bVarK.f21689b, cVarN);
        } catch (h unused) {
            return null;
        }
    }

    public final int[] m(mj.a aVar, boolean z5) throws h {
        int[] iArr = this.f21682a;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int i7 = aVar.f15838e;
        int i10 = 0;
        boolean z6 = false;
        while (i10 < i7) {
            z6 = !aVar.a(i10);
            if (z5 == z6) {
                break;
            }
            i10++;
        }
        int i11 = 0;
        int i12 = i10;
        while (i10 < i7) {
            if (aVar.a(i10) != z6) {
                iArr[i11] = iArr[i11] + 1;
            } else {
                if (i11 != 3) {
                    i11++;
                } else {
                    if (a.i(iArr)) {
                        return new int[]{i12, i10};
                    }
                    i12 += iArr[0] + iArr[1];
                    iArr[0] = iArr[2];
                    iArr[1] = iArr[3];
                    iArr[2] = 0;
                    iArr[3] = 0;
                    i11--;
                }
                iArr[i11] = 1;
                z6 = !z6;
            }
            i10++;
        }
        throw h.f11808i;
    }

    public final c n(mj.a aVar, int i7, boolean z5, int[] iArr) throws h {
        int i10;
        int i11;
        boolean zA = aVar.a(iArr[0]);
        int i12 = iArr[0] - 1;
        while (i12 >= 0 && zA != aVar.a(i12)) {
            i12--;
        }
        int i13 = i12 + 1;
        int i14 = iArr[0] - i13;
        int[] iArr2 = this.f21682a;
        System.arraycopy(iArr2, 0, iArr2, 1, iArr2.length - 1);
        iArr2[0] = i14;
        for (int i15 = 0; i15 < 9; i15++) {
            if (uj.h.d(iArr2, f21699o[i15], 0.45f) < 0.2f) {
                int i16 = iArr[1];
                if (z5) {
                    int i17 = aVar.f15838e - 1;
                    i10 = i17 - i16;
                    i11 = i17 - i13;
                } else {
                    i10 = i16;
                    i11 = i13;
                }
                return new c(i15, i11, i10, i7, new int[]{i13, i16});
            }
        }
        throw h.f11808i;
    }

    @Override // uj.h, ij.j
    public final void reset() {
        this.f21700g.clear();
        this.f21701h.clear();
    }
}
