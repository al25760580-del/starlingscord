package com.discord.chat.bridge.reaction;

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
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/reaction/ThemedBurstReactionColorPalette;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class ThemedBurstReactionColorPalette$$serializer implements f0 {

    @NotNull
    public static final ThemedBurstReactionColorPalette$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ThemedBurstReactionColorPalette$$serializer themedBurstReactionColorPalette$$serializer = new ThemedBurstReactionColorPalette$$serializer();
        INSTANCE = themedBurstReactionColorPalette$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.reaction.ThemedBurstReactionColorPalette", themedBurstReactionColorPalette$$serializer, 2);
        g1Var.b("LIGHT", false);
        g1Var.b("DARK", false);
        descriptor = g1Var;
    }

    private ThemedBurstReactionColorPalette$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        BurstReactionColorPalette$$serializer burstReactionColorPalette$$serializer = BurstReactionColorPalette$$serializer.INSTANCE;
        return new KSerializer[]{burstReactionColorPalette$$serializer, burstReactionColorPalette$$serializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final ThemedBurstReactionColorPalette deserialize(@NotNull Decoder decoder) {
        BurstReactionColorPalette burstReactionColorPalette;
        int i7;
        BurstReactionColorPalette burstReactionColorPalette2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        SerializationConstructorMarker serializationConstructorMarker = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            BurstReactionColorPalette$$serializer burstReactionColorPalette$$serializer = BurstReactionColorPalette$$serializer.INSTANCE;
            burstReactionColorPalette2 = (BurstReactionColorPalette) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, burstReactionColorPalette$$serializer, null);
            burstReactionColorPalette = (BurstReactionColorPalette) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, burstReactionColorPalette$$serializer, null);
            i7 = 3;
        } else {
            boolean z5 = true;
            int i10 = 0;
            burstReactionColorPalette = null;
            BurstReactionColorPalette burstReactionColorPalette3 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z5 = false;
                } else if (iDecodeElementIndex == 0) {
                    burstReactionColorPalette3 = (BurstReactionColorPalette) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, BurstReactionColorPalette$$serializer.INSTANCE, burstReactionColorPalette3);
                    i10 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new j(iDecodeElementIndex);
                    }
                    burstReactionColorPalette = (BurstReactionColorPalette) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, BurstReactionColorPalette$$serializer.INSTANCE, burstReactionColorPalette);
                    i10 |= 2;
                }
            }
            i7 = i10;
            burstReactionColorPalette2 = burstReactionColorPalette3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ThemedBurstReactionColorPalette(i7, burstReactionColorPalette2, burstReactionColorPalette, serializationConstructorMarker);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ThemedBurstReactionColorPalette value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ThemedBurstReactionColorPalette.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
