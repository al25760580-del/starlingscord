package mq;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import lq.d0;
import lq.d1;
import lq.i0;
import lq.p0;
import lq.q0;
import lq.t0;
import lq.z;
import vo.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f16035d = new m();

    public static /* synthetic */ void a(int i7) {
        Object[] objArr = new Object[3];
        switch (i7) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i7) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // mq.b
    public boolean A(pq.h hVar) {
        return e4.f.Q(hVar);
    }

    @Override // mq.b
    public boolean B(pq.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return e4.f.j(eVar) != null;
    }

    @Override // mq.b
    public d1 C(t0 t0Var) {
        return e4.f.F(this, t0Var);
    }

    @Override // mq.b
    public q0 D(pq.e eVar) {
        return e4.f.v0(eVar);
    }

    @Override // mq.b
    public void E(pq.e eVar, pq.h constructor) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
    }

    @Override // mq.b
    public boolean F(t0 t0Var) {
        return e4.f.b0(t0Var);
    }

    @Override // mq.b
    public boolean G(pq.h hVar) {
        return e4.f.P(hVar);
    }

    @Override // mq.b
    public boolean H(pq.e eVar, pq.e eVar2) {
        return e4.f.L(eVar, eVar2);
    }

    @Override // mq.b
    public Collection I(pq.e eVar) {
        return e4.f.q0(this, eVar);
    }

    @Override // mq.b
    public d0 J(z zVar) {
        return e4.f.m(zVar);
    }

    @Override // mq.b
    public a K(pq.e eVar) {
        return e4.f.t0(this, eVar);
    }

    @Override // mq.b
    public t0 L(pq.e eVar, int i7) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (i7 < 0 || i7 >= e4.f.g(eVar)) {
            return null;
        }
        return e4.f.y(eVar, i7);
    }

    @Override // mq.b
    public boolean M(pq.h hVar) {
        return e4.f.O(hVar);
    }

    @Override // mq.b
    public i0 N(pq.d dVar) {
        return e4.f.n(dVar);
    }

    @Override // mq.b
    public d0 O(pq.d dVar) {
        d0 d0VarH0;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        lq.s sVarL = e4.f.l(dVar);
        if (sVarL != null && (d0VarH0 = e4.f.h0(sVarL)) != null) {
            return d0VarH0;
        }
        d0 d0VarM = e4.f.m(dVar);
        Intrinsics.checkNotNull(d0VarM);
        return d0VarM;
    }

    @Override // mq.b
    public boolean P(pq.d receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        return receiver instanceof mp.f;
    }

    @Override // mq.b
    public q0 Q(pq.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        d0 d0VarM = e4.f.m(dVar);
        if (d0VarM == null) {
            d0VarM = O(dVar);
        }
        return e4.f.v0(d0VarM);
    }

    @Override // mq.b
    public pq.i R(t0 t0Var) {
        return e4.f.H(t0Var);
    }

    @Override // mq.b
    public void S(pq.e eVar) {
        e4.f.c0(eVar);
    }

    @Override // mq.b
    public d1 T(ArrayList types) {
        d0 d0Var;
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(types, "types");
        int size = types.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (d1) CollectionsKt.Y(types);
        }
        ArrayList arrayList = new ArrayList(e0.l(types, 10));
        Iterator it = types.iterator();
        boolean z5 = false;
        boolean z6 = false;
        while (it.hasNext()) {
            d1 d1Var = (d1) it.next();
            z5 = z5 || lq.c.j(d1Var);
            if (d1Var instanceof d0) {
                d0Var = (d0) d1Var;
            } else {
                if (!(d1Var instanceof lq.s)) {
                    throw new rn.n();
                }
                Intrinsics.checkNotNullParameter(d1Var, "<this>");
                d0Var = ((lq.s) d1Var).f15248e;
                z6 = true;
            }
            arrayList.add(d0Var);
        }
        if (z5) {
            return nq.l.c(nq.k.INTERSECTION_OF_ERROR_TYPES, types.toString());
        }
        u uVar = u.f16044a;
        if (!z6) {
            return uVar.b(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(e0.l(types, 10));
        Iterator it2 = types.iterator();
        while (it2.hasNext()) {
            arrayList2.add(lq.c.E((d1) it2.next()));
        }
        return lq.c.e(uVar.b(arrayList), uVar.b(arrayList2));
    }

    public pq.d U(pq.d dVar) {
        d0 d0VarY0;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        d0 d0VarM = e4.f.m(dVar);
        return (d0VarM == null || (d0VarY0 = e4.f.y0(d0VarM, true)) == null) ? dVar : d0VarY0;
    }

    @Override // mq.b
    public d0 V(pq.e eVar) {
        return e4.f.y0(eVar, true);
    }

    @Override // mq.b
    public r0 W(pq.h hVar, int i7) {
        return e4.f.D(hVar, i7);
    }

    @Override // mq.b
    public d0 X(pq.e eVar) {
        return e4.f.y0(eVar, false);
    }

    @Override // mq.b
    public boolean Y(pq.d dVar) {
        return e4.f.W(dVar);
    }

    @Override // mq.b
    public void Z(pq.e eVar) {
        e4.f.d0(eVar);
    }

    @Override // mq.b
    public boolean a0(pq.h hVar) {
        return e4.f.V(hVar);
    }

    @Override // mq.b
    public d0 b(lq.s sVar) {
        return e4.f.h0(sVar);
    }

    @Override // mq.b
    public pq.d b0(pq.d dVar) {
        return e4.f.z0(this, dVar);
    }

    @Override // mq.b
    public boolean c(pq.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return e4.f.U(e4.f.v0(eVar));
    }

    @Override // mq.b
    public pq.c c0(d0 d0Var) {
        return e4.f.i(this, d0Var);
    }

    @Override // mq.b
    public boolean d(pq.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        d0 d0VarM = e4.f.m(dVar);
        return (d0VarM != null ? e4.f.j(d0VarM) : null) != null;
    }

    @Override // mq.b
    public d1 d0(pq.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return e4.f.j0(dVar);
    }

    @Override // mq.b
    public d0 e(pq.d dVar) {
        return e4.f.m(dVar);
    }

    @Override // mq.b
    public d1 e0(pq.c cVar) {
        return e4.f.i0(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mq.b
    public t0 f(pq.g gVar, int i7) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (gVar instanceof pq.f) {
            return e4.f.y((pq.d) gVar, i7);
        }
        if (gVar instanceof pq.a) {
            E e10 = ((pq.a) gVar).get(i7);
            Intrinsics.checkNotNullExpressionValue(e10, "get(...)");
            return (t0) e10;
        }
        throw new IllegalStateException(("unknown type argument list type: " + gVar + ", " + Reflection.getOrCreateKotlinClass(gVar.getClass())).toString());
    }

    @Override // mq.b
    public pq.g f0(pq.e eVar) {
        return e4.f.h(eVar);
    }

    @Override // mq.b
    public i g(pq.c cVar) {
        return e4.f.w0(cVar);
    }

    @Override // mq.b
    public pq.c g0(pq.e eVar) {
        pq.f fVarO0;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        lq.o oVarJ = e4.f.j(eVar);
        if (oVarJ == null || (fVarO0 = e4.f.o0(oVarJ)) == null) {
            fVarO0 = (pq.f) eVar;
        }
        return e4.f.i(this, fVarO0);
    }

    @Override // mq.b
    public int h(pq.h hVar) {
        return e4.f.p0(hVar);
    }

    @Override // mq.b
    public int h0(pq.d dVar) {
        return e4.f.g(dVar);
    }

    @Override // mq.b
    public boolean i(pq.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return !Intrinsics.areEqual(e4.f.v0(O(dVar)), e4.f.v0(x(dVar)));
    }

    @Override // mq.b
    public d0 i0(pq.e eVar) {
        pq.b bVar = pq.b.f18511d;
        return e4.f.q(eVar);
    }

    @Override // mq.b
    public t0 j(yp.b bVar) {
        return e4.f.r0(bVar);
    }

    @Override // mq.b
    public boolean j0(pq.h hVar, pq.h hVar2) {
        return e4.f.f(hVar, hVar2);
    }

    @Override // mq.b
    public boolean k(pq.h hVar) {
        return e4.f.X(hVar);
    }

    @Override // mq.b
    public boolean k0(pq.h hVar) {
        return e4.f.R(hVar);
    }

    @Override // mq.b
    public boolean l(pq.h hVar) {
        return e4.f.U(hVar);
    }

    @Override // mq.b
    public Collection l0(pq.h hVar) {
        return e4.f.u0(hVar);
    }

    @Override // mq.b
    public pq.i m(r0 r0Var) {
        return e4.f.I(r0Var);
    }

    @Override // mq.b
    public d0 m0(lq.s sVar) {
        return e4.f.x0(sVar);
    }

    @Override // mq.b
    public boolean n(pq.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return e4.f.X(Q(eVar)) && !e4.f.Y(eVar);
    }

    @Override // mq.b
    public boolean n0(r0 r0Var, pq.h hVar) {
        return e4.f.K(r0Var, hVar);
    }

    @Override // mq.b
    public boolean o(pq.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        d0 d0VarM = e4.f.m(eVar);
        return (d0VarM != null ? g0(d0VarM) : null) != null;
    }

    @Override // mq.b
    public lq.s o0(pq.d dVar) {
        return e4.f.l(dVar);
    }

    @Override // mq.b
    public boolean p(pq.e eVar) {
        return e4.f.S(eVar);
    }

    @Override // mq.b
    public pq.b p0(pq.c cVar) {
        return e4.f.r(cVar);
    }

    @Override // mq.b
    public t0 q(pq.d dVar, int i7) {
        return e4.f.y(dVar, i7);
    }

    @Override // mq.b
    public d1 q0(pq.f fVar, pq.f fVar2) {
        return e4.f.u(this, fVar, fVar2);
    }

    @Override // mq.b
    public boolean r(pq.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return e4.f.P(e4.f.v0(eVar));
    }

    public p0 r0() {
        return com.facebook.imagepipeline.nativecode.c.n(false, this, 24);
    }

    @Override // mq.b
    public int s(pq.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        if (gVar instanceof pq.e) {
            return e4.f.g((pq.d) gVar);
        }
        if (gVar instanceof pq.a) {
            return ((pq.a) gVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + gVar + ", " + Reflection.getOrCreateKotlinClass(gVar.getClass())).toString());
    }

    @Override // mq.b
    public boolean t(d1 d1Var) {
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        return e4.f.W(O(d1Var)) != e4.f.W(x(d1Var));
    }

    @Override // mq.b
    public boolean u(pq.c receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        return receiver instanceof yp.a;
    }

    @Override // mq.b
    public void v(pq.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        lq.s sVarL = e4.f.l(dVar);
        if (sVarL != null) {
            e4.f.k(sVarL);
        }
    }

    @Override // mq.b
    public d0 w(lq.s sVar) {
        return e4.f.h0(sVar);
    }

    @Override // mq.b
    public d0 x(pq.d dVar) {
        d0 d0VarX0;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        lq.s sVarL = e4.f.l(dVar);
        if (sVarL != null && (d0VarX0 = e4.f.x0(sVarL)) != null) {
            return d0VarX0;
        }
        d0 d0VarM = e4.f.m(dVar);
        Intrinsics.checkNotNull(d0VarM);
        return d0VarM;
    }

    @Override // mq.b
    public d0 y(lq.s sVar) {
        return e4.f.x0(sVar);
    }

    @Override // mq.b
    public boolean z(pq.c cVar) {
        return e4.f.a0(cVar);
    }
}
