package jj;

import com.google.zxing.Result;
import e4.r;
import gc.s0;
import ij.c;
import ij.d;
import ij.h;
import ij.j;
import ij.l;
import ij.m;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import we.k;
import zj.f;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13916a;

    public /* synthetic */ b(int i7) {
        this.f13916a = i7;
    }

    public static int b(m mVar, m mVar2) {
        if (mVar == null || mVar2 == null) {
            return 0;
        }
        return (int) Math.abs(mVar.f11823a - mVar2.f11823a);
    }

    public static int c(m mVar, m mVar2) {
        if (mVar == null || mVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(mVar.f11823a - mVar2.f11823a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0257 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0259  */
    /* JADX WARN: Code duplicated, block: B:103:0x025d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0261  */
    /* JADX WARN: Code duplicated, block: B:106:0x0269 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x026b  */
    /* JADX WARN: Code duplicated, block: B:108:0x026f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0273  */
    /* JADX WARN: Code duplicated, block: B:114:0x0281 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x0283  */
    /* JADX WARN: Code duplicated, block: B:116:0x0286  */
    /* JADX WARN: Code duplicated, block: B:117:0x0289  */
    /* JADX WARN: Code duplicated, block: B:134:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:135:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:139:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:142:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:145:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:148:0x031f  */
    /* JADX WARN: Code duplicated, block: B:26:0x014e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0176  */
    /* JADX WARN: Code duplicated, block: B:42:0x0179 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x017c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v33, types: [ae.b] */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v47 */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v11, types: [e4.r] */
    /* JADX WARN: Type inference failed for: r11v28, types: [e4.r] */
    /* JADX WARN: Type inference failed for: r11v33, types: [e4.r] */
    /* JADX WARN: Type inference failed for: r11v43, types: [e4.r] */
    /* JADX WARN: Type inference failed for: r12v26, types: [e4.r] */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v39, types: [we.k] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r13v48 */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v5, types: [we.k] */
    /* JADX WARN: Type inference failed for: r15v17, types: [e4.r] */
    /* JADX WARN: Type inference failed for: r15v29, types: [e4.r] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v16, types: [zj.d] */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v19 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v20 */
    /* JADX WARN: Type inference failed for: r18v21 */
    /* JADX WARN: Type inference failed for: r18v22 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v46, types: [e4.r] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v14, types: [zj.d] */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [ae.b] */
    /* JADX WARN: Type inference failed for: r2v21, types: [e4.r] */
    /* JADX WARN: Type inference failed for: r2v41, types: [e4.r] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r4v36, types: [e4.r] */
    /* JADX WARN: Type inference failed for: r6v19, types: [e4.r] */
    /* JADX WARN: Type inference failed for: r6v25, types: [e4.r] */
    /* JADX WARN: Type inference failed for: r8v15, types: [e4.r[]] */
    /* JADX WARN: Type inference failed for: r9v16, types: [e4.r] */
    /* JADX WARN: Type inference failed for: r9v22, types: [e4.r] */
    /* JADX WARN: Type inference failed for: r9v56, types: [e4.r] */
    /* JADX WARN: Type inference failed for: r9v58, types: [ae.b[]] */
    /* JADX WARN: Type inference failed for: r9v7, types: [e4.r] */
    /* JADX WARN: Type inference failed for: r9v8, types: [e4.r] */
    @Override // ij.j
    public final Result a(r rVar, Map map) throws ij.b, d, h {
        m[] mVarArr;
        s0 s0VarA;
        d dVar;
        byte[] bArr;
        mj.b bVar;
        Result result;
        int i7;
        int i10;
        int i11;
        int i12;
        ?? r18;
        ?? r13;
        ?? r10;
        int i13;
        ae.b[] bVarArr;
        int i14;
        ae.b[] bVarArr2;
        int i15;
        int i16;
        int i17;
        int i18;
        s0 s0VarB;
        int i19;
        int i20;
        int i21;
        ?? r12;
        ae.b bVar2;
        Iterator it;
        ?? r5;
        ae.b bVarG;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int iMax;
        int i29;
        ae.b bVarC;
        ae.b bVar3;
        ?? D;
        ?? C0;
        ?? kVar;
        ae.b bVarC0;
        ae.b bVarC1;
        zj.b bVar4;
        zj.d dVarD;
        int i30 = this.f13916a;
        l lVar = l.f11818i;
        int i31 = 1;
        int i32 = 0;
        switch (i30) {
            case 0:
                h hVar = null;
                lj.a aVar = new lj.a(rVar.E());
                try {
                    a aVarA = aVar.a(false);
                    mVarArr = (m[]) aVarA.f13915e;
                    try {
                        s0VarA = new kj.a().a(aVarA);
                        dVar = null;
                    } catch (d e10) {
                        e = e10;
                        dVar = e;
                        s0VarA = null;
                    } catch (h e11) {
                        e = e11;
                        s0VarA = null;
                        dVar = null;
                        hVar = e;
                    }
                } catch (d e12) {
                    e = e12;
                    mVarArr = null;
                } catch (h e13) {
                    e = e13;
                    mVarArr = null;
                }
                if (s0VarA == null) {
                    try {
                        a aVarA2 = aVar.a(true);
                        mVarArr = (m[]) aVarA2.f13915e;
                        s0VarA = new kj.a().a(aVarA2);
                    } catch (d | h e14) {
                        if (hVar != null) {
                            throw hVar;
                        }
                        if (dVar != null) {
                            throw dVar;
                        }
                        throw e14;
                    }
                    break;
                }
                m[] mVarArr2 = mVarArr;
                if (map != null && map.get(c.F) != null) {
                    throw new ClassCastException();
                }
                String str = s0VarA.f9839a;
                byte[] bArr2 = (byte[]) s0VarA.f9842d;
                System.currentTimeMillis();
                Result result2 = new Result(str, bArr2, mVarArr2, ij.a.f11786d, 0);
                List list = (List) s0VarA.f9844f;
                if (list != null) {
                    result2.b(l.f11817e, list);
                }
                String str2 = (String) s0VarA.f9843e;
                if (str2 != null) {
                    result2.b(lVar, str2);
                }
                return result2;
            default:
                ArrayList arrayList = new ArrayList();
                mj.b bVarE = rVar.E();
                ArrayList arrayListA = bk.a.a(bVarE);
                int i33 = 2;
                if (arrayListA.isEmpty()) {
                    int i34 = bVarE.f15839d;
                    int i35 = bVarE.f15840e;
                    mj.b bVar5 = new mj.b(i34, i35, bVarE.f15841i, (int[]) bVarE.f15842v.clone());
                    mj.a aVar2 = new mj.a(i34);
                    mj.a aVar3 = new mj.a(i34);
                    for (int i36 = 0; i36 < (i35 + 1) / 2; i36++) {
                        aVar2 = bVar5.d(aVar2, i36);
                        int i37 = (i35 - 1) - i36;
                        aVar3 = bVar5.d(aVar3, i37);
                        aVar2.e();
                        aVar3.e();
                        int[] iArr = aVar3.f15837d;
                        int i38 = bVar5.f15841i;
                        int[] iArr2 = bVar5.f15842v;
                        System.arraycopy(iArr, 0, iArr2, i36 * i38, i38);
                        System.arraycopy(aVar2.f15837d, 0, iArr2, i37 * i38, i38);
                    }
                    bArr = null;
                    bVar = bVar5;
                    arrayListA = bk.a.a(bVar5);
                } else {
                    bArr = null;
                    bVar = bVarE;
                }
                Iterator it2 = arrayListA.iterator();
                while (it2.hasNext()) {
                    m[] mVarArr3 = (m[]) it2.next();
                    m mVar = mVarArr3[4];
                    m mVar2 = mVarArr3[5];
                    m mVar3 = mVarArr3[6];
                    m mVar4 = mVarArr3[7];
                    int i39 = i32;
                    int iMin = Math.min(Math.min(c(mVarArr3[i32], mVar), (c(mVarArr3[6], mVarArr3[i33]) * 17) / 18), Math.min(c(mVarArr3[i31], mVarArr3[5]), (c(mVarArr3[7], mVarArr3[3]) * 17) / 18));
                    int i40 = i31;
                    int iMax2 = Math.max(Math.max(b(mVarArr3[i39], mVarArr3[4]), (b(mVarArr3[6], mVarArr3[i33]) * 17) / 18), Math.max(b(mVarArr3[i31], mVarArr3[5]), (b(mVarArr3[7], mVarArr3[3]) * 17) / 18));
                    u4.c cVar = f.f24032a;
                    mj.b bVar6 = bVar;
                    zj.b bVar7 = new zj.b(bVar6, mVar, mVar2, mVar3, mVar4);
                    byte[] bArr3 = bArr;
                    byte[] bArr4 = bArr3;
                    ?? r19 = bArr4;
                    int i41 = i39;
                    ?? r11 = bArr3;
                    ?? r14 = bArr4;
                    while (true) {
                        int i42 = bVar7.f24026i;
                        int i43 = bVar7.f24025h;
                        if (i41 < i33) {
                            if (mVar != null) {
                                i7 = iMax2;
                                i10 = i43;
                                i11 = iMin;
                                i12 = i42;
                                D = f.d(bVar6, bVar7, mVar, true, i11, i7);
                            } else {
                                i7 = iMax2;
                                i10 = i43;
                                i11 = iMin;
                                i12 = i42;
                                D = r11;
                            }
                            m mVar5 = mVar;
                            ?? r110 = r19;
                            if (mVar3 != null) {
                                dVarD = f.d(bVar6, bVar7, mVar3, false, i11, i7);
                            }
                            if (D == 0 && r110 == 0) {
                                kVar = bArr;
                            } else {
                                if (D != 0) {
                                    bVarC0 = D.c0();
                                    C0 = bVarC0;
                                    if (bVarC0 == null) {
                                        if (r110 == 0) {
                                            C0 = bVarC0;
                                            C0 = bVarC0;
                                            C0 = bVarC0;
                                            C0 = bVarC0;
                                            C0 = bArr;
                                        } else {
                                            C0 = r110.c0();
                                        }
                                    } else if (r110 != 0 && (bVarC1 = r110.c0()) != null && bVarC0.f361b != bVarC1.f361b && bVarC0.f362c != bVarC1.f362c && bVarC0.f365f != bVarC1.f365f) {
                                        C0 = bVarC0;
                                        C0 = bVarC0;
                                        C0 = bVarC0;
                                        C0 = bVarC0;
                                        C0 = bArr;
                                    }
                                } else if (r110 == 0) {
                                    C0 = bVarC0;
                                    C0 = bVarC0;
                                    C0 = bVarC0;
                                    C0 = bVarC0;
                                    C0 = bArr;
                                } else {
                                    C0 = r110.c0();
                                }
                                if (C0 == 0) {
                                    kVar = bArr;
                                } else {
                                    zj.b bVarA = f.a(D);
                                    zj.b bVarA2 = f.a(r110);
                                    if (bVarA == null) {
                                        bVarA = bVarA2;
                                    } else if (bVarA2 != null) {
                                        bVarA = new zj.b(bVarA.f24018a, bVarA.f24019b, bVarA.f24020c, bVarA2.f24021d, bVarA2.f24022e);
                                    }
                                    kVar = new k((ae.b) C0, bVarA);
                                }
                            }
                            if (kVar == 0) {
                                throw h.f11808i;
                            }
                            if (i41 != 0 || (bVar4 = (zj.b) kVar.f22222e) == null || (bVar4.f24025h >= i10 && bVar4.f24026i <= i12)) {
                                kVar.f22222e = bVar7;
                                r10 = D;
                                r13 = kVar;
                                r18 = r110;
                            } else {
                                i41++;
                                bVar7 = bVar4;
                                iMin = i11;
                                iMax2 = i7;
                                mVar = mVar5;
                                r11 = D;
                                i33 = 2;
                                r14 = kVar;
                                r19 = r110;
                            }
                        } else {
                            i7 = iMax2;
                            i10 = i43;
                            i11 = iMin;
                            i12 = i42;
                            r10 = r11;
                            r13 = r14;
                            r18 = r19;
                        }
                    }
                    int i44 = r13.f22219b;
                    int i45 = r13.f22219b;
                    ?? r15 = (r[]) r13.f22221d;
                    int i46 = i44 + 1;
                    r15[i39] = r10;
                    r15[i46] = r18;
                    ?? r20 = r10 != 0 ? i40 : i39;
                    int i47 = i40;
                    while (i47 <= i46) {
                        int i48 = r20 != 0 ? i47 : i46 - i47;
                        if (r15[i48] == 0) {
                            r dVar2 = (i48 == 0 || i48 == i46) ? new zj.d(bVar7, i48 == 0 ? i40 : i39) : new r(bVar7);
                            r15[i48] = dVar2;
                            int i49 = i11;
                            int i50 = i7;
                            int i51 = -1;
                            int i52 = i10;
                            while (i52 <= i12) {
                                int i53 = r20 != 0 ? i40 : -1;
                                int i54 = i48 - i53;
                                if (i54 >= 0) {
                                    it = it2;
                                    if (i54 <= i45 + 1) {
                                        ?? r6 = r15[i54];
                                        bVar3 = ((ae.b[]) r6.f8035i)[r6.K(i52)];
                                    }
                                    if (r5 != 0) {
                                        bVarG = r15[i48].G(i52);
                                        if (bVarG != null) {
                                            if (i54 >= 0 && i54 <= i45 + 1) {
                                                bVarG = r15[i54].G(i52);
                                            }
                                            if (bVarG != null) {
                                                i22 = i48;
                                                i23 = i39;
                                                while (true) {
                                                    i24 = i22 - i53;
                                                    if (i24 < 0 && i24 <= i45 + 1) {
                                                        ae.b[] bVarArr3 = (ae.b[]) r15[i24].f8035i;
                                                        int length = bVarArr3.length;
                                                        i26 = i23;
                                                        int i55 = i39;
                                                        while (true) {
                                                            if (i55 < length) {
                                                                int i56 = length;
                                                                ae.b bVar8 = bVarArr3[i55];
                                                                if (bVar8 != null) {
                                                                    int i57 = bVar8.f361b;
                                                                    int i58 = bVar8.f362c;
                                                                    i25 = ((i58 - i57) * i53 * i26) + (r20 != 0 ? i58 : i57);
                                                                } else {
                                                                    i55++;
                                                                    length = i56;
                                                                }
                                                            } else {
                                                                i23 = i26 + 1;
                                                                i22 = i24;
                                                            }
                                                        }
                                                    } else if (r20 != 0) {
                                                        i25 = ((zj.b) r13.f22222e).f24023f;
                                                    } else {
                                                        i25 = ((zj.b) r13.f22222e).f24024g;
                                                    }
                                                }
                                            } else if (r20 != 0) {
                                                i25 = bVarG.f362c;
                                            } else {
                                                i25 = bVarG.f361b;
                                            }
                                        } else if (r20 != 0) {
                                            i25 = bVarG.f361b;
                                        } else {
                                            i25 = bVarG.f362c;
                                        }
                                    } else if (r20 != 0) {
                                        i25 = r5.f362c;
                                    } else {
                                        i25 = r5.f361b;
                                    }
                                    if (i25 >= 0 || i25 > bVar7.f24024g) {
                                        if (i51 != -1) {
                                            i29 = i51;
                                        } else {
                                            i27 = i52;
                                            i28 = i49;
                                            iMax = i50;
                                        }
                                        i49 = i28;
                                        i50 = iMax;
                                        i52 = i27 + 1;
                                        i12 = i12;
                                        it2 = it;
                                        i10 = i10;
                                    } else {
                                        i29 = i25;
                                    }
                                    int i59 = i52;
                                    bVarC = f.c(bVar6, bVar7.f24023f, bVar7.f24024g, r20, i29, i59, i49, i50);
                                    i27 = i59;
                                    i28 = i49;
                                    iMax = i50;
                                    if (bVarC != null) {
                                        int i60 = bVarC.f361b;
                                        int i61 = bVarC.f362c;
                                        ((ae.b[]) dVar2.f8035i)[dVar2.K(i27)] = bVarC;
                                        int iMin2 = Math.min(i28, i61 - i60);
                                        iMax = Math.max(iMax, i61 - i60);
                                        i49 = iMin2;
                                        i51 = i29;
                                    } else {
                                        i49 = i28;
                                    }
                                    i50 = iMax;
                                    i52 = i27 + 1;
                                    i12 = i12;
                                    it2 = it;
                                    i10 = i10;
                                } else {
                                    it = it2;
                                }
                                r5 = bArr;
                                if (r5 != 0) {
                                    bVarG = r15[i48].G(i52);
                                    if (bVarG != null) {
                                        if (i54 >= 0) {
                                            bVarG = r15[i54].G(i52);
                                        }
                                        if (bVarG != null) {
                                            i22 = i48;
                                            i23 = i39;
                                            while (true) {
                                                i24 = i22 - i53;
                                                if (i24 < 0) {
                                                }
                                                if (r20 != 0) {
                                                    i25 = ((zj.b) r13.f22222e).f24023f;
                                                } else {
                                                    i25 = ((zj.b) r13.f22222e).f24024g;
                                                }
                                                i23 = i26 + 1;
                                                i22 = i24;
                                            }
                                        } else if (r20 != 0) {
                                            i25 = bVarG.f362c;
                                        } else {
                                            i25 = bVarG.f361b;
                                        }
                                    } else if (r20 != 0) {
                                        i25 = bVarG.f361b;
                                    } else {
                                        i25 = bVarG.f362c;
                                    }
                                } else if (r20 != 0) {
                                    i25 = r5.f362c;
                                } else {
                                    i25 = r5.f361b;
                                }
                                if (i25 >= 0) {
                                    if (i51 != -1) {
                                        i29 = i51;
                                        int i510 = i52;
                                        bVarC = f.c(bVar6, bVar7.f24023f, bVar7.f24024g, r20, i29, i510, i49, i50);
                                        i27 = i510;
                                        i28 = i49;
                                        iMax = i50;
                                        if (bVarC != null) {
                                            int i62 = bVarC.f361b;
                                            int i63 = bVarC.f362c;
                                            ((ae.b[]) dVar2.f8035i)[dVar2.K(i27)] = bVarC;
                                            int iMin3 = Math.min(i28, i63 - i62);
                                            iMax = Math.max(iMax, i63 - i62);
                                            i49 = iMin3;
                                            i51 = i29;
                                        }
                                        i50 = iMax;
                                        i52 = i27 + 1;
                                        i12 = i12;
                                        it2 = it;
                                        i10 = i10;
                                    } else {
                                        i27 = i52;
                                        i28 = i49;
                                        iMax = i50;
                                    }
                                } else if (i51 != -1) {
                                    i29 = i51;
                                    int i511 = i52;
                                    bVarC = f.c(bVar6, bVar7.f24023f, bVar7.f24024g, r20, i29, i511, i49, i50);
                                    i27 = i511;
                                    i28 = i49;
                                    iMax = i50;
                                    if (bVarC != null) {
                                        int i64 = bVarC.f361b;
                                        int i65 = bVarC.f362c;
                                        ((ae.b[]) dVar2.f8035i)[dVar2.K(i27)] = bVarC;
                                        int iMin4 = Math.min(i28, i65 - i64);
                                        iMax = Math.max(iMax, i65 - i64);
                                        i49 = iMin4;
                                        i51 = i29;
                                    }
                                    i50 = iMax;
                                    i52 = i27 + 1;
                                    i12 = i12;
                                    it2 = it;
                                    i10 = i10;
                                } else {
                                    i27 = i52;
                                    i28 = i49;
                                    iMax = i50;
                                }
                                i49 = i28;
                                i50 = iMax;
                                i52 = i27 + 1;
                                i12 = i12;
                                it2 = it;
                                i10 = i10;
                            }
                            i11 = i49;
                            i7 = i50;
                        } else {
                            i46 = i46;
                        }
                        i47++;
                        i12 = i12;
                        i46 = i46;
                        it2 = it2;
                        i10 = i10;
                    }
                    Iterator it3 = it2;
                    ae.b bVar9 = (ae.b) r13.f22220c;
                    int i66 = bVar9.f365f;
                    int[] iArr3 = new int[2];
                    iArr3[i40] = i45 + 2;
                    iArr3[i39] = i66;
                    zj.a[][] aVarArr = (zj.a[][]) Array.newInstance((Class<?>) zj.a.class, iArr3);
                    for (int i67 = i39; i67 < aVarArr.length; i67++) {
                        int i68 = i39;
                        while (true) {
                            zj.a[] aVarArr2 = aVarArr[i67];
                            if (i68 < aVarArr2.length) {
                                aVarArr2[i68] = new zj.a();
                                i68++;
                            }
                        }
                    }
                    r13.a(r15[i39]);
                    int i69 = i45 + 1;
                    r13.a(r15[i69]);
                    int i70 = 928;
                    while (true) {
                        ?? r16 = r15[i39];
                        if (r16 != 0 && (r12 = r15[i69]) != 0) {
                            ae.b[] bVarArr4 = (ae.b[]) r16.f8035i;
                            ae.b[] bVarArr5 = (ae.b[]) r12.f8035i;
                            for (int i71 = i39; i71 < bVarArr4.length; i71++) {
                                ae.b bVar10 = bVarArr4[i71];
                                if (bVar10 != null && (bVar2 = bVarArr5[i71]) != null && bVar10.f365f == bVar2.f365f) {
                                    for (int i72 = i40; i72 <= i45; i72++) {
                                        ae.b bVar11 = ((ae.b[]) r15[i72].f8035i)[i71];
                                        if (bVar11 != null) {
                                            int i73 = bVarArr4[i71].f365f;
                                            bVar11.f365f = i73;
                                            if (!bVar11.c(i73)) {
                                                ((ae.b[]) r15[i72].f8035i)[i71] = bArr;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        ?? r17 = r15[i39];
                        if (r17 == 0) {
                            i13 = i39;
                        } else {
                            ae.b[] bVarArr6 = (ae.b[]) r17.f8035i;
                            int i74 = i39;
                            i13 = i74;
                            while (i74 < bVarArr6.length) {
                                ae.b bVar12 = bVarArr6[i74];
                                if (bVar12 == null) {
                                    bVarArr = bVarArr6;
                                }
                                int i75 = bVar12.f365f;
                                int i76 = i39;
                                int i77 = i40;
                                while (true) {
                                    if (i77 >= i69) {
                                        bVarArr = bVarArr6;
                                    }
                                    bVarArr = bVarArr6;
                                    if (i76 >= 2) {
                                    }
                                    ae.b bVar13 = ((ae.b[]) r15[i77].f8035i)[i74];
                                    int i78 = i74;
                                    if (bVar13 != null) {
                                        if (!bVar13.c(bVar13.f365f)) {
                                            if (bVar13.c(i75)) {
                                                bVar13.f365f = i75;
                                                i76 = i39;
                                            } else {
                                                i76++;
                                            }
                                        }
                                        if (!bVar13.c(bVar13.f365f)) {
                                            i13++;
                                        }
                                    }
                                    i77++;
                                    bVarArr6 = bVarArr;
                                    i74 = i78;
                                    break;
                                    break;
                                }
                                break;
                                i74++;
                                bVarArr6 = bVarArr;
                            }
                        }
                        ?? r21 = r15[i69];
                        if (r21 == 0) {
                            i14 = i39;
                        } else {
                            ae.b[] bVarArr7 = (ae.b[]) r21.f8035i;
                            int i79 = i39;
                            i14 = i79;
                            while (i79 < bVarArr7.length) {
                                ae.b bVar14 = bVarArr7[i79];
                                if (bVar14 != null) {
                                    int i80 = bVar14.f365f;
                                    int i81 = i69;
                                    bVarArr2 = bVarArr7;
                                    int i82 = i39;
                                    while (true) {
                                        i15 = i79;
                                        if (i81 <= 0 || i82 >= 2) {
                                        }
                                        ae.b bVar15 = ((ae.b[]) r15[i81].f8035i)[i15];
                                        int i83 = i82;
                                        if (bVar15 != null) {
                                            if (!bVar15.c(bVar15.f365f)) {
                                                if (bVar15.c(i80)) {
                                                    bVar15.f365f = i80;
                                                    i83 = i39;
                                                } else {
                                                    i83++;
                                                }
                                            }
                                            if (!bVar15.c(bVar15.f365f)) {
                                                i14++;
                                            }
                                            i82 = i83;
                                        }
                                        i81--;
                                        i79 = i15;
                                    }
                                } else {
                                    bVarArr2 = bVarArr7;
                                    i15 = i79;
                                }
                                i79 = i15 + 1;
                                bVarArr7 = bVarArr2;
                            }
                        }
                        int i84 = i13 + i14;
                        if (i84 == 0) {
                            i84 = i39;
                        } else {
                            int i85 = i40;
                            while (i85 < i69) {
                                ae.b[] bVarArr8 = (ae.b[]) r15[i85].f8035i;
                                int i86 = i39;
                                while (i86 < bVarArr8.length) {
                                    ae.b bVar16 = bVarArr8[i86];
                                    if (bVar16 == null || bVar16.c(bVar16.f365f)) {
                                        i16 = i69;
                                        i17 = i85;
                                    } else {
                                        ae.b bVar17 = bVarArr8[i86];
                                        ae.b[] bVarArr9 = (ae.b[]) r15[i85 - 1].f8035i;
                                        i16 = i69;
                                        ?? r7 = r15[i85 + 1];
                                        ae.b[] bVarArr10 = r7 != 0 ? (ae.b[]) r7.f8035i : bVarArr9;
                                        i17 = i85;
                                        ae.b[] bVarArr11 = new ae.b[14];
                                        bVarArr11[2] = bVarArr9[i86];
                                        bVarArr11[3] = bVarArr10[i86];
                                        if (i86 > 0) {
                                            int i87 = i86 - 1;
                                            bVarArr11[i39] = bVarArr8[i87];
                                            bVarArr11[4] = bVarArr9[i87];
                                            bVarArr11[5] = bVarArr10[i87];
                                        }
                                        if (i86 > i40) {
                                            int i88 = i86 - 2;
                                            bVarArr11[8] = bVarArr8[i88];
                                            bVarArr11[10] = bVarArr9[i88];
                                            bVarArr11[11] = bVarArr10[i88];
                                        }
                                        if (i86 < bVarArr8.length - 1) {
                                            int i89 = i86 + 1;
                                            bVarArr11[1] = bVarArr8[i89];
                                            bVarArr11[6] = bVarArr9[i89];
                                            bVarArr11[7] = bVarArr10[i89];
                                        }
                                        if (i86 < bVarArr8.length - 2) {
                                            int i90 = i86 + 2;
                                            bVarArr11[9] = bVarArr8[i90];
                                            bVarArr11[12] = bVarArr9[i90];
                                            bVarArr11[13] = bVarArr10[i90];
                                        }
                                        int i91 = i39;
                                        while (i91 < 14) {
                                            ae.b bVar18 = bVarArr11[i91];
                                            if (bVar18 == null) {
                                                i18 = i91;
                                            } else {
                                                i18 = i91;
                                                if (bVar18.c(bVar18.f365f)) {
                                                    if (bVar18.f363d == bVar17.f363d) {
                                                        bVar17.f365f = bVar18.f365f;
                                                    }
                                                }
                                                i91 = i18 + 1;
                                                bVarArr11 = bVarArr11;
                                            }
                                            i91 = i18 + 1;
                                            bVarArr11 = bVarArr11;
                                        }
                                    }
                                    i86++;
                                    i69 = i16;
                                    i85 = i17;
                                    i40 = 1;
                                    break;
                                }
                                i85++;
                                i40 = 1;
                            }
                        }
                        int i92 = i69;
                        if (i84 > 0 && i84 < i70) {
                            i70 = i84;
                            i69 = i92;
                            i40 = 1;
                        }
                        break;
                    }
                    int length2 = r15.length;
                    int i93 = i39;
                    int i94 = i93;
                    while (i93 < length2) {
                        ?? r111 = r15[i93];
                        if (r111 != 0) {
                            ae.b[] bVarArr12 = (ae.b[]) r111.f8035i;
                            int length3 = bVarArr12.length;
                            int i95 = i39;
                            while (i95 < length3) {
                                ae.b bVar19 = bVarArr12[i95];
                                if (bVar19 == null || (i21 = bVar19.f365f) < 0) {
                                    i20 = length2;
                                } else {
                                    i20 = length2;
                                    if (i21 < aVarArr.length) {
                                        aVarArr[i21][i94].b(bVar19.f364e);
                                    }
                                }
                                i95++;
                                length2 = i20;
                            }
                        }
                        i94++;
                        i93++;
                        length2 = length2;
                    }
                    zj.a aVar4 = aVarArr[i39][1];
                    int[] iArrA = aVar4.a();
                    int i96 = bVar9.f362c;
                    int i97 = i45 * i66;
                    int i98 = i97 - (2 << i96);
                    if (iArrA.length == 0) {
                        if (i98 <= 0 || i98 > 928) {
                            throw h.f11808i;
                        }
                        aVar4.b(i98);
                    } else if (iArrA[i39] != i98) {
                        aVar4.b(i98);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int[] iArr4 = new int[i97];
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    for (int i99 = i39; i99 < i66; i99++) {
                        int i100 = i39;
                        while (i100 < i45) {
                            int i101 = i100 + 1;
                            int[] iArrA2 = aVarArr[i99][i101].a();
                            int i102 = (i99 * i45) + i100;
                            if (iArrA2.length == 0) {
                                arrayList2.add(Integer.valueOf(i102));
                                i19 = i66;
                            } else {
                                i19 = i66;
                                if (iArrA2.length == 1) {
                                    iArr4[i102] = iArrA2[i39];
                                } else {
                                    arrayList4.add(Integer.valueOf(i102));
                                    arrayList3.add(iArrA2);
                                }
                            }
                            i100 = i101;
                            i66 = i19;
                        }
                    }
                    int size = arrayList3.size();
                    int[][] iArr5 = new int[size][];
                    for (int i103 = i39; i103 < size; i103++) {
                        iArr5[i103] = (int[]) arrayList3.get(i103);
                    }
                    int[] iArrA3 = yj.a.a(arrayList2);
                    int[] iArrA4 = yj.a.a(arrayList4);
                    int length4 = iArrA4.length;
                    int[] iArr6 = new int[length4];
                    int i104 = 100;
                    while (true) {
                        int i105 = i104 - 1;
                        if (i104 <= 0) {
                            throw ij.b.a();
                        }
                        for (int i106 = i39; i106 < length4; i106++) {
                            iArr4[iArrA4[i106]] = iArr5[i106][iArr6[i106]];
                        }
                        try {
                            s0VarB = f.b(iArr4, i96, iArrA3);
                        } catch (ij.b unused) {
                            byte[] bArr5 = bArr;
                            if (length4 == 0) {
                                throw ij.b.a();
                            }
                            for (int i107 = i39; i107 < length4; i107++) {
                                int i108 = iArr6[i107];
                                if (i108 < iArr5[i107].length - 1) {
                                    iArr6[i107] = i108 + 1;
                                }
                                iArr6[i107] = i39;
                                if (i107 == length4 - 1) {
                                    throw ij.b.a();
                                }
                                break;
                            }
                            bArr = bArr5;
                            i104 = i105;
                        }
                        break;
                    }
                    byte[] bArr6 = bArr;
                    Result result3 = new Result(s0VarB.f9839a, bArr6, mVarArr3, ij.a.H);
                    result3.b(lVar, (String) s0VarB.f9843e);
                    yj.b bVar20 = (yj.b) s0VarB.f9845g;
                    if (bVar20 != null) {
                        result3.b(l.E, bVar20);
                    }
                    arrayList.add(result3);
                    bArr = bArr6;
                    bVar = bVar6;
                    i32 = i39;
                    i33 = 2;
                    it2 = it3;
                    i31 = 1;
                }
                int i109 = i32;
                Result[] resultArr = (Result[]) arrayList.toArray(new Result[arrayList.size()]);
                if (resultArr == null || resultArr.length == 0 || (result = resultArr[i109]) == null) {
                    throw h.f11808i;
                }
                return result;
        }
    }

    @Override // ij.j
    public final void reset() {
        int i7 = this.f13916a;
    }

    private final void d() {
    }

    private final void e() {
    }
}
