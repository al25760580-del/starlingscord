package com.discord.chat.bridge.referral;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText;
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableTextSerializer;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/referral/ReferralEmbed.Resolved.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/referral/ReferralEmbed$Resolved;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/referral/ReferralEmbed$Resolved;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/referral/ReferralEmbed$Resolved;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class ReferralEmbed$Resolved$$serializer implements f0 {

    @NotNull
    public static final ReferralEmbed$Resolved$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ReferralEmbed$Resolved$$serializer referralEmbed$Resolved$$serializer = new ReferralEmbed$Resolved$$serializer();
        INSTANCE = referralEmbed$Resolved$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.referral.ReferralEmbed.Resolved", referralEmbed$Resolved$$serializer, 22);
        g1Var.b("headerText", false);
        g1Var.b("headerColor", false);
        g1Var.b(ViewProps.BACKGROUND_COLOR, false);
        g1Var.b("thumbnailCornerRadius", false);
        g1Var.b("headerLogoUrl", false);
        g1Var.b("headerUrl", true);
        g1Var.b("thumbnailUrl", true);
        g1Var.b("titleText", true);
        g1Var.b("titleColor", true);
        g1Var.b("bodyText", true);
        g1Var.b("structuredBodyText", true);
        g1Var.b("bodyTextColor", true);
        g1Var.b("linkButtonLabel", true);
        g1Var.b("linkButtonColor", true);
        g1Var.b("subText", true);
        g1Var.b("subTextColor", true);
        g1Var.b("footerText", true);
        g1Var.b("footerTextColor", true);
        g1Var.b("acceptLabelText", true);
        g1Var.b("acceptLabelColor", true);
        g1Var.b("acceptLabelIconUrl", true);
        g1Var.b("canBeAccepted", true);
        descriptor = g1Var;
    }

    private ReferralEmbed$Resolved$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        s1 s1Var = s1.f17602a;
        m0 m0Var = m0.f17573a;
        KSerializer kSerializerP = b.p(s1Var);
        KSerializer kSerializerP2 = b.p(s1Var);
        KSerializer kSerializerP3 = b.p(s1Var);
        KSerializer kSerializerP4 = b.p(s1Var);
        KSerializer kSerializerP5 = b.p(m0Var);
        KSerializer kSerializerP6 = b.p(s1Var);
        AnnotatedStructurableTextSerializer annotatedStructurableTextSerializer = AnnotatedStructurableTextSerializer.INSTANCE;
        return new KSerializer[]{s1Var, m0Var, m0Var, m0Var, kSerializerP, kSerializerP2, kSerializerP3, kSerializerP4, kSerializerP5, kSerializerP6, b.p(annotatedStructurableTextSerializer), b.p(m0Var), b.p(annotatedStructurableTextSerializer), b.p(m0Var), b.p(s1Var), b.p(m0Var), b.p(s1Var), b.p(m0Var), b.p(s1Var), b.p(m0Var), b.p(s1Var), b.p(g.f17537a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final ReferralEmbed.Resolved deserialize(@NotNull Decoder decoder) {
        String str;
        Integer num;
        String str2;
        Integer num2;
        String str3;
        Integer num3;
        int i7;
        Integer num4;
        String str4;
        Integer num5;
        AnnotatedStructurableText annotatedStructurableText;
        AnnotatedStructurableText annotatedStructurableText2;
        String str5;
        String str6;
        String str7;
        String str8;
        Integer num6;
        String str9;
        Boolean bool;
        String str10;
        int i10;
        int i11;
        int i12;
        int i13;
        String str11;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i14 = 0;
        Integer num7 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            s1 s1Var = s1.f17602a;
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s1Var, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, s1Var, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, s1Var, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, s1Var, null);
            m0 m0Var = m0.f17573a;
            Integer num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, m0Var, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, s1Var, null);
            AnnotatedStructurableTextSerializer annotatedStructurableTextSerializer = AnnotatedStructurableTextSerializer.INSTANCE;
            AnnotatedStructurableText annotatedStructurableText3 = (AnnotatedStructurableText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, annotatedStructurableTextSerializer, null);
            Integer num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, m0Var, null);
            AnnotatedStructurableText annotatedStructurableText4 = (AnnotatedStructurableText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, annotatedStructurableTextSerializer, null);
            Integer num10 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, m0Var, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, s1Var, null);
            Integer num11 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, m0Var, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, s1Var, null);
            Integer num12 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, m0Var, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, s1Var, null);
            Integer num13 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, m0Var, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, s1Var, null);
            num = num13;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, g.f17537a, null);
            num5 = num10;
            i10 = iDecodeIntElement3;
            str = str12;
            num6 = num8;
            i11 = iDecodeIntElement2;
            i12 = iDecodeIntElement;
            str2 = str20;
            i7 = 4194303;
            annotatedStructurableText2 = annotatedStructurableText3;
            str9 = str16;
            str8 = str15;
            str7 = str14;
            str3 = str19;
            num3 = num12;
            str4 = str18;
            num4 = num11;
            str10 = str17;
            annotatedStructurableText = annotatedStructurableText4;
            num2 = num9;
            str5 = strDecodeStringElement;
            str6 = str13;
        } else {
            boolean z5 = true;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            String str21 = null;
            Boolean bool2 = null;
            Integer num14 = null;
            String str22 = null;
            Integer num15 = null;
            String str23 = null;
            Integer num16 = null;
            String str24 = null;
            Integer num17 = null;
            AnnotatedStructurableText annotatedStructurableText5 = null;
            AnnotatedStructurableText annotatedStructurableText6 = null;
            String str25 = null;
            String strDecodeStringElement2 = null;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            String str29 = null;
            Integer num18 = null;
            while (z5) {
                String str30 = str25;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str11 = str30;
                        z5 = false;
                        annotatedStructurableText6 = annotatedStructurableText6;
                        str25 = str11;
                        bool2 = bool2;
                        str21 = str21;
                        break;
                    case 0:
                        str11 = str30;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i14 |= 1;
                        annotatedStructurableText6 = annotatedStructurableText6;
                        str25 = str11;
                        bool2 = bool2;
                        str21 = str21;
                        break;
                    case 1:
                        str11 = str30;
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i14 |= 2;
                        annotatedStructurableText6 = annotatedStructurableText6;
                        str25 = str11;
                        bool2 = bool2;
                        str21 = str21;
                        break;
                    case 2:
                        str11 = str30;
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i14 |= 4;
                        annotatedStructurableText6 = annotatedStructurableText6;
                        str25 = str11;
                        bool2 = bool2;
                        str21 = str21;
                        break;
                    case 3:
                        str11 = str30;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i14 |= 8;
                        annotatedStructurableText6 = annotatedStructurableText6;
                        str25 = str11;
                        bool2 = bool2;
                        str21 = str21;
                        break;
                    case 4:
                        str21 = str21;
                        bool2 = bool2;
                        str11 = str30;
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s1.f17602a, str26);
                        i14 |= 16;
                        annotatedStructurableText6 = annotatedStructurableText6;
                        str27 = str27;
                        str25 = str11;
                        bool2 = bool2;
                        str21 = str21;
                        break;
                    case 5:
                        str21 = str21;
                        bool2 = bool2;
                        str11 = str30;
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, s1.f17602a, str27);
                        i14 |= 32;
                        annotatedStructurableText6 = annotatedStructurableText6;
                        str28 = str28;
                        str25 = str11;
                        bool2 = bool2;
                        str21 = str21;
                        break;
                    case 6:
                        str21 = str21;
                        bool2 = bool2;
                        str11 = str30;
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, s1.f17602a, str28);
                        i14 |= 64;
                        annotatedStructurableText6 = annotatedStructurableText6;
                        str29 = str29;
                        str25 = str11;
                        bool2 = bool2;
                        str21 = str21;
                        break;
                    case 7:
                        str21 = str21;
                        bool2 = bool2;
                        str11 = str30;
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, s1.f17602a, str29);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        annotatedStructurableText6 = annotatedStructurableText6;
                        num18 = num18;
                        str25 = str11;
                        bool2 = bool2;
                        str21 = str21;
                        break;
                    case 8:
                        str11 = str30;
                        num18 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, m0.f17573a, num18);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        annotatedStructurableText6 = annotatedStructurableText6;
                        str25 = str11;
                        bool2 = bool2;
                        str21 = str21;
                        break;
                    case 9:
                        str21 = str21;
                        String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, s1.f17602a, str30);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        annotatedStructurableText6 = annotatedStructurableText6;
                        bool2 = bool2;
                        str25 = str31;
                        str21 = str21;
                        break;
                    case 10:
                        annotatedStructurableText6 = (AnnotatedStructurableText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, AnnotatedStructurableTextSerializer.INSTANCE, annotatedStructurableText6);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        str21 = str21;
                        str25 = str30;
                        break;
                    case 11:
                        annotatedStructurableText6 = annotatedStructurableText6;
                        num15 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, m0.f17573a, num15);
                        i14 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        str25 = str30;
                        annotatedStructurableText6 = annotatedStructurableText6;
                        break;
                    case 12:
                        annotatedStructurableText6 = annotatedStructurableText6;
                        annotatedStructurableText5 = (AnnotatedStructurableText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, AnnotatedStructurableTextSerializer.INSTANCE, annotatedStructurableText5);
                        i14 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        str25 = str30;
                        annotatedStructurableText6 = annotatedStructurableText6;
                        break;
                    case 13:
                        annotatedStructurableText6 = annotatedStructurableText6;
                        num17 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, m0.f17573a, num17);
                        i14 |= 8192;
                        str25 = str30;
                        annotatedStructurableText6 = annotatedStructurableText6;
                        break;
                    case 14:
                        annotatedStructurableText6 = annotatedStructurableText6;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, s1.f17602a, str21);
                        i14 |= 16384;
                        str25 = str30;
                        annotatedStructurableText6 = annotatedStructurableText6;
                        break;
                    case 15:
                        num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, m0.f17573a, num7);
                        i13 = PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
                        i14 |= i13;
                        str25 = str30;
                        annotatedStructurableText6 = annotatedStructurableText6;
                        break;
                    case 16:
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, s1.f17602a, str24);
                        i13 = 65536;
                        i14 |= i13;
                        str25 = str30;
                        annotatedStructurableText6 = annotatedStructurableText6;
                        break;
                    case 17:
                        num16 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, m0.f17573a, num16);
                        i13 = 131072;
                        i14 |= i13;
                        str25 = str30;
                        annotatedStructurableText6 = annotatedStructurableText6;
                        break;
                    case 18:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, s1.f17602a, str23);
                        i13 = 262144;
                        i14 |= i13;
                        str25 = str30;
                        annotatedStructurableText6 = annotatedStructurableText6;
                        break;
                    case 19:
                        num14 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, m0.f17573a, num14);
                        i13 = 524288;
                        i14 |= i13;
                        str25 = str30;
                        annotatedStructurableText6 = annotatedStructurableText6;
                        break;
                    case 20:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, s1.f17602a, str22);
                        i13 = 1048576;
                        i14 |= i13;
                        str25 = str30;
                        annotatedStructurableText6 = annotatedStructurableText6;
                        break;
                    case 21:
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, g.f17537a, bool2);
                        i13 = 2097152;
                        i14 |= i13;
                        str25 = str30;
                        annotatedStructurableText6 = annotatedStructurableText6;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            str = str26;
            num = num14;
            str2 = str22;
            num2 = num15;
            str3 = str23;
            num3 = num16;
            i7 = i14;
            num4 = num7;
            str4 = str24;
            num5 = num17;
            annotatedStructurableText = annotatedStructurableText5;
            annotatedStructurableText2 = annotatedStructurableText6;
            str5 = strDecodeStringElement2;
            str6 = str27;
            str7 = str28;
            str8 = str29;
            num6 = num18;
            str9 = str25;
            bool = bool2;
            str10 = str21;
            i10 = iDecodeIntElement4;
            i11 = iDecodeIntElement5;
            i12 = iDecodeIntElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ReferralEmbed.Resolved(i7, str5, i12, i11, i10, str, str6, str7, str8, num6, str9, annotatedStructurableText2, num2, annotatedStructurableText, num5, str10, num4, str4, num3, str3, num, str2, bool, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ReferralEmbed.Resolved value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ReferralEmbed.Resolved.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
