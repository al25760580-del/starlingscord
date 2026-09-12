package yo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lq.b1;
import lq.e1;
import lq.w0;
import lq.y0;
import vo.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f23488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0 f23489e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y0 f23490i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f23491v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f23492w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public lq.l f23493x;

    public x(y yVar, y0 y0Var) {
        this.f23488d = yVar;
        this.f23489e = y0Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    public static /* synthetic */ void K(int i7) {
        String str = (i7 == 2 || i7 == 3 || i7 == 5 || i7 == 6 || i7 == 8 || i7 == 10 || i7 == 13 || i7 == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i7 == 2 || i7 == 3 || i7 == 5 || i7 == 6 || i7 == 8 || i7 == 10 || i7 == 13 || i7 == 23) ? 3 : 2];
        if (i7 == 2) {
            objArr[0] = "typeArguments";
        } else if (i7 == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i7 == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i7 == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i7 == 8) {
            objArr[0] = "typeArguments";
        } else if (i7 == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i7 == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i7 != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i7) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case 12:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case 18:
                objArr[1] = "getConstructors";
                break;
            case 19:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case 21:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case 26:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case 28:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 29:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i7 == 2 || i7 == 3 || i7 == 5 || i7 == 6 || i7 == 8 || i7 == 10) {
            objArr[2] = "getMemberScope";
        } else if (i7 == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i7 == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 2 && i7 != 3 && i7 != 5 && i7 != 6 && i7 != 8 && i7 != 10 && i7 != 13 && i7 != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    @Override // yo.y
    public final eq.o B(mq.f fVar) {
        eq.o oVarB = this.f23488d.B(fVar);
        if (!this.f23489e.f15268a.f()) {
            return new eq.t(oVarB, e0());
        }
        if (oVarB != null) {
            return oVarB;
        }
        K(14);
        throw null;
    }

    @Override // vo.f
    public final h E() {
        return this.f23488d.E();
    }

    @Override // vo.f
    public final eq.o F() {
        eq.o oVarF = this.f23488d.F();
        if (oVarF != null) {
            return oVarF;
        }
        K(15);
        throw null;
    }

    @Override // vo.f
    public final vo.f H() {
        return this.f23488d.H();
    }

    @Override // yo.y, vo.f, vo.l
    public final vo.f a() {
        vo.f fVarA = this.f23488d.a();
        if (fVarA != null) {
            return fVarA;
        }
        K(21);
        throw null;
    }

    @Override // vo.p0
    public final vo.m b(y0 y0Var) {
        if (y0Var != null) {
            return y0Var.f15268a.f() ? this : new x(this, y0.f(y0Var.g(), e0().g()));
        }
        K(23);
        throw null;
    }

    @Override // vo.f
    public final vo.g c() {
        vo.g gVarC = this.f23488d.c();
        if (gVarC != null) {
            return gVarC;
        }
        K(25);
        throw null;
    }

    @Override // vo.m
    public final vo.n0 d() {
        return vo.n0.C;
    }

    @Override // vo.f, vo.x
    public final vo.y e() {
        vo.y yVarE = this.f23488d.e();
        if (yVarE != null) {
            return yVarE;
        }
        K(26);
        throw null;
    }

    public final y0 e0() {
        if (this.f23490i == null) {
            y0 y0Var = this.f23489e;
            if (y0Var.f15268a.f()) {
                this.f23490i = y0Var;
            } else {
                List parameters = this.f23488d.n().getParameters();
                this.f23491v = new ArrayList(parameters.size());
                this.f23490i = lq.c.A(parameters, y0Var.g(), this, this.f23491v);
                this.f23492w = CollectionsKt.H(this.f23491v, new w());
            }
        }
        return this.f23490i;
    }

    @Override // vo.l
    public final vo.l g() {
        vo.l lVarG = this.f23488d.g();
        if (lVarG != null) {
            return lVarG;
        }
        K(22);
        throw null;
    }

    @Override // wo.a
    public final wo.h getAnnotations() {
        wo.h annotations = this.f23488d.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        K(19);
        throw null;
    }

    @Override // vo.l
    public final up.e getName() {
        up.e name = this.f23488d.getName();
        if (name != null) {
            return name;
        }
        K(20);
        throw null;
    }

    @Override // vo.f, vo.x, vo.o
    public final ep.p getVisibility() {
        ep.p visibility = this.f23488d.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        K(27);
        throw null;
    }

    @Override // vo.f
    public final eq.o h0() {
        eq.o oVarH0 = this.f23488d.h0();
        if (oVarH0 != null) {
            return oVarH0;
        }
        K(28);
        throw null;
    }

    @Override // yo.y
    public final eq.o i(w0 w0Var, mq.f fVar) {
        eq.o oVarI = this.f23488d.i(w0Var, fVar);
        if (!this.f23489e.f15268a.f()) {
            return new eq.t(oVarI, e0());
        }
        if (oVarI != null) {
            return oVarI;
        }
        K(7);
        throw null;
    }

    @Override // vo.l
    public final Object i0(vo.n nVar, Object obj) {
        return ((ph.c) nVar).n(this, (StringBuilder) obj);
    }

    @Override // vo.x
    public final boolean isExternal() {
        return this.f23488d.isExternal();
    }

    @Override // vo.f
    public final boolean isInline() {
        return this.f23488d.isInline();
    }

    @Override // vo.f
    public final boolean isValue() {
        return this.f23488d.isValue();
    }

    @Override // vo.f, vo.i
    public final lq.d0 j() {
        lq.l0 l0VarA;
        List listD = b1.d(n().getParameters());
        wo.h annotations = getAnnotations();
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (annotations.isEmpty()) {
            lq.l0.f15225e.getClass();
            l0VarA = lq.l0.f15226i;
        } else {
            e4.r rVar = lq.l0.f15225e;
            List listC = kotlin.collections.c0.c(new lq.j(annotations));
            rVar.getClass();
            l0VarA = e4.r.A(listC);
        }
        return lq.c.v(n0(), listD, l0VarA, n(), false);
    }

    @Override // vo.f
    public final s0 j0() {
        s0 s0VarJ0 = this.f23488d.j0();
        if (s0VarJ0 == null) {
            return null;
        }
        bp.i transform = new bp.i(24, this);
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (s0VarJ0 instanceof vo.v) {
            vo.v vVar = (vo.v) s0VarJ0;
            return new vo.v(vVar.f21845a, (pq.e) transform.invoke(vVar.f21846b));
        }
        if (!(s0VarJ0 instanceof vo.a0)) {
            throw new rn.n();
        }
        ArrayList<Pair> arrayList = ((vo.a0) s0VarJ0).f21786a;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.l(arrayList, 10));
        for (Pair pair : arrayList) {
            arrayList2.add(new Pair((up.e) pair.f14612d, transform.invoke((pq.e) pair.f14613e)));
        }
        return new vo.a0(arrayList2);
    }

    @Override // vo.f, vo.j
    public final List l() {
        e0();
        ArrayList arrayList = this.f23492w;
        if (arrayList != null) {
            return arrayList;
        }
        K(30);
        throw null;
    }

    @Override // vo.i
    public final lq.q0 n() {
        lq.q0 q0VarN = this.f23488d.n();
        if (this.f23489e.f15268a.f()) {
            if (q0VarN != null) {
                return q0VarN;
            }
            K(0);
            throw null;
        }
        if (this.f23493x == null) {
            y0 y0VarE0 = e0();
            Collection collectionH = q0VarN.h();
            ArrayList arrayList = new ArrayList(collectionH.size());
            Iterator it = collectionH.iterator();
            while (it.hasNext()) {
                arrayList.add(y0VarE0.j((lq.z) it.next(), e1.INVARIANT));
            }
            this.f23493x = new lq.l(this, this.f23491v, arrayList, kq.l.f14788e);
        }
        lq.l lVar = this.f23493x;
        if (lVar != null) {
            return lVar;
        }
        K(1);
        throw null;
    }

    @Override // vo.f
    public final eq.o n0() {
        bq.e.i(xp.e.d(this.f23488d));
        return B(mq.f.f16018a);
    }

    @Override // vo.f
    public final boolean o() {
        return this.f23488d.o();
    }

    @Override // vo.x
    public final boolean o0() {
        return this.f23488d.o0();
    }

    @Override // vo.f
    public final Collection p() {
        Collection<h> collectionP = this.f23488d.p();
        ArrayList arrayList = new ArrayList(collectionP.size());
        for (h hVar : collectionP) {
            h hVar2 = hVar;
            hVar2.getClass();
            r rVarH0 = hVar2.H0(y0.f15267b);
            rVarH0.f23473w = hVar.A0();
            rVarH0.p(hVar2.e());
            rVarH0.e(hVar2.getVisibility());
            rVarH0.A(hVar2.c());
            rVarH0.J = false;
            arrayList.add(((h) rVarH0.U.E0(rVarH0)).b(e0()));
        }
        return arrayList;
    }

    @Override // vo.f
    public final List p0() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        K(17);
        throw null;
    }

    @Override // vo.f
    public final boolean s() {
        return this.f23488d.s();
    }

    @Override // vo.f
    public final boolean s0() {
        return this.f23488d.s0();
    }

    @Override // vo.f
    public final t u0() {
        throw new UnsupportedOperationException();
    }

    @Override // vo.f
    public final Collection w() {
        Collection collectionW = this.f23488d.w();
        if (collectionW != null) {
            return collectionW;
        }
        K(31);
        throw null;
    }

    @Override // vo.f
    public final eq.o x(w0 w0Var) {
        bq.e.i(xp.e.d(this));
        return i(w0Var, mq.f.f16018a);
    }

    @Override // vo.x
    public final boolean y() {
        return this.f23488d.y();
    }

    @Override // vo.j
    public final boolean z() {
        return this.f23488d.z();
    }
}
