package com.discord.chat.bridge.media;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/media/UnfurledMediaItem.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/media/UnfurledMediaItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/media/UnfurledMediaItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/media/UnfurledMediaItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class UnfurledMediaItem$$serializer implements f0 {

    @NotNull
    public static final UnfurledMediaItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        UnfurledMediaItem$$serializer unfurledMediaItem$$serializer = new UnfurledMediaItem$$serializer();
        INSTANCE = unfurledMediaItem$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.media.UnfurledMediaItem", unfurledMediaItem$$serializer, 10);
        g1Var.b("url", false);
        g1Var.b("proxyUrl", false);
        g1Var.b("loadingState", false);
        g1Var.b("height", true);
        g1Var.b("width", true);
        g1Var.b("contentType", true);
        g1Var.b("placeholder", true);
        g1Var.b("placeholderVersion", true);
        g1Var.b("contentScanMetadata", true);
        g1Var.b("srcIsAnimated", false);
        descriptor = g1Var;
    }

    private UnfurledMediaItem$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        s1 s1Var = s1.f17602a;
        m0 m0Var = m0.f17573a;
        return new KSerializer[]{s1Var, s1Var, UnfurledMediaLoadingState.Serializer.INSTANCE, b.p(m0Var), b.p(m0Var), b.p(s1Var), b.p(s1Var), b.p(m0Var), b.p(ContentScanMetadata$$serializer.INSTANCE), g.f17537a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final UnfurledMediaItem deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        ContentScanMetadata contentScanMetadata;
        Integer num;
        String str;
        String str2;
        Integer num2;
        Integer num3;
        UnfurledMediaLoadingState unfurledMediaLoadingState;
        int i7;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i10 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            UnfurledMediaLoadingState unfurledMediaLoadingState2 = (UnfurledMediaLoadingState) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, UnfurledMediaLoadingState.Serializer.INSTANCE, null);
            m0 m0Var = m0.f17573a;
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, m0Var, null);
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, m0Var, null);
            s1 s1Var = s1.f17602a;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, s1Var, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, s1Var, null);
            Integer num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, m0Var, null);
            ContentScanMetadata contentScanMetadata2 = (ContentScanMetadata) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, ContentScanMetadata$$serializer.INSTANCE, null);
            str3 = strDecodeStringElement;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            num = num6;
            str2 = str6;
            str = str5;
            num3 = num4;
            contentScanMetadata = contentScanMetadata2;
            num2 = num5;
            unfurledMediaLoadingState = unfurledMediaLoadingState2;
            str4 = strDecodeStringElement2;
            i7 = 1023;
        } else {
            boolean z5 = true;
            boolean zDecodeBooleanElement2 = false;
            ContentScanMetadata contentScanMetadata3 = null;
            Integer num7 = null;
            String str7 = null;
            String str8 = null;
            Integer num8 = null;
            Integer num9 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            int i11 = 0;
            UnfurledMediaLoadingState unfurledMediaLoadingState3 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        break;
                    case 0:
                        i11 |= 1;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i10 = 9;
                        break;
                    case 1:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i11 |= 2;
                        i10 = 9;
                        break;
                    case 2:
                        unfurledMediaLoadingState3 = (UnfurledMediaLoadingState) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, UnfurledMediaLoadingState.Serializer.INSTANCE, unfurledMediaLoadingState3);
                        i11 |= 4;
                        i10 = 9;
                        break;
                    case 3:
                        num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, m0.f17573a, num9);
                        i11 |= 8;
                        i10 = 9;
                        break;
                    case 4:
                        num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, m0.f17573a, num8);
                        i11 |= 16;
                        i10 = 9;
                        break;
                    case 5:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, s1.f17602a, str7);
                        i11 |= 32;
                        i10 = 9;
                        break;
                    case 6:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, s1.f17602a, str8);
                        i11 |= 64;
                        i10 = 9;
                        break;
                    case 7:
                        num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, m0.f17573a, num7);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        i10 = 9;
                        break;
                    case 8:
                        contentScanMetadata3 = (ContentScanMetadata) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, ContentScanMetadata$$serializer.INSTANCE, contentScanMetadata3);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    case 9:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i10);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            contentScanMetadata = contentScanMetadata3;
            num = num7;
            str = str7;
            str2 = str8;
            num2 = num8;
            num3 = num9;
            unfurledMediaLoadingState = unfurledMediaLoadingState3;
            i7 = i11;
            str3 = strDecodeStringElement3;
            str4 = strDecodeStringElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UnfurledMediaItem(i7, str3, str4, unfurledMediaLoadingState, num3, num2, str, str2, num, contentScanMetadata, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull UnfurledMediaItem value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UnfurledMediaItem.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
