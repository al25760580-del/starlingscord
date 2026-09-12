package com.discord.notifications.api;

import com.discord.notifications.renderer.NotificationRenderer;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
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
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/notifications/api/DirectReplyMessage.$serializer", "Lor/f0;", "Lcom/discord/notifications/api/DirectReplyMessage;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/notifications/api/DirectReplyMessage;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/notifications/api/DirectReplyMessage;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "notification_api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class DirectReplyMessage$$serializer implements f0 {

    @NotNull
    public static final DirectReplyMessage$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        DirectReplyMessage$$serializer directReplyMessage$$serializer = new DirectReplyMessage$$serializer();
        INSTANCE = directReplyMessage$$serializer;
        g1 g1Var = new g1("com.discord.notifications.api.DirectReplyMessage", directReplyMessage$$serializer, 8);
        g1Var.b(StackTraceHelper.ID_KEY, false);
        g1Var.b("channel_id", false);
        g1Var.b("author", false);
        g1Var.b("content", true);
        g1Var.b("type", true);
        g1Var.b("channelType", true);
        g1Var.b(NotificationRenderer.CHANNEL_NAME, true);
        g1Var.b("guildName", true);
        descriptor = g1Var;
    }

    private DirectReplyMessage$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        s1 s1Var = s1.f17602a;
        KSerializer kSerializerP = b.p(s1Var);
        m0 m0Var = m0.f17573a;
        return new KSerializer[]{MessageId$$serializer.INSTANCE, ChannelId$$serializer.INSTANCE, DirectReplyUser$$serializer.INSTANCE, kSerializerP, b.p(m0Var), b.p(m0Var), b.p(s1Var), b.p(s1Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final DirectReplyMessage deserialize(@NotNull Decoder decoder) {
        String strM1165unboximpl;
        ChannelId channelId;
        int i7;
        DirectReplyUser directReplyUser;
        Integer num;
        String str;
        String str2;
        Integer num2;
        String str3;
        ChannelId channelId2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i10 = 7;
        int i11 = 6;
        Integer num3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            MessageId messageId = (MessageId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, MessageId$$serializer.INSTANCE, null);
            strM1165unboximpl = messageId != null ? messageId.m1165unboximpl() : null;
            ChannelId channelId3 = (ChannelId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, ChannelId$$serializer.INSTANCE, null);
            DirectReplyUser directReplyUser2 = (DirectReplyUser) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, DirectReplyUser$$serializer.INSTANCE, null);
            s1 s1Var = s1.f17602a;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, s1Var, null);
            m0 m0Var = m0.f17573a;
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, m0Var, null);
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, m0Var, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, s1Var, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, s1Var, null);
            str2 = str5;
            num2 = num5;
            str3 = str4;
            num = num4;
            directReplyUser = directReplyUser2;
            channelId = channelId3;
            i7 = 255;
        } else {
            boolean z5 = true;
            int i12 = 0;
            strM1165unboximpl = null;
            DirectReplyUser directReplyUser3 = null;
            String str6 = null;
            String str7 = null;
            Integer num6 = null;
            String str8 = null;
            ChannelId channelId4 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        i10 = 7;
                        i11 = 6;
                        break;
                    case 0:
                        channelId2 = channelId4;
                        MessageId messageId2 = (MessageId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, MessageId$$serializer.INSTANCE, strM1165unboximpl != null ? MessageId.m1156boximpl(strM1165unboximpl) : null);
                        strM1165unboximpl = messageId2 != null ? messageId2.m1165unboximpl() : null;
                        i12 |= 1;
                        channelId4 = channelId2;
                        i10 = 7;
                        i11 = 6;
                        break;
                    case 1:
                        channelId2 = (ChannelId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, ChannelId$$serializer.INSTANCE, channelId4);
                        i12 |= 2;
                        channelId4 = channelId2;
                        i10 = 7;
                        i11 = 6;
                        break;
                    case 2:
                        directReplyUser3 = (DirectReplyUser) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, DirectReplyUser$$serializer.INSTANCE, directReplyUser3);
                        i12 |= 4;
                        i10 = 7;
                        break;
                    case 3:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, s1.f17602a, str8);
                        i12 |= 8;
                        break;
                    case 4:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, m0.f17573a, num3);
                        i12 |= 16;
                        break;
                    case 5:
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, m0.f17573a, num6);
                        i12 |= 32;
                        break;
                    case 6:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i11, s1.f17602a, str7);
                        i12 |= 64;
                        break;
                    case 7:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i10, s1.f17602a, str6);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            channelId = channelId4;
            i7 = i12;
            directReplyUser = directReplyUser3;
            num = num3;
            str = str6;
            str2 = str7;
            num2 = num6;
            str3 = str8;
        }
        String str9 = strM1165unboximpl;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DirectReplyMessage(i7, str9, channelId, directReplyUser, str3, num, num2, str2, str, null, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull DirectReplyMessage value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DirectReplyMessage.write$Self$notification_api_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
