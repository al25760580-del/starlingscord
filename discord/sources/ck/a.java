package ck;

import a3.f;
import com.google.zxing.Result;
import dk.g;
import e4.r;
import gc.s0;
import ij.b;
import ij.c;
import ij.d;
import ij.h;
import ij.j;
import ij.l;
import ij.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mj.e;
import ue.i;
import w3.q;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m[] f3728b = new m[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f3729a = new i(8, false);

    @Override // ij.j
    public final Result a(r rVar, Map map) throws b, d, h {
        ek.a aVarF;
        int i7;
        float f2;
        float f7;
        float f10;
        float f11;
        float f12;
        int i10;
        m[] mVarArr;
        s0 s0VarG;
        m[] mVarArr2;
        int i11;
        int iAbs;
        int i12;
        int i13;
        int i14 = 3;
        i iVar = this.f3729a;
        int i15 = 1;
        int i16 = 0;
        if (map == null || !map.containsKey(c.f11794d)) {
            mj.b bVarE = rVar.E();
            u4.c cVar = new u4.c(bVarE);
            if (map != null && map.get(c.F) != null) {
                throw new ClassCastException();
            }
            f fVar = new f(bVarE, 4);
            ArrayList arrayList = (ArrayList) fVar.f69c;
            boolean z5 = map != null && map.containsKey(c.f11796i);
            int i17 = bVarE.f15840e;
            int i18 = bVarE.f15839d;
            int i19 = (i17 * 3) / 388;
            if (i19 < 3 || z5) {
                i19 = 3;
            }
            int[] iArr = new int[5];
            int i20 = i19 - 1;
            boolean zL = false;
            while (true) {
                aVarF = null;
                if (i20 >= i17 || zL) {
                    break;
                }
                f.c(iArr);
                int i21 = i14;
                int i22 = 0;
                int i23 = 0;
                while (i23 < i18) {
                    if (bVarE.b(i23, i20)) {
                        if ((i22 & 1) == i15) {
                            i22++;
                        }
                        iArr[i22] = iArr[i22] + i15;
                    } else if ((i22 & 1) != 0) {
                        iArr[i22] = iArr[i22] + 1;
                    } else if (i22 == 4) {
                        if (!f.i(iArr)) {
                            int i24 = i15;
                            iArr[0] = iArr[2];
                            iArr[i24] = iArr[i21];
                            iArr[2] = iArr[4];
                            iArr[i21] = i24;
                            iArr[4] = 0;
                        } else if (fVar.k(i20, i23, iArr)) {
                            if (fVar.f67a) {
                                zL = fVar.l();
                                i11 = 2;
                            } else {
                                if (arrayList.size() > i15) {
                                    Iterator it = arrayList.iterator();
                                    ek.c cVar2 = null;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i11 = 2;
                                            iAbs = 0;
                                            break;
                                        }
                                        ek.c cVar3 = (ek.c) it.next();
                                        Iterator it2 = it;
                                        if (cVar3.f8449d >= 2) {
                                            if (cVar2 != null) {
                                                fVar.f67a = true;
                                                i11 = 2;
                                                iAbs = ((int) (Math.abs(cVar2.f11823a - cVar3.f11823a) - Math.abs(cVar2.f11824b - cVar3.f11824b))) / 2;
                                                break;
                                            }
                                            cVar2 = cVar3;
                                        }
                                        it = it2;
                                    }
                                } else {
                                    iAbs = 0;
                                    i11 = 2;
                                }
                                int i25 = iArr[i11];
                                if (iAbs > i25) {
                                    i20 += (iAbs - i25) - 2;
                                    i23 = i18 - 1;
                                }
                            }
                            f.c(iArr);
                            i22 = 0;
                            i19 = i11;
                        } else {
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[i21];
                            iArr[2] = iArr[4];
                            iArr[i21] = 1;
                            iArr[4] = 0;
                        }
                        i22 = i21;
                    } else {
                        i22++;
                        iArr[i22] = iArr[i22] + 1;
                    }
                    i23++;
                    i15 = 1;
                }
                if (f.i(iArr) && fVar.k(i20, i18, iArr)) {
                    int i26 = iArr[0];
                    if (fVar.f67a) {
                        i19 = i26;
                        zL = fVar.l();
                    } else {
                        i19 = i26;
                    }
                }
                i20 += i19;
                i14 = i21;
                i15 = 1;
            }
            int i27 = i14;
            int size = arrayList.size();
            if (size < i27) {
                throw h.f11808i;
            }
            float f13 = 0.0f;
            if (size > i27) {
                Iterator it3 = arrayList.iterator();
                float f14 = 0.0f;
                float f15 = 0.0f;
                while (it3.hasNext()) {
                    float f16 = ((ek.c) it3.next()).f8448c;
                    f14 += f16;
                    f15 += f16 * f16;
                }
                float f17 = size;
                float f18 = f14 / f17;
                float fSqrt = (float) Math.sqrt((f15 / f17) - (f18 * f18));
                Collections.sort(arrayList, new ek.d(f18, 1));
                float fMax = Math.max(0.2f * f18, fSqrt);
                int i28 = 0;
                while (i28 < arrayList.size() && arrayList.size() > 3) {
                    if (Math.abs(((ek.c) arrayList.get(i28)).f8448c - f18) > fMax) {
                        arrayList.remove(i28);
                        i28--;
                    }
                    i28++;
                }
            }
            if (arrayList.size() > 3) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    f13 += ((ek.c) it4.next()).f8448c;
                }
                i7 = 0;
                Collections.sort(arrayList, new ek.d(f13 / arrayList.size(), 0));
                arrayList.subList(3, arrayList.size()).clear();
            } else {
                i7 = 0;
            }
            ek.c[] cVarArr = {(ek.c) arrayList.get(i7), (ek.c) arrayList.get(1), (ek.c) arrayList.get(2)};
            m.b(cVarArr);
            ek.c cVar4 = cVarArr[i7];
            ek.c cVar5 = cVarArr[1];
            ek.c cVar6 = cVarArr[2];
            float fA = cVar.a(cVar5, cVar6);
            float f19 = cVar5.f11824b;
            float f20 = cVar5.f11823a;
            float f21 = cVar6.f11824b;
            float f22 = cVar6.f11823a;
            float fA2 = cVar.a(cVar5, cVar4);
            float f23 = cVar4.f11824b;
            float f24 = cVar4.f11823a;
            float f25 = (fA2 + fA) / 2.0f;
            if (f25 < 1.0f) {
                throw h.f11808i;
            }
            int iY = (q.y(m.a(cVar5, cVar4) / f25) + q.y(m.a(cVar5, cVar6) / f25)) / 2;
            int i29 = iY + 7;
            int i30 = i29 & 3;
            if (i30 == 0) {
                i29 = iY + 8;
            } else if (i30 == 2) {
                i29 = iY + 6;
            } else if (i30 == 3) {
                throw h.f11808i;
            }
            int i31 = i29;
            int[] iArr2 = g.f7664e;
            if (i31 % 4 != 1) {
                throw d.a();
            }
            try {
                g gVarC = g.c((i31 - 17) / 4);
                int i32 = (gVarC.f7666a * 4) + 10;
                if (gVarC.f7667b.length > 0) {
                    float f26 = (f22 - f20) + f24;
                    f7 = f22;
                    float f27 = (f21 - f19) + f23;
                    float f28 = 1.0f - (3.0f / i32);
                    int iC = (int) kk.b.c(f26, f20, f28, f20);
                    int iC2 = (int) kk.b.c(f27, f19, f28, f19);
                    f2 = f19;
                    for (int i33 = 4; i33 <= 16; i33 <<= 1) {
                        try {
                            aVarF = cVar.f(f25, i33, iC, iC2);
                            break;
                        } catch (h unused) {
                        }
                    }
                } else {
                    f2 = f19;
                    f7 = f22;
                }
                ek.a aVar = aVarF;
                float f29 = i31 - 3.5f;
                if (aVar != null) {
                    f10 = aVar.f11823a;
                    f11 = aVar.f11824b;
                    f12 = f29 - 3.0f;
                } else {
                    f10 = (f7 - f20) + f24;
                    f11 = (f21 - f2) + f23;
                    f12 = f29;
                }
                mj.b bVarT = android.support.v4.media.session.b.t(bVarE, i31, i31, e.a(3.5f, 3.5f, f29, 3.5f, f12, f12, 3.5f, f29, cVar5.f11823a, cVar5.f11824b, cVar6.f11823a, cVar6.f11824b, f10, f11, cVar4.f11823a, cVar4.f11824b));
                if (aVar == null) {
                    i10 = 3;
                    mVarArr = new m[]{cVar4, cVar5, cVar6};
                } else {
                    i10 = 3;
                    mVarArr = new m[]{cVar4, cVar5, cVar6, aVar};
                }
                s0VarG = iVar.g(bVarT, map);
                mVarArr2 = mVarArr;
            } catch (IllegalArgumentException unused2) {
                throw d.a();
            }
        } else {
            mj.b bVarE2 = rVar.E();
            int[] iArrE = bVarE2.e();
            int i34 = bVarE2.f15839d;
            int[] iArrC = bVarE2.c();
            if (iArrE == null || iArrC == null) {
                throw h.f11808i;
            }
            int i35 = bVarE2.f15840e;
            int i36 = iArrE[0];
            int i37 = iArrE[1];
            boolean z6 = true;
            int i38 = 0;
            while (true) {
                if (i36 >= i34 || i37 >= i35) {
                    i13 = i16;
                    break;
                }
                i13 = i16;
                if (z6 != bVarE2.b(i36, i37)) {
                    int i39 = i38 + 1;
                    if (i39 == 5) {
                        break;
                    }
                    z6 = !z6;
                    i38 = i39;
                }
                i36++;
                i37++;
                i16 = i13;
            }
            if (i36 == i34 || i37 == i35) {
                throw h.f11808i;
            }
            int i40 = iArrE[i13];
            float f30 = (i36 - i40) / 7.0f;
            int i41 = iArrE[1];
            int i42 = iArrC[1];
            int i43 = iArrC[i13];
            if (i40 >= i43 || i41 >= i42) {
                throw h.f11808i;
            }
            int i44 = i42 - i41;
            if (i44 != i43 - i40 && (i43 = i40 + i44) >= i34) {
                throw h.f11808i;
            }
            int iRound = Math.round(((i43 - i40) + 1) / f30);
            int iRound2 = Math.round((i44 + 1) / f30);
            if (iRound <= 0 || iRound2 <= 0) {
                throw h.f11808i;
            }
            if (iRound2 != iRound) {
                throw h.f11808i;
            }
            int i45 = (int) (f30 / 2.0f);
            int i46 = i41 + i45;
            int i47 = i40 + i45;
            int i48 = (((int) ((iRound - 1) * f30)) + i47) - i43;
            if (i48 > 0) {
                if (i48 > i45) {
                    throw h.f11808i;
                }
                i47 -= i48;
            }
            int i49 = (((int) ((iRound2 - 1) * f30)) + i46) - i42;
            if (i49 > 0) {
                if (i49 > i45) {
                    throw h.f11808i;
                }
                i46 -= i49;
            }
            mj.b bVar = new mj.b(iRound, iRound2);
            for (int i50 = i13; i50 < iRound2; i50++) {
                int i51 = ((int) (i50 * f30)) + i46;
                for (int i52 = i13; i52 < iRound; i52++) {
                    if (bVarE2.b(((int) (i52 * f30)) + i47, i51)) {
                        bVar.f(i52, i50);
                    }
                }
            }
            s0VarG = iVar.g(bVar, map);
            mVarArr2 = f3728b;
            i10 = 3;
        }
        int i53 = s0VarG.f9840b;
        if ((s0VarG.f9845g instanceof dk.f) && mVarArr2.length >= i10) {
            m mVar = mVarArr2[0];
            mVarArr2[0] = mVarArr2[2];
            mVarArr2[2] = mVar;
        }
        Result result = new Result(s0VarG.f9839a, (byte[]) s0VarG.f9842d, mVarArr2, ij.a.I);
        List list = (List) s0VarG.f9844f;
        if (list != null) {
            result.b(l.f11817e, list);
        }
        String str = (String) s0VarG.f9843e;
        if (str != null) {
            result.b(l.f11818i, str);
        }
        if (i53 >= 0 && (i12 = s0VarG.f9841c) >= 0) {
            result.b(l.F, Integer.valueOf(i12));
            result.b(l.G, Integer.valueOf(i53));
        }
        return result;
    }

    @Override // ij.j
    public final void reset() {
    }
}
