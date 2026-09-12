package to;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import lq.y0;
import lq.z;
import sq.r;
import vo.n0;
import vo.u;
import yo.k0;
import yo.q0;
import yo.s;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends k0 {
    public f(vo.l lVar, f fVar, vo.c cVar, boolean z5) {
        super(lVar, fVar, wo.g.f22379a, r.f20534g, cVar, n0.C);
        this.K = true;
        this.S = z5;
        this.T = false;
    }

    @Override // yo.s, vo.u
    public final boolean C() {
        return false;
    }

    @Override // yo.k0, yo.s
    public final s D0(up.e eVar, vo.c kind, vo.l newOwner, u uVar, n0 source, wo.h annotations) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        return new f(newOwner, (f) uVar, kind, this.S);
    }

    @Override // yo.s
    public final s E0(yo.r configuration) {
        up.e eVar;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        f fVar = (f) super.E0(configuration);
        if (fVar == null) {
            return null;
        }
        List listL = fVar.L();
        Intrinsics.checkNotNullExpressionValue(listL, "getValueParameters(...)");
        if (listL != null && listL.isEmpty()) {
            return fVar;
        }
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            z type = ((q0) it.next()).getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            if (xr.m.p(type) != null) {
                List listL2 = fVar.L();
                Intrinsics.checkNotNullExpressionValue(listL2, "getValueParameters(...)");
                ArrayList arrayList = new ArrayList(e0.l(listL2, 10));
                Iterator it2 = listL2.iterator();
                while (it2.hasNext()) {
                    z type2 = ((q0) it2.next()).getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                    arrayList.add(xr.m.p(type2));
                }
                int size = fVar.L().size() - arrayList.size();
                boolean z5 = true;
                if (size == 0) {
                    List listL3 = fVar.L();
                    Intrinsics.checkNotNullExpressionValue(listL3, "getValueParameters(...)");
                    ArrayList<Pair> arrayListN0 = CollectionsKt.n0(arrayList, listL3);
                    if (arrayListN0.isEmpty()) {
                        return fVar;
                    }
                    for (Pair pair : arrayListN0) {
                        if (!Intrinsics.areEqual((up.e) pair.f14612d, ((q0) pair.f14613e).getName())) {
                        }
                    }
                    return fVar;
                }
                List<q0> listL4 = fVar.L();
                Intrinsics.checkNotNullExpressionValue(listL4, "getValueParameters(...)");
                ArrayList arrayList2 = new ArrayList(e0.l(listL4, 10));
                for (q0 q0Var : listL4) {
                    up.e name = q0Var.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    int i7 = q0Var.f23468y;
                    int i10 = i7 - size;
                    if (i10 >= 0 && (eVar = (up.e) arrayList.get(i10)) != null) {
                        name = eVar;
                    }
                    arrayList2.add(q0Var.B0(fVar, name, i7));
                }
                yo.r rVarH0 = fVar.H0(y0.f15267b);
                if (arrayList.isEmpty()) {
                    z5 = false;
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((up.e) it3.next()) == null) {
                        }
                    }
                    z5 = false;
                }
                rVarH0.S = Boolean.valueOf(z5);
                rVarH0.f23475y = arrayList2;
                rVarH0.f23473w = fVar.a();
                Intrinsics.checkNotNullExpressionValue(rVarH0, "setOriginal(...)");
                s sVarE0 = super.E0(rVarH0);
                Intrinsics.checkNotNull(sVarE0);
                return sVarE0;
            }
        }
        return fVar;
    }

    @Override // yo.s, vo.x
    public final boolean isExternal() {
        return false;
    }

    @Override // yo.s, vo.u
    public final boolean isInline() {
        return false;
    }
}
