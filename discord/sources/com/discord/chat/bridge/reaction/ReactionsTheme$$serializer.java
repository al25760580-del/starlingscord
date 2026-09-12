package com.discord.chat.bridge.reaction;

import com.facebook.imagepipeline.nativecode.b;
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
import or.e1;
import or.f0;
import or.g1;
import or.m0;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/reaction/ReactionsTheme.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/reaction/ReactionsTheme;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/reaction/ReactionsTheme;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class ReactionsTheme$$serializer implements f0 {

    @NotNull
    public static final ReactionsTheme$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ReactionsTheme$$serializer reactionsTheme$$serializer = new ReactionsTheme$$serializer();
        INSTANCE = reactionsTheme$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.reaction.ReactionsTheme", reactionsTheme$$serializer, 6);
        g1Var.b("reactionBackgroundColor", true);
        g1Var.b("reactionBorderColor", true);
        g1Var.b("reactionTextColor", true);
        g1Var.b("activeReactionBackgroundColor", true);
        g1Var.b("activeReactionBorderColor", true);
        g1Var.b("activeReactionTextColor", true);
        descriptor = g1Var;
    }

    private ReactionsTheme$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        m0 m0Var = m0.f17573a;
        return new KSerializer[]{b.p(m0Var), b.p(m0Var), b.p(m0Var), b.p(m0Var), b.p(m0Var), b.p(m0Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final ReactionsTheme deserialize(@NotNull Decoder decoder) {
        int i7;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i10 = 5;
        Integer num7 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            m0 m0Var = m0.f17573a;
            Integer num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, m0Var, null);
            Integer num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, m0Var, null);
            Integer num10 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, m0Var, null);
            Integer num11 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, m0Var, null);
            Integer num12 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, m0Var, null);
            num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, m0Var, null);
            i7 = 63;
            num4 = num11;
            num5 = num12;
            num3 = num10;
            num2 = num9;
            num = num8;
        } else {
            boolean z5 = true;
            int i11 = 0;
            Integer num13 = null;
            Integer num14 = null;
            Integer num15 = null;
            Integer num16 = null;
            Integer num17 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        i10 = 5;
                        break;
                    case 0:
                        num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, m0.f17573a, num7);
                        i11 |= 1;
                        i10 = 5;
                        break;
                    case 1:
                        num13 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, m0.f17573a, num13);
                        i11 |= 2;
                        break;
                    case 2:
                        num14 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, m0.f17573a, num14);
                        i11 |= 4;
                        break;
                    case 3:
                        num15 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, m0.f17573a, num15);
                        i11 |= 8;
                        break;
                    case 4:
                        num16 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, m0.f17573a, num16);
                        i11 |= 16;
                        break;
                    case 5:
                        num17 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i10, m0.f17573a, num17);
                        i11 |= 32;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            i7 = i11;
            num = num7;
            num2 = num13;
            num3 = num14;
            num4 = num15;
            num5 = num16;
            num6 = num17;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ReactionsTheme(i7, num, num2, num3, num4, num5, num6, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ReactionsTheme value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ReactionsTheme.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
