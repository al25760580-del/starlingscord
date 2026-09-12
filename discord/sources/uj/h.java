package uj;

import com.google.zxing.Result;
import e4.r;
import ij.l;
import ij.m;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h implements ij.j {
    public static float d(int[] iArr, int[] iArr2, float f2) {
        int length = iArr.length;
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            i7 += iArr[i11];
            i10 += iArr2[i11];
        }
        if (i7 < i10) {
            return Float.POSITIVE_INFINITY;
        }
        float f7 = i7;
        float f10 = f7 / i10;
        float f11 = f2 * f10;
        float f12 = 0.0f;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            float f13 = iArr2[i12] * f10;
            float f14 = i13;
            float f15 = f14 > f13 ? f14 - f13 : f13 - f14;
            if (f15 > f11) {
                return Float.POSITIVE_INFINITY;
            }
            f12 += f15;
        }
        return f12 / f7;
    }

    public static void e(int i7, mj.a aVar, int[] iArr) throws ij.h {
        int length = iArr.length;
        int i10 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int i11 = aVar.f15838e;
        if (i7 >= i11) {
            throw ij.h.f11808i;
        }
        boolean z5 = !aVar.a(i7);
        while (i7 < i11) {
            if (aVar.a(i7) == z5) {
                i10++;
                if (i10 == length) {
                    break;
                }
                iArr[i10] = 1;
                z5 = !z5;
            } else {
                iArr[i10] = iArr[i10] + 1;
            }
            i7++;
        }
        if (i10 != length) {
            if (i10 != length - 1 || i7 != i11) {
                throw ij.h.f11808i;
            }
        }
    }

    public static void f(int i7, mj.a aVar, int[] iArr) throws ij.h {
        int length = iArr.length;
        boolean zA = aVar.a(i7);
        while (i7 > 0 && length >= 0) {
            i7--;
            if (aVar.a(i7) != zA) {
                length--;
                zA = !zA;
            }
        }
        if (length >= 0) {
            throw ij.h.f11808i;
        }
        e(i7 + 1, aVar, iArr);
    }

    @Override // ij.j
    public Result a(r rVar, Map map) throws ij.h {
        mj.d dVar = (mj.d) rVar.f8034e;
        try {
            return c(rVar, map);
        } catch (ij.h e10) {
            if (map == null || !map.containsKey(ij.c.f11796i) || !dVar.f15849a.e()) {
                throw e10;
            }
            ij.f fVarF = dVar.f15849a.f();
            Result resultC = c(new r(9, new mj.d(fVarF)), map);
            Map map2 = resultC.f6652e;
            l lVar = l.f11816d;
            int iIntValue = 270;
            if (map2 != null && map2.containsKey(lVar)) {
                iIntValue = (((Integer) map2.get(lVar)).intValue() + 270) % 360;
            }
            resultC.b(lVar, Integer.valueOf(iIntValue));
            m[] mVarArr = resultC.f6650c;
            if (mVarArr != null) {
                int i7 = fVarF.f11805c;
                for (int i10 = 0; i10 < mVarArr.length; i10++) {
                    m mVar = mVarArr[i10];
                    mVarArr[i10] = new m((i7 - mVar.f11824b) - 1.0f, mVar.f11823a);
                }
            }
            return resultC;
        }
    }

    public abstract Result b(int i7, mj.a aVar, Map map);

    public final Result c(r rVar, Map map) throws ij.h {
        int i7;
        r rVar2 = rVar;
        Map map2 = map;
        ij.f fVar = ((mj.d) rVar2.f8034e).f15849a;
        int i10 = fVar.f11804b;
        int i11 = fVar.f11805c;
        mj.a aVar = new mj.a(i10);
        int i12 = 1;
        boolean z5 = map2 != null && map2.containsKey(ij.c.f11796i);
        int iMax = Math.max(1, i11 >> (z5 ? 8 : 5));
        int i13 = z5 ? i11 : 15;
        int i14 = i11 / 2;
        int i15 = 0;
        while (i15 < i13) {
            int i16 = i15 + 1;
            int i17 = i16 / 2;
            if ((i15 & 1) != 0) {
                i17 = -i17;
            }
            int i18 = (i17 * iMax) + i14;
            if (i18 < 0 || i18 >= i11) {
                break;
            }
            try {
                aVar = rVar2.F(aVar, i18);
                int i19 = 0;
                while (i19 < 2) {
                    if (i19 == i12) {
                        aVar.e();
                        if (map2 != null) {
                            Object obj = ij.c.F;
                            if (map2.containsKey(obj)) {
                                EnumMap enumMap = new EnumMap(ij.c.class);
                                enumMap.putAll(map2);
                                enumMap.remove(obj);
                                map2 = enumMap;
                            }
                        }
                    }
                    try {
                        Result resultB = b(i18, aVar, map2);
                        if (i19 == i12) {
                            try {
                                resultB.b(l.f11816d, 180);
                                m[] mVarArr = resultB.f6650c;
                                if (mVarArr != null) {
                                    i7 = i12;
                                    float f2 = i10;
                                    try {
                                        m mVar = mVarArr[0];
                                        try {
                                            mVarArr[0] = new m((f2 - mVar.f11823a) - 1.0f, mVar.f11824b);
                                            m mVar2 = mVarArr[i7];
                                            mVarArr[i7] = new m((f2 - mVar2.f11823a) - 1.0f, mVar2.f11824b);
                                        } catch (ij.k unused) {
                                            continue;
                                            i19++;
                                            map2 = map2;
                                            i12 = i7;
                                        }
                                    } catch (ij.k unused2) {
                                    }
                                }
                            } catch (ij.k unused3) {
                                i7 = i12;
                            }
                        }
                        return resultB;
                    } catch (ij.k unused4) {
                        i7 = i12;
                    }
                }
            } catch (ij.h unused5) {
            }
            rVar2 = rVar;
            i15 = i16;
            i12 = i12;
        }
        throw ij.h.f11808i;
    }

    @Override // ij.j
    public void reset() {
    }
}
