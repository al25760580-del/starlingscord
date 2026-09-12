package po;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeBase;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class q1 implements KTypeBase {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f18131w = {kk.b.p(q1.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0), kk.b.p(q1.class, "arguments", "getArguments()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lq.z f18132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u1 f18133e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u1 f18134i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final u1 f18135v;

    public q1(lq.z type, Function0 function0) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f18132d = type;
        u1 u1Var = function0 instanceof u1 ? (u1) function0 : null;
        this.f18133e = u1Var == null ? function0 != null ? e4.f.f0(null, function0) : null : u1Var;
        this.f18134i = e4.f.f0(null, new o1(this, 0));
        this.f18135v = e4.f.f0(null, new fp.b(12, this, function0));
    }

    public final mo.c a(lq.z zVar) {
        lq.z zVarB;
        vo.i iVarG = zVar.r0().g();
        if (iVarG instanceof vo.f) {
            Class clsK = a2.k((vo.f) iVarG);
            if (clsK != null) {
                if (!clsK.isArray()) {
                    if (lq.b1.e(zVar)) {
                        return new b0(clsK);
                    }
                    List list = bp.c.f3339a;
                    Intrinsics.checkNotNullParameter(clsK, "<this>");
                    Class cls = (Class) bp.c.f3340b.get(clsK);
                    if (cls != null) {
                        clsK = cls;
                    }
                    return new b0(clsK);
                }
                lq.t0 t0Var = (lq.t0) CollectionsKt.b0(zVar.l0());
                if (t0Var == null || (zVarB = t0Var.b()) == null) {
                    return new b0(clsK);
                }
                mo.c cVarA = a(zVarB);
                if (cVarA != null) {
                    Class clsB = gn.h.B(mf.f.w(cVarA));
                    Intrinsics.checkNotNullParameter(clsB, "<this>");
                    return new b0(Array.newInstance((Class<?>) clsB, 0).getClass());
                }
                throw new ar.a0("Cannot determine classifier for array element type: " + this);
            }
        } else {
            if (iVarG instanceof vo.r0) {
                return new r1(null, (vo.r0) iVarG);
            }
            if (iVarG instanceof vo.q0) {
                Intrinsics.checkNotNullParameter("An operation is not implemented: Type alias classifiers are not yet supported", "message");
                throw new rn.o("An operation is not implemented: Type alias classifiers are not yet supported");
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return Intrinsics.areEqual(this.f18132d, q1Var.f18132d) && Intrinsics.areEqual(getClassifier(), q1Var.getClassifier()) && Intrinsics.areEqual(getArguments(), q1Var.getArguments());
    }

    @Override // kotlin.jvm.internal.KTypeBase, mo.b
    public final List getAnnotations() {
        return a2.d(this.f18132d);
    }

    @Override // kotlin.jvm.internal.KTypeBase, kotlin.reflect.KType
    public final List getArguments() {
        KProperty kProperty = f18131w[1];
        Object objInvoke = this.f18135v.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    @Override // kotlin.jvm.internal.KTypeBase, kotlin.reflect.KType
    public final mo.c getClassifier() {
        KProperty kProperty = f18131w[0];
        return (mo.c) this.f18134i.invoke();
    }

    @Override // kotlin.jvm.internal.KTypeBase
    public final Type getJavaType() {
        u1 u1Var = this.f18133e;
        if (u1Var != null) {
            return (Type) u1Var.invoke();
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.f18132d.hashCode() * 31;
        mo.c classifier = getClassifier();
        return getArguments().hashCode() + ((iHashCode + (classifier != null ? classifier.hashCode() : 0)) * 31);
    }

    @Override // kotlin.jvm.internal.KTypeBase, kotlin.reflect.KType
    public final boolean isMarkedNullable() {
        return this.f18132d.t0();
    }

    public final String toString() {
        wp.h hVar = x1.f18192a;
        return x1.d(this.f18132d);
    }
}
