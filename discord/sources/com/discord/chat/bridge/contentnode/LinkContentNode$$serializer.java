package com.discord.chat.bridge.contentnode;

import com.discord.chat.bridge.rolecolors.RoleColors;
import com.discord.chat.bridge.rolecolors.RoleColors$$serializer;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/contentnode/LinkContentNode.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class LinkContentNode$$serializer implements f0 {

    @NotNull
    public static final LinkContentNode$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        LinkContentNode$$serializer linkContentNode$$serializer = new LinkContentNode$$serializer();
        INSTANCE = linkContentNode$$serializer;
        g1 g1Var = new g1("link", linkContentNode$$serializer, 10);
        g1Var.b("content", false);
        g1Var.b("target", false);
        g1Var.b("linkColor", true);
        g1Var.b("roleColors", true);
        g1Var.b("bindUserMenuRoleColor", true);
        g1Var.b("shouldShowRoleDot", true);
        g1Var.b("medium", true);
        g1Var.b("url", true);
        g1Var.b("isUrl", true);
        g1Var.b("textContent", true);
        descriptor = g1Var;
    }

    private LinkContentNode$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        m0 m0Var = m0.f17573a;
        g gVar = g.f17537a;
        s1 s1Var = s1.f17602a;
        return new KSerializer[]{LinkContentNode.$childSerializers[0].getValue(), b.p(LinkContextDataSerializer.INSTANCE), b.p(m0Var), b.p(RoleColors$$serializer.INSTANCE), b.p(m0Var), b.p(gVar), b.p(gVar), b.p(s1Var), gVar, b.p(s1Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final LinkContentNode deserialize(@NotNull Decoder decoder) {
        boolean z5;
        String str;
        String str2;
        Boolean bool;
        Integer num;
        Boolean bool2;
        RoleColors roleColors;
        Integer num2;
        LinkContextData linkContextData;
        int i7;
        List list;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = LinkContentNode.$childSerializers;
        int i10 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            LinkContextData linkContextData2 = (LinkContextData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LinkContextDataSerializer.INSTANCE, null);
            m0 m0Var = m0.f17573a;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, m0Var, null);
            RoleColors roleColors2 = (RoleColors) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, RoleColors$$serializer.INSTANCE, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, m0Var, null);
            g gVar = g.f17537a;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, gVar, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, gVar, null);
            s1 s1Var = s1.f17602a;
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, s1Var, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            list = list2;
            linkContextData = linkContextData2;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, s1Var, null);
            str2 = str3;
            bool = bool4;
            bool2 = bool3;
            roleColors = roleColors2;
            z5 = zDecodeBooleanElement;
            num = num4;
            num2 = num3;
            i7 = 1023;
        } else {
            boolean z6 = true;
            boolean zDecodeBooleanElement2 = false;
            String str4 = null;
            String str5 = null;
            Boolean bool5 = null;
            Integer num5 = null;
            Boolean bool6 = null;
            RoleColors roleColors3 = null;
            Integer num6 = null;
            List list3 = null;
            int i11 = 0;
            LinkContextData linkContextData3 = null;
            while (z6) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z6 = false;
                        break;
                    case 0:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), list3);
                        i11 |= 1;
                        i10 = 9;
                        break;
                    case 1:
                        linkContextData3 = (LinkContextData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LinkContextDataSerializer.INSTANCE, linkContextData3);
                        i11 |= 2;
                        i10 = 9;
                        break;
                    case 2:
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, m0.f17573a, num6);
                        i11 |= 4;
                        i10 = 9;
                        break;
                    case 3:
                        roleColors3 = (RoleColors) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, RoleColors$$serializer.INSTANCE, roleColors3);
                        i11 |= 8;
                        i10 = 9;
                        break;
                    case 4:
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, m0.f17573a, num5);
                        i11 |= 16;
                        i10 = 9;
                        break;
                    case 5:
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, g.f17537a, bool6);
                        i11 |= 32;
                        i10 = 9;
                        break;
                    case 6:
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, g.f17537a, bool5);
                        i11 |= 64;
                        i10 = 9;
                        break;
                    case 7:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, s1.f17602a, str5);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        i10 = 9;
                        break;
                    case 8:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    case 9:
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i10, s1.f17602a, str4);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            z5 = zDecodeBooleanElement2;
            str = str4;
            str2 = str5;
            bool = bool5;
            num = num5;
            bool2 = bool6;
            roleColors = roleColors3;
            num2 = num6;
            linkContextData = linkContextData3;
            i7 = i11;
            list = list3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LinkContentNode(i7, list, linkContextData, num2, roleColors, num, bool2, bool, str2, z5, str, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull LinkContentNode value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        LinkContentNode.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
