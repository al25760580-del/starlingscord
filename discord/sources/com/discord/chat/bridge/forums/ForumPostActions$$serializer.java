package com.discord.chat.bridge.forums;

import com.discord.chat.bridge.reaction.MessageReaction;
import com.discord.chat.bridge.reaction.MessageReaction$$serializer;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/forums/ForumPostActions.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/forums/ForumPostActions;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/forums/ForumPostActions;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/forums/ForumPostActions;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class ForumPostActions$$serializer implements f0 {

    @NotNull
    public static final ForumPostActions$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ForumPostActions$$serializer forumPostActions$$serializer = new ForumPostActions$$serializer();
        INSTANCE = forumPostActions$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.forums.ForumPostActions", forumPostActions$$serializer, 8);
        g1Var.b("numDisplayedReactions", false);
        g1Var.b("isFollowing", false);
        g1Var.b("followIcon", true);
        g1Var.b("followLabel", false);
        g1Var.b("shareIcon", true);
        g1Var.b("shareLabel", false);
        g1Var.b("defaultReaction", true);
        g1Var.b("sharePrompt", true);
        descriptor = g1Var;
    }

    private ForumPostActions$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        s1 s1Var = s1.f17602a;
        return new KSerializer[]{m0.f17573a, g.f17537a, b.p(s1Var), s1Var, b.p(s1Var), s1Var, b.p(MessageReaction$$serializer.INSTANCE), b.p(PostSharePrompt$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final ForumPostActions deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        PostSharePrompt postSharePrompt;
        MessageReaction messageReaction;
        boolean z5;
        int i7;
        String str;
        String str2;
        String str3;
        String str4;
        char c8;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i10 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            s1 s1Var = s1.f17602a;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, s1Var, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s1Var, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            MessageReaction messageReaction2 = (MessageReaction) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, MessageReaction$$serializer.INSTANCE, null);
            postSharePrompt = (PostSharePrompt) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, PostSharePrompt$$serializer.INSTANCE, null);
            messageReaction = messageReaction2;
            str4 = strDecodeStringElement2;
            str2 = strDecodeStringElement;
            str3 = str6;
            str = str5;
            z5 = zDecodeBooleanElement;
            i7 = 255;
        } else {
            boolean z6 = true;
            iDecodeIntElement = 0;
            int i11 = 0;
            PostSharePrompt postSharePrompt2 = null;
            String str7 = null;
            String strDecodeStringElement3 = null;
            String str8 = null;
            String strDecodeStringElement4 = null;
            boolean zDecodeBooleanElement2 = false;
            MessageReaction messageReaction3 = null;
            while (z6) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z6 = false;
                        break;
                    case 0:
                        i11 |= 1;
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i10 = 7;
                        break;
                    case 1:
                        c8 = 2;
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i11 |= 2;
                        i10 = 7;
                        break;
                    case 2:
                        c8 = 2;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, s1.f17602a, str7);
                        i11 |= 4;
                        i10 = 7;
                        break;
                    case 3:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i11 |= 8;
                        break;
                    case 4:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s1.f17602a, str8);
                        i11 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i11 |= 32;
                        break;
                    case 6:
                        messageReaction3 = (MessageReaction) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, MessageReaction$$serializer.INSTANCE, messageReaction3);
                        i11 |= 64;
                        break;
                    case 7:
                        postSharePrompt2 = (PostSharePrompt) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i10, PostSharePrompt$$serializer.INSTANCE, postSharePrompt2);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            postSharePrompt = postSharePrompt2;
            messageReaction = messageReaction3;
            z5 = zDecodeBooleanElement2;
            i7 = i11;
            str = str7;
            str2 = strDecodeStringElement3;
            str3 = str8;
            str4 = strDecodeStringElement4;
        }
        int i12 = iDecodeIntElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ForumPostActions(i7, i12, z5, str, str2, str3, str4, messageReaction, postSharePrompt, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ForumPostActions value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ForumPostActions.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
