package com.discord.chat.bridge.referral;

import com.facebook.imagepipeline.nativecode.b;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/referral/ReferralEmbed.Resolving.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/referral/ReferralEmbed$Resolving;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/referral/ReferralEmbed$Resolving;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/referral/ReferralEmbed$Resolving;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class ReferralEmbed$Resolving$$serializer implements f0 {

    @NotNull
    public static final ReferralEmbed$Resolving$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ReferralEmbed$Resolving$$serializer referralEmbed$Resolving$$serializer = new ReferralEmbed$Resolving$$serializer();
        INSTANCE = referralEmbed$Resolving$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.referral.ReferralEmbed.Resolving", referralEmbed$Resolving$$serializer, 7);
        g1Var.b("headerText", false);
        g1Var.b("headerColor", false);
        g1Var.b(ViewProps.BACKGROUND_COLOR, false);
        g1Var.b("thumbnailCornerRadius", false);
        g1Var.b("headerLogoUrl", false);
        g1Var.b("resolvingGradientStart", false);
        g1Var.b("resolvingGradientEnd", false);
        descriptor = g1Var;
    }

    private ReferralEmbed$Resolving$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        s1 s1Var = s1.f17602a;
        KSerializer kSerializerP = b.p(s1Var);
        m0 m0Var = m0.f17573a;
        return new KSerializer[]{s1Var, m0Var, m0Var, m0Var, kSerializerP, m0Var, m0Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final ReferralEmbed.Resolving deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        String str;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s1.f17602a, null);
            int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            str2 = strDecodeStringElement;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            i7 = iDecodeIntElement5;
            i10 = iDecodeIntElement4;
            str = str3;
            i11 = iDecodeIntElement3;
            i12 = iDecodeIntElement2;
            i13 = 127;
        } else {
            boolean z5 = true;
            int iDecodeIntElement6 = 0;
            int iDecodeIntElement7 = 0;
            int iDecodeIntElement8 = 0;
            int iDecodeIntElement9 = 0;
            int i14 = 0;
            String strDecodeStringElement2 = null;
            int iDecodeIntElement10 = 0;
            String str4 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        break;
                    case 0:
                        i14 |= 1;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        continue;
                    case 1:
                        iDecodeIntElement9 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i14 |= 2;
                        continue;
                    case 2:
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i14 |= 4;
                        break;
                    case 3:
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i14 |= 8;
                        break;
                    case 4:
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s1.f17602a, str4);
                        i14 |= 16;
                        break;
                    case 5:
                        iDecodeIntElement10 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i14 |= 32;
                        break;
                    case 6:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i14 |= 64;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            iDecodeIntElement = iDecodeIntElement6;
            str = str4;
            i7 = iDecodeIntElement10;
            i10 = iDecodeIntElement7;
            i11 = iDecodeIntElement8;
            i12 = iDecodeIntElement9;
            i13 = i14;
            str2 = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ReferralEmbed.Resolving(i13, str2, i12, i11, i10, str, i7, iDecodeIntElement, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ReferralEmbed.Resolving value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ReferralEmbed.Resolving.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
