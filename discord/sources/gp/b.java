package gp;

import java.util.ArrayList;
import kotlin.Pair;
import lq.z;
import vo.l;
import vo.n0;
import vo.u;
import yo.h;
import yo.s;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements a {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Boolean f10166c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Boolean f10167d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(vo.f fVar, b bVar, wo.h hVar, boolean z5, vo.c cVar, n0 n0Var) {
        super(fVar, bVar, hVar, z5, cVar, n0Var);
        if (fVar == null) {
            v0(0);
            throw null;
        }
        if (hVar == null) {
            v0(1);
            throw null;
        }
        if (cVar == null) {
            v0(2);
            throw null;
        }
        if (n0Var == null) {
            v0(3);
            throw null;
        }
        this.f10166c0 = null;
        this.f10167d0 = null;
    }

    public static b S0(vo.f fVar, wo.h hVar, boolean z5, ap.f fVar2) {
        if (fVar != null) {
            return new b(fVar, null, hVar, z5, vo.c.f21792d, fVar2);
        }
        v0(4);
        throw null;
    }

    public static /* synthetic */ void v0(int i7) {
        String str = (i7 == 11 || i7 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 11 || i7 == 18) ? 2 : 3];
        switch (i7) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i7 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i7 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i7) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 11 && i7 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // gp.a
    public final a D(z zVar, ArrayList arrayList, z zVar2, Pair pair) {
        if (zVar2 == null) {
            v0(17);
            throw null;
        }
        b bVarT0 = T0(g(), null, c(), getAnnotations(), d());
        bVarT0.G0(zVar != null ? mf.f.n(bVarT0, zVar, wo.g.f22379a) : null, this.H, kotlin.collections.n0.f14659d, getTypeParameters(), yk.a.g(arrayList, L(), bVarT0), zVar2, e(), getVisibility());
        if (pair != null) {
            bVarT0.I0((vo.a) pair.f14612d, pair.f14613e);
        }
        return bVarT0;
    }

    @Override // yo.h, yo.s
    public final /* bridge */ /* synthetic */ s D0(up.e eVar, vo.c cVar, l lVar, u uVar, n0 n0Var, wo.h hVar) {
        return T0(lVar, uVar, cVar, hVar, n0Var);
    }

    @Override // yo.s
    public final void J0(boolean z5) {
        this.f10166c0 = Boolean.valueOf(z5);
    }

    @Override // yo.s
    public final void K0(boolean z5) {
        this.f10167d0 = Boolean.valueOf(z5);
    }

    @Override // yo.h
    /* JADX INFO: renamed from: M0 */
    public final /* bridge */ /* synthetic */ h D0(up.e eVar, vo.c cVar, l lVar, u uVar, n0 n0Var, wo.h hVar) {
        return T0(lVar, uVar, cVar, hVar, n0Var);
    }

    public final b T0(l lVar, u uVar, vo.c cVar, wo.h hVar, n0 n0Var) {
        if (lVar == null) {
            v0(7);
            throw null;
        }
        if (cVar == null) {
            v0(8);
            throw null;
        }
        if (hVar == null) {
            v0(9);
            throw null;
        }
        if (n0Var == null) {
            v0(10);
            throw null;
        }
        if (cVar != vo.c.f21792d && cVar != vo.c.f21795v) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + lVar + "\nkind: " + cVar);
        }
        b bVar = new b((vo.f) lVar, (b) uVar, hVar, this.f23444b0, cVar, n0Var);
        Boolean bool = this.f10166c0;
        bool.getClass();
        bVar.f10166c0 = bool;
        Boolean bool2 = this.f10167d0;
        bool2.getClass();
        bVar.f10167d0 = bool2;
        return bVar;
    }

    @Override // yo.s, vo.b
    public final boolean v() {
        return this.f10167d0.booleanValue();
    }
}
