package com.discord.chat.bridge.activities;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer;
import com.facebook.imagepipeline.nativecode.b;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.dialog.AlertFragment;
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
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import org.webrtc.PeerConnection;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/discord/chat/bridge/activities/ActivityRichPresenceInviteEmbed.$serializer", "Lor/f0;", "Lcom/discord/chat/bridge/activities/ActivityRichPresenceInviteEmbed;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/discord/chat/bridge/activities/ActivityRichPresenceInviteEmbed;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/discord/chat/bridge/activities/ActivityRichPresenceInviteEmbed;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class ActivityRichPresenceInviteEmbed$$serializer implements f0 {

    @NotNull
    public static final ActivityRichPresenceInviteEmbed$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ActivityRichPresenceInviteEmbed$$serializer activityRichPresenceInviteEmbed$$serializer = new ActivityRichPresenceInviteEmbed$$serializer();
        INSTANCE = activityRichPresenceInviteEmbed$$serializer;
        g1 g1Var = new g1("com.discord.chat.bridge.activities.ActivityRichPresenceInviteEmbed", activityRichPresenceInviteEmbed$$serializer, 19);
        g1Var.b("displayType", false);
        g1Var.b("ctaButtonEnabled", true);
        g1Var.b("ctaButtonText", true);
        g1Var.b("ctaButtonIsLoading", true);
        g1Var.b("footerLabel", true);
        g1Var.b("gradientColors", true);
        g1Var.b("headerText", true);
        g1Var.b("iconSrc", true);
        g1Var.b("isPlatformSupported", true);
        g1Var.b("isSpotifyParty", true);
        g1Var.b("maxPartySize", true);
        g1Var.b("partyMemberAvatarURIs", true);
        g1Var.b("partySizeText", true);
        g1Var.b("platformIconKeys", true);
        g1Var.b("coverImageUrl", true);
        g1Var.b("detailsText", true);
        g1Var.b("subtitle", true);
        g1Var.b(AlertFragment.ARG_TITLE, true);
        g1Var.b("hiddenEmbedMessageContent", true);
        descriptor = g1Var;
    }

    private ActivityRichPresenceInviteEmbed$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // or.f0
    @NotNull
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ActivityRichPresenceInviteEmbed.$childSerializers;
        g gVar = g.f17537a;
        s1 s1Var = s1.f17602a;
        return new KSerializer[]{lazyArr[0].getValue(), b.p(gVar), b.p(s1Var), b.p(gVar), b.p(s1Var), b.p((KSerializer) lazyArr[5].getValue()), b.p(s1Var), b.p(s1Var), b.p(gVar), b.p(gVar), b.p(m0.f17573a), b.p((KSerializer) lazyArr[11].getValue()), b.p(s1Var), b.p((KSerializer) lazyArr[13].getValue()), b.p(s1Var), b.p(s1Var), b.p(s1Var), b.p(s1Var), b.p(StructurableTextSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final ActivityRichPresenceInviteEmbed deserialize(@NotNull Decoder decoder) {
        String str;
        int i7;
        EmbedDisplayType embedDisplayType;
        Boolean bool;
        Boolean bool2;
        String str2;
        String str3;
        String str4;
        List list;
        Integer num;
        String str5;
        StructurableText structurableText;
        Boolean bool3;
        String str6;
        Boolean bool4;
        String str7;
        List list2;
        String str8;
        String str9;
        List list3;
        int i10;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ActivityRichPresenceInviteEmbed.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            EmbedDisplayType embedDisplayType2 = (EmbedDisplayType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            g gVar = g.f17537a;
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, gVar, null);
            s1 s1Var = s1.f17602a;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, s1Var, null);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, gVar, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s1Var, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, s1Var, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, s1Var, null);
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, gVar, null);
            Boolean bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, gVar, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, m0.f17573a, null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, (DeserializationStrategy) lazyArr[11].getValue(), null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, s1Var, null);
            List list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, s1Var, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, s1Var, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, s1Var, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, s1Var, null);
            i7 = 524287;
            structurableText = (StructurableText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StructurableTextSerializer.INSTANCE, null);
            str9 = str14;
            str7 = str11;
            str6 = str10;
            list2 = list4;
            bool2 = bool8;
            str8 = str12;
            str5 = str13;
            bool = bool7;
            bool4 = bool6;
            bool3 = bool5;
            str2 = str17;
            str4 = str16;
            str3 = str15;
            list3 = list6;
            embedDisplayType = embedDisplayType2;
            list = list5;
            num = num2;
        } else {
            List list7 = null;
            String str18 = null;
            Boolean bool9 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            List list8 = null;
            Integer num3 = null;
            String str22 = null;
            str = null;
            EmbedDisplayType embedDisplayType3 = null;
            Boolean bool10 = null;
            String str23 = null;
            Boolean bool11 = null;
            String str24 = null;
            List list9 = null;
            int i11 = 5;
            int i12 = 0;
            int i13 = 1;
            Boolean bool12 = null;
            String str25 = null;
            StructurableText structurableText2 = null;
            i7 = 0;
            while (i13 != 0) {
                String str26 = str19;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        i13 = i12;
                        str19 = str26;
                        list7 = list7;
                        i11 = 5;
                        i12 = i13;
                        str18 = str18;
                        break;
                    case 0:
                        List list10 = list7;
                        DeserializationStrategy deserializationStrategy = (DeserializationStrategy) lazyArr[i12].getValue();
                        int i14 = i12;
                        embedDisplayType3 = (EmbedDisplayType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i14, deserializationStrategy, embedDisplayType3);
                        i7 |= 1;
                        bool10 = bool10;
                        str19 = str26;
                        list7 = list10;
                        i11 = 5;
                        i12 = i14;
                        str18 = str18;
                        break;
                    case 1:
                        bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, g.f17537a, bool10);
                        i7 |= 2;
                        str23 = str23;
                        str19 = str26;
                        str18 = str18;
                        list7 = list7;
                        i11 = 5;
                        break;
                    case 2:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, s1.f17602a, str23);
                        i7 |= 4;
                        bool11 = bool11;
                        str19 = str26;
                        str18 = str18;
                        list7 = list7;
                        i11 = 5;
                        break;
                    case 3:
                        bool11 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, g.f17537a, bool11);
                        i7 |= 8;
                        str24 = str24;
                        str19 = str26;
                        str18 = str18;
                        list7 = list7;
                        i11 = 5;
                        break;
                    case 4:
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s1.f17602a, str24);
                        i7 |= 16;
                        list9 = list9;
                        str19 = str26;
                        str18 = str18;
                        list7 = list7;
                        i11 = 5;
                        break;
                    case 5:
                        String str27 = str18;
                        int i15 = i11;
                        list9 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i15, (DeserializationStrategy) lazyArr[i11].getValue(), list9);
                        i7 |= 32;
                        str19 = str26;
                        str18 = str27;
                        i11 = i15;
                        list7 = list7;
                        break;
                    case 6:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, s1.f17602a, str26);
                        i7 |= 64;
                        str18 = str18;
                        list7 = list7;
                        break;
                    case 7:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, s1.f17602a, str22);
                        i7 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                        list7 = list7;
                        str19 = str26;
                        break;
                    case 8:
                        str22 = str22;
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, g.f17537a, bool9);
                        i7 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        str19 = str26;
                        str22 = str22;
                        break;
                    case 9:
                        str22 = str22;
                        bool12 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, g.f17537a, bool12);
                        i7 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        str19 = str26;
                        str22 = str22;
                        break;
                    case 10:
                        str22 = str22;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, m0.f17573a, num3);
                        i7 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        str19 = str26;
                        str22 = str22;
                        break;
                    case 11:
                        str22 = str22;
                        list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, (DeserializationStrategy) lazyArr[11].getValue(), list8);
                        i7 |= RecyclerView.ItemAnimator.FLAG_MOVED;
                        str19 = str26;
                        str22 = str22;
                        break;
                    case 12:
                        str22 = str22;
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, s1.f17602a, str);
                        i7 |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
                        str19 = str26;
                        str22 = str22;
                        break;
                    case 13:
                        str22 = str22;
                        list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), list7);
                        i7 |= 8192;
                        str19 = str26;
                        str22 = str22;
                        break;
                    case 14:
                        str22 = str22;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, s1.f17602a, str18);
                        i7 |= 16384;
                        str19 = str26;
                        str22 = str22;
                        break;
                    case 15:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, s1.f17602a, str20);
                        i10 = PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
                        i7 |= i10;
                        str19 = str26;
                        str22 = str22;
                        break;
                    case 16:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, s1.f17602a, str21);
                        i10 = 65536;
                        i7 |= i10;
                        str19 = str26;
                        str22 = str22;
                        break;
                    case 17:
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, s1.f17602a, str25);
                        i10 = 131072;
                        i7 |= i10;
                        str19 = str26;
                        str22 = str22;
                        break;
                    case 18:
                        structurableText2 = (StructurableText) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StructurableTextSerializer.INSTANCE, structurableText2);
                        i10 = 262144;
                        i7 |= i10;
                        str19 = str26;
                        str22 = str22;
                        break;
                    default:
                        throw new j(iDecodeElementIndex);
                }
            }
            embedDisplayType = embedDisplayType3;
            bool = bool9;
            bool2 = bool12;
            str2 = str25;
            str3 = str20;
            str4 = str21;
            list = list8;
            num = num3;
            str5 = str22;
            structurableText = structurableText2;
            bool3 = bool10;
            str6 = str23;
            bool4 = bool11;
            str7 = str24;
            list2 = list9;
            str8 = str19;
            str9 = str18;
            list3 = list7;
        }
        int i16 = i7;
        String str28 = str;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ActivityRichPresenceInviteEmbed(i16, embedDisplayType, bool3, str6, bool4, str7, list2, str8, str5, bool, bool2, num, list, str28, list3, str9, str3, str4, str2, structurableText, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ActivityRichPresenceInviteEmbed value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ActivityRichPresenceInviteEmbed.write$Self$chat_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // or.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return e1.f17528b;
    }
}
