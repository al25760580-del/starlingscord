package ip;

import a5.l0;
import androidx.core.view.d1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vo.n0;
import yo.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f13363e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f13364i;

    public /* synthetic */ m(int i7, Object obj, Object obj2) {
        this.f13362d = i7;
        this.f13363e = obj;
        this.f13364i = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007c  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object extractNullability) {
        fj.c cVarI;
        String str;
        Class clsD;
        ap.b bVarN;
        vo.i iVarG;
        mp.d dVar;
        int i7 = this.f13362d;
        boolean z5 = true;
        Object obj = this.f13364i;
        Object obj2 = this.f13363e;
        switch (i7) {
            case 0:
                p pVar = (p) obj2;
                e4.i iVar = (e4.i) obj;
                up.e name = (up.e) extractNullability;
                Intrinsics.checkNotNullParameter(name, "name");
                kq.i iVar2 = pVar.f13378r;
                vo.f fVar = pVar.f13374n;
                int i10 = 2;
                if (((Set) iVar2.invoke()).contains(name)) {
                    u4.c cVar = ((hp.a) iVar.f7980e).f10958b;
                    up.b bVarF = bq.e.f(fVar);
                    Intrinsics.checkNotNull(bVarF);
                    bp.o oVarG = cVar.g(new ep.l(bVarF.d(name), pVar.f13375o, 2));
                    if (oVarG == null) {
                        return null;
                    }
                    j classDescriptor = new j(iVar, fVar, oVarG, null);
                    ((hp.a) iVar.f7980e).f10973s.getClass();
                    Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
                    return classDescriptor;
                }
                if (!((Set) pVar.f13379s.invoke()).contains(name)) {
                    bp.u uVar = (bp.u) ((Map) pVar.f13380t.invoke()).get(name);
                    if (uVar == null) {
                        return null;
                    }
                    hp.a aVar = (hp.a) iVar.f7980e;
                    kq.o oVar = aVar.f10957a;
                    l lVar = new l(pVar, i10);
                    kq.l lVar2 = (kq.l) oVar;
                    lVar2.getClass();
                    return yo.p.l0(aVar.f10957a, pVar.f13374n, name, new kq.i(lVar2, lVar), mf.f.F(iVar, uVar), aVar.j.c(uVar));
                }
                sn.e eVarB = kotlin.collections.c0.b();
                ((cq.a) ((hp.a) iVar.f7980e).f10978x).c(fVar, name, eVarB, iVar);
                sn.e eVarA = kotlin.collections.c0.a(eVarB);
                int iA = eVarA.a();
                if (iA == 0) {
                    return null;
                }
                if (iA == 1) {
                    return (vo.f) CollectionsKt.Z(eVarA);
                }
                throw new IllegalStateException(("Multiple classes with same name are generated: " + eVarA).toString());
            case 1:
                k0 k0Var = (k0) obj;
                p pVar2 = (p) obj2;
                up.e accessorName = (up.e) extractNullability;
                Intrinsics.checkNotNullParameter(accessorName, "accessorName");
                return Intrinsics.areEqual(k0Var.getName(), accessorName) ? kotlin.collections.c0.c(k0Var) : CollectionsKt.V(pVar2.N(accessorName), pVar2.O(accessorName));
            case 2:
                w wVar = (w) obj2;
                e4.i iVar3 = wVar.f13320b;
                e4.i iVar4 = (e4.i) obj;
                hp.a aVar2 = (hp.a) iVar4.f7980e;
                s request = (s) extractNullability;
                Intrinsics.checkNotNullParameter(request, "request");
                r rVar = wVar.f13390o;
                up.b bVar = new up.b(rVar.f23420x, request.f13384a);
                bp.o javaClass = request.f13385b;
                if (javaClass != null) {
                    ue.i iVar5 = aVar2.f10959c;
                    ((hp.a) iVar3.f7980e).f10960d.c().f11021c.getClass();
                    rp.e metadataVersion = rp.e.f19536g;
                    iVar5.getClass();
                    Intrinsics.checkNotNullParameter(javaClass, "javaClass");
                    Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
                    up.c cVarC = javaClass.c();
                    cVarI = (cVarC == null || (str = cVarC.f21262a.f21265a) == null || (clsD = a.a.D((ClassLoader) iVar5.f21117d, str)) == null || (bVarN = l0.n(clsD)) == null) ? null : new fj.c(bVarN);
                } else {
                    ue.i iVar6 = aVar2.f10959c;
                    ((hp.a) iVar3.f7980e).f10960d.c().f11021c.getClass();
                    cVarI = iVar6.i(bVar, rp.e.f19536g);
                }
                ap.b kotlinClass = cVarI != null ? (ap.b) cVarI.f9267e : null;
                up.b bVarA = kotlinClass != null ? bp.c.a(kotlinClass.f2856a) : null;
                if (bVarA != null && (bVarA.g() || bVarA.f21260c)) {
                    return null;
                }
                d1 tVar = u.f13387b;
                if (kotlinClass != null) {
                    if (((op.a) kotlinClass.f2857b.f10247c) == op.a.CLASS) {
                        np.e eVar = ((hp.a) iVar3.f7980e).f10960d;
                        eVar.getClass();
                        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
                        hq.e eVarG = eVar.g(kotlinClass);
                        vo.f fVarA = eVarG == null ? null : eVar.c().f11036t.a(bp.c.a(kotlinClass.f2856a), eVarG);
                        if (fVarA != null) {
                            tVar = new t(fVarA);
                        }
                    } else {
                        tVar = v.f13388b;
                    }
                }
                if (tVar instanceof t) {
                    return ((t) tVar).f13386b;
                }
                if (tVar instanceof v) {
                    return null;
                }
                if (!(tVar instanceof u)) {
                    throw new rn.n();
                }
                if (javaClass == null) {
                    javaClass = aVar2.f10958b.g(new ep.l(bVar, null, 4));
                }
                lp.f[] fVarArr = lp.f.f15168d;
                up.c cVarC2 = javaClass != null ? javaClass.c() : null;
                if (cVarC2 == null || cVarC2.f21262a.c() || !Intrinsics.areEqual(cVarC2.b(), rVar.f23420x)) {
                    return null;
                }
                j classDescriptor2 = new j(iVar4, rVar, javaClass, null);
                aVar2.f10973s.getClass();
                Intrinsics.checkNotNullParameter(classDescriptor2, "classDescriptor");
                return classDescriptor2;
            case 3:
                e4.i iVar7 = (e4.i) obj2;
                jq.j jVar = (jq.j) obj;
                bc.k kVar = jVar.I;
                up.e name2 = (up.e) extractNullability;
                Intrinsics.checkNotNullParameter(name2, "name");
                pp.v vVar = (pp.v) ((LinkedHashMap) iVar7.f7980e).get(name2);
                if (vVar != null) {
                    return yo.p.l0(((hq.j) kVar.f3122e).f11019a, jVar, name2, (kq.i) iVar7.f7982v, new jq.a(((hq.j) kVar.f3122e).f11019a, new fp.b(6, jVar, vVar)), n0.C);
                }
                return null;
            case 4:
                g3.b bVar2 = (g3.b) obj2;
                e4.i iVar8 = (e4.i) bVar2.f9464d;
                Intrinsics.checkNotNullParameter(extractNullability, "$this$extractNullability");
                pq.d dVar2 = ((mp.a) obj).f15963a;
                wo.b annotation = (wo.b) extractNullability;
                Intrinsics.checkNotNullParameter(annotation, "<this>");
                if (annotation instanceof f) {
                    ((hp.a) iVar8.f7980e).f10974t.getClass();
                    if (!((f) annotation).f13350g && ((ep.a) bVar2.f9465e) != ep.a.TYPE_PARAMETER_BOUNDS) {
                        if (dVar2 != null) {
                            up.e eVar2 = so.i.f20342e;
                            iVarG = ((lq.z) dVar2).r0().g();
                            if (iVarG != null || so.i.s(iVarG) == null) {
                                z5 = false;
                            } else {
                                ((hp.a) iVar8.f7980e).f10971q.getClass();
                                Intrinsics.checkNotNullParameter(annotation, "annotation");
                                Object objC = ep.b.c(annotation, so.o.f20386t);
                                if (objC == null) {
                                    z5 = false;
                                } else {
                                    ArrayList arrayListA = ep.b.a(objC, false);
                                    if (arrayListA.isEmpty()) {
                                        z5 = false;
                                    } else {
                                        Iterator it = arrayListA.iterator();
                                        while (it.hasNext()) {
                                            if (Intrinsics.areEqual((String) it.next(), "TYPE")) {
                                                ((hp.a) iVar8.f7980e).f10974t.getClass();
                                            }
                                        }
                                        z5 = false;
                                    }
                                }
                            }
                        } else {
                            z5 = false;
                        }
                    }
                } else if (dVar2 != null) {
                    up.e eVar3 = so.i.f20342e;
                    iVarG = ((lq.z) dVar2).r0().g();
                    if (iVarG != null) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                } else {
                    z5 = false;
                }
                return Boolean.valueOf(z5);
            case 5:
                mp.s sVar = (mp.s) obj2;
                mp.d[] dVarArr = (mp.d[]) obj;
                int iIntValue = ((Number) extractNullability).intValue();
                if (sVar == null || (dVar = (mp.d) sVar.f16010a.get(Integer.valueOf(iIntValue))) == null) {
                    return (iIntValue < 0 || iIntValue >= dVarArr.length) ? mp.d.f15967e : dVarArr[iIntValue];
                }
                return dVar;
            default:
                vo.d second = (vo.d) extractNullability;
                vo.d first = (vo.d) obj;
                Intrinsics.checkNotNullParameter(first, "first");
                Intrinsics.checkNotNullParameter(second, "second");
                ((mo.c0) obj2).h(first, second);
                return Unit.f14616a;
        }
    }

    public m(k0 k0Var, p pVar) {
        this.f13362d = 1;
        this.f13364i = k0Var;
        this.f13363e = pVar;
    }
}
