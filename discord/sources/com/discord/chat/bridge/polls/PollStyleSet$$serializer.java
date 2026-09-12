package com.discord.chat.bridge.polls;

import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.j;
import or.e0;
import or.e1;
import or.f0;
import or.g1;
import or.m0;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/polls/PollStyleSet.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/polls/PollStyleSet;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/polls/PollStyleSet;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/polls/PollStyleSet;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class PollStyleSet$$serializer implements f0 {

    @NotNull
    public static final PollStyleSet$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PollStyleSet$$serializer pollStyleSet$$serializer = new PollStyleSet$$serializer();
        INSTANCE = pollStyleSet$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.polls.PollStyleSet", pollStyleSet$$serializer, 10);
        g1Var.b("border", true);
        g1Var.b(ViewProps.BORDER_WIDTH, true);
        g1Var.b("fill", true);
        g1Var.b("label", true);
        g1Var.b(ViewProps.OPACITY, true);
        g1Var.b("answerBackground", true);
        g1Var.b("answerFill", true);
        g1Var.b("radioStyle", true);
        g1Var.b("radioBackground", true);
        g1Var.b("radioForeground", true);
        descriptor = g1Var;
    }

    private PollStyleSet$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        m0 m0Var = m0.f17573a;
        return new KSerializer[]{b.p(m0Var), m0Var, b.p(m0Var), b.p(m0Var), e0.f17525a, b.p(m0Var), b.p(m0Var), b.p(PollRadioStyle.Serializer.INSTANCE), b.p(m0Var), b.p(m0Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final PollStyleSet deserialize(@NotNull Decoder decoder) {
        int i7;
        Integer num;
        Integer num2;
        Integer num3;
        PollRadioStyle pollRadioStyle;
        Integer num4;
        Integer num5;
        Integer num6;
        float f2;
        int i10;
        Integer num7;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i11 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            m0 m0Var = m0.f17573a;
            Integer num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, m0Var, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            Integer num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, m0Var, null);
            Integer num10 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, m0Var, null);
            float fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, 4);
            Integer num11 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, m0Var, null);
            Integer num12 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, m0Var, null);
            PollRadioStyle pollRadioStyle2 = (PollRadioStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, PollRadioStyle.Serializer.INSTANCE, null);
            Integer num13 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, m0Var, null);
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, m0Var, null);
            i7 = 1023;
            pollRadioStyle = pollRadioStyle2;
            num3 = num12;
            num4 = num11;
            num5 = num10;
            num2 = num13;
            f2 = fDecodeFloatElement;
            num6 = num9;
            i10 = iDecodeIntElement;
            num7 = num8;
        } else {
            boolean z5 = true;
            int iDecodeIntElement2 = 0;
            Integer num14 = null;
            Integer num15 = null;
            Integer num16 = null;
            PollRadioStyle pollRadioStyle3 = null;
            Integer num17 = null;
            Integer num18 = null;
            Integer num19 = null;
            float fDecodeFloatElement2 = 0.0f;
            int i12 = 0;
            Integer num20 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        break;
                    case 0:
                        num19 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, m0.f17573a, num19);
                        i12 |= 1;
                        i11 = 9;
                        break;
                    case 1:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i12 |= 2;
                        i11 = 9;
                        break;
                    case 2:
                        num20 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, m0.f17573a, num20);
                        i12 |= 4;
                        i11 = 9;
                        break;
                    case 3:
                        num18 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, m0.f17573a, num18);
                        i12 |= 8;
                        i11 = 9;
                        break;
                    case 4:
                        fDecodeFloatElement2 = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, 4);
                        i12 |= 16;
                        i11 = 9;
                        break;
                    case 5:
                        num17 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, m0.f17573a, num17);
                        i12 |= 32;
                        i11 = 9;
                        break;
                    case 6:
                        num16 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, m0.f17573a, num16);
                        i12 |= 64;
                        i11 = 9;
                        break;
                    case 7:
                        pollRadioStyle3 = (PollRadioStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, PollRadioStyle.Serializer.INSTANCE, pollRadioStyle3);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        i11 = 9;
                        break;
                    case 8:
                        num15 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, m0.f17573a, num15);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    case 9:
                        num14 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i11, m0.f17573a, num14);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            i7 = i12;
            num = num14;
            num2 = num15;
            num3 = num16;
            pollRadioStyle = pollRadioStyle3;
            num4 = num17;
            num5 = num18;
            num6 = num20;
            f2 = fDecodeFloatElement2;
            i10 = iDecodeIntElement2;
            num7 = num19;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PollStyleSet(i7, num7, i10, num6, num5, f2, num4, num3, pollRadioStyle, num2, num, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull PollStyleSet value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PollStyleSet.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
