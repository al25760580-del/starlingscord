package yo;

import com.facebook.react.devsupport.StackTraceHelper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i extends b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vo.l f23446w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vo.n0 f23447x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kq.o oVar, vo.l lVar, up.e eVar, vo.n0 n0Var) {
        super(oVar, eVar);
        if (oVar == null) {
            K(0);
            throw null;
        }
        if (lVar == null) {
            K(1);
            throw null;
        }
        if (eVar == null) {
            K(2);
            throw null;
        }
        this.f23446w = lVar;
        this.f23447x = n0Var;
    }

    public static /* synthetic */ void K(int i7) {
        String str = (i7 == 4 || i7 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 4 || i7 == 5) ? 2 : 3];
        if (i7 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i7 == 2) {
            objArr[0] = StackTraceHelper.NAME_KEY;
        } else if (i7 == 3) {
            objArr[0] = "source";
        } else if (i7 == 4 || i7 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i7 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i7 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i7 != 4 && i7 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 4 && i7 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // vo.m
    public final vo.n0 d() {
        vo.n0 n0Var = this.f23447x;
        if (n0Var != null) {
            return n0Var;
        }
        K(5);
        throw null;
    }

    @Override // vo.l
    public final vo.l g() {
        vo.l lVar = this.f23446w;
        if (lVar != null) {
            return lVar;
        }
        K(4);
        throw null;
    }

    public boolean isExternal() {
        return false;
    }
}
