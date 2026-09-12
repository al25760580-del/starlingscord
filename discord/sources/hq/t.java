package hq;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import pp.a1;
import pp.g1;
import pp.i0;
import pp.s0;
import vo.e0;
import vo.o0;
import yo.j0;
import yo.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bc.k f11068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f11069b;

    public t(bc.k c8) {
        Intrinsics.checkNotNullParameter(c8, "c");
        this.f11068a = c8;
        j jVar = (j) c8.f3122e;
        this.f11069b = new io.sentry.internal.debugmeta.c(jVar.f11020b, jVar.f11028l);
    }

    public final a3.r a(vo.l lVar) {
        if (lVar instanceof e0) {
            up.c cVar = ((yo.b0) ((e0) lVar)).f23420x;
            bc.k kVar = this.f11068a;
            return new v(cVar, (rp.f) kVar.f3123i, (pf.b) kVar.f3125w, (jq.l) kVar.E);
        }
        if (lVar instanceof jq.j) {
            return ((jq.j) lVar).T;
        }
        return null;
    }

    public final wo.h b(vp.k kVar, int i7, a aVar) {
        return !rp.d.f19514c.g(i7).booleanValue() ? wo.g.f22379a : new jq.x(((j) this.f11068a.f3122e).f11019a, new q(this, kVar, aVar, 0));
    }

    public final wo.h c(i0 i0Var, boolean z5) {
        return !rp.d.f19514c.g(i0Var.f18318v).booleanValue() ? wo.g.f22379a : new jq.x(((j) this.f11068a.f3122e).f11019a, new r(this, z5, i0Var));
    }

    public final jq.c d(pp.n proto, boolean z5) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        bc.k kVar = this.f11068a;
        vo.l lVar = (vo.l) kVar.f3124v;
        Intrinsics.checkNotNull(lVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        vo.f fVar = (vo.f) lVar;
        int i7 = proto.f18377v;
        a aVar = a.f10992d;
        jq.c cVar = new jq.c(fVar, null, b(proto, i7, aVar), z5, vo.c.f21792d, proto, (rp.f) kVar.f3123i, (pf.b) kVar.f3125w, (rp.g) kVar.f3126x, (jq.l) kVar.E, null);
        t tVar = (t) kVar.b(cVar, n0.f14659d, (rp.f) kVar.f3123i, (pf.b) kVar.f3125w, (rp.g) kVar.f3126x, (rp.a) kVar.f3127y).G;
        List list = proto.f18378w;
        Intrinsics.checkNotNullExpressionValue(list, "getValueParameterList(...)");
        cVar.P0(tVar.g(list, proto, aVar), sa.a.i((g1) rp.d.f19515d.g(proto.f18377v)));
        cVar.L0(fVar.j());
        cVar.P = fVar.y();
        cVar.T = !rp.d.f19524o.g(proto.f18377v).booleanValue();
        return cVar;
    }

    public final jq.u e(pp.a0 proto) {
        int i7;
        lq.z zVarG;
        bc.k kVar = this.f11068a;
        rp.f fVar = (rp.f) kVar.f3123i;
        pf.b typeTable = (pf.b) kVar.f3125w;
        Intrinsics.checkNotNullParameter(proto, "proto");
        if ((proto.f18200i & 1) == 1) {
            i7 = proto.f18201v;
        } else {
            int i10 = proto.f18202w;
            i7 = ((i10 >> 8) << 6) + (i10 & 63);
        }
        a aVar = a.f10992d;
        wo.h hVarB = b(proto, i7, aVar);
        Intrinsics.checkNotNullParameter(proto, "<this>");
        int i11 = proto.f18200i;
        int i12 = i11 & 32;
        wo.f fVar2 = wo.g.f22379a;
        wo.h aVar2 = (i12 == 32 || (i11 & 64) == 64) ? new jq.a(((j) kVar.f3122e).f11019a, new q(this, proto, aVar, 1)) : fVar2;
        int i13 = i7;
        jq.u ownerFunction = new jq.u((vo.l) kVar.f3124v, null, hVarB, mo.c0.w(fVar, proto.f18203x), sa.a.y((pp.b0) rp.d.f19525p.g(i7)), proto, (rp.f) kVar.f3123i, typeTable, Intrinsics.areEqual(bq.e.g((vo.l) kVar.f3124v).a(mo.c0.w(fVar, proto.f18203x)), y.f11080a) ? rp.g.f19539b : (rp.g) kVar.f3126x, (jq.l) kVar.E, null);
        List list = proto.F;
        Intrinsics.checkNotNullExpressionValue(list, "getTypeParameterList(...)");
        bc.k kVarB = kVar.b(ownerFunction, list, (rp.f) kVar.f3123i, (pf.b) kVar.f3125w, (rp.g) kVar.f3126x, (rp.a) kVar.f3127y);
        c0 typeDeserializer = (c0) kVarB.F;
        s0 s0VarY = ls.d.y(proto, typeTable);
        yo.t tVarN = (s0VarY == null || (zVarG = typeDeserializer.g(s0VarY)) == null) ? null : mf.f.n(ownerFunction, zVarG, aVar2);
        vo.l lVar = (vo.l) kVar.f3124v;
        vo.f fVar3 = lVar instanceof vo.f ? (vo.f) lVar : null;
        yo.t tVarU0 = fVar3 != null ? fVar3.u0() : null;
        Intrinsics.checkNotNullParameter(proto, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List list2 = proto.I;
        if (list2.isEmpty()) {
            list2 = null;
        }
        if (list2 == null) {
            List<Integer> list3 = proto.J;
            Intrinsics.checkNotNullExpressionValue(list3, "getContextReceiverTypeIdList(...)");
            ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(list3, 10));
            for (Integer num : list3) {
                Intrinsics.checkNotNull(num);
                arrayList.add(typeTable.f(num.intValue()));
            }
            list2 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i14 = 0;
        for (Object obj : list2) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                kotlin.collections.d0.k();
                throw null;
            }
            yo.t tVarH = mf.f.h(ownerFunction, typeDeserializer.g((s0) obj), null, fVar2, i14);
            if (tVarH != null) {
                arrayList2.add(tVarH);
            }
            i14 = i15;
        }
        List listB = typeDeserializer.b();
        t tVar = (t) kVarB.G;
        List list4 = proto.L;
        Intrinsics.checkNotNullExpressionValue(list4, "getValueParameterList(...)");
        ownerFunction.P0(tVarN, tVarU0, arrayList2, listB, tVar.g(list4, proto, aVar), typeDeserializer.g(ls.d.B(proto, typeTable)), k.e((pp.c0) rp.d.f19516e.g(i13)), sa.a.i((g1) rp.d.f19515d.g(i13)), w0.d());
        ownerFunction.K = com.discord.chat.presentation.list.a.t(rp.d.f19526q, i13, "get(...)");
        ownerFunction.L = com.discord.chat.presentation.list.a.t(rp.d.f19527r, i13, "get(...)");
        ownerFunction.M = com.discord.chat.presentation.list.a.t(rp.d.f19530u, i13, "get(...)");
        ownerFunction.N = com.discord.chat.presentation.list.a.t(rp.d.f19528s, i13, "get(...)");
        ownerFunction.O = com.discord.chat.presentation.list.a.t(rp.d.f19529t, i13, "get(...)");
        ownerFunction.S = com.discord.chat.presentation.list.a.t(rp.d.f19531v, i13, "get(...)");
        ownerFunction.P = com.discord.chat.presentation.list.a.t(rp.d.f19532w, i13, "get(...)");
        ownerFunction.T = !rp.d.f19533x.g(i13).booleanValue();
        ((j) kVar.f3122e).f11029m.getClass();
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(ownerFunction, "ownerFunction");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(typeDeserializer, "typeDeserializer");
        return ownerFunction;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0106  */
    public final jq.t f(i0 proto) {
        int i7;
        t tVar;
        wo.h aVar;
        boolean z5;
        int i10;
        rp.b bVar;
        String str;
        yo.i0 i0VarI;
        t tVar2;
        yo.i0 i0Var;
        j0 j0VarJ;
        lq.z zVarG;
        bc.k kVar = this.f11068a;
        pf.b typeTable = (pf.b) kVar.f3125w;
        Intrinsics.checkNotNullParameter(proto, "proto");
        if ((proto.f18317i & 1) == 1) {
            i7 = proto.f18318v;
        } else {
            int i11 = proto.f18319w;
            i7 = ((i11 >> 8) << 6) + (i11 & 63);
        }
        int i12 = i7;
        jq.t tVar3 = new jq.t((vo.l) kVar.f3124v, null, b(proto, i7, a.f10993e), k.e((pp.c0) rp.d.f19516e.g(i7)), sa.a.i((g1) rp.d.f19515d.g(i7)), com.discord.chat.presentation.list.a.t(rp.d.f19534y, i7, "get(...)"), mo.c0.w((rp.f) kVar.f3123i, proto.f18320x), sa.a.y((pp.b0) rp.d.f19525p.g(i7)), com.discord.chat.presentation.list.a.t(rp.d.C, i7, "get(...)"), com.discord.chat.presentation.list.a.t(rp.d.B, i7, "get(...)"), com.discord.chat.presentation.list.a.t(rp.d.E, i7, "get(...)"), com.discord.chat.presentation.list.a.t(rp.d.F, i7, "get(...)"), com.discord.chat.presentation.list.a.t(rp.d.G, i7, "get(...)"), proto, (rp.f) kVar.f3123i, typeTable, (rp.g) kVar.f3126x, (jq.l) kVar.E);
        List list = proto.F;
        Intrinsics.checkNotNullExpressionValue(list, "getTypeParameterList(...)");
        bc.k kVarB = kVar.b(tVar3, list, (rp.f) kVar.f3123i, (pf.b) kVar.f3125w, (rp.g) kVar.f3126x, (rp.a) kVar.f3127y);
        c0 c0Var = (c0) kVarB.F;
        boolean zT = com.discord.chat.presentation.list.a.t(rp.d.f19535z, i12, "get(...)");
        wo.f fVar = wo.g.f22379a;
        a aVar2 = a.f10994i;
        if (zT) {
            Intrinsics.checkNotNullParameter(proto, "<this>");
            int i13 = proto.f18317i;
            if ((i13 & 32) == 32 || (i13 & 64) == 64) {
                kq.l lVar = ((j) kVar.f3122e).f11019a;
                tVar = this;
                aVar = new jq.a(lVar, new q(tVar, proto, aVar2, 1));
            } else {
                tVar = this;
                aVar = fVar;
            }
        } else {
            tVar = this;
            aVar = fVar;
        }
        lq.z zVarG2 = c0Var.g(ls.d.C(proto, typeTable));
        List listB = c0Var.b();
        vo.l lVar2 = (vo.l) kVar.f3124v;
        vo.f fVar2 = lVar2 instanceof vo.f ? (vo.f) lVar2 : null;
        yo.t tVarU0 = fVar2 != null ? fVar2.u0() : null;
        Intrinsics.checkNotNullParameter(proto, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        int i14 = proto.f18317i;
        yo.t tVar4 = tVarU0;
        s0 s0VarF = (i14 & 32) == 32 ? proto.G : (i14 & 64) == 64 ? typeTable.f(proto.H) : null;
        yo.t tVarN = (s0VarF == null || (zVarG = c0Var.g(s0VarF)) == null) ? null : mf.f.n(tVar3, zVarG, aVar);
        Intrinsics.checkNotNullParameter(proto, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List list2 = proto.I;
        if (list2.isEmpty()) {
            list2 = null;
        }
        int i15 = 10;
        if (list2 == null) {
            List<Integer> list3 = proto.J;
            Intrinsics.checkNotNullExpressionValue(list3, "getContextReceiverTypeIdList(...)");
            ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(list3, 10));
            for (Integer num : list3) {
                Intrinsics.checkNotNull(num);
                arrayList.add(typeTable.f(num.intValue()));
            }
            list2 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.l(list2, 10));
        int i16 = 0;
        for (Object obj : list2) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                kotlin.collections.d0.k();
                throw null;
            }
            arrayList2.add(mf.f.h(tVar3, c0Var.g((s0) obj), null, fVar, i16));
            i15 = i15;
            i16 = i17;
        }
        int i18 = i15;
        tVar3.I0(zVarG2, listB, tVar4, tVarN, arrayList2);
        rp.b bVar2 = rp.d.f19514c;
        boolean zT2 = com.discord.chat.presentation.list.a.t(bVar2, i12, "get(...)");
        rp.c cVar = rp.d.f19515d;
        g1 g1Var = (g1) cVar.g(i12);
        rp.c cVar2 = rp.d.f19516e;
        pp.c0 c0Var2 = (pp.c0) cVar2.g(i12);
        if (g1Var == null) {
            rp.d.a(i18);
            throw null;
        }
        if (c0Var2 == null) {
            rp.d.a(11);
            throw null;
        }
        if (zT2) {
            z5 = true;
            i10 = 1 << bVar2.f11804b;
        } else {
            z5 = true;
            i10 = 0;
        }
        int iA = i10 | (c0Var2.a() << cVar2.f11804b) | (g1Var.a() << cVar.f11804b);
        rp.b bVar3 = rp.d.K;
        bVar3.getClass();
        rp.b bVar4 = rp.d.L;
        bVar4.getClass();
        rp.b bVar5 = rp.d.M;
        bVar5.getClass();
        o0 o0Var = vo.n0.C;
        if (zT) {
            int i19 = (proto.f18317i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256 ? proto.M : iA;
            boolean zT3 = com.discord.chat.presentation.list.a.t(bVar3, i19, "get(...)");
            boolean zT4 = com.discord.chat.presentation.list.a.t(bVar4, i19, "get(...)");
            str = "get(...)";
            boolean zT5 = com.discord.chat.presentation.list.a.t(bVar5, i19, str);
            wo.h hVarB = tVar.b(proto, i19, aVar2);
            if (zT3) {
                bVar = bVar3;
                i0VarI = new yo.i0(tVar3, hVarB, k.e((pp.c0) cVar2.g(i19)), sa.a.i((g1) cVar.g(i19)), !zT3, zT4, zT5, tVar3.c(), null, o0Var);
            } else {
                bVar = bVar3;
                i0VarI = mf.f.i(tVar3, hVarB);
                Intrinsics.checkNotNull(i0VarI);
            }
            i0VarI.E0(tVar3.getReturnType());
        } else {
            iA = iA;
            cVar = cVar;
            bVar = bVar3;
            cVar2 = cVar2;
            bVar4 = bVar4;
            bVar5 = bVar5;
            str = "get(...)";
            i0VarI = null;
        }
        if (rp.d.A.g(r10).booleanValue()) {
            int i20 = (proto.f18317i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512 ? proto.N : iA;
            boolean zT6 = com.discord.chat.presentation.list.a.t(bVar, i20, str);
            boolean zT7 = com.discord.chat.presentation.list.a.t(bVar4, i20, str);
            boolean zT8 = com.discord.chat.presentation.list.a.t(bVar5, i20, str);
            a aVar3 = a.f10995v;
            tVar2 = this;
            wo.h hVarB2 = tVar2.b(proto, i20, aVar3);
            if (zT6) {
                i0Var = i0VarI;
                j0 j0Var = new j0(tVar3, hVarB2, k.e((pp.c0) cVar2.g(i20)), sa.a.i((g1) cVar.g(i20)), !zT6, zT7, zT8, tVar3.c(), null, o0Var);
                q0 q0Var = (q0) CollectionsKt.Z(((t) kVarB.b(j0Var, n0.f14659d, (rp.f) kVarB.f3123i, (pf.b) kVarB.f3125w, (rp.g) kVarB.f3126x, (rp.a) kVarB.f3127y).G).g(kotlin.collections.c0.c(proto.L), proto, aVar3));
                if (q0Var == null) {
                    j0.v0(6);
                    throw null;
                }
                j0Var.K = q0Var;
                j0VarJ = j0Var;
            } else {
                i0Var = i0VarI;
                j0VarJ = mf.f.j(tVar3, hVarB2);
                Intrinsics.checkNotNull(j0VarJ);
            }
        } else {
            tVar2 = this;
            i0Var = i0VarI;
            j0VarJ = null;
        }
        if (rp.d.D.g(i12).booleanValue()) {
            tVar3.G0(null, new p(tVar2, proto, tVar3, 0));
        }
        vo.l lVar3 = (vo.l) kVar.f3124v;
        vo.f fVar3 = lVar3 instanceof vo.f ? (vo.f) lVar3 : null;
        if ((fVar3 != null ? fVar3.c() : null) == vo.g.f21812w) {
            tVar3.G0(null, new p(tVar2, proto, tVar3, 1));
        }
        tVar3.F0(i0Var, j0VarJ, new yo.q(tVar2.c(proto, false), tVar3), new yo.q(tVar2.c(proto, z5), tVar3));
        return tVar3;
    }

    public final List g(List list, vp.k kVar, a aVar) {
        int i7;
        wo.h xVar;
        t tVar = this;
        bc.k kVar2 = tVar.f11068a;
        pf.b typeTable = (pf.b) kVar2.f3125w;
        c0 c0Var = (c0) kVar2.F;
        vo.l lVar = (vo.l) kVar2.f3124v;
        Intrinsics.checkNotNull(lVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        vo.b bVar = (vo.b) lVar;
        vo.l lVarG = bVar.g();
        Intrinsics.checkNotNullExpressionValue(lVarG, "getContainingDeclaration(...)");
        a3.r rVarA = tVar.a(lVarG);
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            lq.z zVarG = null;
            if (i10 < 0) {
                kotlin.collections.d0.k();
                throw null;
            }
            a1 a1Var = (a1) obj;
            int i12 = (a1Var.f18206i & 1) == 1 ? a1Var.f18207v : 0;
            if (rVarA == null || !rp.d.f19514c.g(i12).booleanValue()) {
                i7 = i10;
                xVar = wo.g.f22379a;
            } else {
                i7 = i10;
                xVar = new jq.x(((j) kVar2.f3122e).f11019a, new s(tVar, rVarA, kVar, aVar, i7, a1Var));
            }
            up.e eVarW = mo.c0.w((rp.f) kVar2.f3123i, a1Var.f18208w);
            lq.z zVarG2 = c0Var.g(ls.d.J(a1Var, typeTable));
            boolean zT = com.discord.chat.presentation.list.a.t(rp.d.H, i12, "get(...)");
            boolean zT2 = com.discord.chat.presentation.list.a.t(rp.d.I, i12, "get(...)");
            Boolean boolG = rp.d.J.g(i12);
            Intrinsics.checkNotNullExpressionValue(boolG, "get(...)");
            boolean zBooleanValue = boolG.booleanValue();
            Intrinsics.checkNotNullParameter(a1Var, "<this>");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            int i13 = a1Var.f18206i;
            s0 s0VarF = (i13 & 16) == 16 ? a1Var.E : (i13 & 32) == 32 ? typeTable.f(a1Var.F) : null;
            if (s0VarF != null) {
                zVarG = c0Var.g(s0VarF);
            }
            o0 NO_SOURCE = vo.n0.C;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new q0(bVar, null, i7, xVar, eVarW, zVarG2, zT, zT2, zBooleanValue, zVarG, NO_SOURCE));
            arrayList = arrayList2;
            i10 = i11;
            tVar = this;
        }
        return CollectionsKt.i0(arrayList);
    }
}
