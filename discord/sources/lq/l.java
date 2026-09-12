package lq;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yo.y f15222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f15223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Collection f15224e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yo.y yVar, List list, Collection collection, kq.o oVar) {
        super(oVar);
        if (list == null) {
            n(1);
            throw null;
        }
        if (collection == null) {
            n(2);
            throw null;
        }
        if (oVar == null) {
            n(3);
            throw null;
        }
        this.f15222c = yVar;
        this.f15223d = Collections.unmodifiableList(new ArrayList(list));
        this.f15224e = Collections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void n(int i7) {
        String str = (i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 4 || i7 == 5 || i7 == 6 || i7 == 7) ? 2 : 3];
        switch (i7) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i7 == 4) {
            objArr[1] = "getParameters";
        } else if (i7 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i7 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i7 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i7 != 4 && i7 != 5 && i7 != 6 && i7 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 4 && i7 != 5 && i7 != 6 && i7 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // lq.i
    public final Collection b() {
        Collection collection = this.f15224e;
        if (collection != null) {
            return collection;
        }
        n(6);
        throw null;
    }

    @Override // lq.i
    public final vo.o0 e() {
        return vo.o0.f21822i;
    }

    @Override // lq.q0
    public final List getParameters() {
        List list = this.f15223d;
        if (list != null) {
            return list;
        }
        n(4);
        throw null;
    }

    @Override // lq.q0
    public final boolean i() {
        return true;
    }

    @Override // lq.b
    /* JADX INFO: renamed from: o */
    public final vo.f g() {
        yo.y yVar = this.f15222c;
        if (yVar != null) {
            return yVar;
        }
        n(5);
        throw null;
    }

    public final String toString() {
        return xp.e.g(this.f15222c).f21265a;
    }
}
