package com.discord.chat.bridge.summaries;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
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
import or.e1;
import or.f0;
import or.g1;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/summaries/Summary.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/summaries/Summary;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/summaries/Summary;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/summaries/Summary;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class Summary$$serializer implements f0 {

    @NotNull
    public static final Summary$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Summary$$serializer summary$$serializer = new Summary$$serializer();
        INSTANCE = summary$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.summaries.Summary", summary$$serializer, 8);
        g1Var.b(StackTraceHelper.ID_KEY, false);
        g1Var.b("topic", false);
        g1Var.b("summShort", false);
        g1Var.b("people", false);
        g1Var.b("startId", false);
        g1Var.b("endId", false);
        g1Var.b("count", false);
        g1Var.b("channelId", false);
        descriptor = g1Var;
    }

    private Summary$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = Summary.$childSerializers;
        s1 s1Var = s1.f17602a;
        MessageId$$serializer messageId$$serializer = MessageId$$serializer.INSTANCE;
        return new KSerializer[]{s1Var, s1Var, s1Var, lazyArr[3].getValue(), messageId$$serializer, messageId$$serializer, m0.f17573a, ChannelId$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final Summary deserialize(@NotNull Decoder decoder) {
        List list;
        int i7;
        String str;
        ChannelId channelId;
        int i10;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = Summary.$childSerializers;
        int i11 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            MessageId$$serializer messageId$$serializer = MessageId$$serializer.INSTANCE;
            MessageId messageId = (MessageId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, messageId$$serializer, null);
            String strM1165unboximpl = messageId != null ? messageId.m1165unboximpl() : null;
            MessageId messageId2 = (MessageId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, messageId$$serializer, null);
            String strM1165unboximpl2 = messageId2 != null ? messageId2.m1165unboximpl() : null;
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            list = list2;
            str = strDecodeStringElement;
            channelId = (ChannelId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, ChannelId$$serializer.INSTANCE, null);
            i10 = iDecodeIntElement;
            str2 = strM1165unboximpl2;
            str3 = strM1165unboximpl;
            str4 = strDecodeStringElement3;
            i7 = 255;
            str5 = strDecodeStringElement2;
        } else {
            boolean z5 = true;
            int iDecodeIntElement2 = 0;
            List list3 = null;
            String strDecodeStringElement4 = null;
            ChannelId channelId2 = null;
            String strM1165unboximpl3 = null;
            String strM1165unboximpl4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            int i12 = 0;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        i11 = 7;
                        break;
                    case 0:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i12 |= 1;
                        i11 = 7;
                        break;
                    case 1:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i12 |= 2;
                        i11 = 7;
                        break;
                    case 2:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i12 |= 4;
                        i11 = 7;
                        break;
                    case 3:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), list3);
                        i12 |= 8;
                        i11 = 7;
                        break;
                    case 4:
                        MessageId messageId3 = (MessageId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, MessageId$$serializer.INSTANCE, strM1165unboximpl4 != null ? MessageId.m1156boximpl(strM1165unboximpl4) : null);
                        strM1165unboximpl4 = messageId3 != null ? messageId3.m1165unboximpl() : null;
                        i12 |= 16;
                        i11 = 7;
                        break;
                    case 5:
                        MessageId messageId4 = (MessageId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, MessageId$$serializer.INSTANCE, strM1165unboximpl3 != null ? MessageId.m1156boximpl(strM1165unboximpl3) : null);
                        strM1165unboximpl3 = messageId4 != null ? messageId4.m1165unboximpl() : null;
                        i12 |= 32;
                        i11 = 7;
                        break;
                    case 6:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i12 |= 64;
                        break;
                    case 7:
                        channelId2 = (ChannelId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i11, ChannelId$$serializer.INSTANCE, channelId2);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            list = list3;
            i7 = i12;
            str = strDecodeStringElement4;
            channelId = channelId2;
            i10 = iDecodeIntElement2;
            str2 = strM1165unboximpl3;
            str3 = strM1165unboximpl4;
            str4 = strDecodeStringElement5;
            str5 = strDecodeStringElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Summary(i7, str, str5, str4, list, str3, str2, i10, channelId, null, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Summary value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Summary.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
