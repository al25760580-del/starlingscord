package com.discord.chat.bridge.row;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.BackgroundHighlight;
import com.discord.chat.bridge.BackgroundHighlight$$serializer;
import com.discord.chat.bridge.ChangeType;
import com.discord.chat.bridge.MessageBase;
import com.discord.chat.bridge.SwipeActionsType;
import com.discord.chat.bridge.reaction.ReactionsTheme;
import com.discord.chat.bridge.reaction.ReactionsTheme$$serializer;
import com.discord.chat.bridge.truncation.Truncation;
import com.discord.chat.bridge.truncation.Truncation$$serializer;
import com.discord.chat.presentation.root.MessageContextType;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/row/MessageRow.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/row/MessageRow;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/row/MessageRow;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/row/MessageRow;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class MessageRow$$serializer implements f0 {

    @NotNull
    public static final MessageRow$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        MessageRow$$serializer messageRow$$serializer = new MessageRow$$serializer();
        INSTANCE = messageRow$$serializer;
        g1 g1Var = new g1("1", messageRow$$serializer, 14);
        g1Var.b("index", false);
        g1Var.b("changeType", false);
        g1Var.b("jumped", true);
        g1Var.b("message", false);
        g1Var.b("canAddNewReactions", true);
        g1Var.b("addNewReactionAccessibilityLabel", true);
        g1Var.b("reactionsTheme", true);
        g1Var.b("renderContentOnly", true);
        g1Var.b("reactTag", true);
        g1Var.b("truncation", true);
        g1Var.b("backgroundHighlight", true);
        g1Var.b("swipeActions", true);
        g1Var.b("contextType", true);
        g1Var.b("forcedTheme", true);
        descriptor = g1Var;
    }

    private MessageRow$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = MessageRow.$childSerializers;
        m0 m0Var = m0.f17573a;
        g gVar = g.f17537a;
        KSerializer kSerializerP = b.p(gVar);
        KSerializer kSerializerP2 = b.p(gVar);
        s1 s1Var = s1.f17602a;
        return new KSerializer[]{m0Var, ChangeType.Serializer.INSTANCE, kSerializerP, MessageSerializer.INSTANCE, kSerializerP2, b.p(s1Var), b.p(ReactionsTheme$$serializer.INSTANCE), gVar, b.p(m0Var), b.p(Truncation$$serializer.INSTANCE), b.p(BackgroundHighlight$$serializer.INSTANCE), SwipeActionsType.Serializer.INSTANCE, b.p((KSerializer) lazyArr[12].getValue()), b.p(s1Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final MessageRow deserialize(@NotNull Decoder decoder) {
        MessageBase messageBase;
        String str;
        ChangeType changeType;
        int i7;
        MessageContextType messageContextType;
        SwipeActionsType swipeActionsType;
        BackgroundHighlight backgroundHighlight;
        Integer num;
        String str2;
        Truncation truncation;
        ReactionsTheme reactionsTheme;
        Boolean bool;
        Boolean bool2;
        boolean z5;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MessageRow.$childSerializers;
        ChangeType changeType2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            ChangeType changeType3 = (ChangeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, ChangeType.Serializer.INSTANCE, null);
            g gVar = g.f17537a;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, gVar, null);
            messageBase = (MessageBase) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, MessageSerializer.INSTANCE, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, gVar, null);
            s1 s1Var = s1.f17602a;
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, s1Var, null);
            ReactionsTheme reactionsTheme2 = (ReactionsTheme) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, ReactionsTheme$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, m0.f17573a, null);
            Truncation truncation2 = (Truncation) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, Truncation$$serializer.INSTANCE, null);
            BackgroundHighlight backgroundHighlight2 = (BackgroundHighlight) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, BackgroundHighlight$$serializer.INSTANCE, null);
            SwipeActionsType swipeActionsType2 = (SwipeActionsType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, SwipeActionsType.Serializer.INSTANCE, null);
            messageContextType = (MessageContextType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), null);
            i10 = iDecodeIntElement;
            changeType = changeType3;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, s1Var, null);
            truncation = truncation2;
            z5 = zDecodeBooleanElement;
            reactionsTheme = reactionsTheme2;
            str = str3;
            bool = bool4;
            num = num2;
            i7 = 16383;
            bool2 = bool3;
            swipeActionsType = swipeActionsType2;
            backgroundHighlight = backgroundHighlight2;
        } else {
            boolean z6 = true;
            Boolean bool5 = null;
            String str4 = null;
            messageBase = null;
            MessageContextType messageContextType2 = null;
            SwipeActionsType swipeActionsType3 = null;
            BackgroundHighlight backgroundHighlight3 = null;
            Integer num3 = null;
            String str5 = null;
            Truncation truncation3 = null;
            ReactionsTheme reactionsTheme3 = null;
            int iDecodeIntElement2 = 0;
            int i11 = 0;
            boolean zDecodeBooleanElement2 = false;
            Boolean bool6 = null;
            while (z6) {
                int i12 = iDecodeIntElement2;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z6 = false;
                        bool5 = bool5;
                        iDecodeIntElement2 = i12;
                        break;
                    case 0:
                        i11 |= 1;
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        bool5 = bool5;
                        break;
                    case 1:
                        changeType2 = (ChangeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, ChangeType.Serializer.INSTANCE, changeType2);
                        i11 |= 2;
                        bool5 = bool5;
                        iDecodeIntElement2 = i12;
                        break;
                    case 2:
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, g.f17537a, bool5);
                        i11 |= 4;
                        iDecodeIntElement2 = i12;
                        changeType2 = changeType2;
                        break;
                    case 3:
                        messageBase = (MessageBase) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, MessageSerializer.INSTANCE, messageBase);
                        i11 |= 8;
                        iDecodeIntElement2 = i12;
                        changeType2 = changeType2;
                        break;
                    case 4:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, g.f17537a, bool6);
                        i11 |= 16;
                        iDecodeIntElement2 = i12;
                        changeType2 = changeType2;
                        break;
                    case 5:
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, s1.f17602a, str4);
                        i11 |= 32;
                        iDecodeIntElement2 = i12;
                        changeType2 = changeType2;
                        break;
                    case 6:
                        reactionsTheme3 = (ReactionsTheme) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, ReactionsTheme$$serializer.INSTANCE, reactionsTheme3);
                        i11 |= 64;
                        iDecodeIntElement2 = i12;
                        changeType2 = changeType2;
                        break;
                    case 7:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        iDecodeIntElement2 = i12;
                        changeType2 = changeType2;
                        break;
                    case 8:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, m0.f17573a, num3);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        iDecodeIntElement2 = i12;
                        changeType2 = changeType2;
                        break;
                    case 9:
                        truncation3 = (Truncation) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, Truncation$$serializer.INSTANCE, truncation3);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        iDecodeIntElement2 = i12;
                        changeType2 = changeType2;
                        break;
                    case 10:
                        backgroundHighlight3 = (BackgroundHighlight) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, BackgroundHighlight$$serializer.INSTANCE, backgroundHighlight3);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        iDecodeIntElement2 = i12;
                        changeType2 = changeType2;
                        break;
                    case 11:
                        swipeActionsType3 = (SwipeActionsType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, SwipeActionsType.Serializer.INSTANCE, swipeActionsType3);
                        i11 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        iDecodeIntElement2 = i12;
                        changeType2 = changeType2;
                        break;
                    case 12:
                        messageContextType2 = (MessageContextType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), messageContextType2);
                        i11 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        iDecodeIntElement2 = i12;
                        changeType2 = changeType2;
                        break;
                    case 13:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, s1.f17602a, str5);
                        i11 |= 8192;
                        iDecodeIntElement2 = i12;
                        changeType2 = changeType2;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            str = str4;
            changeType = changeType2;
            i7 = i11;
            messageContextType = messageContextType2;
            swipeActionsType = swipeActionsType3;
            backgroundHighlight = backgroundHighlight3;
            num = num3;
            str2 = str5;
            truncation = truncation3;
            reactionsTheme = reactionsTheme3;
            bool = bool6;
            bool2 = bool5;
            z5 = zDecodeBooleanElement2;
            i10 = iDecodeIntElement2;
        }
        MessageBase messageBase2 = messageBase;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MessageRow(i7, i10, changeType, bool2, messageBase2, bool, str, reactionsTheme, z5, num, truncation, backgroundHighlight, swipeActionsType, messageContextType, str2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull MessageRow value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MessageRow.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
