package yo;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends f0 implements vo.k0 {
    public lq.z K;
    public final i0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(vo.l0 l0Var, wo.h hVar, vo.y yVar, ep.p pVar, boolean z5, boolean z6, boolean z7, vo.c cVar, i0 i0Var, vo.n0 n0Var) {
        super(yVar, pVar, l0Var, hVar, up.e.g("<get-" + l0Var.getName() + ">"), z5, z6, z7, cVar, n0Var);
        if (l0Var == null) {
            v0(0);
            throw null;
        }
        if (hVar == null) {
            v0(1);
            throw null;
        }
        if (yVar == null) {
            v0(2);
            throw null;
        }
        if (pVar == null) {
            v0(3);
            throw null;
        }
        if (cVar == null) {
            v0(4);
            throw null;
        }
        if (n0Var == null) {
            v0(5);
            throw null;
        }
        this.L = i0Var != null ? i0Var : this;
    }

    public static /* synthetic */ void v0(int i7) {
        String str = (i7 == 6 || i7 == 7 || i7 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 6 || i7 == 7 || i7 == 8) ? 2 : 3];
        switch (i7) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i7 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i7 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i7 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i7 != 6 && i7 != 7 && i7 != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 6 && i7 != 7 && i7 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // yo.m, yo.l, vo.l
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public final i0 a() {
        i0 i0Var = this.L;
        if (i0Var != null) {
            return i0Var;
        }
        v0(8);
        throw null;
    }

    public final void E0(lq.z zVar) {
        if (zVar == null) {
            zVar = B0().getType();
        }
        this.K = zVar;
    }

    @Override // vo.b
    public final List L() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        v0(7);
        throw null;
    }

    @Override // vo.b
    public final lq.z getReturnType() {
        return this.K;
    }

    @Override // vo.d, vo.b
    public final Collection h() {
        return C0(true);
    }

    @Override // vo.l
    public final Object i0(vo.n nVar, Object obj) {
        return nVar.c(this, obj);
    }
}
