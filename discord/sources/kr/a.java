package kr;

import com.discord.activity_invites.RGBAColorModel$$serializer;
import java.util.List;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.modules.SerializersModule;
import m3.m;
import or.e1;
import rn.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14792a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KSerializer f14793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f14795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SerialDescriptor f14796e;

    public a(KClass context, RGBAColorModel$$serializer rGBAColorModel$$serializer, KSerializer[] typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(context, "serializableClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        this.f14794c = context;
        this.f14793b = rGBAColorModel$$serializer;
        this.f14795d = w.b(typeArgumentsSerializers);
        kotlin.collections.a aVar = new kotlin.collections.a(3, this);
        mr.g gVarG = m.g("kotlinx.serialization.ContextualSerializer", mr.h.f16075b, new SerialDescriptor[0], aVar);
        Intrinsics.checkNotNullParameter(gVarG, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f14796e = new mr.b(gVarG, context);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        switch (this.f14792a) {
            case 0:
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerializersModule serializersModule = decoder.getSerializersModule();
                KClass kClass = (KClass) this.f14794c;
                serializersModule.b(kClass, (List) this.f14795d);
                KSerializer kSerializer = this.f14793b;
                if (kSerializer != null) {
                    return decoder.decodeSerializableValue(kSerializer);
                }
                Intrinsics.checkNotNullParameter(kClass, "<this>");
                throw new g(e1.j(kClass));
            default:
                KSerializer kSerializer2 = (KSerializer) this.f14795d;
                KSerializer kSerializer3 = (KSerializer) this.f14794c;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                mr.g gVar = (mr.g) this.f14796e;
                CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(gVar);
                boolean zDecodeSequentially = compositeDecoderBeginStructure.decodeSequentially();
                KSerializer kSerializer4 = this.f14793b;
                if (zDecodeSequentially) {
                    Object objDecodeSerializableElement = compositeDecoderBeginStructure.decodeSerializableElement(gVar, 0, kSerializer4, null);
                    Object objDecodeSerializableElement2 = compositeDecoderBeginStructure.decodeSerializableElement(gVar, 1, kSerializer3, null);
                    Object objDecodeSerializableElement3 = compositeDecoderBeginStructure.decodeSerializableElement(gVar, 2, kSerializer2, null);
                    compositeDecoderBeginStructure.endStructure(gVar);
                    return new v(objDecodeSerializableElement, objDecodeSerializableElement2, objDecodeSerializableElement3);
                }
                Object obj = e1.f17529c;
                Object objDecodeSerializableElement4 = obj;
                Object objDecodeSerializableElement5 = objDecodeSerializableElement4;
                Object objDecodeSerializableElement6 = objDecodeSerializableElement5;
                while (true) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(gVar);
                    if (iDecodeElementIndex == -1) {
                        compositeDecoderBeginStructure.endStructure(gVar);
                        if (objDecodeSerializableElement4 == obj) {
                            throw new g("Element 'first' is missing");
                        }
                        if (objDecodeSerializableElement5 == obj) {
                            throw new g("Element 'second' is missing");
                        }
                        if (objDecodeSerializableElement6 != obj) {
                            return new v(objDecodeSerializableElement4, objDecodeSerializableElement5, objDecodeSerializableElement6);
                        }
                        throw new g("Element 'third' is missing");
                    }
                    if (iDecodeElementIndex == 0) {
                        objDecodeSerializableElement4 = compositeDecoderBeginStructure.decodeSerializableElement(gVar, 0, kSerializer4, null);
                    } else if (iDecodeElementIndex == 1) {
                        objDecodeSerializableElement5 = compositeDecoderBeginStructure.decodeSerializableElement(gVar, 1, kSerializer3, null);
                    } else {
                        if (iDecodeElementIndex != 2) {
                            throw new g(kk.b.h(iDecodeElementIndex, "Unexpected index "));
                        }
                        objDecodeSerializableElement6 = compositeDecoderBeginStructure.decodeSerializableElement(gVar, 2, kSerializer2, null);
                    }
                }
                break;
        }
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        switch (this.f14792a) {
            case 0:
                return (mr.b) this.f14796e;
            default:
                return (mr.g) this.f14796e;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object value) {
        switch (this.f14792a) {
            case 0:
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerializersModule serializersModule = encoder.getSerializersModule();
                KClass kClass = (KClass) this.f14794c;
                serializersModule.b(kClass, (List) this.f14795d);
                KSerializer kSerializer = this.f14793b;
                if (kSerializer != null) {
                    encoder.y(kSerializer, value);
                    return;
                } else {
                    Intrinsics.checkNotNullParameter(kClass, "<this>");
                    throw new g(e1.j(kClass));
                }
            default:
                v value2 = (v) value;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value2, "value");
                mr.g gVar = (mr.g) this.f14796e;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(gVar);
                compositeEncoderBeginStructure.g(gVar, 0, this.f14793b, value2.f19497d);
                compositeEncoderBeginStructure.g(gVar, 1, (KSerializer) this.f14794c, value2.f19498e);
                compositeEncoderBeginStructure.g(gVar, 2, (KSerializer) this.f14795d, value2.f19499i);
                compositeEncoderBeginStructure.endStructure(gVar);
                return;
        }
    }

    public a(KSerializer aSerializer, KSerializer bSerializer, KSerializer cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        this.f14793b = aSerializer;
        this.f14794c = bSerializer;
        this.f14795d = cSerializer;
        this.f14796e = m.f("kotlin.Triple", new SerialDescriptor[0], new kotlin.collections.a(11, this));
    }
}
