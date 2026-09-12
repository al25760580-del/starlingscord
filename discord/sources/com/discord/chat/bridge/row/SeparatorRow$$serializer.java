package com.discord.chat.bridge.row;

import com.discord.chat.bridge.ChangeType;
import com.discord.chat.bridge.summaries.Summary;
import com.discord.chat.bridge.summaries.Summary$$serializer;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/row/SeparatorRow.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/row/SeparatorRow;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/row/SeparatorRow;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/row/SeparatorRow;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class SeparatorRow$$serializer implements f0 {

    @NotNull
    public static final SeparatorRow$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SeparatorRow$$serializer separatorRow$$serializer = new SeparatorRow$$serializer();
        INSTANCE = separatorRow$$serializer;
        g1 g1Var = new g1("0", separatorRow$$serializer, 9);
        g1Var.b("changeType", false);
        g1Var.b("index", false);
        g1Var.b("text", false);
        g1Var.b(StackTraceHelper.ID_KEY, false);
        g1Var.b(ViewProps.COLOR, false);
        g1Var.b(ViewProps.BORDER_COLOR, true);
        g1Var.b("scrollTo", true);
        g1Var.b("isBeforeContent", true);
        g1Var.b("summary", true);
        descriptor = g1Var;
    }

    private SeparatorRow$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        m0 m0Var = m0.f17573a;
        KSerializer kSerializerP = b.p(m0Var);
        g gVar = g.f17537a;
        KSerializer kSerializerP2 = b.p(gVar);
        KSerializer kSerializerP3 = b.p(gVar);
        KSerializer kSerializerP4 = b.p(Summary$$serializer.INSTANCE);
        s1 s1Var = s1.f17602a;
        return new KSerializer[]{ChangeType.Serializer.INSTANCE, m0Var, s1Var, s1Var, m0Var, kSerializerP, kSerializerP2, kSerializerP3, kSerializerP4};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SeparatorRow deserialize(@NotNull Decoder decoder) {
        int i7;
        Summary summary;
        Boolean bool;
        Boolean bool2;
        Integer num;
        int i10;
        int i11;
        ChangeType changeType;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i12 = 7;
        int i13 = 6;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            ChangeType changeType2 = (ChangeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, ChangeType.Serializer.INSTANCE, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, m0.f17573a, null);
            g gVar = g.f17537a;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, gVar, null);
            changeType = changeType2;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, gVar, null);
            bool2 = bool3;
            num = num2;
            str2 = strDecodeStringElement2;
            summary = (Summary) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, Summary$$serializer.INSTANCE, null);
            i7 = iDecodeIntElement2;
            str = strDecodeStringElement;
            i10 = iDecodeIntElement;
            i11 = 511;
        } else {
            boolean z5 = true;
            int iDecodeIntElement3 = 0;
            int i14 = 0;
            Summary summary2 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            ChangeType changeType3 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            int iDecodeIntElement4 = 0;
            Integer num3 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        i13 = 6;
                        break;
                    case 0:
                        changeType3 = (ChangeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, ChangeType.Serializer.INSTANCE, changeType3);
                        i14 |= 1;
                        i12 = 7;
                        i13 = 6;
                        break;
                    case 1:
                        i14 |= 2;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i12 = 7;
                        break;
                    case 2:
                        i14 |= 4;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i12 = 7;
                        break;
                    case 3:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i14 |= 8;
                        i12 = 7;
                        break;
                    case 4:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i14 |= 16;
                        break;
                    case 5:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, m0.f17573a, num3);
                        i14 |= 32;
                        break;
                    case 6:
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i13, g.f17537a, bool5);
                        i14 |= 64;
                        break;
                    case 7:
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i12, g.f17537a, bool4);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    case 8:
                        summary2 = (Summary) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, Summary$$serializer.INSTANCE, summary2);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            i7 = iDecodeIntElement3;
            summary = summary2;
            bool = bool4;
            bool2 = bool5;
            num = num3;
            i10 = iDecodeIntElement4;
            i11 = i14;
            changeType = changeType3;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SeparatorRow(i11, changeType, i10, str, str2, i7, num, bool2, bool, summary, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull SeparatorRow value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SeparatorRow.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
