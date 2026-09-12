package rr;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;
import ls.d;
import mr.f;
import mr.h;
import mr.i;
import mr.j;
import rn.n;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends SerializersModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f19547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f19548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f19549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f19550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f19551e;

    public a(o0 class2ContextualFactory, o0 polyBase2Serializers, o0 polyBase2DefaultSerializerProvider, o0 polyBase2NamedSerializers, o0 polyBase2DefaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(class2ContextualFactory, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(polyBase2Serializers, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f19547a = class2ContextualFactory;
        this.f19548b = polyBase2Serializers;
        this.f19549c = polyBase2DefaultSerializerProvider;
        this.f19550d = polyBase2NamedSerializers;
        this.f19551e = polyBase2DefaultDeserializerProvider;
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public final void a(cg.b collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        Iterator it = this.f19547a.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            throw new n();
        }
        for (Map.Entry entry2 : this.f19548b.entrySet()) {
            KClass baseClass = (KClass) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                KClass actualClass = (KClass) entry3.getKey();
                KSerializer actualSerializer = (KSerializer) entry3.getValue();
                Intrinsics.checkNotNull(baseClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(actualClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(actualSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                Intrinsics.checkNotNullParameter(baseClass, "baseClass");
                Intrinsics.checkNotNullParameter(actualClass, "actualClass");
                Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
                SerialDescriptor descriptor = actualSerializer.getDescriptor();
                d dVarC = descriptor.c();
                if ((dVarC instanceof mr.d) || Intrinsics.areEqual(dVarC, h.f16075b)) {
                    throw new IllegalArgumentException("Serializer for " + actualClass.getSimpleName() + " can't be registered as a subclass for polymorphic serialization because its kind " + dVarC + " is not concrete. To work with multiple hierarchies, register it as a base class.");
                }
                if (Intrinsics.areEqual(dVarC, j.f16078c) || Intrinsics.areEqual(dVarC, j.f16079d) || (dVarC instanceof f) || (dVarC instanceof i)) {
                    throw new IllegalArgumentException("Serializer for " + actualClass.getSimpleName() + " of kind " + dVarC + " cannot be serialized polymorphically with class discriminator.");
                }
                int iG = descriptor.g();
                for (int i7 = 0; i7 < iG; i7++) {
                    String strH = descriptor.h(i7);
                    if (Intrinsics.areEqual(strH, collector.f3649d)) {
                        throw new IllegalArgumentException("Polymorphic serializer for " + actualClass + " has property '" + strH + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                    }
                }
            }
        }
        for (Map.Entry entry4 : this.f19549c.entrySet()) {
            KClass baseClass2 = (KClass) entry4.getKey();
            Function1 function1 = (Function1) entry4.getValue();
            Intrinsics.checkNotNull(baseClass2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(function1, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            Function1 defaultSerializerProvider = (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1);
            Intrinsics.checkNotNullParameter(baseClass2, "baseClass");
            Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        }
        for (Map.Entry entry5 : this.f19551e.entrySet()) {
            KClass baseClass3 = (KClass) entry5.getKey();
            Function1 function2 = (Function1) entry5.getValue();
            Intrinsics.checkNotNull(baseClass3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(function2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            Function1 defaultDeserializerProvider = (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 1);
            Intrinsics.checkNotNullParameter(baseClass3, "baseClass");
            Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        }
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public final void b(KClass kClass, List typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        if (this.f19547a.get(kClass) != null) {
            throw new ClassCastException();
        }
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public final boolean d() {
        return false;
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public final DeserializationStrategy e(String str, KClass baseClass) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Map map = (Map) this.f19550d.get(baseClass);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(str) : null;
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Object obj = this.f19551e.get(baseClass);
        Function1 function1 = TypeIntrinsics.isFunctionOfArity(obj, 1) ? (Function1) obj : null;
        if (function1 != null) {
            return (DeserializationStrategy) function1.invoke(str);
        }
        return null;
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public final KSerializer f(KClass baseClass, Object value) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(value, "value");
        if (baseClass.isInstance(value)) {
            Map map = (Map) this.f19548b.get(baseClass);
            KSerializer kSerializer = map != null ? (KSerializer) map.get(Reflection.getOrCreateKotlinClass(value.getClass())) : null;
            KSerializer kSerializer2 = kSerializer instanceof KSerializer ? kSerializer : null;
            if (kSerializer2 != null) {
                return kSerializer2;
            }
            Object obj = this.f19549c.get(baseClass);
            Function1 function1 = TypeIntrinsics.isFunctionOfArity(obj, 1) ? (Function1) obj : null;
            if (function1 != null) {
                return (KSerializer) function1.invoke(value);
            }
        }
        return null;
    }
}
