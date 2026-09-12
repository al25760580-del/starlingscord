package po;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KCallable;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s implements KCallable, s1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u1 f18145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u1 f18146e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u1 f18147i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final u1 f18148v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final u1 f18149w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f18150x;

    public s() {
        u1 u1VarF0 = e4.f.f0(null, new p(this, 0));
        Intrinsics.checkNotNullExpressionValue(u1VarF0, "lazySoft(...)");
        this.f18145d = u1VarF0;
        u1 u1VarF1 = e4.f.f0(null, new p(this, 1));
        Intrinsics.checkNotNullExpressionValue(u1VarF1, "lazySoft(...)");
        this.f18146e = u1VarF1;
        u1 u1VarF2 = e4.f.f0(null, new p(this, 2));
        Intrinsics.checkNotNullExpressionValue(u1VarF2, "lazySoft(...)");
        this.f18147i = u1VarF2;
        u1 u1VarF3 = e4.f.f0(null, new p(this, 3));
        Intrinsics.checkNotNullExpressionValue(u1VarF3, "lazySoft(...)");
        this.f18148v = u1VarF3;
        u1 u1VarF4 = e4.f.f0(null, new p(this, 4));
        Intrinsics.checkNotNullExpressionValue(u1VarF4, "lazySoft(...)");
        this.f18149w = u1VarF4;
        this.f18150x = rn.l.a(rn.m.f19486e, new p(this, 5));
    }

    public static Object a(q1 q1Var) {
        Class clsB = gn.h.B(mf.f.v(q1Var));
        if (clsB.isArray()) {
            Object objNewInstance = Array.newInstance(clsB.getComponentType(), 0);
            Intrinsics.checkNotNullExpressionValue(objNewInstance, "run(...)");
            return objNewInstance;
        }
        throw new ar.a0("Cannot instantiate the default empty array of type " + clsB.getSimpleName() + ", because it is not an array type");
    }

    public abstract qo.g b();

    public abstract g0 c();

    @Override // kotlin.reflect.KCallable
    public final Object call(Object... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return b().call(args);
        } catch (IllegalAccessException cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            throw new ag.b(cause);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KCallable
    public final Object callBy(Map args) throws ag.b {
        boolean z5;
        Object objA;
        Intrinsics.checkNotNullParameter(args, "args");
        boolean z6 = false;
        if (g()) {
            List<mo.m> parameters = getParameters();
            ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(parameters, 10));
            for (mo.m mVar : parameters) {
                if (args.containsKey(mVar)) {
                    objA = args.get(mVar);
                    if (objA == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + mVar + ')');
                    }
                } else {
                    x0 x0Var = (x0) mVar;
                    if (x0Var.c()) {
                        objA = null;
                    } else {
                        if (!x0Var.d()) {
                            throw new IllegalArgumentException("No argument provided for a required parameter: " + x0Var);
                        }
                        objA = a(x0Var.b());
                    }
                }
                arrayList.add(objA);
            }
            qo.g gVarD = d();
            if (gVarD == null) {
                throw new ar.a0("This callable does not support a default call: " + e());
            }
            try {
                return gVarD.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException cause) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                throw new ag.b(cause);
            }
        }
        Intrinsics.checkNotNullParameter(args, "args");
        List<mo.m> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return b().call(isSuspend() ? new Continuation[]{null} : new Continuation[0]);
            } catch (IllegalAccessException cause2) {
                Intrinsics.checkNotNullParameter(cause2, "cause");
                throw new ag.b(cause2);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) ((Object[]) this.f18149w.invoke()).clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        boolean zBooleanValue = ((Boolean) this.f18150x.getValue()).booleanValue();
        int i7 = 0;
        for (mo.m mVar2 : parameters2) {
            int iF = zBooleanValue ? f(mVar2) : 1;
            if (args.containsKey(mVar2)) {
                objArr[((x0) mVar2).f18189e] = args.get(mVar2);
            } else {
                x0 x0Var2 = (x0) mVar2;
                if (x0Var2.c()) {
                    if (zBooleanValue) {
                        int i10 = i7 + iF;
                        for (int i11 = i7; i11 < i10; i11++) {
                            int i12 = (i11 / 32) + size;
                            Object obj = objArr[i12];
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                            objArr[i12] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i11 % 32)));
                        }
                        z5 = true;
                    } else {
                        z5 = true;
                        int i13 = (i7 / 32) + size;
                        Object obj2 = objArr[i13];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                        objArr[i13] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i7 % 32)));
                    }
                    z6 = z5;
                } else if (!x0Var2.d()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + x0Var2);
                }
            }
            if (((x0) mVar2).f18190i == mo.l.f15951i) {
                i7 += iF;
            }
        }
        if (!z6) {
            try {
                qo.g gVarB = b();
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                return gVarB.call(objArrCopyOf);
            } catch (IllegalAccessException cause3) {
                Intrinsics.checkNotNullParameter(cause3, "cause");
                throw new ag.b(cause3);
            }
        }
        qo.g gVarD2 = d();
        if (gVarD2 == null) {
            throw new ar.a0("This callable does not support a default call: " + e());
        }
        try {
            return gVarD2.call(objArr);
        } catch (IllegalAccessException cause4) {
            Intrinsics.checkNotNullParameter(cause4, "cause");
            throw new ag.b(cause4);
        }
    }

    public abstract qo.g d();

    public abstract vo.d e();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final int f(mo.m mVar) {
        if (!((Boolean) this.f18150x.getValue()).booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        x0 x0Var = (x0) mVar;
        if (!a2.h(x0Var.b())) {
            return 1;
        }
        q1 q1VarB = x0Var.b();
        Intrinsics.checkNotNull(q1VarB, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
        ArrayList arrayListA = a5.l0.A(lq.c.b(q1VarB.f18132d));
        Intrinsics.checkNotNull(arrayListA);
        return arrayListA.size();
    }

    public final boolean g() {
        return Intrinsics.areEqual(getName(), "<init>") && c().getJClass().isAnnotation();
    }

    @Override // mo.b
    public final List getAnnotations() {
        Object objInvoke = this.f18145d.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.KCallable
    public final List getParameters() {
        Object objInvoke = this.f18146e.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.KCallable
    public final KType getReturnType() {
        Object objInvoke = this.f18147i.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "invoke(...)");
        return (KType) objInvoke;
    }

    @Override // kotlin.reflect.KCallable
    public final List getTypeParameters() {
        Object objInvoke = this.f18148v.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.KCallable
    public final KVisibility getVisibility() {
        ep.p visibility = e().getVisibility();
        Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
        up.c cVar = a2.f18058a;
        Intrinsics.checkNotNullParameter(visibility, "<this>");
        if (Intrinsics.areEqual(visibility, vo.p.f21828e)) {
            return KVisibility.f14695d;
        }
        if (Intrinsics.areEqual(visibility, vo.p.f21826c)) {
            return KVisibility.f14696e;
        }
        if (Intrinsics.areEqual(visibility, vo.p.f21827d)) {
            return KVisibility.f14697i;
        }
        if (Intrinsics.areEqual(visibility, vo.p.f21824a) || Intrinsics.areEqual(visibility, vo.p.f21825b)) {
            return KVisibility.f14698v;
        }
        return null;
    }

    public abstract boolean h();

    @Override // kotlin.reflect.KCallable
    public final boolean isAbstract() {
        return e().e() == vo.y.f21855w;
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isFinal() {
        return e().e() == vo.y.f21852e;
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isOpen() {
        return e().e() == vo.y.f21854v;
    }
}
