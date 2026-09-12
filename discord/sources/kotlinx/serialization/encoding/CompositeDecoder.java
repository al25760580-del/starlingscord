package kotlinx.serialization.encoding;

import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;

/* JADX INFO: loaded from: classes3.dex */
public interface CompositeDecoder {
    boolean decodeBooleanElement(SerialDescriptor serialDescriptor, int i7);

    byte decodeByteElement(SerialDescriptor serialDescriptor, int i7);

    char decodeCharElement(SerialDescriptor serialDescriptor, int i7);

    int decodeCollectionSize(SerialDescriptor serialDescriptor);

    double decodeDoubleElement(SerialDescriptor serialDescriptor, int i7);

    int decodeElementIndex(SerialDescriptor serialDescriptor);

    float decodeFloatElement(SerialDescriptor serialDescriptor, int i7);

    Decoder decodeInlineElement(SerialDescriptor serialDescriptor, int i7);

    int decodeIntElement(SerialDescriptor serialDescriptor, int i7);

    long decodeLongElement(SerialDescriptor serialDescriptor, int i7);

    Object decodeNullableSerializableElement(SerialDescriptor serialDescriptor, int i7, DeserializationStrategy deserializationStrategy, Object obj);

    boolean decodeSequentially();

    Object decodeSerializableElement(SerialDescriptor serialDescriptor, int i7, DeserializationStrategy deserializationStrategy, Object obj);

    short decodeShortElement(SerialDescriptor serialDescriptor, int i7);

    String decodeStringElement(SerialDescriptor serialDescriptor, int i7);

    void endStructure(SerialDescriptor serialDescriptor);

    SerializersModule getSerializersModule();
}
