package or;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KSerializer f17611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KSerializer f17612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mr.g f17614d;

    public u0(KSerializer kSerializer, KSerializer kSerializer2, byte b10) {
        this.f17611a = kSerializer;
        this.f17612b = kSerializer2;
    }

    public final Object a(Object obj, Object obj2) {
        switch (this.f17613c) {
            case 0:
                return new t0(obj, obj2);
            default:
                return new Pair(obj, obj2);
        }
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        Object objA;
        Object obj = e1.f17529c;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        boolean zDecodeSequentially = compositeDecoderBeginStructure.decodeSequentially();
        KSerializer kSerializer = this.f17612b;
        KSerializer kSerializer2 = this.f17611a;
        if (zDecodeSequentially) {
            objA = a(compositeDecoderBeginStructure.decodeSerializableElement(getDescriptor(), 0, kSerializer2, null), compositeDecoderBeginStructure.decodeSerializableElement(getDescriptor(), 1, kSerializer, null));
        } else {
            Object objDecodeSerializableElement = obj;
            Object objDecodeSerializableElement2 = objDecodeSerializableElement;
            while (true) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    if (objDecodeSerializableElement == obj) {
                        throw new kr.g("Element 'key' is missing");
                    }
                    if (objDecodeSerializableElement2 == obj) {
                        throw new kr.g("Element 'value' is missing");
                    }
                    objA = a(objDecodeSerializableElement, objDecodeSerializableElement2);
                    break;
                }
                if (iDecodeElementIndex == 0) {
                    objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(getDescriptor(), 0, kSerializer2, null);
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new kr.g(kk.b.h(iDecodeElementIndex, "Invalid index: "));
                    }
                    objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(getDescriptor(), 1, kSerializer, null);
                }
            }
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return objA;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        switch (this.f17613c) {
            case 0:
                break;
        }
        return this.f17614d;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Object key;
        Object value;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(getDescriptor());
        SerialDescriptor descriptor = getDescriptor();
        KSerializer kSerializer = this.f17611a;
        switch (this.f17613c) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(entry, "<this>");
                key = entry.getKey();
                break;
            default:
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(pair, "<this>");
                key = pair.f14612d;
                break;
        }
        compositeEncoderBeginStructure.g(descriptor, 0, kSerializer, key);
        SerialDescriptor descriptor2 = getDescriptor();
        KSerializer kSerializer2 = this.f17612b;
        switch (this.f17613c) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(entry2, "<this>");
                value = entry2.getValue();
                break;
            default:
                Pair pair2 = (Pair) obj;
                Intrinsics.checkNotNullParameter(pair2, "<this>");
                value = pair2.f14613e;
                break;
        }
        compositeEncoderBeginStructure.g(descriptor2, 1, kSerializer2, value);
        compositeEncoderBeginStructure.endStructure(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u0(final KSerializer keySerializer, final KSerializer valueSerializer, int i7) {
        this(keySerializer, valueSerializer, (byte) 0);
        this.f17613c = i7;
        switch (i7) {
            case 1:
                Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
                Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
                this(keySerializer, valueSerializer, (byte) 0);
                final int i10 = 1;
                this.f17614d = m3.m.f("kotlin.Pair", new SerialDescriptor[0], new Function1() { // from class: or.s0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        mr.a buildSerialDescriptor = (mr.a) obj;
                        switch (i10) {
                            case 0:
                                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                                mr.a.a(buildSerialDescriptor, "key", keySerializer.getDescriptor());
                                mr.a.a(buildSerialDescriptor, "value", valueSerializer.getDescriptor());
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildClassSerialDescriptor");
                                mr.a.a(buildSerialDescriptor, "first", keySerializer.getDescriptor());
                                mr.a.a(buildSerialDescriptor, "second", valueSerializer.getDescriptor());
                                break;
                        }
                        return Unit.f14616a;
                    }
                });
                break;
            default:
                Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
                Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
                final int i11 = 0;
                this.f17614d = m3.m.g("kotlin.collections.Map.Entry", mr.j.f16079d, new SerialDescriptor[0], new Function1() { // from class: or.s0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        mr.a buildSerialDescriptor = (mr.a) obj;
                        switch (i11) {
                            case 0:
                                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                                mr.a.a(buildSerialDescriptor, "key", keySerializer.getDescriptor());
                                mr.a.a(buildSerialDescriptor, "value", valueSerializer.getDescriptor());
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildClassSerialDescriptor");
                                mr.a.a(buildSerialDescriptor, "first", keySerializer.getDescriptor());
                                mr.a.a(buildSerialDescriptor, "second", valueSerializer.getDescriptor());
                                break;
                        }
                        return Unit.f14616a;
                    }
                });
                break;
        }
    }
}
