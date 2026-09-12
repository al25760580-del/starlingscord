package com.discord.media_player.reactevents;

import androidx.recyclerview.widget.RecyclerView;
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
import or.e0;
import or.e1;
import or.f0;
import or.g1;
import or.m0;
import or.r0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/media_player/reactevents/MediaPlayFinishedAnalytics.$serializer", "Lor/f0;", "Lcom/discord/media_player/reactevents/MediaPlayFinishedAnalytics;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/media_player/reactevents/MediaPlayFinishedAnalytics;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/media_player/reactevents/MediaPlayFinishedAnalytics;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "media_player_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class MediaPlayFinishedAnalytics$$serializer implements f0 {

    @NotNull
    public static final MediaPlayFinishedAnalytics$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        MediaPlayFinishedAnalytics$$serializer mediaPlayFinishedAnalytics$$serializer = new MediaPlayFinishedAnalytics$$serializer();
        INSTANCE = mediaPlayFinishedAnalytics$$serializer;
        g1 g1Var = new g1("com.discord.media_player.reactevents.MediaPlayFinishedAnalytics", mediaPlayFinishedAnalytics$$serializer, 12);
        g1Var.b("playWallTimeMs", false);
        g1Var.b("stallMs", false);
        g1Var.b("stallCount", false);
        g1Var.b("seekCount", false);
        g1Var.b("firstPlayWaitingMs", false);
        g1Var.b("mediaSource", false);
        g1Var.b("fileDurationSec", false);
        g1Var.b("mimeType", false);
        g1Var.b("fatalErrorCount", false);
        g1Var.b("nonFatalErrorCount", false);
        g1Var.b("totalDroppedFrames", false);
        g1Var.b("totalBandwidthBytes", false);
        descriptor = g1Var;
    }

    private MediaPlayFinishedAnalytics$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        s1 s1Var = s1.f17602a;
        KSerializer kSerializerP = b.p(s1Var);
        KSerializer kSerializerP2 = b.p(s1Var);
        r0 r0Var = r0.f17595a;
        m0 m0Var = m0.f17573a;
        return new KSerializer[]{r0Var, r0Var, m0Var, m0Var, r0Var, kSerializerP, e0.f17525a, kSerializerP2, m0Var, m0Var, r0Var, r0Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final MediaPlayFinishedAnalytics deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        int i7;
        String str;
        String str2;
        int iDecodeIntElement2;
        int i10;
        float f2;
        int i11;
        long j;
        long j5;
        long j7;
        long jDecodeLongElement;
        long jDecodeLongElement2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i12 = 10;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
            long jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            long jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            s1 s1Var = s1.f17602a;
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, s1Var, null);
            float fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, 6);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, s1Var, null);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
            str = str4;
            i7 = 4095;
            iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
            i10 = iDecodeIntElement4;
            f2 = fDecodeFloatElement;
            str2 = str3;
            i11 = iDecodeIntElement3;
            j = jDecodeLongElement5;
            j5 = jDecodeLongElement4;
            j7 = jDecodeLongElement3;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 10);
            jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 11);
        } else {
            long jDecodeLongElement6 = 0;
            long jDecodeLongElement7 = 0;
            long jDecodeLongElement8 = 0;
            long jDecodeLongElement9 = 0;
            long jDecodeLongElement10 = 0;
            boolean z5 = true;
            iDecodeIntElement = 0;
            int i13 = 0;
            int iDecodeIntElement5 = 0;
            String str5 = null;
            float fDecodeFloatElement2 = 0.0f;
            int iDecodeIntElement6 = 0;
            int iDecodeIntElement7 = 0;
            String str6 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        i12 = 10;
                        break;
                    case 0:
                        jDecodeLongElement8 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 0);
                        i13 |= 1;
                        i12 = 10;
                        break;
                    case 1:
                        jDecodeLongElement7 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i13 |= 2;
                        i12 = 10;
                        break;
                    case 2:
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i13 |= 4;
                        i12 = 10;
                        break;
                    case 3:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i13 |= 8;
                        i12 = 10;
                        break;
                    case 4:
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i13 |= 16;
                        i12 = 10;
                        break;
                    case 5:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, s1.f17602a, str6);
                        i13 |= 32;
                        i12 = 10;
                        break;
                    case 6:
                        fDecodeFloatElement2 = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, 6);
                        i13 |= 64;
                        i12 = 10;
                        break;
                    case 7:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, s1.f17602a, str5);
                        i13 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        i12 = 10;
                        break;
                    case 8:
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
                        i13 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    case 9:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
                        i13 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        break;
                    case 10:
                        jDecodeLongElement9 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i12);
                        i13 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        break;
                    case 11:
                        jDecodeLongElement10 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 11);
                        i13 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            i7 = i13;
            str = str5;
            str2 = str6;
            iDecodeIntElement2 = iDecodeIntElement6;
            i10 = iDecodeIntElement7;
            f2 = fDecodeFloatElement2;
            i11 = iDecodeIntElement5;
            j = jDecodeLongElement6;
            j5 = jDecodeLongElement7;
            j7 = jDecodeLongElement8;
            jDecodeLongElement = jDecodeLongElement9;
            jDecodeLongElement2 = jDecodeLongElement10;
        }
        int i14 = iDecodeIntElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MediaPlayFinishedAnalytics(i7, j7, j5, i14, i11, j, str2, f2, str, i10, iDecodeIntElement2, jDecodeLongElement, jDecodeLongElement2, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull MediaPlayFinishedAnalytics value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MediaPlayFinishedAnalytics.write$Self$media_player_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
