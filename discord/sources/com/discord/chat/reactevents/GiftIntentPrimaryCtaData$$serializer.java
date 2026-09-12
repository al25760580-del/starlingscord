package com.discord.chat.reactevents;

import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
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
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/reactevents/GiftIntentPrimaryCtaData.$serializer", "Lor/f0;", "Lcom/discord/chat/reactevents/GiftIntentPrimaryCtaData;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/reactevents/GiftIntentPrimaryCtaData;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/reactevents/GiftIntentPrimaryCtaData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class GiftIntentPrimaryCtaData$$serializer implements f0 {

    @NotNull
    public static final GiftIntentPrimaryCtaData$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        GiftIntentPrimaryCtaData$$serializer giftIntentPrimaryCtaData$$serializer = new GiftIntentPrimaryCtaData$$serializer();
        INSTANCE = giftIntentPrimaryCtaData$$serializer;
        g1 g1Var = new g1("com.discord.chat.reactevents.GiftIntentPrimaryCtaData", giftIntentPrimaryCtaData$$serializer, 3);
        g1Var.b("messageId", false);
        g1Var.b("recipientUserId", false);
        g1Var.b("giftIntentType", false);
        descriptor = g1Var;
    }

    private GiftIntentPrimaryCtaData$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{MessageId$$serializer.INSTANCE, UserId$$serializer.INSTANCE, m0.f17573a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final GiftIntentPrimaryCtaData deserialize(@NotNull Decoder decoder) {
        String strM1165unboximpl;
        int iDecodeIntElement;
        UserId userId;
        int i7;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            MessageId messageId = (MessageId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, MessageId$$serializer.INSTANCE, null);
            strM1165unboximpl = messageId != null ? messageId.m1165unboximpl() : null;
            UserId userId2 = (UserId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, UserId$$serializer.INSTANCE, null);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            userId = userId2;
            i7 = 7;
        } else {
            boolean z5 = true;
            int iDecodeIntElement2 = 0;
            int i10 = 0;
            strM1165unboximpl = null;
            UserId userId3 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z5 = false;
                } else if (iDecodeElementIndex == 0) {
                    MessageId messageId2 = (MessageId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, MessageId$$serializer.INSTANCE, strM1165unboximpl != null ? MessageId.m1156boximpl(strM1165unboximpl) : null);
                    strM1165unboximpl = messageId2 != null ? messageId2.m1165unboximpl() : null;
                    i10 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    userId3 = (UserId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, UserId$$serializer.INSTANCE, userId3);
                    i10 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new j(iDecodeElementIndex);
                    }
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i10 |= 4;
                }
            }
            iDecodeIntElement = iDecodeIntElement2;
            userId = userId3;
            i7 = i10;
        }
        String str = strM1165unboximpl;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GiftIntentPrimaryCtaData(i7, str, userId, iDecodeIntElement, null, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull GiftIntentPrimaryCtaData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        GiftIntentPrimaryCtaData.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
