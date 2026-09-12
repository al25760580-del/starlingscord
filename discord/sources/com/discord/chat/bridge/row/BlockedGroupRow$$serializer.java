package com.discord.chat.bridge.row;

import com.discord.chat.bridge.ChangeType;
import com.facebook.imagepipeline.nativecode.b;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/row/BlockedGroupRow.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/row/BlockedGroupRow;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/row/BlockedGroupRow;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/row/BlockedGroupRow;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class BlockedGroupRow$$serializer implements f0 {

    @NotNull
    public static final BlockedGroupRow$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        BlockedGroupRow$$serializer blockedGroupRow$$serializer = new BlockedGroupRow$$serializer();
        INSTANCE = blockedGroupRow$$serializer;
        g1 g1Var = new g1("2", blockedGroupRow$$serializer, 10);
        g1Var.b("index", false);
        g1Var.b("changeType", false);
        g1Var.b(ViewProps.COLOR, false);
        g1Var.b(ViewProps.BORDER_COLOR, false);
        g1Var.b(ViewProps.BACKGROUND_COLOR, false);
        g1Var.b("text", false);
        g1Var.b("revealed", false);
        g1Var.b("button", false);
        g1Var.b("content", true);
        g1Var.b("canUncollapse", true);
        descriptor = g1Var;
    }

    private BlockedGroupRow$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = BlockedGroupRow.$childSerializers;
        g gVar = g.f17537a;
        KSerializer kSerializerP = b.p((KSerializer) lazyArr[8].getValue());
        KSerializer kSerializerP2 = b.p(gVar);
        m0 m0Var = m0.f17573a;
        return new KSerializer[]{m0Var, ChangeType.Serializer.INSTANCE, m0Var, m0Var, m0Var, s1.f17602a, gVar, BlockedGroupButton$$serializer.INSTANCE, kSerializerP, kSerializerP2};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final BlockedGroupRow deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        ChangeType changeType;
        Boolean bool;
        List list;
        BlockedGroupButton blockedGroupButton;
        int i7;
        boolean z5;
        int i10;
        int i11;
        int i12;
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = BlockedGroupRow.$childSerializers;
        int i13 = 9;
        int i14 = 7;
        int i15 = 6;
        int i16 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            ChangeType changeType2 = (ChangeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, ChangeType.Serializer.INSTANCE, null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            BlockedGroupButton blockedGroupButton2 = (BlockedGroupButton) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, BlockedGroupButton$$serializer.INSTANCE, null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (DeserializationStrategy) lazyArr[8].getValue(), null);
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, g.f17537a, null);
            blockedGroupButton = blockedGroupButton2;
            z5 = zDecodeBooleanElement;
            str = strDecodeStringElement;
            i10 = iDecodeIntElement3;
            i11 = iDecodeIntElement4;
            i12 = iDecodeIntElement2;
            i7 = 1023;
            changeType = changeType2;
        } else {
            boolean z6 = true;
            iDecodeIntElement = 0;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            int iDecodeIntElement7 = 0;
            Boolean bool2 = null;
            List list2 = null;
            BlockedGroupButton blockedGroupButton3 = null;
            ChangeType changeType3 = null;
            String strDecodeStringElement2 = null;
            boolean zDecodeBooleanElement2 = false;
            while (z6) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z6 = false;
                        i13 = 9;
                        i14 = 7;
                        break;
                    case 0:
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i16 |= 1;
                        i13 = 9;
                        i14 = 7;
                        i15 = 6;
                        break;
                    case 1:
                        i16 |= 2;
                        changeType3 = (ChangeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, ChangeType.Serializer.INSTANCE, changeType3);
                        i13 = 9;
                        i14 = 7;
                        i15 = 6;
                        break;
                    case 2:
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i16 |= 4;
                        i13 = 9;
                        break;
                    case 3:
                        i16 |= 8;
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        break;
                    case 4:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i16 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i16 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i15);
                        i16 |= 64;
                        break;
                    case 7:
                        blockedGroupButton3 = (BlockedGroupButton) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i14, BlockedGroupButton$$serializer.INSTANCE, blockedGroupButton3);
                        i16 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    case 8:
                        list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (DeserializationStrategy) lazyArr[8].getValue(), list2);
                        i16 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    case 9:
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i13, g.f17537a, bool2);
                        i16 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            changeType = changeType3;
            bool = bool2;
            list = list2;
            blockedGroupButton = blockedGroupButton3;
            i7 = i16;
            z5 = zDecodeBooleanElement2;
            i10 = iDecodeIntElement5;
            i11 = iDecodeIntElement6;
            i12 = iDecodeIntElement7;
            str = strDecodeStringElement2;
        }
        int i17 = iDecodeIntElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BlockedGroupRow(i7, i17, changeType, i12, i10, i11, str, z5, blockedGroupButton, list, bool, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull BlockedGroupRow value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        BlockedGroupRow.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
