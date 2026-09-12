package wo;

import java.util.Map;
import lq.d0;
import lq.z;
import vo.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f22364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f22365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f22366c;

    public c(d0 d0Var, Map map, n0 n0Var) {
        if (d0Var == null) {
            c(0);
            throw null;
        }
        if (map == null) {
            c(1);
            throw null;
        }
        this.f22364a = d0Var;
        this.f22365b = map;
        this.f22366c = n0Var;
    }

    public static /* synthetic */ void c(int i7) {
        String str = (i7 == 3 || i7 == 4 || i7 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 3 || i7 == 4 || i7 == 5) ? 2 : 3];
        if (i7 == 1) {
            objArr[0] = "valueArguments";
        } else if (i7 == 2) {
            objArr[0] = "source";
        } else if (i7 == 3 || i7 == 4 || i7 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i7 == 3) {
            objArr[1] = "getType";
        } else if (i7 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i7 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i7 != 3 && i7 != 4 && i7 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 3 && i7 != 4 && i7 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // wo.b
    public final up.c a() {
        vo.f fVarD = bq.e.d(this);
        if (fVarD != null) {
            if (nq.l.f(fVarD)) {
                fVarD = null;
            }
            if (fVarD != null) {
                return bq.e.c(fVarD);
            }
        }
        return null;
    }

    @Override // wo.b
    public final Map b() {
        Map map = this.f22365b;
        if (map != null) {
            return map;
        }
        c(4);
        throw null;
    }

    @Override // wo.b
    public final n0 d() {
        n0 n0Var = this.f22366c;
        if (n0Var != null) {
            return n0Var;
        }
        c(5);
        throw null;
    }

    @Override // wo.b
    public final z getType() {
        z zVar = this.f22364a;
        if (zVar != null) {
            return zVar;
        }
        c(3);
        throw null;
    }

    public final String toString() {
        return wp.f.f22422a.w(this, null);
    }
}
