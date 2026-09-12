package yo;

import com.facebook.react.devsupport.StackTraceHelper;
import lq.e1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kq.o oVar, vo.l lVar, wo.h hVar, up.e eVar, e1 e1Var, boolean z5, int i7, vo.o0 o0Var) {
        super(oVar, lVar, hVar, eVar, e1Var, z5, i7, o0Var);
        if (oVar == null) {
            v0(0);
            throw null;
        }
        if (lVar == null) {
            v0(1);
            throw null;
        }
        if (o0Var != null) {
        } else {
            v0(6);
            throw null;
        }
    }

    public static /* synthetic */ void v0(int i7) {
        Object[] objArr = new Object[3];
        switch (i7) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = StackTraceHelper.NAME_KEY;
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // yo.l, fq.a
    public final String toString() {
        String str = "";
        String str2 = this.f23434y ? "reified " : "";
        if (getVariance() != e1.INVARIANT) {
            str = getVariance() + " ";
        }
        return str2 + str + getName();
    }
}
