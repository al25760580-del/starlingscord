package com.discord.chat.bridge.botuikit;

import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.devsupport.StackTraceHelper;
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
import or.e1;
import or.f0;
import or.g;
import or.g1;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/botuikit/ButtonComponent.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/botuikit/ButtonComponent;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/botuikit/ButtonComponent;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/botuikit/ButtonComponent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class ButtonComponent$$serializer implements f0 {

    @NotNull
    public static final ButtonComponent$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ButtonComponent$$serializer buttonComponent$$serializer = new ButtonComponent$$serializer();
        INSTANCE = buttonComponent$$serializer;
        g1 g1Var = new g1("2", buttonComponent$$serializer, 10);
        g1Var.b("type", false);
        g1Var.b(StackTraceHelper.ID_KEY, false);
        g1Var.b("state", false);
        g1Var.b("customId", true);
        g1Var.b("label", true);
        g1Var.b("style", false);
        g1Var.b("disabled", true);
        g1Var.b("emoji", true);
        g1Var.b("url", true);
        g1Var.b("skuId", true);
        descriptor = g1Var;
    }

    private ButtonComponent$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        s1 s1Var = s1.f17602a;
        return new KSerializer[]{m0.f17573a, s1Var, ActionComponentState.Serializer.INSTANCE, b.p(s1Var), b.p(s1Var), ButtonStyle.Serializer.INSTANCE, g.f17537a, b.p(ComponentEmoji$$serializer.INSTANCE), b.p(s1Var), b.p(s1Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final ButtonComponent deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        String str;
        String str2;
        ButtonStyle buttonStyle;
        ComponentEmoji componentEmoji;
        String str3;
        String str4;
        ActionComponentState actionComponentState;
        boolean z5;
        int i7;
        String str5;
        char c8;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i10 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            ActionComponentState actionComponentState2 = (ActionComponentState) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, ActionComponentState.Serializer.INSTANCE, null);
            s1 s1Var = s1.f17602a;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, s1Var, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s1Var, null);
            ButtonStyle buttonStyle2 = (ButtonStyle) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, ButtonStyle.Serializer.INSTANCE, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            ComponentEmoji componentEmoji2 = (ComponentEmoji) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, ComponentEmoji$$serializer.INSTANCE, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, s1Var, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, s1Var, null);
            componentEmoji = componentEmoji2;
            z5 = zDecodeBooleanElement;
            buttonStyle = buttonStyle2;
            str4 = str6;
            str2 = str8;
            str3 = str7;
            actionComponentState = actionComponentState2;
            str5 = strDecodeStringElement;
            i7 = 1023;
        } else {
            boolean z6 = true;
            iDecodeIntElement = 0;
            int i11 = 0;
            String str9 = null;
            String str10 = null;
            ButtonStyle buttonStyle3 = null;
            ComponentEmoji componentEmoji3 = null;
            String str11 = null;
            String str12 = null;
            String strDecodeStringElement2 = null;
            boolean zDecodeBooleanElement2 = false;
            ActionComponentState actionComponentState3 = null;
            while (z6) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z6 = false;
                        i10 = 9;
                        break;
                    case 0:
                        i11 |= 1;
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i10 = 9;
                        break;
                    case 1:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i11 |= 2;
                        i10 = 9;
                        break;
                    case 2:
                        actionComponentState3 = (ActionComponentState) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, ActionComponentState.Serializer.INSTANCE, actionComponentState3);
                        i11 |= 4;
                        i10 = 9;
                        break;
                    case 3:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, s1.f17602a, str12);
                        i11 |= 8;
                        i10 = 9;
                        break;
                    case 4:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s1.f17602a, str11);
                        i11 |= 16;
                        i10 = 9;
                        break;
                    case 5:
                        buttonStyle3 = (ButtonStyle) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, ButtonStyle.Serializer.INSTANCE, buttonStyle3);
                        i11 |= 32;
                        i10 = 9;
                        break;
                    case 6:
                        c8 = 7;
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i11 |= 64;
                        i10 = 9;
                        break;
                    case 7:
                        c8 = 7;
                        componentEmoji3 = (ComponentEmoji) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, ComponentEmoji$$serializer.INSTANCE, componentEmoji3);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        i10 = 9;
                        break;
                    case 8:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, s1.f17602a, str10);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    case 9:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i10, s1.f17602a, str9);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            str = str9;
            str2 = str10;
            buttonStyle = buttonStyle3;
            componentEmoji = componentEmoji3;
            str3 = str11;
            str4 = str12;
            actionComponentState = actionComponentState3;
            z5 = zDecodeBooleanElement2;
            i7 = i11;
            str5 = strDecodeStringElement2;
        }
        int i12 = iDecodeIntElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ButtonComponent(i7, i12, str5, actionComponentState, str4, str3, buttonStyle, z5, componentEmoji, str2, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ButtonComponent value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ButtonComponent.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
