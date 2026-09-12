package com.discord.chat.bridge.botuikit;

import com.discord.chat.bridge.media.UnfurledMediaItem;
import com.discord.chat.bridge.media.UnfurledMediaItem$$serializer;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.devsupport.StackTraceHelper;
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
import or.a1;
import or.e1;
import or.f0;
import or.g;
import or.g1;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/botuikit/FileDisplayComponent.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/botuikit/FileDisplayComponent;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/botuikit/FileDisplayComponent;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/botuikit/FileDisplayComponent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class FileDisplayComponent$$serializer implements f0 {

    @NotNull
    public static final FileDisplayComponent$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        FileDisplayComponent$$serializer fileDisplayComponent$$serializer = new FileDisplayComponent$$serializer();
        INSTANCE = fileDisplayComponent$$serializer;
        g1 g1Var = new g1("13", fileDisplayComponent$$serializer, 10);
        g1Var.b("type", false);
        g1Var.b(StackTraceHelper.ID_KEY, false);
        g1Var.b("file", false);
        g1Var.b(StackTraceHelper.NAME_KEY, false);
        g1Var.b("size", false);
        g1Var.b("isSuspiciousDownload", true);
        g1Var.b("isSpoiler", false);
        g1Var.b("spoilerDescription", false);
        g1Var.b("spoilerOrNull", true);
        g1Var.b("obscureOrNull", true);
        descriptor = g1Var;
    }

    private FileDisplayComponent$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        s1 s1Var = s1.f17602a;
        KSerializer kSerializerP = b.p(s1Var);
        KSerializer kSerializerP2 = b.p(s1Var);
        KSerializer kSerializerP3 = b.p(a1.f17502a);
        g gVar = g.f17537a;
        return new KSerializer[]{m0.f17573a, s1Var, UnfurledMediaItem$$serializer.INSTANCE, s1Var, s1Var, gVar, gVar, kSerializerP, kSerializerP2, kSerializerP3};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final FileDisplayComponent deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        Void r32;
        String str;
        String str2;
        UnfurledMediaItem unfurledMediaItem;
        boolean z5;
        boolean z6;
        int i7;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i10 = 9;
        int i11 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            UnfurledMediaItem unfurledMediaItem2 = (UnfurledMediaItem) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, UnfurledMediaItem$$serializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            s1 s1Var = s1.f17602a;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, s1Var, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, s1Var, null);
            r32 = (Void) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, a1.f17502a, null);
            str2 = str6;
            z5 = zDecodeBooleanElement2;
            z6 = zDecodeBooleanElement;
            str4 = strDecodeStringElement2;
            str = str7;
            str5 = strDecodeStringElement3;
            unfurledMediaItem = unfurledMediaItem2;
            str3 = strDecodeStringElement;
            i7 = 1023;
        } else {
            boolean z7 = true;
            iDecodeIntElement = 0;
            boolean zDecodeBooleanElement3 = false;
            int i12 = 0;
            Void r7 = null;
            String str8 = null;
            String str9 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            boolean zDecodeBooleanElement4 = false;
            UnfurledMediaItem unfurledMediaItem3 = null;
            while (z7) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z7 = false;
                        i10 = 9;
                        break;
                    case 0:
                        i12 |= 1;
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i10 = 9;
                        i11 = 7;
                        break;
                    case 1:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i12 |= 2;
                        i10 = 9;
                        i11 = 7;
                        break;
                    case 2:
                        unfurledMediaItem3 = (UnfurledMediaItem) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, UnfurledMediaItem$$serializer.INSTANCE, unfurledMediaItem3);
                        i12 |= 4;
                        i10 = 9;
                        i11 = 7;
                        break;
                    case 3:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i12 |= 8;
                        i10 = 9;
                        break;
                    case 4:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i12 |= 16;
                        break;
                    case 5:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i12 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i12 |= 64;
                        break;
                    case 7:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i11, s1.f17602a, str9);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    case 8:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, s1.f17602a, str8);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    case 9:
                        r7 = (Void) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i10, a1.f17502a, r7);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            r32 = r7;
            str = str8;
            str2 = str9;
            unfurledMediaItem = unfurledMediaItem3;
            z5 = zDecodeBooleanElement4;
            z6 = zDecodeBooleanElement3;
            i7 = i12;
            str3 = strDecodeStringElement4;
            str4 = strDecodeStringElement5;
            str5 = strDecodeStringElement6;
        }
        int i13 = iDecodeIntElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FileDisplayComponent(i7, i13, str3, unfurledMediaItem, str4, str5, z6, z5, str2, str, r32, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull FileDisplayComponent value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        FileDisplayComponent.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
