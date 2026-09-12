package com.discord.chat.reactevents;

import androidx.recyclerview.widget.RecyclerView;
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
import kr.j;
import or.e1;
import or.f0;
import or.g;
import or.g1;
import or.m0;
import or.w;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/reactevents/ChatScrollPositionEvent.$serializer", "Lor/f0;", "Lcom/discord/chat/reactevents/ChatScrollPositionEvent;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/reactevents/ChatScrollPositionEvent;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/reactevents/ChatScrollPositionEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class ChatScrollPositionEvent$$serializer implements f0 {

    @NotNull
    public static final ChatScrollPositionEvent$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ChatScrollPositionEvent$$serializer chatScrollPositionEvent$$serializer = new ChatScrollPositionEvent$$serializer();
        INSTANCE = chatScrollPositionEvent$$serializer;
        g1 g1Var = new g1("com.discord.chat.reactevents.ChatScrollPositionEvent", chatScrollPositionEvent$$serializer, 12);
        g1Var.b("isAtBottom", false);
        g1Var.b("isNearBottom", false);
        g1Var.b("isNearTop", false);
        g1Var.b("dragging", false);
        g1Var.b("decelerating", false);
        g1Var.b("shouldShowJumpToPresent", false);
        g1Var.b("isFirstMessageVisible", false);
        g1Var.b("firstVisibleMessageIndex", false);
        g1Var.b("firstVisibleMessagePercentVisible", false);
        g1Var.b("lastVisibleMessageIndex", false);
        g1Var.b("lastVisibleMessagePercentVisible", false);
        g1Var.b("changesetUpdateId", false);
        descriptor = g1Var;
    }

    private ChatScrollPositionEvent$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        w wVar = w.f17621a;
        KSerializer kSerializerP = b.p(wVar);
        KSerializer kSerializerP2 = b.p(wVar);
        g gVar = g.f17537a;
        m0 m0Var = m0.f17573a;
        return new KSerializer[]{gVar, gVar, gVar, gVar, gVar, gVar, gVar, m0Var, kSerializerP, m0Var, kSerializerP2, m0Var};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final ChatScrollPositionEvent deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        Double d6;
        Double d7;
        int iDecodeIntElement;
        int i7;
        int i10;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z10;
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i11 = 11;
        int i12 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            boolean zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            boolean zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            boolean zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            w wVar = w.f17621a;
            Double d8 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, wVar, null);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
            Double d9 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, wVar, null);
            i12 = 4095;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 11);
            d6 = d9;
            i7 = iDecodeIntElement3;
            i10 = iDecodeIntElement2;
            z5 = zDecodeBooleanElement7;
            z6 = zDecodeBooleanElement6;
            z7 = zDecodeBooleanElement4;
            d7 = d8;
            z10 = zDecodeBooleanElement5;
            z11 = zDecodeBooleanElement3;
            z12 = zDecodeBooleanElement2;
        } else {
            boolean z13 = true;
            zDecodeBooleanElement = false;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            boolean zDecodeBooleanElement8 = false;
            boolean zDecodeBooleanElement9 = false;
            boolean zDecodeBooleanElement10 = false;
            boolean zDecodeBooleanElement11 = false;
            boolean zDecodeBooleanElement12 = false;
            boolean zDecodeBooleanElement13 = false;
            Double d10 = null;
            Double d11 = null;
            int iDecodeIntElement6 = 0;
            while (z13) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z13 = false;
                        i11 = 11;
                        break;
                    case 0:
                        i12 |= 1;
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        i11 = 11;
                        break;
                    case 1:
                        zDecodeBooleanElement13 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i12 |= 2;
                        i11 = 11;
                        break;
                    case 2:
                        zDecodeBooleanElement12 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                        i12 |= 4;
                        i11 = 11;
                        break;
                    case 3:
                        zDecodeBooleanElement10 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i12 |= 8;
                        break;
                    case 4:
                        zDecodeBooleanElement11 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i12 |= 16;
                        break;
                    case 5:
                        zDecodeBooleanElement9 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i12 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i12 |= 64;
                        break;
                    case 7:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    case 8:
                        d11 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, w.f17621a, d11);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    case 9:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        break;
                    case 10:
                        d10 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, w.f17621a, d10);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        break;
                    case 11:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i11);
                        i12 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            d6 = d10;
            d7 = d11;
            iDecodeIntElement = iDecodeIntElement6;
            i7 = iDecodeIntElement4;
            i10 = iDecodeIntElement5;
            z5 = zDecodeBooleanElement8;
            z6 = zDecodeBooleanElement9;
            z7 = zDecodeBooleanElement10;
            z10 = zDecodeBooleanElement11;
            z11 = zDecodeBooleanElement12;
            z12 = zDecodeBooleanElement13;
        }
        boolean z14 = zDecodeBooleanElement;
        int i13 = i12;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ChatScrollPositionEvent(i13, z14, z12, z11, z7, z10, z6, z5, i10, d7, i7, d6, iDecodeIntElement, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ChatScrollPositionEvent value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ChatScrollPositionEvent.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
