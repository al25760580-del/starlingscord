package po;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeParameterReference;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class r1 implements mo.t, c0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f18141v = {kk.b.p(r1.class, "upperBounds", "getUpperBounds()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vo.r0 f18142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u1 f18143e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s1 f18144i;

    public r1(s1 s1Var, vo.r0 descriptor) {
        Class cls;
        b0 b0VarA;
        Object objI0;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f18142d = descriptor;
        this.f18143e = e4.f.f0(null, new ep.x(19, this));
        if (s1Var == null) {
            vo.l lVarG = descriptor.g();
            Intrinsics.checkNotNullExpressionValue(lVarG, "getContainingDeclaration(...)");
            if (lVarG instanceof vo.f) {
                objI0 = a((vo.f) lVarG);
            } else {
                if (!(lVarG instanceof vo.d)) {
                    throw new ar.a0("Unknown type parameter container: " + lVarG);
                }
                vo.l lVarG2 = ((vo.d) lVarG).g();
                Intrinsics.checkNotNullExpressionValue(lVarG2, "getContainingDeclaration(...)");
                if (lVarG2 instanceof vo.f) {
                    b0VarA = a((vo.f) lVarG2);
                } else {
                    jq.m mVar = lVarG instanceof jq.m ? (jq.m) lVarG : null;
                    if (mVar == null) {
                        throw new ar.a0("Non-class callable descriptor must be deserialized: " + lVarG);
                    }
                    jq.l lVarP = mVar.P();
                    np.g gVar = lVarP instanceof np.g ? (np.g) lVarP : null;
                    ap.b bVar = gVar != null ? gVar.f17004i : null;
                    ap.b bVar2 = bVar instanceof ap.b ? bVar : null;
                    if (bVar2 == null || (cls = bVar2.f2856a) == null) {
                        throw new ar.a0("Container of deserialized member is not resolved: " + mVar);
                    }
                    Intrinsics.checkNotNullParameter(cls, "<this>");
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(cls);
                    Intrinsics.checkNotNull(orCreateKotlinClass, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                    b0VarA = (b0) orCreateKotlinClass;
                }
                objI0 = lVarG.i0(new d(b0VarA), Unit.f14616a);
            }
            s1Var = (s1) objI0;
        }
        this.f18144i = s1Var;
    }

    public static b0 a(vo.f fVar) {
        KClass orCreateKotlinClass;
        Class clsK = a2.k(fVar);
        if (clsK != null) {
            Intrinsics.checkNotNullParameter(clsK, "<this>");
            orCreateKotlinClass = Reflection.getOrCreateKotlinClass(clsK);
        } else {
            orCreateKotlinClass = null;
        }
        b0 b0Var = (b0) orCreateKotlinClass;
        if (b0Var != null) {
            return b0Var;
        }
        throw new ar.a0("Type parameter container is not resolved: " + fVar.g());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return Intrinsics.areEqual(this.f18144i, r1Var.f18144i) && Intrinsics.areEqual(getName(), r1Var.getName());
    }

    @Override // po.c0
    public final vo.i getDescriptor() {
        return this.f18142d;
    }

    @Override // mo.t
    public final String getName() {
        String strB = this.f18142d.getName().b();
        Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
        return strB;
    }

    @Override // mo.t
    public final List getUpperBounds() {
        KProperty kProperty = f18141v[0];
        Object objInvoke = this.f18143e.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    @Override // mo.t
    public final mo.w getVariance() {
        int iOrdinal = this.f18142d.getVariance().ordinal();
        if (iOrdinal == 0) {
            return mo.w.f15954d;
        }
        if (iOrdinal == 1) {
            return mo.w.f15955e;
        }
        if (iOrdinal == 2) {
            return mo.w.f15956i;
        }
        throw new rn.n();
    }

    public final int hashCode() {
        return getName().hashCode() + (this.f18144i.hashCode() * 31);
    }

    public final String toString() {
        return TypeParameterReference.INSTANCE.toString(this);
    }
}
