package com.discord.chat.input.bridge;

import com.discord.span.utilities.common.BackgroundStyle;
import com.discord.span.utilities.common.BackgroundStyle$$serializer;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/input/bridge/ChatInputNodeStyle.$serializer", "Lor/f0;", "Lcom/discord/chat/input/bridge/ChatInputNodeStyle;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/input/bridge/ChatInputNodeStyle;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/input/bridge/ChatInputNodeStyle;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_input_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class ChatInputNodeStyle$$serializer implements f0 {

    @NotNull
    public static final ChatInputNodeStyle$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ChatInputNodeStyle$$serializer chatInputNodeStyle$$serializer = new ChatInputNodeStyle$$serializer();
        INSTANCE = chatInputNodeStyle$$serializer;
        g1 g1Var = new g1("com.discord.chat.input.bridge.ChatInputNodeStyle", chatInputNodeStyle$$serializer, 4);
        g1Var.b(ViewProps.FONT_SIZE, true);
        g1Var.b(ViewProps.COLOR, false);
        g1Var.b("backgroundStyle", false);
        g1Var.b(ViewProps.FONT_WEIGHT, true);
        descriptor = g1Var;
    }

    private ChatInputNodeStyle$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ChatInputNodeStyle.$childSerializers;
        m0 m0Var = m0.f17573a;
        return new KSerializer[]{b.p(m0Var), m0Var, b.p(BackgroundStyle$$serializer.INSTANCE), b.p((KSerializer) lazyArr[3].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final ChatInputNodeStyle deserialize(@NotNull Decoder decoder) {
        int i7;
        int i10;
        Integer num;
        BackgroundStyle backgroundStyle;
        ChatInputNodeFontWeight chatInputNodeFontWeight;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ChatInputNodeStyle.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, m0.f17573a, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            BackgroundStyle backgroundStyle2 = (BackgroundStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BackgroundStyle$$serializer.INSTANCE, null);
            chatInputNodeFontWeight = (ChatInputNodeFontWeight) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            num = num2;
            backgroundStyle = backgroundStyle2;
            i7 = 15;
            i10 = iDecodeIntElement;
        } else {
            boolean z5 = true;
            int i11 = 0;
            Integer num3 = null;
            BackgroundStyle backgroundStyle3 = null;
            ChatInputNodeFontWeight chatInputNodeFontWeight2 = null;
            int iDecodeIntElement2 = 0;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z5 = false;
                } else if (iDecodeElementIndex == 0) {
                    num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, m0.f17573a, num3);
                    i11 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                    i11 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    backgroundStyle3 = (BackgroundStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BackgroundStyle$$serializer.INSTANCE, backgroundStyle3);
                    i11 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new j(iDecodeElementIndex);
                    }
                    chatInputNodeFontWeight2 = (ChatInputNodeFontWeight) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), chatInputNodeFontWeight2);
                    i11 |= 8;
                }
            }
            i7 = i11;
            i10 = iDecodeIntElement2;
            num = num3;
            backgroundStyle = backgroundStyle3;
            chatInputNodeFontWeight = chatInputNodeFontWeight2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ChatInputNodeStyle(i7, num, i10, backgroundStyle, chatInputNodeFontWeight, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ChatInputNodeStyle value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ChatInputNodeStyle.write$Self$chat_input_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
