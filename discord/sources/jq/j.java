package jq;

import ar.c1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import lq.d0;
import lq.q0;
import mo.c0;
import pp.f1;
import pp.g1;
import pp.y0;
import vo.l0;
import vo.m0;
import vo.n0;
import vo.o0;
import vo.s0;
import vo.y;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends yo.b implements vo.l {
    public final up.b E;
    public final y F;
    public final ep.p G;
    public final vo.g H;
    public final bc.k I;
    public final eq.p J;
    public final ip.h K;
    public final m0 L;
    public final e4.i M;
    public final vo.l N;
    public final kq.h O;
    public final kq.i P;
    public final kq.h Q;
    public final kq.i R;
    public final kq.h S;
    public final hq.u T;
    public final wo.h U;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final pp.k f14030w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final rp.a f14031x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n0 f14032y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(bc.k outerContext, pp.k classProto, rp.f nameResolver, rp.a metadataVersion, n0 sourceElement) {
        vo.g gVar;
        eq.p sVar;
        super(((hq.j) outerContext.f3122e).f11019a, c0.s(nameResolver, classProto.f18343w).f());
        Intrinsics.checkNotNullParameter(outerContext, "outerContext");
        Intrinsics.checkNotNullParameter(classProto, "classProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        this.f14030w = classProto;
        this.f14031x = metadataVersion;
        this.f14032y = sourceElement;
        this.E = c0.s(nameResolver, classProto.f18343w);
        this.F = hq.k.e((pp.c0) rp.d.f19516e.g(classProto.f18342v));
        this.G = sa.a.i((g1) rp.d.f19515d.g(classProto.f18342v));
        pp.j jVar = (pp.j) rp.d.f19517f.g(classProto.f18342v);
        switch (jVar == null ? -1 : hq.w.f11077b[jVar.ordinal()]) {
            case 1:
                gVar = vo.g.f21808d;
                break;
            case 2:
                gVar = vo.g.f21809e;
                break;
            case 3:
                gVar = vo.g.f21810i;
                break;
            case 4:
                gVar = vo.g.f21811v;
                break;
            case 5:
                gVar = vo.g.f21812w;
                break;
            case 6:
            case 7:
                gVar = vo.g.f21813x;
                break;
            default:
                gVar = vo.g.f21808d;
                break;
        }
        vo.g gVar2 = gVar;
        this.H = gVar2;
        List list = classProto.f18345y;
        Intrinsics.checkNotNullExpressionValue(list, "getTypeParameterList(...)");
        y0 y0Var = classProto.f18334b0;
        Intrinsics.checkNotNullExpressionValue(y0Var, "getTypeTable(...)");
        pf.b bVar = new pf.b(y0Var);
        rp.g gVar3 = rp.g.f19539b;
        f1 f1Var = classProto.f18336d0;
        Intrinsics.checkNotNullExpressionValue(f1Var, "getVersionRequirementTable(...)");
        bc.k kVarB = outerContext.b(this, list, nameResolver, bVar, ls.l.n(f1Var), metadataVersion);
        hq.j jVar2 = (hq.j) kVarB.f3122e;
        this.I = kVarB;
        boolean zT = com.discord.chat.presentation.list.a.t(rp.d.f19522m, classProto.f18342v, "get(...)");
        vo.g gVar4 = vo.g.f21810i;
        int i7 = 0;
        if (gVar2 == gVar4) {
            sVar = new eq.s(jVar2.f11019a, this, zT || Intrinsics.areEqual(jVar2.f11035s.d(), Boolean.TRUE));
        } else {
            sVar = eq.n.f8648b;
        }
        this.J = sVar;
        this.K = new ip.h(this);
        o0 o0Var = m0.f21816d;
        kq.l storageManager = jVar2.f11019a;
        kq.l lVar = jVar2.f11019a;
        ((mq.l) jVar2.f11033q).getClass();
        c1 scopeFactory = new c1(1, this, h.class, "<init>", "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V", 0, 5);
        o0Var.getClass();
        Intrinsics.checkNotNullParameter(this, "classDescriptor");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        mq.f kotlinTypeRefinerForOwnerModule = mq.f.f16018a;
        Intrinsics.checkNotNullParameter(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
        Intrinsics.checkNotNullParameter(scopeFactory, "scopeFactory");
        this.L = new m0(this, storageManager, scopeFactory);
        this.M = gVar2 == gVar4 ? new e4.i(this) : null;
        vo.l lVar2 = (vo.l) outerContext.f3124v;
        this.N = lVar2;
        d dVar = new d(this, i7);
        lVar.getClass();
        this.O = new kq.h(lVar, dVar);
        d dVar2 = new d(this, 1);
        lVar.getClass();
        this.P = new kq.i(lVar, dVar2);
        d dVar3 = new d(this, 2);
        lVar.getClass();
        this.Q = new kq.h(lVar, dVar3);
        d dVar4 = new d(this, 3);
        lVar.getClass();
        this.R = new kq.i(lVar, dVar4);
        d dVar5 = new d(this, 4);
        lVar.getClass();
        this.S = new kq.h(lVar, dVar5);
        rp.f fVar = (rp.f) kVarB.f3123i;
        pf.b bVar2 = (pf.b) kVarB.f3125w;
        j jVar3 = lVar2 instanceof j ? (j) lVar2 : null;
        this.T = new hq.u(classProto, fVar, bVar2, sourceElement, jVar3 != null ? jVar3.T : null);
        this.U = !rp.d.f19514c.g(classProto.f18342v).booleanValue() ? wo.g.f22379a : new x(lVar, new d(this, 5));
    }

    @Override // yo.y
    public final eq.o B(mq.f kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.L.a(kotlinTypeRefiner);
    }

    @Override // vo.f
    public final yo.h E() {
        return (yo.h) this.O.invoke();
    }

    @Override // vo.f
    public final eq.o F() {
        return this.J;
    }

    @Override // vo.f
    public final vo.f H() {
        return (vo.f) this.Q.invoke();
    }

    @Override // vo.f
    public final vo.g c() {
        return this.H;
    }

    @Override // vo.m
    public final n0 d() {
        return this.f14032y;
    }

    @Override // vo.f, vo.x
    public final y e() {
        return this.F;
    }

    @Override // vo.l
    public final vo.l g() {
        return this.N;
    }

    @Override // wo.a
    public final wo.h getAnnotations() {
        return this.U;
    }

    @Override // vo.f, vo.x, vo.o
    public final ep.p getVisibility() {
        return this.G;
    }

    @Override // vo.x
    public final boolean isExternal() {
        return com.discord.chat.presentation.list.a.t(rp.d.f19520i, this.f14030w.f18342v, "get(...)");
    }

    @Override // vo.f
    public final boolean isInline() {
        if (!rp.d.k.g(this.f14030w.f18342v).booleanValue()) {
            return false;
        }
        rp.a aVar = this.f14031x;
        int i7 = aVar.f19507b;
        if (i7 >= 1) {
            if (i7 > 1) {
                return false;
            }
            int i10 = aVar.f19508c;
            if (i10 >= 4 && (i10 > 4 || aVar.f19509d > 1)) {
                return false;
            }
        }
        return true;
    }

    @Override // vo.f
    public final boolean isValue() {
        return rp.d.k.g(this.f14030w.f18342v).booleanValue() && this.f14031x.a(1, 4, 2);
    }

    @Override // vo.f
    public final s0 j0() {
        return (s0) this.S.invoke();
    }

    @Override // vo.f, vo.j
    public final List l() {
        return ((hq.c0) this.I.F).b();
    }

    public final h l0() {
        ((mq.l) ((hq.j) this.I.f3122e).f11033q).getClass();
        return (h) this.L.a(mq.f.f16018a);
    }

    @Override // vo.i
    public final q0 n() {
        return this.K;
    }

    @Override // vo.f
    public final boolean o() {
        return rp.d.f19517f.g(this.f14030w.f18342v) == pp.j.COMPANION_OBJECT;
    }

    @Override // vo.x
    public final boolean o0() {
        return false;
    }

    @Override // vo.f
    public final Collection p() {
        return (Collection) this.P.invoke();
    }

    @Override // yo.b, vo.f
    public final List p0() {
        bc.k kVar = this.I;
        pf.b typeTable = (pf.b) kVar.f3125w;
        pp.k kVar2 = this.f14030w;
        Intrinsics.checkNotNullParameter(kVar2, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List list = kVar2.J;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            List<Integer> list2 = kVar2.K;
            Intrinsics.checkNotNullExpressionValue(list2, "getContextReceiverTypeIdList(...)");
            ArrayList arrayList = new ArrayList(e0.l(list2, 10));
            for (Integer num : list2) {
                Intrinsics.checkNotNull(num);
                arrayList.add(typeTable.f(num.intValue()));
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(e0.l(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new yo.t(u0(), new fq.b(this, ((hq.c0) kVar.F).g((pp.s0) it.next()), (up.e) null), wo.g.f22379a));
        }
        return arrayList2;
    }

    public final d0 q0(up.e eVar) {
        Iterator it = l0().a(eVar, dp.c.f7699y).iterator();
        boolean z5 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z5) {
                    break;
                }
                break;
            }
            Object next = it.next();
            if (((l0) next).V() == null) {
                if (!z5) {
                    z5 = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        l0 l0Var = (l0) obj;
        return (d0) (l0Var != null ? l0Var.getType() : null);
    }

    @Override // vo.f
    public final boolean s() {
        return com.discord.chat.presentation.list.a.t(rp.d.f19521l, this.f14030w.f18342v, "get(...)");
    }

    @Override // vo.f
    public final boolean s0() {
        return com.discord.chat.presentation.list.a.t(rp.d.f19519h, this.f14030w.f18342v, "get(...)");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("deserialized ");
        sb2.append(y() ? "expect " : "");
        sb2.append("class ");
        sb2.append(getName());
        return sb2.toString();
    }

    @Override // vo.f
    public final Collection w() {
        return (Collection) this.R.invoke();
    }

    @Override // vo.x
    public final boolean y() {
        return com.discord.chat.presentation.list.a.t(rp.d.j, this.f14030w.f18342v, "get(...)");
    }

    @Override // vo.j
    public final boolean z() {
        return com.discord.chat.presentation.list.a.t(rp.d.f19518g, this.f14030w.f18342v, "get(...)");
    }
}
