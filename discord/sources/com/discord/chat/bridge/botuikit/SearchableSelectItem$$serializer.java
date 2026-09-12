package com.discord.chat.bridge.botuikit;

import com.facebook.imagepipeline.nativecode.b;
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
import or.g1;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/botuikit/SearchableSelectItem.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/botuikit/SearchableSelectItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class SearchableSelectItem$$serializer implements f0 {

    @NotNull
    public static final SearchableSelectItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SearchableSelectItem$$serializer searchableSelectItem$$serializer = new SearchableSelectItem$$serializer();
        INSTANCE = searchableSelectItem$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.botuikit.SearchableSelectItem", searchableSelectItem$$serializer, 6);
        g1Var.b("label", false);
        g1Var.b("value", false);
        g1Var.b("type", false);
        g1Var.b("iconSrc", true);
        g1Var.b("iconColor", true);
        g1Var.b("iconEmoji", true);
        descriptor = g1Var;
    }

    private SearchableSelectItem$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        s1 s1Var = s1.f17602a;
        return new KSerializer[]{s1Var, s1Var, SelectOptionType.Serializer.INSTANCE, b.p(s1Var), b.p(m0.f17573a), b.p(ComponentEmoji$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SearchableSelectItem deserialize(@NotNull Decoder decoder) {
        int i7;
        String str;
        String str2;
        SelectOptionType selectOptionType;
        String str3;
        Integer num;
        ComponentEmoji componentEmoji;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            SelectOptionType selectOptionType2 = (SelectOptionType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, SelectOptionType.Serializer.INSTANCE, null);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, s1.f17602a, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, m0.f17573a, null);
            str = strDecodeStringElement2;
            componentEmoji = (ComponentEmoji) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, ComponentEmoji$$serializer.INSTANCE, null);
            str3 = str4;
            num = num2;
            selectOptionType = selectOptionType2;
            str2 = strDecodeStringElement3;
            i7 = 63;
        } else {
            boolean z5 = true;
            int i10 = 0;
            String strDecodeStringElement4 = null;
            SelectOptionType selectOptionType3 = null;
            String str5 = null;
            Integer num3 = null;
            ComponentEmoji componentEmoji2 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        continue;
                    case 0:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i10 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i10 |= 2;
                        break;
                    case 2:
                        selectOptionType3 = (SelectOptionType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, SelectOptionType.Serializer.INSTANCE, selectOptionType3);
                        i10 |= 4;
                        break;
                    case 3:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, s1.f17602a, str5);
                        i10 |= 8;
                        break;
                    case 4:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, m0.f17573a, num3);
                        i10 |= 16;
                        break;
                    case 5:
                        componentEmoji2 = (ComponentEmoji) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, ComponentEmoji$$serializer.INSTANCE, componentEmoji2);
                        i10 |= 32;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            i7 = i10;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement4;
            selectOptionType = selectOptionType3;
            str3 = str5;
            num = num3;
            componentEmoji = componentEmoji2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SearchableSelectItem(i7, str, str2, selectOptionType, str3, num, componentEmoji, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull SearchableSelectItem value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SearchableSelectItem.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
