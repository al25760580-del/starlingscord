package np;

import java.util.Set;
import jq.s;
import kotlin.Pair;
import kotlin.collections.d1;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import vo.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f16992b = d1.b(op.a.CLASS);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f16993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rp.e f16994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final rp.e f16995e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hq.j f16996a;

    static {
        op.a[] elements = {op.a.FILE_FACADE, op.a.MULTIFILE_CLASS_PART};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f16993c = y.J(elements);
        new rp.e(1, 1, 2);
        f16994d = new rp.e(1, 1, 11);
        f16995e = new rp.e(1, 1, 13);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    public final s a(e0 descriptor, ap.b kotlinClass) {
        String[] strArr;
        Pair pairH;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        gs.o oVar = kotlinClass.f2857b;
        String[] strArr2 = (String[]) oVar.f10249e;
        if (strArr2 == null) {
            strArr2 = (String[]) oVar.f10250f;
        }
        if (strArr2 == null) {
            strArr2 = null;
        } else if (!f16993c.contains((op.a) oVar.f10247c)) {
            strArr2 = null;
        }
        if (strArr2 != null && (strArr = (String[]) kotlinClass.f2857b.f10251g) != null) {
            try {
                try {
                    pairH = tp.g.h(strArr2, strArr);
                } catch (vp.q e10) {
                    throw new IllegalStateException("Could not read data from " + kotlinClass.a(), e10);
                }
            } catch (Throwable th2) {
                c().f11021c.getClass();
                if (((rp.e) kotlinClass.f2857b.f10248d).b(e())) {
                    throw th2;
                }
                pairH = null;
            }
            if (pairH != null) {
                tp.f fVar = (tp.f) pairH.f14612d;
                pp.e0 e0Var = (pp.e0) pairH.f14613e;
                d(kotlinClass);
                f(kotlinClass);
                g gVar = new g(kotlinClass, e0Var, fVar, b(kotlinClass));
                return new s(descriptor, e0Var, fVar, (rp.e) kotlinClass.f2857b.f10248d, gVar, c(), "scope for " + gVar + " in " + descriptor, d.f16991d);
            }
        }
        return null;
    }

    public final jq.k b(ap.b bVar) {
        c().f11021c.getClass();
        int i7 = bVar.f2857b.f10246b;
        return ((i7 & 16) == 0 || (i7 & 32) != 0) ? jq.k.f14033d : jq.k.f14034e;
    }

    public final hq.j c() {
        hq.j jVar = this.f16996a;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("components");
        return null;
    }

    public final hq.o d(ap.b bVar) {
        c().f11021c.getClass();
        if (((rp.e) bVar.f2857b.f10248d).b(e())) {
            return null;
        }
        rp.e eVar = (rp.e) bVar.f2857b.f10248d;
        rp.e eVar2 = rp.e.f19536g;
        rp.e eVarE = e();
        rp.e eVarE2 = e();
        boolean z5 = eVar.f19538f;
        eVarE2.getClass();
        rp.e eVar3 = z5 ? eVar2 : rp.e.f19537h;
        int i7 = eVar3.f19507b;
        int i10 = eVarE2.f19507b;
        if (i7 > i10 || (i7 >= i10 && eVar3.f19508c > eVarE2.f19508c)) {
            eVarE2 = eVar3;
        }
        return new hq.o(eVar, eVar2, eVarE, eVarE2, bVar.a(), bp.c.a(bVar.f2856a));
    }

    public final rp.e e() {
        c().f11021c.getClass();
        return rp.e.f19536g;
    }

    public final boolean f(ap.b bVar) {
        c().f11021c.getClass();
        c().f11021c.getClass();
        gs.o oVar = bVar.f2857b;
        return (oVar.f10246b & 2) != 0 && Intrinsics.areEqual((rp.e) oVar.f10248d, f16994d);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    public final hq.e g(ap.b kotlinClass) {
        Pair pairF;
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        gs.o oVar = kotlinClass.f2857b;
        String[] strArr = (String[]) oVar.f10249e;
        if (strArr == null) {
            strArr = (String[]) oVar.f10250f;
        }
        if (strArr != null) {
            if (!f16992b.contains((op.a) oVar.f10247c)) {
                strArr = null;
            }
        } else {
            strArr = null;
        }
        if (strArr != null) {
            String[] strArr2 = (String[]) oVar.f10251g;
            try {
                if (strArr2 != null) {
                    try {
                        pairF = tp.g.f(strArr, strArr2);
                        if (pairF != null) {
                            tp.f fVar = (tp.f) pairF.f14612d;
                            pp.k kVar = (pp.k) pairF.f14613e;
                            d(kotlinClass);
                            f(kotlinClass);
                            return new hq.e(fVar, kVar, (rp.e) oVar.f10248d, new o(kotlinClass, b(kotlinClass)));
                        }
                    } catch (vp.q e10) {
                        throw new IllegalStateException("Could not read data from " + kotlinClass.a(), e10);
                    }
                }
            } catch (Throwable th2) {
                c().f11021c.getClass();
                if (((rp.e) oVar.f10248d).b(e())) {
                    throw th2;
                }
                pairF = null;
            }
        }
        return null;
    }
}
