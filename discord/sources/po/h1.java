package po;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n1 f18095e;

    public /* synthetic */ h1(n1 n1Var, int i7) {
        this.f18094d = i7;
        this.f18095e = n1Var;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0192  */
    /* JADX WARN: Code duplicated, block: B:59:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:66:0x01db  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        yo.q qVar;
        boolean zP;
        Class<?> enclosingClass;
        int i7 = this.f18094d;
        int i10 = 2;
        n1 n1Var = this.f18095e;
        boolean z5 = true;
        switch (i7) {
            case 0:
                up.b bVar = y1.f18196a;
                vo.l0 l0VarE = n1Var.e();
                g0 g0Var = n1Var.f18115y;
                com.facebook.imagepipeline.nativecode.b bVarB = y1.b(l0VarE);
                if (bVarB instanceof n) {
                    n nVar = (n) bVarB;
                    pp.i0 i0Var = nVar.f18112g;
                    jq.t tVar = nVar.f18111f;
                    vp.g gVar = tp.g.f20880a;
                    tp.d dVarB = tp.g.b(i0Var, nVar.f18114i, nVar.j, true);
                    if (dVarB != null) {
                        if (tVar.c() != vo.c.f21793e) {
                            vo.l lVarG = tVar.g();
                            if (lVarG == null) {
                                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "companionObject", "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil", "isClassCompanionObjectWithBackingFieldsInOuter"));
                            }
                            if (xp.e.l(lVarG)) {
                                vo.l lVarG2 = lVarG.g();
                                if (xp.e.n(lVarG2, vo.g.f21808d) || xp.e.n(lVarG2, vo.g.f21810i)) {
                                    so.d dVar = so.d.f20333a;
                                    if (w3.q.r((vo.f) lVarG)) {
                                        if (xp.e.l(tVar.g())) {
                                            qVar = tVar.W;
                                            if (qVar == null && qVar.getAnnotations().P(ep.z.f8606a)) {
                                                zP = true;
                                            } else {
                                                zP = tVar.getAnnotations().P(ep.z.f8606a);
                                            }
                                            if (!zP) {
                                                z5 = false;
                                            }
                                        } else {
                                            z5 = false;
                                        }
                                    }
                                } else if (xp.e.l(tVar.g())) {
                                    z5 = false;
                                } else {
                                    qVar = tVar.W;
                                    if (qVar == null) {
                                        zP = tVar.getAnnotations().P(ep.z.f8606a);
                                    } else {
                                        zP = tVar.getAnnotations().P(ep.z.f8606a);
                                    }
                                    if (!zP) {
                                        z5 = false;
                                    }
                                }
                            } else if (xp.e.l(tVar.g())) {
                                z5 = false;
                            } else {
                                qVar = tVar.W;
                                if (qVar == null) {
                                    zP = tVar.getAnnotations().P(ep.z.f8606a);
                                } else {
                                    zP = tVar.getAnnotations().P(ep.z.f8606a);
                                }
                                if (!zP) {
                                    z5 = false;
                                }
                            }
                        } else {
                            z5 = false;
                        }
                        if (z5 || tp.g.d(i0Var)) {
                            enclosingClass = g0Var.getJClass().getEnclosingClass();
                        } else {
                            vo.l lVarG3 = tVar.g();
                            enclosingClass = lVarG3 instanceof vo.f ? a2.k((vo.f) lVarG3) : g0Var.getJClass();
                        }
                        if (enclosingClass != null) {
                            try {
                                return enclosingClass.getDeclaredField(dVarB.k);
                            } catch (NoSuchFieldException unused) {
                            }
                        }
                    }
                } else {
                    if (bVarB instanceof l) {
                        return ((l) bVarB).f18105f;
                    }
                    if (!(bVarB instanceof m) && !(bVarB instanceof o)) {
                        throw new rn.n();
                    }
                }
                return null;
            default:
                g0 g0Var2 = n1Var.f18115y;
                String name = n1Var.E;
                String signature = n1Var.F;
                g0Var2.getClass();
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(signature, "signature");
                kotlin.text.m match = g0.f18090d.c(signature);
                if (match != null) {
                    Intrinsics.checkNotNullParameter(match, "match");
                    String str = (String) ((kotlin.collections.a1) match.a()).get(1);
                    vo.l0 l0VarF = g0Var2.f(Integer.parseInt(str));
                    if (l0VarF != null) {
                        return l0VarF;
                    }
                    StringBuilder sbN = com.discord.chat.presentation.list.a.n("Local property #", str, " not found in ");
                    sbN.append(g0Var2.getJClass());
                    throw new ar.a0(sbN.toString());
                }
                up.e eVarE = up.e.e(name);
                Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
                Collection collectionI = g0Var2.i(eVarE);
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionI) {
                    if (Intrinsics.areEqual(y1.b((vo.l0) obj).e(), signature)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    StringBuilder sbU = a3.e.u("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
                    sbU.append(g0Var2);
                    throw new ar.a0(sbU.toString());
                }
                if (arrayList.size() == 1) {
                    return (vo.l0) CollectionsKt.Z(arrayList);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList) {
                    ep.p visibility = ((vo.l0) obj2).getVisibility();
                    Object arrayList2 = linkedHashMap.get(visibility);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(visibility, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                f comparator = new f(i10);
                Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
                Intrinsics.checkNotNullParameter(comparator, "comparator");
                TreeMap treeMap = new TreeMap(comparator);
                treeMap.putAll(linkedHashMap);
                Collection collectionValues = treeMap.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                List list = (List) CollectionsKt.P(collectionValues);
                if (list.size() == 1) {
                    Intrinsics.checkNotNull(list);
                    return (vo.l0) CollectionsKt.K(list);
                }
                up.e eVarE2 = up.e.e(name);
                Intrinsics.checkNotNullExpressionValue(eVarE2, "identifier(...)");
                String strO = CollectionsKt.O(g0Var2.i(eVarE2), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, b.F, 30);
                StringBuilder sbU2 = a3.e.u("Property '", name, "' (JVM signature: ", signature, ") not resolved in ");
                sbU2.append(g0Var2);
                sbU2.append(':');
                sbU2.append(strO.length() == 0 ? " no members found" : ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE.concat(strO));
                throw new ar.a0(sbU2.toString());
        }
    }
}
