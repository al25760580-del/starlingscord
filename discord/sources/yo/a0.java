package yo;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import vo.s0;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends i {
    public vo.y E;
    public ep.p F;
    public lq.l G;
    public ArrayList H;
    public final ArrayList I;
    public final kq.o J;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vo.g f23415y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(uo.m mVar, up.e eVar, kq.o oVar) {
        super(oVar, mVar, eVar, vo.n0.C);
        vo.g gVar = vo.g.f21809e;
        if (eVar == null) {
            K(2);
            throw null;
        }
        if (oVar == null) {
            K(4);
            throw null;
        }
        this.I = new ArrayList();
        this.J = oVar;
        this.f23415y = gVar;
    }

    public static /* synthetic */ void K(int i7) {
        String str;
        int i10;
        switch (i7) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i10 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = StackTraceHelper.NAME_KEY;
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i7) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i7) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // yo.y
    public final eq.o B(mq.f fVar) {
        return eq.n.f8648b;
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
        vo.g gVar = this.f23415y;
        if (gVar != null) {
            return gVar;
        }
        K(8);
        throw null;
    }

    @Override // vo.f, vo.x
    public final vo.y e() {
        vo.y yVar = this.E;
        if (yVar != null) {
            return yVar;
        }
        K(7);
        throw null;
    }

    @Override // wo.a
    public final wo.h getAnnotations() {
        return wo.g.f22379a;
    }

    @Override // vo.f, vo.x, vo.o
    public final ep.p getVisibility() {
        ep.p pVar = this.F;
        if (pVar != null) {
            return pVar;
        }
        K(10);
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
        ArrayList arrayList = this.H;
        if (arrayList != null) {
            return arrayList;
        }
        K(15);
        throw null;
    }

    @Override // vo.i
    public final lq.q0 n() {
        lq.l lVar = this.G;
        if (lVar != null) {
            return lVar;
        }
        K(11);
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
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        K(13);
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
        return l.z0(this);
    }

    @Override // vo.f
    public final Collection w() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        K(19);
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
