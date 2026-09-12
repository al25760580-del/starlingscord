package pr;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f implements KSerializer {

    @NotNull
    private final KClass baseClass;

    @NotNull
    private final SerialDescriptor descriptor;

    public f(KClass baseClass) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.baseClass = baseClass;
        this.descriptor = m3.m.g("JsonContentPolymorphicSerializer<" + baseClass.getSimpleName() + '>', mr.c.f16056c, new SerialDescriptor[0], new f6.a(17));
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final Object deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        g gVarE = m3.m.e(decoder);
        JsonElement jsonElementA = gVarE.a();
        DeserializationStrategy deserializationStrategySelectDeserializer = selectDeserializer(jsonElementA);
        Intrinsics.checkNotNull(deserializationStrategySelectDeserializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        return gVarE.b().a((KSerializer) deserializationStrategySelectDeserializer, jsonElementA);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    public abstract DeserializationStrategy selectDeserializer(JsonElement jsonElement);

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        KSerializer kSerializerF = encoder.getSerializersModule().f(this.baseClass, value);
        if (kSerializerF == null) {
            KSerializer kSerializerG = ls.d.G(Reflection.getOrCreateKotlinClass(value.getClass()));
            if (kSerializerG == null) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(value.getClass());
                KClass kClass = this.baseClass;
                String simpleName = orCreateKotlinClass.getSimpleName();
                if (simpleName == null) {
                    simpleName = String.valueOf(orCreateKotlinClass);
                }
                throw new kr.g(s0.g.f("Class '", simpleName, "' is not registered for polymorphic serialization ", "in the scope of '" + kClass.getSimpleName() + '\'', ".\nMark the base class as 'sealed' or register the serializer explicitly."));
            }
            kSerializerF = kSerializerG;
        }
        kSerializerF.serialize(encoder, value);
    }
}
