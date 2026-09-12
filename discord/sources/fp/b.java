package fp;

import ar.a0;
import bp.y;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import ep.w;
import hq.c0;
import ip.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import js.p;
import js.t;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import kotlin.text.x;
import kotlinx.serialization.KSerializer;
import lq.b0;
import lq.d0;
import lq.d1;
import lq.l0;
import lq.q0;
import lq.t0;
import lq.y0;
import lq.z;
import or.q;
import po.g0;
import po.i0;
import po.o1;
import po.p1;
import po.q1;
import po.y1;
import pp.s0;
import pp.v;
import rn.m;
import rn.n;
import uo.o;
import vo.u;
import yo.s;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f9330e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f9331i;

    public /* synthetic */ b(int i7, Object obj, Object obj2) {
        this.f9329d = i7;
        this.f9330e = obj;
        this.f9331i = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x03e7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        js.b bVar;
        Collection collectionE;
        ArrayList arrayList;
        String strD;
        KTypeProjection kTypeProjection;
        int i7 = this.f9329d;
        int i10 = 1;
        int i11 = 0;
        IOException iOException = null;
        iOException = null;
        Object obj = this.f9330e;
        Object obj2 = this.f9331i;
        switch (i7) {
            case 0:
                d0 d0VarJ = ((hp.a) ((e4.i) obj).f7980e).f10969o.f().j(((c) obj2).f9333a).j();
                Intrinsics.checkNotNullExpressionValue(d0VarJ, "getDefaultType(...)");
                return d0VarJ;
            case 1:
                e4.i iVar = (e4.i) obj;
                wo.h additionalAnnotations = ((vo.h) obj2).getAnnotations();
                Intrinsics.checkNotNullParameter(iVar, "<this>");
                Intrinsics.checkNotNullParameter(additionalAnnotations, "additionalAnnotations");
                return ((hp.a) iVar.f7980e).f10971q.b((w) iVar.f7982v.getValue(), additionalAnnotations);
            case 2:
                e4.i iVar2 = (e4.i) obj;
                wo.h additionalAnnotations2 = (wo.h) obj2;
                Intrinsics.checkNotNullParameter(iVar2, "<this>");
                Intrinsics.checkNotNullParameter(additionalAnnotations2, "additionalAnnotations");
                return ((hp.a) iVar2.f7980e).f10971q.b((w) iVar2.f7982v.getValue(), additionalAnnotations2);
            case 3:
                return new r(((hp.d) obj).f10985a, (y) obj2);
            case 4:
                bc.k kVar = ((c0) obj).f11001a;
                return ((hq.j) kVar.f3122e).f11023e.c((s0) obj2, (rp.f) kVar.f3123i);
            case 5:
                u4.c cVar = ((hp.a) ((e4.i) obj).f7980e).f10958b;
                up.c packageFqName = ((ip.w) obj2).f13390o.f23420x;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
                return null;
            case 6:
                jq.j jVar = (jq.j) obj;
                return CollectionsKt.i0(((hq.j) jVar.I.f3122e).f11023e.w(jVar.T, (v) obj2));
            case 7:
                p pVar = (p) obj2;
                t tVar = (t) obj;
                js.b bVar2 = js.b.INTERNAL_ERROR;
                try {
                    Intrinsics.checkNotNullParameter(this, "handler");
                    if (!tVar.c(true, this)) {
                        throw new IOException("Required SETTINGS preface not received");
                    }
                    while (tVar.c(false, this)) {
                    }
                    bVar = js.b.NO_ERROR;
                    try {
                        try {
                            pVar.c(bVar, js.b.CANCEL, null);
                        } catch (IOException e10) {
                            iOException = e10;
                            js.b bVar3 = js.b.PROTOCOL_ERROR;
                            pVar.c(bVar3, bVar3, iOException);
                        }
                        ds.b.c(tVar);
                        return Unit.f14616a;
                    } catch (Throwable th2) {
                        th = th2;
                        pVar.c(bVar, bVar2, iOException);
                        ds.b.c(tVar);
                        throw th;
                    }
                } catch (IOException e11) {
                    iOException = e11;
                    bVar = bVar2;
                } catch (Throwable th3) {
                    th = th3;
                    bVar = bVar2;
                    pVar.c(bVar, bVar2, iOException);
                    ds.b.c(tVar);
                    throw th;
                }
                break;
            case 8:
                return ((mq.f) obj).a((pq.d) ((b0) obj2).f15176i.invoke());
            case 9:
                mq.f fVar = (mq.f) obj2;
                Iterable iterable = (List) ((mq.i) obj).f16030e.getValue();
                if (iterable == null) {
                    iterable = n0.f14659d;
                }
                ArrayList arrayList2 = new ArrayList(e0.l(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((d1) it.next()).y0(fVar));
                }
                return arrayList2;
            case 10:
                return new or.k((KSerializer) ((Function1) ((q) obj).f17592e).invoke((KClass) obj2));
            case 11:
                i0 i0Var = (i0) obj;
                String name = (String) obj2;
                g0 g0Var = i0Var.f18097y;
                String signature = i0Var.E;
                g0Var.getClass();
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(signature, "signature");
                if (Intrinsics.areEqual(name, "<init>")) {
                    collectionE = CollectionsKt.i0(g0Var.d());
                    arrayList = new ArrayList();
                    for (Object obj3 : collectionE) {
                        vo.k kVar2 = (vo.k) obj3;
                        if (kVar2.q()) {
                            vo.j jVarG = kVar2.g();
                            Intrinsics.checkNotNullExpressionValue(jVarG, "getContainingDeclaration(...)");
                            if (xp.g.d(jVarG)) {
                                String strD2 = y1.c(kVar2).d();
                                if (!x.o(strD2, "constructor-impl", false) || !x.h(strD2, ")V", false)) {
                                    throw new IllegalArgumentException(("Invalid signature of " + kVar2 + ": " + strD2).toString());
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(StringsKt.O(strD2, "V"));
                                vo.j jVarG2 = kVar2.g();
                                Intrinsics.checkNotNullExpressionValue(jVarG2, "getContainingDeclaration(...)");
                                Intrinsics.checkNotNullParameter(jVarG2, "<this>");
                                up.b bVarF = bq.e.f(jVarG2);
                                Intrinsics.checkNotNull(bVarF);
                                sb2.append(tp.b.b(bVarF.b()));
                                strD = sb2.toString();
                            } else {
                                strD = y1.c(kVar2).d();
                            }
                        } else {
                            strD = y1.c(kVar2).d();
                        }
                        if (Intrinsics.areEqual(strD, signature)) {
                            arrayList.add(obj3);
                        }
                    }
                } else {
                    up.e eVarE = up.e.e(name);
                    Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
                    collectionE = g0Var.e(eVarE);
                    arrayList = new ArrayList();
                    for (Object obj4 : collectionE) {
                        if (Intrinsics.areEqual(y1.c((u) obj4).d(), signature)) {
                            arrayList.add(obj4);
                        }
                    }
                }
                if (arrayList.size() == 1) {
                    return (u) CollectionsKt.Z(arrayList);
                }
                String strO = CollectionsKt.O(collectionE, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, po.b.G, 30);
                StringBuilder sbU = a3.e.u("Function '", name, "' (JVM signature: ", signature, ") not resolved in ");
                sbU.append(g0Var);
                sbU.append(':');
                sbU.append(strO.length() == 0 ? " no members found" : ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE.concat(strO));
                throw new a0(sbU.toString());
            case 12:
                q1 q1Var = (q1) obj;
                Function0 function0 = (Function0) obj2;
                List listL0 = q1Var.f18132d.l0();
                if (listL0.isEmpty()) {
                    return n0.f14659d;
                }
                Lazy lazyA = rn.l.a(m.f19486e, new o1(q1Var, i10));
                ArrayList arrayList3 = new ArrayList(e0.l(listL0, 10));
                for (Object obj5 : listL0) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        kotlin.collections.d0.k();
                        throw null;
                    }
                    t0 t0Var = (t0) obj5;
                    if (t0Var.c()) {
                        KTypeProjection.f14691c.getClass();
                        kTypeProjection = KTypeProjection.f14692d;
                    } else {
                        z zVarB = t0Var.b();
                        Intrinsics.checkNotNullExpressionValue(zVarB, "getType(...)");
                        q1 type = new q1(zVarB, function0 == null ? null : new p1(q1Var, i11, lazyA));
                        int iOrdinal = t0Var.a().ordinal();
                        if (iOrdinal == 0) {
                            KTypeProjection.f14691c.getClass();
                            Intrinsics.checkNotNullParameter(type, "type");
                            kTypeProjection = new KTypeProjection(mo.w.f15954d, type);
                        } else if (iOrdinal == 1) {
                            KTypeProjection.f14691c.getClass();
                            Intrinsics.checkNotNullParameter(type, "type");
                            kTypeProjection = new KTypeProjection(mo.w.f15955e, type);
                        } else {
                            if (iOrdinal != 2) {
                                throw new n();
                            }
                            KTypeProjection.f14691c.getClass();
                            Intrinsics.checkNotNullParameter(type, "type");
                            kTypeProjection = new KTypeProjection(mo.w.f15956i, type);
                        }
                    }
                    arrayList3.add(kTypeProjection);
                    i11 = i12;
                }
                return arrayList3;
            case 13:
                StringBuilder sb3 = new StringBuilder();
                sb3.append('@');
                sb3.append(((Class) obj).getCanonicalName());
                CollectionsKt.N(((Map) obj2).entrySet(), sb3, ", ", "(", ")", qo.e.f18955d, 48);
                return sb3.toString();
            case 14:
                kq.l storageManager = (kq.l) obj2;
                vo.z module = ((uo.g) obj).f21217a;
                uo.e eVar = uo.g.f21212c;
                Intrinsics.checkNotNullParameter(module, "module");
                List list = (List) io.sentry.config.a.H(((yo.v) module.O(uo.g.f21214e)).f23486x, yo.v.F[0]);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj6 : list) {
                    if (obj6 instanceof iq.c) {
                        arrayList4.add(obj6);
                    }
                }
                yo.j containingClass = new yo.j((iq.c) CollectionsKt.K(arrayList4), uo.g.f21215f, vo.y.f21855w, vo.g.f21809e, kotlin.collections.c0.c(module.f().e()), storageManager);
                Intrinsics.checkNotNullParameter(storageManager, "storageManager");
                Intrinsics.checkNotNullParameter(containingClass, "containingClass");
                containingClass.l0(new uo.a(storageManager, containingClass), p0.f14661d, null);
                return containingClass;
            case 15:
                uo.j jVar2 = (uo.j) obj;
                yo.z zVarL = jVar2.l();
                Intrinsics.checkNotNullExpressionValue(zVarL, "getBuiltInsModule(...)");
                return new o(zVarL, (kq.l) obj2, new ep.x(21, jVar2));
            case 16:
                o oVar = (o) obj;
                yo.z zVar = oVar.g().f21221a;
                uo.g.f21212c.getClass();
                return mo.c0.q(zVar, uo.g.f21216g, new com.google.firebase.messaging.r((kq.l) obj2, oVar.g().f21221a)).j();
            case 17:
                ip.j jVar3 = (ip.j) obj;
                i javaResolverCache = i.f9348b;
                Intrinsics.checkNotNullExpressionValue(javaResolverCache, "EMPTY");
                Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
                e4.i iVar3 = jVar3.G;
                hp.a aVar = (hp.a) iVar3.f7980e;
                Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
                hp.a components = new hp.a(aVar.f10957a, aVar.f10958b, aVar.f10959c, aVar.f10960d, aVar.f10961e, aVar.f10962f, aVar.f10964h, aVar.f10965i, aVar.j, aVar.k, aVar.f10966l, aVar.f10967m, aVar.f10968n, aVar.f10969o, aVar.f10970p, aVar.f10971q, aVar.f10972r, aVar.f10973s, aVar.f10974t, aVar.f10975u, aVar.f10976v, aVar.f10977w);
                Intrinsics.checkNotNullParameter(iVar3, "<this>");
                Intrinsics.checkNotNullParameter(components, "components");
                e4.i iVar4 = new e4.i(components, (hp.f) iVar3.f7981i, (Lazy) iVar3.f7982v);
                vo.l lVarG = jVar3.g();
                Intrinsics.checkNotNullExpressionValue(lVarG, "getContainingDeclaration(...)");
                return new ip.j(iVar4, lVarG, jVar3.E, (vo.f) obj2);
            case 18:
                l0.f15225e.getClass();
                l0 l0Var = l0.f15226i;
                q0 q0VarN = ((yo.g) obj2).n();
                List list2 = Collections.EMPTY_LIST;
                ep.x getScope = new ep.x(26, this);
                Intrinsics.checkNotNullParameter(getScope, "getScope");
                return lq.c.v(new eq.k(kq.l.f14788e, getScope), list2, l0Var, q0VarN, false);
            case 19:
                vq.g gVar = new vq.g();
                Iterator it2 = ((s) obj2).h().iterator();
                while (it2.hasNext()) {
                    gVar.add(((u) it2.next()).b((y0) obj));
                }
                return gVar;
            default:
                yo.n0 n0Var = (yo.n0) obj;
                yo.h hVar = (yo.h) obj2;
                kq.o oVar2 = n0Var.f23460b0;
                vo.q0 q0Var = n0Var.f23461c0;
                wo.h annotations = hVar.getAnnotations();
                yo.h hVar2 = hVar;
                vo.c cVarC = hVar2.c();
                Intrinsics.checkNotNullExpressionValue(cVarC, "getKind(...)");
                vo.q0 q0Var2 = n0Var.f23461c0;
                vo.n0 n0VarD = ((yo.m) q0Var2).d();
                Intrinsics.checkNotNullExpressionValue(n0VarD, "getSource(...)");
                yo.n0 n0Var2 = new yo.n0(oVar2, q0Var, hVar, n0Var, annotations, cVarC, n0VarD);
                yo.n0.f23458e0.getClass();
                jq.v vVar = (jq.v) q0Var2;
                y0 y0VarD = vVar.B0() == null ? null : y0.d(vVar.C0());
                if (y0VarD == null) {
                    return null;
                }
                yo.t tVar2 = hVar2.H;
                yo.t tVarB = tVar2 != null ? tVar2.b(y0VarD) : null;
                List listZ = hVar2.Z();
                Intrinsics.checkNotNullExpressionValue(listZ, "getContextReceiverParameters(...)");
                ArrayList arrayList5 = new ArrayList(e0.l(listZ, 10));
                Iterator it3 = listZ.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(((yo.t) it3.next()).b(y0VarD));
                }
                yo.e eVar2 = (yo.e) q0Var2;
                List listL = eVar2.l();
                List listL2 = n0Var.L();
                z zVar2 = n0Var.E;
                Intrinsics.checkNotNull(zVar2);
                n0Var2.G0(null, tVarB, arrayList5, listL, listL2, zVar2, vo.y.f21852e, eVar2.f23427y);
                return n0Var2;
        }
    }

    public /* synthetic */ b(yo.m mVar, Object obj, int i7) {
        this.f9329d = i7;
        this.f9331i = mVar;
        this.f9330e = obj;
    }

    public b(p this$0, t reader) {
        this.f9329d = 7;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f9331i = this$0;
        this.f9330e = reader;
    }
}
