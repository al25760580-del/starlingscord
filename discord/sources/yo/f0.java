package yo;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import lq.y0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f0 extends m implements vo.k0 {
    public final vo.y E;
    public final vo.l0 F;
    public final boolean G;
    public final vo.c H;
    public ep.p I;
    public vo.u J;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f23431x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f23432y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(vo.y yVar, ep.p pVar, vo.l0 l0Var, wo.h hVar, up.e eVar, boolean z5, boolean z6, boolean z7, vo.c cVar, vo.n0 n0Var) {
        super(l0Var.g(), hVar, eVar, n0Var);
        if (yVar == null) {
            v0(0);
            throw null;
        }
        if (pVar == null) {
            v0(1);
            throw null;
        }
        if (l0Var == null) {
            v0(2);
            throw null;
        }
        if (hVar == null) {
            v0(3);
            throw null;
        }
        if (n0Var == null) {
            v0(5);
            throw null;
        }
        this.J = null;
        this.E = yVar;
        this.I = pVar;
        this.F = l0Var;
        this.f23431x = z5;
        this.f23432y = z6;
        this.G = z7;
        this.H = cVar;
    }

    public static /* synthetic */ void v0(int i7) {
        String str;
        int i10;
        switch (i7) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i10 = 2;
                break;
            case 7:
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = StackTraceHelper.NAME_KEY;
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i7) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i7) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public final vo.l0 B0() {
        vo.l0 l0Var = this.F;
        if (l0Var != null) {
            return l0Var;
        }
        v0(13);
        throw null;
    }

    @Override // vo.u
    public final boolean C() {
        return false;
    }

    public final ArrayList C0(boolean z5) {
        ArrayList arrayList = new ArrayList(0);
        for (vo.l0 l0Var : B0().h()) {
            vo.l getter = z5 ? l0Var.getGetter() : l0Var.getSetter();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    @Override // vo.u
    public final vo.u Q() {
        return this.J;
    }

    @Override // vo.b
    public final Object R(vo.a aVar) {
        return null;
    }

    @Override // vo.b
    public final t S() {
        return B0().S();
    }

    @Override // vo.b
    public final t V() {
        return B0().V();
    }

    @Override // vo.b
    public final List Z() {
        List listZ = B0().Z();
        if (listZ != null) {
            return listZ;
        }
        v0(14);
        throw null;
    }

    @Override // vo.u, vo.p0
    public final vo.u b(y0 y0Var) {
        if (y0Var != null) {
            return this;
        }
        v0(7);
        throw null;
    }

    @Override // vo.d
    public final vo.c c() {
        vo.c cVar = this.H;
        if (cVar != null) {
            return cVar;
        }
        v0(6);
        throw null;
    }

    @Override // vo.d
    public final vo.d d0(vo.f fVar, vo.y yVar, ep.p pVar) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // vo.x
    public final vo.y e() {
        vo.y yVar = this.E;
        if (yVar != null) {
            return yVar;
        }
        v0(10);
        throw null;
    }

    @Override // vo.u
    public final boolean f0() {
        return false;
    }

    @Override // vo.d
    public final void g0(Collection collection) {
        if (collection != null) {
            return;
        }
        v0(16);
        throw null;
    }

    @Override // vo.b
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        v0(9);
        throw null;
    }

    @Override // vo.o
    public final ep.p getVisibility() {
        ep.p pVar = this.I;
        if (pVar != null) {
            return pVar;
        }
        v0(11);
        throw null;
    }

    @Override // vo.x
    public final boolean isExternal() {
        return this.f23432y;
    }

    @Override // vo.u
    public final boolean isInfix() {
        return false;
    }

    @Override // vo.u
    public final boolean isInline() {
        return this.G;
    }

    @Override // vo.u
    public final boolean isOperator() {
        return false;
    }

    @Override // vo.u
    public final boolean isSuspend() {
        return false;
    }

    @Override // vo.u
    public final boolean k0() {
        return false;
    }

    @Override // vo.x
    public final boolean o0() {
        return false;
    }

    @Override // vo.b
    public final boolean v() {
        return false;
    }

    @Override // vo.x
    public final boolean y() {
        return false;
    }

    @Override // vo.p0
    public final /* bridge */ /* synthetic */ vo.m b(y0 y0Var) {
        b(y0Var);
        return this;
    }
}
