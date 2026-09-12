package or;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements KSerializer {
    public DeserializationStrategy a(CompositeDecoder decoder, String str) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.getSerializersModule().e(str, c());
    }

    public KSerializer b(Encoder encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        return encoder.getSerializersModule().f(c(), value);
    }

    public abstract KClass c();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.String] */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Object objDecodeSerializableElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(getDescriptor(), 1, m3.m.y(this, compositeDecoderBeginStructure, compositeDecoderBeginStructure.decodeStringElement(getDescriptor(), 0)), null);
        } else {
            Object objDecodeSerializableElement2 = null;
            while (true) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    if (objDecodeSerializableElement2 != null) {
                        Intrinsics.checkNotNull(objDecodeSerializableElement2, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                        objDecodeSerializableElement = objDecodeSerializableElement2;
                        break;
                    }
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) objectRef.element)).toString());
                }
                if (iDecodeElementIndex == 0) {
                    objectRef.element = compositeDecoderBeginStructure.decodeStringElement(getDescriptor(), iDecodeElementIndex);
                } else {
                    if (iDecodeElementIndex != 1) {
                        StringBuilder sb2 = new StringBuilder("Invalid index in polymorphic deserialization of ");
                        String str = (String) objectRef.element;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb2.append(str);
                        sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb2.append(iDecodeElementIndex);
                        throw new kr.g(sb2.toString());
                    }
                    T t5 = objectRef.element;
                    if (t5 == 0) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    }
                    objectRef.element = t5;
                    objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(getDescriptor(), iDecodeElementIndex, m3.m.y(this, compositeDecoderBeginStructure, (String) t5), null);
                }
            }
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return objDecodeSerializableElement;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        KSerializer kSerializerZ = m3.m.z(this, encoder, value);
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        compositeEncoderBeginStructure.q(getDescriptor(), 0, kSerializerZ.getDescriptor().d());
        SerialDescriptor descriptor2 = getDescriptor();
        Intrinsics.checkNotNull(kSerializerZ, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        compositeEncoderBeginStructure.g(descriptor2, 1, kSerializerZ, value);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }
}
