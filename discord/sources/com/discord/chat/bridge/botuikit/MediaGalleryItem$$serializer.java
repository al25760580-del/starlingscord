package com.discord.chat.bridge.botuikit;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.media.UnfurledMediaItem;
import com.discord.chat.bridge.media.UnfurledMediaItem$$serializer;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
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
import or.s1;
import org.jetbrains.annotations.NotNull;
import org.webrtc.PeerConnection;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/botuikit/MediaGalleryItem.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/botuikit/MediaGalleryItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/botuikit/MediaGalleryItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/botuikit/MediaGalleryItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class MediaGalleryItem$$serializer implements f0 {

    @NotNull
    public static final MediaGalleryItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        MediaGalleryItem$$serializer mediaGalleryItem$$serializer = new MediaGalleryItem$$serializer();
        INSTANCE = mediaGalleryItem$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.botuikit.MediaGalleryItem", mediaGalleryItem$$serializer, 18);
        g1Var.b("media", false);
        g1Var.b("mediaType", false);
        g1Var.b("videoPreviewUrl", true);
        g1Var.b("isSpoiler", false);
        g1Var.b("spoilerDescription", false);
        g1Var.b("isObscure", false);
        g1Var.b("isObscureAwaitingScan", false);
        g1Var.b("obscureDescription", false);
        g1Var.b("obscureHideControls", false);
        g1Var.b("obscureIsOpaque", false);
        g1Var.b("verifyAge", false);
        g1Var.b("showDescription", false);
        g1Var.b("description", true);
        g1Var.b("descriptionHint", false);
        g1Var.b(ViewProps.ACCESSIBILITY_ROLE, false);
        g1Var.b("portalId", false);
        g1Var.b("spoilerOrNull", true);
        g1Var.b("obscureOrNull", true);
        descriptor = g1Var;
    }

    private MediaGalleryItem$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        s1 s1Var = s1.f17602a;
        KSerializer kSerializerP = b.p(s1Var);
        g gVar = g.f17537a;
        return new KSerializer[]{UnfurledMediaItem$$serializer.INSTANCE, MediaGalleryItemType.Serializer.INSTANCE, kSerializerP, gVar, b.p(s1Var), gVar, gVar, b.p(s1Var), gVar, gVar, b.p(gVar), gVar, b.p(s1Var), s1Var, s1Var, b.p(s1Var), b.p(s1Var), b.p(s1Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final MediaGalleryItem deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        boolean z5;
        MediaGalleryItemType mediaGalleryItemType;
        int i7;
        UnfurledMediaItem unfurledMediaItem;
        String str4;
        String str5;
        String str6;
        String str7;
        Boolean bool;
        String str8;
        String str9;
        boolean z6;
        boolean z7;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        char c8 = '\n';
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            UnfurledMediaItem unfurledMediaItem2 = (UnfurledMediaItem) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, UnfurledMediaItem$$serializer.INSTANCE, null);
            MediaGalleryItemType mediaGalleryItemType2 = (MediaGalleryItemType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, MediaGalleryItemType.Serializer.INSTANCE, null);
            s1 s1Var = s1.f17602a;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, s1Var, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s1Var, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, s1Var, null);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            boolean zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, g.f17537a, null);
            boolean zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, s1Var, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, s1Var, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, s1Var, null);
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, s1Var, null);
            z5 = zDecodeBooleanElement4;
            str = str10;
            i7 = 262143;
            str8 = strDecodeStringElement;
            bool = bool2;
            z6 = zDecodeBooleanElement6;
            z7 = zDecodeBooleanElement5;
            str7 = str12;
            z10 = zDecodeBooleanElement3;
            z11 = zDecodeBooleanElement2;
            z12 = zDecodeBooleanElement;
            str3 = str11;
            str4 = str15;
            mediaGalleryItemType = mediaGalleryItemType2;
            str9 = strDecodeStringElement2;
            str6 = str13;
            str5 = str14;
            unfurledMediaItem = unfurledMediaItem2;
        } else {
            boolean z13 = true;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            UnfurledMediaItem unfurledMediaItem3 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            String str22 = null;
            Boolean bool3 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            int i11 = 0;
            boolean zDecodeBooleanElement7 = false;
            boolean zDecodeBooleanElement8 = false;
            boolean zDecodeBooleanElement9 = false;
            boolean zDecodeBooleanElement10 = false;
            boolean zDecodeBooleanElement11 = false;
            MediaGalleryItemType mediaGalleryItemType3 = null;
            boolean z14 = false;
            while (z13) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        break;
                    case 0:
                        unfurledMediaItem3 = (UnfurledMediaItem) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, UnfurledMediaItem$$serializer.INSTANCE, unfurledMediaItem3);
                        i11 |= 1;
                        c8 = '\n';
                        break;
                    case 1:
                        mediaGalleryItemType3 = (MediaGalleryItemType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, MediaGalleryItemType.Serializer.INSTANCE, mediaGalleryItemType3);
                        i11 |= 2;
                        c8 = '\n';
                        break;
                    case 2:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, s1.f17602a, str16);
                        i11 |= 4;
                        c8 = '\n';
                        break;
                    case 3:
                        zDecodeBooleanElement11 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i11 |= 8;
                        c8 = '\n';
                        break;
                    case 4:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s1.f17602a, str18);
                        i11 |= 16;
                        c8 = '\n';
                        break;
                    case 5:
                        zDecodeBooleanElement10 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i11 |= 32;
                        c8 = '\n';
                        break;
                    case 6:
                        zDecodeBooleanElement9 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i11 |= 64;
                        c8 = '\n';
                        break;
                    case 7:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, s1.f17602a, str22);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        c8 = '\n';
                        break;
                    case 8:
                        boolean zDecodeBooleanElement12 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        c8 = c8;
                        z14 = zDecodeBooleanElement12;
                        break;
                    case 9:
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        c8 = c8;
                        break;
                    case 10:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, g.f17537a, bool3);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        c8 = '\n';
                        break;
                    case 11:
                        zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
                        i11 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        c8 = '\n';
                        break;
                    case 12:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, s1.f17602a, str21);
                        i11 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        c8 = '\n';
                        break;
                    case 13:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i11 |= 8192;
                        c8 = '\n';
                        break;
                    case 14:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i11 |= 16384;
                        c8 = '\n';
                        break;
                    case 15:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, s1.f17602a, str20);
                        i10 = PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
                        i11 |= i10;
                        c8 = '\n';
                        break;
                    case 16:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, s1.f17602a, str19);
                        i10 = 65536;
                        i11 |= i10;
                        c8 = '\n';
                        break;
                    case 17:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, s1.f17602a, str17);
                        i10 = 131072;
                        i11 |= i10;
                        c8 = '\n';
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            str = str16;
            str2 = str17;
            str3 = str18;
            z5 = z14;
            mediaGalleryItemType = mediaGalleryItemType3;
            i7 = i11;
            unfurledMediaItem = unfurledMediaItem3;
            str4 = str19;
            str5 = str20;
            str6 = str21;
            str7 = str22;
            bool = bool3;
            str8 = strDecodeStringElement3;
            str9 = strDecodeStringElement4;
            z6 = zDecodeBooleanElement7;
            z7 = zDecodeBooleanElement8;
            z10 = zDecodeBooleanElement9;
            z11 = zDecodeBooleanElement10;
            z12 = zDecodeBooleanElement11;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MediaGalleryItem(i7, unfurledMediaItem, mediaGalleryItemType, str, z12, str3, z11, z10, str7, z5, z7, bool, z6, str6, str8, str9, str5, str4, str2, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull MediaGalleryItem value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MediaGalleryItem.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
