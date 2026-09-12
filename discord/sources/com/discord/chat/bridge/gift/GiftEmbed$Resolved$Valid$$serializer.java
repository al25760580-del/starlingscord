package com.discord.chat.bridge.gift;

import androidx.recyclerview.widget.RecyclerView;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.j;
import or.e0;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/gift/GiftEmbed.Resolved.Valid.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class GiftEmbed$Resolved$Valid$$serializer implements f0 {

    @NotNull
    public static final GiftEmbed$Resolved$Valid$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        GiftEmbed$Resolved$Valid$$serializer giftEmbed$Resolved$Valid$$serializer = new GiftEmbed$Resolved$Valid$$serializer();
        INSTANCE = giftEmbed$Resolved$Valid$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.gift.GiftEmbed.Resolved.Valid", giftEmbed$Resolved$Valid$$serializer, 18);
        g1Var.b("headerText", false);
        g1Var.b("headerColor", false);
        g1Var.b(ViewProps.BACKGROUND_COLOR, false);
        g1Var.b("thumbnailCornerRadius", false);
        g1Var.b("thumbnailUrl", true);
        g1Var.b("titleText", true);
        g1Var.b("titleColor", false);
        g1Var.b("subtitle", true);
        g1Var.b("subtitleColor", false);
        g1Var.b("bodyText", true);
        g1Var.b("bodyTextColor", false);
        g1Var.b("acceptLabelText", true);
        g1Var.b("acceptLabelColor", false);
        g1Var.b("acceptLabelBackgroundColor", false);
        g1Var.b("splashUrl", true);
        g1Var.b("splashOpacity", false);
        g1Var.b("canBeAccepted", false);
        g1Var.b("giftCode", false);
        descriptor = g1Var;
    }

    private GiftEmbed$Resolved$Valid$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        s1 s1Var = s1.f17602a;
        KSerializer kSerializerP = b.p(s1Var);
        KSerializer kSerializerP2 = b.p(s1Var);
        KSerializer kSerializerP3 = b.p(s1Var);
        KSerializer kSerializerP4 = b.p(s1Var);
        KSerializer kSerializerP5 = b.p(s1Var);
        KSerializer kSerializerP6 = b.p(s1Var);
        m0 m0Var = m0.f17573a;
        return new KSerializer[]{s1Var, m0Var, m0Var, m0Var, kSerializerP, kSerializerP2, m0Var, kSerializerP3, m0Var, kSerializerP4, m0Var, kSerializerP5, m0Var, m0Var, kSerializerP6, e0.f17525a, g.f17537a, s1Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final GiftEmbed.Resolved.Valid deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        int i7;
        String str3;
        int i10;
        String str4;
        String str5;
        String str6;
        int i11;
        int i12;
        int i13;
        int i14;
        float f2;
        String str7;
        int i15;
        String strDecodeStringElement;
        int i16;
        int i17;
        boolean z5;
        char c8;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i18 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            s1 s1Var = s1.f17602a;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s1Var, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, s1Var, null);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, s1Var, null);
            int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, s1Var, null);
            int iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, s1Var, null);
            int iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
            int iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 13);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, s1Var, null);
            float fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, 15);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 16);
            str4 = str13;
            i11 = iDecodeIntElement5;
            i12 = iDecodeIntElement2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            f2 = fDecodeFloatElement;
            i15 = iDecodeIntElement7;
            str6 = str12;
            i16 = iDecodeIntElement6;
            str5 = str11;
            str2 = str10;
            i17 = iDecodeIntElement4;
            str = str9;
            z5 = zDecodeBooleanElement;
            str3 = str8;
            i13 = iDecodeIntElement;
            i10 = 262143;
            i14 = iDecodeIntElement3;
            i7 = iDecodeIntElement8;
            str7 = strDecodeStringElement2;
        } else {
            int i19 = 17;
            boolean z6 = true;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            int i20 = 0;
            int iDecodeIntElement9 = 0;
            int iDecodeIntElement10 = 0;
            int iDecodeIntElement11 = 0;
            int iDecodeIntElement12 = 0;
            int iDecodeIntElement13 = 0;
            int iDecodeIntElement14 = 0;
            boolean zDecodeBooleanElement2 = false;
            float fDecodeFloatElement2 = 0.0f;
            String str19 = null;
            int iDecodeIntElement15 = 0;
            int iDecodeIntElement16 = 0;
            while (z6) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z6 = false;
                        i18 = 8;
                        break;
                    case 0:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i20 |= 1;
                        i18 = 8;
                        i19 = 17;
                        break;
                    case 1:
                        iDecodeIntElement10 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i20 |= 2;
                        i18 = 8;
                        i19 = 17;
                        break;
                    case 2:
                        iDecodeIntElement9 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i20 |= 4;
                        i18 = 8;
                        i19 = 17;
                        break;
                    case 3:
                        iDecodeIntElement11 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i20 |= 8;
                        i18 = 8;
                        i19 = 17;
                        break;
                    case 4:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s1.f17602a, str19);
                        i20 |= 16;
                        i18 = 8;
                        i19 = 17;
                        break;
                    case 5:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, s1.f17602a, str14);
                        i20 |= 32;
                        i18 = 8;
                        i19 = 17;
                        break;
                    case 6:
                        c8 = 7;
                        iDecodeIntElement14 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i20 |= 64;
                        i18 = 8;
                        i19 = 17;
                        break;
                    case 7:
                        c8 = 7;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, s1.f17602a, str15);
                        i20 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        i18 = 8;
                        i19 = 17;
                        break;
                    case 8:
                        iDecodeIntElement16 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i18);
                        i20 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        i19 = 17;
                        break;
                    case 9:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, s1.f17602a, str17);
                        i20 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        i19 = 17;
                        break;
                    case 10:
                        iDecodeIntElement13 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
                        i20 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        i19 = 17;
                        break;
                    case 11:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, s1.f17602a, str18);
                        i20 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        i19 = 17;
                        break;
                    case 12:
                        iDecodeIntElement12 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
                        i20 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        i19 = 17;
                        break;
                    case 13:
                        iDecodeIntElement15 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 13);
                        i20 |= 8192;
                        i19 = 17;
                        break;
                    case 14:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, s1.f17602a, str16);
                        i20 |= 16384;
                        i19 = 17;
                        break;
                    case 15:
                        fDecodeFloatElement2 = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, 15);
                        i20 |= PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
                        i19 = 17;
                        break;
                    case 16:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 16);
                        i20 |= 65536;
                        break;
                    case 17:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i19);
                        i20 |= 131072;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            str = str14;
            str2 = str15;
            i7 = iDecodeIntElement15;
            str3 = str19;
            i10 = i20;
            str4 = str16;
            str5 = str17;
            str6 = str18;
            i11 = iDecodeIntElement16;
            i12 = iDecodeIntElement9;
            i13 = iDecodeIntElement10;
            i14 = iDecodeIntElement11;
            f2 = fDecodeFloatElement2;
            str7 = strDecodeStringElement3;
            i15 = iDecodeIntElement12;
            strDecodeStringElement = strDecodeStringElement4;
            i16 = iDecodeIntElement13;
            i17 = iDecodeIntElement14;
            z5 = zDecodeBooleanElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GiftEmbed.Resolved.Valid(i10, str7, i13, i12, i14, str3, str, i17, str2, i11, str5, i16, str6, i15, i7, str4, f2, z5, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull GiftEmbed.Resolved.Valid value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        GiftEmbed.Resolved.Valid.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
