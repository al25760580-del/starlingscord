package com.discord.chat.bridge.automod;

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
import or.g1;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/automod/AutoModerationContext.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/automod/AutoModerationContext;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/automod/AutoModerationContext;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/automod/AutoModerationContext;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class AutoModerationContext$$serializer implements f0 {

    @NotNull
    public static final AutoModerationContext$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        AutoModerationContext$$serializer autoModerationContext$$serializer = new AutoModerationContext$$serializer();
        INSTANCE = autoModerationContext$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.automod.AutoModerationContext", autoModerationContext$$serializer, 9);
        g1Var.b("headerText", false);
        g1Var.b("headerBadgeText", false);
        g1Var.b("ruleDisplayText", true);
        g1Var.b("keywordDisplayText", true);
        g1Var.b("actionsIconURL", true);
        g1Var.b("actionsText", false);
        g1Var.b("feedbackText", false);
        g1Var.b("message", false);
        g1Var.b("notification", true);
        descriptor = g1Var;
    }

    private AutoModerationContext$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        s1 s1Var = s1.f17602a;
        return new KSerializer[]{s1Var, s1Var, b.p(s1Var), b.p(s1Var), b.p(s1Var), s1Var, s1Var, FlaggedMessageEmbed$$serializer.INSTANCE, b.p(AutoModerationNotification$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final AutoModerationContext deserialize(@NotNull Decoder decoder) {
        int i7;
        AutoModerationNotification autoModerationNotification;
        FlaggedMessageEmbed flaggedMessageEmbed;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i10 = 7;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            s1 s1Var = s1.f17602a;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, s1Var, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, s1Var, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s1Var, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            str2 = strDecodeStringElement2;
            flaggedMessageEmbed = (FlaggedMessageEmbed) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, FlaggedMessageEmbed$$serializer.INSTANCE, null);
            str7 = strDecodeStringElement5;
            str6 = strDecodeStringElement4;
            str5 = str9;
            autoModerationNotification = (AutoModerationNotification) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, AutoModerationNotification$$serializer.INSTANCE, null);
            str = str10;
            str4 = str8;
            str3 = strDecodeStringElement3;
            i7 = 511;
        } else {
            boolean z5 = true;
            int i11 = 0;
            AutoModerationNotification autoModerationNotification2 = null;
            FlaggedMessageEmbed flaggedMessageEmbed2 = null;
            String str11 = null;
            String strDecodeStringElement6 = null;
            String str12 = null;
            String str13 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        break;
                    case 0:
                        i11 |= 1;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i10 = 7;
                        break;
                    case 1:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i11 |= 2;
                        i10 = 7;
                        break;
                    case 2:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, s1.f17602a, str12);
                        i11 |= 4;
                        i10 = 7;
                        break;
                    case 3:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, s1.f17602a, str13);
                        i11 |= 8;
                        i10 = 7;
                        break;
                    case 4:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s1.f17602a, str11);
                        i11 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i11 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i11 |= 64;
                        break;
                    case 7:
                        flaggedMessageEmbed2 = (FlaggedMessageEmbed) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i10, FlaggedMessageEmbed$$serializer.INSTANCE, flaggedMessageEmbed2);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        break;
                    case 8:
                        autoModerationNotification2 = (AutoModerationNotification) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, AutoModerationNotification$$serializer.INSTANCE, autoModerationNotification2);
                        i11 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            i7 = i11;
            autoModerationNotification = autoModerationNotification2;
            flaggedMessageEmbed = flaggedMessageEmbed2;
            str = str11;
            str2 = strDecodeStringElement;
            str3 = strDecodeStringElement6;
            str4 = str12;
            str5 = str13;
            str6 = strDecodeStringElement7;
            str7 = strDecodeStringElement8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AutoModerationContext(i7, str2, str3, str4, str5, str, str6, str7, flaggedMessageEmbed, autoModerationNotification, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull AutoModerationContext value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AutoModerationContext.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
