package com.discord.activity_invites;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kr.j;
import or.e0;
import or.e1;
import or.f0;
import or.g1;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/activity_invites/RGBAColorModel.$serializer", "Lor/f0;", "Lcom/discord/activity_invites/RGBAColorModel;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/activity_invites/RGBAColorModel;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/activity_invites/RGBAColorModel;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "activity_invites_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class RGBAColorModel$$serializer implements f0 {

    @NotNull
    public static final RGBAColorModel$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RGBAColorModel$$serializer rGBAColorModel$$serializer = new RGBAColorModel$$serializer();
        INSTANCE = rGBAColorModel$$serializer;
        g1 g1Var = new g1("com.discord.activity_invites.RGBAColorModel", rGBAColorModel$$serializer, 4);
        g1Var.b("r", false);
        g1Var.b("g", false);
        g1Var.b("b", false);
        g1Var.b("a", false);
        descriptor = g1Var;
    }

    private RGBAColorModel$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        e0 e0Var = e0.f17525a;
        return new KSerializer[]{e0Var, e0Var, e0Var, e0Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final RGBAColorModel deserialize(@NotNull Decoder decoder) {
        float fDecodeFloatElement;
        float fDecodeFloatElement2;
        float f2;
        float f7;
        int i7;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, 0);
            float fDecodeFloatElement3 = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, 1);
            float fDecodeFloatElement4 = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, 2);
            fDecodeFloatElement2 = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, 3);
            f2 = fDecodeFloatElement4;
            f7 = fDecodeFloatElement3;
            i7 = 15;
        } else {
            fDecodeFloatElement = 0.0f;
            float fDecodeFloatElement5 = 0.0f;
            float fDecodeFloatElement6 = 0.0f;
            float fDecodeFloatElement7 = 0.0f;
            boolean z5 = true;
            int i10 = 0;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z5 = false;
                } else if (iDecodeElementIndex == 0) {
                    fDecodeFloatElement = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, 0);
                    i10 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    fDecodeFloatElement7 = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, 1);
                    i10 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    fDecodeFloatElement6 = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, 2);
                    i10 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new j(iDecodeElementIndex);
                    }
                    fDecodeFloatElement5 = compositeDecoderBeginStructure.decodeFloatElement(serialDescriptor, 3);
                    i10 |= 8;
                }
            }
            fDecodeFloatElement2 = fDecodeFloatElement5;
            f2 = fDecodeFloatElement6;
            f7 = fDecodeFloatElement7;
            i7 = i10;
        }
        float f10 = fDecodeFloatElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RGBAColorModel(i7, f10, f7, f2, fDecodeFloatElement2, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull RGBAColorModel value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RGBAColorModel.write$Self$activity_invites_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
