package com.discord.chat.bridge.contentnode;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.GuildId;
import com.discord.primitives.GuildId$$serializer;
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
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/contentnode/LinkContextData.BindGuildMenu.MessageReference.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/contentnode/LinkContextData$BindGuildMenu$MessageReference;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/contentnode/LinkContextData$BindGuildMenu$MessageReference;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/contentnode/LinkContextData$BindGuildMenu$MessageReference;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class LinkContextData$BindGuildMenu$MessageReference$$serializer implements f0 {

    @NotNull
    public static final LinkContextData$BindGuildMenu$MessageReference$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        LinkContextData$BindGuildMenu$MessageReference$$serializer linkContextData$BindGuildMenu$MessageReference$$serializer = new LinkContextData$BindGuildMenu$MessageReference$$serializer();
        INSTANCE = linkContextData$BindGuildMenu$MessageReference$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.contentnode.LinkContextData.BindGuildMenu.MessageReference", linkContextData$BindGuildMenu$MessageReference$$serializer, 2);
        g1Var.b("channel_id", false);
        g1Var.b("guild_id", true);
        descriptor = g1Var;
    }

    private LinkContextData$BindGuildMenu$MessageReference$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ChannelId$$serializer.INSTANCE, b.p(GuildId$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final LinkContextData.BindGuildMenu.MessageReference deserialize(@NotNull Decoder decoder) {
        int i7;
        ChannelId channelId;
        GuildId guildId;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        ChannelId channelId2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            channelId = (ChannelId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, ChannelId$$serializer.INSTANCE, null);
            guildId = (GuildId) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, GuildId$$serializer.INSTANCE, null);
            i7 = 3;
        } else {
            boolean z5 = true;
            int i10 = 0;
            GuildId guildId2 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z5 = false;
                } else if (iDecodeElementIndex == 0) {
                    channelId2 = (ChannelId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, ChannelId$$serializer.INSTANCE, channelId2);
                    i10 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new j(iDecodeElementIndex);
                    }
                    guildId2 = (GuildId) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, GuildId$$serializer.INSTANCE, guildId2);
                    i10 |= 2;
                }
            }
            i7 = i10;
            channelId = channelId2;
            guildId = guildId2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LinkContextData.BindGuildMenu.MessageReference(i7, channelId, guildId, null, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull LinkContextData.BindGuildMenu.MessageReference value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LinkContextData.BindGuildMenu.MessageReference.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
