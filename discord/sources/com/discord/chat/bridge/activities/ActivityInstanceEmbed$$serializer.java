package com.discord.chat.bridge.activities;

import com.discord.chat.bridge.codedlinks.AppMessageEmbedImpl;
import com.discord.chat.bridge.codedlinks.AppMessageEmbedImpl$$serializer;
import com.discord.primitives.ApplicationId;
import com.discord.primitives.ApplicationId$$serializer;
import com.facebook.imagepipeline.nativecode.b;
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
import or.g1;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/activities/ActivityInstanceEmbed.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/activities/ActivityInstanceEmbed;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/activities/ActivityInstanceEmbed;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/activities/ActivityInstanceEmbed;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class ActivityInstanceEmbed$$serializer implements f0 {

    @NotNull
    public static final ActivityInstanceEmbed$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ActivityInstanceEmbed$$serializer activityInstanceEmbed$$serializer = new ActivityInstanceEmbed$$serializer();
        INSTANCE = activityInstanceEmbed$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.activities.ActivityInstanceEmbed", activityInstanceEmbed$$serializer, 5);
        g1Var.b("applicationId", false);
        g1Var.b("instanceId", false);
        g1Var.b("participantAvatarUris", true);
        g1Var.b("appMessageEmbedModel", false);
        g1Var.b("participantsDescription", true);
        descriptor = g1Var;
    }

    private ActivityInstanceEmbed$$serializer() {
    }

    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ActivityInstanceEmbed.$childSerializers;
        s1 s1Var = s1.f17602a;
        return new KSerializer[]{ApplicationId$$serializer.INSTANCE, s1Var, b.p((KSerializer) lazyArr[2].getValue()), AppMessageEmbedImpl$$serializer.INSTANCE, b.p(s1Var)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final ActivityInstanceEmbed deserialize(@NotNull Decoder decoder) {
        int i7;
        ApplicationId applicationId;
        String str;
        List list;
        AppMessageEmbedImpl appMessageEmbedImpl;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ActivityInstanceEmbed.$childSerializers;
        ApplicationId applicationId2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            ApplicationId applicationId3 = (ApplicationId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, ApplicationId$$serializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            applicationId = applicationId3;
            appMessageEmbedImpl = (AppMessageEmbedImpl) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, AppMessageEmbedImpl$$serializer.INSTANCE, null);
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s1.f17602a, null);
            i7 = 31;
            str = strDecodeStringElement;
        } else {
            boolean z5 = true;
            int i10 = 0;
            String strDecodeStringElement2 = null;
            List list2 = null;
            AppMessageEmbedImpl appMessageEmbedImpl2 = null;
            String str3 = null;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z5 = false;
                } else if (iDecodeElementIndex == 0) {
                    applicationId2 = (ApplicationId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, ApplicationId$$serializer.INSTANCE, applicationId2);
                    i10 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i10 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), list2);
                    i10 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    appMessageEmbedImpl2 = (AppMessageEmbedImpl) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, AppMessageEmbedImpl$$serializer.INSTANCE, appMessageEmbedImpl2);
                    i10 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new j(iDecodeElementIndex);
                    }
                    str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s1.f17602a, str3);
                    i10 |= 16;
                }
            }
            i7 = i10;
            applicationId = applicationId2;
            str = strDecodeStringElement2;
            list = list2;
            appMessageEmbedImpl = appMessageEmbedImpl2;
            str2 = str3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ActivityInstanceEmbed(i7, applicationId, str, list, appMessageEmbedImpl, str2, null, null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ActivityInstanceEmbed value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ActivityInstanceEmbed.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
