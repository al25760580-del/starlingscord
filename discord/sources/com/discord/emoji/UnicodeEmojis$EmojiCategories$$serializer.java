package com.discord.emoji;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
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
import kr.j;
import or.e1;
import or.f0;
import or.g1;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/emoji/UnicodeEmojis.EmojiCategories.$serializer", "Lor/f0;", "Lcom/discord/emoji/UnicodeEmojis$EmojiCategories;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/emoji/UnicodeEmojis$EmojiCategories;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/emoji/UnicodeEmojis$EmojiCategories;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "emoji_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class UnicodeEmojis$EmojiCategories$$serializer implements f0 {

    @NotNull
    public static final UnicodeEmojis$EmojiCategories$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        UnicodeEmojis$EmojiCategories$$serializer unicodeEmojis$EmojiCategories$$serializer = new UnicodeEmojis$EmojiCategories$$serializer();
        INSTANCE = unicodeEmojis$EmojiCategories$$serializer;
        g1 g1Var = new g1("com.discord.emoji.UnicodeEmojis.EmojiCategories", unicodeEmojis$EmojiCategories$$serializer, 8);
        g1Var.b("people", false);
        g1Var.b("nature", false);
        g1Var.b("food", false);
        g1Var.b("activity", false);
        g1Var.b("travel", false);
        g1Var.b("objects", false);
        g1Var.b("symbols", false);
        g1Var.b("flags", false);
        descriptor = g1Var;
    }

    private UnicodeEmojis$EmojiCategories$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = UnicodeEmojis.EmojiCategories.$childSerializers;
        return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), lazyArr[2].getValue(), lazyArr[3].getValue(), lazyArr[4].getValue(), lazyArr[5].getValue(), lazyArr[6].getValue(), lazyArr[7].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final UnicodeEmojis.EmojiCategories deserialize(@NotNull Decoder decoder) {
        int i7;
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        List list8;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = UnicodeEmojis.EmojiCategories.$childSerializers;
        int i10 = 7;
        int i11 = 4;
        List list9 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list10 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            List list11 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            List list12 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            List list13 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            List list14 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            List list15 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            List list16 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), null);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), null);
            list5 = list10;
            i7 = 255;
            list2 = list16;
            list3 = list15;
            list8 = list13;
            list4 = list14;
            list7 = list12;
            list6 = list11;
        } else {
            int i12 = 3;
            int i13 = 2;
            int i14 = 1;
            boolean z5 = true;
            int i15 = 0;
            List list17 = null;
            List list18 = null;
            List list19 = null;
            List list20 = null;
            List list21 = null;
            List list22 = null;
            List list23 = null;
            while (z5) {
                int i16 = i11;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        i10 = 7;
                        i11 = 4;
                        i14 = 1;
                        i13 = 2;
                        i12 = 3;
                        break;
                    case 0:
                        list9 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), list9);
                        i15 |= 1;
                        i10 = 7;
                        i11 = 4;
                        i14 = 1;
                        i13 = 2;
                        i12 = 3;
                        break;
                    case 1:
                        list21 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i14, (DeserializationStrategy) lazyArr[i14].getValue(), list21);
                        i15 |= 2;
                        i10 = 7;
                        i11 = 4;
                        i13 = 2;
                        i12 = 3;
                        break;
                    case 2:
                        list22 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i13, (DeserializationStrategy) lazyArr[i13].getValue(), list22);
                        i15 |= 4;
                        i10 = 7;
                        i11 = 4;
                        i12 = 3;
                        break;
                    case 3:
                        list23 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i12, (DeserializationStrategy) lazyArr[i12].getValue(), list23);
                        i15 |= 8;
                        i10 = 7;
                        i11 = 4;
                        break;
                    case 4:
                        list20 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i16, (DeserializationStrategy) lazyArr[i16].getValue(), list20);
                        i15 |= 16;
                        i11 = i16;
                        i10 = 7;
                        break;
                    case 5:
                        list19 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), list19);
                        i15 |= 32;
                        i11 = i16;
                        break;
                    case 6:
                        list18 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), list18);
                        i15 |= 64;
                        i11 = i16;
                        break;
                    case 7:
                        list17 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i10, (DeserializationStrategy) lazyArr[i10].getValue(), list17);
                        i15 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        i11 = i16;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            i7 = i15;
            list = list17;
            list2 = list18;
            list3 = list19;
            list4 = list20;
            list5 = list9;
            list6 = list21;
            list7 = list22;
            list8 = list23;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UnicodeEmojis.EmojiCategories(i7, list5, list6, list7, list8, list4, list3, list2, list, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull UnicodeEmojis.EmojiCategories value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UnicodeEmojis.EmojiCategories.write$Self$emoji_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
