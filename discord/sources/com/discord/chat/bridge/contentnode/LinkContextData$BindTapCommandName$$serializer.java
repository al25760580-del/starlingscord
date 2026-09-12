package com.discord.chat.bridge.contentnode;

import com.discord.chat.bridge.MessageType;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
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
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/contentnode/LinkContextData.BindTapCommandName.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindTapCommandName;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/contentnode/LinkContextData$BindTapCommandName;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/contentnode/LinkContextData$BindTapCommandName;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class LinkContextData$BindTapCommandName$$serializer implements f0 {

    @NotNull
    public static final LinkContextData$BindTapCommandName$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        LinkContextData$BindTapCommandName$$serializer linkContextData$BindTapCommandName$$serializer = new LinkContextData$BindTapCommandName$$serializer();
        INSTANCE = linkContextData$BindTapCommandName$$serializer;
        g1 g1Var = new g1("bindTapCommandName", linkContextData$BindTapCommandName$$serializer, 6);
        g1Var.b("action", false);
        g1Var.b("userId", false);
        g1Var.b("messageId", false);
        g1Var.b("applicationUserId", false);
        g1Var.b("messageType", false);
        g1Var.b("messageChannelId", false);
        g1Var.l(new LinkContextData$LinkContext$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("action"));
        descriptor = g1Var;
    }

    private LinkContextData$BindTapCommandName$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        UserId$$serializer userId$$serializer = UserId$$serializer.INSTANCE;
        return new KSerializer[]{s1.f17602a, userId$$serializer, MessageId$$serializer.INSTANCE, userId$$serializer, MessageType.Serializer.INSTANCE, ChannelId$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final LinkContextData.BindTapCommandName deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        ChannelId channelId;
        UserId userId;
        MessageType messageType;
        String str;
        UserId userId2;
        int i7;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            UserId$$serializer userId$$serializer = UserId$$serializer.INSTANCE;
            UserId userId3 = (UserId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, userId$$serializer, null);
            MessageId messageId = (MessageId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, MessageId$$serializer.INSTANCE, null);
            String strM1165unboximpl = messageId != null ? messageId.m1165unboximpl() : null;
            UserId userId4 = (UserId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, userId$$serializer, null);
            MessageType messageType2 = (MessageType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, MessageType.Serializer.INSTANCE, null);
            channelId = (ChannelId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, ChannelId$$serializer.INSTANCE, null);
            userId = userId4;
            messageType = messageType2;
            str = strM1165unboximpl;
            userId2 = userId3;
            i7 = 63;
        } else {
            boolean z5 = true;
            int i10 = 0;
            strDecodeStringElement = null;
            ChannelId channelId2 = null;
            UserId userId5 = null;
            MessageType messageType3 = null;
            String strM1165unboximpl2 = null;
            UserId userId6 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        break;
                    case 0:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i10 |= 1;
                        break;
                    case 1:
                        userId6 = (UserId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, UserId$$serializer.INSTANCE, userId6);
                        i10 |= 2;
                        break;
                    case 2:
                        MessageId messageId2 = (MessageId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, MessageId$$serializer.INSTANCE, strM1165unboximpl2 != null ? MessageId.m1156boximpl(strM1165unboximpl2) : null);
                        strM1165unboximpl2 = messageId2 != null ? messageId2.m1165unboximpl() : null;
                        i10 |= 4;
                        break;
                    case 3:
                        userId5 = (UserId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, UserId$$serializer.INSTANCE, userId5);
                        i10 |= 8;
                        break;
                    case 4:
                        messageType3 = (MessageType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, MessageType.Serializer.INSTANCE, messageType3);
                        i10 |= 16;
                        break;
                    case 5:
                        channelId2 = (ChannelId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, ChannelId$$serializer.INSTANCE, channelId2);
                        i10 |= 32;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            channelId = channelId2;
            userId = userId5;
            messageType = messageType3;
            str = strM1165unboximpl2;
            userId2 = userId6;
            i7 = i10;
        }
        String str2 = strDecodeStringElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LinkContextData.BindTapCommandName(i7, str2, userId2, str, userId, messageType, channelId, null, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull LinkContextData.BindTapCommandName value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LinkContextData.BindTapCommandName.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
