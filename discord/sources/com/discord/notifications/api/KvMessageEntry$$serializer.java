package com.discord.notifications.api;

import com.discord.primitives.ChannelId;
import com.discord.primitives.ChannelId$$serializer;
import com.discord.primitives.MessageId;
import com.discord.primitives.MessageId$$serializer;
import com.facebook.react.devsupport.StackTraceHelper;
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
import kotlinx.serialization.json.JsonObject;
import kr.j;
import or.e1;
import or.f0;
import or.g1;
import org.jetbrains.annotations.NotNull;
import pr.q;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/notifications/api/KvMessageEntry.$serializer", "Lor/f0;", "Lcom/discord/notifications/api/KvMessageEntry;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/notifications/api/KvMessageEntry;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/notifications/api/KvMessageEntry;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "notification_api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class KvMessageEntry$$serializer implements f0 {

    @NotNull
    public static final KvMessageEntry$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        KvMessageEntry$$serializer kvMessageEntry$$serializer = new KvMessageEntry$$serializer();
        INSTANCE = kvMessageEntry$$serializer;
        g1 g1Var = new g1("com.discord.notifications.api.KvMessageEntry", kvMessageEntry$$serializer, 5);
        g1Var.b("members", true);
        g1Var.b("users", true);
        g1Var.b("message", false);
        g1Var.b(StackTraceHelper.ID_KEY, false);
        g1Var.b("channelId", false);
        descriptor = g1Var;
    }

    private KvMessageEntry$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = KvMessageEntry.$childSerializers;
        return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), q.f18539a, MessageId$$serializer.INSTANCE, ChannelId$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final KvMessageEntry deserialize(@NotNull Decoder decoder) {
        List list;
        List list2;
        String strM1165unboximpl;
        ChannelId channelId;
        JsonObject jsonObject;
        int i7;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = KvMessageEntry.$childSerializers;
        int i10 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            JsonObject jsonObject2 = (JsonObject) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, q.f18539a, null);
            MessageId messageId = (MessageId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, MessageId$$serializer.INSTANCE, null);
            list = list4;
            list2 = list3;
            strM1165unboximpl = messageId != null ? messageId.m1165unboximpl() : null;
            channelId = (ChannelId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, ChannelId$$serializer.INSTANCE, null);
            jsonObject = jsonObject2;
            i7 = 31;
        } else {
            int i11 = 1;
            int i12 = 0;
            List list5 = null;
            List list6 = null;
            String strM1165unboximpl2 = null;
            ChannelId channelId2 = null;
            JsonObject jsonObject3 = null;
            while (i11 != 0) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                int i13 = i10;
                if (iDecodeElementIndex == -1) {
                    i10 = i13;
                    i11 = i10;
                } else if (iDecodeElementIndex != 0) {
                    if (iDecodeElementIndex == 1) {
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), list5);
                        i12 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        jsonObject3 = (JsonObject) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, q.f18539a, jsonObject3);
                        i12 |= 4;
                    } else if (iDecodeElementIndex == 3) {
                        MessageId messageId2 = (MessageId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, MessageId$$serializer.INSTANCE, strM1165unboximpl2 != null ? MessageId.m1156boximpl(strM1165unboximpl2) : null);
                        strM1165unboximpl2 = messageId2 != null ? messageId2.m1165unboximpl() : null;
                        i12 |= 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new j(iDecodeElementIndex);
                        }
                        channelId2 = (ChannelId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, ChannelId$$serializer.INSTANCE, channelId2);
                        i12 |= 16;
                    }
                    i10 = i13;
                } else {
                    list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i13, (DeserializationStrategy) lazyArr[i13].getValue(), list6);
                    i12 |= 1;
                    i10 = i13;
                }
            }
            list = list5;
            list2 = list6;
            strM1165unboximpl = strM1165unboximpl2;
            channelId = channelId2;
            jsonObject = jsonObject3;
            i7 = i12;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new KvMessageEntry(i7, list2, list, jsonObject, strM1165unboximpl, channelId, null, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull KvMessageEntry value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        KvMessageEntry.write$Self$notification_api_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
