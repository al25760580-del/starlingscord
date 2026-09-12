package com.discord.chat.bridge.referral;

import a3.e;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText;
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableTextSerializer;
import com.discord.chat.presentation.list.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import or.g;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes.dex */
@f(with = ReferralEmbedSerializer.class)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00122\u00020\u0001:\u0003\u0010\u0011\u0012R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/discord/chat/bridge/referral/ReferralEmbed;", "", "headerText", "", "getHeaderText", "()Ljava/lang/String;", "headerColor", "", "getHeaderColor", "()I", ViewProps.BACKGROUND_COLOR, "getBackgroundColor", "thumbnailCornerRadius", "getThumbnailCornerRadius", "headerLogoUrl", "getHeaderLogoUrl", "Resolving", "Resolved", "Companion", "Lcom/discord/chat/bridge/referral/ReferralEmbed$Resolved;", "Lcom/discord/chat/bridge/referral/ReferralEmbed$Resolving;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ReferralEmbed {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/referral/ReferralEmbed$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/referral/ReferralEmbed;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ReferralEmbedSerializer.INSTANCE;
        }
    }

    @f
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 e2\u00020\u0001:\u0002deBý\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dBñ\u0001\b\u0010\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001c\u0010!J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010K\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010T\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0002\u0010=J\u008e\u0002\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0002\u0010VJ\u0013\u0010W\u001a\u00020\u001b2\b\u0010X\u001a\u0004\u0018\u00010YHÖ\u0003J\t\u0010Z\u001a\u00020\u0005HÖ\u0001J\t\u0010[\u001a\u00020\u0003HÖ\u0001J%\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020\u00002\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020bH\u0001¢\u0006\u0002\bcR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010.\u001a\u0004\b2\u0010-R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b3\u00101R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010.\u001a\u0004\b4\u0010-R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010.\u001a\u0004\b6\u0010-R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010.\u001a\u0004\b8\u0010-R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010.\u001a\u0004\b:\u0010-R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010#R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\n\n\u0002\u0010>\u001a\u0004\b<\u0010=¨\u0006f"}, d2 = {"Lcom/discord/chat/bridge/referral/ReferralEmbed$Resolved;", "Lcom/discord/chat/bridge/referral/ReferralEmbed;", "headerText", "", "headerColor", "", ViewProps.BACKGROUND_COLOR, "thumbnailCornerRadius", "headerLogoUrl", "headerUrl", "thumbnailUrl", "titleText", "titleColor", "bodyText", "structuredBodyText", "Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;", "bodyTextColor", "linkButtonLabel", "linkButtonColor", "subText", "subTextColor", "footerText", "footerTextColor", "acceptLabelText", "acceptLabelColor", "acceptLabelIconUrl", "canBeAccepted", "", "<init>", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;Ljava/lang/Integer;Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;Ljava/lang/Integer;Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getHeaderText", "()Ljava/lang/String;", "getHeaderColor", "()I", "getBackgroundColor", "getThumbnailCornerRadius", "getHeaderLogoUrl", "getHeaderUrl", "getThumbnailUrl", "getTitleText", "getTitleColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBodyText", "getStructuredBodyText", "()Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;", "getBodyTextColor", "getLinkButtonLabel", "getLinkButtonColor", "getSubText", "getSubTextColor", "getFooterText", "getFooterTextColor", "getAcceptLabelText", "getAcceptLabelColor", "getAcceptLabelIconUrl", "getCanBeAccepted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;Ljava/lang/Integer;Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/discord/chat/bridge/referral/ReferralEmbed$Resolved;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Resolved implements ReferralEmbed {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final Integer acceptLabelColor;
        private final String acceptLabelIconUrl;
        private final String acceptLabelText;
        private final int backgroundColor;
        private final String bodyText;
        private final Integer bodyTextColor;
        private final Boolean canBeAccepted;
        private final String footerText;
        private final Integer footerTextColor;
        private final int headerColor;
        private final String headerLogoUrl;

        @NotNull
        private final String headerText;
        private final String headerUrl;
        private final Integer linkButtonColor;
        private final AnnotatedStructurableText linkButtonLabel;
        private final AnnotatedStructurableText structuredBodyText;
        private final String subText;
        private final Integer subTextColor;
        private final int thumbnailCornerRadius;
        private final String thumbnailUrl;
        private final Integer titleColor;
        private final String titleText;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/referral/ReferralEmbed$Resolved$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/referral/ReferralEmbed$Resolved;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return ReferralEmbed$Resolved$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Resolved(int i7, String str, int i10, int i11, int i12, String str2, String str3, String str4, String str5, Integer num, String str6, AnnotatedStructurableText annotatedStructurableText, Integer num2, AnnotatedStructurableText annotatedStructurableText2, Integer num3, String str7, Integer num4, String str8, Integer num5, String str9, Integer num6, String str10, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
            if (31 != (i7 & 31)) {
                e1.l(i7, 31, ReferralEmbed$Resolved$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.headerText = str;
            this.headerColor = i10;
            this.backgroundColor = i11;
            this.thumbnailCornerRadius = i12;
            this.headerLogoUrl = str2;
            if ((i7 & 32) == 0) {
                this.headerUrl = null;
            } else {
                this.headerUrl = str3;
            }
            if ((i7 & 64) == 0) {
                this.thumbnailUrl = null;
            } else {
                this.thumbnailUrl = str4;
            }
            if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                this.titleText = null;
            } else {
                this.titleText = str5;
            }
            if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
                this.titleColor = null;
            } else {
                this.titleColor = num;
            }
            if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
                this.bodyText = null;
            } else {
                this.bodyText = str6;
            }
            if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
                this.structuredBodyText = null;
            } else {
                this.structuredBodyText = annotatedStructurableText;
            }
            if ((i7 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
                this.bodyTextColor = null;
            } else {
                this.bodyTextColor = num2;
            }
            if ((i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
                this.linkButtonLabel = null;
            } else {
                this.linkButtonLabel = annotatedStructurableText2;
            }
            if ((i7 & 8192) == 0) {
                this.linkButtonColor = null;
            } else {
                this.linkButtonColor = num3;
            }
            if ((i7 & 16384) == 0) {
                this.subText = null;
            } else {
                this.subText = str7;
            }
            if ((32768 & i7) == 0) {
                this.subTextColor = null;
            } else {
                this.subTextColor = num4;
            }
            if ((65536 & i7) == 0) {
                this.footerText = null;
            } else {
                this.footerText = str8;
            }
            if ((131072 & i7) == 0) {
                this.footerTextColor = null;
            } else {
                this.footerTextColor = num5;
            }
            if ((262144 & i7) == 0) {
                this.acceptLabelText = null;
            } else {
                this.acceptLabelText = str9;
            }
            if ((524288 & i7) == 0) {
                this.acceptLabelColor = null;
            } else {
                this.acceptLabelColor = num6;
            }
            if ((1048576 & i7) == 0) {
                this.acceptLabelIconUrl = null;
            } else {
                this.acceptLabelIconUrl = str10;
            }
            if ((i7 & 2097152) == 0) {
                this.canBeAccepted = null;
            } else {
                this.canBeAccepted = bool;
            }
        }

        public static /* synthetic */ Resolved copy$default(Resolved resolved, String str, int i7, int i10, int i11, String str2, String str3, String str4, String str5, Integer num, String str6, AnnotatedStructurableText annotatedStructurableText, Integer num2, AnnotatedStructurableText annotatedStructurableText2, Integer num3, String str7, Integer num4, String str8, Integer num5, String str9, Integer num6, String str10, Boolean bool, int i12, Object obj) {
            Boolean bool2;
            String str11;
            String str12 = (i12 & 1) != 0 ? resolved.headerText : str;
            int i13 = (i12 & 2) != 0 ? resolved.headerColor : i7;
            int i14 = (i12 & 4) != 0 ? resolved.backgroundColor : i10;
            int i15 = (i12 & 8) != 0 ? resolved.thumbnailCornerRadius : i11;
            String str13 = (i12 & 16) != 0 ? resolved.headerLogoUrl : str2;
            String str14 = (i12 & 32) != 0 ? resolved.headerUrl : str3;
            String str15 = (i12 & 64) != 0 ? resolved.thumbnailUrl : str4;
            String str16 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? resolved.titleText : str5;
            Integer num7 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? resolved.titleColor : num;
            String str17 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? resolved.bodyText : str6;
            AnnotatedStructurableText annotatedStructurableText3 = (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? resolved.structuredBodyText : annotatedStructurableText;
            Integer num8 = (i12 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? resolved.bodyTextColor : num2;
            AnnotatedStructurableText annotatedStructurableText4 = (i12 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? resolved.linkButtonLabel : annotatedStructurableText2;
            Integer num9 = (i12 & 8192) != 0 ? resolved.linkButtonColor : num3;
            String str18 = str12;
            String str19 = (i12 & 16384) != 0 ? resolved.subText : str7;
            Integer num10 = (i12 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? resolved.subTextColor : num4;
            String str20 = (i12 & 65536) != 0 ? resolved.footerText : str8;
            Integer num11 = (i12 & 131072) != 0 ? resolved.footerTextColor : num5;
            String str21 = (i12 & 262144) != 0 ? resolved.acceptLabelText : str9;
            Integer num12 = (i12 & 524288) != 0 ? resolved.acceptLabelColor : num6;
            String str22 = (i12 & 1048576) != 0 ? resolved.acceptLabelIconUrl : str10;
            if ((i12 & 2097152) != 0) {
                str11 = str22;
                bool2 = resolved.canBeAccepted;
            } else {
                bool2 = bool;
                str11 = str22;
            }
            return resolved.copy(str18, i13, i14, i15, str13, str14, str15, str16, num7, str17, annotatedStructurableText3, num8, annotatedStructurableText4, num9, str19, num10, str20, num11, str21, num12, str11, bool2);
        }

        public static final /* synthetic */ void write$Self$chat_release(Resolved self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.getHeaderText());
            output.l(1, self.getHeaderColor(), serialDesc);
            output.l(2, self.getBackgroundColor(), serialDesc);
            output.l(3, self.getThumbnailCornerRadius(), serialDesc);
            s1 s1Var = s1.f17602a;
            output.r(serialDesc, 4, s1Var, self.getHeaderLogoUrl());
            if (output.u(serialDesc, 5) || self.headerUrl != null) {
                output.r(serialDesc, 5, s1Var, self.headerUrl);
            }
            if (output.u(serialDesc, 6) || self.thumbnailUrl != null) {
                output.r(serialDesc, 6, s1Var, self.thumbnailUrl);
            }
            if (output.u(serialDesc, 7) || self.titleText != null) {
                output.r(serialDesc, 7, s1Var, self.titleText);
            }
            if (output.u(serialDesc, 8) || self.titleColor != null) {
                output.r(serialDesc, 8, m0.f17573a, self.titleColor);
            }
            if (output.u(serialDesc, 9) || self.bodyText != null) {
                output.r(serialDesc, 9, s1Var, self.bodyText);
            }
            if (output.u(serialDesc, 10) || self.structuredBodyText != null) {
                output.r(serialDesc, 10, AnnotatedStructurableTextSerializer.INSTANCE, self.structuredBodyText);
            }
            if (output.u(serialDesc, 11) || self.bodyTextColor != null) {
                output.r(serialDesc, 11, m0.f17573a, self.bodyTextColor);
            }
            if (output.u(serialDesc, 12) || self.linkButtonLabel != null) {
                output.r(serialDesc, 12, AnnotatedStructurableTextSerializer.INSTANCE, self.linkButtonLabel);
            }
            if (output.u(serialDesc, 13) || self.linkButtonColor != null) {
                output.r(serialDesc, 13, m0.f17573a, self.linkButtonColor);
            }
            if (output.u(serialDesc, 14) || self.subText != null) {
                output.r(serialDesc, 14, s1Var, self.subText);
            }
            if (output.u(serialDesc, 15) || self.subTextColor != null) {
                output.r(serialDesc, 15, m0.f17573a, self.subTextColor);
            }
            if (output.u(serialDesc, 16) || self.footerText != null) {
                output.r(serialDesc, 16, s1Var, self.footerText);
            }
            if (output.u(serialDesc, 17) || self.footerTextColor != null) {
                output.r(serialDesc, 17, m0.f17573a, self.footerTextColor);
            }
            if (output.u(serialDesc, 18) || self.acceptLabelText != null) {
                output.r(serialDesc, 18, s1Var, self.acceptLabelText);
            }
            if (output.u(serialDesc, 19) || self.acceptLabelColor != null) {
                output.r(serialDesc, 19, m0.f17573a, self.acceptLabelColor);
            }
            if (output.u(serialDesc, 20) || self.acceptLabelIconUrl != null) {
                output.r(serialDesc, 20, s1Var, self.acceptLabelIconUrl);
            }
            if (!output.u(serialDesc, 21) && self.canBeAccepted == null) {
                return;
            }
            output.r(serialDesc, 21, g.f17537a, self.canBeAccepted);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getHeaderText() {
            return this.headerText;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getBodyText() {
            return this.bodyText;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final AnnotatedStructurableText getStructuredBodyText() {
            return this.structuredBodyText;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final Integer getBodyTextColor() {
            return this.bodyTextColor;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final AnnotatedStructurableText getLinkButtonLabel() {
            return this.linkButtonLabel;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final Integer getLinkButtonColor() {
            return this.linkButtonColor;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final String getSubText() {
            return this.subText;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final Integer getSubTextColor() {
            return this.subTextColor;
        }

        /* JADX INFO: renamed from: component17, reason: from getter */
        public final String getFooterText() {
            return this.footerText;
        }

        /* JADX INFO: renamed from: component18, reason: from getter */
        public final Integer getFooterTextColor() {
            return this.footerTextColor;
        }

        /* JADX INFO: renamed from: component19, reason: from getter */
        public final String getAcceptLabelText() {
            return this.acceptLabelText;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getHeaderColor() {
            return this.headerColor;
        }

        /* JADX INFO: renamed from: component20, reason: from getter */
        public final Integer getAcceptLabelColor() {
            return this.acceptLabelColor;
        }

        /* JADX INFO: renamed from: component21, reason: from getter */
        public final String getAcceptLabelIconUrl() {
            return this.acceptLabelIconUrl;
        }

        /* JADX INFO: renamed from: component22, reason: from getter */
        public final Boolean getCanBeAccepted() {
            return this.canBeAccepted;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getBackgroundColor() {
            return this.backgroundColor;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getThumbnailCornerRadius() {
            return this.thumbnailCornerRadius;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getHeaderLogoUrl() {
            return this.headerLogoUrl;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getHeaderUrl() {
            return this.headerUrl;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getTitleText() {
            return this.titleText;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Integer getTitleColor() {
            return this.titleColor;
        }

        @NotNull
        public final Resolved copy(@NotNull String headerText, int headerColor, int backgroundColor, int thumbnailCornerRadius, String headerLogoUrl, String headerUrl, String thumbnailUrl, String titleText, Integer titleColor, String bodyText, AnnotatedStructurableText structuredBodyText, Integer bodyTextColor, AnnotatedStructurableText linkButtonLabel, Integer linkButtonColor, String subText, Integer subTextColor, String footerText, Integer footerTextColor, String acceptLabelText, Integer acceptLabelColor, String acceptLabelIconUrl, Boolean canBeAccepted) {
            Intrinsics.checkNotNullParameter(headerText, "headerText");
            return new Resolved(headerText, headerColor, backgroundColor, thumbnailCornerRadius, headerLogoUrl, headerUrl, thumbnailUrl, titleText, titleColor, bodyText, structuredBodyText, bodyTextColor, linkButtonLabel, linkButtonColor, subText, subTextColor, footerText, footerTextColor, acceptLabelText, acceptLabelColor, acceptLabelIconUrl, canBeAccepted);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Resolved)) {
                return false;
            }
            Resolved resolved = (Resolved) other;
            return Intrinsics.areEqual(this.headerText, resolved.headerText) && this.headerColor == resolved.headerColor && this.backgroundColor == resolved.backgroundColor && this.thumbnailCornerRadius == resolved.thumbnailCornerRadius && Intrinsics.areEqual(this.headerLogoUrl, resolved.headerLogoUrl) && Intrinsics.areEqual(this.headerUrl, resolved.headerUrl) && Intrinsics.areEqual(this.thumbnailUrl, resolved.thumbnailUrl) && Intrinsics.areEqual(this.titleText, resolved.titleText) && Intrinsics.areEqual(this.titleColor, resolved.titleColor) && Intrinsics.areEqual(this.bodyText, resolved.bodyText) && Intrinsics.areEqual(this.structuredBodyText, resolved.structuredBodyText) && Intrinsics.areEqual(this.bodyTextColor, resolved.bodyTextColor) && Intrinsics.areEqual(this.linkButtonLabel, resolved.linkButtonLabel) && Intrinsics.areEqual(this.linkButtonColor, resolved.linkButtonColor) && Intrinsics.areEqual(this.subText, resolved.subText) && Intrinsics.areEqual(this.subTextColor, resolved.subTextColor) && Intrinsics.areEqual(this.footerText, resolved.footerText) && Intrinsics.areEqual(this.footerTextColor, resolved.footerTextColor) && Intrinsics.areEqual(this.acceptLabelText, resolved.acceptLabelText) && Intrinsics.areEqual(this.acceptLabelColor, resolved.acceptLabelColor) && Intrinsics.areEqual(this.acceptLabelIconUrl, resolved.acceptLabelIconUrl) && Intrinsics.areEqual(this.canBeAccepted, resolved.canBeAccepted);
        }

        public final Integer getAcceptLabelColor() {
            return this.acceptLabelColor;
        }

        public final String getAcceptLabelIconUrl() {
            return this.acceptLabelIconUrl;
        }

        public final String getAcceptLabelText() {
            return this.acceptLabelText;
        }

        @Override // com.discord.chat.bridge.referral.ReferralEmbed
        public int getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getBodyText() {
            return this.bodyText;
        }

        public final Integer getBodyTextColor() {
            return this.bodyTextColor;
        }

        public final Boolean getCanBeAccepted() {
            return this.canBeAccepted;
        }

        public final String getFooterText() {
            return this.footerText;
        }

        public final Integer getFooterTextColor() {
            return this.footerTextColor;
        }

        @Override // com.discord.chat.bridge.referral.ReferralEmbed
        public int getHeaderColor() {
            return this.headerColor;
        }

        @Override // com.discord.chat.bridge.referral.ReferralEmbed
        public String getHeaderLogoUrl() {
            return this.headerLogoUrl;
        }

        @Override // com.discord.chat.bridge.referral.ReferralEmbed
        @NotNull
        public String getHeaderText() {
            return this.headerText;
        }

        public final String getHeaderUrl() {
            return this.headerUrl;
        }

        public final Integer getLinkButtonColor() {
            return this.linkButtonColor;
        }

        public final AnnotatedStructurableText getLinkButtonLabel() {
            return this.linkButtonLabel;
        }

        public final AnnotatedStructurableText getStructuredBodyText() {
            return this.structuredBodyText;
        }

        public final String getSubText() {
            return this.subText;
        }

        public final Integer getSubTextColor() {
            return this.subTextColor;
        }

        @Override // com.discord.chat.bridge.referral.ReferralEmbed
        public int getThumbnailCornerRadius() {
            return this.thumbnailCornerRadius;
        }

        public final String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        public final Integer getTitleColor() {
            return this.titleColor;
        }

        public final String getTitleText() {
            return this.titleText;
        }

        public int hashCode() {
            int iU = a.u(this.thumbnailCornerRadius, a.u(this.backgroundColor, a.u(this.headerColor, this.headerText.hashCode() * 31, 31), 31), 31);
            String str = this.headerLogoUrl;
            int iHashCode = (iU + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.headerUrl;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.thumbnailUrl;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.titleText;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.titleColor;
            int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            String str5 = this.bodyText;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            AnnotatedStructurableText annotatedStructurableText = this.structuredBodyText;
            int iHashCode7 = (iHashCode6 + (annotatedStructurableText == null ? 0 : annotatedStructurableText.hashCode())) * 31;
            Integer num2 = this.bodyTextColor;
            int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
            AnnotatedStructurableText annotatedStructurableText2 = this.linkButtonLabel;
            int iHashCode9 = (iHashCode8 + (annotatedStructurableText2 == null ? 0 : annotatedStructurableText2.hashCode())) * 31;
            Integer num3 = this.linkButtonColor;
            int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str6 = this.subText;
            int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Integer num4 = this.subTextColor;
            int iHashCode12 = (iHashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
            String str7 = this.footerText;
            int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Integer num5 = this.footerTextColor;
            int iHashCode14 = (iHashCode13 + (num5 == null ? 0 : num5.hashCode())) * 31;
            String str8 = this.acceptLabelText;
            int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
            Integer num6 = this.acceptLabelColor;
            int iHashCode16 = (iHashCode15 + (num6 == null ? 0 : num6.hashCode())) * 31;
            String str9 = this.acceptLabelIconUrl;
            int iHashCode17 = (iHashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Boolean bool = this.canBeAccepted;
            return iHashCode17 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.headerText;
            int i7 = this.headerColor;
            int i10 = this.backgroundColor;
            int i11 = this.thumbnailCornerRadius;
            String str2 = this.headerLogoUrl;
            String str3 = this.headerUrl;
            String str4 = this.thumbnailUrl;
            String str5 = this.titleText;
            Integer num = this.titleColor;
            String str6 = this.bodyText;
            AnnotatedStructurableText annotatedStructurableText = this.structuredBodyText;
            Integer num2 = this.bodyTextColor;
            AnnotatedStructurableText annotatedStructurableText2 = this.linkButtonLabel;
            Integer num3 = this.linkButtonColor;
            String str7 = this.subText;
            Integer num4 = this.subTextColor;
            String str8 = this.footerText;
            Integer num5 = this.footerTextColor;
            String str9 = this.acceptLabelText;
            Integer num6 = this.acceptLabelColor;
            String str10 = this.acceptLabelIconUrl;
            Boolean bool = this.canBeAccepted;
            StringBuilder sbT = e.t("Resolved(headerText=", str, ", headerColor=", i7, ", backgroundColor=");
            e.z(sbT, i10, ", thumbnailCornerRadius=", i11, ", headerLogoUrl=");
            e.A(sbT, str2, ", headerUrl=", str3, ", thumbnailUrl=");
            e.A(sbT, str4, ", titleText=", str5, ", titleColor=");
            b.r(num, ", bodyText=", str6, ", structuredBodyText=", sbT);
            sbT.append(annotatedStructurableText);
            sbT.append(", bodyTextColor=");
            sbT.append(num2);
            sbT.append(", linkButtonLabel=");
            sbT.append(annotatedStructurableText2);
            sbT.append(", linkButtonColor=");
            sbT.append(num3);
            sbT.append(", subText=");
            a.r(num4, str7, ", subTextColor=", ", footerText=", sbT);
            a.r(num5, str8, ", footerTextColor=", ", acceptLabelText=", sbT);
            a.r(num6, str9, ", acceptLabelColor=", ", acceptLabelIconUrl=", sbT);
            sbT.append(str10);
            sbT.append(", canBeAccepted=");
            sbT.append(bool);
            sbT.append(")");
            return sbT.toString();
        }

        public Resolved(@NotNull String headerText, int i7, int i10, int i11, String str, String str2, String str3, String str4, Integer num, String str5, AnnotatedStructurableText annotatedStructurableText, Integer num2, AnnotatedStructurableText annotatedStructurableText2, Integer num3, String str6, Integer num4, String str7, Integer num5, String str8, Integer num6, String str9, Boolean bool) {
            Intrinsics.checkNotNullParameter(headerText, "headerText");
            this.headerText = headerText;
            this.headerColor = i7;
            this.backgroundColor = i10;
            this.thumbnailCornerRadius = i11;
            this.headerLogoUrl = str;
            this.headerUrl = str2;
            this.thumbnailUrl = str3;
            this.titleText = str4;
            this.titleColor = num;
            this.bodyText = str5;
            this.structuredBodyText = annotatedStructurableText;
            this.bodyTextColor = num2;
            this.linkButtonLabel = annotatedStructurableText2;
            this.linkButtonColor = num3;
            this.subText = str6;
            this.subTextColor = num4;
            this.footerText = str7;
            this.footerTextColor = num5;
            this.acceptLabelText = str8;
            this.acceptLabelColor = num6;
            this.acceptLabelIconUrl = str9;
            this.canBeAccepted = bool;
        }

        public /* synthetic */ Resolved(String str, int i7, int i10, int i11, String str2, String str3, String str4, String str5, Integer num, String str6, AnnotatedStructurableText annotatedStructurableText, Integer num2, AnnotatedStructurableText annotatedStructurableText2, Integer num3, String str7, Integer num4, String str8, Integer num5, String str9, Integer num6, String str10, Boolean bool, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i7, i10, i11, str2, (i12 & 32) != 0 ? null : str3, (i12 & 64) != 0 ? null : str4, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : str5, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : num, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : str6, (i12 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : annotatedStructurableText, (i12 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : num2, (i12 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : annotatedStructurableText2, (i12 & 8192) != 0 ? null : num3, (i12 & 16384) != 0 ? null : str7, (32768 & i12) != 0 ? null : num4, (65536 & i12) != 0 ? null : str8, (131072 & i12) != 0 ? null : num5, (262144 & i12) != 0 ? null : str9, (524288 & i12) != 0 ? null : num6, (1048576 & i12) != 0 ? null : str10, (i12 & 2097152) != 0 ? null : bool);
        }
    }

    @f
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000201BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0010J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003JQ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J%\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014¨\u00062"}, d2 = {"Lcom/discord/chat/bridge/referral/ReferralEmbed$Resolving;", "Lcom/discord/chat/bridge/referral/ReferralEmbed;", "headerText", "", "headerColor", "", ViewProps.BACKGROUND_COLOR, "thumbnailCornerRadius", "headerLogoUrl", "resolvingGradientStart", "resolvingGradientEnd", "<init>", "(Ljava/lang/String;IIILjava/lang/String;II)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;IIILjava/lang/String;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getHeaderText", "()Ljava/lang/String;", "getHeaderColor", "()I", "getBackgroundColor", "getThumbnailCornerRadius", "getHeaderLogoUrl", "getResolvingGradientStart", "getResolvingGradientEnd", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Resolving implements ReferralEmbed {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final int backgroundColor;
        private final int headerColor;
        private final String headerLogoUrl;

        @NotNull
        private final String headerText;
        private final int resolvingGradientEnd;
        private final int resolvingGradientStart;
        private final int thumbnailCornerRadius;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/referral/ReferralEmbed$Resolving$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/referral/ReferralEmbed$Resolving;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return ReferralEmbed$Resolving$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Resolving(int i7, String str, int i10, int i11, int i12, String str2, int i13, int i14, SerializationConstructorMarker serializationConstructorMarker) {
            if (127 != (i7 & 127)) {
                e1.l(i7, 127, ReferralEmbed$Resolving$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.headerText = str;
            this.headerColor = i10;
            this.backgroundColor = i11;
            this.thumbnailCornerRadius = i12;
            this.headerLogoUrl = str2;
            this.resolvingGradientStart = i13;
            this.resolvingGradientEnd = i14;
        }

        public static /* synthetic */ Resolving copy$default(Resolving resolving, String str, int i7, int i10, int i11, String str2, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                str = resolving.headerText;
            }
            if ((i14 & 2) != 0) {
                i7 = resolving.headerColor;
            }
            if ((i14 & 4) != 0) {
                i10 = resolving.backgroundColor;
            }
            if ((i14 & 8) != 0) {
                i11 = resolving.thumbnailCornerRadius;
            }
            if ((i14 & 16) != 0) {
                str2 = resolving.headerLogoUrl;
            }
            if ((i14 & 32) != 0) {
                i12 = resolving.resolvingGradientStart;
            }
            if ((i14 & 64) != 0) {
                i13 = resolving.resolvingGradientEnd;
            }
            int i15 = i12;
            int i16 = i13;
            String str3 = str2;
            int i17 = i10;
            return resolving.copy(str, i7, i17, i11, str3, i15, i16);
        }

        public static final /* synthetic */ void write$Self$chat_release(Resolving self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.getHeaderText());
            output.l(1, self.getHeaderColor(), serialDesc);
            output.l(2, self.getBackgroundColor(), serialDesc);
            output.l(3, self.getThumbnailCornerRadius(), serialDesc);
            output.r(serialDesc, 4, s1.f17602a, self.getHeaderLogoUrl());
            output.l(5, self.resolvingGradientStart, serialDesc);
            output.l(6, self.resolvingGradientEnd, serialDesc);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getHeaderText() {
            return this.headerText;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getHeaderColor() {
            return this.headerColor;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getBackgroundColor() {
            return this.backgroundColor;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getThumbnailCornerRadius() {
            return this.thumbnailCornerRadius;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getHeaderLogoUrl() {
            return this.headerLogoUrl;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getResolvingGradientStart() {
            return this.resolvingGradientStart;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final int getResolvingGradientEnd() {
            return this.resolvingGradientEnd;
        }

        @NotNull
        public final Resolving copy(@NotNull String headerText, int headerColor, int backgroundColor, int thumbnailCornerRadius, String headerLogoUrl, int resolvingGradientStart, int resolvingGradientEnd) {
            Intrinsics.checkNotNullParameter(headerText, "headerText");
            return new Resolving(headerText, headerColor, backgroundColor, thumbnailCornerRadius, headerLogoUrl, resolvingGradientStart, resolvingGradientEnd);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Resolving)) {
                return false;
            }
            Resolving resolving = (Resolving) other;
            return Intrinsics.areEqual(this.headerText, resolving.headerText) && this.headerColor == resolving.headerColor && this.backgroundColor == resolving.backgroundColor && this.thumbnailCornerRadius == resolving.thumbnailCornerRadius && Intrinsics.areEqual(this.headerLogoUrl, resolving.headerLogoUrl) && this.resolvingGradientStart == resolving.resolvingGradientStart && this.resolvingGradientEnd == resolving.resolvingGradientEnd;
        }

        @Override // com.discord.chat.bridge.referral.ReferralEmbed
        public int getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.discord.chat.bridge.referral.ReferralEmbed
        public int getHeaderColor() {
            return this.headerColor;
        }

        @Override // com.discord.chat.bridge.referral.ReferralEmbed
        public String getHeaderLogoUrl() {
            return this.headerLogoUrl;
        }

        @Override // com.discord.chat.bridge.referral.ReferralEmbed
        @NotNull
        public String getHeaderText() {
            return this.headerText;
        }

        public final int getResolvingGradientEnd() {
            return this.resolvingGradientEnd;
        }

        public final int getResolvingGradientStart() {
            return this.resolvingGradientStart;
        }

        @Override // com.discord.chat.bridge.referral.ReferralEmbed
        public int getThumbnailCornerRadius() {
            return this.thumbnailCornerRadius;
        }

        public int hashCode() {
            int iU = a.u(this.thumbnailCornerRadius, a.u(this.backgroundColor, a.u(this.headerColor, this.headerText.hashCode() * 31, 31), 31), 31);
            String str = this.headerLogoUrl;
            return Integer.hashCode(this.resolvingGradientEnd) + a.u(this.resolvingGradientStart, (iU + (str == null ? 0 : str.hashCode())) * 31, 31);
        }

        @NotNull
        public String toString() {
            String str = this.headerText;
            int i7 = this.headerColor;
            int i10 = this.backgroundColor;
            int i11 = this.thumbnailCornerRadius;
            String str2 = this.headerLogoUrl;
            int i12 = this.resolvingGradientStart;
            int i13 = this.resolvingGradientEnd;
            StringBuilder sbT = e.t("Resolving(headerText=", str, ", headerColor=", i7, ", backgroundColor=");
            e.z(sbT, i10, ", thumbnailCornerRadius=", i11, ", headerLogoUrl=");
            sbT.append(str2);
            sbT.append(", resolvingGradientStart=");
            sbT.append(i12);
            sbT.append(", resolvingGradientEnd=");
            return b.l(sbT, i13, ")");
        }

        public Resolving(@NotNull String headerText, int i7, int i10, int i11, String str, int i12, int i13) {
            Intrinsics.checkNotNullParameter(headerText, "headerText");
            this.headerText = headerText;
            this.headerColor = i7;
            this.backgroundColor = i10;
            this.thumbnailCornerRadius = i11;
            this.headerLogoUrl = str;
            this.resolvingGradientStart = i12;
            this.resolvingGradientEnd = i13;
        }
    }

    int getBackgroundColor();

    int getHeaderColor();

    String getHeaderLogoUrl();

    @NotNull
    String getHeaderText();

    int getThumbnailCornerRadius();
}
