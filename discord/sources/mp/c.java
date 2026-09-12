package mp;

import a5.b0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import lq.b1;
import lq.d0;
import lq.d1;
import lq.e1;
import lq.i0;
import lq.l0;
import lq.q0;
import lq.t0;
import lq.z;
import vo.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static a5.f a(d0 d0Var, ip.m mVar, int i7, r rVar, boolean z5, boolean z6) {
        vo.f fVarA;
        Boolean bool;
        q0 q0VarR0;
        Boolean bool2;
        b0 b0Var;
        i0 i0VarJ;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        r rVar2 = r.f16008i;
        ?? r5 = 0;
        boolean z7 = rVar != rVar2;
        boolean z10 = (z6 && z5) ? false : true;
        Object obj = null;
        if (!z7 && d0Var.l0().isEmpty()) {
            return new a5.f(null, 1, false);
        }
        vo.i iVarG = d0Var.r0().g();
        if (iVarG == null) {
            return new a5.f(null, 1, false);
        }
        d dVar = (d) mVar.invoke(Integer.valueOf(i7));
        wo.i iVar = u.f16012a;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        if (rVar == rVar2 || !(iVarG instanceof vo.f)) {
            fVarA = null;
        } else if (dVar.f15969b == e.f15972d && rVar == r.f16006d) {
            vo.f mutable = (vo.f) iVarG;
            Intrinsics.checkNotNullParameter(mutable, "mutable");
            String str = uo.d.f21197a;
            up.d dVarG = xp.e.g(mutable);
            HashMap map = uo.d.j;
            if (map.containsKey(dVarG)) {
                Intrinsics.checkNotNullParameter(mutable, "mutable");
                up.c cVar = (up.c) map.get(xp.e.g(mutable));
                if (cVar == null) {
                    throw new IllegalArgumentException("Given class " + mutable + " is not a mutable collection");
                }
                fVarA = bq.e.e(mutable).j(cVar);
                Intrinsics.checkNotNullExpressionValue(fVarA, "getBuiltInClassByFqName(...)");
            } else if (dVar.f15969b == e.f15973e) {
                fVarA = null;
            } else {
                fVarA = null;
            }
        } else if (dVar.f15969b == e.f15973e || rVar != r.f16007e) {
            fVarA = null;
        } else {
            vo.f readOnly = (vo.f) iVarG;
            Intrinsics.checkNotNullParameter(readOnly, "readOnly");
            String str2 = uo.d.f21197a;
            if (uo.d.k.containsKey(xp.e.g(readOnly))) {
                fVarA = uo.e.a(readOnly);
            } else {
                fVarA = null;
            }
        }
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        if (rVar == rVar2) {
            bool = null;
        } else {
            g gVar = dVar.f15968a;
            int i10 = gVar == null ? -1 : t.f16011a[gVar.ordinal()];
            if (i10 == 1) {
                bool = Boolean.TRUE;
            } else if (i10 != 2) {
                bool = null;
            } else {
                bool = Boolean.FALSE;
            }
        }
        if (fVarA == null || (q0VarR0 = fVarA.n()) == null) {
            q0VarR0 = d0Var.r0();
        }
        int i11 = i7 + 1;
        List listL0 = d0Var.l0();
        List parameters = q0VarR0.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        Iterator it = listL0.iterator();
        Iterator it2 = parameters.iterator();
        ArrayList arrayList = new ArrayList(Math.min(e0.l(listL0, 10), e0.l(parameters, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            r0 r0Var = (r0) it2.next();
            t0 t0Var = (t0) next;
            if (z10) {
                bool2 = bool;
                if (!t0Var.c()) {
                    b0Var = b(t0Var.b().w0(), mVar, i11, z6);
                } else if (((d) mVar.invoke(Integer.valueOf(i11))).f15968a == g.f15976d) {
                    d1 d1VarW0 = t0Var.b().w0();
                    b0Var = new b0(1, 11, lq.c.e(lq.c.l(d1VarW0).x0(r5), lq.c.E(d1VarW0).x0(true)));
                } else {
                    b0Var = new b0(1, 11, null);
                }
            } else {
                bool2 = bool;
                b0Var = new b0(r5, 11, obj);
            }
            i11 += b0Var.f173e;
            z zVar = (z) b0Var.f174i;
            if (zVar != null) {
                e1 e1VarA = t0Var.a();
                Intrinsics.checkNotNullExpressionValue(e1VarA, "getProjectionKind(...)");
                i0VarJ = c9.a.m(zVar, e1VarA, r0Var);
            } else if (fVarA == null || t0Var.c()) {
                i0VarJ = fVarA != null ? b1.j(r0Var) : null;
            } else {
                z zVarB = t0Var.b();
                Intrinsics.checkNotNullExpressionValue(zVarB, "getType(...)");
                e1 e1VarA2 = t0Var.a();
                Intrinsics.checkNotNullExpressionValue(e1VarA2, "getProjectionKind(...)");
                i0VarJ = c9.a.m(zVarB, e1VarA2, r0Var);
            }
            arrayList.add(i0VarJ);
            bool = bool2;
            r5 = 0;
            obj = null;
        }
        Boolean bool3 = bool;
        int i12 = i11 - i7;
        if (fVarA == null && bool3 == null) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                do {
                    if (it3.hasNext()) {
                    }
                } while (((t0) it3.next()) == null);
            }
            return new a5.f(null, i12, false);
        }
        wo.h annotations = d0Var.getAnnotations();
        wo.i iVar2 = u.f16013b;
        if (fVarA == null) {
            iVar2 = null;
        }
        wo.h[] elements = {annotations, iVar2, bool3 != null ? u.f16012a : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayListR = y.r(elements);
        int size = arrayListR.size();
        if (size == 0) {
            throw new IllegalStateException("At least one Annotations object expected");
        }
        l0 l0VarC = lq.c.C(size != 1 ? new wo.i(1, CollectionsKt.i0(arrayListR)) : (wo.h) CollectionsKt.Z(arrayListR));
        List listL1 = d0Var.l0();
        Iterator it4 = arrayList.iterator();
        Iterator it5 = listL1.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(e0.l(arrayList, 10), e0.l(listL1, 10)));
        while (it4.hasNext() && it5.hasNext()) {
            Object next2 = it4.next();
            t0 t0Var2 = (t0) it5.next();
            t0 t0Var3 = (t0) next2;
            if (t0Var3 != null) {
                t0Var2 = t0Var3;
            }
            arrayList2.add(t0Var2);
        }
        d0 d0VarT = lq.c.t(arrayList2, l0VarC, q0VarR0, bool3 != null ? bool3.booleanValue() : d0Var.t0());
        if (dVar.f15970c) {
            d0VarT = new f(d0VarT);
        }
        return new a5.f(d0VarT, i12, bool3 != null && dVar.f15971d);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [lq.d0] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [lq.d0] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [lq.d0] */
    /* JADX WARN: Type inference failed for: r11v9 */
    public static b0 b(d1 d1Var, ip.m mVar, int i7, boolean z5) {
        ?? r11;
        Object objG = null;
        if (lq.c.j(d1Var)) {
            return new b0(1, 11, null);
        }
        if (!(d1Var instanceof lq.s)) {
            if (!(d1Var instanceof d0)) {
                throw new rn.n();
            }
            a5.f fVarA = a((d0) d1Var, mVar, i7, r.f16008i, false, z5);
            d1 d1VarG = (d0) fVarA.f182c;
            if (fVarA.f181b) {
                d1VarG = lq.c.G(d1Var, d1VarG);
            }
            return new b0(fVarA.f180a, 11, d1VarG);
        }
        boolean z6 = d1Var instanceof jp.i;
        lq.s sVar = (lq.s) d1Var;
        d0 d0Var = sVar.f15249i;
        d0 d0Var2 = sVar.f15248e;
        a5.f fVarA2 = a(d0Var2, mVar, i7, r.f16006d, z6, z5);
        d0 d0Var3 = d0Var2;
        d1 d1Var2 = (d0) fVarA2.f182c;
        a5.f fVarA3 = a(sVar.f15249i, mVar, i7, r.f16007e, z6, z5);
        d0 d0Var4 = (d0) fVarA3.f182c;
        if (d1Var2 != null || d0Var4 != null) {
            if (fVarA2.f181b || fVarA3.f181b) {
                if (d0Var4 == null) {
                    Intrinsics.checkNotNull(d1Var2);
                } else {
                    d1 d1VarE = lq.c.e(d1Var2 == null ? d0Var4 : d1Var2, d0Var4);
                    if (d1VarE == null) {
                        Intrinsics.checkNotNull(d1Var2);
                    } else {
                        d1Var2 = d1VarE;
                    }
                }
                objG = lq.c.G(d1Var, d1Var2);
            } else if (z6) {
                ?? r12 = d0Var3;
                if (d1Var2 != null) {
                    r12 = d1Var2;
                }
                if (d0Var4 != null) {
                    d0Var = d0Var4;
                }
                objG = new jp.i(r12, d0Var);
            } else {
                if (d1Var2 != null) {
                    r11 = d1Var2;
                }
                if (d0Var4 != null) {
                    d0Var = d0Var4;
                }
                objG = lq.c.e(r11, d0Var);
            }
        }
        return new b0(fVarA2.f180a, 11, objG);
    }
}
