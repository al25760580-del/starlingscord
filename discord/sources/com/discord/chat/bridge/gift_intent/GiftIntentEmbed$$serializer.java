package com.discord.chat.bridge.gift_intent;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.j;
import or.e1;
import or.f0;
import or.g1;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import org.webrtc.PeerConnection;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/gift_intent/GiftIntentEmbed.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/gift_intent/GiftIntentEmbed;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/gift_intent/GiftIntentEmbed;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/gift_intent/GiftIntentEmbed;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class GiftIntentEmbed$$serializer implements f0 {

    @NotNull
    public static final GiftIntentEmbed$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        GiftIntentEmbed$$serializer giftIntentEmbed$$serializer = new GiftIntentEmbed$$serializer();
        INSTANCE = giftIntentEmbed$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.gift_intent.GiftIntentEmbed", giftIntentEmbed$$serializer, 16);
        g1Var.b("recipientAvatarUrl", false);
        g1Var.b("currentUserAvatarUrl", true);
        g1Var.b("recipientName", false);
        g1Var.b("headerText", false);
        g1Var.b("subHeaderParts", false);
        g1Var.b("recipientUserId", false);
        g1Var.b("giftIntentType", false);
        g1Var.b("headerTextColor", false);
        g1Var.b("subHeaderTextColor", false);
        g1Var.b(ViewProps.BACKGROUND_COLOR, false);
        g1Var.b(ViewProps.BORDER_COLOR, false);
        g1Var.b("subHeaderIconUrl", true);
        g1Var.b("primaryCtaLabel", false);
        g1Var.b("primaryCtaIconUrl", true);
        g1Var.b("secondaryCtaIconUrl", true);
        g1Var.b("secondaryCtaAccessibilityLabel", false);
        descriptor = g1Var;
    }

    private GiftIntentEmbed$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = GiftIntentEmbed.$childSerializers;
        s1 s1Var = s1.f17602a;
        m0 m0Var = m0.f17573a;
        return new KSerializer[]{s1Var, b.p(s1Var), s1Var, s1Var, lazyArr[4].getValue(), s1Var, m0Var, m0Var, m0Var, m0Var, m0Var, b.p(s1Var), s1Var, b.p(s1Var), b.p(s1Var), s1Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final GiftIntentEmbed deserialize(@NotNull Decoder decoder) {
        int i7;
        String str;
        String str2;
        List list;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String strDecodeStringElement;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = GiftIntentEmbed.$childSerializers;
        int i15 = 10;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            s1 s1Var = s1.f17602a;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, s1Var, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
            int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, s1Var, null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, s1Var, null);
            i7 = 65535;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, s1Var, null);
            str5 = strDecodeStringElement2;
            str6 = strDecodeStringElement3;
            str8 = strDecodeStringElement5;
            str3 = str10;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            i10 = iDecodeIntElement5;
            i11 = iDecodeIntElement4;
            i12 = iDecodeIntElement2;
            i13 = iDecodeIntElement;
            i14 = iDecodeIntElement3;
            str7 = strDecodeStringElement4;
            str = str11;
            str4 = str12;
            str9 = strDecodeStringElement6;
            list = list2;
        } else {
            int i16 = 15;
            int i17 = 4;
            boolean z5 = true;
            int iDecodeIntElement6 = 0;
            int iDecodeIntElement7 = 0;
            int iDecodeIntElement8 = 0;
            int iDecodeIntElement9 = 0;
            int iDecodeIntElement10 = 0;
            String str13 = null;
            String str14 = null;
            List list3 = null;
            String str15 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            i7 = 0;
            String str16 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        i16 = 15;
                        i17 = 4;
                        break;
                    case 0:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        i16 = 15;
                        i15 = 10;
                        i17 = 4;
                        break;
                    case 1:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, s1.f17602a, str16);
                        i7 |= 2;
                        i16 = 15;
                        i15 = 10;
                        i17 = 4;
                        break;
                    case 2:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i7 |= 4;
                        i16 = 15;
                        i15 = 10;
                        break;
                    case 3:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i7 |= 8;
                        i16 = 15;
                        i15 = 10;
                        break;
                    case 4:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i17, (DeserializationStrategy) lazyArr[i17].getValue(), list3);
                        i7 |= 16;
                        i16 = 15;
                        i15 = 10;
                        break;
                    case 5:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i7 |= 32;
                        i16 = 15;
                        break;
                    case 6:
                        iDecodeIntElement9 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i7 |= 64;
                        i16 = 15;
                        break;
                    case 7:
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i7 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        i16 = 15;
                        break;
                    case 8:
                        iDecodeIntElement10 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
                        i7 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        i16 = 15;
                        break;
                    case 9:
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
                        i7 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        i16 = 15;
                        break;
                    case 10:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i15);
                        i7 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        i16 = 15;
                        break;
                    case 11:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, s1.f17602a, str13);
                        i7 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        i16 = 15;
                        break;
                    case 12:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i7 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        i16 = 15;
                        break;
                    case 13:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, s1.f17602a, str15);
                        i7 |= 8192;
                        i16 = 15;
                        break;
                    case 14:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, s1.f17602a, str14);
                        i7 |= 16384;
                        i16 = 15;
                        break;
                    case 15:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i16);
                        i7 |= PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            str = str13;
            str2 = str14;
            list = list3;
            str3 = str16;
            str4 = str15;
            str5 = strDecodeStringElement7;
            str6 = strDecodeStringElement8;
            str7 = strDecodeStringElement9;
            str8 = strDecodeStringElement10;
            str9 = strDecodeStringElement11;
            strDecodeStringElement = strDecodeStringElement12;
            i10 = iDecodeIntElement6;
            i11 = iDecodeIntElement7;
            i12 = iDecodeIntElement8;
            i13 = iDecodeIntElement9;
            i14 = iDecodeIntElement10;
        }
        int i18 = i7;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GiftIntentEmbed(i18, str5, str3, str6, str7, list, str8, i13, i12, i14, i11, i10, str, str9, str4, str2, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull GiftIntentEmbed value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        GiftIntentEmbed.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
