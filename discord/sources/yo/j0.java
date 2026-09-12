package yo;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends f0 implements vo.k0 {
    public q0 K;
    public final j0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(vo.l0 l0Var, wo.h hVar, vo.y yVar, ep.p pVar, boolean z5, boolean z6, boolean z7, vo.c cVar, j0 j0Var, vo.n0 n0Var) {
        super(yVar, pVar, l0Var, hVar, up.e.g("<set-" + l0Var.getName() + ">"), z5, z6, z7, cVar, n0Var);
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
        this.L = j0Var != null ? j0Var : this;
    }

    public static q0 D0(j0 j0Var, lq.z zVar, wo.h hVar) {
        if (zVar == null) {
            v0(8);
            throw null;
        }
        if (hVar != null) {
            return new q0(j0Var, null, 0, hVar, up.g.f21279g, zVar, false, false, false, null, vo.n0.C);
        }
        v0(9);
        throw null;
    }

    public static /* synthetic */ void v0(int i7) {
        String str;
        int i10;
        switch (i7) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case 10:
            case 11:
            case 12:
            case 13:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i7) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i7) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // yo.m, yo.l, vo.l
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public final j0 a() {
        j0 j0Var = this.L;
        if (j0Var != null) {
            return j0Var;
        }
        v0(13);
        throw null;
    }

    @Override // vo.b
    public final List L() {
        q0 q0Var = this.K;
        if (q0Var == null) {
            throw new IllegalStateException();
        }
        List listSingletonList = Collections.singletonList(q0Var);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        v0(11);
        throw null;
    }

    @Override // vo.b
    public final lq.z getReturnType() {
        return bq.e.e(this).x();
    }

    @Override // vo.d, vo.b
    public final Collection h() {
        return C0(false);
    }

    @Override // vo.l
    public final Object i0(vo.n nVar, Object obj) {
        return nVar.k(this, obj);
    }
}
