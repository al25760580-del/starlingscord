package hq;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import lq.b1;
import lq.e1;
import lq.h0;
import lq.i0;
import lq.k0;
import lq.l0;
import lq.q0;
import lq.t0;
import pp.p0;
import pp.s0;
import pp.x0;
import vo.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bc.k f11001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f11002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kq.j f11005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kq.j f11006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f11007g;

    public c0(bc.k c8, c0 c0Var, List typeParameterProtos, String debugName, String containerPresentableName) {
        Map linkedHashMap;
        Intrinsics.checkNotNullParameter(c8, "c");
        Intrinsics.checkNotNullParameter(typeParameterProtos, "typeParameterProtos");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        Intrinsics.checkNotNullParameter(containerPresentableName, "containerPresentableName");
        this.f11001a = c8;
        this.f11002b = c0Var;
        this.f11003c = debugName;
        this.f11004d = containerPresentableName;
        j jVar = (j) c8.f3122e;
        this.f11005e = jVar.f11019a.d(new z(this, 0));
        this.f11006f = jVar.f11019a.d(new z(this, 1));
        if (typeParameterProtos.isEmpty()) {
            linkedHashMap = w0.d();
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = typeParameterProtos.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                x0 x0Var = (x0) it.next();
                linkedHashMap.put(Integer.valueOf(x0Var.f18485v), new jq.w(this.f11001a, x0Var, i7));
                i7++;
            }
        }
        this.f11007g = linkedHashMap;
    }

    public static lq.d0 a(lq.d0 d0Var, lq.z zVar) {
        so.i iVarO = c9.a.o(d0Var);
        wo.h annotations = d0Var.getAnnotations();
        lq.z zVarU = xr.m.u(d0Var);
        List listQ = xr.m.q(d0Var);
        List listG = CollectionsKt.G(xr.m.v(d0Var));
        ArrayList arrayList = new ArrayList(e0.l(listG, 10));
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            arrayList.add(((t0) it.next()).b());
        }
        return xr.m.i(iVarO, annotations, zVarU, listQ, arrayList, zVar, true).x0(d0Var.t0());
    }

    public static final ArrayList e(s0 s0Var, c0 c0Var) {
        List list = s0Var.f18434v;
        Intrinsics.checkNotNullExpressionValue(list, "getArgumentList(...)");
        s0 s0VarT = ls.d.t(s0Var, (pf.b) c0Var.f11001a.f3125w);
        Iterable iterableE = s0VarT != null ? e(s0VarT, c0Var) : null;
        if (iterableE == null) {
            iterableE = n0.f14659d;
        }
        return CollectionsKt.V(list, iterableE);
    }

    public static l0 f(List list, wo.h annotations, q0 q0Var, vo.l lVar) {
        l0 l0VarA;
        ArrayList arrayList = new ArrayList(e0.l(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((lq.n) it.next()).getClass();
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            if (annotations.isEmpty()) {
                l0.f15225e.getClass();
                l0VarA = l0.f15226i;
            } else {
                e4.r rVar = l0.f15225e;
                List listC = kotlin.collections.c0.c(new lq.j(annotations));
                rVar.getClass();
                l0VarA = e4.r.A(listC);
            }
            arrayList.add(l0VarA);
        }
        ArrayList arrayListM = e0.m(arrayList);
        l0.f15225e.getClass();
        return e4.r.A(arrayListM);
    }

    public static final vo.f h(c0 c0Var, s0 s0Var, int i7) {
        bc.k kVar = c0Var.f11001a;
        up.b bVarS = mo.c0.s((rp.f) kVar.f3123i, i7);
        xq.s sVarN = xq.r.n(xq.n.c(new z(c0Var, 2), s0Var), a0.f10997e);
        Intrinsics.checkNotNullParameter(sVarN, "<this>");
        ArrayList destination = new ArrayList();
        Intrinsics.checkNotNullParameter(sVarN, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Iterator it = sVarN.f23049a.iterator();
        while (it.hasNext()) {
            destination.add(sVarN.f23050b.invoke(it.next()));
        }
        int iE = xq.r.e(xq.n.c(b0.f10999d, bVarS));
        while (destination.size() < iE) {
            destination.add(0);
        }
        return ((j) kVar.f3122e).f11028l.d(bVarS, destination);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final List b() {
        return CollectionsKt.i0(this.f11007g.values());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final r0 c(int i7) {
        r0 r0Var = (r0) this.f11007g.get(Integer.valueOf(i7));
        if (r0Var != null) {
            return r0Var;
        }
        c0 c0Var = this.f11002b;
        if (c0Var != null) {
            return c0Var.c(i7);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x030c  */
    /* JADX WARN: Code duplicated, block: B:106:0x031f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0330  */
    /* JADX WARN: Code duplicated, block: B:110:0x0333  */
    /* JADX WARN: Code duplicated, block: B:111:0x0336  */
    /* JADX WARN: Code duplicated, block: B:114:0x0354  */
    /* JADX WARN: Code duplicated, block: B:116:0x036a  */
    /* JADX WARN: Code duplicated, block: B:117:0x036f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0379  */
    /* JADX WARN: Code duplicated, block: B:128:0x0396  */
    /* JADX WARN: Code duplicated, block: B:129:0x039b  */
    /* JADX WARN: Code duplicated, block: B:132:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:148:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:150:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:151:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:152:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:154:0x0414  */
    /* JADX WARN: Code duplicated, block: B:156:0x041b  */
    /* JADX WARN: Code duplicated, block: B:157:0x041d  */
    /* JADX WARN: Code duplicated, block: B:161:0x0448  */
    /* JADX WARN: Code duplicated, block: B:162:0x044b  */
    /* JADX WARN: Code duplicated, block: B:164:0x0450  */
    /* JADX WARN: Code duplicated, block: B:172:0x023f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x01ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x011c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0144  */
    /* JADX WARN: Code duplicated, block: B:49:0x0179  */
    /* JADX WARN: Code duplicated, block: B:51:0x0181  */
    /* JADX WARN: Code duplicated, block: B:53:0x019a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x019c  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:73:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:74:0x0201  */
    /* JADX WARN: Code duplicated, block: B:76:0x0206  */
    /* JADX WARN: Code duplicated, block: B:77:0x020d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0211  */
    /* JADX WARN: Code duplicated, block: B:80:0x0226  */
    /* JADX WARN: Instruction removed from duplicated block: B:157:0x041d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x01d3, please report this as an issue */
    public final lq.d0 d(s0 proto, boolean z5) {
        q0 typeConstructor;
        vo.i iVarH;
        Object next;
        l0 l0VarF;
        ArrayList arrayList;
        Iterator it;
        int i7;
        l0 l0Var;
        List arguments;
        String str;
        String str2;
        s0 s0VarF;
        lq.d0 d0VarT;
        lq.o oVarM;
        boolean z6;
        int size;
        lq.d0 d0VarT2;
        vo.i iVarG;
        to.k kVarS;
        t0 t0Var;
        lq.z zVarB;
        vo.i iVarG2;
        up.c cVarG;
        lq.d0 d0VarA;
        int size2;
        int i10;
        lq.d0 d0VarF;
        Object next2;
        int i11;
        pp.q0 q0Var;
        r0 r0Var;
        p0 projection;
        int iOrdinal;
        l0 l0Var2;
        e1 e1Var;
        int i12;
        char c8;
        s0 s0VarF2;
        t0 i0Var;
        bc.k kVar = this.f11001a;
        pf.b typeTable = (pf.b) kVar.f3125w;
        j jVar = (j) kVar.f3122e;
        vo.l lVar = (vo.l) kVar.f3124v;
        Intrinsics.checkNotNullParameter(proto, "proto");
        int i13 = proto.f18433i;
        if ((i13 & 16) == 16) {
            if (mo.c0.s((rp.f) kVar.f3123i, proto.F).f21260c) {
                ((j) kVar.f3122e).f11025g.getClass();
            }
        } else if ((i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            if (mo.c0.s((rp.f) kVar.f3123i, proto.I).f21260c) {
                ((j) kVar.f3122e).f11025g.getClass();
            }
        }
        int i14 = proto.f18433i;
        if ((i14 & 16) != 16) {
            if ((i14 & 32) == 32) {
                iVarH = c(proto.G);
                if (iVarH == null) {
                    nq.l lVar2 = nq.l.f17061a;
                    typeConstructor = nq.l.d(nq.k.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER, String.valueOf(proto.G), this.f11004d);
                }
            } else if ((i14 & 64) == 64) {
                String string = ((rp.f) kVar.f3123i).getString(proto.H);
                Iterator it2 = b().iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.areEqual(((r0) next).getName().b(), string));
                r0 r0Var2 = (r0) next;
                if (r0Var2 == null) {
                    nq.l lVar3 = nq.l.f17061a;
                    typeConstructor = nq.l.d(nq.k.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, string, lVar.toString());
                } else {
                    iVarH = r0Var2;
                }
            } else if ((i14 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                iVarH = (vo.i) this.f11006f.invoke(Integer.valueOf(proto.I));
                if (iVarH == null) {
                    iVarH = h(this, proto, proto.I);
                }
            } else {
                nq.l lVar4 = nq.l.f17061a;
                typeConstructor = nq.l.d(nq.k.UNKNOWN_TYPE, new String[0]);
            }
            if (nq.l.f(typeConstructor.g())) {
                nq.l lVar5 = nq.l.f17061a;
                nq.k kind = nq.k.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR;
                String[] formatParams = {typeConstructor.toString()};
                Intrinsics.checkNotNullParameter(kind, "kind");
                Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
                Intrinsics.checkNotNullParameter(formatParams, "formatParams");
                return nq.l.e(kind, n0.f14659d, typeConstructor, (String[]) Arrays.copyOf(formatParams, 1));
            }
            jq.a aVar = new jq.a(jVar.f11019a, new fp.b(4, this, proto));
            l0VarF = f(jVar.f11034r, aVar, typeConstructor, lVar);
            ArrayList arrayListE = e(proto, this);
            arrayList = new ArrayList(e0.l(arrayListE, 10));
            it = arrayListE.iterator();
            i7 = 0;
            while (it.hasNext()) {
                next2 = it.next();
                i11 = i7 + 1;
                if (i7 >= 0) {
                    kotlin.collections.d0.k();
                    throw null;
                }
                q0Var = (pp.q0) next2;
                Iterator it3 = it;
                List parameters = typeConstructor.getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                r0Var = (r0) CollectionsKt.M(i7, parameters);
                projection = q0Var.f18413i;
                if (projection == p0.STAR) {
                    if (r0Var == null) {
                        i0Var = new h0(jVar.f11020b.f());
                    } else {
                        i0Var = new i0(r0Var);
                    }
                    l0Var2 = l0VarF;
                    c8 = 4;
                } else {
                    Intrinsics.checkNotNullExpressionValue(projection, "getProjection(...)");
                    Intrinsics.checkNotNullParameter(projection, "projection");
                    iOrdinal = projection.ordinal();
                    if (iOrdinal != 0) {
                        l0Var2 = l0VarF;
                        if (iOrdinal != 1) {
                            e1Var = e1.OUT_VARIANCE;
                        } else {
                            if (iOrdinal != 2) {
                                if (iOrdinal != 3) {
                                    throw new rn.n();
                                }
                                throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + projection);
                            }
                            e1Var = e1.INVARIANT;
                        }
                    } else {
                        l0Var2 = l0VarF;
                        e1Var = e1.IN_VARIANCE;
                    }
                    Intrinsics.checkNotNullParameter(q0Var, "<this>");
                    Intrinsics.checkNotNullParameter(typeTable, "typeTable");
                    i12 = q0Var.f18412e;
                    if ((i12 & 2) == 2) {
                        s0VarF2 = q0Var.f18414v;
                        c8 = 4;
                    } else {
                        c8 = 4;
                        if ((i12 & 4) == 4) {
                            s0VarF2 = typeTable.f(q0Var.f18415w);
                        } else {
                            s0VarF2 = null;
                        }
                    }
                    if (s0VarF2 == null) {
                        i0Var = new i0(nq.l.c(nq.k.NO_RECORDED_TYPE, q0Var.toString()));
                    } else {
                        i0Var = new i0(g(s0VarF2), e1Var);
                    }
                }
                arrayList.add(i0Var);
                it = it3;
                i7 = i11;
                l0VarF = l0Var2;
            }
            l0Var = l0VarF;
            arguments = CollectionsKt.i0(arrayList);
            vo.i iVarG3 = typeConstructor.g();
            if (z5 || !(iVarG3 instanceof vo.q0)) {
                str = "<this>";
                str2 = "typeTable";
                s0VarF = null;
                if (rp.d.f19512a.g(proto.N).booleanValue()) {
                    z6 = proto.f18435w;
                    size = typeConstructor.getParameters().size() - arguments.size();
                    if (size == 0) {
                        d0VarT2 = lq.c.t(arguments, l0Var, typeConstructor, z6);
                        Intrinsics.checkNotNullParameter(d0VarT2, str);
                        Intrinsics.checkNotNullParameter(d0VarT2, str);
                        iVarG = d0VarT2.r0().g();
                        if (iVarG != null) {
                            kVarS = xr.m.s(iVarG);
                        } else {
                            kVarS = null;
                        }
                        if (Intrinsics.areEqual(kVarS, to.g.f20860c) || (t0Var = (t0) CollectionsKt.S(xr.m.v(d0VarT2))) == null || (zVarB = t0Var.b()) == null) {
                            d0VarA = null;
                        } else {
                            iVarG2 = zVarB.r0().g();
                            if (iVarG2 != null) {
                                cVarG = bq.e.g(iVarG2);
                            } else {
                                cVarG = null;
                            }
                            if (zVarB.l0().size() == 1 || !(Intrinsics.areEqual(cVarG, so.p.f20399g) || Intrinsics.areEqual(cVarG, d0.f11008a))) {
                                d0VarA = d0VarT2;
                            } else {
                                lq.z zVarB2 = ((t0) CollectionsKt.Z(zVarB.l0())).b();
                                Intrinsics.checkNotNullExpressionValue(zVarB2, "getType(...)");
                                vo.b bVar = lVar instanceof vo.b ? (vo.b) lVar : null;
                                d0VarA = Intrinsics.areEqual(bVar != null ? bq.e.c(bVar) : null, y.f11080a) ? a(d0VarT2, zVarB2) : a(d0VarT2, zVarB2);
                            }
                        }
                    } else if (size != 1 && (size2 = arguments.size() - 1) >= 0) {
                        q0 q0VarN = typeConstructor.f().w(size2).n();
                        Intrinsics.checkNotNullExpressionValue(q0VarN, "getTypeConstructor(...)");
                        d0VarA = lq.c.t(arguments, l0Var, q0VarN, z6);
                    } else {
                        d0VarA = null;
                    }
                    if (d0VarA == null) {
                        nq.l lVar6 = nq.l.f17061a;
                        d0VarT = nq.l.e(nq.k.INCONSISTENT_SUSPEND_FUNCTION, arguments, typeConstructor, new String[0]);
                    } else {
                        d0VarT = d0VarA;
                    }
                } else {
                    d0VarT = lq.c.t(arguments, l0Var, typeConstructor, proto.f18435w);
                    if (rp.d.f19513b.g(proto.N).booleanValue()) {
                        oVarM = lq.f.m(d0VarT, true);
                        if (oVarM == null) {
                            throw new IllegalStateException(("null DefinitelyNotNullType for '" + d0VarT + '\'').toString());
                        }
                        d0VarT = oVarM;
                    }
                }
            } else {
                vo.q0 typeAliasDescriptor = (vo.q0) iVarG3;
                Intrinsics.checkNotNullParameter(typeAliasDescriptor, "<this>");
                Intrinsics.checkNotNullParameter(arguments, "arguments");
                k0 k0Var = new k0();
                Intrinsics.checkNotNullParameter(typeAliasDescriptor, "typeAliasDescriptor");
                Intrinsics.checkNotNullParameter(arguments, "arguments");
                List parameters2 = ((yo.e) typeAliasDescriptor).F.getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
                ArrayList arrayList2 = new ArrayList(e0.l(parameters2, 10));
                Iterator it4 = parameters2.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(((r0) it4.next()).a());
                }
                Map mapL = w0.l(CollectionsKt.n0(arrayList2, arguments));
                s0VarF = null;
                str2 = "typeTable";
                str = "<this>";
                e4.i typeAliasExpansion = new e4.i(9, null, typeAliasDescriptor, arguments, mapL);
                l0.f15225e.getClass();
                l0 attributes = l0.f15226i;
                Intrinsics.checkNotNullParameter(typeAliasExpansion, "typeAliasExpansion");
                Intrinsics.checkNotNullParameter(attributes, "attributes");
                lq.d0 d0VarB = k0Var.b(typeAliasExpansion, attributes, false, 0, true);
                List list = jVar.f11034r;
                ArrayList annotations = CollectionsKt.T(aVar, d0VarB.getAnnotations());
                Intrinsics.checkNotNullParameter(annotations, "annotations");
                l0 l0VarF2 = f(list, annotations.isEmpty() ? wo.g.f22379a : new wo.i(0, annotations), typeConstructor, lVar);
                Intrinsics.checkNotNullParameter(d0VarB, str);
                d0VarT = d0VarB.x0(b1.e(d0VarB) || proto.f18435w).z0(l0VarF2);
            }
            Intrinsics.checkNotNullParameter(proto, str);
            Intrinsics.checkNotNullParameter(typeTable, str2);
            i10 = proto.f18433i;
            if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
                s0VarF = proto.L;
            } else if ((i10 & RecyclerView.ItemAnimator.FLAG_MOVED) == 2048) {
                s0VarF = typeTable.f(proto.M);
            }
            return (s0VarF != null || (d0VarF = lq.c.F(d0VarT, d(s0VarF, false))) == null) ? d0VarT : d0VarF;
        }
        iVarH = (vo.i) this.f11005e.invoke(Integer.valueOf(proto.F));
        if (iVarH == null) {
            iVarH = h(this, proto, proto.F);
        }
        typeConstructor = iVarH.n();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "getTypeConstructor(...)");
        if (nq.l.f(typeConstructor.g())) {
            nq.l lVar7 = nq.l.f17061a;
            nq.k kind2 = nq.k.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR;
            String[] formatParams2 = {typeConstructor.toString()};
            Intrinsics.checkNotNullParameter(kind2, "kind");
            Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
            Intrinsics.checkNotNullParameter(formatParams2, "formatParams");
            return nq.l.e(kind2, n0.f14659d, typeConstructor, (String[]) Arrays.copyOf(formatParams2, 1));
        }
        jq.a aVar2 = new jq.a(jVar.f11019a, new fp.b(4, this, proto));
        l0VarF = f(jVar.f11034r, aVar2, typeConstructor, lVar);
        ArrayList arrayListE2 = e(proto, this);
        arrayList = new ArrayList(e0.l(arrayListE2, 10));
        it = arrayListE2.iterator();
        i7 = 0;
        while (it.hasNext()) {
            next2 = it.next();
            i11 = i7 + 1;
            if (i7 >= 0) {
                kotlin.collections.d0.k();
                throw null;
            }
            q0Var = (pp.q0) next2;
            Iterator it5 = it;
            List parameters3 = typeConstructor.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters3, "getParameters(...)");
            r0Var = (r0) CollectionsKt.M(i7, parameters3);
            projection = q0Var.f18413i;
            if (projection == p0.STAR) {
                if (r0Var == null) {
                    i0Var = new h0(jVar.f11020b.f());
                } else {
                    i0Var = new i0(r0Var);
                }
                l0Var2 = l0VarF;
                c8 = 4;
            } else {
                Intrinsics.checkNotNullExpressionValue(projection, "getProjection(...)");
                Intrinsics.checkNotNullParameter(projection, "projection");
                iOrdinal = projection.ordinal();
                if (iOrdinal != 0) {
                    l0Var2 = l0VarF;
                    if (iOrdinal != 1) {
                        e1Var = e1.OUT_VARIANCE;
                    } else {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                throw new rn.n();
                            }
                            throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + projection);
                        }
                        e1Var = e1.INVARIANT;
                    }
                } else {
                    l0Var2 = l0VarF;
                    e1Var = e1.IN_VARIANCE;
                }
                Intrinsics.checkNotNullParameter(q0Var, "<this>");
                Intrinsics.checkNotNullParameter(typeTable, "typeTable");
                i12 = q0Var.f18412e;
                if ((i12 & 2) == 2) {
                    s0VarF2 = q0Var.f18414v;
                    c8 = 4;
                } else {
                    c8 = 4;
                    if ((i12 & 4) == 4) {
                        s0VarF2 = typeTable.f(q0Var.f18415w);
                    } else {
                        s0VarF2 = null;
                    }
                }
                if (s0VarF2 == null) {
                    i0Var = new i0(nq.l.c(nq.k.NO_RECORDED_TYPE, q0Var.toString()));
                } else {
                    i0Var = new i0(g(s0VarF2), e1Var);
                }
            }
            arrayList.add(i0Var);
            it = it5;
            i7 = i11;
            l0VarF = l0Var2;
        }
        l0Var = l0VarF;
        arguments = CollectionsKt.i0(arrayList);
        vo.i iVarG4 = typeConstructor.g();
        if (z5) {
            str = "<this>";
            str2 = "typeTable";
            s0VarF = null;
            if (rp.d.f19512a.g(proto.N).booleanValue()) {
                z6 = proto.f18435w;
                size = typeConstructor.getParameters().size() - arguments.size();
                if (size == 0) {
                    d0VarT2 = lq.c.t(arguments, l0Var, typeConstructor, z6);
                    Intrinsics.checkNotNullParameter(d0VarT2, str);
                    Intrinsics.checkNotNullParameter(d0VarT2, str);
                    iVarG = d0VarT2.r0().g();
                    if (iVarG != null) {
                        kVarS = xr.m.s(iVarG);
                    } else {
                        kVarS = null;
                    }
                    if (Intrinsics.areEqual(kVarS, to.g.f20860c)) {
                        d0VarA = null;
                    } else {
                        iVarG2 = zVarB.r0().g();
                        if (iVarG2 != null) {
                            cVarG = bq.e.g(iVarG2);
                        } else {
                            cVarG = null;
                        }
                        if (zVarB.l0().size() == 1) {
                            d0VarA = d0VarT2;
                        } else {
                            d0VarA = d0VarT2;
                        }
                    }
                } else if (size != 1) {
                    d0VarA = null;
                } else {
                    q0 q0VarN2 = typeConstructor.f().w(size2).n();
                    Intrinsics.checkNotNullExpressionValue(q0VarN2, "getTypeConstructor(...)");
                    d0VarA = lq.c.t(arguments, l0Var, q0VarN2, z6);
                }
                if (d0VarA == null) {
                    nq.l lVar8 = nq.l.f17061a;
                    d0VarT = nq.l.e(nq.k.INCONSISTENT_SUSPEND_FUNCTION, arguments, typeConstructor, new String[0]);
                } else {
                    d0VarT = d0VarA;
                }
            } else {
                d0VarT = lq.c.t(arguments, l0Var, typeConstructor, proto.f18435w);
                if (rp.d.f19513b.g(proto.N).booleanValue()) {
                    oVarM = lq.f.m(d0VarT, true);
                    if (oVarM == null) {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + d0VarT + '\'').toString());
                    }
                    d0VarT = oVarM;
                }
            }
        } else {
            str = "<this>";
            str2 = "typeTable";
            s0VarF = null;
            if (rp.d.f19512a.g(proto.N).booleanValue()) {
                z6 = proto.f18435w;
                size = typeConstructor.getParameters().size() - arguments.size();
                if (size == 0) {
                    d0VarT2 = lq.c.t(arguments, l0Var, typeConstructor, z6);
                    Intrinsics.checkNotNullParameter(d0VarT2, str);
                    Intrinsics.checkNotNullParameter(d0VarT2, str);
                    iVarG = d0VarT2.r0().g();
                    if (iVarG != null) {
                        kVarS = xr.m.s(iVarG);
                    } else {
                        kVarS = null;
                    }
                    if (Intrinsics.areEqual(kVarS, to.g.f20860c)) {
                        d0VarA = null;
                    } else {
                        iVarG2 = zVarB.r0().g();
                        if (iVarG2 != null) {
                            cVarG = bq.e.g(iVarG2);
                        } else {
                            cVarG = null;
                        }
                        if (zVarB.l0().size() == 1) {
                            d0VarA = d0VarT2;
                        } else {
                            d0VarA = d0VarT2;
                        }
                    }
                } else if (size != 1) {
                    d0VarA = null;
                } else {
                    q0 q0VarN3 = typeConstructor.f().w(size2).n();
                    Intrinsics.checkNotNullExpressionValue(q0VarN3, "getTypeConstructor(...)");
                    d0VarA = lq.c.t(arguments, l0Var, q0VarN3, z6);
                }
                if (d0VarA == null) {
                    nq.l lVar9 = nq.l.f17061a;
                    d0VarT = nq.l.e(nq.k.INCONSISTENT_SUSPEND_FUNCTION, arguments, typeConstructor, new String[0]);
                } else {
                    d0VarT = d0VarA;
                }
            } else {
                d0VarT = lq.c.t(arguments, l0Var, typeConstructor, proto.f18435w);
                if (rp.d.f19513b.g(proto.N).booleanValue()) {
                    oVarM = lq.f.m(d0VarT, true);
                    if (oVarM == null) {
                        throw new IllegalStateException(("null DefinitelyNotNullType for '" + d0VarT + '\'').toString());
                    }
                    d0VarT = oVarM;
                }
            }
        }
        Intrinsics.checkNotNullParameter(proto, str);
        Intrinsics.checkNotNullParameter(typeTable, str2);
        i10 = proto.f18433i;
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
            s0VarF = proto.L;
        } else if ((i10 & RecyclerView.ItemAnimator.FLAG_MOVED) == 2048) {
            s0VarF = typeTable.f(proto.M);
        }
        if (s0VarF != null) {
        }
    }

    public final lq.z g(s0 proto) {
        s0 s0VarF;
        Intrinsics.checkNotNullParameter(proto, "proto");
        if ((proto.f18433i & 2) != 2) {
            return d(proto, true);
        }
        bc.k kVar = this.f11001a;
        String string = ((rp.f) kVar.f3123i).getString(proto.f18436x);
        lq.d0 d0VarD = d(proto, true);
        pf.b typeTable = (pf.b) kVar.f3125w;
        Intrinsics.checkNotNullParameter(proto, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        int i7 = proto.f18433i;
        if ((i7 & 4) == 4) {
            s0VarF = proto.f18437y;
        } else {
            s0VarF = (i7 & 8) == 8 ? typeTable.f(proto.E) : null;
        }
        Intrinsics.checkNotNull(s0VarF);
        return ((j) kVar.f3122e).j.c(proto, string, d0VarD, d(s0VarF, true));
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f11003c);
        c0 c0Var = this.f11002b;
        if (c0Var == null) {
            str = "";
        } else {
            str = ". Child of " + c0Var.f11003c;
        }
        sb2.append(str);
        return sb2.toString();
    }
}
