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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/referral/ReferralEmbedRedesign.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/referral/ReferralEmbedRedesign;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/referral/ReferralEmbedRedesign;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/referral/ReferralEmbedRedesign;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class ReferralEmbedRedesign$$serializer implements f0 {

    @NotNull
    public static final ReferralEmbedRedesign$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ReferralEmbedRedesign$$serializer referralEmbedRedesign$$serializer = new ReferralEmbedRedesign$$serializer();
        INSTANCE = referralEmbedRedesign$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.referral.ReferralEmbedRedesign", referralEmbedRedesign$$serializer, 19);
        g1Var.b("titleText", true);
        g1Var.b("titleColor", true);
        g1Var.b("headerImageUrl", true);
        g1Var.b("headerText", true);
        g1Var.b("headerColor", true);
        g1Var.b(ViewProps.BACKGROUND_COLOR, true);
        g1Var.b(ViewProps.BORDER_COLOR, true);
        g1Var.b("bodyText", true);
        g1Var.b("structuredBodyText", true);
        g1Var.b("bodyTextColor", true);
        g1Var.b("subText", true);
        g1Var.b("subTextColor", true);
        g1Var.b("footerText", true);
        g1Var.b("footerTextColor", true);
        g1Var.b("acceptLabelText", true);
        g1Var.b("acceptLabelColor", true);
        g1Var.b("acceptLabelIconUrl", true);
        g1Var.b("canBeAccepted", true);
        g1Var.b("learnMoreLink", true);
        descriptor = g1Var;
    }

    private ReferralEmbedRedesign$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        s1 s1Var = s1.f17602a;
        m0 m0Var = m0.f17573a;
        KSerializer kSerializerP = b.p(m0Var);
        KSerializer kSerializerP2 = b.p(m0Var);
        KSerializer kSerializerP3 = b.p(m0Var);
        KSerializer kSerializerP4 = b.p(m0Var);
        KSerializer kSerializerP5 = b.p(s1Var);
        AnnotatedStructurableTextSerializer annotatedStructurableTextSerializer = AnnotatedStructurableTextSerializer.INSTANCE;
        return new KSerializer[]{s1Var, kSerializerP, s1Var, s1Var, kSerializerP2, kSerializerP3, kSerializerP4, kSerializerP5, b.p(annotatedStructurableTextSerializer), b.p(m0Var), b.p(s1Var), b.p(m0Var), b.p(s1Var), b.p(m0Var), b.p(s1Var), b.p(m0Var), b.p(s1Var), b.p(g.f17537a), b.p(annotatedStructurableTextSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final ReferralEmbedRedesign deserialize(@NotNull Decoder decoder) {
        String str;
        Integer num;
        int i7;
        AnnotatedStructurableText annotatedStructurableText;
        String str2;
        Integer num2;
        String str3;
        Integer num3;
        Integer num4;
        String str4;
        Integer num5;
        String str5;
        Integer num6;
        Integer num7;
        Integer num8;
        AnnotatedStructurableText annotatedStructurableText2;
        Boolean bool;
        String str6;
        String str7;
        String str8;
        int i10;
        Integer num9;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str9 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            m0 m0Var = m0.f17573a;
            Integer num10 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, m0Var, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            Integer num11 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, m0Var, null);
            Integer num12 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, m0Var, null);
            Integer num13 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, m0Var, null);
            s1 s1Var = s1.f17602a;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, s1Var, null);
            AnnotatedStructurableTextSerializer annotatedStructurableTextSerializer = AnnotatedStructurableTextSerializer.INSTANCE;
            AnnotatedStructurableText annotatedStructurableText3 = (AnnotatedStructurableText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, annotatedStructurableTextSerializer, null);
            Integer num14 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, m0Var, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, s1Var, null);
            Integer num15 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, m0Var, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, s1Var, null);
            Integer num16 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, m0Var, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, s1Var, null);
            Integer num17 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, m0Var, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, s1Var, null);
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, g.f17537a, null);
            num6 = num11;
            annotatedStructurableText2 = annotatedStructurableText3;
            str7 = strDecodeStringElement2;
            num = num10;
            str3 = str14;
            annotatedStructurableText = (AnnotatedStructurableText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, annotatedStructurableTextSerializer, null);
            i7 = 524287;
            num5 = num14;
            str5 = str10;
            num8 = num13;
            num7 = num12;
            str8 = strDecodeStringElement3;
            num2 = num17;
            str2 = str13;
            num3 = num16;
            str = str12;
            num4 = num15;
            str4 = str11;
            str6 = strDecodeStringElement;
        } else {
            boolean z5 = true;
            int i11 = 0;
            Boolean bool2 = null;
            AnnotatedStructurableText annotatedStructurableText4 = null;
            String str15 = null;
            Integer num18 = null;
            AnnotatedStructurableText annotatedStructurableText5 = null;
            Integer num19 = null;
            String str16 = null;
            Integer num20 = null;
            Integer num21 = null;
            String str17 = null;
            Integer num22 = null;
            String str18 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            Integer num23 = null;
            Integer num24 = null;
            Integer num25 = null;
            while (z5) {
                Integer num26 = num18;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        num9 = num26;
                        z5 = false;
                        num18 = num9;
                        annotatedStructurableText4 = annotatedStructurableText4;
                        bool2 = bool2;
                        break;
                    case 0:
                        num9 = num26;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i11 |= 1;
                        num18 = num9;
                        annotatedStructurableText4 = annotatedStructurableText4;
                        bool2 = bool2;
                        break;
                    case 1:
                        num9 = num26;
                        num23 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, m0.f17573a, num23);
                        i11 |= 2;
                        num24 = num24;
                        num18 = num9;
                        annotatedStructurableText4 = annotatedStructurableText4;
                        bool2 = bool2;
                        break;
                    case 2:
                        num9 = num26;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i11 |= 4;
                        num18 = num9;
                        annotatedStructurableText4 = annotatedStructurableText4;
                        bool2 = bool2;
                        break;
                    case 3:
                        num9 = num26;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i11 |= 8;
                        num18 = num9;
                        annotatedStructurableText4 = annotatedStructurableText4;
                        bool2 = bool2;
                        break;
                    case 4:
                        num9 = num26;
                        num24 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, m0.f17573a, num24);
                        i11 |= 16;
                        num25 = num25;
                        num18 = num9;
                        annotatedStructurableText4 = annotatedStructurableText4;
                        bool2 = bool2;
                        break;
                    case 5:
                        num9 = num26;
                        num25 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, m0.f17573a, num25);
                        i11 |= 32;
                        num18 = num9;
                        annotatedStructurableText4 = annotatedStructurableText4;
                        bool2 = bool2;
                        break;
                    case 6:
                        bool2 = bool2;
                        annotatedStructurableText4 = annotatedStructurableText4;
                        num18 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, m0.f17573a, num26);
                        i11 |= 64;
                        annotatedStructurableText4 = annotatedStructurableText4;
                        bool2 = bool2;
                        break;
                    case 7:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, s1.f17602a, str18);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        bool2 = bool2;
                        num18 = num26;
                        break;
                    case 8:
                        str18 = str18;
                        annotatedStructurableText4 = (AnnotatedStructurableText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, AnnotatedStructurableTextSerializer.INSTANCE, annotatedStructurableText4);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        num18 = num26;
                        str18 = str18;
                        break;
                    case 9:
                        str18 = str18;
                        num22 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, m0.f17573a, num22);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        num18 = num26;
                        str18 = str18;
                        break;
                    case 10:
                        str18 = str18;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, s1.f17602a, str17);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        num18 = num26;
                        str18 = str18;
                        break;
                    case 11:
                        str18 = str18;
                        num21 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, m0.f17573a, num21);
                        i11 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        num18 = num26;
                        str18 = str18;
                        break;
                    case 12:
                        str18 = str18;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, s1.f17602a, str15);
                        i11 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        num18 = num26;
                        str18 = str18;
                        break;
                    case 13:
                        str18 = str18;
                        num20 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, m0.f17573a, num20);
                        i11 |= 8192;
                        num18 = num26;
                        str18 = str18;
                        break;
                    case 14:
                        str18 = str18;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, s1.f17602a, str9);
                        i11 |= 16384;
                        num18 = num26;
                        str18 = str18;
                        break;
                    case 15:
                        num19 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, m0.f17573a, num19);
                        i10 = PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
                        i11 |= i10;
                        num18 = num26;
                        str18 = str18;
                        break;
                    case 16:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, s1.f17602a, str16);
                        i10 = 65536;
                        i11 |= i10;
                        num18 = num26;
                        str18 = str18;
                        break;
                    case 17:
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, g.f17537a, bool2);
                        i10 = 131072;
                        i11 |= i10;
                        num18 = num26;
                        str18 = str18;
                        break;
                    case 18:
                        annotatedStructurableText5 = (AnnotatedStructurableText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, AnnotatedStructurableTextSerializer.INSTANCE, annotatedStructurableText5);
                        i10 = 262144;
                        i11 |= i10;
                        num18 = num26;
                        str18 = str18;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            str = str15;
            num = num23;
            i7 = i11;
            annotatedStructurableText = annotatedStructurableText5;
            str2 = str9;
            num2 = num19;
            str3 = str16;
            num3 = num20;
            num4 = num21;
            str4 = str17;
            num5 = num22;
            str5 = str18;
            num6 = num24;
            num7 = num25;
            num8 = num18;
            annotatedStructurableText2 = annotatedStructurableText4;
            bool = bool2;
            str6 = strDecodeStringElement4;
            str7 = strDecodeStringElement5;
            str8 = strDecodeStringElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ReferralEmbedRedesign(i7, str6, num, str7, str8, num6, num7, num8, str5, annotatedStructurableText2, num5, str4, num4, str, num3, str2, num2, str3, bool, annotatedStructurableText, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ReferralEmbedRedesign value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ReferralEmbedRedesign.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
