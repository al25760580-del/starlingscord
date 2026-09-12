package com.discord.notifications.api;

import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
import com.discord.primitives.StickerId;
import com.discord.primitives.StickerId$$serializer;
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
import or.r0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/notifications/api/Sticker.$serializer", "Lor/f0;", "Lcom/discord/notifications/api/Sticker;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/notifications/api/Sticker;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/notifications/api/Sticker;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "notification_api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class Sticker$$serializer implements f0 {

    @NotNull
    public static final Sticker$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Sticker$$serializer sticker$$serializer = new Sticker$$serializer();
        INSTANCE = sticker$$serializer;
        g1 g1Var = new g1("com.discord.notifications.api.Sticker", sticker$$serializer, 9);
        g1Var.b(StackTraceHelper.ID_KEY, true);
        g1Var.b(StackTraceHelper.NAME_KEY, false);
        g1Var.b("pack_id", true);
        g1Var.b("guild_id", true);
        g1Var.b("description", true);
        g1Var.b("format_type", true);
        g1Var.b("tags", true);
        g1Var.b("type", true);
        g1Var.b("available", true);
        descriptor = g1Var;
    }

    private Sticker$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerP = b.p(r0.f17595a);
        KSerializer kSerializerP2 = b.p(GuildId$$serializer.INSTANCE);
        KSerializer kSerializerP3 = b.p(g.f17537a);
        s1 s1Var = s1.f17602a;
        return new KSerializer[]{StickerId$$serializer.INSTANCE, s1Var, kSerializerP, kSerializerP2, s1Var, StickerFormatType.Serializer.INSTANCE, s1Var, StickerType.Serializer.INSTANCE, kSerializerP3};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final Sticker deserialize(@NotNull Decoder decoder) {
        int i7;
        Boolean bool;
        StickerType stickerType;
        StickerFormatType stickerFormatType;
        StickerId stickerId;
        String str;
        Long l6;
        GuildId guildId;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i10 = 7;
        int i11 = 6;
        StickerId stickerId2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StickerId stickerId3 = (StickerId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, StickerId$$serializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            Long l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, r0.f17595a, null);
            GuildId guildId2 = (GuildId) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, GuildId$$serializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            StickerFormatType stickerFormatType2 = (StickerFormatType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, StickerFormatType.Serializer.INSTANCE, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            stickerId = stickerId3;
            stickerType = (StickerType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, StickerType.Serializer.INSTANCE, null);
            str3 = strDecodeStringElement3;
            stickerFormatType = stickerFormatType2;
            guildId = guildId2;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, g.f17537a, null);
            str2 = strDecodeStringElement2;
            l6 = l7;
            str = strDecodeStringElement;
            i7 = 511;
        } else {
            boolean z5 = true;
            int i12 = 0;
            Boolean bool2 = null;
            StickerType stickerType2 = null;
            StickerFormatType stickerFormatType3 = null;
            String strDecodeStringElement4 = null;
            Long l10 = null;
            GuildId guildId3 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        i11 = 6;
                        break;
                    case 0:
                        stickerId2 = (StickerId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, StickerId$$serializer.INSTANCE, stickerId2);
                        i12 |= 1;
                        i10 = 7;
                        i11 = 6;
                        break;
                    case 1:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i12 |= 2;
                        i10 = 7;
                        break;
                    case 2:
                        l10 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, r0.f17595a, l10);
                        i12 |= 4;
                        i10 = 7;
                        break;
                    case 3:
                        guildId3 = (GuildId) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, GuildId$$serializer.INSTANCE, guildId3);
                        i12 |= 8;
                        i10 = 7;
                        break;
                    case 4:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i12 |= 16;
                        break;
                    case 5:
                        stickerFormatType3 = (StickerFormatType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, StickerFormatType.Serializer.INSTANCE, stickerFormatType3);
                        i12 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i11);
                        i12 |= 64;
                        break;
                    case 7:
                        stickerType2 = (StickerType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i10, StickerType.Serializer.INSTANCE, stickerType2);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    case 8:
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, g.f17537a, bool2);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            i7 = i12;
            bool = bool2;
            stickerType = stickerType2;
            stickerFormatType = stickerFormatType3;
            stickerId = stickerId2;
            str = strDecodeStringElement4;
            l6 = l10;
            guildId = guildId3;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Sticker(i7, stickerId, str, l6, guildId, str2, stickerFormatType, str3, stickerType, bool, null, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Sticker value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Sticker.write$Self$notification_api_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
