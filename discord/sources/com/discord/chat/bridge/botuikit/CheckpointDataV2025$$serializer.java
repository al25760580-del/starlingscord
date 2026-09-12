package com.discord.chat.bridge.botuikit;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.primitives.UserId;
import com.discord.primitives.UserId$$serializer;
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
import or.g1;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/botuikit/CheckpointDataV2025.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/botuikit/CheckpointDataV2025;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/botuikit/CheckpointDataV2025;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/botuikit/CheckpointDataV2025;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class CheckpointDataV2025$$serializer implements f0 {

    @NotNull
    public static final CheckpointDataV2025$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        CheckpointDataV2025$$serializer checkpointDataV2025$$serializer = new CheckpointDataV2025$$serializer();
        INSTANCE = checkpointDataV2025$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.botuikit.CheckpointDataV2025", checkpointDataV2025$$serializer, 13);
        g1Var.b("version", true);
        g1Var.b("authorId", false);
        g1Var.b("cardId", false);
        g1Var.b("cardAssetUrl", false);
        g1Var.b("powerLevel", false);
        g1Var.b("powerLevelUnits", false);
        g1Var.b("messagesString", false);
        g1Var.b("voiceString", false);
        g1Var.b("reactionString", false);
        g1Var.b("clickable", true);
        g1Var.b("topEmoji", true);
        g1Var.b("topGuild", true);
        g1Var.b("topGame", true);
        descriptor = g1Var;
    }

    private CheckpointDataV2025$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerP = b.p(CheckpointCardClickable$$serializer.INSTANCE);
        KSerializer kSerializerP2 = b.p(CheckpointEmoji$$serializer.INSTANCE);
        KSerializer kSerializerP3 = b.p(CheckpointGuild$$serializer.INSTANCE);
        KSerializer kSerializerP4 = b.p(CheckpointApplication$$serializer.INSTANCE);
        m0 m0Var = m0.f17573a;
        s1 s1Var = s1.f17602a;
        return new KSerializer[]{m0Var, UserId$$serializer.INSTANCE, s1Var, s1Var, s1Var, m0Var, s1Var, s1Var, s1Var, kSerializerP, kSerializerP2, kSerializerP3, kSerializerP4};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final CheckpointDataV2025 deserialize(@NotNull Decoder decoder) {
        int i7;
        int i10;
        CheckpointGuild checkpointGuild;
        CheckpointApplication checkpointApplication;
        CheckpointEmoji checkpointEmoji;
        CheckpointCardClickable checkpointCardClickable;
        UserId userId;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i11;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i12 = 11;
        int i13 = 10;
        int i14 = 6;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            UserId userId2 = (UserId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, UserId$$serializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            CheckpointCardClickable checkpointCardClickable2 = (CheckpointCardClickable) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, CheckpointCardClickable$$serializer.INSTANCE, null);
            CheckpointEmoji checkpointEmoji2 = (CheckpointEmoji) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, CheckpointEmoji$$serializer.INSTANCE, null);
            CheckpointGuild checkpointGuild2 = (CheckpointGuild) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, CheckpointGuild$$serializer.INSTANCE, null);
            i7 = 8191;
            checkpointApplication = (CheckpointApplication) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, CheckpointApplication$$serializer.INSTANCE, null);
            checkpointGuild = checkpointGuild2;
            checkpointEmoji = checkpointEmoji2;
            checkpointCardClickable = checkpointCardClickable2;
            str5 = strDecodeStringElement5;
            str4 = strDecodeStringElement4;
            i11 = iDecodeIntElement2;
            str2 = strDecodeStringElement2;
            str6 = strDecodeStringElement6;
            str3 = strDecodeStringElement3;
            str = strDecodeStringElement;
            userId = userId2;
            i10 = iDecodeIntElement;
        } else {
            CheckpointGuild checkpointGuild3 = null;
            CheckpointApplication checkpointApplication2 = null;
            CheckpointEmoji checkpointEmoji3 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            boolean z5 = true;
            int iDecodeIntElement3 = 0;
            int iDecodeIntElement4 = 0;
            CheckpointCardClickable checkpointCardClickable3 = null;
            UserId userId3 = null;
            i7 = 0;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        i14 = i14;
                        i12 = 11;
                        break;
                    case 0:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i7 |= 1;
                        i14 = i14;
                        i12 = 11;
                        i13 = 10;
                        break;
                    case 1:
                        userId3 = (UserId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, UserId$$serializer.INSTANCE, userId3);
                        i7 |= 2;
                        i14 = i14;
                        i12 = 11;
                        i13 = 10;
                        break;
                    case 2:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i7 |= 4;
                        i14 = i14;
                        i12 = 11;
                        break;
                    case 3:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i7 |= 8;
                        i14 = i14;
                        i12 = 11;
                        break;
                    case 4:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i7 |= 16;
                        i14 = i14;
                        i12 = 11;
                        break;
                    case 5:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i7 |= 32;
                        i14 = i14;
                        i12 = 11;
                        break;
                    case 6:
                        int i15 = i14;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i15);
                        i7 |= 64;
                        i14 = i15;
                        break;
                    case 7:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i7 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        i14 = 6;
                        break;
                    case 8:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i7 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        i14 = 6;
                        break;
                    case 9:
                        checkpointCardClickable3 = (CheckpointCardClickable) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, CheckpointCardClickable$$serializer.INSTANCE, checkpointCardClickable3);
                        i7 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        i14 = 6;
                        break;
                    case 10:
                        checkpointEmoji3 = (CheckpointEmoji) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i13, CheckpointEmoji$$serializer.INSTANCE, checkpointEmoji3);
                        i7 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        i14 = 6;
                        break;
                    case 11:
                        checkpointGuild3 = (CheckpointGuild) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i12, CheckpointGuild$$serializer.INSTANCE, checkpointGuild3);
                        i7 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        i14 = 6;
                        break;
                    case 12:
                        checkpointApplication2 = (CheckpointApplication) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, CheckpointApplication$$serializer.INSTANCE, checkpointApplication2);
                        i7 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        i14 = 6;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            i10 = iDecodeIntElement3;
            checkpointGuild = checkpointGuild3;
            checkpointApplication = checkpointApplication2;
            checkpointEmoji = checkpointEmoji3;
            checkpointCardClickable = checkpointCardClickable3;
            userId = userId3;
            str = strDecodeStringElement7;
            str2 = strDecodeStringElement8;
            str3 = strDecodeStringElement9;
            str4 = strDecodeStringElement10;
            str5 = strDecodeStringElement11;
            str6 = strDecodeStringElement12;
            i11 = iDecodeIntElement4;
        }
        int i16 = i7;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CheckpointDataV2025(i16, i10, userId, str, str2, str3, i11, str4, str5, str6, checkpointCardClickable, checkpointEmoji, checkpointGuild, checkpointApplication, null, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull CheckpointDataV2025 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CheckpointDataV2025.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
