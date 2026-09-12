package com.discord.chat.bridge.contentnode;

import com.discord.chat.bridge.rolecolors.RoleColors;
import com.discord.chat.bridge.rolecolors.RoleColors$$serializer;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
import com.facebook.imagepipeline.nativecode.b;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/contentnode/LinkContextData.BindUserMenu.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindUserMenu;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/contentnode/LinkContextData$BindUserMenu;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/contentnode/LinkContextData$BindUserMenu;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class LinkContextData$BindUserMenu$$serializer implements f0 {

    @NotNull
    public static final LinkContextData$BindUserMenu$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        LinkContextData$BindUserMenu$$serializer linkContextData$BindUserMenu$$serializer = new LinkContextData$BindUserMenu$$serializer();
        INSTANCE = linkContextData$BindUserMenu$$serializer;
        g1 g1Var = new g1("bindUserMenu", linkContextData$BindUserMenu$$serializer, 8);
        g1Var.b("action", false);
        g1Var.b("userId", false);
        g1Var.b("linkColor", true);
        g1Var.b("roleColor", true);
        g1Var.b("roleColors", true);
        g1Var.b("shouldShowRoleDot", true);
        g1Var.b("messageChannelId", true);
        g1Var.b("medium", true);
        g1Var.l(new LinkContextData$LinkContext$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("action"));
        descriptor = g1Var;
    }

    private LinkContextData$BindUserMenu$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        m0 m0Var = m0.f17573a;
        KSerializer kSerializerP = b.p(m0Var);
        KSerializer kSerializerP2 = b.p(m0Var);
        KSerializer kSerializerP3 = b.p(RoleColors$$serializer.INSTANCE);
        g gVar = g.f17537a;
        return new KSerializer[]{s1.f17602a, UserId$$serializer.INSTANCE, kSerializerP, kSerializerP2, kSerializerP3, b.p(gVar), b.p(ChannelId$$serializer.INSTANCE), b.p(gVar)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final LinkContextData.BindUserMenu deserialize(@NotNull Decoder decoder) {
        int i7;
        Boolean bool;
        ChannelId channelId;
        Boolean bool2;
        String str;
        UserId userId;
        Integer num;
        Integer num2;
        RoleColors roleColors;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i10 = 7;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            UserId userId2 = (UserId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, UserId$$serializer.INSTANCE, null);
            m0 m0Var = m0.f17573a;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, m0Var, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, m0Var, null);
            RoleColors roleColors2 = (RoleColors) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, RoleColors$$serializer.INSTANCE, null);
            g gVar = g.f17537a;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, gVar, null);
            ChannelId channelId2 = (ChannelId) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, ChannelId$$serializer.INSTANCE, null);
            str = strDecodeStringElement2;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, gVar, null);
            channelId = channelId2;
            bool2 = bool3;
            num2 = num4;
            roleColors = roleColors2;
            num = num3;
            userId = userId2;
            i7 = 255;
        } else {
            boolean z5 = true;
            int i11 = 0;
            Boolean bool4 = null;
            ChannelId channelId3 = null;
            Boolean bool5 = null;
            UserId userId3 = null;
            Integer num5 = null;
            Integer num6 = null;
            RoleColors roleColors3 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        break;
                    case 0:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i11 |= 1;
                        i10 = 7;
                        break;
                    case 1:
                        userId3 = (UserId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, UserId$$serializer.INSTANCE, userId3);
                        i11 |= 2;
                        i10 = 7;
                        break;
                    case 2:
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, m0.f17573a, num5);
                        i11 |= 4;
                        i10 = 7;
                        break;
                    case 3:
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, m0.f17573a, num6);
                        i11 |= 8;
                        i10 = 7;
                        break;
                    case 4:
                        roleColors3 = (RoleColors) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, RoleColors$$serializer.INSTANCE, roleColors3);
                        i11 |= 16;
                        break;
                    case 5:
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, g.f17537a, bool5);
                        i11 |= 32;
                        break;
                    case 6:
                        channelId3 = (ChannelId) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, ChannelId$$serializer.INSTANCE, channelId3);
                        i11 |= 64;
                        break;
                    case 7:
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i10, g.f17537a, bool4);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            i7 = i11;
            bool = bool4;
            channelId = channelId3;
            bool2 = bool5;
            str = strDecodeStringElement;
            userId = userId3;
            num = num5;
            num2 = num6;
            roleColors = roleColors3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LinkContextData.BindUserMenu(i7, str, userId, num, num2, roleColors, bool2, channelId, bool, null, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull LinkContextData.BindUserMenu value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LinkContextData.BindUserMenu.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
