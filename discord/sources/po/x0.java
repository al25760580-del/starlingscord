package po;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 implements mo.m {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f18187w = {kk.b.p(x0.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0), kk.b.p(x0.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f18188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18189e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mo.l f18190i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final u1 f18191v;

    public x0(s callable, int i7, mo.l kind, Function0 computeDescriptor) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(computeDescriptor, "computeDescriptor");
        this.f18188d = callable;
        this.f18189e = i7;
        this.f18190i = kind;
        this.f18191v = e4.f.f0(null, computeDescriptor);
        e4.f.f0(null, new v0(this, 0));
    }

    public final vo.j0 a() {
        KProperty kProperty = f18187w[0];
        Object objInvoke = this.f18191v.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (vo.j0) objInvoke;
    }

    public final q1 b() {
        lq.z type = a().getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return new q1(type, new v0(this, 1));
    }

    public final boolean c() {
        vo.j0 j0VarA = a();
        yo.q0 q0Var = j0VarA instanceof yo.q0 ? (yo.q0) j0VarA : null;
        if (q0Var != null) {
            return bq.e.a(q0Var);
        }
        return false;
    }

    public final boolean d() {
        vo.j0 j0VarA = a();
        return (j0VarA instanceof yo.q0) && ((yo.q0) j0VarA).H != null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return Intrinsics.areEqual(this.f18188d, x0Var.f18188d) && this.f18189e == x0Var.f18189e;
    }

    @Override // mo.b
    public final List getAnnotations() {
        throw null;
    }

    public final String getName() {
        vo.j0 j0VarA = a();
        yo.q0 q0Var = j0VarA instanceof yo.q0 ? (yo.q0) j0VarA : null;
        if (q0Var != null && !q0Var.g().v()) {
            up.e name = q0Var.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (!name.f21270e) {
                return name.b();
            }
        }
        return null;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18189e) + (this.f18188d.hashCode() * 31);
    }

    public final String toString() {
        String strB;
        wp.h hVar = x1.f18192a;
        Intrinsics.checkNotNullParameter(this, "parameter");
        StringBuilder sb2 = new StringBuilder();
        int iOrdinal = this.f18190i.ordinal();
        if (iOrdinal == 0) {
            sb2.append("instance parameter");
        } else if (iOrdinal == 1) {
            sb2.append("extension receiver parameter");
        } else {
            if (iOrdinal != 2) {
                throw new rn.n();
            }
            sb2.append("parameter #" + this.f18189e + ' ' + getName());
        }
        sb2.append(" of ");
        vo.d dVarE = this.f18188d.e();
        if (dVarE instanceof vo.l0) {
            strB = x1.c((vo.l0) dVarE);
        } else {
            if (!(dVarE instanceof vo.u)) {
                throw new IllegalStateException(("Illegal callable: " + dVarE).toString());
            }
            strB = x1.b((vo.u) dVarE);
        }
        sb2.append(strB);
        return sb2.toString();
    }
}
