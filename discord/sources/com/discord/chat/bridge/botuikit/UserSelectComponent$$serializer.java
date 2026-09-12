package com.discord.chat.bridge.botuikit;

import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/botuikit/UserSelectComponent.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/botuikit/UserSelectComponent;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/botuikit/UserSelectComponent;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/botuikit/UserSelectComponent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class UserSelectComponent$$serializer implements f0 {

    @NotNull
    public static final UserSelectComponent$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        UserSelectComponent$$serializer userSelectComponent$$serializer = new UserSelectComponent$$serializer();
        INSTANCE = userSelectComponent$$serializer;
        g1 g1Var = new g1("5", userSelectComponent$$serializer, 10);
        g1Var.b("type", false);
        g1Var.b(StackTraceHelper.ID_KEY, false);
        g1Var.b("state", false);
        g1Var.b("customId", false);
        g1Var.b("placeholder", true);
        g1Var.b(ViewProps.ACCESSIBILITY_LABEL, true);
        g1Var.b("minValues", false);
        g1Var.b("maxValues", false);
        g1Var.b("disabled", true);
        g1Var.b("selectedOptions", false);
        descriptor = g1Var;
    }

    private UserSelectComponent$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = UserSelectComponent.$childSerializers;
        m0 m0Var = m0.f17573a;
        s1 s1Var = s1.f17602a;
        return new KSerializer[]{m0Var, s1Var, ActionComponentState.Serializer.INSTANCE, s1Var, b.p(s1Var), b.p(s1Var), m0Var, m0Var, g.f17537a, lazyArr[9].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final UserSelectComponent deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        String str;
        List list;
        String str2;
        ActionComponentState actionComponentState;
        int i7;
        int i10;
        int i11;
        boolean z5;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = UserSelectComponent.$childSerializers;
        int i12 = 7;
        int i13 = 6;
        int i14 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            ActionComponentState actionComponentState2 = (ActionComponentState) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, ActionComponentState.Serializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            s1 s1Var = s1.f17602a;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s1Var, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, s1Var, null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), null);
            i10 = iDecodeIntElement3;
            i11 = iDecodeIntElement2;
            str = str6;
            str4 = strDecodeStringElement2;
            z5 = zDecodeBooleanElement;
            str2 = str5;
            actionComponentState = actionComponentState2;
            i7 = 1023;
            str3 = strDecodeStringElement;
        } else {
            boolean z6 = true;
            iDecodeIntElement = 0;
            int iDecodeIntElement4 = 0;
            boolean zDecodeBooleanElement2 = false;
            String str7 = null;
            List list2 = null;
            String str8 = null;
            ActionComponentState actionComponentState3 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            int iDecodeIntElement5 = 0;
            while (z6) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z6 = false;
                        i12 = 7;
                        break;
                    case 0:
                        i14 |= 1;
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i12 = 7;
                        i13 = 6;
                        break;
                    case 1:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i14 |= 2;
                        i12 = 7;
                        i13 = 6;
                        break;
                    case 2:
                        actionComponentState3 = (ActionComponentState) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, ActionComponentState.Serializer.INSTANCE, actionComponentState3);
                        i14 |= 4;
                        i12 = 7;
                        i13 = 6;
                        break;
                    case 3:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i14 |= 8;
                        i12 = 7;
                        break;
                    case 4:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s1.f17602a, str8);
                        i14 |= 16;
                        i12 = 7;
                        break;
                    case 5:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, s1.f17602a, str7);
                        i14 |= 32;
                        i12 = 7;
                        break;
                    case 6:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i13);
                        i14 |= 64;
                        break;
                    case 7:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i12);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    case 8:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    case 9:
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), list2);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            str = str7;
            list = list2;
            str2 = str8;
            actionComponentState = actionComponentState3;
            i7 = i14;
            i10 = iDecodeIntElement5;
            i11 = iDecodeIntElement4;
            z5 = zDecodeBooleanElement2;
            str3 = strDecodeStringElement3;
            str4 = strDecodeStringElement4;
        }
        int i15 = iDecodeIntElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UserSelectComponent(i7, i15, str3, actionComponentState, str4, str2, str, i11, i10, z5, list, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull UserSelectComponent value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UserSelectComponent.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
