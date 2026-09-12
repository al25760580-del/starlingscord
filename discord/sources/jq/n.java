package jq;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lq.d0;
import mo.c0;
import pp.a0;
import pp.g1;
import pp.i0;
import pp.s0;
import pp.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f14037e;

    public /* synthetic */ n(q qVar, int i7) {
        this.f14036d = i7;
        this.f14037e = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Collection<a0> collectionQ;
        Collection<i0> collectionQ2;
        s0 s0VarF;
        s0 s0VarF2;
        up.e it = (up.e) obj;
        switch (this.f14036d) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                q qVar = this.f14037e;
                LinkedHashMap linkedHashMap = qVar.f14045a;
                pp.a PARSER = a0.T;
                Intrinsics.checkNotNullExpressionValue(PARSER, "PARSER");
                r rVar = qVar.f14053i;
                byte[] bArr = (byte[]) linkedHashMap.get(it);
                if (bArr == null || (collectionQ = xq.r.q(xq.n.d(new p(PARSER, new ByteArrayInputStream(bArr), rVar, 0)))) == null) {
                    collectionQ = n0.f14659d;
                }
                ArrayList arrayList = new ArrayList(collectionQ.size());
                for (a0 a0Var : collectionQ) {
                    hq.t tVar = (hq.t) rVar.f14055b.G;
                    Intrinsics.checkNotNull(a0Var);
                    u uVarE = tVar.e(a0Var);
                    if (!rVar.r(uVarE)) {
                        uVarE = null;
                    }
                    if (uVarE != null) {
                        arrayList.add(uVarE);
                    }
                }
                rVar.j(arrayList, it);
                return vq.m.e(arrayList);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                q qVar2 = this.f14037e;
                LinkedHashMap linkedHashMap2 = qVar2.f14046b;
                pp.a PARSER2 = i0.T;
                Intrinsics.checkNotNullExpressionValue(PARSER2, "PARSER");
                r rVar2 = qVar2.f14053i;
                byte[] bArr2 = (byte[]) linkedHashMap2.get(it);
                if (bArr2 == null || (collectionQ2 = xq.r.q(xq.n.d(new p(PARSER2, new ByteArrayInputStream(bArr2), rVar2, 0)))) == null) {
                    collectionQ2 = n0.f14659d;
                }
                ArrayList arrayList2 = new ArrayList(collectionQ2.size());
                for (i0 i0Var : collectionQ2) {
                    hq.t tVar2 = (hq.t) rVar2.f14055b.G;
                    Intrinsics.checkNotNull(i0Var);
                    arrayList2.add(tVar2.f(i0Var));
                }
                rVar2.k(arrayList2, it);
                return vq.m.e(arrayList2);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                q qVar3 = this.f14037e;
                bc.k kVar = qVar3.f14053i.f14055b;
                byte[] bArr3 = (byte[]) qVar3.f14047c.get(it);
                if (bArr3 != null) {
                    u0 proto = (u0) u0.N.b(new ByteArrayInputStream(bArr3), ((hq.j) kVar.f3122e).f11032p);
                    if (proto != null) {
                        hq.t tVar3 = (hq.t) kVar.G;
                        bc.k kVar2 = tVar3.f11068a;
                        rp.f fVar = (rp.f) kVar2.f3123i;
                        pf.b typeTable = (pf.b) kVar2.f3125w;
                        Intrinsics.checkNotNullParameter(proto, "proto");
                        List<pp.h> list = proto.H;
                        Intrinsics.checkNotNullExpressionValue(list, "getAnnotationList(...)");
                        ArrayList annotations = new ArrayList(e0.l(list, 10));
                        for (pp.h hVar : list) {
                            io.sentry.internal.debugmeta.c cVar = tVar3.f11069b;
                            Intrinsics.checkNotNull(hVar);
                            annotations.add(cVar.s0(hVar, fVar));
                        }
                        Intrinsics.checkNotNullParameter(annotations, "annotations");
                        v vVar = new v(((hq.j) kVar2.f3122e).f11019a, (vo.l) kVar2.f3124v, annotations.isEmpty() ? wo.g.f22379a : new wo.i(0, annotations), c0.w(fVar, proto.f18454w), sa.a.i((g1) rp.d.f19515d.g(proto.f18453v)), proto, (rp.f) kVar2.f3123i, typeTable, (rp.g) kVar2.f3126x, (l) kVar2.E);
                        List list2 = proto.f18455x;
                        Intrinsics.checkNotNullExpressionValue(list2, "getTypeParameterList(...)");
                        hq.c0 c0Var = (hq.c0) kVar2.b(vVar, list2, (rp.f) kVar2.f3123i, (pf.b) kVar2.f3125w, (rp.g) kVar2.f3126x, (rp.a) kVar2.f3127y).F;
                        List listB = c0Var.b();
                        Intrinsics.checkNotNullParameter(proto, "<this>");
                        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
                        int i7 = proto.f18452i;
                        if ((i7 & 4) == 4) {
                            s0VarF = proto.f18456y;
                            Intrinsics.checkNotNullExpressionValue(s0VarF, "getUnderlyingType(...)");
                        } else {
                            if ((i7 & 8) != 8) {
                                throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
                            }
                            s0VarF = typeTable.f(proto.E);
                        }
                        d0 d0VarD = c0Var.d(s0VarF, false);
                        Intrinsics.checkNotNullParameter(proto, "<this>");
                        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
                        int i10 = proto.f18452i;
                        if ((i10 & 16) == 16) {
                            s0VarF2 = proto.F;
                            Intrinsics.checkNotNullExpressionValue(s0VarF2, "getExpandedType(...)");
                        } else {
                            if ((i10 & 32) != 32) {
                                throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
                            }
                            s0VarF2 = typeTable.f(proto.G);
                        }
                        vVar.E0(listB, d0VarD, c0Var.d(s0VarF2, false));
                        return vVar;
                    }
                }
                return null;
        }
    }
}
