package com.discord.chat.bridge.botuikit;

import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.devsupport.StackTraceHelper;
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
import or.a1;
import or.e1;
import or.f0;
import or.g;
import or.g1;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/botuikit/ContainerComponent.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/botuikit/ContainerComponent;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/botuikit/ContainerComponent;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/botuikit/ContainerComponent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class ContainerComponent$$serializer implements f0 {

    @NotNull
    public static final ContainerComponent$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ContainerComponent$$serializer containerComponent$$serializer = new ContainerComponent$$serializer();
        INSTANCE = containerComponent$$serializer;
        g1 g1Var = new g1("17", containerComponent$$serializer, 10);
        g1Var.b("type", false);
        g1Var.b(StackTraceHelper.ID_KEY, false);
        g1Var.b("errorText", true);
        g1Var.b("components", false);
        g1Var.b("accentColor", true);
        g1Var.b("isSpoiler", false);
        g1Var.b("spoilerDescription", false);
        g1Var.b("themedBackgroundColor", true);
        g1Var.b("spoilerOrNull", true);
        g1Var.b("obscureOrNull", true);
        descriptor = g1Var;
    }

    private ContainerComponent$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ContainerComponent.$childSerializers;
        m0 m0Var = m0.f17573a;
        s1 s1Var = s1.f17602a;
        return new KSerializer[]{m0Var, s1Var, b.p(s1Var), lazyArr[3].getValue(), b.p(m0Var), g.f17537a, b.p(s1Var), b.p(m0Var), b.p(s1Var), b.p(a1.f17502a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final ContainerComponent deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        Void r31;
        String str;
        Integer num;
        Integer num2;
        String str2;
        List list;
        String str3;
        boolean z5;
        int i7;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ContainerComponent.$childSerializers;
        int i10 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            s1 s1Var = s1.f17602a;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, s1Var, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            m0 m0Var = m0.f17573a;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, m0Var, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, s1Var, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, m0Var, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, s1Var, null);
            list = list2;
            r31 = (Void) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, a1.f17502a, null);
            num = num4;
            str2 = str6;
            z5 = zDecodeBooleanElement;
            str = str7;
            num2 = num3;
            str3 = str5;
            i7 = 1023;
            str4 = strDecodeStringElement;
        } else {
            int i11 = 3;
            boolean z6 = true;
            iDecodeIntElement = 0;
            int i12 = 0;
            Void r6 = null;
            String str8 = null;
            Integer num5 = null;
            Integer num6 = null;
            String str9 = null;
            List list3 = null;
            String strDecodeStringElement2 = null;
            boolean zDecodeBooleanElement2 = false;
            String str10 = null;
            while (z6) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z6 = false;
                        i10 = 9;
                        i11 = 3;
                        break;
                    case 0:
                        i12 |= 1;
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i10 = 9;
                        i11 = 3;
                        break;
                    case 1:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i12 |= 2;
                        i10 = 9;
                        i11 = 3;
                        break;
                    case 2:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, s1.f17602a, str10);
                        i12 |= 4;
                        i10 = 9;
                        i11 = 3;
                        break;
                    case 3:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i11, (DeserializationStrategy) lazyArr[i11].getValue(), list3);
                        i12 |= 8;
                        i10 = 9;
                        break;
                    case 4:
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, m0.f17573a, num6);
                        i12 |= 16;
                        i10 = 9;
                        break;
                    case 5:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i12 |= 32;
                        i10 = 9;
                        break;
                    case 6:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, s1.f17602a, str9);
                        i12 |= 64;
                        i10 = 9;
                        break;
                    case 7:
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, m0.f17573a, num5);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        i10 = 9;
                        break;
                    case 8:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, s1.f17602a, str8);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    case 9:
                        r6 = (Void) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i10, a1.f17502a, r6);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            r31 = r6;
            str = str8;
            num = num5;
            num2 = num6;
            str2 = str9;
            list = list3;
            str3 = str10;
            z5 = zDecodeBooleanElement2;
            i7 = i12;
            str4 = strDecodeStringElement2;
        }
        int i13 = iDecodeIntElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ContainerComponent(i7, i13, str4, str3, list, num2, z5, str2, num, str, r31, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ContainerComponent value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ContainerComponent.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
