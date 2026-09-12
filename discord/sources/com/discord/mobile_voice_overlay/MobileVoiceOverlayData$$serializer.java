package com.discord.mobile_voice_overlay;

import com.discord.notifications.renderer.NotificationRenderer;
import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
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
import or.g;
import or.g1;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/mobile_voice_overlay/MobileVoiceOverlayData.$serializer", "Lor/f0;", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@rn.d
public /* synthetic */ class MobileVoiceOverlayData$$serializer implements f0 {

    @NotNull
    public static final MobileVoiceOverlayData$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        MobileVoiceOverlayData$$serializer mobileVoiceOverlayData$$serializer = new MobileVoiceOverlayData$$serializer();
        INSTANCE = mobileVoiceOverlayData$$serializer;
        g1 g1Var = new g1("com.discord.mobile_voice_overlay.MobileVoiceOverlayData", mobileVoiceOverlayData$$serializer, 11);
        g1Var.b("users", false);
        g1Var.b("extraUsers", false);
        g1Var.b("guildId", false);
        g1Var.b("channelId", false);
        g1Var.b(NotificationRenderer.CHANNEL_NAME, false);
        g1Var.b("guildName", false);
        g1Var.b("deafened", false);
        g1Var.b("muted", false);
        g1Var.b("connectionQuality", false);
        g1Var.b("canGenerateInvite", false);
        g1Var.b("channelSelectorResults", false);
        descriptor = g1Var;
    }

    private MobileVoiceOverlayData$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = MobileVoiceOverlayData.$childSerializers;
        s1 s1Var = s1.f17602a;
        g gVar = g.f17537a;
        return new KSerializer[]{lazyArr[0].getValue(), m0.f17573a, com.facebook.imagepipeline.nativecode.b.p(GuildId$$serializer.INSTANCE), ChannelId$$serializer.INSTANCE, s1Var, s1Var, gVar, gVar, lazyArr[8].getValue(), gVar, lazyArr[10].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final MobileVoiceOverlayData deserialize(@NotNull Decoder decoder) {
        boolean z5;
        List list;
        ConnectionQuality connectionQuality;
        List list2;
        ChannelId channelId;
        GuildId guildId;
        int i7;
        boolean z6;
        boolean z7;
        int i10;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MobileVoiceOverlayData.$childSerializers;
        int i11 = 9;
        int i12 = 7;
        int i13 = 6;
        int i14 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            GuildId guildId2 = (GuildId) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, GuildId$$serializer.INSTANCE, null);
            ChannelId channelId2 = (ChannelId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, ChannelId$$serializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            ConnectionQuality connectionQuality2 = (ConnectionQuality) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, (DeserializationStrategy) lazyArr[8].getValue(), null);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, (DeserializationStrategy) lazyArr[10].getValue(), null);
            list = list3;
            z5 = zDecodeBooleanElement3;
            z6 = zDecodeBooleanElement2;
            z7 = zDecodeBooleanElement;
            str2 = strDecodeStringElement2;
            channelId = channelId2;
            str = strDecodeStringElement;
            guildId = guildId2;
            i7 = 2047;
            connectionQuality = connectionQuality2;
            i10 = iDecodeIntElement;
        } else {
            boolean z10 = true;
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            int iDecodeIntElement2 = 0;
            ConnectionQuality connectionQuality3 = null;
            List list4 = null;
            ChannelId channelId3 = null;
            GuildId guildId3 = null;
            List list5 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            boolean zDecodeBooleanElement6 = false;
            while (z10) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z10 = false;
                        i12 = 7;
                        i13 = 6;
                        break;
                    case 0:
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), list5);
                        i14 |= 1;
                        i11 = 9;
                        i12 = 7;
                        i13 = 6;
                        break;
                    case 1:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i14 |= 2;
                        i11 = 9;
                        i12 = 7;
                        break;
                    case 2:
                        guildId3 = (GuildId) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, GuildId$$serializer.INSTANCE, guildId3);
                        i14 |= 4;
                        i11 = 9;
                        i12 = 7;
                        break;
                    case 3:
                        channelId3 = (ChannelId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, ChannelId$$serializer.INSTANCE, channelId3);
                        i14 |= 8;
                        i11 = 9;
                        i12 = 7;
                        break;
                    case 4:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i14 |= 16;
                        i11 = 9;
                        break;
                    case 5:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i14 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i13);
                        i14 |= 64;
                        break;
                    case 7:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i12);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    case 8:
                        connectionQuality3 = (ConnectionQuality) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, (DeserializationStrategy) lazyArr[8].getValue(), connectionQuality3);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    case 9:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i11);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        break;
                    case 10:
                        list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, (DeserializationStrategy) lazyArr[10].getValue(), list4);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            z5 = zDecodeBooleanElement4;
            list = list5;
            connectionQuality = connectionQuality3;
            list2 = list4;
            channelId = channelId3;
            guildId = guildId3;
            i7 = i14;
            z6 = zDecodeBooleanElement6;
            z7 = zDecodeBooleanElement5;
            i10 = iDecodeIntElement2;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MobileVoiceOverlayData(i7, list, i10, guildId, channelId, str, str2, z7, z6, connectionQuality, z5, list2, null, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull MobileVoiceOverlayData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MobileVoiceOverlayData.write$Self$mobile_voice_overlay_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
