package com.discord.chat.reactevents;

import com.facebook.imagepipeline.nativecode.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kr.j;
import or.e1;
import or.f0;
import or.g1;
import or.m0;
import or.w;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/reactevents/FirstLayoutData.$serializer", "Lor/f0;", "Lcom/discord/chat/reactevents/FirstLayoutData;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/reactevents/FirstLayoutData;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/reactevents/FirstLayoutData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class FirstLayoutData$$serializer implements f0 {

    @NotNull
    public static final FirstLayoutData$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        FirstLayoutData$$serializer firstLayoutData$$serializer = new FirstLayoutData$$serializer();
        INSTANCE = firstLayoutData$$serializer;
        g1 g1Var = new g1("com.discord.chat.reactevents.FirstLayoutData", firstLayoutData$$serializer, 4);
        g1Var.b("firstVisibleMessageIndex", false);
        g1Var.b("firstVisibleMessagePercentVisible", false);
        g1Var.b("lastVisibleMessageIndex", false);
        g1Var.b("lastVisibleMessagePercentVisible", false);
        descriptor = g1Var;
    }

    private FirstLayoutData$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        w wVar = w.f17621a;
        KSerializer kSerializerP = b.p(wVar);
        KSerializer kSerializerP2 = b.p(wVar);
        m0 m0Var = m0.f17573a;
        return new KSerializer[]{m0Var, kSerializerP, m0Var, kSerializerP2};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final FirstLayoutData deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        int i7;
        int i10;
        Double d6;
        Double d7;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            w wVar = w.f17621a;
            Double d8 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, wVar, null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            d7 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, wVar, null);
            i7 = iDecodeIntElement2;
            d6 = d8;
            i10 = 15;
        } else {
            boolean z5 = true;
            iDecodeIntElement = 0;
            int i11 = 0;
            Double d9 = null;
            Double d10 = null;
            int iDecodeIntElement3 = 0;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z5 = false;
                } else if (iDecodeElementIndex == 0) {
                    iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    d9 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, w.f17621a, d9);
                    i11 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i11 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new j(iDecodeElementIndex);
                    }
                    d10 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, w.f17621a, d10);
                    i11 |= 8;
                }
            }
            i7 = iDecodeIntElement3;
            i10 = i11;
            d6 = d9;
            d7 = d10;
        }
        int i12 = iDecodeIntElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FirstLayoutData(i10, i12, d6, i7, d7, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull FirstLayoutData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        FirstLayoutData.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
