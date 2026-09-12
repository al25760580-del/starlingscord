package lj;

import c5.e;
import ic.n0;
import ij.h;
import ij.m;
import mj.b;
import ue.i;
import w3.q;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f15093g = {3808, 476, 2107, 1799};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f15094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15099f;

    public a(b bVar) {
        this.f15094a = bVar;
    }

    public static m[] b(m[] mVarArr, int i7, int i10) {
        float f2 = i10 / (i7 * 2.0f);
        m mVar = mVarArr[0];
        float f7 = mVar.f11823a;
        m mVar2 = mVarArr[2];
        float f10 = mVar2.f11823a;
        float f11 = f7 - f10;
        float f12 = mVar.f11824b;
        float f13 = mVar2.f11824b;
        float f14 = f12 - f13;
        float f15 = (f7 + f10) / 2.0f;
        float f16 = (f12 + f13) / 2.0f;
        float f17 = f11 * f2;
        float f18 = f14 * f2;
        m mVar3 = new m(f15 + f17, f16 + f18);
        m mVar4 = new m(f15 - f17, f16 - f18);
        m mVar5 = mVarArr[1];
        float f19 = mVar5.f11823a;
        m mVar6 = mVarArr[3];
        float f20 = mVar6.f11823a;
        float f21 = f19 - f20;
        float f22 = mVar5.f11824b;
        float f23 = mVar6.f11824b;
        float f24 = f22 - f23;
        float f25 = (f19 + f20) / 2.0f;
        float f26 = (f22 + f23) / 2.0f;
        float f27 = f21 * f2;
        float f28 = f2 * f24;
        return new m[]{mVar3, new m(f25 + f27, f26 + f28), mVar4, new m(f25 - f27, f26 - f28)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final jj.a a(boolean z5) throws h {
        m mVarC;
        m mVar;
        m mVar2;
        m mVar3;
        int iY;
        int iY2;
        char c8;
        m mVarC2;
        m mVarC3;
        m mVar4;
        m mVar5;
        e eVar;
        boolean z6;
        e eVar2;
        e eVar3;
        e eVar4;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j;
        int i17;
        e eVar5;
        b bVar = this.f15094a;
        int i18 = -1;
        int i19 = 1;
        int i20 = 0;
        try {
            try {
                m[] mVarArrB = new n0(bVar).b();
                mVar2 = mVarArrB[0];
                mVar3 = mVarArrB[1];
                mVar = mVarArrB[2];
                mVarC = mVarArrB[3];
                while (true) {
                    i7 = eVar4.f3486c;
                    i10 = eVar4.f3485b;
                    i11 = eVar.f3486c;
                    i12 = i20;
                    i13 = eVar.f3485b;
                    char c10 = c8;
                    if (this.f15098e >= 9) {
                        i14 = i19;
                        break;
                    }
                    e eVarE = e(eVar, z6, i19, i18);
                    int i21 = eVarE.f3486c;
                    int i22 = eVarE.f3485b;
                    e eVarE2 = e(eVar2, z6, i19, i19);
                    e eVarE3 = e(eVar3, z6, i18, i19);
                    e eVarE4 = e(eVar4, z6, i18, i18);
                    int i23 = eVarE4.f3486c;
                    i14 = i19;
                    int i24 = eVarE4.f3485b;
                    if (this.f15098e > 2) {
                        int i25 = i24 - i22;
                        int i26 = i23 - i21;
                        int i27 = i10 - i13;
                        int i28 = i7 - i11;
                        double dSqrt = (((float) Math.sqrt((i26 * i26) + (i25 * i25))) * this.f15098e) / (((float) Math.sqrt((i28 * i28) + (i27 * i27))) * (this.f15098e + 2));
                        if (dSqrt < 0.75d || dSqrt > 1.25d) {
                            break;
                        }
                        eVar5 = eVarE;
                        e eVar6 = new e(i22 - 3, i21 + 3, 5);
                        e eVar7 = new e(eVarE2.f3485b - 3, eVarE2.f3486c - 3, 5);
                        e eVar8 = new e(eVarE3.f3485b + 3, eVarE3.f3486c - 3, 5);
                        e eVar9 = new e(i24 + 3, i23 + 3, 5);
                        int iC = c(eVar9, eVar6);
                        if (iC == 0 || c(eVar6, eVar7) != iC || c(eVar7, eVar8) != iC || c(eVar8, eVar9) != iC) {
                            break;
                        }
                    } else {
                        eVar5 = eVarE;
                    }
                    z6 = !z6;
                    this.f15098e++;
                    i20 = i12;
                    c8 = c10;
                    eVar = eVar5;
                    i19 = i14;
                    eVar4 = eVarE4;
                    eVar2 = eVarE2;
                    eVar3 = eVarE3;
                    i18 = -1;
                }
            } catch (h unused) {
                int i29 = bVar.f15839d / 2;
                int i30 = bVar.f15840e / 2;
                int i31 = i29 + 7;
                int i32 = i30 - 7;
                m mVarC4 = e(new e(i31, i32, 5), false, 1, -1).c();
                int i33 = i30 + 7;
                m mVarC5 = e(new e(i31, i33, 5), false, 1, 1).c();
                int i34 = i29 - 7;
                m mVarC6 = e(new e(i34, i33, 5), false, -1, 1).c();
                mVarC = e(new e(i34, i32, 5), false, -1, -1).c();
                mVar = mVarC6;
                mVar2 = mVarC4;
                mVar3 = mVarC5;
            }
            m[] mVarArrB2 = new n0(bVar, 15, iY, iY2).b();
            mVar5 = mVarArrB2[0];
            mVar4 = mVarArrB2[1];
            mVarC2 = mVarArrB2[2];
            mVarC3 = mVarArrB2[3];
        } catch (h unused2) {
            int i35 = iY + 7;
            int i36 = iY2 - 7;
            m mVarC7 = e(new e(i35, i36, 5), false, 1, -1).c();
            int i37 = iY2 + 7;
            m mVarC8 = e(new e(i35, i37, 5), false, 1, 1).c();
            int i38 = iY - 7;
            mVarC2 = e(new e(i38, i37, 5), false, -1, 1).c();
            mVarC3 = e(new e(i38, i36, 5), false, -1, -1).c();
            mVar4 = mVarC8;
            mVar5 = mVarC7;
        }
        iY = q.y((((mVar2.f11823a + mVarC.f11823a) + mVar3.f11823a) + mVar.f11823a) / 4.0f);
        iY2 = q.y((((mVar2.f11824b + mVarC.f11824b) + mVar3.f11824b) + mVar.f11824b) / 4.0f);
        c8 = 15;
        eVar = new e(q.y((((mVar5.f11823a + mVarC3.f11823a) + mVar4.f11823a) + mVarC2.f11823a) / 4.0f), q.y((((mVar5.f11824b + mVarC3.f11824b) + mVar4.f11824b) + mVarC2.f11824b) / 4.0f), 5);
        this.f15098e = 1;
        z6 = true;
        eVar2 = eVar;
        eVar3 = eVar2;
        eVar4 = eVar3;
        int i39 = this.f15098e;
        if (i39 != 5 && i39 != 7) {
            throw h.f11808i;
        }
        this.f15095b = i39 == 5 ? i14 : i12;
        int i40 = i39 * 2;
        m[] mVarArrB3 = b(new m[]{new m(i13 + 0.5f, i11 - 0.5f), new m(eVar2.f3485b + 0.5f, eVar2.f3486c + 0.5f), new m(eVar3.f3485b - 0.5f, eVar3.f3486c + 0.5f), new m(i10 - 0.5f, i7 - 0.5f)}, i40 - 3, i40);
        if (z5) {
            m mVar6 = mVarArrB3[i12];
            mVarArrB3[i12] = mVarArrB3[2];
            mVarArrB3[2] = mVar6;
        }
        if (!g(mVarArrB3[i12]) || !g(mVarArrB3[i14]) || !g(mVarArrB3[2]) || !g(mVarArrB3[r2])) {
            throw h.f11808i;
        }
        int i41 = this.f15098e * 2;
        int[] iArr = {h(mVarArrB3[i12], mVarArrB3[i14], i41), h(mVarArrB3[i14], mVarArrB3[2], i41), h(mVarArrB3[2], mVarArrB3[r2], i41), h(mVarArrB3[3], mVarArrB3[i12], i41)};
        int i42 = i12;
        int i43 = i42;
        while (i42 < 4) {
            int i44 = iArr[i42];
            i43 = (i43 << 3) + ((i44 >> (i41 - 2)) << 1) + (i44 & 1);
            i42++;
        }
        int i45 = ((i43 & 1) << 11) + (i43 >> 1);
        for (int i46 = i12; i46 < 4; i46++) {
            if (Integer.bitCount(f15093g[i46] ^ i45) <= 2) {
                this.f15099f = i46;
                long j5 = 0;
                int i47 = i12;
                while (true) {
                    i15 = 10;
                    if (i47 >= 4) {
                        break;
                    }
                    int i48 = iArr[(this.f15099f + i47) % 4];
                    if (this.f15095b) {
                        j = j5 << 7;
                        i17 = (i48 >> 1) & 127;
                    } else {
                        j = j5 << 10;
                        i17 = ((i48 >> 2) & 992) + ((i48 >> 1) & 31);
                    }
                    j5 = j + ((long) i17);
                    i47++;
                }
                if (this.f15095b) {
                    i15 = 7;
                    i16 = 2;
                } else {
                    i16 = 4;
                }
                int i49 = i15 - i16;
                int[] iArr2 = new int[i15];
                for (int i50 = i15 - 1; i50 >= 0; i50--) {
                    iArr2[i50] = ((int) j5) & 15;
                    j5 >>= 4;
                }
                try {
                    new i(oj.a.k).h(i49, iArr2);
                    int i51 = i12;
                    int i52 = i51;
                    while (i51 < i16) {
                        i52 = (i52 << 4) + iArr2[i51];
                        i51++;
                    }
                    if (this.f15095b) {
                        this.f15096c = (i52 >> 6) + 1;
                        this.f15097d = (i52 & 63) + 1;
                    } else {
                        this.f15096c = (i52 >> 11) + 1;
                        this.f15097d = (i52 & 2047) + 1;
                    }
                    int i53 = this.f15099f;
                    m mVar7 = mVarArrB3[i53 % 4];
                    m mVar8 = mVarArrB3[(i53 + 1) % 4];
                    m mVar9 = mVarArrB3[(i53 + 2) % 4];
                    m mVar10 = mVarArrB3[(i53 + 3) % 4];
                    int iD = d();
                    float f2 = iD / 2.0f;
                    float f7 = this.f15098e;
                    float f10 = f2 - f7;
                    float f11 = f2 + f7;
                    return new jj.a(android.support.v4.media.session.b.t(bVar, iD, iD, mj.e.a(f10, f10, f11, f10, f11, f11, f10, f11, mVar7.f11823a, mVar7.f11824b, mVar8.f11823a, mVar8.f11824b, mVar9.f11823a, mVar9.f11824b, mVar10.f11823a, mVar10.f11824b)), b(mVarArrB3, this.f15098e * 2, d()), this.f15095b, this.f15097d, this.f15096c);
                } catch (oj.b unused3) {
                    throw h.f11808i;
                }
            }
        }
        throw h.f11808i;
    }

    public final int c(e eVar, e eVar2) {
        int i7 = eVar.f3485b;
        int i10 = eVar.f3486c;
        int i11 = eVar2.f3485b;
        int i12 = eVar2.f3486c;
        int i13 = i7 - i11;
        int i14 = i10 - i12;
        float fSqrt = (float) Math.sqrt((i14 * i14) + (i13 * i13));
        float f2 = (i11 - i7) / fSqrt;
        float f7 = (i12 - i10) / fSqrt;
        float f10 = i7;
        float f11 = i10;
        b bVar = this.f15094a;
        boolean zB = bVar.b(i7, i10);
        int iCeil = (int) Math.ceil(fSqrt);
        int i15 = 0;
        for (int i16 = 0; i16 < iCeil; i16++) {
            f10 += f2;
            f11 += f7;
            if (bVar.b(q.y(f10), q.y(f11)) != zB) {
                i15++;
            }
        }
        float f12 = i15 / fSqrt;
        if (f12 <= 0.1f || f12 >= 0.9f) {
            return (f12 <= 0.1f) == zB ? 1 : -1;
        }
        return 0;
    }

    public final int d() {
        if (this.f15095b) {
            return (this.f15096c * 4) + 11;
        }
        int i7 = this.f15096c;
        if (i7 <= 4) {
            return (i7 * 4) + 15;
        }
        return ((((i7 - 4) / 8) + 1) * 2) + (i7 * 4) + 15;
    }

    public final e e(e eVar, boolean z5, int i7, int i10) {
        b bVar;
        int i11 = eVar.f3485b + i7;
        int i12 = eVar.f3486c;
        while (true) {
            i12 += i10;
            boolean zF = f(i11, i12);
            bVar = this.f15094a;
            if (!zF || bVar.b(i11, i12) != z5) {
                break;
            }
            i11 += i7;
        }
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        while (f(i13, i14) && bVar.b(i13, i14) == z5) {
            i13 += i7;
        }
        int i15 = i13 - i7;
        while (f(i15, i14) && bVar.b(i15, i14) == z5) {
            i14 += i10;
        }
        return new e(i15, i14 - i10, 5);
    }

    public final boolean f(int i7, int i10) {
        if (i7 < 0) {
            return false;
        }
        b bVar = this.f15094a;
        return i7 < bVar.f15839d && i10 > 0 && i10 < bVar.f15840e;
    }

    public final boolean g(m mVar) {
        return f(q.y(mVar.f11823a), q.y(mVar.f11824b));
    }

    public final int h(m mVar, m mVar2, int i7) {
        float f2 = mVar.f11823a;
        float f7 = mVar.f11824b;
        float f10 = mVar2.f11823a;
        float f11 = mVar2.f11824b;
        float f12 = f2 - f10;
        float f13 = f7 - f11;
        float fSqrt = (float) Math.sqrt((f13 * f13) + (f12 * f12));
        float f14 = fSqrt / i7;
        float f15 = mVar.f11823a;
        float f16 = ((mVar2.f11823a - f15) * f14) / fSqrt;
        float f17 = ((f11 - f7) * f14) / fSqrt;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            float f18 = i11;
            if (this.f15094a.b(q.y((f18 * f16) + f15), q.y((f18 * f17) + f7))) {
                i10 |= 1 << ((i7 - i11) - 1);
            }
        }
        return i10;
    }
}
