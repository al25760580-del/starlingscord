package com.discord.chat.bridge.executedcommand;

import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText;
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableTextSerializer;
import com.discord.notifications.renderer.NotificationRenderer;
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
import or.g;
import or.g1;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/executedcommand/ExecutedCommand.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class ExecutedCommand$$serializer implements f0 {

    @NotNull
    public static final ExecutedCommand$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ExecutedCommand$$serializer executedCommand$$serializer = new ExecutedCommand$$serializer();
        INSTANCE = executedCommand$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.executedcommand.ExecutedCommand", executedCommand$$serializer, 9);
        g1Var.b("userId", false);
        g1Var.b(NotificationRenderer.USERNAME, false);
        g1Var.b("usernameColor", false);
        g1Var.b("avatarURL", true);
        g1Var.b("targetUsernameColor", false);
        g1Var.b("content", false);
        g1Var.b("commandNameBackgroundStyles", true);
        g1Var.b("showAppsIcon", true);
        g1Var.b("showControllerIcon", true);
        descriptor = g1Var;
    }

    private ExecutedCommand$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        s1 s1Var = s1.f17602a;
        KSerializer kSerializerP = b.p(s1Var);
        KSerializer kSerializerP2 = b.p(ExecutedCommandBackgroundStyles$$serializer.INSTANCE);
        g gVar = g.f17537a;
        KSerializer kSerializerP3 = b.p(gVar);
        KSerializer kSerializerP4 = b.p(gVar);
        m0 m0Var = m0.f17573a;
        return new KSerializer[]{UserId$$serializer.INSTANCE, s1Var, m0Var, kSerializerP, m0Var, AnnotatedStructurableTextSerializer.INSTANCE, kSerializerP2, kSerializerP3, kSerializerP4};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final ExecutedCommand deserialize(@NotNull Decoder decoder) {
        int i7;
        Boolean bool;
        Boolean bool2;
        ExecutedCommandBackgroundStyles executedCommandBackgroundStyles;
        AnnotatedStructurableText annotatedStructurableText;
        String str;
        int i10;
        int i11;
        UserId userId;
        String str2;
        char c8;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i12 = 7;
        int i13 = 6;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            UserId userId2 = (UserId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, UserId$$serializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, s1.f17602a, null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            AnnotatedStructurableText annotatedStructurableText2 = (AnnotatedStructurableText) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, AnnotatedStructurableTextSerializer.INSTANCE, null);
            ExecutedCommandBackgroundStyles executedCommandBackgroundStyles2 = (ExecutedCommandBackgroundStyles) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, ExecutedCommandBackgroundStyles$$serializer.INSTANCE, null);
            g gVar = g.f17537a;
            userId = userId2;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, gVar, null);
            executedCommandBackgroundStyles = executedCommandBackgroundStyles2;
            annotatedStructurableText = annotatedStructurableText2;
            str = str3;
            bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, gVar, null);
            i7 = iDecodeIntElement2;
            i10 = iDecodeIntElement;
            str2 = strDecodeStringElement;
            i11 = 511;
        } else {
            boolean z5 = true;
            int iDecodeIntElement3 = 0;
            int i14 = 0;
            Boolean bool3 = null;
            Boolean bool4 = null;
            ExecutedCommandBackgroundStyles executedCommandBackgroundStyles3 = null;
            AnnotatedStructurableText annotatedStructurableText3 = null;
            UserId userId3 = null;
            String strDecodeStringElement2 = null;
            int iDecodeIntElement4 = 0;
            String str4 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        i13 = 6;
                        break;
                    case 0:
                        userId3 = (UserId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, UserId$$serializer.INSTANCE, userId3);
                        i14 |= 1;
                        i12 = 7;
                        i13 = 6;
                        break;
                    case 1:
                        i14 |= 2;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i12 = 7;
                        i13 = 6;
                        break;
                    case 2:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i14 |= 4;
                        i12 = 7;
                        i13 = 6;
                        break;
                    case 3:
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, s1.f17602a, str4);
                        i14 |= 8;
                        i12 = 7;
                        i13 = 6;
                        break;
                    case 4:
                        c8 = 5;
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i14 |= 16;
                        i12 = 7;
                        break;
                    case 5:
                        c8 = 5;
                        annotatedStructurableText3 = (AnnotatedStructurableText) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, AnnotatedStructurableTextSerializer.INSTANCE, annotatedStructurableText3);
                        i14 |= 32;
                        i12 = 7;
                        break;
                    case 6:
                        executedCommandBackgroundStyles3 = (ExecutedCommandBackgroundStyles) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i13, ExecutedCommandBackgroundStyles$$serializer.INSTANCE, executedCommandBackgroundStyles3);
                        i14 |= 64;
                        break;
                    case 7:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i12, g.f17537a, bool3);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    case 8:
                        bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, g.f17537a, bool4);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            i7 = iDecodeIntElement3;
            bool = bool3;
            bool2 = bool4;
            executedCommandBackgroundStyles = executedCommandBackgroundStyles3;
            annotatedStructurableText = annotatedStructurableText3;
            str = str4;
            i10 = iDecodeIntElement4;
            i11 = i14;
            userId = userId3;
            str2 = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ExecutedCommand(i11, userId, str2, i10, str, i7, annotatedStructurableText, executedCommandBackgroundStyles, bool, bool2, null, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ExecutedCommand value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ExecutedCommand.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
