package com.discord.chat.bridge.botuikit;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.media.UnfurledMediaItem;
import com.discord.chat.bridge.media.UnfurledMediaItem$$serializer;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.devsupport.StackTraceHelper;
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
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import org.webrtc.PeerConnection;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/botuikit/ThumbnailDisplayComponent.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/botuikit/ThumbnailDisplayComponent;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/botuikit/ThumbnailDisplayComponent;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/botuikit/ThumbnailDisplayComponent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class ThumbnailDisplayComponent$$serializer implements f0 {

    @NotNull
    public static final ThumbnailDisplayComponent$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ThumbnailDisplayComponent$$serializer thumbnailDisplayComponent$$serializer = new ThumbnailDisplayComponent$$serializer();
        INSTANCE = thumbnailDisplayComponent$$serializer;
        g1 g1Var = new g1("11", thumbnailDisplayComponent$$serializer, 16);
        g1Var.b("type", false);
        g1Var.b(StackTraceHelper.ID_KEY, false);
        g1Var.b("media", false);
        g1Var.b("description", true);
        g1Var.b("isSpoiler", false);
        g1Var.b("spoilerDescription", false);
        g1Var.b("isObscure", false);
        g1Var.b("isObscureAwaitingScan", false);
        g1Var.b("obscureHideControls", false);
        g1Var.b("obscureIsOpaque", false);
        g1Var.b("obscureDescription", false);
        g1Var.b("verifyAge", false);
        g1Var.b("descriptionHint", false);
        g1Var.b(ViewProps.ACCESSIBILITY_ROLE, false);
        g1Var.b("spoilerOrNull", true);
        g1Var.b("obscureOrNull", true);
        descriptor = g1Var;
    }

    private ThumbnailDisplayComponent$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        s1 s1Var = s1.f17602a;
        KSerializer kSerializerP = b.p(s1Var);
        g gVar = g.f17537a;
        return new KSerializer[]{m0.f17573a, s1Var, UnfurledMediaItem$$serializer.INSTANCE, kSerializerP, gVar, b.p(s1Var), gVar, gVar, gVar, gVar, b.p(s1Var), b.p(gVar), s1Var, s1Var, b.p(s1Var), b.p(s1Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final ThumbnailDisplayComponent deserialize(@NotNull Decoder decoder) {
        int i7;
        String str;
        String str2;
        UnfurledMediaItem unfurledMediaItem;
        int i10;
        String str3;
        String str4;
        String str5;
        Boolean bool;
        String str6;
        String str7;
        String str8;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i11 = 11;
        int i12 = 10;
        int i13 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            UnfurledMediaItem unfurledMediaItem2 = (UnfurledMediaItem) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, UnfurledMediaItem$$serializer.INSTANCE, null);
            s1 s1Var = s1.f17602a;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, s1Var, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, s1Var, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            boolean zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, s1Var, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, g.f17537a, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, s1Var, null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, s1Var, null);
            unfurledMediaItem = unfurledMediaItem2;
            str6 = strDecodeStringElement;
            i10 = 65535;
            str7 = strDecodeStringElement2;
            str5 = str11;
            z5 = zDecodeBooleanElement5;
            z6 = zDecodeBooleanElement3;
            z7 = zDecodeBooleanElement2;
            str = str10;
            str2 = str9;
            z10 = zDecodeBooleanElement4;
            z11 = zDecodeBooleanElement;
            str4 = str12;
            str8 = strDecodeStringElement3;
            bool = bool2;
            i7 = iDecodeIntElement;
        } else {
            boolean z12 = true;
            int iDecodeIntElement2 = 0;
            boolean zDecodeBooleanElement6 = false;
            boolean zDecodeBooleanElement7 = false;
            boolean zDecodeBooleanElement8 = false;
            boolean zDecodeBooleanElement9 = false;
            boolean zDecodeBooleanElement10 = false;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            Boolean bool3 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            int i14 = 0;
            UnfurledMediaItem unfurledMediaItem3 = null;
            while (z12) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z12 = false;
                        break;
                    case 0:
                        i14 |= 1;
                        i13 = i13;
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i11 = 11;
                        i12 = 10;
                        break;
                    case 1:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i14 |= 2;
                        i13 = i13;
                        i11 = 11;
                        i12 = 10;
                        break;
                    case 2:
                        unfurledMediaItem3 = (UnfurledMediaItem) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, UnfurledMediaItem$$serializer.INSTANCE, unfurledMediaItem3);
                        i14 |= 4;
                        i13 = i13;
                        i11 = 11;
                        i12 = 10;
                        break;
                    case 3:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, s1.f17602a, str14);
                        i14 |= 8;
                        i13 = i13;
                        i11 = 11;
                        i12 = 10;
                        break;
                    case 4:
                        zDecodeBooleanElement10 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i14 |= 16;
                        i13 = i13;
                        i11 = 11;
                        i12 = 10;
                        break;
                    case 5:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, s1.f17602a, str13);
                        i14 |= 32;
                        i13 = i13;
                        i11 = 11;
                        i12 = 10;
                        break;
                    case 6:
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i14 |= 64;
                        i13 = i13;
                        i11 = 11;
                        break;
                    case 7:
                        zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        i13 = i13;
                        i11 = 11;
                        break;
                    case 8:
                        int i15 = i13;
                        zDecodeBooleanElement9 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i15);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        i13 = i15;
                        break;
                    case 9:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        i13 = 8;
                        break;
                    case 10:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i12, s1.f17602a, str17);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        i13 = 8;
                        break;
                    case 11:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i11, g.f17537a, bool3);
                        i14 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        i13 = 8;
                        break;
                    case 12:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i14 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        i13 = 8;
                        break;
                    case 13:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i14 |= 8192;
                        i13 = 8;
                        break;
                    case 14:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, s1.f17602a, str16);
                        i14 |= 16384;
                        i13 = 8;
                        break;
                    case 15:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, s1.f17602a, str15);
                        i14 |= PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
                        i13 = 8;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            i7 = iDecodeIntElement2;
            str = str13;
            str2 = str14;
            unfurledMediaItem = unfurledMediaItem3;
            i10 = i14;
            str3 = str15;
            str4 = str16;
            str5 = str17;
            bool = bool3;
            str6 = strDecodeStringElement4;
            str7 = strDecodeStringElement5;
            str8 = strDecodeStringElement6;
            z5 = zDecodeBooleanElement6;
            z6 = zDecodeBooleanElement7;
            z7 = zDecodeBooleanElement8;
            z10 = zDecodeBooleanElement9;
            z11 = zDecodeBooleanElement10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ThumbnailDisplayComponent(i10, i7, str6, unfurledMediaItem, str2, z11, str, z7, z6, z10, z5, str5, bool, str7, str8, str4, str3, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ThumbnailDisplayComponent value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ThumbnailDisplayComponent.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
