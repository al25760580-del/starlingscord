package jq;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import lq.e1;
import lq.z;
import mo.c0;
import pp.s0;
import pp.w0;
import pp.x0;
import vo.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends yo.c {
    public final bc.k I;
    public final x0 J;
    public final a K;

    /* JADX WARN: Illegal instructions before constructor call */
    public w(bc.k c8, x0 proto, int i7) {
        e1 e1Var;
        Intrinsics.checkNotNullParameter(c8, "c");
        Intrinsics.checkNotNullParameter(proto, "proto");
        hq.j jVar = (hq.j) c8.f3122e;
        kq.l lVar = jVar.f11019a;
        vo.l lVar2 = (vo.l) c8.f3124v;
        up.e eVarW = c0.w((rp.f) c8.f3123i, proto.f18486w);
        w0 variance = proto.f18488y;
        Intrinsics.checkNotNullExpressionValue(variance, "getVariance(...)");
        Intrinsics.checkNotNullParameter(variance, "variance");
        int iOrdinal = variance.ordinal();
        if (iOrdinal == 0) {
            e1Var = e1.IN_VARIANCE;
        } else if (iOrdinal == 1) {
            e1Var = e1.OUT_VARIANCE;
        } else {
            if (iOrdinal != 2) {
                throw new rn.n();
            }
            e1Var = e1.INVARIANT;
        }
        e1 e1Var2 = e1Var;
        super(lVar, lVar2, wo.g.f22379a, eVarW, e1Var2, proto.f18487x, i7, o0.f21822i);
        this.I = c8;
        this.J = proto;
        this.K = new a(jVar.f11019a, new ep.x(10, this));
    }

    @Override // yo.g
    public final void C0(z type) {
        Intrinsics.checkNotNullParameter(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }

    @Override // yo.g
    public final List D0() {
        bc.k kVar = this.I;
        pf.b typeTable = (pf.b) kVar.f3125w;
        x0 x0Var = this.J;
        Intrinsics.checkNotNullParameter(x0Var, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List list = x0Var.E;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            List<Integer> list2 = x0Var.F;
            Intrinsics.checkNotNullExpressionValue(list2, "getUpperBoundIdList(...)");
            ArrayList arrayList = new ArrayList(e0.l(list2, 10));
            for (Integer num : list2) {
                Intrinsics.checkNotNull(num);
                arrayList.add(typeTable.f(num.intValue()));
            }
            list = arrayList;
        }
        if (list.isEmpty()) {
            return kotlin.collections.c0.c(bq.e.e(this).n());
        }
        hq.c0 c0Var = (hq.c0) kVar.F;
        ArrayList arrayList2 = new ArrayList(e0.l(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(c0Var.g((s0) it.next()));
        }
        return arrayList2;
    }

    @Override // fq.a, wo.a
    public final wo.h getAnnotations() {
        return this.K;
    }
}
