package com.discord.chat.reactevents;

import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
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
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/reactevents/TapSoundmojiData.$serializer", "Lor/f0;", "Lcom/discord/chat/reactevents/TapSoundmojiData;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/reactevents/TapSoundmojiData;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/reactevents/TapSoundmojiData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class TapSoundmojiData$$serializer implements f0 {

    @NotNull
    public static final TapSoundmojiData$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        TapSoundmojiData$$serializer tapSoundmojiData$$serializer = new TapSoundmojiData$$serializer();
        INSTANCE = tapSoundmojiData$$serializer;
        g1 g1Var = new g1("com.discord.chat.reactevents.TapSoundmojiData", tapSoundmojiData$$serializer, 4);
        g1Var.b("soundId", false);
        g1Var.b("channelId", false);
        g1Var.b("guildId", true);
        g1Var.b("messageId", true);
        descriptor = g1Var;
    }

    private TapSoundmojiData$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        s1 s1Var = s1.f17602a;
        return new KSerializer[]{s1Var, s1Var, b.p(s1Var), b.p(MessageId$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final TapSoundmojiData deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i7;
        String str;
        String str2;
        String strM1165unboximpl;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, s1.f17602a, null);
            MessageId messageId = (MessageId) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, MessageId$$serializer.INSTANCE, null);
            i7 = 15;
            str = str3;
            str2 = strDecodeStringElement2;
            strM1165unboximpl = messageId != null ? messageId.m1165unboximpl() : null;
        } else {
            boolean z5 = true;
            int i10 = 0;
            strDecodeStringElement = null;
            String str4 = null;
            String strDecodeStringElement3 = null;
            String strM1165unboximpl2 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z5 = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i10 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i10 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, s1.f17602a, str4);
                    i10 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new j(iDecodeElementIndex);
                    }
                    MessageId messageId2 = (MessageId) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, MessageId$$serializer.INSTANCE, strM1165unboximpl2 != null ? MessageId.m1156boximpl(strM1165unboximpl2) : null);
                    strM1165unboximpl2 = messageId2 != null ? messageId2.m1165unboximpl() : null;
                    i10 |= 8;
                }
            }
            i7 = i10;
            str = str4;
            str2 = strDecodeStringElement3;
            strM1165unboximpl = strM1165unboximpl2;
        }
        String str5 = strDecodeStringElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TapSoundmojiData(i7, str5, str2, str, strM1165unboximpl, null, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull TapSoundmojiData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TapSoundmojiData.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
