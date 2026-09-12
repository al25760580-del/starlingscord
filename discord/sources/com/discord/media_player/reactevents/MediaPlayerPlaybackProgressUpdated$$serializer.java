package com.discord.media_player.reactevents;

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
import or.r0;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/media_player/reactevents/MediaPlayerPlaybackProgressUpdated.$serializer", "Lor/f0;", "Lcom/discord/media_player/reactevents/MediaPlayerPlaybackProgressUpdated;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/media_player/reactevents/MediaPlayerPlaybackProgressUpdated;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/media_player/reactevents/MediaPlayerPlaybackProgressUpdated;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class MediaPlayerPlaybackProgressUpdated$$serializer implements f0 {

    @NotNull
    public static final MediaPlayerPlaybackProgressUpdated$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        MediaPlayerPlaybackProgressUpdated$$serializer mediaPlayerPlaybackProgressUpdated$$serializer = new MediaPlayerPlaybackProgressUpdated$$serializer();
        INSTANCE = mediaPlayerPlaybackProgressUpdated$$serializer;
        g1 g1Var = new g1("com.discord.media_player.reactevents.MediaPlayerPlaybackProgressUpdated", mediaPlayerPlaybackProgressUpdated$$serializer, 3);
        g1Var.b("source", false);
        g1Var.b("time", false);
        g1Var.b("duration", false);
        descriptor = g1Var;
    }

    private MediaPlayerPlaybackProgressUpdated$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        r0 r0Var = r0.f17595a;
        return new KSerializer[]{b.p(MediaPlayerPlaybackSource$$serializer.INSTANCE), r0Var, r0Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final MediaPlayerPlaybackProgressUpdated deserialize(@NotNull Decoder decoder) {
        int i7;
        MediaPlayerPlaybackSource mediaPlayerPlaybackSource;
        long jDecodeLongElement;
        long jDecodeLongElement2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        MediaPlayerPlaybackSource mediaPlayerPlaybackSource2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            mediaPlayerPlaybackSource = (MediaPlayerPlaybackSource) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, MediaPlayerPlaybackSource$$serializer.INSTANCE, null);
            i7 = 7;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
        } else {
            long jDecodeLongElement3 = 0;
            boolean z5 = true;
            int i10 = 0;
            long jDecodeLongElement4 = 0;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z5 = false;
                } else if (iDecodeElementIndex == 0) {
                    mediaPlayerPlaybackSource2 = (MediaPlayerPlaybackSource) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, MediaPlayerPlaybackSource$$serializer.INSTANCE, mediaPlayerPlaybackSource2);
                    i10 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                    i10 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new j(iDecodeElementIndex);
                    }
                    jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                    i10 |= 4;
                }
            }
            i7 = i10;
            mediaPlayerPlaybackSource = mediaPlayerPlaybackSource2;
            jDecodeLongElement = jDecodeLongElement3;
            jDecodeLongElement2 = jDecodeLongElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MediaPlayerPlaybackProgressUpdated(i7, mediaPlayerPlaybackSource, jDecodeLongElement, jDecodeLongElement2, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull MediaPlayerPlaybackProgressUpdated value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MediaPlayerPlaybackProgressUpdated.write$Self$media_player_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
