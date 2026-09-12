package ip;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.ranges.IntRange;
import lq.e1;
import lq.i0;
import lq.l0;
import lq.q0;
import lq.z0;
import vo.o0;
import vo.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends lq.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13353c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kq.i f13354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yo.b f13355e;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(j jVar) {
        this.f13355e = jVar;
        e4.i iVar = jVar.G;
        super(((hp.a) iVar.f7980e).f10957a);
        kq.o oVar = ((hp.a) iVar.f7980e).f10957a;
        g gVar = new g(jVar, 2);
        kq.l lVar = (kq.l) oVar;
        lVar.getClass();
        this.f13354d = new kq.i(lVar, gVar);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0215  */
    /* JADX WARN: Code duplicated, block: B:126:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:128:0x032e  */
    /* JADX WARN: Code duplicated, block: B:131:0x033c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0345  */
    /* JADX WARN: Code duplicated, block: B:135:0x034a  */
    /* JADX WARN: Code duplicated, block: B:144:0x0361  */
    /* JADX WARN: Code duplicated, block: B:145:0x0374  */
    /* JADX WARN: Code duplicated, block: B:148:0x0381  */
    /* JADX WARN: Code duplicated, block: B:151:0x039a A[LOOP:5: B:149:0x0394->B:151:0x039a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:156:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:56:0x0185  */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x0185, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    @Override // lq.i
    public final Collection b() {
        Collection<bp.q> collection;
        String str;
        up.i iVar;
        up.c cVar;
        up.c topLevelClassFqName;
        ArrayList arrayList;
        lq.d0 d0VarS;
        vo.f fVar;
        lq.z zVarJ;
        ArrayList arrayList2;
        lq.z type;
        lq.z zVarA;
        q0 q0VarR0;
        q0 q0VarR1;
        String strB;
        up.c cVarA;
        int i7 = this.f13353c;
        yo.b bVar = this.f13355e;
        switch (i7) {
            case 0:
                j jVar = (j) bVar;
                e4.i context = jVar.G;
                Class cls = jVar.E.f3364a;
                if (Intrinsics.areEqual(cls, Object.class)) {
                    collection = n0.f14659d;
                } else {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                    Type genericSuperclass = cls.getGenericSuperclass();
                    spreadBuilder.add(genericSuperclass != null ? genericSuperclass : Object.class);
                    spreadBuilder.addSpread(cls.getGenericInterfaces());
                    List listG = kotlin.collections.d0.g(spreadBuilder.toArray(new Type[spreadBuilder.size()]));
                    ArrayList arrayList3 = new ArrayList(kotlin.collections.e0.l(listG, 10));
                    Iterator it = listG.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new bp.q((Type) it.next()));
                    }
                    collection = arrayList3;
                }
                ArrayList arrayList4 = new ArrayList(collection.size());
                ArrayList<lp.d> arrayList5 = new ArrayList(0);
                hp.c cVar2 = jVar.R;
                up.c PURELY_IMPLEMENTS_ANNOTATION = ep.a0.f8499n;
                Intrinsics.checkNotNullExpressionValue(PURELY_IMPLEMENTS_ANNOTATION, "PURELY_IMPLEMENTS_ANNOTATION");
                wo.b bVarZ = cVar2.z(PURELY_IMPLEMENTS_ANNOTATION);
                if (bVarZ != null) {
                    Object objA0 = CollectionsKt.a0(bVarZ.b().values());
                    zp.x xVar = objA0 instanceof zp.x ? (zp.x) objA0 : null;
                    if (xVar != null && (str = (String) xVar.f24066a) != null) {
                        up.i iVar2 = up.i.f21301d;
                        int i10 = 0;
                        while (true) {
                            if (i10 < str.length()) {
                                char cCharAt = str.charAt(i10);
                                int iOrdinal = iVar2.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        if (cCharAt == '.') {
                                            iVar = up.i.f21303i;
                                            iVar2 = iVar;
                                        } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                                        }
                                        i10++;
                                    } else if (iOrdinal != 2) {
                                        throw new rn.n();
                                    }
                                }
                                if (Character.isJavaIdentifierStart(cCharAt)) {
                                    iVar = up.i.f21302e;
                                    iVar2 = iVar;
                                    i10++;
                                }
                            } else {
                                cVar = iVar2 != up.i.f21303i ? new up.c(str) : null;
                            }
                        }
                    }
                }
                if (cVar == null || cVar.f21262a.c() || !cVar.c(so.p.k)) {
                    cVar = null;
                }
                if (cVar == null) {
                    LinkedHashMap linkedHashMap = ep.j.f8557a;
                    up.c classFqName = bq.e.g(jVar);
                    Intrinsics.checkNotNullParameter(classFqName, "classFqName");
                    topLevelClassFqName = (up.c) ep.j.f8558b.get(classFqName);
                    if (topLevelClassFqName == null) {
                        d0VarS = null;
                    }
                    for (bp.q qVar : collection) {
                        type = ((e4.m) context.f7983w).M(qVar, xr.m.S(z0.f15270d, false, null, 7));
                        mp.o oVar = ((hp.a) context.f7980e).f10972r;
                        oVar.getClass();
                        Intrinsics.checkNotNullParameter(type, "type");
                        Intrinsics.checkNotNullParameter(context, "context");
                        zVarA = oVar.a(new g3.b((wo.a) null, false, context, ep.a.TYPE_USE, true), type, n0.f14659d, null, false);
                        if (zVarA == null) {
                            zVarA = type;
                        }
                        if (zVarA.r0().g() instanceof vo.d0) {
                            arrayList5.add(qVar);
                        }
                        q0VarR0 = zVarA.r0();
                        if (d0VarS != null) {
                            q0VarR1 = d0VarS.r0();
                        } else {
                            q0VarR1 = null;
                        }
                        if (!Intrinsics.areEqual(q0VarR0, q0VarR1) && !so.i.y(zVarA)) {
                            arrayList4.add(zVarA);
                        }
                    }
                    fVar = jVar.F;
                    if (fVar != null) {
                        zVarJ = xr.m.j(fVar, jVar).c().j(fVar.j(), e1.INVARIANT);
                    } else {
                        zVarJ = null;
                    }
                    vq.m.b(arrayList4, zVarJ);
                    vq.m.b(arrayList4, d0VarS);
                    if (!arrayList5.isEmpty()) {
                        hq.m mVar = ((hp.a) context.f7980e).f10962f;
                        arrayList2 = new ArrayList(kotlin.collections.e0.l(arrayList5, 10));
                        for (lp.d dVar : arrayList5) {
                            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                            arrayList2.add(((bp.q) dVar).f3366a.toString());
                        }
                        mVar.a(jVar, arrayList2);
                    }
                    return !arrayList4.isEmpty() ? CollectionsKt.i0(arrayList4) : kotlin.collections.c0.c(((hp.a) context.f7980e).f10969o.f().e());
                }
                topLevelClassFqName = cVar;
                up.d dVar2 = topLevelClassFqName.f21262a;
                vo.z zVar = ((hp.a) context.f7980e).f10969o;
                dp.c location = dp.c.E;
                int i11 = bq.e.f3383a;
                Intrinsics.checkNotNullParameter(zVar, "<this>");
                Intrinsics.checkNotNullParameter(topLevelClassFqName, "topLevelClassFqName");
                Intrinsics.checkNotNullParameter(location, "location");
                dVar2.c();
                vo.i iVarG = ((yo.v) zVar.O(topLevelClassFqName.b())).E.g(dVar2.f(), location);
                vo.f fVar2 = iVarG instanceof vo.f ? (vo.f) iVarG : null;
                if (fVar2 == null) {
                    d0VarS = null;
                } else {
                    int size = fVar2.n().getParameters().size();
                    List parameters = jVar.M.getParameters();
                    Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                    int size2 = parameters.size();
                    if (size2 == size) {
                        arrayList = new ArrayList(kotlin.collections.e0.l(parameters, 10));
                        Iterator it2 = parameters.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(new i0(((r0) it2.next()).j(), e1.INVARIANT));
                        }
                    } else if (size2 == 1 && size > 1 && cVar == null) {
                        i0 i0Var = new i0(((r0) CollectionsKt.Z(parameters)).j(), e1.INVARIANT);
                        IntRange intRange = new IntRange(1, size, 1);
                        ArrayList arrayList6 = new ArrayList(kotlin.collections.e0.l(intRange, 10));
                        Iterator it3 = intRange.iterator();
                        while (((lo.b) it3).f15156i) {
                            ((s0) it3).nextInt();
                            arrayList6.add(i0Var);
                        }
                        arrayList = arrayList6;
                    } else {
                        d0VarS = null;
                    }
                    l0.f15225e.getClass();
                    d0VarS = lq.c.s(l0.f15226i, fVar2, arrayList);
                }
                while (r1.hasNext()) {
                    type = ((e4.m) context.f7983w).M(qVar, xr.m.S(z0.f15270d, false, null, 7));
                    mp.o oVar2 = ((hp.a) context.f7980e).f10972r;
                    oVar2.getClass();
                    Intrinsics.checkNotNullParameter(type, "type");
                    Intrinsics.checkNotNullParameter(context, "context");
                    zVarA = oVar2.a(new g3.b((wo.a) null, false, context, ep.a.TYPE_USE, true), type, n0.f14659d, null, false);
                    if (zVarA == null) {
                        zVarA = type;
                    }
                    if (zVarA.r0().g() instanceof vo.d0) {
                        arrayList5.add(qVar);
                    }
                    q0VarR0 = zVarA.r0();
                    if (d0VarS != null) {
                        q0VarR1 = d0VarS.r0();
                    } else {
                        q0VarR1 = null;
                    }
                    if (!Intrinsics.areEqual(q0VarR0, q0VarR1)) {
                        arrayList4.add(zVarA);
                    }
                }
                fVar = jVar.F;
                if (fVar != null) {
                    zVarJ = xr.m.j(fVar, jVar).c().j(fVar.j(), e1.INVARIANT);
                } else {
                    zVarJ = null;
                }
                vq.m.b(arrayList4, zVarJ);
                vq.m.b(arrayList4, d0VarS);
                if (!arrayList5.isEmpty()) {
                    hq.m mVar2 = ((hp.a) context.f7980e).f10962f;
                    arrayList2 = new ArrayList(kotlin.collections.e0.l(arrayList5, 10));
                    while (r4.hasNext()) {
                        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                        arrayList2.add(((bp.q) dVar).f3366a.toString());
                    }
                    mVar2.a(jVar, arrayList2);
                }
                if (!arrayList4.isEmpty()) {
                }
            default:
                jq.j jVar2 = (jq.j) bVar;
                pp.k kVar = jVar2.f14030w;
                bc.k kVar2 = jVar2.I;
                pf.b typeTable = (pf.b) kVar2.f3125w;
                Intrinsics.checkNotNullParameter(kVar, "<this>");
                Intrinsics.checkNotNullParameter(typeTable, "typeTable");
                List list = kVar.E;
                boolean zIsEmpty = list.isEmpty();
                ?? arrayList7 = list;
                if (zIsEmpty) {
                    arrayList7 = 0;
                }
                if (arrayList7 == 0) {
                    List<Integer> list2 = kVar.F;
                    Intrinsics.checkNotNullExpressionValue(list2, "getSupertypeIdList(...)");
                    arrayList7 = new ArrayList(kotlin.collections.e0.l(list2, 10));
                    for (Integer num : list2) {
                        Intrinsics.checkNotNull(num);
                        arrayList7.add(typeTable.f(num.intValue()));
                    }
                }
                ArrayList arrayList8 = new ArrayList(kotlin.collections.e0.l(arrayList7, 10));
                Iterator it4 = arrayList7.iterator();
                while (it4.hasNext()) {
                    arrayList8.add(((hq.c0) kVar2.F).g((pp.s0) it4.next()));
                }
                ArrayList arrayListV = CollectionsKt.V(arrayList8, ((hq.j) kVar2.f3122e).f11030n.b(jVar2));
                ArrayList<vo.d0> arrayList9 = new ArrayList();
                Iterator it5 = arrayListV.iterator();
                while (it5.hasNext()) {
                    vo.i iVarG2 = ((lq.z) it5.next()).r0().g();
                    vo.d0 d0Var = iVarG2 instanceof vo.d0 ? (vo.d0) iVarG2 : null;
                    if (d0Var != null) {
                        arrayList9.add(d0Var);
                    }
                }
                if (!arrayList9.isEmpty()) {
                    hq.m mVar3 = ((hq.j) kVar2.f3122e).f11026h;
                    ArrayList arrayList10 = new ArrayList(kotlin.collections.e0.l(arrayList9, 10));
                    for (vo.d0 d0Var2 : arrayList9) {
                        up.b bVarF = bq.e.f(d0Var2);
                        if (bVarF == null || (cVarA = bVarF.a()) == null || (strB = cVarA.f21262a.f21265a) == null) {
                            strB = d0Var2.getName().b();
                            Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
                        }
                        arrayList10.add(strB);
                    }
                    mVar3.a(jVar2, arrayList10);
                }
                return CollectionsKt.i0(arrayListV);
        }
    }

    @Override // lq.i
    public final o0 e() {
        switch (this.f13353c) {
            case 0:
                return ((hp.a) ((j) this.f13355e).G.f7980e).f10967m;
            default:
                return o0.f21822i;
        }
    }

    @Override // lq.b, lq.q0
    public final vo.i g() {
        switch (this.f13353c) {
            case 0:
                return (j) this.f13355e;
            default:
                return (jq.j) this.f13355e;
        }
    }

    @Override // lq.q0
    public final List getParameters() {
        switch (this.f13353c) {
            case 0:
                break;
        }
        return (List) this.f13354d.invoke();
    }

    @Override // lq.q0
    public final boolean i() {
        switch (this.f13353c) {
        }
        return true;
    }

    @Override // lq.b
    /* JADX INFO: renamed from: o */
    public final vo.f g() {
        switch (this.f13353c) {
            case 0:
                return (j) this.f13355e;
            default:
                return (jq.j) this.f13355e;
        }
    }

    public final String toString() {
        switch (this.f13353c) {
            case 0:
                String strB = ((j) this.f13355e).getName().b();
                Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
                return strB;
            default:
                String str = ((jq.j) this.f13355e).getName().f21269d;
                Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
                return str;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(jq.j jVar) {
        this.f13355e = jVar;
        bc.k kVar = jVar.I;
        super(((hq.j) kVar.f3122e).f11019a);
        kq.l lVar = ((hq.j) kVar.f3122e).f11019a;
        jq.d dVar = new jq.d(jVar, 6);
        lVar.getClass();
        this.f13354d = new kq.i(lVar, dVar);
    }
}
