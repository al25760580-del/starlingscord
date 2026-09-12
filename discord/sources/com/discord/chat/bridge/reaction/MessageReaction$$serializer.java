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
import kr.j;
import or.e1;
import or.f0;
import or.g;
import or.g1;
import or.m0;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/reaction/MessageReaction.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/reaction/MessageReaction;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/reaction/MessageReaction;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/reaction/MessageReaction;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class MessageReaction$$serializer implements f0 {

    @NotNull
    public static final MessageReaction$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        MessageReaction$$serializer messageReaction$$serializer = new MessageReaction$$serializer();
        INSTANCE = messageReaction$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.reaction.MessageReaction", messageReaction$$serializer, 7);
        g1Var.b("count", false);
        g1Var.b("me", false);
        g1Var.b("me_burst", true);
        g1Var.b("emoji", false);
        g1Var.b("burst_count", true);
        g1Var.b("themedBurstColors", true);
        g1Var.b("isMe", true);
        descriptor = g1Var;
    }

    private MessageReaction$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerP = b.p(ThemedBurstReactionColorPalette$$serializer.INSTANCE);
        m0 m0Var = m0.f17573a;
        g gVar = g.f17537a;
        return new KSerializer[]{m0Var, gVar, gVar, MessageReactionEmoji$$serializer.INSTANCE, m0Var, kSerializerP, gVar};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final MessageReaction deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        ThemedBurstReactionColorPalette themedBurstReactionColorPalette;
        boolean zDecodeBooleanElement;
        int i7;
        boolean z5;
        boolean z6;
        int i10;
        MessageReactionEmoji messageReactionEmoji;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            MessageReactionEmoji messageReactionEmoji2 = (MessageReactionEmoji) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, MessageReactionEmoji$$serializer.INSTANCE, null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            ThemedBurstReactionColorPalette themedBurstReactionColorPalette2 = (ThemedBurstReactionColorPalette) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, ThemedBurstReactionColorPalette$$serializer.INSTANCE, null);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            themedBurstReactionColorPalette = themedBurstReactionColorPalette2;
            messageReactionEmoji = messageReactionEmoji2;
            i7 = iDecodeIntElement2;
            z5 = zDecodeBooleanElement3;
            z6 = zDecodeBooleanElement2;
            i10 = 127;
        } else {
            boolean z7 = true;
            iDecodeIntElement = 0;
            int iDecodeIntElement3 = 0;
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            int i11 = 0;
            MessageReactionEmoji messageReactionEmoji3 = null;
            boolean zDecodeBooleanElement6 = false;
            ThemedBurstReactionColorPalette themedBurstReactionColorPalette3 = null;
            while (z7) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z7 = false;
                        break;
                    case 0:
                        i11 |= 1;
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        continue;
                    case 1:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i11 |= 2;
                        continue;
                    case 2:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                        i11 |= 4;
                        break;
                    case 3:
                        messageReactionEmoji3 = (MessageReactionEmoji) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, MessageReactionEmoji$$serializer.INSTANCE, messageReactionEmoji3);
                        i11 |= 8;
                        break;
                    case 4:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i11 |= 16;
                        break;
                    case 5:
                        themedBurstReactionColorPalette3 = (ThemedBurstReactionColorPalette) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, ThemedBurstReactionColorPalette$$serializer.INSTANCE, themedBurstReactionColorPalette3);
                        i11 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i11 |= 64;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            themedBurstReactionColorPalette = themedBurstReactionColorPalette3;
            zDecodeBooleanElement = zDecodeBooleanElement6;
            i7 = iDecodeIntElement3;
            z5 = zDecodeBooleanElement4;
            z6 = zDecodeBooleanElement5;
            i10 = i11;
            messageReactionEmoji = messageReactionEmoji3;
        }
        int i12 = iDecodeIntElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MessageReaction(i10, i12, z6, z5, messageReactionEmoji, i7, themedBurstReactionColorPalette, zDecodeBooleanElement, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull MessageReaction value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MessageReaction.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
