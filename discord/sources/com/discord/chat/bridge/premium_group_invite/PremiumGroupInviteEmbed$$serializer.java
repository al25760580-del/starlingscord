package com.discord.chat.bridge.premium_group_invite;

import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText;
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableTextSerializer;
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
import or.g1;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/premium_group_invite/PremiumGroupInviteEmbed.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/premium_group_invite/PremiumGroupInviteEmbed;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/premium_group_invite/PremiumGroupInviteEmbed;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/premium_group_invite/PremiumGroupInviteEmbed;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class PremiumGroupInviteEmbed$$serializer implements f0 {

    @NotNull
    public static final PremiumGroupInviteEmbed$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PremiumGroupInviteEmbed$$serializer premiumGroupInviteEmbed$$serializer = new PremiumGroupInviteEmbed$$serializer();
        INSTANCE = premiumGroupInviteEmbed$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.premium_group_invite.PremiumGroupInviteEmbed", premiumGroupInviteEmbed$$serializer, 11);
        g1Var.b("headerText", false);
        g1Var.b("headerColor", false);
        g1Var.b(ViewProps.BACKGROUND_COLOR, false);
        g1Var.b(ViewProps.BORDER_COLOR, false);
        g1Var.b("headerImageUrl", false);
        g1Var.b("betaPillText", false);
        g1Var.b("betaPillTextColor", false);
        g1Var.b("betaPillBackgroundColor", false);
        g1Var.b("bodyText", false);
        g1Var.b("bodyTextColor", false);
        g1Var.b("learnMoreLink", false);
        descriptor = g1Var;
    }

    private PremiumGroupInviteEmbed$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        s1 s1Var = s1.f17602a;
        m0 m0Var = m0.f17573a;
        return new KSerializer[]{s1Var, m0Var, m0Var, m0Var, s1Var, s1Var, m0Var, m0Var, s1Var, m0Var, AnnotatedStructurableTextSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final PremiumGroupInviteEmbed deserialize(@NotNull Decoder decoder) {
        int i7;
        AnnotatedStructurableText annotatedStructurableText;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i15 = 10;
        int i16 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            int iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
            i16 = 2047;
            str = strDecodeStringElement;
            annotatedStructurableText = (AnnotatedStructurableText) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, AnnotatedStructurableTextSerializer.INSTANCE, null);
            i7 = iDecodeIntElement6;
            i10 = iDecodeIntElement5;
            i11 = iDecodeIntElement4;
            str3 = strDecodeStringElement3;
            i12 = iDecodeIntElement3;
            str4 = strDecodeStringElement4;
            str2 = strDecodeStringElement2;
            i13 = iDecodeIntElement2;
            i14 = iDecodeIntElement;
        } else {
            boolean z5 = true;
            int iDecodeIntElement7 = 0;
            int iDecodeIntElement8 = 0;
            int iDecodeIntElement9 = 0;
            int iDecodeIntElement10 = 0;
            int iDecodeIntElement11 = 0;
            AnnotatedStructurableText annotatedStructurableText2 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            int iDecodeIntElement12 = 0;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        i15 = 10;
                        break;
                    case 0:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i16 |= 1;
                        i15 = 10;
                        break;
                    case 1:
                        iDecodeIntElement11 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i16 |= 2;
                        i15 = 10;
                        break;
                    case 2:
                        iDecodeIntElement10 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i16 |= 4;
                        break;
                    case 3:
                        iDecodeIntElement9 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i16 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i16 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i16 |= 32;
                        break;
                    case 6:
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i16 |= 64;
                        break;
                    case 7:
                        iDecodeIntElement12 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i16 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    case 8:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i16 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    case 9:
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
                        i16 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        break;
                    case 10:
                        annotatedStructurableText2 = (AnnotatedStructurableText) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i15, AnnotatedStructurableTextSerializer.INSTANCE, annotatedStructurableText2);
                        i16 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            i7 = iDecodeIntElement7;
            annotatedStructurableText = annotatedStructurableText2;
            i10 = iDecodeIntElement12;
            i11 = iDecodeIntElement8;
            i12 = iDecodeIntElement9;
            i13 = iDecodeIntElement10;
            i14 = iDecodeIntElement11;
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
        }
        int i17 = i16;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PremiumGroupInviteEmbed(i17, str, i14, i13, i12, str2, str3, i11, i10, str4, i7, annotatedStructurableText, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull PremiumGroupInviteEmbed value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PremiumGroupInviteEmbed.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
