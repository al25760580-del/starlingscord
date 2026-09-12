package com.discord.chat.bridge.postpreviewembed;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.dialog.AlertFragment;
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
import org.webrtc.PeerConnection;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/postpreviewembed/PostPreviewEmbed.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class PostPreviewEmbed$$serializer implements f0 {

    @NotNull
    public static final PostPreviewEmbed$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PostPreviewEmbed$$serializer postPreviewEmbed$$serializer = new PostPreviewEmbed$$serializer();
        INSTANCE = postPreviewEmbed$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed", postPreviewEmbed$$serializer, 22);
        g1Var.b("parentChannelId", false);
        g1Var.b("threadId", false);
        g1Var.b("messageId", false);
        g1Var.b("guildId", false);
        g1Var.b(AlertFragment.ARG_TITLE, false);
        g1Var.b("ctaText", false);
        g1Var.b("ctaButtonColor", false);
        g1Var.b("footer", false);
        g1Var.b("subtitle", true);
        g1Var.b("coverImage", true);
        g1Var.b("blurredCoverImage", true);
        g1Var.b("coverImageOverlayText", true);
        g1Var.b("backgroundImage", true);
        g1Var.b("spoiler", true);
        g1Var.b("obscure", true);
        g1Var.b("obscureAwaitingScan", true);
        g1Var.b("shouldSpoiler", true);
        g1Var.b("obscureHideControls", true);
        g1Var.b("obscureIsOpaque", true);
        g1Var.b("verifyAge", true);
        g1Var.b("spoilerOrNull", true);
        g1Var.b("obscureOrNull", true);
        descriptor = g1Var;
    }

    private PostPreviewEmbed$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        s1 s1Var = s1.f17602a;
        KSerializer kSerializerP = b.p(s1Var);
        KSerializer kSerializerP2 = b.p(s1Var);
        KSerializer kSerializerP3 = b.p(s1Var);
        KSerializer kSerializerP4 = b.p(s1Var);
        KSerializer kSerializerP5 = b.p(s1Var);
        KSerializer kSerializerP6 = b.p(s1Var);
        KSerializer kSerializerP7 = b.p(s1Var);
        g gVar = g.f17537a;
        KSerializer kSerializerP8 = b.p(gVar);
        KSerializer kSerializerP9 = b.p(gVar);
        KSerializer kSerializerP10 = b.p(gVar);
        KSerializer kSerializerP11 = b.p(gVar);
        KSerializer kSerializerP12 = b.p(s1Var);
        KSerializer kSerializerP13 = b.p(s1Var);
        ChannelId$$serializer channelId$$serializer = ChannelId$$serializer.INSTANCE;
        return new KSerializer[]{channelId$$serializer, channelId$$serializer, MessageId$$serializer.INSTANCE, GuildId$$serializer.INSTANCE, s1Var, s1Var, m0.f17573a, StructurableTextSerializer.INSTANCE, kSerializerP, kSerializerP2, kSerializerP3, kSerializerP4, kSerializerP5, kSerializerP6, kSerializerP7, kSerializerP8, gVar, kSerializerP9, kSerializerP10, kSerializerP11, kSerializerP12, kSerializerP13};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final PostPreviewEmbed deserialize(@NotNull Decoder decoder) {
        String str;
        ChannelId channelId;
        ChannelId channelId2;
        int i7;
        Boolean bool;
        String str2;
        String str3;
        String str4;
        GuildId guildId;
        String str5;
        String str6;
        Boolean bool2;
        Boolean bool3;
        StructurableText structurableText;
        String str7;
        String str8;
        boolean z5;
        String str9;
        String str10;
        String str11;
        int i10;
        String str12;
        Boolean bool4;
        int i11;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        char c8 = 11;
        String str13 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            ChannelId$$serializer channelId$$serializer = ChannelId$$serializer.INSTANCE;
            ChannelId channelId3 = (ChannelId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, channelId$$serializer, null);
            ChannelId channelId4 = (ChannelId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, channelId$$serializer, null);
            MessageId messageId = (MessageId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, MessageId$$serializer.INSTANCE, null);
            String strM1165unboximpl = messageId != null ? messageId.m1165unboximpl() : null;
            GuildId guildId2 = (GuildId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, GuildId$$serializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            StructurableText structurableText2 = (StructurableText) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, StructurableTextSerializer.INSTANCE, null);
            s1 s1Var = s1.f17602a;
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, s1Var, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, s1Var, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, s1Var, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, s1Var, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, s1Var, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, s1Var, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, s1Var, null);
            g gVar = g.f17537a;
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, gVar, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 16);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, gVar, null);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, gVar, null);
            Boolean bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, gVar, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, s1Var, null);
            bool = bool8;
            str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, s1Var, null);
            str6 = str20;
            guildId = guildId2;
            str9 = strDecodeStringElement;
            str7 = str14;
            str11 = strM1165unboximpl;
            i10 = iDecodeIntElement;
            channelId2 = channelId3;
            i7 = 4194303;
            str5 = str16;
            str10 = str15;
            structurableText = structurableText2;
            bool2 = bool7;
            bool4 = bool6;
            z5 = zDecodeBooleanElement;
            bool3 = bool5;
            str2 = str19;
            str3 = str18;
            str4 = str17;
            channelId = channelId4;
            str8 = strDecodeStringElement2;
        } else {
            boolean z6 = true;
            int i12 = 0;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement2 = 0;
            ChannelId channelId5 = null;
            Boolean bool9 = null;
            String str21 = null;
            Boolean bool10 = null;
            Boolean bool11 = null;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            Boolean bool12 = null;
            String strDecodeStringElement3 = null;
            GuildId guildId3 = null;
            String strDecodeStringElement4 = null;
            String str26 = null;
            String strM1165unboximpl2 = null;
            ChannelId channelId6 = null;
            String str27 = null;
            String str28 = null;
            StructurableText structurableText3 = null;
            while (z6) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str26 = str26;
                        str27 = str27;
                        z6 = false;
                        bool10 = bool10;
                        str21 = str21;
                        c8 = 11;
                        str27 = str27;
                        str26 = str26;
                        break;
                    case 0:
                        channelId6 = (ChannelId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, ChannelId$$serializer.INSTANCE, channelId6);
                        i12 |= 1;
                        bool10 = bool10;
                        str21 = str21;
                        bool9 = bool9;
                        c8 = 11;
                        str27 = str27;
                        str26 = str26;
                        break;
                    case 1:
                        channelId5 = (ChannelId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, ChannelId$$serializer.INSTANCE, channelId5);
                        i12 |= 2;
                        bool10 = bool10;
                        str21 = str21;
                        bool9 = bool9;
                        c8 = 11;
                        str27 = str27;
                        str26 = str26;
                        break;
                    case 2:
                        str21 = str21;
                        GuildId guildId4 = guildId3;
                        str26 = str26;
                        str27 = str27;
                        String str29 = str28;
                        StructurableText structurableText4 = structurableText3;
                        bool9 = bool9;
                        Boolean bool13 = bool10;
                        MessageId messageId2 = (MessageId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, MessageId$$serializer.INSTANCE, strM1165unboximpl2 != null ? MessageId.m1156boximpl(strM1165unboximpl2) : null);
                        strM1165unboximpl2 = messageId2 != null ? messageId2.m1165unboximpl() : null;
                        i12 |= 4;
                        guildId3 = guildId4;
                        bool10 = bool13;
                        structurableText3 = structurableText4;
                        str28 = str29;
                        str21 = str21;
                        bool9 = bool9;
                        c8 = 11;
                        str27 = str27;
                        str26 = str26;
                        break;
                    case 3:
                        str21 = str21;
                        str26 = str26;
                        str27 = str27;
                        bool9 = bool9;
                        guildId3 = (GuildId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, GuildId$$serializer.INSTANCE, guildId3);
                        i12 |= 8;
                        structurableText3 = structurableText3;
                        str21 = str21;
                        bool9 = bool9;
                        c8 = 11;
                        str27 = str27;
                        str26 = str26;
                        break;
                    case 4:
                        str21 = str21;
                        str26 = str26;
                        str27 = str27;
                        bool9 = bool9;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i12 |= 16;
                        str21 = str21;
                        bool9 = bool9;
                        c8 = 11;
                        str27 = str27;
                        str26 = str26;
                        break;
                    case 5:
                        str21 = str21;
                        str26 = str26;
                        str27 = str27;
                        bool9 = bool9;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i12 |= 32;
                        str21 = str21;
                        bool9 = bool9;
                        c8 = 11;
                        str27 = str27;
                        str26 = str26;
                        break;
                    case 6:
                        str21 = str21;
                        str26 = str26;
                        str27 = str27;
                        bool9 = bool9;
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i12 |= 64;
                        str21 = str21;
                        bool9 = bool9;
                        c8 = 11;
                        str27 = str27;
                        str26 = str26;
                        break;
                    case 7:
                        str21 = str21;
                        str27 = str27;
                        bool9 = bool9;
                        str26 = str26;
                        structurableText3 = (StructurableText) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, StructurableTextSerializer.INSTANCE, structurableText3);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        str21 = str21;
                        bool9 = bool9;
                        c8 = 11;
                        str27 = str27;
                        str26 = str26;
                        break;
                    case 8:
                        String str30 = str21;
                        String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, s1.f17602a, str26);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        str28 = str28;
                        bool9 = bool9;
                        c8 = 11;
                        str26 = str31;
                        str27 = str27;
                        str21 = str30;
                        break;
                    case 9:
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, s1.f17602a, str28);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        str21 = str21;
                        bool9 = bool9;
                        c8 = 11;
                        str27 = str27;
                        break;
                    case 10:
                        String str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, s1.f17602a, str27);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        bool9 = bool9;
                        str27 = str32;
                        c8 = 11;
                        break;
                    case 11:
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, s1.f17602a, str24);
                        i12 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        c8 = 11;
                        break;
                    case 12:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, s1.f17602a, str13);
                        i12 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        c8 = 11;
                        break;
                    case 13:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, s1.f17602a, str23);
                        i12 |= 8192;
                        c8 = 11;
                        break;
                    case 14:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, s1.f17602a, str22);
                        i12 |= 16384;
                        c8 = 11;
                        break;
                    case 15:
                        bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, g.f17537a, bool10);
                        i11 = PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
                        i12 |= i11;
                        c8 = 11;
                        break;
                    case 16:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 16);
                        i12 |= 65536;
                        c8 = 11;
                        break;
                    case 17:
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, g.f17537a, bool9);
                        i11 = 131072;
                        i12 |= i11;
                        c8 = 11;
                        break;
                    case 18:
                        bool12 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, g.f17537a, bool12);
                        i11 = 262144;
                        i12 |= i11;
                        c8 = 11;
                        break;
                    case 19:
                        bool11 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, g.f17537a, bool11);
                        i11 = 524288;
                        i12 |= i11;
                        c8 = 11;
                        break;
                    case 20:
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, s1.f17602a, str25);
                        i11 = 1048576;
                        i12 |= i11;
                        c8 = 11;
                        break;
                    case 21:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, s1.f17602a, str21);
                        i11 = 2097152;
                        i12 |= i11;
                        c8 = 11;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            str = str27;
            channelId = channelId5;
            channelId2 = channelId6;
            i7 = i12;
            bool = bool11;
            str2 = str22;
            str3 = str23;
            str4 = str13;
            guildId = guildId3;
            str5 = str24;
            str6 = str25;
            bool2 = bool12;
            bool3 = bool10;
            structurableText = structurableText3;
            str7 = str26;
            str8 = strDecodeStringElement3;
            z5 = zDecodeBooleanElement2;
            str9 = strDecodeStringElement4;
            str10 = str28;
            str11 = strM1165unboximpl2;
            i10 = iDecodeIntElement2;
            str12 = str21;
            bool4 = bool9;
        }
        String str33 = str;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PostPreviewEmbed(i7, channelId2, channelId, str11, guildId, str9, str8, i10, structurableText, str7, str10, str33, str5, str4, str3, str2, bool3, z5, bool4, bool2, bool, str6, str12, null, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull PostPreviewEmbed value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PostPreviewEmbed.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
