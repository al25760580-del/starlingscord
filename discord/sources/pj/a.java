package pj;

import com.google.zxing.Result;
import e4.r;
import gc.s0;
import ic.n0;
import ij.b;
import ij.d;
import ij.h;
import ij.j;
import ij.l;
import ij.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import op.c;
import w3.q;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m[] f18052b = new m[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f18053a = new c(4);

    /* JADX WARN: Code duplicated, block: B:105:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:85:0x020d  */
    @Override // ij.j
    public final Result a(r rVar, Map map) throws b, d, h {
        m mVar;
        m mVar2;
        m mVar3;
        m mVar4;
        mj.b bVarG0;
        m[] mVarArr;
        s0 s0VarA;
        m mVar5;
        c cVar = this.f18053a;
        boolean z5 = false;
        if (map == null || !map.containsKey(ij.c.f11794d)) {
            io.sentry.internal.debugmeta.c cVar2 = new io.sentry.internal.debugmeta.c(rVar.E());
            m[] mVarArrB = ((n0) cVar2.f12760i).b();
            m mVar6 = mVarArrB[0];
            m mVar7 = mVarArrB[1];
            m mVar8 = mVarArrB[2];
            m mVar9 = mVarArrB[3];
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(cVar2.I0(mVar6, mVar7));
            arrayList.add(cVar2.I0(mVar6, mVar8));
            arrayList.add(cVar2.I0(mVar7, mVar9));
            arrayList.add(cVar2.I0(mVar8, mVar9));
            Collections.sort(arrayList, new rj.b());
            rj.a aVar = (rj.a) arrayList.get(0);
            rj.a aVar2 = (rj.a) arrayList.get(1);
            HashMap map2 = new HashMap();
            io.sentry.internal.debugmeta.c.A0(map2, aVar.f19427a);
            io.sentry.internal.debugmeta.c.A0(map2, aVar.f19428b);
            io.sentry.internal.debugmeta.c.A0(map2, aVar2.f19427a);
            io.sentry.internal.debugmeta.c.A0(map2, aVar2.f19428b);
            m mVar10 = null;
            m mVar11 = null;
            m mVar12 = null;
            for (Map.Entry entry : map2.entrySet()) {
                m mVar13 = (m) entry.getKey();
                boolean z6 = z5;
                if (((Integer) entry.getValue()).intValue() == 2) {
                    mVar11 = mVar13;
                } else if (mVar10 == null) {
                    mVar10 = mVar13;
                } else {
                    mVar12 = mVar13;
                }
                z5 = z6;
            }
            boolean z7 = z5;
            if (mVar10 == null || mVar11 == null || mVar12 == null) {
                throw h.f11808i;
            }
            m[] mVarArr2 = {mVar10, mVar11, mVar12};
            m.b(mVarArr2);
            m mVar14 = mVarArr2[z7 ? 1 : 0];
            m mVar15 = mVarArr2[1];
            m mVar16 = mVarArr2[2];
            if (map2.containsKey(mVar6)) {
                mVar6 = map2.containsKey(mVar7) ? !map2.containsKey(mVar8) ? mVar8 : mVar9 : mVar7;
            }
            float f2 = mVar6.f11824b;
            float f7 = mVar6.f11823a;
            rj.a aVarI0 = cVar2.I0(mVar16, mVar6);
            float f10 = mVar16.f11824b;
            float f11 = mVar16.f11823a;
            int i7 = aVarI0.f19429c;
            rj.a aVarI1 = cVar2.I0(mVar14, mVar6);
            float f12 = mVar14.f11824b;
            float f13 = mVar14.f11823a;
            int i10 = aVarI1.f19429c;
            if ((i7 & 1) == 1) {
                i7++;
            }
            int i11 = i7 + 2;
            if ((i10 & 1) == 1) {
                i10++;
            }
            int i12 = i10 + 2;
            if (i11 * 4 >= i12 * 7 || i12 * 4 >= i11 * 7) {
                mVar = mVar14;
                mVar2 = mVar16;
                mVar3 = mVar15;
                float fT0 = io.sentry.internal.debugmeta.c.t0(mVar3, mVar) / i11;
                float fY = q.y(m.a(mVar2, mVar6));
                m mVar17 = new m((((f7 - f11) / fY) * fT0) + f7, (fT0 * ((f2 - f10) / fY)) + f2);
                float fY2 = q.y(m.a(mVar3, mVar2)) / i12;
                float fY3 = q.y(m.a(mVar, mVar6));
                m mVar18 = new m((((f7 - f13) / fY3) * fY2) + f7, (fY2 * ((f2 - f12) / fY3)) + f2);
                if (cVar2.B0(mVar17)) {
                    if (cVar2.B0(mVar18)) {
                        if (Math.abs(i12 - cVar2.I0(mVar, mVar17).f19429c) + Math.abs(i11 - cVar2.I0(mVar2, mVar17).f19429c) > Math.abs(i12 - cVar2.I0(mVar, mVar18).f19429c) + Math.abs(i11 - cVar2.I0(mVar2, mVar18).f19429c)) {
                            mVar4 = mVar18;
                        }
                    }
                    mVar4 = mVar17;
                } else if (cVar2.B0(mVar18)) {
                    mVar4 = mVar18;
                } else {
                    mVar4 = null;
                }
                if (mVar4 != null) {
                    mVar6 = mVar4;
                }
                int i13 = cVar2.I0(mVar2, mVar6).f19429c;
                int i14 = cVar2.I0(mVar, mVar6).f19429c;
                if ((i13 & 1) == 1) {
                    i13++;
                }
                int i15 = i13;
                if ((i14 & 1) == 1) {
                    i14++;
                }
                bVarG0 = io.sentry.internal.debugmeta.c.G0((mj.b) cVar2.f12759e, mVar2, mVar3, mVar, mVar6, i15, i14);
            } else {
                float fMin = Math.min(i12, i11);
                float fT1 = io.sentry.internal.debugmeta.c.t0(mVar15, mVar14) / fMin;
                float fY4 = q.y(m.a(mVar16, mVar6));
                m mVar19 = new m((((f7 - f11) / fY4) * fT1) + f7, (fT1 * ((f2 - f10) / fY4)) + f2);
                float fY5 = q.y(m.a(mVar15, mVar16)) / fMin;
                float fY6 = q.y(m.a(mVar14, mVar6));
                m mVar20 = new m((((f7 - f13) / fY6) * fY5) + f7, (fY5 * ((f2 - f12) / fY6)) + f2);
                if (cVar2.B0(mVar19)) {
                    if (cVar2.B0(mVar20) && Math.abs(cVar2.I0(mVar16, mVar19).f19429c - cVar2.I0(mVar14, mVar19).f19429c) > Math.abs(cVar2.I0(mVar16, mVar20).f19429c - cVar2.I0(mVar14, mVar20).f19429c)) {
                        mVar5 = mVar20;
                    } else {
                        mVar5 = mVar19;
                    }
                } else if (cVar2.B0(mVar20)) {
                    mVar5 = mVar20;
                } else {
                    mVar5 = null;
                }
                if (mVar5 != null) {
                    mVar6 = mVar5;
                }
                int iMax = Math.max(cVar2.I0(mVar16, mVar6).f19429c, cVar2.I0(mVar14, mVar6).f19429c);
                int i16 = iMax + 1;
                if ((i16 & 1) == 1) {
                    i16 = iMax + 2;
                }
                int i17 = i16;
                bVarG0 = io.sentry.internal.debugmeta.c.G0((mj.b) cVar2.f12759e, mVar16, mVar15, mVar14, mVar6, i17, i17);
                mVar2 = mVar16;
                mVar3 = mVar15;
                mVar = mVar14;
            }
            s0 s0VarA2 = cVar.a(bVarG0);
            mVarArr = new m[]{mVar2, mVar3, mVar, mVar6};
            s0VarA = s0VarA2;
        } else {
            mj.b bVarE = rVar.E();
            int[] iArrE = bVarE.e();
            int[] iArrC = bVarE.c();
            if (iArrE == null || iArrC == null) {
                throw h.f11808i;
            }
            int i18 = bVarE.f15839d;
            int i19 = iArrE[0];
            int i20 = iArrE[1];
            while (i19 < i18 && bVarE.b(i19, i20)) {
                i19++;
            }
            if (i19 == i18) {
                throw h.f11808i;
            }
            int i21 = iArrE[0];
            int i22 = i19 - i21;
            if (i22 == 0) {
                throw h.f11808i;
            }
            int i23 = iArrE[1];
            int i24 = iArrC[1];
            int i25 = ((iArrC[0] - i21) + 1) / i22;
            int i26 = ((i24 - i23) + 1) / i22;
            if (i25 <= 0 || i26 <= 0) {
                throw h.f11808i;
            }
            int i27 = i22 / 2;
            int i28 = i23 + i27;
            int i29 = i21 + i27;
            mj.b bVar = new mj.b(i25, i26);
            for (int i30 = 0; i30 < i26; i30++) {
                int i31 = (i30 * i22) + i28;
                for (int i32 = 0; i32 < i25; i32++) {
                    if (bVarE.b((i32 * i22) + i29, i31)) {
                        bVar.f(i32, i30);
                    }
                }
            }
            s0VarA = cVar.a(bVar);
            mVarArr = f18052b;
        }
        Result result = new Result(s0VarA.f9839a, (byte[]) s0VarA.f9842d, mVarArr, ij.a.f11791x);
        List list = (List) s0VarA.f9844f;
        if (list != null) {
            result.b(l.f11817e, list);
        }
        String str = (String) s0VarA.f9843e;
        if (str != null) {
            result.b(l.f11818i, str);
        }
        return result;
    }

    @Override // ij.j
    public final void reset() {
    }
}
