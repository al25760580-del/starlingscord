package yo;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.Collections;
import java.util.List;
import vo.u0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r0 extends m implements u0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public lq.z f23476x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(vo.l lVar, wo.h hVar, up.e eVar, lq.z zVar, vo.n0 n0Var) {
        super(lVar, hVar, eVar, n0Var);
        if (lVar == null) {
            v0(0);
            throw null;
        }
        if (hVar == null) {
            v0(1);
            throw null;
        }
        if (eVar == null) {
            v0(2);
            throw null;
        }
        if (n0Var == null) {
            v0(3);
            throw null;
        }
        this.f23476x = zVar;
    }

    public static /* synthetic */ void v0(int i7) {
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
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i7) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = StackTraceHelper.NAME_KEY;
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i7) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
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
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // vo.b
    public final List L() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        v0(6);
        throw null;
    }

    public t S() {
        return null;
    }

    public t V() {
        return null;
    }

    public lq.z getReturnType() {
        lq.z type = getType();
        if (type != null) {
            return type;
        }
        v0(10);
        throw null;
    }

    @Override // fq.a, fq.e
    public final lq.z getType() {
        lq.z zVar = this.f23476x;
        if (zVar != null) {
            return zVar;
        }
        v0(4);
        throw null;
    }

    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        v0(8);
        throw null;
    }

    public boolean v() {
        return false;
    }
}
