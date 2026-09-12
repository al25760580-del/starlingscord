package com.discord.chat.bridge.polls;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.imagepipeline.nativecode.b;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.j;
import or.e1;
import or.f0;
import or.g;
import or.g1;
import or.s1;
import org.jetbrains.annotations.NotNull;
import org.webrtc.PeerConnection;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/polls/PollData.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/polls/PollData;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/polls/PollData;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/polls/PollData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class PollData$$serializer implements f0 {

    @NotNull
    public static final PollData$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        PollData$$serializer pollData$$serializer = new PollData$$serializer();
        INSTANCE = pollData$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.polls.PollData", pollData$$serializer, 17);
        g1Var.b("resources", false);
        g1Var.b("question", false);
        g1Var.b("answers", false);
        g1Var.b("answersInteraction", false);
        g1Var.b("answerTapAccessibilityLabel", true);
        g1Var.b("layoutType", false);
        g1Var.b("canSelectMultipleAnswers", true);
        g1Var.b("canTapAnswers", false);
        g1Var.b("canShowVoteCounts", false);
        g1Var.b("hasVoted", false);
        g1Var.b("isExpired", false);
        g1Var.b("containerStyle", true);
        g1Var.b("myAvatarUrl", true);
        g1Var.b("secondaryAction", true);
        g1Var.b("primaryAction", true);
        g1Var.b("tertiaryAction", true);
        g1Var.b("promptLabel", true);
        descriptor = g1Var;
    }

    private PollData$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = PollData.$childSerializers;
        s1 s1Var = s1.f17602a;
        g gVar = g.f17537a;
        PollAction$$serializer pollAction$$serializer = PollAction$$serializer.INSTANCE;
        return new KSerializer[]{PollResources$$serializer.INSTANCE, PollMedia$$serializer.INSTANCE, lazyArr[2].getValue(), PollChatAnswerInteractionType.Serializer.INSTANCE, b.p(s1Var), PollLayoutType.Serializer.INSTANCE, gVar, gVar, gVar, gVar, gVar, s1Var, b.p(s1Var), b.p(pollAction$$serializer), b.p(pollAction$$serializer), b.p(pollAction$$serializer), b.p(s1Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final PollData deserialize(@NotNull Decoder decoder) {
        PollChatAnswerInteractionType pollChatAnswerInteractionType;
        int i7;
        PollLayoutType pollLayoutType;
        List list;
        PollMedia pollMedia;
        PollResources pollResources;
        String str;
        PollAction pollAction;
        PollAction pollAction2;
        String str2;
        String str3;
        PollAction pollAction3;
        String str4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z10;
        boolean z11;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PollData.$childSerializers;
        PollResources pollResources2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            PollResources pollResources3 = (PollResources) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, PollResources$$serializer.INSTANCE, null);
            PollMedia pollMedia2 = (PollMedia) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, PollMedia$$serializer.INSTANCE, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            pollChatAnswerInteractionType = (PollChatAnswerInteractionType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, PollChatAnswerInteractionType.Serializer.INSTANCE, null);
            s1 s1Var = s1.f17602a;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s1Var, null);
            PollLayoutType pollLayoutType2 = (PollLayoutType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, PollLayoutType.Serializer.INSTANCE, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            boolean zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, s1Var, null);
            PollAction$$serializer pollAction$$serializer = PollAction$$serializer.INSTANCE;
            PollAction pollAction4 = (PollAction) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, pollAction$$serializer, null);
            PollAction pollAction5 = (PollAction) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, pollAction$$serializer, null);
            pollAction3 = (PollAction) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, pollAction$$serializer, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, s1Var, null);
            str3 = str5;
            pollMedia = pollMedia2;
            i7 = 131071;
            z5 = zDecodeBooleanElement5;
            z6 = zDecodeBooleanElement4;
            z7 = zDecodeBooleanElement2;
            z10 = zDecodeBooleanElement;
            pollLayoutType = pollLayoutType2;
            z11 = zDecodeBooleanElement3;
            str4 = strDecodeStringElement;
            pollAction = pollAction5;
            pollAction2 = pollAction4;
            str2 = str6;
            list = list2;
            pollResources = pollResources3;
        } else {
            int i11 = 2;
            boolean z12 = true;
            int i12 = 0;
            boolean zDecodeBooleanElement6 = false;
            boolean zDecodeBooleanElement7 = false;
            boolean zDecodeBooleanElement8 = false;
            boolean zDecodeBooleanElement9 = false;
            boolean zDecodeBooleanElement10 = false;
            PollLayoutType pollLayoutType3 = null;
            pollChatAnswerInteractionType = null;
            List list3 = null;
            PollMedia pollMedia3 = null;
            String str7 = null;
            PollAction pollAction6 = null;
            PollAction pollAction7 = null;
            String str8 = null;
            String str9 = null;
            PollAction pollAction8 = null;
            String strDecodeStringElement2 = null;
            while (z12) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z12 = false;
                        i11 = 2;
                        break;
                    case 0:
                        pollResources2 = (PollResources) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, PollResources$$serializer.INSTANCE, pollResources2);
                        i12 |= 1;
                        lazyArr = lazyArr;
                        i11 = 2;
                        break;
                    case 1:
                        pollMedia3 = (PollMedia) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, PollMedia$$serializer.INSTANCE, pollMedia3);
                        i12 |= 2;
                        lazyArr = lazyArr;
                        i11 = 2;
                        break;
                    case 2:
                        lazyArr = lazyArr;
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i11, (DeserializationStrategy) lazyArr[i11].getValue(), list3);
                        i12 |= 4;
                        lazyArr = lazyArr;
                        break;
                    case 3:
                        lazyArr = lazyArr;
                        pollChatAnswerInteractionType = (PollChatAnswerInteractionType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, PollChatAnswerInteractionType.Serializer.INSTANCE, pollChatAnswerInteractionType);
                        i12 |= 8;
                        lazyArr = lazyArr;
                        break;
                    case 4:
                        lazyArr = lazyArr;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s1.f17602a, str9);
                        i12 |= 16;
                        lazyArr = lazyArr;
                        break;
                    case 5:
                        lazyArr = lazyArr;
                        pollLayoutType3 = (PollLayoutType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, PollLayoutType.Serializer.INSTANCE, pollLayoutType3);
                        i12 |= 32;
                        lazyArr = lazyArr;
                        break;
                    case 6:
                        lazyArr = lazyArr;
                        zDecodeBooleanElement9 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i12 |= 64;
                        lazyArr = lazyArr;
                        break;
                    case 7:
                        lazyArr = lazyArr;
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        lazyArr = lazyArr;
                        break;
                    case 8:
                        lazyArr = lazyArr;
                        zDecodeBooleanElement10 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        lazyArr = lazyArr;
                        break;
                    case 9:
                        lazyArr = lazyArr;
                        zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        lazyArr = lazyArr;
                        break;
                    case 10:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        lazyArr = lazyArr;
                        break;
                    case 11:
                        lazyArr = lazyArr;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i12 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        lazyArr = lazyArr;
                        break;
                    case 12:
                        lazyArr = lazyArr;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, s1.f17602a, str8);
                        i12 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        lazyArr = lazyArr;
                        break;
                    case 13:
                        lazyArr = lazyArr;
                        pollAction7 = (PollAction) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, PollAction$$serializer.INSTANCE, pollAction7);
                        i12 |= 8192;
                        lazyArr = lazyArr;
                        break;
                    case 14:
                        lazyArr = lazyArr;
                        pollAction6 = (PollAction) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, PollAction$$serializer.INSTANCE, pollAction6);
                        i12 |= 16384;
                        lazyArr = lazyArr;
                        break;
                    case 15:
                        pollAction8 = (PollAction) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, PollAction$$serializer.INSTANCE, pollAction8);
                        i10 = PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
                        i12 |= i10;
                        lazyArr = lazyArr;
                        break;
                    case 16:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, s1.f17602a, str7);
                        i10 = 65536;
                        i12 |= i10;
                        lazyArr = lazyArr;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            i7 = i12;
            pollLayoutType = pollLayoutType3;
            list = list3;
            pollMedia = pollMedia3;
            pollResources = pollResources2;
            str = str7;
            pollAction = pollAction6;
            pollAction2 = pollAction7;
            str2 = str8;
            str3 = str9;
            pollAction3 = pollAction8;
            str4 = strDecodeStringElement2;
            z5 = zDecodeBooleanElement6;
            z6 = zDecodeBooleanElement7;
            z7 = zDecodeBooleanElement8;
            z10 = zDecodeBooleanElement9;
            z11 = zDecodeBooleanElement10;
        }
        PollChatAnswerInteractionType pollChatAnswerInteractionType2 = pollChatAnswerInteractionType;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PollData(i7, pollResources, pollMedia, list, pollChatAnswerInteractionType2, str3, pollLayoutType, z10, z7, z11, z6, z5, str4, str2, pollAction2, pollAction, pollAction3, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull PollData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PollData.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
