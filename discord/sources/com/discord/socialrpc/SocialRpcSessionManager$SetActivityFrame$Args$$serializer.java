package com.discord.socialrpc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import kr.j;
import or.e1;
import or.f0;
import or.g1;
import org.jetbrains.annotations.NotNull;
import pr.q;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/socialrpc/SocialRpcSessionManager.SetActivityFrame.Args.$serializer", "Lor/f0;", "Lcom/discord/socialrpc/SocialRpcSessionManager$SetActivityFrame$Args;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/socialrpc/SocialRpcSessionManager$SetActivityFrame$Args;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/socialrpc/SocialRpcSessionManager$SetActivityFrame$Args;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "social_rpc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class SocialRpcSessionManager$SetActivityFrame$Args$$serializer implements f0 {

    @NotNull
    public static final SocialRpcSessionManager$SetActivityFrame$Args$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SocialRpcSessionManager$SetActivityFrame$Args$$serializer socialRpcSessionManager$SetActivityFrame$Args$$serializer = new SocialRpcSessionManager$SetActivityFrame$Args$$serializer();
        INSTANCE = socialRpcSessionManager$SetActivityFrame$Args$$serializer;
        g1 g1Var = new g1("com.discord.socialrpc.SocialRpcSessionManager.SetActivityFrame.Args", socialRpcSessionManager$SetActivityFrame$Args$$serializer, 1);
        g1Var.b("activity", true);
        descriptor = g1Var;
    }

    private SocialRpcSessionManager$SetActivityFrame$Args$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{com.facebook.imagepipeline.nativecode.b.p(q.f18539a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SocialRpcSessionManager.SetActivityFrame.Args deserialize(@NotNull Decoder decoder) {
        JsonObject jsonObject;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i7 = 1;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            jsonObject = (JsonObject) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, q.f18539a, null);
        } else {
            boolean z5 = true;
            int i10 = 0;
            jsonObject = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z5 = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new j(iDecodeElementIndex);
                    }
                    jsonObject = (JsonObject) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, q.f18539a, jsonObject);
                    i10 = 1;
                }
            }
            i7 = i10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SocialRpcSessionManager.SetActivityFrame.Args(i7, jsonObject, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull SocialRpcSessionManager.SetActivityFrame.Args value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SocialRpcSessionManager.SetActivityFrame.Args.write$Self$social_rpc_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
