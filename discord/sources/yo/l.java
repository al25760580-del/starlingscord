package yo;

import com.facebook.react.devsupport.StackTraceHelper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l extends fq.a implements vo.l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final up.e f23451i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(wo.h hVar, up.e eVar) {
        super(hVar);
        if (hVar == null) {
            v0(0);
            throw null;
        }
        if (eVar == null) {
            v0(1);
            throw null;
        }
        this.f23451i = eVar;
    }

    public static /* synthetic */ void v0(int i7) {
        String str = (i7 == 2 || i7 == 3 || i7 == 5 || i7 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 2 || i7 == 3 || i7 == 5 || i7 == 6) ? 2 : 3];
        switch (i7) {
            case 1:
                objArr[0] = StackTraceHelper.NAME_KEY;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i7 == 2) {
            objArr[1] = "getName";
        } else if (i7 == 3) {
            objArr[1] = "getOriginal";
        } else if (i7 == 5 || i7 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i7 != 2 && i7 != 3) {
            if (i7 == 4) {
                objArr[2] = "toString";
            } else if (i7 != 5 && i7 != 6) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i7 != 2 && i7 != 3 && i7 != 5 && i7 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static String z0(vo.l lVar) {
        try {
            String str = wp.f.f22424c.v(lVar) + "[" + lVar.getClass().getSimpleName() + "@" + Integer.toHexString(System.identityHashCode(lVar)) + "]";
            if (str != null) {
                return str;
            }
            v0(5);
            throw null;
        } catch (Throwable unused) {
            String str2 = lVar.getClass().getSimpleName() + " " + lVar.getName();
            if (str2 != null) {
                return str2;
            }
            v0(6);
            throw null;
        }
    }

    @Override // vo.l
    public final up.e getName() {
        up.e eVar = this.f23451i;
        if (eVar != null) {
            return eVar;
        }
        v0(2);
        throw null;
    }

    @Override // fq.a
    public String toString() {
        return z0(this);
    }

    public vo.l a() {
        return this;
    }
}
