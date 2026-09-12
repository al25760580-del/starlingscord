package com.discord.chat.bridge.automod;

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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/automod/AutoModerationNotification.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/automod/AutoModerationNotification;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/automod/AutoModerationNotification;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/automod/AutoModerationNotification;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class AutoModerationNotification$$serializer implements f0 {

    @NotNull
    public static final AutoModerationNotification$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        AutoModerationNotification$$serializer autoModerationNotification$$serializer = new AutoModerationNotification$$serializer();
        INSTANCE = autoModerationNotification$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.automod.AutoModerationNotification", autoModerationNotification$$serializer, 13);
        g1Var.b("header", false);
        g1Var.b("headerColor", false);
        g1Var.b("headerIconURL", false);
        g1Var.b("headerIconColor", false);
        g1Var.b("subtitleLeft", true);
        g1Var.b("subtitleRight", true);
        g1Var.b("body", true);
        g1Var.b("shouldShowActions", false);
        g1Var.b("enabledByUsername", true);
        g1Var.b("enabledByAvatarURL", true);
        g1Var.b("enabledByColor", true);
        g1Var.b("severity", true);
        g1Var.b("startTime", true);
        descriptor = g1Var;
    }

    private AutoModerationNotification$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        s1 s1Var = s1.f17602a;
        m0 m0Var = m0.f17573a;
        return new KSerializer[]{s1Var, m0Var, s1Var, m0Var, b.p(s1Var), b.p(s1Var), b.p(s1Var), g.f17537a, b.p(s1Var), b.p(s1Var), b.p(m0Var), b.p(s1Var), b.p(s1Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final AutoModerationNotification deserialize(@NotNull Decoder decoder) {
        int i7;
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean z5;
        int i10;
        int i11;
        char c8;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i12 = 10;
        char c10 = '\t';
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            s1 s1Var = s1.f17602a;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s1Var, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, s1Var, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, s1Var, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, s1Var, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, s1Var, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, m0.f17573a, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, s1Var, null);
            i7 = 8191;
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, s1Var, null);
            num = num2;
            str4 = str15;
            str6 = str14;
            z5 = zDecodeBooleanElement;
            str7 = str12;
            str8 = str11;
            i10 = iDecodeIntElement2;
            str5 = str13;
            str9 = str10;
            str2 = strDecodeStringElement2;
            i11 = iDecodeIntElement;
            str = strDecodeStringElement;
        } else {
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String str16 = null;
            String str17 = null;
            Integer num3 = null;
            String str18 = null;
            String str19 = null;
            String str20 = null;
            boolean z6 = true;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement3 = 0;
            int iDecodeIntElement4 = 0;
            String str21 = null;
            String str22 = null;
            i7 = 0;
            while (z6) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z6 = false;
                        break;
                    case 0:
                        i7 |= 1;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i12 = 10;
                        c10 = '\t';
                        break;
                    case 1:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i7 |= 2;
                        i12 = 10;
                        c10 = '\t';
                        break;
                    case 2:
                        i7 |= 4;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i12 = 10;
                        c10 = '\t';
                        break;
                    case 3:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i7 |= 8;
                        i12 = 10;
                        c10 = '\t';
                        break;
                    case 4:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s1.f17602a, str22);
                        i7 |= 16;
                        i12 = 10;
                        c10 = '\t';
                        break;
                    case 5:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, s1.f17602a, str21);
                        i7 |= 32;
                        i12 = 10;
                        c10 = '\t';
                        break;
                    case 6:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, s1.f17602a, str20);
                        i7 |= 64;
                        i12 = 10;
                        c10 = '\t';
                        break;
                    case 7:
                        c8 = '\b';
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i7 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        i12 = 10;
                        c10 = '\t';
                        break;
                    case 8:
                        c8 = '\b';
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, s1.f17602a, str18);
                        i7 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        i12 = 10;
                        c10 = '\t';
                        break;
                    case 9:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, s1.f17602a, str19);
                        i7 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        c10 = '\t';
                        i12 = 10;
                        break;
                    case 10:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i12, m0.f17573a, num3);
                        i7 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        c10 = '\t';
                        break;
                    case 11:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, s1.f17602a, str17);
                        i7 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        c10 = '\t';
                        break;
                    case 12:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, s1.f17602a, str16);
                        i7 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        c10 = '\t';
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            str3 = str16;
            str4 = str17;
            num = num3;
            str5 = str18;
            str6 = str19;
            str7 = str20;
            str8 = str21;
            str9 = str22;
            z5 = zDecodeBooleanElement2;
            i10 = iDecodeIntElement3;
            i11 = iDecodeIntElement4;
        }
        int i13 = i7;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AutoModerationNotification(i13, str, i11, str2, i10, str9, str8, str7, z5, str5, str6, num, str4, str3, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull AutoModerationNotification value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AutoModerationNotification.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
