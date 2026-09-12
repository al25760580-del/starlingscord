package yo;

import com.facebook.react.devsupport.StackTraceHelper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m extends l implements vo.m {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final vo.l f23454v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vo.n0 f23455w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(vo.l lVar, wo.h hVar, up.e eVar, vo.n0 n0Var) {
        super(hVar, eVar);
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
        this.f23454v = lVar;
        this.f23455w = n0Var;
    }

    public static /* synthetic */ void v0(int i7) {
        String str = (i7 == 4 || i7 == 5 || i7 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 4 || i7 == 5 || i7 == 6) ? 2 : 3];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i7 == 4) {
            objArr[1] = "getOriginal";
        } else if (i7 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i7 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i7 != 4 && i7 != 5 && i7 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 4 && i7 != 5 && i7 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public vo.n0 d() {
        vo.n0 n0Var = this.f23455w;
        if (n0Var != null) {
            return n0Var;
        }
        v0(6);
        throw null;
    }

    public vo.l g() {
        vo.l lVar = this.f23454v;
        if (lVar != null) {
            return lVar;
        }
        v0(5);
        throw null;
    }

    @Override // yo.l, vo.l
    /* JADX INFO: renamed from: A0 */
    public vo.m a() {
        return this;
    }
}
