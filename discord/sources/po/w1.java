package po;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference2;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference2;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes3.dex */
public class w1 extends ReflectionFactory {
    public static g0 a(CallableReference callableReference) {
        KDeclarationContainer owner = callableReference.getOwner();
        return owner instanceof g0 ? (g0) owner : e.f18082e;
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KClass createKotlinClass(Class cls) {
        return new b0(cls);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KFunction function(FunctionReference functionReference) {
        g0 container = a(functionReference);
        String name = functionReference.getName();
        String signature = functionReference.getSignature();
        Object boundReceiver = functionReference.getBoundReceiver();
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        return new i0(container, name, signature, null, boundReceiver);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KClass getOrCreateKotlinClass(Class cls) {
        return c.a(cls);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KDeclarationContainer getOrCreateKotlinPackage(Class jClass, String str) {
        io.sentry.internal.debugmeta.c cVar = c.f18073a;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        return (KDeclarationContainer) c.f18074b.w0(jClass);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KType mutableCollectionType(KType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        lq.z zVar = ((q1) type).f18132d;
        if (!(zVar instanceof lq.d0)) {
            throw new IllegalArgumentException(("Non-simple type cannot be a mutable collection type: " + type).toString());
        }
        vo.i iVarG = zVar.r0().g();
        vo.f fVar = iVarG instanceof vo.f ? (vo.f) iVarG : null;
        if (fVar == null) {
            throw new IllegalArgumentException("Non-class type cannot be a mutable collection type: " + type);
        }
        lq.d0 d0Var = (lq.d0) zVar;
        String str = uo.d.f21197a;
        up.c cVar = (up.c) uo.d.k.get(bq.e.h(fVar));
        if (cVar == null) {
            throw new IllegalArgumentException("Not a readonly collection: " + fVar);
        }
        vo.f fVarJ = bq.e.e(fVar).j(cVar);
        Intrinsics.checkNotNullExpressionValue(fVarJ, "getBuiltInClassByFqName(...)");
        lq.q0 q0VarN = fVarJ.n();
        Intrinsics.checkNotNullExpressionValue(q0VarN, "getTypeConstructor(...)");
        return new q1(lq.c.u(d0Var, q0VarN), null);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final mo.f mutableProperty0(MutablePropertyReference0 mutablePropertyReference0) {
        return new k0(a(mutablePropertyReference0), mutablePropertyReference0.getName(), mutablePropertyReference0.getSignature(), mutablePropertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final mo.h mutableProperty1(MutablePropertyReference1 mutablePropertyReference1) {
        return new m0(a(mutablePropertyReference1), mutablePropertyReference1.getName(), mutablePropertyReference1.getSignature(), mutablePropertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final mo.j mutableProperty2(MutablePropertyReference2 mutablePropertyReference2) {
        return new o0(a(mutablePropertyReference2), mutablePropertyReference2.getName(), mutablePropertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KType nothingType(KType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        lq.z zVar = ((q1) type).f18132d;
        if (!(zVar instanceof lq.d0)) {
            throw new IllegalArgumentException(("Non-simple type cannot be a Nothing type: " + type).toString());
        }
        lq.d0 d0Var = (lq.d0) zVar;
        lq.q0 q0VarN = c9.a.o(zVar).k("Nothing").n();
        Intrinsics.checkNotNullExpressionValue(q0VarN, "getTypeConstructor(...)");
        return new q1(lq.c.u(d0Var, q0VarN), null);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KType platformType(KType lowerBound, KType upperBound) {
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        lq.z zVar = ((q1) lowerBound).f18132d;
        Intrinsics.checkNotNull(zVar, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        lq.z zVar2 = ((q1) upperBound).f18132d;
        Intrinsics.checkNotNull(zVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new q1(lq.c.e((lq.d0) zVar, (lq.d0) zVar2), null);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final mo.p property0(PropertyReference0 propertyReference0) {
        return new a1(a(propertyReference0), propertyReference0.getName(), propertyReference0.getSignature(), propertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KProperty1 property1(PropertyReference1 propertyReference1) {
        return new d1(a(propertyReference1), propertyReference1.getName(), propertyReference1.getSignature(), propertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final mo.s property2(PropertyReference2 propertyReference2) {
        return new g1(a(propertyReference2), propertyReference2.getName(), propertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final String renderLambdaToString(FunctionBase functionBase) throws vp.q {
        i0 i0VarB;
        Intrinsics.checkNotNullParameter(functionBase, "<this>");
        Metadata metadata = (Metadata) functionBase.getClass().getAnnotation(Metadata.class);
        i0 i0Var = null;
        if (metadata != null) {
            String[] data = metadata.d1();
            if (data.length == 0) {
                data = null;
            }
            if (data != null) {
                String[] strings = metadata.d2();
                vp.g gVar = tp.g.f20880a;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(strings, "strings");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(tp.a.a(data));
                vp.g gVar2 = tp.g.f20880a;
                tp.f fVarG = tp.g.g(byteArrayInputStream, strings);
                vp.g gVar3 = tp.g.f20880a;
                pp.a aVar = pp.a0.T;
                aVar.getClass();
                vp.e eVar = new vp.e(byteArrayInputStream);
                vp.a aVar2 = (vp.a) aVar.a(eVar, gVar3);
                try {
                    eVar.a(0);
                    if (!aVar2.b()) {
                        vp.q qVar = new vp.q(new androidx.datastore.preferences.protobuf.d1().getMessage());
                        qVar.f21916d = aVar2;
                        throw qVar;
                    }
                    pp.a0 a0Var = (pp.a0) aVar2;
                    rp.e eVar2 = new rp.e(metadata.mv(), (metadata.xi() & 8) != 0);
                    Class<?> cls = functionBase.getClass();
                    pp.y0 y0Var = a0Var.M;
                    Intrinsics.checkNotNullExpressionValue(y0Var, "getTypeTable(...)");
                    i0Var = new i0(e.f18082e, (yo.k0) a2.f(cls, a0Var, fVarG, new pf.b(y0Var), eVar2, oo.a.f17479d));
                } catch (vp.q e10) {
                    e10.f21916d = aVar2;
                    throw e10;
                }
            }
        }
        if (i0Var == null || (i0VarB = a2.b(i0Var)) == null) {
            return super.renderLambdaToString(functionBase);
        }
        wp.h hVar = x1.f18192a;
        vo.u invoke = i0VarB.e();
        Intrinsics.checkNotNullParameter(invoke, "invoke");
        StringBuilder sb2 = new StringBuilder();
        x1.a(sb2, invoke);
        List listL = invoke.L();
        Intrinsics.checkNotNullExpressionValue(listL, "getValueParameters(...)");
        CollectionsKt.N(listL, sb2, ", ", "(", ")", b.I, 48);
        sb2.append(" -> ");
        lq.z returnType = invoke.getReturnType();
        Intrinsics.checkNotNull(returnType);
        sb2.append(x1.d(returnType));
        return sb2.toString();
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KType typeOf(mo.c cVar, List arguments, boolean z5) {
        if (!(cVar instanceof ClassBasedDeclarationContainer)) {
            return xr.m.l(cVar, arguments, z5, Collections.EMPTY_LIST);
        }
        Class<?> jClass = ((ClassBasedDeclarationContainer) cVar).getJClass();
        io.sentry.internal.debugmeta.c cVar2 = c.f18073a;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        if (arguments.isEmpty()) {
            return z5 ? (KType) c.f18076d.w0(jClass) : (KType) c.f18075c.w0(jClass);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c.f18077e.w0(jClass);
        Pair pair = new Pair(arguments, Boolean.valueOf(z5));
        Object obj = concurrentHashMap.get(pair);
        if (obj == null) {
            q1 q1VarL = xr.m.l(c.a(jClass), arguments, z5, kotlin.collections.n0.f14659d);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(pair, q1VarL);
            obj = objPutIfAbsent == null ? q1VarL : objPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj, "getOrPut(...)");
        return (KType) obj;
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final mo.t typeParameter(Object obj, String str, mo.w wVar, boolean z5) {
        List<mo.t> typeParameters;
        if (obj instanceof KClass) {
            typeParameters = ((KClass) obj).getTypeParameters();
        } else {
            if (!(obj instanceof KCallable)) {
                throw new IllegalArgumentException("Type parameter container must be a class or a callable: " + obj);
            }
            typeParameters = ((KCallable) obj).getTypeParameters();
        }
        for (mo.t tVar : typeParameters) {
            if (tVar.getName().equals(str)) {
                return tVar;
            }
        }
        throw new IllegalArgumentException("Type parameter " + str + " is not found in container: " + obj);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KClass createKotlinClass(Class cls, String str) {
        return new b0(cls);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final KClass getOrCreateKotlinClass(Class cls, String str) {
        return c.a(cls);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final String renderLambdaToString(Lambda lambda) {
        return renderLambdaToString((FunctionBase) lambda);
    }

    @Override // kotlin.jvm.internal.ReflectionFactory
    public final void setUpperBounds(mo.t tVar, List list) {
    }
}
