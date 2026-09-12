package com.discord.chat.bridge.polls;

import com.facebook.imagepipeline.nativecode.b;
import java.util.Set;
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
import or.r0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/polls/PollMedia.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/polls/PollMedia;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/polls/PollMedia;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/polls/PollMedia;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class PollMedia$$serializer implements f0 {

    @NotNull
    public static final PollMedia$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PollMedia$$serializer pollMedia$$serializer = new PollMedia$$serializer();
        INSTANCE = pollMedia$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.polls.PollMedia", pollMedia$$serializer, 4);
        g1Var.b("text", true);
        g1Var.b("attachmentIds", true);
        g1Var.b("emoji", true);
        g1Var.b("stickerId", true);
        descriptor = g1Var;
    }

    private PollMedia$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{b.p(s1.f17602a), PollMedia.$childSerializers[1].getValue(), b.p(PollMediaEmoji$$serializer.INSTANCE), b.p(r0.f17595a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final PollMedia deserialize(@NotNull Decoder decoder) {
        int i7;
        String str;
        Set set;
        PollMediaEmoji pollMediaEmoji;
        Long l6;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PollMedia.$childSerializers;
        String str2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, s1.f17602a, null);
            Set set2 = (Set) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            PollMediaEmoji pollMediaEmoji2 = (PollMediaEmoji) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, PollMediaEmoji$$serializer.INSTANCE, null);
            set = set2;
            str = str3;
            l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, r0.f17595a, null);
            pollMediaEmoji = pollMediaEmoji2;
            i7 = 15;
        } else {
            boolean z5 = true;
            int i10 = 0;
            Set set3 = null;
            PollMediaEmoji pollMediaEmoji3 = null;
            Long l7 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z5 = false;
                } else if (iDecodeElementIndex == 0) {
                    str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, s1.f17602a, str2);
                    i10 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    set3 = (Set) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), set3);
                    i10 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    pollMediaEmoji3 = (PollMediaEmoji) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, PollMediaEmoji$$serializer.INSTANCE, pollMediaEmoji3);
                    i10 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new j(iDecodeElementIndex);
                    }
                    l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, r0.f17595a, l7);
                    i10 |= 8;
                }
            }
            i7 = i10;
            str = str2;
            set = set3;
            pollMediaEmoji = pollMediaEmoji3;
            l6 = l7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PollMedia(i7, str, set, pollMediaEmoji, l6, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull PollMedia value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PollMedia.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
