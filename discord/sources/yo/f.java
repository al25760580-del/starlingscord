package yo;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends lq.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vo.o0 f23429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f23430d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, kq.o oVar, vo.o0 o0Var) {
        super(oVar);
        if (oVar == null) {
            n(0);
            throw null;
        }
        this.f23430d = gVar;
        this.f23429c = o0Var;
    }

    public static /* synthetic */ void n(int i7) {
        String str = (i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5 || i7 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5 || i7 == 8) ? 2 : 3];
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = "type";
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i7 == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i7 == 2) {
            objArr[1] = "getParameters";
        } else if (i7 == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i7 == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i7 == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i7 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 1 && i7 != 2 && i7 != 3 && i7 != 4 && i7 != 5 && i7 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // lq.i
    public final Collection b() {
        List listD0 = this.f23430d.D0();
        if (listD0 != null) {
            return listD0;
        }
        n(1);
        throw null;
    }

    @Override // lq.i
    public final lq.z c() {
        return nq.l.c(nq.k.CYCLIC_UPPER_BOUNDS, new String[0]);
    }

    @Override // lq.i
    public final vo.o0 e() {
        vo.o0 o0Var = this.f23429c;
        if (o0Var != null) {
            return o0Var;
        }
        n(5);
        throw null;
    }

    @Override // lq.q0
    public final so.i f() {
        so.i iVarE = bq.e.e(this.f23430d);
        if (iVarE != null) {
            return iVarE;
        }
        n(4);
        throw null;
    }

    @Override // lq.q0
    public final vo.i g() {
        g gVar = this.f23430d;
        if (gVar != null) {
            return gVar;
        }
        n(3);
        throw null;
    }

    @Override // lq.q0
    public final List getParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        n(2);
        throw null;
    }

    @Override // lq.q0
    public final boolean i() {
        return true;
    }

    @Override // lq.i
    public final boolean k(vo.i iVar) {
        if (!(iVar instanceof vo.r0)) {
            return false;
        }
        vo.r0 b10 = (vo.r0) iVar;
        g a10 = this.f23430d;
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return xp.c.f22998a.d(a10, b10, true, xp.a.f22995d);
    }

    @Override // lq.i
    public final List l(List list) {
        if (list == null) {
            n(7);
            throw null;
        }
        List listB0 = this.f23430d.B0(list);
        if (listB0 != null) {
            return listB0;
        }
        n(8);
        throw null;
    }

    @Override // lq.i
    public final void m(lq.z zVar) {
        if (zVar != null) {
            this.f23430d.C0(zVar);
        } else {
            n(6);
            throw null;
        }
    }

    public final String toString() {
        return this.f23430d.getName().f21269d;
    }
}
