package com.discord.chat.bridge.automod;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import com.discord.notifications.renderer.NotificationRenderer;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
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
import or.g;
import or.g1;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/automod/FlaggedMessageEmbed.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/automod/FlaggedMessageEmbed;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class FlaggedMessageEmbed$$serializer implements f0 {

    @NotNull
    public static final FlaggedMessageEmbed$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        FlaggedMessageEmbed$$serializer flaggedMessageEmbed$$serializer = new FlaggedMessageEmbed$$serializer();
        INSTANCE = flaggedMessageEmbed$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.automod.FlaggedMessageEmbed", flaggedMessageEmbed$$serializer, 12);
        g1Var.b(StackTraceHelper.ID_KEY, false);
        g1Var.b("channelId", false);
        g1Var.b("guildId", true);
        g1Var.b("userId", true);
        g1Var.b("content", true);
        g1Var.b(NotificationRenderer.CHANNEL_NAME, true);
        g1Var.b(NotificationRenderer.USERNAME, true);
        g1Var.b("usernameColor", false);
        g1Var.b("roleColor", true);
        g1Var.b("shouldShowRoleDot", false);
        g1Var.b("avatarURL", true);
        g1Var.b("communicationDisabled", true);
        descriptor = g1Var;
    }

    private FlaggedMessageEmbed$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerP = b.p(GuildId$$serializer.INSTANCE);
        KSerializer kSerializerP2 = b.p(UserId$$serializer.INSTANCE);
        KSerializer kSerializerP3 = b.p(StructurableTextSerializer.INSTANCE);
        s1 s1Var = s1.f17602a;
        KSerializer kSerializerP4 = b.p(s1Var);
        KSerializer kSerializerP5 = b.p(s1Var);
        m0 m0Var = m0.f17573a;
        KSerializer kSerializerP6 = b.p(m0Var);
        g gVar = g.f17537a;
        return new KSerializer[]{MessageId$$serializer.INSTANCE, ChannelId$$serializer.INSTANCE, kSerializerP, kSerializerP2, kSerializerP3, kSerializerP4, kSerializerP5, m0Var, kSerializerP6, gVar, b.p(s1Var), b.p(gVar)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final FlaggedMessageEmbed deserialize(@NotNull Decoder decoder) {
        String strM1165unboximpl;
        Integer num;
        StructurableText structurableText;
        GuildId guildId;
        ChannelId channelId;
        Boolean bool;
        int i7;
        UserId userId;
        String str;
        String str2;
        String str3;
        boolean z5;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i11 = 10;
        int i12 = 9;
        int i13 = 7;
        char c8 = 6;
        String str4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            MessageId messageId = (MessageId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, MessageId$$serializer.INSTANCE, null);
            strM1165unboximpl = messageId != null ? messageId.m1165unboximpl() : null;
            ChannelId channelId2 = (ChannelId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, ChannelId$$serializer.INSTANCE, null);
            GuildId guildId2 = (GuildId) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, GuildId$$serializer.INSTANCE, null);
            UserId userId2 = (UserId) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, UserId$$serializer.INSTANCE, null);
            StructurableText structurableText2 = (StructurableText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StructurableTextSerializer.INSTANCE, null);
            s1 s1Var = s1.f17602a;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, s1Var, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, s1Var, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, m0.f17573a, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, s1Var, null);
            z5 = zDecodeBooleanElement;
            i10 = iDecodeIntElement;
            str2 = str6;
            str = str5;
            userId = userId2;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, g.f17537a, null);
            structurableText = structurableText2;
            guildId = guildId2;
            channelId = channelId2;
            i7 = 4095;
        } else {
            boolean z6 = true;
            int i14 = 0;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement2 = 0;
            strM1165unboximpl = null;
            num = null;
            Boolean bool2 = null;
            UserId userId3 = null;
            String str7 = null;
            String str8 = null;
            StructurableText structurableText3 = null;
            GuildId guildId3 = null;
            ChannelId channelId3 = null;
            while (z6) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z6 = false;
                        i11 = 10;
                        i12 = 9;
                        i13 = 7;
                        c8 = 6;
                        break;
                    case 0:
                        StructurableText structurableText4 = structurableText3;
                        GuildId guildId4 = guildId3;
                        ChannelId channelId4 = channelId3;
                        MessageId messageId2 = (MessageId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, MessageId$$serializer.INSTANCE, strM1165unboximpl != null ? MessageId.m1156boximpl(strM1165unboximpl) : null);
                        strM1165unboximpl = messageId2 != null ? messageId2.m1165unboximpl() : null;
                        i14 |= 1;
                        structurableText3 = structurableText4;
                        guildId3 = guildId4;
                        channelId3 = channelId4;
                        i11 = 10;
                        i12 = 9;
                        i13 = 7;
                        c8 = 6;
                        break;
                    case 1:
                        channelId3 = (ChannelId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, ChannelId$$serializer.INSTANCE, channelId3);
                        i14 |= 2;
                        i11 = 10;
                        i12 = 9;
                        i13 = 7;
                        c8 = 6;
                        break;
                    case 2:
                        guildId3 = (GuildId) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, GuildId$$serializer.INSTANCE, guildId3);
                        i14 |= 4;
                        i11 = 10;
                        i12 = 9;
                        i13 = 7;
                        c8 = 6;
                        break;
                    case 3:
                        userId3 = (UserId) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, UserId$$serializer.INSTANCE, userId3);
                        i14 |= 8;
                        i11 = 10;
                        i12 = 9;
                        c8 = 6;
                        break;
                    case 4:
                        i14 |= 16;
                        structurableText3 = (StructurableText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StructurableTextSerializer.INSTANCE, structurableText3);
                        i11 = 10;
                        i12 = 9;
                        c8 = 6;
                        break;
                    case 5:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, s1.f17602a, str7);
                        i14 |= 32;
                        i11 = 10;
                        c8 = 6;
                        break;
                    case 6:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, s1.f17602a, str8);
                        i14 |= 64;
                        c8 = 6;
                        i11 = 10;
                        break;
                    case 7:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i13);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        c8 = 6;
                        break;
                    case 8:
                        num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, m0.f17573a, num);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        c8 = 6;
                        break;
                    case 9:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i12);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        c8 = 6;
                        break;
                    case 10:
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i11, s1.f17602a, str4);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        c8 = 6;
                        break;
                    case 11:
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, g.f17537a, bool2);
                        i14 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        c8 = 6;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            structurableText = structurableText3;
            guildId = guildId3;
            channelId = channelId3;
            bool = bool2;
            i7 = i14;
            userId = userId3;
            str = str7;
            str2 = str8;
            str3 = str4;
            z5 = zDecodeBooleanElement2;
            i10 = iDecodeIntElement2;
        }
        String str9 = strM1165unboximpl;
        Integer num2 = num;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FlaggedMessageEmbed(i7, str9, channelId, guildId, userId, structurableText, str, str2, i10, num2, z5, str3, bool, null, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull FlaggedMessageEmbed value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        FlaggedMessageEmbed.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
