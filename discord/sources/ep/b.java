package ep;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f1;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.collections.v0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f8503c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f8504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f8505b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (a aVar : a.values()) {
            String str = aVar.f8487d;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, aVar);
            }
        }
        f8503c = linkedHashMap;
    }

    public b(v javaTypeEnhancementState) {
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f8504a = javaTypeEnhancementState;
        this.f8505b = new ConcurrentHashMap();
    }

    public static ArrayList a(Object obj, boolean z5) {
        wo.b bVar = (wo.b) obj;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Map mapB = bVar.b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapB.entrySet()) {
            kotlin.collections.i0.o(arrayList, (!z5 || Intrinsics.areEqual((up.e) entry.getKey(), a0.f8489b)) ? j((zp.g) entry.getValue()) : n0.f14659d);
        }
        return arrayList;
    }

    public static Object c(Object obj, up.c cVar) {
        for (Object obj2 : e(obj)) {
            if (Intrinsics.areEqual(d(obj2), cVar)) {
                return obj2;
            }
        }
        return null;
    }

    public static up.c d(Object obj) {
        wo.b bVar = (wo.b) obj;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return bVar.a();
    }

    public static Iterable e(Object obj) {
        wo.h annotations;
        wo.b bVar = (wo.b) obj;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        vo.f fVarD = bq.e.d(bVar);
        return (fVarD == null || (annotations = fVarD.getAnnotations()) == null) ? n0.f14659d : annotations;
    }

    public static boolean f(Object obj, up.c cVar) {
        Iterable iterableE = e(obj);
        if ((iterableE instanceof Collection) && ((Collection) iterableE).isEmpty()) {
            return false;
        }
        Iterator it = iterableE.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(d(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    public static List j(zp.g gVar) {
        if (!(gVar instanceof zp.b)) {
            return gVar instanceof zp.i ? kotlin.collections.c0.c(((zp.i) gVar).f24068c.c()) : n0.f14659d;
        }
        Iterable iterable = (Iterable) ((zp.b) gVar).f24066a;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            kotlin.collections.i0.o(arrayList, j((zp.g) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, java.util.Map] */
    public final w b(w wVar, wo.h annotations) {
        Object[] objArr;
        n nVar;
        e0 e0VarH;
        n nVar2;
        Object objC;
        Object next;
        Pair pair;
        boolean z5;
        int i7;
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        v vVar = this.f8504a;
        if (!vVar.f8598c) {
            ArrayList<n> arrayList = new ArrayList();
            Iterator it = annotations.iterator();
            while (true) {
                objArr = 0;
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                n nVar3 = null;
                if (vVar.f8598c || (nVar = (n) o.f8579e.get(d(next2))) == null) {
                    nVar2 = null;
                } else {
                    up.c cVarD = d(next2);
                    if (cVarD == null || !o.f8577c.containsKey(cVarD)) {
                        e0VarH = h(next2);
                        if (e0VarH == null) {
                            e0VarH = vVar.f8596a.f8602a;
                        }
                    } else {
                        e0VarH = (e0) vVar.f8597b.invoke(cVarD);
                    }
                    if (e0VarH == e0.IGNORE) {
                        e0VarH = null;
                    }
                    if (e0VarH == null) {
                        nVar2 = null;
                    } else {
                        mp.h nullabilityQualifier = mp.h.a(nVar.f8572a, null, e0VarH == e0.WARN, 1);
                        Collection qualifierApplicabilityTypes = nVar.f8573b;
                        boolean z6 = nVar.f8574c;
                        Intrinsics.checkNotNullParameter(nullabilityQualifier, "nullabilityQualifier");
                        Intrinsics.checkNotNullParameter(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
                        nVar2 = new n(nullabilityQualifier, qualifierApplicabilityTypes, z6);
                    }
                }
                if (nVar2 != null) {
                    nVar3 = nVar2;
                } else {
                    if (vVar.f8596a.f8605d || (objC = c(next2, b0.f8511f)) == null) {
                        pair = null;
                    } else {
                        Iterator it2 = e(next2).iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (i(next) == null);
                        if (next == null) {
                            pair = null;
                        } else {
                            ArrayList arrayListA = a(objC, true);
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it3 = arrayListA.iterator();
                            while (it3.hasNext()) {
                                a aVar = (a) f8503c.get((String) it3.next());
                                if (aVar != null) {
                                    linkedHashSet.add(aVar);
                                }
                            }
                            if (linkedHashSet.contains(a.TYPE_USE)) {
                                Set setJ = kotlin.collections.y.J(a.values());
                                a aVar2 = a.TYPE_PARAMETER_BOUNDS;
                                Intrinsics.checkNotNullParameter(setJ, "<this>");
                                LinkedHashSet linkedHashSet2 = new LinkedHashSet(v0.a(setJ.size()));
                                boolean z7 = false;
                                for (Object obj : setJ) {
                                    if (z7 || !Intrinsics.areEqual(obj, aVar2)) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                        z7 = true;
                                    }
                                    if (z5) {
                                        linkedHashSet2.add(obj);
                                    }
                                }
                                linkedHashSet = f1.d(linkedHashSet2, linkedHashSet);
                            }
                            pair = new Pair(next, linkedHashSet);
                        }
                    }
                    if (pair != null) {
                        Object extractNullability = pair.f14612d;
                        Set set = (Set) pair.f14613e;
                        e0 e0VarH2 = h(next2);
                        if (e0VarH2 == null && (e0VarH2 = h(extractNullability)) == null) {
                            e0VarH2 = vVar.f8596a.f8602a;
                        }
                        e0VarH2.getClass();
                        e0 e0Var = e0.IGNORE;
                        if (e0VarH2 != e0Var) {
                            Intrinsics.checkNotNullParameter(extractNullability, "$this$extractNullability");
                            mp.h hVarG = g(extractNullability, false);
                            if (hVarG == null) {
                                Object extractNullability2 = i(extractNullability);
                                if (extractNullability2 != null) {
                                    e0 e0VarH3 = h(extractNullability);
                                    if (e0VarH3 == null) {
                                        e0VarH3 = vVar.f8596a.f8602a;
                                    }
                                    e0VarH3.getClass();
                                    if (e0VarH3 != e0Var) {
                                        Intrinsics.checkNotNullParameter(extractNullability2, "$this$extractNullability");
                                        mp.h hVarG2 = g(extractNullability2, false);
                                        if (hVarG2 != null) {
                                            i7 = 1;
                                            hVarG = mp.h.a(hVarG2, null, e0VarH3 == e0.WARN, 1);
                                        } else {
                                            i7 = 1;
                                            hVarG = null;
                                        }
                                    }
                                }
                                hVarG = null;
                                i7 = 1;
                            } else {
                                i7 = 1;
                            }
                            if (hVarG != null) {
                                nVar3 = new n(mp.h.a(hVarG, null, e0VarH2 == e0.WARN ? i7 : 0, i7), set);
                            }
                        }
                    }
                }
                if (nVar3 != null) {
                    arrayList.add(nVar3);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(a.class);
                for (n nVar4 : arrayList) {
                    for (a aVar3 : nVar4.f8573b) {
                        enumMap.containsKey(aVar3);
                        enumMap.put(aVar3, nVar4);
                    }
                }
                EnumMap enumMap2 = wVar != null ? new EnumMap(wVar.f8599a) : new EnumMap(a.class);
                for (Map.Entry entry : enumMap.entrySet()) {
                    a aVar4 = (a) entry.getKey();
                    n nVar5 = (n) entry.getValue();
                    if (nVar5 != null) {
                        enumMap2.put(aVar4, nVar5);
                        objArr = 1;
                    }
                }
                if (objArr != 0) {
                    return new w(enumMap2);
                }
            }
        }
        return wVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        if (r6.equals("NEVER") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if (r6.equals("MAYBE") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
    
        r6 = mp.g.f15977e;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final mp.h g(java.lang.Object r6, boolean r7) {
        /*
            r5 = this;
            up.c r0 = d(r6)
            r1 = 0
            if (r0 != 0) goto L9
            goto L93
        L9:
            ep.v r2 = r5.f8504a
            kotlin.jvm.functions.Function1 r2 = r2.f8597b
            java.lang.Object r2 = r2.invoke(r0)
            ep.e0 r2 = (ep.e0) r2
            r2.getClass()
            ep.e0 r3 = ep.e0.IGNORE
            if (r2 != r3) goto L1b
            return r1
        L1b:
            java.util.Set r3 = ep.b0.k
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L27
            mp.g r6 = mp.g.f15978i
            goto L85
        L27:
            java.util.Set r3 = ep.b0.f8515l
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L32
            mp.g r6 = mp.g.f15977e
            goto L85
        L32:
            java.util.Set r3 = ep.b0.f8516m
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L3d
            mp.g r6 = mp.g.f15976d
            goto L85
        L3d:
            up.c r3 = ep.b0.f8512g
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r0 == 0) goto L93
            java.util.ArrayList r6 = a(r6, r4)
            java.lang.Object r6 = kotlin.collections.CollectionsKt.L(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L83
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L77;
                case 74175084: goto L6e;
                case 433141802: goto L62;
                case 1933739535: goto L59;
                default: goto L58;
            }
        L58:
            goto L93
        L59:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L93
            goto L83
        L62:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L6b
            goto L93
        L6b:
            mp.g r6 = mp.g.f15976d
            goto L85
        L6e:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L80
            goto L93
        L77:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L80
            goto L93
        L80:
            mp.g r6 = mp.g.f15977e
            goto L85
        L83:
            mp.g r6 = mp.g.f15978i
        L85:
            mp.h r0 = new mp.h
            ep.e0 r1 = ep.e0.WARN
            if (r2 != r1) goto L8c
            goto L8e
        L8c:
            if (r7 == 0) goto L8f
        L8e:
            r4 = 1
        L8f:
            r0.<init>(r6, r4)
            return r0
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.b.g(java.lang.Object, boolean):mp.h");
    }

    public final e0 h(Object obj) {
        String str;
        v vVar = this.f8504a;
        o0 o0Var = vVar.f8596a.f8604c;
        d(obj);
        o0Var.getClass();
        Object objC = c(obj, b0.f8519p);
        if (objC == null || (str = (String) CollectionsKt.L(a(objC, false))) == null) {
            return null;
        }
        e0 e0Var = vVar.f8596a.f8603b;
        if (e0Var != null) {
            return e0Var;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return e0.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return e0.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return e0.WARN;
        }
        return null;
    }

    public final Object i(Object annotation) {
        Object objI;
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        if (!this.f8504a.f8596a.f8605d) {
            if (CollectionsKt.E(b0.j, d(annotation)) || f(annotation, b0.f8509d)) {
                return annotation;
            }
            if (f(annotation, b0.f8510e)) {
                wo.b bVar = (wo.b) annotation;
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                vo.f fVarD = bq.e.d(bVar);
                Intrinsics.checkNotNull(fVarD);
                ConcurrentHashMap concurrentHashMap = this.f8505b;
                Object obj = concurrentHashMap.get(fVarD);
                if (obj != null) {
                    return obj;
                }
                Iterator it = e(annotation).iterator();
                do {
                    if (!it.hasNext()) {
                        objI = null;
                        break;
                    }
                    objI = i(it.next());
                } while (objI == null);
                if (objI != null) {
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(fVarD, objI);
                    return objPutIfAbsent == null ? objI : objPutIfAbsent;
                }
            }
        }
        return null;
    }
}
