package com.discord.chat.input.bridge;

import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
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
import or.e0;
import or.e1;
import or.f0;
import or.g;
import or.g1;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/input/bridge/ChatInputNode.$serializer", "Lor/f0;", "Lcom/discord/chat/input/bridge/ChatInputNode;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/input/bridge/ChatInputNode;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/input/bridge/ChatInputNode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_input_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class ChatInputNode$$serializer implements f0 {

    @NotNull
    public static final ChatInputNode$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ChatInputNode$$serializer chatInputNode$$serializer = new ChatInputNode$$serializer();
        INSTANCE = chatInputNode$$serializer;
        g1 g1Var = new g1("com.discord.chat.input.bridge.ChatInputNode", chatInputNode$$serializer, 11);
        g1Var.b("type", false);
        g1Var.b("location", false);
        g1Var.b("length", false);
        g1Var.b("style", true);
        g1Var.b("deleteNodeOnBackspace", true);
        g1Var.b("tapAction", true);
        g1Var.b("editDisabled", true);
        g1Var.b("icon", true);
        g1Var.b("iconSize", true);
        g1Var.b("iconCornerRadius", true);
        g1Var.b("iconSpacing", true);
        descriptor = g1Var;
    }

    private ChatInputNode$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerP = b.p(ChatInputNodeStyle$$serializer.INSTANCE);
        KSerializer kSerializerP2 = b.p(TapAction$$serializer.INSTANCE);
        KSerializer kSerializerP3 = b.p(s1.f17602a);
        e0 e0Var = e0.f17525a;
        KSerializer kSerializerP4 = b.p(e0Var);
        KSerializer kSerializerP5 = b.p(e0Var);
        KSerializer kSerializerP6 = b.p(e0Var);
        m0 m0Var = m0.f17573a;
        g gVar = g.f17537a;
        return new KSerializer[]{m0Var, m0Var, m0Var, kSerializerP, gVar, kSerializerP2, gVar, kSerializerP3, kSerializerP4, kSerializerP5, kSerializerP6};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final ChatInputNode deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        Float f2;
        Float f7;
        String str;
        Float f10;
        TapAction tapAction;
        ChatInputNodeStyle chatInputNodeStyle;
        boolean z5;
        boolean z6;
        int i7;
        int i10;
        char c8;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i11 = 10;
        int i12 = 9;
        int i13 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            ChatInputNodeStyle chatInputNodeStyle2 = (ChatInputNodeStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ChatInputNodeStyle$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            TapAction tapAction2 = (TapAction) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, TapAction$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            String str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, s1.f17602a, null);
            e0 e0Var = e0.f17525a;
            Float f11 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, e0Var, null);
            Float f12 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, e0Var, null);
            Float f13 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, e0Var, null);
            i13 = 2047;
            f2 = f13;
            f7 = f12;
            str = str2;
            z5 = zDecodeBooleanElement2;
            tapAction = tapAction2;
            chatInputNodeStyle = chatInputNodeStyle2;
            f10 = f11;
            z6 = zDecodeBooleanElement;
            i7 = iDecodeIntElement3;
            i10 = iDecodeIntElement2;
        } else {
            boolean z7 = true;
            iDecodeIntElement = 0;
            boolean zDecodeBooleanElement3 = false;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            Float f14 = null;
            Float f15 = null;
            String str3 = null;
            Float f16 = null;
            TapAction tapAction3 = null;
            ChatInputNodeStyle chatInputNodeStyle3 = null;
            boolean zDecodeBooleanElement4 = false;
            while (z7) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z7 = false;
                        i11 = 10;
                        break;
                    case 0:
                        i13 |= 1;
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i11 = 10;
                        i12 = 9;
                        break;
                    case 1:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i13 |= 2;
                        i11 = 10;
                        i12 = 9;
                        break;
                    case 2:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i13 |= 4;
                        i11 = 10;
                        i12 = 9;
                        break;
                    case 3:
                        chatInputNodeStyle3 = (ChatInputNodeStyle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ChatInputNodeStyle$$serializer.INSTANCE, chatInputNodeStyle3);
                        i13 |= 8;
                        i11 = 10;
                        i12 = 9;
                        break;
                    case 4:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i13 |= 16;
                        i11 = 10;
                        i12 = 9;
                        break;
                    case 5:
                        tapAction3 = (TapAction) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, TapAction$$serializer.INSTANCE, tapAction3);
                        i13 |= 32;
                        i11 = 10;
                        i12 = 9;
                        break;
                    case 6:
                        c8 = 7;
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i13 |= 64;
                        i11 = 10;
                        break;
                    case 7:
                        c8 = 7;
                        str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, s1.f17602a, str3);
                        i13 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        i11 = 10;
                        break;
                    case 8:
                        f16 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, e0.f17525a, f16);
                        i13 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    case 9:
                        f15 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i12, e0.f17525a, f15);
                        i13 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        break;
                    case 10:
                        f14 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i11, e0.f17525a, f14);
                        i13 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            f2 = f14;
            f7 = f15;
            str = str3;
            f10 = f16;
            tapAction = tapAction3;
            chatInputNodeStyle = chatInputNodeStyle3;
            z5 = zDecodeBooleanElement4;
            z6 = zDecodeBooleanElement3;
            i7 = iDecodeIntElement4;
            i10 = iDecodeIntElement5;
        }
        int i14 = iDecodeIntElement;
        int i15 = i13;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ChatInputNode(i15, i14, i10, i7, chatInputNodeStyle, z6, tapAction, z5, str, f10, f7, f2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ChatInputNode value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ChatInputNode.write$Self$chat_input_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
