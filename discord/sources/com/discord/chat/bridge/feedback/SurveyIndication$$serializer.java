package com.discord.chat.bridge.feedback;

import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
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
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/feedback/SurveyIndication.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/feedback/SurveyIndication;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/feedback/SurveyIndication;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/feedback/SurveyIndication;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class SurveyIndication$$serializer implements f0 {

    @NotNull
    public static final SurveyIndication$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SurveyIndication$$serializer surveyIndication$$serializer = new SurveyIndication$$serializer();
        INSTANCE = surveyIndication$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.feedback.SurveyIndication", surveyIndication$$serializer, 2);
        g1Var.b("content", false);
        g1Var.b("feedbackIconUrl", false);
        descriptor = g1Var;
    }

    private SurveyIndication$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{StructurableTextSerializer.INSTANCE, s1.f17602a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SurveyIndication deserialize(@NotNull Decoder decoder) {
        StructurableText structurableText;
        String strDecodeStringElement;
        int i7;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            structurableText = (StructurableText) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, StructurableTextSerializer.INSTANCE, null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            i7 = 3;
        } else {
            boolean z5 = true;
            int i10 = 0;
            structurableText = null;
            String strDecodeStringElement2 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z5 = false;
                } else if (iDecodeElementIndex == 0) {
                    structurableText = (StructurableText) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, StructurableTextSerializer.INSTANCE, structurableText);
                    i10 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new j(iDecodeElementIndex);
                    }
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i10 |= 2;
                }
            }
            strDecodeStringElement = strDecodeStringElement2;
            i7 = i10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SurveyIndication(i7, structurableText, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull SurveyIndication value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SurveyIndication.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
