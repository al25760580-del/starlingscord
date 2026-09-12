package com.discord.media_player.reactevents;

import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.devsupport.StackTraceHelper;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/media_player/reactevents/MediaPlayerPlaybackSource.$serializer", "Lor/f0;", "Lcom/discord/media_player/reactevents/MediaPlayerPlaybackSource;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/media_player/reactevents/MediaPlayerPlaybackSource;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/media_player/reactevents/MediaPlayerPlaybackSource;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class MediaPlayerPlaybackSource$$serializer implements f0 {

    @NotNull
    public static final MediaPlayerPlaybackSource$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        MediaPlayerPlaybackSource$$serializer mediaPlayerPlaybackSource$$serializer = new MediaPlayerPlaybackSource$$serializer();
        INSTANCE = mediaPlayerPlaybackSource$$serializer;
        g1 g1Var = new g1("com.discord.media_player.reactevents.MediaPlayerPlaybackSource", mediaPlayerPlaybackSource$$serializer, 5);
        g1Var.b(StackTraceHelper.ID_KEY, false);
        g1Var.b("assetUrl", false);
        g1Var.b("channelId", false);
        g1Var.b("messageId", false);
        g1Var.b("attachmentIndex", false);
        descriptor = g1Var;
    }

    private MediaPlayerPlaybackSource$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        s1 s1Var = s1.f17602a;
        return new KSerializer[]{b.p(s1Var), b.p(s1Var), b.p(s1Var), b.p(MessageId$$serializer.INSTANCE), b.p(m0.f17573a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final MediaPlayerPlaybackSource deserialize(@NotNull Decoder decoder) {
        String str;
        String strM1165unboximpl;
        Integer num;
        int i7;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            s1 s1Var = s1.f17602a;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, s1Var, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, s1Var, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, s1Var, null);
            MessageId messageId = (MessageId) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, MessageId$$serializer.INSTANCE, null);
            strM1165unboximpl = messageId != null ? messageId.m1165unboximpl() : null;
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, m0.f17573a, null);
            i7 = 31;
            str2 = str5;
            str3 = str4;
        } else {
            boolean z5 = true;
            int i10 = 0;
            str = null;
            String strM1165unboximpl2 = null;
            Integer num2 = null;
            String str6 = null;
            String str7 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z5 = false;
                } else if (iDecodeElementIndex == 0) {
                    str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, s1.f17602a, str7);
                    i10 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, s1.f17602a, str6);
                    i10 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, s1.f17602a, str);
                    i10 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    MessageId messageId2 = (MessageId) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, MessageId$$serializer.INSTANCE, strM1165unboximpl2 != null ? MessageId.m1156boximpl(strM1165unboximpl2) : null);
                    strM1165unboximpl2 = messageId2 != null ? messageId2.m1165unboximpl() : null;
                    i10 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new j(iDecodeElementIndex);
                    }
                    num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, m0.f17573a, num2);
                    i10 |= 16;
                }
            }
            strM1165unboximpl = strM1165unboximpl2;
            num = num2;
            i7 = i10;
            str2 = str6;
            str3 = str7;
        }
        String str8 = str;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MediaPlayerPlaybackSource(i7, str3, str2, str8, strM1165unboximpl, num, null, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull MediaPlayerPlaybackSource value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MediaPlayerPlaybackSource.write$Self$media_player_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
