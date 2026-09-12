package po;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends s implements FunctionBase, KFunction, Function0, Function1, go.a, go.b, go.c, go.d, go.e, go.f, go.g, go.h, go.i, go.j, Function2, go.k, go.l, go.m, Function3, Function4, Function5, Function6, go.n, Function8, go.o {
    public static final /* synthetic */ KProperty[] J = {kk.b.p(i0.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0)};
    public final String E;
    public final Object F;
    public final u1 G;
    public final Object H;
    public final Object I;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g0 f18097y;

    public i0(g0 g0Var, String str, String str2, vo.u uVar, Object obj) {
        this.f18097y = g0Var;
        this.E = str2;
        this.F = obj;
        this.G = e4.f.f0(uVar, new fp.b(11, this, str));
        rn.m mVar = rn.m.f19486e;
        this.H = rn.l.a(mVar, new h0(this, 0));
        this.I = rn.l.a(mVar, new h0(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // po.s
    public final qo.g b() {
        return (qo.g) this.H.getValue();
    }

    @Override // po.s
    public final g0 c() {
        return this.f18097y;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // po.s
    public final qo.g d() {
        return (qo.g) this.I.getValue();
    }

    public final boolean equals(Object obj) {
        i0 i0VarB = a2.b(obj);
        return i0VarB != null && Intrinsics.areEqual(this.f18097y, i0VarB.f18097y) && Intrinsics.areEqual(getName(), i0VarB.getName()) && Intrinsics.areEqual(this.E, i0VarB.E) && Intrinsics.areEqual(this.F, i0VarB.F);
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public final int getArity() {
        return a.a.j(b());
    }

    @Override // kotlin.reflect.KCallable
    public final String getName() {
        String strB = ((yo.l) e()).getName().b();
        Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
        return strB;
    }

    @Override // po.s
    public final boolean h() {
        return this.F != CallableReference.NO_RECEIVER;
    }

    public final int hashCode() {
        return this.E.hashCode() + ((getName().hashCode() + (this.f18097y.hashCode() * 31)) * 31);
    }

    public final qo.w i(Constructor constructor, vo.u descriptor, boolean z5) {
        Object obj = this.F;
        Class<?> cls = null;
        if (!z5) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            yo.h hVar = descriptor instanceof yo.h ? (yo.h) descriptor : null;
            if (hVar != null) {
                yo.h hVar2 = hVar;
                if (!vo.p.e(hVar2.getVisibility())) {
                    vo.f fVarR = hVar.r();
                    Intrinsics.checkNotNullExpressionValue(fVarR, "getConstructedClass(...)");
                    if (!xp.g.f(fVarR) && !xp.e.q(hVar.r())) {
                        List listL = hVar2.L();
                        Intrinsics.checkNotNullExpressionValue(listL, "getValueParameters(...)");
                        if (listL == null || !listL.isEmpty()) {
                            Iterator it = listL.iterator();
                            while (it.hasNext()) {
                                lq.z type = ((yo.q0) it.next()).getType();
                                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                                if (ls.d.A(type)) {
                                    if (h()) {
                                        return new qo.h(constructor, a5.l0.m(obj, e()), 0);
                                    }
                                    Intrinsics.checkNotNullParameter(constructor, "constructor");
                                    Class declaringClass = constructor.getDeclaringClass();
                                    Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
                                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                                    Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
                                    return new qo.i(constructor, declaringClass, cls, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : kotlin.collections.w.j(genericParameterTypes, 0, genericParameterTypes.length - 1)), 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (h()) {
            return new qo.h(constructor, a5.l0.m(obj, e()), 1);
        }
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Class declaringClass2 = constructor.getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass2, "getDeclaringClass(...)");
        Class declaringClass3 = constructor.getDeclaringClass();
        Class<?> declaringClass4 = declaringClass3.getDeclaringClass();
        if (declaringClass4 != null && !Modifier.isStatic(declaringClass3.getModifiers())) {
            cls = declaringClass4;
        }
        Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
        Intrinsics.checkNotNullExpressionValue(genericParameterTypes2, "getGenericParameterTypes(...)");
        return new qo.i(constructor, declaringClass2, cls, genericParameterTypes2, 1);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isExternal() {
        return e().isExternal();
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isInfix() {
        return e().isInfix();
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isInline() {
        return e().isInline();
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isOperator() {
        return e().isOperator();
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isSuspend() {
        return e().isSuspend();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    public final qo.q j(Method method, boolean z5) {
        if (!h()) {
            return new qo.v(2, method);
        }
        yo.t tVarS = e().S();
        Object objM = this.F;
        if (tVarS == null || !xp.g.c(tVarS.getType())) {
            objM = a5.l0.m(objM, e());
        } else {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
            Class cls = (Class) kotlin.collections.y.t(parameterTypes);
            if (cls == null || !cls.isInterface()) {
                objM = a5.l0.m(objM, e());
            }
        }
        return new qo.t(method, z5, objM);
    }

    @Override // po.s
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final vo.u e() {
        KProperty kProperty = J[0];
        Object objInvoke = this.G.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (vo.u) objInvoke;
    }

    public final String toString() {
        wp.h hVar = x1.f18192a;
        return x1.b(e());
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public i0(g0 container, vo.u descriptor) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String strB = ((yo.l) descriptor).getName().b();
        Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
        this(container, strB, y1.c(descriptor).d(), descriptor, CallableReference.NO_RECEIVER);
    }

    @Override // go.n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // kotlin.jvm.functions.Function8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }
}
