package com.discord.mobile_voice_overlay;

import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser.$serializer", "Lor/f0;", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayDataUser;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@rn.d
public /* synthetic */ class MobileVoiceOverlayDataUser$$serializer implements f0 {

    @NotNull
    public static final MobileVoiceOverlayDataUser$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        MobileVoiceOverlayDataUser$$serializer mobileVoiceOverlayDataUser$$serializer = new MobileVoiceOverlayDataUser$$serializer();
        INSTANCE = mobileVoiceOverlayDataUser$$serializer;
        g1 g1Var = new g1("com.discord.mobile_voice_overlay.MobileVoiceOverlayDataUser", mobileVoiceOverlayDataUser$$serializer, 4);
        g1Var.b("userId", false);
        g1Var.b("avatar", false);
        g1Var.b("speaking", false);
        g1Var.b("discriminator", false);
        descriptor = g1Var;
    }

    private MobileVoiceOverlayDataUser$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{UserId$$serializer.INSTANCE, com.facebook.imagepipeline.nativecode.b.p(s1.f17602a), g.f17537a, m0.f17573a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final MobileVoiceOverlayDataUser deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        boolean z5;
        int i7;
        UserId userId;
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            UserId userId2 = (UserId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, UserId$$serializer.INSTANCE, null);
            String str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, s1.f17602a, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            userId = userId2;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            z5 = zDecodeBooleanElement;
            str = str2;
            i7 = 15;
        } else {
            boolean z6 = true;
            int iDecodeIntElement2 = 0;
            int i10 = 0;
            UserId userId3 = null;
            String str3 = null;
            boolean zDecodeBooleanElement2 = false;
            while (z6) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z6 = false;
                } else if (iDecodeElementIndex == 0) {
                    userId3 = (UserId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, UserId$$serializer.INSTANCE, userId3);
                    i10 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, s1.f17602a, str3);
                    i10 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                    i10 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new j(iDecodeElementIndex);
                    }
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                    i10 |= 8;
                }
            }
            iDecodeIntElement = iDecodeIntElement2;
            z5 = zDecodeBooleanElement2;
            i7 = i10;
            userId = userId3;
            str = str3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MobileVoiceOverlayDataUser(i7, userId, str, z5, iDecodeIntElement, null, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull MobileVoiceOverlayDataUser value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MobileVoiceOverlayDataUser.write$Self$mobile_voice_overlay_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
