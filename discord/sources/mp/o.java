package mp;

import ep.b0;
import ep.v;
import ep.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import lq.b1;
import lq.e1;
import lq.q0;
import lq.z;
import vo.l0;
import vo.r0;
import yo.h0;
import yo.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class o {
    /* JADX WARN: Code duplicated, block: B:101:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:110:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:175:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:190:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:214:0x0344  */
    /* JADX WARN: Code duplicated, block: B:220:0x0350  */
    /* JADX WARN: Code duplicated, block: B:222:0x0355  */
    /* JADX WARN: Code duplicated, block: B:227:0x0364  */
    /* JADX WARN: Code duplicated, block: B:234:0x0374  */
    /* JADX WARN: Code duplicated, block: B:238:0x038c  */
    /* JADX WARN: Code duplicated, block: B:240:0x0396  */
    /* JADX WARN: Code duplicated, block: B:241:0x0398  */
    /* JADX WARN: Code duplicated, block: B:246:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:247:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:251:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:253:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:256:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:262:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:263:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:267:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:276:0x0427  */
    /* JADX WARN: Code duplicated, block: B:280:0x042e  */
    /* JADX WARN: Code duplicated, block: B:283:0x0433  */
    /* JADX WARN: Code duplicated, block: B:287:0x043a  */
    /* JADX WARN: Code duplicated, block: B:290:0x0441  */
    /* JADX WARN: Code duplicated, block: B:293:0x044b  */
    /* JADX WARN: Code duplicated, block: B:298:0x045b  */
    /* JADX WARN: Code duplicated, block: B:311:0x0358 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x039c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x03d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x03c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x0407 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x03f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x045b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x0455 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x0445 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:340:0x0201 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01e7  */
    /* JADX WARN: Multi-variable type inference failed */
    public final z a(g3.b bVar, z zVar, List overrides, s sVar, boolean z5) {
        int size;
        Iterable annotations;
        Iterable annotations2;
        ArrayList arrayList;
        ArrayList arrayList2;
        r0 r0Var;
        e4.i iVar;
        ep.a aVar;
        h hVar;
        ep.n nVar;
        h hVarB;
        h hVarB2;
        g gVar;
        boolean z6;
        d dVar;
        g gVar2;
        ep.n nVar2;
        boolean z7;
        e eVar;
        q0 q0VarQ;
        g gVar3;
        boolean z10;
        ArrayList<d> superQualifiers;
        Iterator it;
        boolean z11;
        boolean z12;
        ArrayList arrayList3;
        Set setL0;
        g gVar4;
        g gVar5;
        g gVar6;
        ArrayList arrayList4;
        Iterator it2;
        boolean z13;
        boolean z14;
        Iterator it3;
        d dVar2;
        e eVar2;
        ArrayList arrayList5;
        Iterator it4;
        Set setL1;
        g gVar7;
        g gVar8;
        a aVar2;
        d dVar3;
        pq.d dVar4;
        g gVarD;
        boolean z15;
        pq.i iVarJ;
        wo.a aVar3 = (wo.a) bVar.f9463c;
        e4.i iVar2 = (e4.i) bVar.f9464d;
        boolean z16 = bVar.f9461a;
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        ArrayList arrayListE = bVar.e(zVar);
        ArrayList arrayList6 = new ArrayList(e0.l(overrides, 10));
        Iterator it5 = overrides.iterator();
        while (it5.hasNext()) {
            arrayList6.add(bVar.e((pq.d) it5.next()));
        }
        if (!z16 || overrides.isEmpty()) {
            size = arrayListE.size();
            break;
        }
        Iterator it6 = overrides.iterator();
        while (true) {
            if (!it6.hasNext()) {
                size = arrayListE.size();
                break;
            }
            pq.d other = (pq.d) it6.next();
            Intrinsics.checkNotNullParameter(zVar, "<this>");
            Intrinsics.checkNotNullParameter(other, "other");
            if (!((mq.l) ((hp.a) iVar2.f7980e).f10975u).a(zVar, (z) other)) {
                size = 1;
                break;
            }
        }
        d[] dVarArr = new d[size];
        int i7 = 0;
        while (i7 < size) {
            a aVar4 = (a) arrayListE.get(i7);
            ep.a aVar5 = (ep.a) bVar.f9465e;
            pq.d dVar5 = aVar4.f15963a;
            r0 receiver = aVar4.f15965c;
            mq.m mVar = mq.m.f16035d;
            int i10 = size;
            if (dVar5 == null) {
                if (receiver != null) {
                    Intrinsics.checkNotNullParameter(receiver, "$receiver");
                    e1 variance = receiver.getVariance();
                    Intrinsics.checkNotNullExpressionValue(variance, "getVariance(...)");
                    iVarJ = ib.a.j(variance);
                } else {
                    iVarJ = null;
                }
                if (iVarJ == pq.i.IN) {
                    dVar = d.f15967e;
                    iVar = iVar2;
                    arrayList = arrayListE;
                    arrayList2 = arrayList6;
                    hVar = null;
                }
                gVar3 = dVar.f15968a;
                z10 = dVar.f15971d;
                superQualifiers = new ArrayList();
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    aVar2 = (a) CollectionsKt.M(i7, (List) it.next());
                    if (aVar2 != null || (dVar4 = aVar2.f15963a) == null) {
                        dVar3 = null;
                    } else {
                        g gVarD2 = g3.b.d(dVar4);
                        if (gVarD2 == null) {
                            Intrinsics.checkNotNullParameter(dVar4, "<this>");
                            z zVarF = lq.c.f((z) dVar4);
                            gVarD = zVarF != null ? g3.b.d(zVarF) : hVar;
                        } else {
                            gVarD = gVarD2;
                        }
                        String str = uo.d.f21197a;
                        e eVar3 = uo.d.k.containsKey(g3.b.c(mVar.O(dVar4))) ? e.f15972d : uo.d.j.containsKey(g3.b.c(mVar.x(dVar4))) ? e.f15973e : null;
                        if (mVar.d(dVar4)) {
                            z15 = true;
                        } else {
                            Intrinsics.checkNotNullParameter(dVar4, "<this>");
                            if (((z) dVar4).w0() instanceof f) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        }
                        dVar3 = new d(gVarD, eVar3, z15, gVarD != gVarD2);
                    }
                    if (dVar3 != null) {
                        superQualifiers.add(dVar3);
                    }
                    it = it;
                    hVar = null;
                }
                if (i7 == 0 || !z16) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (i7 == 0 || !(aVar3 instanceof yo.q0) || ((yo.q0) aVar3).H == null) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                Intrinsics.checkNotNullParameter(superQualifiers, "superQualifiers");
                arrayList3 = new ArrayList();
                for (d dVar6 : superQualifiers) {
                    if (dVar6.f15971d) {
                        gVar8 = null;
                    } else {
                        gVar8 = dVar6.f15968a;
                    }
                    if (gVar8 != null) {
                        arrayList3.add(gVar8);
                    }
                }
                setL0 = CollectionsKt.l0(arrayList3);
                if (z10) {
                    gVar4 = null;
                } else {
                    gVar4 = gVar3;
                }
                gVar5 = g.f15976d;
                if (gVar4 != gVar5) {
                    gVar5 = (g) com.facebook.imagepipeline.nativecode.b.y(setL0, g.f15978i, g.f15977e, gVar4, z11);
                }
                if (gVar5 == null) {
                    arrayList5 = new ArrayList();
                    it4 = superQualifiers.iterator();
                    while (it4.hasNext()) {
                        gVar7 = ((d) it4.next()).f15968a;
                        if (gVar7 != null) {
                            arrayList5.add(gVar7);
                        }
                    }
                    setL1 = CollectionsKt.l0(arrayList5);
                    gVar6 = g.f15976d;
                    if (gVar3 != gVar6) {
                        gVar6 = (g) com.facebook.imagepipeline.nativecode.b.y(setL1, g.f15978i, g.f15977e, gVar3, z11);
                    }
                } else {
                    gVar6 = gVar5;
                }
                arrayList4 = new ArrayList();
                it2 = superQualifiers.iterator();
                while (it2.hasNext()) {
                    eVar2 = ((d) it2.next()).f15969b;
                    if (eVar2 != null) {
                        arrayList4.add(eVar2);
                    }
                }
                wo.a aVar6 = aVar3;
                e eVar4 = (e) com.facebook.imagepipeline.nativecode.b.y(CollectionsKt.l0(arrayList4), e.f15973e, e.f15972d, dVar.f15969b, z11);
                if (gVar6 != null || z5 || (z12 && gVar6 == g.f15977e)) {
                    gVar6 = null;
                }
                if (gVar6 == null && gVar5 == null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (gVar6 != g.f15978i) {
                    z14 = false;
                } else {
                    if (z10 == z13 || !dVar.f15970c) {
                        if (!superQualifiers.isEmpty()) {
                            it3 = superQualifiers.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    dVar2 = (d) it3.next();
                                    if (dVar2.f15971d == z13 || !dVar2.f15970c) {
                                    }
                                }
                            }
                        }
                        z14 = false;
                    }
                    z14 = true;
                }
                dVarArr[i7] = new d(gVar6, eVar4, z14, z13);
                i7++;
                size = i10;
                aVar3 = aVar6;
                z16 = z16;
                iVar2 = iVar;
                arrayListE = arrayList;
                arrayList6 = arrayList2;
            } else {
                z16 = z16;
            }
            boolean z17 = receiver == null;
            if (dVar5 != null) {
                Intrinsics.checkNotNullParameter(dVar5, "<this>");
                annotations = ((z) dVar5).getAnnotations();
            } else {
                annotations = n0.f14659d;
            }
            r0 r0VarG = (dVar5 == null || (q0VarQ = mVar.Q(dVar5)) == null) ? null : e4.f.G(q0VarQ);
            boolean z18 = z17;
            boolean z19 = aVar5 == ep.a.TYPE_PARAMETER_BOUNDS;
            if (z18) {
                if (!z19) {
                    ((hp.a) iVar2.f7980e).f10974t.getClass();
                }
                if (aVar3 == null || (annotations2 = aVar3.getAnnotations()) == null) {
                    annotations2 = n0.f14659d;
                }
                annotations = CollectionsKt.T(annotations2, annotations);
            }
            ((hp.a) iVar2.f7980e).f10971q.getClass();
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            Iterator it7 = annotations.iterator();
            arrayList = arrayListE;
            e eVar5 = null;
            while (true) {
                if (!it7.hasNext()) {
                    arrayList2 = arrayList6;
                    r0Var = receiver;
                    break;
                }
                arrayList2 = arrayList6;
                up.c cVarD = ep.b.d(it7.next());
                r0Var = receiver;
                if (CollectionsKt.E(b0.f8517n, cVarD)) {
                    eVar = e.f15972d;
                } else {
                    if (CollectionsKt.E(b0.f8518o, cVarD)) {
                        eVar = e.f15973e;
                    } else {
                        continue;
                    }
                    arrayList6 = arrayList2;
                    receiver = r0Var;
                }
                if (eVar5 != null && eVar5 != eVar) {
                    eVar5 = null;
                    break;
                }
                eVar5 = eVar;
                arrayList6 = arrayList2;
                receiver = r0Var;
            }
            ep.b bVar2 = ((hp.a) iVar2.f7980e).f10971q;
            iVar = iVar2;
            ip.m forceWarning = new ip.m(4, bVar, aVar4);
            bVar2.getClass();
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            Intrinsics.checkNotNullParameter(forceWarning, "forceWarning");
            Iterator it8 = annotations.iterator();
            h hVar2 = null;
            while (true) {
                if (!it8.hasNext()) {
                    aVar = aVar5;
                    hVar = null;
                    break;
                }
                Object next = it8.next();
                Iterator it9 = it8;
                h hVarG = bVar2.g(next, ((Boolean) forceWarning.invoke(next)).booleanValue());
                if (hVarG != null) {
                    aVar = aVar5;
                } else {
                    Object objI = bVar2.i(next);
                    if (objI == null) {
                        aVar = aVar5;
                    } else {
                        ep.e0 e0VarH = bVar2.h(next);
                        if (e0VarH == null) {
                            e0VarH = bVar2.f8504a.f8596a.f8602a;
                        }
                        e0VarH.getClass();
                        aVar = aVar5;
                        if (e0VarH == ep.e0.IGNORE) {
                            hVarG = null;
                        } else {
                            h hVarG2 = bVar2.g(objI, ((Boolean) forceWarning.invoke(objI)).booleanValue());
                            if (hVarG2 != null) {
                                bVar2 = bVar2;
                                hVar = null;
                                hVarG = h.a(hVarG2, null, e0VarH == ep.e0.WARN, 1);
                            }
                        }
                        if (hVar2 == null) {
                            hVar2 = hVarG;
                        } else {
                            boolean z20 = hVar2.f15981b;
                            if (hVarG == null && !Intrinsics.areEqual(hVarG, hVar2) && (!(z7 = hVarG.f15981b) || z20)) {
                                if (z7 || !z20) {
                                    hVar2 = hVar;
                                    break;
                                }
                                hVar2 = hVarG;
                            }
                        }
                        bVar2 = bVar2;
                        aVar5 = aVar;
                        it8 = it9;
                    }
                    bVar2 = bVar2;
                    hVar = null;
                    hVarG = null;
                    if (hVar2 == null) {
                        hVar2 = hVarG;
                    } else {
                        boolean z21 = hVar2.f15981b;
                        if (hVarG == null) {
                            continue;
                        }
                    }
                    bVar2 = bVar2;
                    aVar5 = aVar;
                    it8 = it9;
                }
                hVar = null;
                if (hVar2 == null) {
                    hVar2 = hVarG;
                } else {
                    boolean z22 = hVar2.f15981b;
                    if (hVarG == null) {
                        continue;
                    }
                }
                bVar2 = bVar2;
                aVar5 = aVar;
                it8 = it9;
            }
            if (hVar2 != null) {
                g gVar9 = hVar2.f15980a;
                dVar = new d(gVar9, eVar5, gVar9 == g.f15978i && r0VarG != null, hVar2.f15981b);
            } else {
                ep.a aVar7 = (z18 || z19) ? aVar : ep.a.TYPE_USE;
                w wVar = aVar4.f15964b;
                if (wVar != null) {
                    nVar2 = (ep.n) wVar.f8599a.get(aVar7);
                } else {
                    nVar = hVar;
                }
                if (r0VarG != null) {
                    nVar = nVar2;
                    hVarB = g3.b.b(r0VarG);
                } else {
                    nVar = nVar2;
                    hVarB = hVar;
                }
                h hVarA = hVarB != null ? h.a(hVarB, g.f15978i, false, 2) : nVar != 0 ? nVar.f8572a : hVar;
                boolean z23 = (hVarB != null ? hVarB.f15980a : hVar) == g.f15978i || !(r0VarG == null || nVar == 0 || !nVar.f8574c);
                if (r0Var == null || (hVarB2 = g3.b.b(r0Var)) == null) {
                    hVarB2 = hVar;
                } else if (hVarB2.f15980a == g.f15977e) {
                    hVarB2 = h.a(hVarB2, g.f15976d, false, 2);
                }
                if (hVarB2 != null) {
                    g gVar10 = hVarB2.f15980a;
                    if (hVarA == null) {
                        hVarA = hVarB2;
                    } else {
                        g gVar11 = hVarA.f15980a;
                        boolean z24 = hVarA.f15981b;
                        boolean z25 = hVarB2.f15981b;
                        if ((!z25 || z24) && ((!z25 && z24) || (gVar10.compareTo(gVar11) >= 0 && gVar10.compareTo(gVar11) > 0))) {
                            hVarA = hVarB2;
                        }
                    }
                }
                if (hVarA != null) {
                    gVar2 = hVarA.f15980a;
                } else {
                    gVar = hVar;
                }
                if (hVarA != null) {
                    if (hVarA.f15981b) {
                        gVar = gVar2;
                        z6 = true;
                    }
                    dVar = new d(gVar, eVar5, z23, z6);
                } else {
                    gVar = gVar2;
                }
                gVar = gVar2;
                z6 = false;
                dVar = new d(gVar, eVar5, z23, z6);
            }
            gVar3 = dVar.f15968a;
            z10 = dVar.f15971d;
            superQualifiers = new ArrayList();
            it = arrayList2.iterator();
            while (it.hasNext()) {
                aVar2 = (a) CollectionsKt.M(i7, (List) it.next());
                if (aVar2 != null) {
                    dVar3 = null;
                } else {
                    dVar3 = null;
                }
                if (dVar3 != null) {
                    superQualifiers.add(dVar3);
                }
                it = it;
                hVar = null;
            }
            if (i7 == 0) {
                z11 = false;
            } else {
                z11 = false;
            }
            if (i7 == 0) {
                z12 = false;
            } else {
                z12 = false;
            }
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Intrinsics.checkNotNullParameter(superQualifiers, "superQualifiers");
            arrayList3 = new ArrayList();
            while (r13.hasNext()) {
                if (dVar6.f15971d) {
                    gVar8 = null;
                } else {
                    gVar8 = dVar6.f15968a;
                }
                if (gVar8 != null) {
                    arrayList3.add(gVar8);
                }
            }
            setL0 = CollectionsKt.l0(arrayList3);
            if (z10) {
                gVar4 = null;
            } else {
                gVar4 = gVar3;
            }
            gVar5 = g.f15976d;
            if (gVar4 != gVar5) {
                gVar5 = (g) com.facebook.imagepipeline.nativecode.b.y(setL0, g.f15978i, g.f15977e, gVar4, z11);
            }
            if (gVar5 == null) {
                arrayList5 = new ArrayList();
                it4 = superQualifiers.iterator();
                while (it4.hasNext()) {
                    gVar7 = ((d) it4.next()).f15968a;
                    if (gVar7 != null) {
                        arrayList5.add(gVar7);
                    }
                }
                setL1 = CollectionsKt.l0(arrayList5);
                gVar6 = g.f15976d;
                if (gVar3 != gVar6) {
                    gVar6 = (g) com.facebook.imagepipeline.nativecode.b.y(setL1, g.f15978i, g.f15977e, gVar3, z11);
                }
            } else {
                gVar6 = gVar5;
            }
            arrayList4 = new ArrayList();
            it2 = superQualifiers.iterator();
            while (it2.hasNext()) {
                eVar2 = ((d) it2.next()).f15969b;
                if (eVar2 != null) {
                    arrayList4.add(eVar2);
                }
            }
            wo.a aVar8 = aVar3;
            e eVar6 = (e) com.facebook.imagepipeline.nativecode.b.y(CollectionsKt.l0(arrayList4), e.f15973e, e.f15972d, dVar.f15969b, z11);
            if (gVar6 != null) {
                gVar6 = null;
            } else {
                gVar6 = null;
            }
            if (gVar6 == null) {
                z13 = false;
            } else {
                z13 = false;
            }
            if (gVar6 != g.f15978i) {
                z14 = false;
            } else if (z10 == z13) {
                if (!superQualifiers.isEmpty()) {
                    it3 = superQualifiers.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            dVar2 = (d) it3.next();
                            if (dVar2.f15971d == z13) {
                            }
                        }
                    }
                }
                z14 = false;
            } else {
                if (!superQualifiers.isEmpty()) {
                    it3 = superQualifiers.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            dVar2 = (d) it3.next();
                            if (dVar2.f15971d == z13) {
                            }
                        }
                    }
                }
                z14 = false;
            }
            dVarArr[i7] = new d(gVar6, eVar6, z14, z13);
            i7++;
            size = i10;
            aVar3 = aVar8;
            z16 = z16;
            iVar2 = iVar;
            arrayListE = arrayList;
            arrayList6 = arrayList2;
        }
        ip.m qualifiers = new ip.m(5, sVar, dVarArr);
        boolean z26 = bVar.f9462b;
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
        return (z) c.b(zVar.w0(), qualifiers, 0, z26).f174i;
    }

    public final z b(gp.a aVar, vo.b bVar, boolean z5, e4.i iVar, ep.a aVar2, s sVar, boolean z6, Function1 function1) {
        g3.b bVar2 = new g3.b((wo.a) bVar, z5, iVar, aVar2, false);
        z zVar = (z) function1.invoke(aVar);
        Collection collectionH = aVar.h();
        Intrinsics.checkNotNullExpressionValue(collectionH, "getOverriddenDescriptors(...)");
        Collection<vo.d> collection = collectionH;
        ArrayList arrayList = new ArrayList(e0.l(collection, 10));
        for (vo.d dVar : collection) {
            Intrinsics.checkNotNull(dVar);
            arrayList.add((z) function1.invoke(dVar));
        }
        return a(bVar2, zVar, arrayList, sVar, z6);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:107:0x020b  */
    /* JADX WARN: Code duplicated, block: B:111:0x022b  */
    /* JADX WARN: Code duplicated, block: B:112:0x022f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0232  */
    /* JADX WARN: Code duplicated, block: B:116:0x0239  */
    /* JADX WARN: Code duplicated, block: B:118:0x023d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0243  */
    /* JADX WARN: Code duplicated, block: B:122:0x0247  */
    /* JADX WARN: Code duplicated, block: B:125:0x0269  */
    /* JADX WARN: Code duplicated, block: B:127:0x026f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0278  */
    /* JADX WARN: Code duplicated, block: B:130:0x027b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0284  */
    /* JADX WARN: Code duplicated, block: B:135:0x028c  */
    /* JADX WARN: Code duplicated, block: B:138:0x0296  */
    /* JADX WARN: Code duplicated, block: B:143:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:144:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:147:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:149:0x02cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x02d4 A[EDGE_INSN: B:152:0x02d4->B:161:0x02ef BREAK  A[LOOP:2: B:154:0x02db->B:199:?]] */
    /* JADX WARN: Code duplicated, block: B:153:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:156:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:158:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:162:0x02f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:164:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:166:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:168:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:169:0x0304  */
    /* JADX WARN: Code duplicated, block: B:173:0x031a  */
    /* JADX WARN: Code duplicated, block: B:175:0x0322  */
    /* JADX WARN: Code duplicated, block: B:177:0x0326  */
    /* JADX WARN: Code duplicated, block: B:182:0x0346  */
    /* JADX WARN: Code duplicated, block: B:188:0x033e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0339 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x028a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x02ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:? A[LOOP:4: B:136:0x0290->B:205:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x016b  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:99:0x01dd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [vo.b] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r25v0, types: [mp.o] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, vo.b, vo.d, vo.l] */
    /* JADX WARN: Type inference failed for: r5v4, types: [gp.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v39 */
    public final ArrayList c(e4.i c8, Collection platformSignatures) {
        wo.h annotations;
        ?? r11;
        z type;
        m mVar;
        boolean z5;
        String str;
        ArrayList arrayList;
        String str2;
        ArrayList arrayList2;
        l0 l0Var;
        boolean z6;
        ep.a aVar;
        s sVar;
        boolean z7;
        int i7;
        z zVarB;
        z returnType;
        boolean z10;
        Pair pair;
        ArrayList arrayList3;
        int i10;
        int i11;
        z type2;
        yo.t tVarV;
        Iterator it;
        boolean z11;
        yo.t tVarV2;
        boolean zC;
        List listL;
        Iterator it2;
        z type3;
        boolean z12;
        s sVar2;
        e4.i iVar;
        e4.i iVarL;
        e4.i iVarL2;
        i0 i0Var;
        n nVar = n.f16000w;
        Intrinsics.checkNotNullParameter(c8, "c");
        Intrinsics.checkNotNullParameter(platformSignatures, "platformSignatures");
        Collection<??> collection = platformSignatures;
        int i12 = 10;
        ArrayList arrayList4 = new ArrayList(e0.l(collection, 10));
        for (?? target : collection) {
            if (!(target instanceof gp.a)) {
                i10 = i12;
            } else if (target.c() == vo.c.f21793e && target.a().h().size() == 1) {
                i10 = 10;
            } else {
                vo.i iVarX = mf.f.x(target);
                if (iVarX == null) {
                    annotations = ((fq.a) target).getAnnotations();
                } else {
                    ip.j jVar = iVarX instanceof ip.j ? (ip.j) iVarX : null;
                    List list = jVar != null ? (List) jVar.H.getValue() : null;
                    if (list == null || list.isEmpty()) {
                        annotations = ((fq.a) target).getAnnotations();
                    } else {
                        ArrayList arrayList5 = new ArrayList(e0.l(list, i12));
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add(new ip.f((bp.d) it3.next(), c8, true));
                        }
                        ArrayList annotations2 = CollectionsKt.T(((fq.a) target).getAnnotations(), arrayList5);
                        Intrinsics.checkNotNullParameter(annotations2, "annotations");
                        annotations = annotations2.isEmpty() ? wo.g.f22379a : new wo.i(0, annotations2);
                    }
                }
                e4.i iVarL3 = ls.l.l(c8, annotations);
                if (!(target instanceof gp.f) || (i0Var = ((h0) target).U) == null || i0Var.f23431x) {
                    r11 = target;
                } else {
                    Intrinsics.checkNotNull(i0Var);
                    r11 = i0Var;
                }
                if (target.V() != null) {
                    vo.u uVar = r11 instanceof vo.u ? (vo.u) r11 : null;
                    yo.q0 q0Var = uVar != null ? (yo.q0) uVar.R(gp.e.f10168d0) : null;
                    type = b((gp.a) target, q0Var, false, (q0Var == null || (iVarL2 = ls.l.l(iVarL3, q0Var.getAnnotations())) == null) ? iVarL3 : iVarL2, ep.a.VALUE_PARAMETER, null, false, n.f15997e);
                } else {
                    type = null;
                }
                gp.e eVar = target instanceof gp.e ? (gp.e) target : null;
                if (eVar != null) {
                    vo.l lVarG = eVar.g();
                    Intrinsics.checkNotNull(lVarG, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    String strI = c9.a.I((vo.f) lVarG, com.facebook.imagepipeline.nativecode.b.f(eVar, 3));
                    if (strI == null || (mVar = (m) l.f15992d.get(strI)) == null) {
                        mVar = null;
                    } else {
                        String str3 = mVar.f15995c;
                        if (str3 != null && !x.o(str3, "2.", false)) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (str3 != null) {
                            mVar = mVar.f15996d;
                        }
                    }
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    mVar.f15994b.size();
                    ((gp.e) target).L().size();
                }
                v javaTypeEnhancementState = ((hp.a) c8.f7980e).f10976v;
                Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
                if (javaTypeEnhancementState.f8597b.invoke(ep.s.f8586a) == ep.e0.STRICT) {
                    Intrinsics.checkNotNullParameter(target, "memberDescriptor");
                    if ((target instanceof vo.u) && Intrinsics.areEqual(target.R(gp.e.f10169e0), Boolean.TRUE)) {
                        z5 = true;
                    }
                    List<yo.q0> listL2 = r11.L();
                    str = "getValueParameters(...)";
                    Intrinsics.checkNotNullExpressionValue(listL2, "getValueParameters(...)");
                    arrayList = new ArrayList(e0.l(listL2, i12));
                    for (yo.q0 q0Var2 : listL2) {
                        if (mVar != null) {
                            sVar2 = (s) CollectionsKt.M(q0Var2.f23468y, mVar.f15994b);
                        } else {
                            sVar2 = null;
                        }
                        bp.i iVar2 = new bp.i(15, q0Var2);
                        ArrayList arrayList6 = arrayList;
                        gp.a aVar2 = (gp.a) target;
                        if (q0Var2 != null || (iVarL = ls.l.l(iVarL3, q0Var2.getAnnotations())) == null) {
                            iVar = iVarL3;
                        } else {
                            iVar = iVarL;
                        }
                        arrayList6.add(b(aVar2, q0Var2, false, iVar, ep.a.VALUE_PARAMETER, sVar2, z5, iVar2));
                        str = str;
                        arrayList = arrayList6;
                    }
                    str2 = str;
                    arrayList2 = arrayList;
                    if (target instanceof l0) {
                        l0Var = (l0) target;
                    } else {
                        l0Var = null;
                    }
                    if (l0Var != null) {
                        z6 = true;
                        if (m3.m.F(l0Var)) {
                            aVar = ep.a.FIELD;
                        }
                        ep.a aVar3 = aVar;
                        if (mVar != null) {
                            sVar = mVar.f15993a;
                        } else {
                            sVar = null;
                        }
                        z7 = z6;
                        gp.a aVar4 = (gp.a) target;
                        i7 = 0;
                        zVarB = b(aVar4, r11, true, iVarL3, aVar3, sVar, false, n.f15998i);
                        returnType = target.getReturnType();
                        Intrinsics.checkNotNull(returnType);
                        if (b1.c(returnType, nVar, null)) {
                            z10 = z7;
                        } else {
                            tVarV2 = target.V();
                            if (tVarV2 != null) {
                                zC = b1.c(tVarV2.getType(), nVar, null);
                            } else {
                                zC = false;
                            }
                            if (zC) {
                                z10 = z7;
                            } else {
                                listL = target.L();
                                Intrinsics.checkNotNullExpressionValue(listL, str2);
                                if (listL == null && listL.isEmpty()) {
                                    z12 = false;
                                    break;
                                }
                                it2 = listL.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z12 = false;
                                        break;
                                    }
                                    type3 = ((yo.q0) it2.next()).getType();
                                    Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                                    if (b1.c(type3, nVar, null)) {
                                        z12 = z7;
                                        break;
                                    }
                                }
                                if (z12) {
                                    z10 = z7;
                                } else {
                                    z10 = false;
                                }
                            }
                        }
                        if (z10) {
                            Intrinsics.checkNotNullParameter(target, "target");
                            pair = new Pair(aq.c.f2882a, new ep.g());
                        } else {
                            pair = null;
                        }
                        if (type == null && zVarB == null) {
                            if (arrayList2.isEmpty()) {
                                z7 = false;
                                break;
                            }
                            it = arrayList2.iterator();
                            do {
                                if (it.hasNext()) {
                                    z7 = false;
                                    break;
                                }
                                if (((z) it.next()) != null) {
                                    z11 = z7;
                                } else {
                                    z11 = false;
                                }
                            } while (!z11);
                            if (z7 && pair == null) {
                                i10 = 10;
                            }
                        }
                        if (type == null) {
                            tVarV = target.V();
                            if (tVarV != null) {
                                type = tVarV.getType();
                            } else {
                                type = null;
                            }
                        }
                        i10 = 10;
                        arrayList3 = new ArrayList(e0.l(arrayList2, 10));
                        for (Object obj : arrayList2) {
                            i11 = i7 + 1;
                            if (i7 >= 0) {
                                d0.k();
                                throw null;
                            }
                            type2 = (z) obj;
                            if (type2 == null) {
                                type2 = ((yo.q0) target.L().get(i7)).getType();
                                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                            }
                            arrayList3.add(type2);
                            i7 = i11;
                        }
                        if (zVarB == null) {
                            zVarB = target.getReturnType();
                            Intrinsics.checkNotNull(zVarB);
                        }
                        target = aVar4.D(type, arrayList3, zVarB, pair);
                        Intrinsics.checkNotNull(target, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                    } else {
                        z6 = true;
                    }
                    aVar = ep.a.METHOD_RETURN_TYPE;
                    ep.a aVar5 = aVar;
                    if (mVar != null) {
                        sVar = mVar.f15993a;
                    } else {
                        sVar = null;
                    }
                    z7 = z6;
                    gp.a aVar6 = (gp.a) target;
                    i7 = 0;
                    zVarB = b(aVar6, r11, true, iVarL3, aVar5, sVar, false, n.f15998i);
                    returnType = target.getReturnType();
                    Intrinsics.checkNotNull(returnType);
                    if (b1.c(returnType, nVar, null)) {
                        z10 = z7;
                    } else {
                        tVarV2 = target.V();
                        if (tVarV2 != null) {
                            zC = b1.c(tVarV2.getType(), nVar, null);
                        } else {
                            zC = false;
                        }
                        if (zC) {
                            listL = target.L();
                            Intrinsics.checkNotNullExpressionValue(listL, str2);
                            if (listL == null) {
                                it2 = listL.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z12 = false;
                                        break;
                                    }
                                    type3 = ((yo.q0) it2.next()).getType();
                                    Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                                    if (b1.c(type3, nVar, null)) {
                                        z12 = z7;
                                        break;
                                    }
                                }
                            } else {
                                it2 = listL.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z12 = false;
                                        break;
                                    }
                                    type3 = ((yo.q0) it2.next()).getType();
                                    Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                                    if (b1.c(type3, nVar, null)) {
                                        z12 = z7;
                                        break;
                                    }
                                }
                            }
                            if (z12) {
                                z10 = z7;
                            } else {
                                z10 = false;
                            }
                        } else {
                            z10 = z7;
                        }
                    }
                    if (z10) {
                        Intrinsics.checkNotNullParameter(target, "target");
                        pair = new Pair(aq.c.f2882a, new ep.g());
                    } else {
                        pair = null;
                    }
                    if (type == null) {
                        if (arrayList2.isEmpty()) {
                            z7 = false;
                            break;
                        }
                        it = arrayList2.iterator();
                        do {
                            if (it.hasNext()) {
                                z7 = false;
                                break;
                            }
                            if (((z) it.next()) != null) {
                                z11 = z7;
                            } else {
                                z11 = false;
                            }
                        } while (!z11);
                        if (z7) {
                        }
                    }
                    if (type == null) {
                        tVarV = target.V();
                        if (tVarV != null) {
                            type = tVarV.getType();
                        } else {
                            type = null;
                        }
                    }
                    i10 = 10;
                    arrayList3 = new ArrayList(e0.l(arrayList2, 10));
                    while (r7.hasNext()) {
                        i11 = i7 + 1;
                        if (i7 >= 0) {
                            d0.k();
                            throw null;
                        }
                        type2 = (z) obj;
                        if (type2 == null) {
                            type2 = ((yo.q0) target.L().get(i7)).getType();
                            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                        }
                        arrayList3.add(type2);
                        i7 = i11;
                    }
                    if (zVarB == null) {
                        zVarB = target.getReturnType();
                        Intrinsics.checkNotNull(zVarB);
                    }
                    target = aVar6.D(type, arrayList3, zVarB, pair);
                    Intrinsics.checkNotNull(target, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                } else {
                    ((hp.a) iVarL3.f7980e).f10974t.getClass();
                }
                z5 = false;
                List<yo.q0> listL3 = r11.L();
                str = "getValueParameters(...)";
                Intrinsics.checkNotNullExpressionValue(listL3, "getValueParameters(...)");
                arrayList = new ArrayList(e0.l(listL3, i12));
                while (r10.hasNext()) {
                    if (mVar != null) {
                        sVar2 = (s) CollectionsKt.M(q0Var2.f23468y, mVar.f15994b);
                    } else {
                        sVar2 = null;
                    }
                    bp.i iVar3 = new bp.i(15, q0Var2);
                    ArrayList arrayList7 = arrayList;
                    gp.a aVar7 = (gp.a) target;
                    if (q0Var2 != null) {
                        iVar = iVarL3;
                    } else {
                        iVar = iVarL3;
                    }
                    arrayList7.add(b(aVar7, q0Var2, false, iVar, ep.a.VALUE_PARAMETER, sVar2, z5, iVar3));
                    str = str;
                    arrayList = arrayList7;
                }
                str2 = str;
                arrayList2 = arrayList;
                if (target instanceof l0) {
                    l0Var = (l0) target;
                } else {
                    l0Var = null;
                }
                if (l0Var != null) {
                    z6 = true;
                    if (m3.m.F(l0Var)) {
                        aVar = ep.a.FIELD;
                    }
                    ep.a aVar8 = aVar;
                    if (mVar != null) {
                        sVar = mVar.f15993a;
                    } else {
                        sVar = null;
                    }
                    z7 = z6;
                    gp.a aVar9 = (gp.a) target;
                    i7 = 0;
                    zVarB = b(aVar9, r11, true, iVarL3, aVar8, sVar, false, n.f15998i);
                    returnType = target.getReturnType();
                    Intrinsics.checkNotNull(returnType);
                    if (b1.c(returnType, nVar, null)) {
                        z10 = z7;
                    } else {
                        tVarV2 = target.V();
                        if (tVarV2 != null) {
                            zC = b1.c(tVarV2.getType(), nVar, null);
                        } else {
                            zC = false;
                        }
                        if (zC) {
                            listL = target.L();
                            Intrinsics.checkNotNullExpressionValue(listL, str2);
                            if (listL == null) {
                                it2 = listL.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z12 = false;
                                        break;
                                    }
                                    type3 = ((yo.q0) it2.next()).getType();
                                    Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                                    if (b1.c(type3, nVar, null)) {
                                        z12 = z7;
                                        break;
                                    }
                                }
                            } else {
                                it2 = listL.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z12 = false;
                                        break;
                                    }
                                    type3 = ((yo.q0) it2.next()).getType();
                                    Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                                    if (b1.c(type3, nVar, null)) {
                                        z12 = z7;
                                        break;
                                    }
                                }
                            }
                            if (z12) {
                                z10 = z7;
                            } else {
                                z10 = false;
                            }
                        } else {
                            z10 = z7;
                        }
                    }
                    if (z10) {
                        Intrinsics.checkNotNullParameter(target, "target");
                        pair = new Pair(aq.c.f2882a, new ep.g());
                    } else {
                        pair = null;
                    }
                    if (type == null) {
                        if (arrayList2.isEmpty()) {
                            z7 = false;
                            break;
                        }
                        it = arrayList2.iterator();
                        do {
                            if (it.hasNext()) {
                                z7 = false;
                                break;
                            }
                            if (((z) it.next()) != null) {
                                z11 = z7;
                            } else {
                                z11 = false;
                            }
                        } while (!z11);
                        if (z7) {
                        }
                    }
                    if (type == null) {
                        tVarV = target.V();
                        if (tVarV != null) {
                            type = tVarV.getType();
                        } else {
                            type = null;
                        }
                    }
                    i10 = 10;
                    arrayList3 = new ArrayList(e0.l(arrayList2, 10));
                    while (r7.hasNext()) {
                        i11 = i7 + 1;
                        if (i7 >= 0) {
                            d0.k();
                            throw null;
                        }
                        type2 = (z) obj;
                        if (type2 == null) {
                            type2 = ((yo.q0) target.L().get(i7)).getType();
                            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                        }
                        arrayList3.add(type2);
                        i7 = i11;
                    }
                    if (zVarB == null) {
                        zVarB = target.getReturnType();
                        Intrinsics.checkNotNull(zVarB);
                    }
                    target = aVar9.D(type, arrayList3, zVarB, pair);
                    Intrinsics.checkNotNull(target, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                } else {
                    z6 = true;
                }
                aVar = ep.a.METHOD_RETURN_TYPE;
                ep.a aVar10 = aVar;
                if (mVar != null) {
                    sVar = mVar.f15993a;
                } else {
                    sVar = null;
                }
                z7 = z6;
                gp.a aVar11 = (gp.a) target;
                i7 = 0;
                zVarB = b(aVar11, r11, true, iVarL3, aVar10, sVar, false, n.f15998i);
                returnType = target.getReturnType();
                Intrinsics.checkNotNull(returnType);
                if (b1.c(returnType, nVar, null)) {
                    z10 = z7;
                } else {
                    tVarV2 = target.V();
                    if (tVarV2 != null) {
                        zC = b1.c(tVarV2.getType(), nVar, null);
                    } else {
                        zC = false;
                    }
                    if (zC) {
                        listL = target.L();
                        Intrinsics.checkNotNullExpressionValue(listL, str2);
                        if (listL == null) {
                            it2 = listL.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z12 = false;
                                    break;
                                }
                                type3 = ((yo.q0) it2.next()).getType();
                                Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                                if (b1.c(type3, nVar, null)) {
                                    z12 = z7;
                                    break;
                                }
                            }
                        } else {
                            it2 = listL.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z12 = false;
                                    break;
                                }
                                type3 = ((yo.q0) it2.next()).getType();
                                Intrinsics.checkNotNullExpressionValue(type3, "getType(...)");
                                if (b1.c(type3, nVar, null)) {
                                    z12 = z7;
                                    break;
                                }
                            }
                        }
                        if (z12) {
                            z10 = z7;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = z7;
                    }
                }
                if (z10) {
                    Intrinsics.checkNotNullParameter(target, "target");
                    pair = new Pair(aq.c.f2882a, new ep.g());
                } else {
                    pair = null;
                }
                if (type == null) {
                    if (arrayList2.isEmpty()) {
                        z7 = false;
                        break;
                    }
                    it = arrayList2.iterator();
                    do {
                        if (it.hasNext()) {
                            z7 = false;
                            break;
                        }
                        if (((z) it.next()) != null) {
                            z11 = z7;
                        } else {
                            z11 = false;
                        }
                    } while (!z11);
                    if (z7) {
                    }
                }
                if (type == null) {
                    tVarV = target.V();
                    if (tVarV != null) {
                        type = tVarV.getType();
                    } else {
                        type = null;
                    }
                }
                i10 = 10;
                arrayList3 = new ArrayList(e0.l(arrayList2, 10));
                while (r7.hasNext()) {
                    i11 = i7 + 1;
                    if (i7 >= 0) {
                        d0.k();
                        throw null;
                    }
                    type2 = (z) obj;
                    if (type2 == null) {
                        type2 = ((yo.q0) target.L().get(i7)).getType();
                        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                    }
                    arrayList3.add(type2);
                    i7 = i11;
                }
                if (zVarB == null) {
                    zVarB = target.getReturnType();
                    Intrinsics.checkNotNull(zVarB);
                }
                target = aVar11.D(type, arrayList3, zVarB, pair);
                Intrinsics.checkNotNull(target, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
            }
            arrayList4.add(target);
            i12 = i10;
        }
        return arrayList4;
    }
}
