package com.discord.chat.bridge.contentnode;

import com.discord.chat.bridge.rolecolors.RoleColors;
import com.discord.chat.bridge.rolecolors.RoleColors$$serializer;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.discord.primitives.RoleId;
import com.discord.primitives.RoleId$$serializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;
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
import kr.j;
import or.e1;
import or.f0;
import or.g1;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/contentnode/UserOrRoleMentionContentNode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class UserOrRoleMentionContentNode$$serializer implements f0 {

    @NotNull
    public static final UserOrRoleMentionContentNode$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        UserOrRoleMentionContentNode$$serializer userOrRoleMentionContentNode$$serializer = new UserOrRoleMentionContentNode$$serializer();
        INSTANCE = userOrRoleMentionContentNode$$serializer;
        g1 g1Var = new g1("mention", userOrRoleMentionContentNode$$serializer, 9);
        g1Var.b("channelId", true);
        g1Var.b("userId", true);
        g1Var.b("roleName", true);
        g1Var.b("parsedUserId", true);
        g1Var.b("roleColor", true);
        g1Var.b("roleColors", true);
        g1Var.b("guildId", true);
        g1Var.b("roleId", true);
        g1Var.b("content", false);
        descriptor = g1Var;
    }

    private UserOrRoleMentionContentNode$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = UserOrRoleMentionContentNode.$childSerializers;
        s1 s1Var = s1.f17602a;
        return new KSerializer[]{b.p(ChannelId$$serializer.INSTANCE), b.p(UserId$$serializer.INSTANCE), b.p(s1Var), b.p(s1Var), m0.f17573a, b.p(RoleColors$$serializer.INSTANCE), b.p(GuildId$$serializer.INSTANCE), b.p(RoleId$$serializer.INSTANCE), lazyArr[8].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final UserOrRoleMentionContentNode deserialize(@NotNull Decoder decoder) {
        int i7;
        List list;
        GuildId guildId;
        RoleId roleId;
        RoleColors roleColors;
        String str;
        String str2;
        int i10;
        ChannelId channelId;
        UserId userId;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = UserOrRoleMentionContentNode.$childSerializers;
        int i11 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            ChannelId channelId2 = (ChannelId) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, ChannelId$$serializer.INSTANCE, null);
            UserId userId2 = (UserId) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, UserId$$serializer.INSTANCE, null);
            s1 s1Var = s1.f17602a;
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, s1Var, null);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, s1Var, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            RoleColors roleColors2 = (RoleColors) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, RoleColors$$serializer.INSTANCE, null);
            GuildId guildId2 = (GuildId) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, GuildId$$serializer.INSTANCE, null);
            RoleId roleId2 = (RoleId) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, RoleId$$serializer.INSTANCE, null);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, (DeserializationStrategy) lazyArr[8].getValue(), null);
            channelId = channelId2;
            roleId = roleId2;
            guildId = guildId2;
            roleColors = roleColors2;
            str = str4;
            i7 = iDecodeIntElement;
            str2 = str3;
            i10 = 511;
            userId = userId2;
        } else {
            boolean z5 = true;
            int iDecodeIntElement2 = 0;
            List list2 = null;
            GuildId guildId3 = null;
            RoleId roleId3 = null;
            RoleColors roleColors3 = null;
            String str5 = null;
            ChannelId channelId3 = null;
            UserId userId3 = null;
            int i12 = 0;
            String str6 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        break;
                    case 0:
                        channelId3 = (ChannelId) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, ChannelId$$serializer.INSTANCE, channelId3);
                        i12 |= 1;
                        i11 = 7;
                        break;
                    case 1:
                        userId3 = (UserId) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, UserId$$serializer.INSTANCE, userId3);
                        i12 |= 2;
                        i11 = 7;
                        break;
                    case 2:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, s1.f17602a, str6);
                        i12 |= 4;
                        i11 = 7;
                        break;
                    case 3:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, s1.f17602a, str5);
                        i12 |= 8;
                        i11 = 7;
                        break;
                    case 4:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i12 |= 16;
                        i11 = 7;
                        break;
                    case 5:
                        roleColors3 = (RoleColors) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, RoleColors$$serializer.INSTANCE, roleColors3);
                        i12 |= 32;
                        i11 = 7;
                        break;
                    case 6:
                        guildId3 = (GuildId) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, GuildId$$serializer.INSTANCE, guildId3);
                        i12 |= 64;
                        i11 = 7;
                        break;
                    case 7:
                        roleId3 = (RoleId) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i11, RoleId$$serializer.INSTANCE, roleId3);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    case 8:
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, (DeserializationStrategy) lazyArr[8].getValue(), list2);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            i7 = iDecodeIntElement2;
            list = list2;
            guildId = guildId3;
            roleId = roleId3;
            roleColors = roleColors3;
            str = str5;
            str2 = str6;
            i10 = i12;
            channelId = channelId3;
            userId = userId3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UserOrRoleMentionContentNode(i10, channelId, userId, str2, str, i7, roleColors, guildId, roleId, list, null, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull UserOrRoleMentionContentNode value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UserOrRoleMentionContentNode.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
