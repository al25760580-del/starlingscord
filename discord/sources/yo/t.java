package yo;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lq.e1;
import lq.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends l implements vo.j0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f23479v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vo.l f23480w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final fq.e f23481x;

    public t(vo.f fVar) {
        super(wo.g.f22379a, up.g.f21276d);
        this.f23480w = fVar;
        this.f23481x = new fq.d(fVar);
    }

    public static /* synthetic */ void A0(int i7) {
        String str;
        int i10;
        switch (i7) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i7) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 2:
                objArr[0] = StackTraceHelper.NAME_KEY;
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i7) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i7) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i7) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static /* synthetic */ void v0(int i7) {
        String str = (i7 == 1 || i7 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 1 || i7 == 2) ? 2 : 3];
        if (i7 == 1 || i7 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i7 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i7 == 1) {
            objArr[1] = "getValue";
        } else if (i7 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i7 != 1 && i7 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void w0(int i7) {
        String str = (i7 == 7 || i7 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 7 || i7 == 8) ? 2 : 3];
        switch (i7) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = StackTraceHelper.NAME_KEY;
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i7 == 7) {
            objArr[1] = "getValue";
        } else if (i7 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i7) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 7 && i7 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public final fq.e B0() {
        switch (this.f23479v) {
            case 0:
                fq.d dVar = (fq.d) this.f23481x;
                if (dVar != null) {
                    return dVar;
                }
                v0(1);
                throw null;
            default:
                fq.a aVar = (fq.a) this.f23481x;
                if (aVar != null) {
                    return aVar;
                }
                w0(7);
                throw null;
        }
    }

    @Override // vo.p0
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public final t b(y0 y0Var) {
        if (y0Var == null) {
            A0(3);
            throw null;
        }
        if (!y0Var.f15268a.f()) {
            lq.z zVarJ = g() instanceof vo.f ? y0Var.j(getType(), e1.OUT_VARIANCE) : y0Var.j(getType(), e1.INVARIANT);
            if (zVarJ == null) {
                return null;
            }
            if (zVarJ != getType()) {
                return new t(g(), new fq.f(zVarJ), getAnnotations());
            }
        }
        return this;
    }

    @Override // vo.b
    public final List L() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        A0(7);
        throw null;
    }

    @Override // vo.b
    public final t S() {
        return null;
    }

    @Override // vo.b
    public final t V() {
        return null;
    }

    @Override // yo.l, vo.l
    public final vo.b a() {
        return this;
    }

    @Override // vo.m
    public final vo.n0 d() {
        return vo.n0.C;
    }

    @Override // vo.l
    public final vo.l g() {
        switch (this.f23479v) {
            case 0:
                vo.f fVar = (vo.f) this.f23480w;
                if (fVar != null) {
                    return fVar;
                }
                v0(2);
                throw null;
            default:
                vo.l lVar = this.f23480w;
                if (lVar != null) {
                    return lVar;
                }
                w0(8);
                throw null;
        }
    }

    @Override // vo.b
    public final lq.z getReturnType() {
        return getType();
    }

    @Override // fq.a, fq.e
    public final lq.z getType() {
        lq.z type = B0().getType();
        if (type != null) {
            return type;
        }
        A0(6);
        throw null;
    }

    @Override // vo.b
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        A0(5);
        throw null;
    }

    @Override // vo.o
    public final ep.p getVisibility() {
        ep.p pVar = vo.p.f21829f;
        if (pVar != null) {
            return pVar;
        }
        A0(9);
        throw null;
    }

    @Override // vo.b
    public final Collection h() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        A0(8);
        throw null;
    }

    @Override // vo.l
    public final Object i0(vo.n nVar, Object obj) {
        StringBuilder builder = (StringBuilder) obj;
        Intrinsics.checkNotNullParameter(this, "descriptor");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.append(getName());
        return Unit.f14616a;
    }

    @Override // yo.l, fq.a
    public String toString() {
        switch (this.f23479v) {
            case 0:
                return "class " + ((vo.f) this.f23480w).getName() + "::this";
            default:
                return super.toString();
        }
    }

    @Override // vo.b
    public final boolean v() {
        return false;
    }

    @Override // yo.l, vo.l
    public final vo.l a() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(vo.l lVar, fq.a aVar, wo.h hVar) {
        this(lVar, aVar, hVar, up.g.f21276d);
        if (lVar == null) {
            w0(0);
            throw null;
        }
        if (hVar != null) {
        } else {
            w0(2);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(vo.l lVar, fq.a aVar, wo.h hVar, up.e eVar) {
        super(hVar, eVar);
        if (lVar == null) {
            w0(3);
            throw null;
        }
        if (hVar == null) {
            w0(5);
            throw null;
        }
        if (eVar != null) {
            this.f23480w = lVar;
            this.f23481x = aVar;
            return;
        }
        w0(6);
        throw null;
    }
}
