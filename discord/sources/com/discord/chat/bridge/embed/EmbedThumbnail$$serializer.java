package com.discord.chat.bridge.embed;

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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/embed/EmbedThumbnail.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/embed/EmbedThumbnail;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/embed/EmbedThumbnail;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/embed/EmbedThumbnail;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class EmbedThumbnail$$serializer implements f0 {

    @NotNull
    public static final EmbedThumbnail$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        EmbedThumbnail$$serializer embedThumbnail$$serializer = new EmbedThumbnail$$serializer();
        INSTANCE = embedThumbnail$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.embed.EmbedThumbnail", embedThumbnail$$serializer, 11);
        g1Var.b("url", false);
        g1Var.b("proxyURL", true);
        g1Var.b("videoUrl", true);
        g1Var.b("height", false);
        g1Var.b("width", false);
        g1Var.b("gifv", true);
        g1Var.b("showPlayButton", true);
        g1Var.b("placeholder", true);
        g1Var.b("placeholderVersion", true);
        g1Var.b("srcIsAnimated", true);
        g1Var.b("embedUrl", true);
        descriptor = g1Var;
    }

    private EmbedThumbnail$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        s1 s1Var = s1.f17602a;
        KSerializer kSerializerP = com.facebook.imagepipeline.nativecode.b.p(s1Var);
        KSerializer kSerializerP2 = com.facebook.imagepipeline.nativecode.b.p(s1Var);
        m0 m0Var = m0.f17573a;
        g gVar = g.f17537a;
        return new KSerializer[]{s1Var, kSerializerP, kSerializerP2, m0Var, m0Var, com.facebook.imagepipeline.nativecode.b.p(gVar), com.facebook.imagepipeline.nativecode.b.p(gVar), com.facebook.imagepipeline.nativecode.b.p(s1Var), com.facebook.imagepipeline.nativecode.b.p(m0Var), gVar, s1Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final EmbedThumbnail deserialize(@NotNull Decoder decoder) {
        boolean z5;
        String str;
        Integer num;
        Boolean bool;
        String str2;
        Boolean bool2;
        String str3;
        int i7;
        int i10;
        String str4;
        String strDecodeStringElement;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i11 = 10;
        int i12 = 9;
        int i13 = 7;
        int i14 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            s1 s1Var = s1.f17602a;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, s1Var, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, s1Var, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            g gVar = g.f17537a;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, gVar, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, gVar, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, s1Var, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, m0.f17573a, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            i14 = 2047;
            str4 = strDecodeStringElement2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            z5 = zDecodeBooleanElement;
            str2 = str7;
            bool = bool4;
            bool2 = bool3;
            i7 = iDecodeIntElement;
            num = num2;
            i10 = iDecodeIntElement2;
            str3 = str6;
            str = str5;
        } else {
            boolean z6 = true;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement3 = 0;
            Integer num3 = null;
            Boolean bool5 = null;
            String str8 = null;
            Boolean bool6 = null;
            String str9 = null;
            String strDecodeStringElement3 = null;
            String str10 = null;
            String strDecodeStringElement4 = null;
            int iDecodeIntElement4 = 0;
            while (z6) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z6 = false;
                        i11 = 10;
                        i12 = 9;
                        break;
                    case 0:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i14 |= 1;
                        i11 = 10;
                        i12 = 9;
                        i13 = 7;
                        break;
                    case 1:
                        i14 |= 2;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, s1.f17602a, str10);
                        i11 = 10;
                        i12 = 9;
                        i13 = 7;
                        break;
                    case 2:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, s1.f17602a, str9);
                        i14 |= 4;
                        i11 = 10;
                        i12 = 9;
                        break;
                    case 3:
                        i14 |= 8;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i11 = 10;
                        break;
                    case 4:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i14 |= 16;
                        i11 = 10;
                        break;
                    case 5:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, g.f17537a, bool6);
                        i14 |= 32;
                        i11 = 10;
                        break;
                    case 6:
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, g.f17537a, bool5);
                        i14 |= 64;
                        i11 = 10;
                        break;
                    case 7:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i13, s1.f17602a, str8);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    case 8:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, m0.f17573a, num3);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    case 9:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i12);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        break;
                    case 10:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i11);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            z5 = zDecodeBooleanElement2;
            str = str10;
            num = num3;
            bool = bool5;
            str2 = str8;
            bool2 = bool6;
            str3 = str9;
            i7 = iDecodeIntElement4;
            i10 = iDecodeIntElement3;
            str4 = strDecodeStringElement3;
            strDecodeStringElement = strDecodeStringElement4;
        }
        int i15 = i14;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EmbedThumbnail(i15, str4, str, str3, i7, i10, bool2, bool, str2, num, z5, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull EmbedThumbnail value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EmbedThumbnail.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
