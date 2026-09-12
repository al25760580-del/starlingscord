package ip;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import lq.e1;
import lq.t0;
import lq.z0;
import vo.n0;
import vo.r0;
import yo.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements gp.g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f13343h = {kk.b.p(f.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0), kk.b.p(f.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0), kk.b.p(f.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e4.i f13344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bp.d f13345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kq.h f13346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kq.i f13347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ap.f f13348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kq.i f13349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f13350g;

    public f(bp.d javaAnnotation, e4.i c8, boolean z5) {
        Intrinsics.checkNotNullParameter(c8, "c");
        Intrinsics.checkNotNullParameter(javaAnnotation, "javaAnnotation");
        this.f13344a = c8;
        this.f13345b = javaAnnotation;
        kq.o oVar = ((hp.a) c8.f7980e).f10957a;
        e eVar = new e(this, 0);
        kq.l lVar = (kq.l) oVar;
        lVar.getClass();
        this.f13346c = new kq.h(lVar, eVar);
        hp.a aVar = (hp.a) c8.f7980e;
        kq.o oVar2 = aVar.f10957a;
        e eVar2 = new e(this, 1);
        kq.l lVar2 = (kq.l) oVar2;
        lVar2.getClass();
        this.f13347d = new kq.i(lVar2, eVar2);
        this.f13348e = aVar.j.c(javaAnnotation);
        kq.o oVar3 = aVar.f10957a;
        e eVar3 = new e(this, 2);
        kq.l lVar3 = (kq.l) oVar3;
        lVar3.getClass();
        this.f13349f = new kq.i(lVar3, eVar3);
        this.f13350g = z5;
    }

    @Override // wo.b
    public final up.c a() {
        KProperty p3 = f13343h[0];
        kq.h hVar = this.f13346c;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(p3, "p");
        return (up.c) hVar.invoke();
    }

    @Override // wo.b
    public final Map b() {
        return (Map) io.sentry.config.a.H(this.f13349f, f13343h[2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zp.g c(lp.a aVar) {
        lp.d hVar;
        lq.z type;
        if (aVar instanceof bp.v) {
            return zp.h.b(((bp.v) aVar).f3371b, null);
        }
        if (aVar instanceof bp.t) {
            Enum r10 = ((bp.t) aVar).f3369b;
            Class<?> enclosingClass = r10.getClass();
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            Intrinsics.checkNotNull(enclosingClass);
            return new zp.i(bp.c.a(enclosingClass), up.e.e(r10.name()));
        }
        boolean z5 = aVar instanceof bp.g;
        e4.i iVar = this.f13344a;
        if (z5) {
            bp.g gVar = (bp.g) aVar;
            up.e eVar = gVar.f3349a;
            if (eVar == null) {
                eVar = ep.a0.f8489b;
            }
            Intrinsics.checkNotNull(eVar);
            ArrayList arrayListA = gVar.a();
            if (!lq.c.j((lq.d0) io.sentry.config.a.H(this.f13347d, f13343h[1]))) {
                vo.f fVarD = bq.e.d(this);
                Intrinsics.checkNotNull(fVarD);
                q0 q0VarS = ib.a.s(eVar, fVarD);
                if (q0VarS == null || (type = q0VarS.getType()) == null) {
                    so.i iVarF = ((hp.a) iVar.f7980e).f10969o.f();
                    e1 e1Var = e1.INVARIANT;
                    type = iVarF.h(nq.l.c(nq.k.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
                    Intrinsics.checkNotNullExpressionValue(type, "getArrayType(...)");
                }
                ArrayList value = new ArrayList(kotlin.collections.e0.l(arrayListA, 10));
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    zp.g gVarC = c((lp.a) it.next());
                    if (gVarC == null) {
                        gVarC = new zp.v(null);
                    }
                    value.add(gVarC);
                }
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(type, "type");
                return new zp.y(value, type);
            }
        } else {
            if (aVar instanceof bp.f) {
                f value2 = new f(new bp.d(((bp.f) aVar).f3352b), iVar, false);
                Intrinsics.checkNotNullParameter(value2, "value");
                return new zp.a((Object) value2);
            }
            if (aVar instanceof bp.p) {
                Class type2 = ((bp.p) aVar).f3365b;
                Intrinsics.checkNotNullParameter(type2, "type");
                if (type2.isPrimitive()) {
                    hVar = new bp.z(type2);
                } else if ((type2 instanceof GenericArrayType) || type2.isArray()) {
                    hVar = new bp.h(type2);
                } else {
                    hVar = type2 instanceof WildcardType ? new bp.e0((WildcardType) type2) : new bp.q(type2);
                }
                lq.z argumentType = ((e4.m) iVar.f7983w).M(hVar, xr.m.S(z0.f15271e, false, null, 7));
                Intrinsics.checkNotNullParameter(argumentType, "argumentType");
                if (!lq.c.j(argumentType)) {
                    lq.z zVarB = argumentType;
                    int i7 = 0;
                    while (so.i.z(zVarB)) {
                        zVarB = ((t0) CollectionsKt.Z(zVarB.l0())).b();
                        Intrinsics.checkNotNullExpressionValue(zVarB, "getType(...)");
                        i7++;
                    }
                    vo.i iVarG = zVarB.r0().g();
                    if (iVarG instanceof vo.f) {
                        up.b bVarF = bq.e.f(iVarG);
                        if (bVarF != null) {
                            return new zp.t(bVarF, i7);
                        }
                        zp.q value3 = new zp.q(argumentType);
                        Intrinsics.checkNotNullParameter(value3, "value");
                        return new zp.t(value3);
                    }
                    if (iVarG instanceof r0) {
                        up.c topLevelFqName = so.o.f20363a.g();
                        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
                        return new zp.t(new up.b(topLevelFqName.b(), topLevelFqName.f21262a.f()), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // wo.b
    public final n0 d() {
        return this.f13348e;
    }

    @Override // wo.b
    public final lq.z getType() {
        return (lq.d0) io.sentry.config.a.H(this.f13347d, f13343h[1]);
    }

    public final String toString() {
        return wp.f.f22422a.w(this, null);
    }
}
