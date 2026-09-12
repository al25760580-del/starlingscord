package yo;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import vo.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends i {
    public final o E;
    public final kq.m F;
    public final wo.h G;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final lq.l f23467y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(kq.o oVar, vo.f fVar, lq.d0 d0Var, up.e eVar, kq.m mVar, wo.h hVar, vo.n0 n0Var) {
        super(oVar, fVar, eVar, n0Var);
        if (oVar == null) {
            K(6);
            throw null;
        }
        if (fVar == null) {
            K(7);
            throw null;
        }
        if (d0Var == null) {
            K(8);
            throw null;
        }
        if (eVar == null) {
            K(9);
            throw null;
        }
        if (mVar == null) {
            K(10);
            throw null;
        }
        this.G = hVar;
        this.f23467y = new lq.l(this, Collections.EMPTY_LIST, Collections.singleton(d0Var), oVar);
        this.E = new o(this, oVar);
        this.F = mVar;
    }

    public static /* synthetic */ void K(int i7) {
        String str;
        int i10;
        switch (i7) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = StackTraceHelper.NAME_KEY;
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i7) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i7) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static p l0(kq.o oVar, vo.f fVar, up.e eVar, kq.i iVar, wo.h hVar, vo.n0 n0Var) {
        if (oVar == null) {
            K(0);
            throw null;
        }
        if (fVar == null) {
            K(1);
            throw null;
        }
        if (eVar == null) {
            K(2);
            throw null;
        }
        if (iVar != null) {
            return new p(oVar, fVar, fVar.j(), eVar, iVar, hVar, n0Var);
        }
        K(3);
        throw null;
    }

    @Override // yo.y
    public final eq.o B(mq.f fVar) {
        o oVar = this.E;
        if (oVar != null) {
            return oVar;
        }
        K(14);
        throw null;
    }

    @Override // vo.f
    public final h E() {
        return null;
    }

    @Override // vo.f
    public final eq.o F() {
        return eq.n.f8648b;
    }

    @Override // vo.f
    public final vo.f H() {
        return null;
    }

    @Override // vo.f
    public final vo.g c() {
        return vo.g.f21811v;
    }

    @Override // vo.f, vo.x
    public final vo.y e() {
        return vo.y.f21852e;
    }

    @Override // wo.a
    public final wo.h getAnnotations() {
        wo.h hVar = this.G;
        if (hVar != null) {
            return hVar;
        }
        K(21);
        throw null;
    }

    @Override // vo.f, vo.x, vo.o
    public final ep.p getVisibility() {
        ep.p pVar = vo.p.f21828e;
        if (pVar != null) {
            return pVar;
        }
        K(20);
        throw null;
    }

    @Override // vo.f
    public final boolean isInline() {
        return false;
    }

    @Override // vo.f
    public final boolean isValue() {
        return false;
    }

    @Override // vo.f
    public final s0 j0() {
        return null;
    }

    @Override // vo.f, vo.j
    public final List l() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        K(22);
        throw null;
    }

    @Override // vo.i
    public final lq.q0 n() {
        lq.l lVar = this.f23467y;
        if (lVar != null) {
            return lVar;
        }
        K(17);
        throw null;
    }

    @Override // vo.f
    public final boolean o() {
        return false;
    }

    @Override // vo.x
    public final boolean o0() {
        return false;
    }

    @Override // vo.f
    public final Collection p() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        K(16);
        throw null;
    }

    @Override // vo.f
    public final boolean s() {
        return false;
    }

    @Override // vo.f
    public final boolean s0() {
        return false;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // vo.f
    public final Collection w() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        K(23);
        throw null;
    }

    @Override // vo.x
    public final boolean y() {
        return false;
    }

    @Override // vo.j
    public final boolean z() {
        return false;
    }
}
