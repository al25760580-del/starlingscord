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
import or.g;
import or.m0;
import or.s1;
import org.jetbrains.annotations.NotNull;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 Z2\u00020\u0001:\u0002YZBå\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0019\u0010\u001aBÙ\u0001\b\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001eJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\"J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u00105J\u000b\u0010J\u001a\u0004\u0018\u00010\rHÆ\u0003Jì\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010LJ\u0013\u0010M\u001a\u00020\u00172\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010O\u001a\u00020\u0005HÖ\u0001J\t\u0010P\u001a\u00020\u0003HÖ\u0001J%\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020\u00002\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020WH\u0001¢\u0006\u0002\bXR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010#\u001a\u0004\b&\u0010\"R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010#\u001a\u0004\b'\u0010\"R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010#\u001a\u0004\b(\u0010\"R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010#\u001a\u0004\b,\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010#\u001a\u0004\b.\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010#\u001a\u0004\b0\u0010\"R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010#\u001a\u0004\b2\u0010\"R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b7\u0010+¨\u0006["}, d2 = {"Lcom/discord/chat/bridge/referral/ReferralEmbedRedesign;", "", "titleText", "", "titleColor", "", "headerImageUrl", "headerText", "headerColor", ViewProps.BACKGROUND_COLOR, ViewProps.BORDER_COLOR, "bodyText", "structuredBodyText", "Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;", "bodyTextColor", "subText", "subTextColor", "footerText", "footerTextColor", "acceptLabelText", "acceptLabelColor", "acceptLabelIconUrl", "canBeAccepted", "", "learnMoreLink", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTitleText", "()Ljava/lang/String;", "getTitleColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeaderImageUrl", "getHeaderText", "getHeaderColor", "getBackgroundColor", "getBorderColor", "getBodyText", "getStructuredBodyText", "()Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;", "getBodyTextColor", "getSubText", "getSubTextColor", "getFooterText", "getFooterTextColor", "getAcceptLabelText", "getAcceptLabelColor", "getAcceptLabelIconUrl", "getCanBeAccepted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLearnMoreLink", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;)Lcom/discord/chat/bridge/referral/ReferralEmbedRedesign;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ReferralEmbedRedesign {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final Integer acceptLabelColor;
    private final String acceptLabelIconUrl;
    private final String acceptLabelText;
    private final Integer backgroundColor;
    private final String bodyText;
    private final Integer bodyTextColor;
    private final Integer borderColor;
    private final Boolean canBeAccepted;
    private final String footerText;
    private final Integer footerTextColor;
    private final Integer headerColor;

    @NotNull
    private final String headerImageUrl;

    @NotNull
    private final String headerText;
    private final AnnotatedStructurableText learnMoreLink;
    private final AnnotatedStructurableText structuredBodyText;
    private final String subText;
    private final Integer subTextColor;
    private final Integer titleColor;

    @NotNull
    private final String titleText;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/referral/ReferralEmbedRedesign$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/referral/ReferralEmbedRedesign;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return ReferralEmbedRedesign$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ReferralEmbedRedesign() {
        this((String) null, (Integer) null, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (AnnotatedStructurableText) null, (Integer) null, (String) null, (Integer) null, (String) null, (Integer) null, (String) null, (Integer) null, (String) null, (Boolean) null, (AnnotatedStructurableText) null, 524287, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ReferralEmbedRedesign copy$default(ReferralEmbedRedesign referralEmbedRedesign, String str, Integer num, String str2, String str3, Integer num2, Integer num3, Integer num4, String str4, AnnotatedStructurableText annotatedStructurableText, Integer num5, String str5, Integer num6, String str6, Integer num7, String str7, Integer num8, String str8, Boolean bool, AnnotatedStructurableText annotatedStructurableText2, int i7, Object obj) {
        AnnotatedStructurableText annotatedStructurableText3;
        Boolean bool2;
        String str9 = (i7 & 1) != 0 ? referralEmbedRedesign.titleText : str;
        Integer num9 = (i7 & 2) != 0 ? referralEmbedRedesign.titleColor : num;
        String str10 = (i7 & 4) != 0 ? referralEmbedRedesign.headerImageUrl : str2;
        String str11 = (i7 & 8) != 0 ? referralEmbedRedesign.headerText : str3;
        Integer num10 = (i7 & 16) != 0 ? referralEmbedRedesign.headerColor : num2;
        Integer num11 = (i7 & 32) != 0 ? referralEmbedRedesign.backgroundColor : num3;
        Integer num12 = (i7 & 64) != 0 ? referralEmbedRedesign.borderColor : num4;
        String str12 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? referralEmbedRedesign.bodyText : str4;
        AnnotatedStructurableText annotatedStructurableText4 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? referralEmbedRedesign.structuredBodyText : annotatedStructurableText;
        Integer num13 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? referralEmbedRedesign.bodyTextColor : num5;
        String str13 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? referralEmbedRedesign.subText : str5;
        Integer num14 = (i7 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? referralEmbedRedesign.subTextColor : num6;
        String str14 = (i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? referralEmbedRedesign.footerText : str6;
        Integer num15 = (i7 & 8192) != 0 ? referralEmbedRedesign.footerTextColor : num7;
        String str15 = str9;
        String str16 = (i7 & 16384) != 0 ? referralEmbedRedesign.acceptLabelText : str7;
        Integer num16 = (i7 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? referralEmbedRedesign.acceptLabelColor : num8;
        String str17 = (i7 & 65536) != 0 ? referralEmbedRedesign.acceptLabelIconUrl : str8;
        Boolean bool3 = (i7 & 131072) != 0 ? referralEmbedRedesign.canBeAccepted : bool;
        if ((i7 & 262144) != 0) {
            bool2 = bool3;
            annotatedStructurableText3 = referralEmbedRedesign.learnMoreLink;
        } else {
            annotatedStructurableText3 = annotatedStructurableText2;
            bool2 = bool3;
        }
        return referralEmbedRedesign.copy(str15, num9, str10, str11, num10, num11, num12, str12, annotatedStructurableText4, num13, str13, num14, str14, num15, str16, num16, str17, bool2, annotatedStructurableText3);
    }

    public static final /* synthetic */ void write$Self$chat_release(ReferralEmbedRedesign self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.u(serialDesc, 0) || !Intrinsics.areEqual(self.titleText, "")) {
            output.q(serialDesc, 0, self.titleText);
        }
        if (output.u(serialDesc, 1) || self.titleColor != null) {
            output.r(serialDesc, 1, m0.f17573a, self.titleColor);
        }
        if (output.u(serialDesc, 2) || !Intrinsics.areEqual(self.headerImageUrl, "")) {
            output.q(serialDesc, 2, self.headerImageUrl);
        }
        if (output.u(serialDesc, 3) || !Intrinsics.areEqual(self.headerText, "")) {
            output.q(serialDesc, 3, self.headerText);
        }
        if (output.u(serialDesc, 4) || self.headerColor != null) {
            output.r(serialDesc, 4, m0.f17573a, self.headerColor);
        }
        if (output.u(serialDesc, 5) || self.backgroundColor != null) {
            output.r(serialDesc, 5, m0.f17573a, self.backgroundColor);
        }
        if (output.u(serialDesc, 6) || self.borderColor != null) {
            output.r(serialDesc, 6, m0.f17573a, self.borderColor);
        }
        if (output.u(serialDesc, 7) || self.bodyText != null) {
            output.r(serialDesc, 7, s1.f17602a, self.bodyText);
        }
        if (output.u(serialDesc, 8) || self.structuredBodyText != null) {
            output.r(serialDesc, 8, AnnotatedStructurableTextSerializer.INSTANCE, self.structuredBodyText);
        }
        if (output.u(serialDesc, 9) || self.bodyTextColor != null) {
            output.r(serialDesc, 9, m0.f17573a, self.bodyTextColor);
        }
        if (output.u(serialDesc, 10) || self.subText != null) {
            output.r(serialDesc, 10, s1.f17602a, self.subText);
        }
        if (output.u(serialDesc, 11) || self.subTextColor != null) {
            output.r(serialDesc, 11, m0.f17573a, self.subTextColor);
        }
        if (output.u(serialDesc, 12) || self.footerText != null) {
            output.r(serialDesc, 12, s1.f17602a, self.footerText);
        }
        if (output.u(serialDesc, 13) || self.footerTextColor != null) {
            output.r(serialDesc, 13, m0.f17573a, self.footerTextColor);
        }
        if (output.u(serialDesc, 14) || self.acceptLabelText != null) {
            output.r(serialDesc, 14, s1.f17602a, self.acceptLabelText);
        }
        if (output.u(serialDesc, 15) || self.acceptLabelColor != null) {
            output.r(serialDesc, 15, m0.f17573a, self.acceptLabelColor);
        }
        if (output.u(serialDesc, 16) || self.acceptLabelIconUrl != null) {
            output.r(serialDesc, 16, s1.f17602a, self.acceptLabelIconUrl);
        }
        if (output.u(serialDesc, 17) || self.canBeAccepted != null) {
            output.r(serialDesc, 17, g.f17537a, self.canBeAccepted);
        }
        if (!output.u(serialDesc, 18) && self.learnMoreLink == null) {
            return;
        }
        output.r(serialDesc, 18, AnnotatedStructurableTextSerializer.INSTANCE, self.learnMoreLink);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleText() {
        return this.titleText;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getBodyTextColor() {
        return this.bodyTextColor;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSubText() {
        return this.subText;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getSubTextColor() {
        return this.subTextColor;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getFooterText() {
        return this.footerText;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getFooterTextColor() {
        return this.footerTextColor;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getAcceptLabelText() {
        return this.acceptLabelText;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getAcceptLabelColor() {
        return this.acceptLabelColor;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getAcceptLabelIconUrl() {
        return this.acceptLabelIconUrl;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getCanBeAccepted() {
        return this.canBeAccepted;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final AnnotatedStructurableText getLearnMoreLink() {
        return this.learnMoreLink;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getTitleColor() {
        return this.titleColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getHeaderColor() {
        return this.headerColor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getBorderColor() {
        return this.borderColor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBodyText() {
        return this.bodyText;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final AnnotatedStructurableText getStructuredBodyText() {
        return this.structuredBodyText;
    }

    @NotNull
    public final ReferralEmbedRedesign copy(@NotNull String titleText, Integer titleColor, @NotNull String headerImageUrl, @NotNull String headerText, Integer headerColor, Integer backgroundColor, Integer borderColor, String bodyText, AnnotatedStructurableText structuredBodyText, Integer bodyTextColor, String subText, Integer subTextColor, String footerText, Integer footerTextColor, String acceptLabelText, Integer acceptLabelColor, String acceptLabelIconUrl, Boolean canBeAccepted, AnnotatedStructurableText learnMoreLink) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(headerImageUrl, "headerImageUrl");
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        return new ReferralEmbedRedesign(titleText, titleColor, headerImageUrl, headerText, headerColor, backgroundColor, borderColor, bodyText, structuredBodyText, bodyTextColor, subText, subTextColor, footerText, footerTextColor, acceptLabelText, acceptLabelColor, acceptLabelIconUrl, canBeAccepted, learnMoreLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferralEmbedRedesign)) {
            return false;
        }
        ReferralEmbedRedesign referralEmbedRedesign = (ReferralEmbedRedesign) other;
        return Intrinsics.areEqual(this.titleText, referralEmbedRedesign.titleText) && Intrinsics.areEqual(this.titleColor, referralEmbedRedesign.titleColor) && Intrinsics.areEqual(this.headerImageUrl, referralEmbedRedesign.headerImageUrl) && Intrinsics.areEqual(this.headerText, referralEmbedRedesign.headerText) && Intrinsics.areEqual(this.headerColor, referralEmbedRedesign.headerColor) && Intrinsics.areEqual(this.backgroundColor, referralEmbedRedesign.backgroundColor) && Intrinsics.areEqual(this.borderColor, referralEmbedRedesign.borderColor) && Intrinsics.areEqual(this.bodyText, referralEmbedRedesign.bodyText) && Intrinsics.areEqual(this.structuredBodyText, referralEmbedRedesign.structuredBodyText) && Intrinsics.areEqual(this.bodyTextColor, referralEmbedRedesign.bodyTextColor) && Intrinsics.areEqual(this.subText, referralEmbedRedesign.subText) && Intrinsics.areEqual(this.subTextColor, referralEmbedRedesign.subTextColor) && Intrinsics.areEqual(this.footerText, referralEmbedRedesign.footerText) && Intrinsics.areEqual(this.footerTextColor, referralEmbedRedesign.footerTextColor) && Intrinsics.areEqual(this.acceptLabelText, referralEmbedRedesign.acceptLabelText) && Intrinsics.areEqual(this.acceptLabelColor, referralEmbedRedesign.acceptLabelColor) && Intrinsics.areEqual(this.acceptLabelIconUrl, referralEmbedRedesign.acceptLabelIconUrl) && Intrinsics.areEqual(this.canBeAccepted, referralEmbedRedesign.canBeAccepted) && Intrinsics.areEqual(this.learnMoreLink, referralEmbedRedesign.learnMoreLink);
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

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBodyText() {
        return this.bodyText;
    }

    public final Integer getBodyTextColor() {
        return this.bodyTextColor;
    }

    public final Integer getBorderColor() {
        return this.borderColor;
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

    public final Integer getHeaderColor() {
        return this.headerColor;
    }

    @NotNull
    public final String getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    @NotNull
    public final String getHeaderText() {
        return this.headerText;
    }

    public final AnnotatedStructurableText getLearnMoreLink() {
        return this.learnMoreLink;
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

    public final Integer getTitleColor() {
        return this.titleColor;
    }

    @NotNull
    public final String getTitleText() {
        return this.titleText;
    }

    public int hashCode() {
        int iHashCode = this.titleText.hashCode() * 31;
        Integer num = this.titleColor;
        int iD = e.d(e.d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.headerImageUrl), 31, this.headerText);
        Integer num2 = this.headerColor;
        int iHashCode2 = (iD + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.borderColor;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.bodyText;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        AnnotatedStructurableText annotatedStructurableText = this.structuredBodyText;
        int iHashCode6 = (iHashCode5 + (annotatedStructurableText == null ? 0 : annotatedStructurableText.hashCode())) * 31;
        Integer num5 = this.bodyTextColor;
        int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str2 = this.subText;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num6 = this.subTextColor;
        int iHashCode9 = (iHashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str3 = this.footerText;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num7 = this.footerTextColor;
        int iHashCode11 = (iHashCode10 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str4 = this.acceptLabelText;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num8 = this.acceptLabelColor;
        int iHashCode13 = (iHashCode12 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str5 = this.acceptLabelIconUrl;
        int iHashCode14 = (iHashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.canBeAccepted;
        int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        AnnotatedStructurableText annotatedStructurableText2 = this.learnMoreLink;
        return iHashCode15 + (annotatedStructurableText2 != null ? annotatedStructurableText2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.titleText;
        Integer num = this.titleColor;
        String str2 = this.headerImageUrl;
        String str3 = this.headerText;
        Integer num2 = this.headerColor;
        Integer num3 = this.backgroundColor;
        Integer num4 = this.borderColor;
        String str4 = this.bodyText;
        AnnotatedStructurableText annotatedStructurableText = this.structuredBodyText;
        Integer num5 = this.bodyTextColor;
        String str5 = this.subText;
        Integer num6 = this.subTextColor;
        String str6 = this.footerText;
        Integer num7 = this.footerTextColor;
        String str7 = this.acceptLabelText;
        Integer num8 = this.acceptLabelColor;
        String str8 = this.acceptLabelIconUrl;
        Boolean bool = this.canBeAccepted;
        AnnotatedStructurableText annotatedStructurableText2 = this.learnMoreLink;
        StringBuilder sb2 = new StringBuilder("ReferralEmbedRedesign(titleText=");
        sb2.append(str);
        sb2.append(", titleColor=");
        sb2.append(num);
        sb2.append(", headerImageUrl=");
        e.A(sb2, str2, ", headerText=", str3, ", headerColor=");
        b.s(sb2, num2, ", backgroundColor=", num3, ", borderColor=");
        b.r(num4, ", bodyText=", str4, ", structuredBodyText=", sb2);
        sb2.append(annotatedStructurableText);
        sb2.append(", bodyTextColor=");
        sb2.append(num5);
        sb2.append(", subText=");
        a.r(num6, str5, ", subTextColor=", ", footerText=", sb2);
        a.r(num7, str6, ", footerTextColor=", ", acceptLabelText=", sb2);
        a.r(num8, str7, ", acceptLabelColor=", ", acceptLabelIconUrl=", sb2);
        sb2.append(str8);
        sb2.append(", canBeAccepted=");
        sb2.append(bool);
        sb2.append(", learnMoreLink=");
        sb2.append(annotatedStructurableText2);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ ReferralEmbedRedesign(int i7, String str, Integer num, String str2, String str3, Integer num2, Integer num3, Integer num4, String str4, AnnotatedStructurableText annotatedStructurableText, Integer num5, String str5, Integer num6, String str6, Integer num7, String str7, Integer num8, String str8, Boolean bool, AnnotatedStructurableText annotatedStructurableText2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i7 & 1) == 0) {
            this.titleText = "";
        } else {
            this.titleText = str;
        }
        if ((i7 & 2) == 0) {
            this.titleColor = null;
        } else {
            this.titleColor = num;
        }
        if ((i7 & 4) == 0) {
            this.headerImageUrl = "";
        } else {
            this.headerImageUrl = str2;
        }
        if ((i7 & 8) == 0) {
            this.headerText = "";
        } else {
            this.headerText = str3;
        }
        if ((i7 & 16) == 0) {
            this.headerColor = null;
        } else {
            this.headerColor = num2;
        }
        if ((i7 & 32) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = num3;
        }
        if ((i7 & 64) == 0) {
            this.borderColor = null;
        } else {
            this.borderColor = num4;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.bodyText = null;
        } else {
            this.bodyText = str4;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.structuredBodyText = null;
        } else {
            this.structuredBodyText = annotatedStructurableText;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.bodyTextColor = null;
        } else {
            this.bodyTextColor = num5;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 0) {
            this.subText = null;
        } else {
            this.subText = str5;
        }
        if ((i7 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.subTextColor = null;
        } else {
            this.subTextColor = num6;
        }
        if ((i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0) {
            this.footerText = null;
        } else {
            this.footerText = str6;
        }
        if ((i7 & 8192) == 0) {
            this.footerTextColor = null;
        } else {
            this.footerTextColor = num7;
        }
        if ((i7 & 16384) == 0) {
            this.acceptLabelText = null;
        } else {
            this.acceptLabelText = str7;
        }
        if ((32768 & i7) == 0) {
            this.acceptLabelColor = null;
        } else {
            this.acceptLabelColor = num8;
        }
        if ((65536 & i7) == 0) {
            this.acceptLabelIconUrl = null;
        } else {
            this.acceptLabelIconUrl = str8;
        }
        if ((131072 & i7) == 0) {
            this.canBeAccepted = null;
        } else {
            this.canBeAccepted = bool;
        }
        if ((i7 & 262144) == 0) {
            this.learnMoreLink = null;
        } else {
            this.learnMoreLink = annotatedStructurableText2;
        }
    }

    public ReferralEmbedRedesign(@NotNull String titleText, Integer num, @NotNull String headerImageUrl, @NotNull String headerText, Integer num2, Integer num3, Integer num4, String str, AnnotatedStructurableText annotatedStructurableText, Integer num5, String str2, Integer num6, String str3, Integer num7, String str4, Integer num8, String str5, Boolean bool, AnnotatedStructurableText annotatedStructurableText2) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(headerImageUrl, "headerImageUrl");
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        this.titleText = titleText;
        this.titleColor = num;
        this.headerImageUrl = headerImageUrl;
        this.headerText = headerText;
        this.headerColor = num2;
        this.backgroundColor = num3;
        this.borderColor = num4;
        this.bodyText = str;
        this.structuredBodyText = annotatedStructurableText;
        this.bodyTextColor = num5;
        this.subText = str2;
        this.subTextColor = num6;
        this.footerText = str3;
        this.footerTextColor = num7;
        this.acceptLabelText = str4;
        this.acceptLabelColor = num8;
        this.acceptLabelIconUrl = str5;
        this.canBeAccepted = bool;
        this.learnMoreLink = annotatedStructurableText2;
    }

    public /* synthetic */ ReferralEmbedRedesign(String str, Integer num, String str2, String str3, Integer num2, Integer num3, Integer num4, String str4, AnnotatedStructurableText annotatedStructurableText, Integer num5, String str5, Integer num6, String str6, Integer num7, String str7, Integer num8, String str8, Boolean bool, AnnotatedStructurableText annotatedStructurableText2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? null : num, (i7 & 4) != 0 ? "" : str2, (i7 & 8) == 0 ? str3 : "", (i7 & 16) != 0 ? null : num2, (i7 & 32) != 0 ? null : num3, (i7 & 64) != 0 ? null : num4, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : str4, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : annotatedStructurableText, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : num5, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : str5, (i7 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : num6, (i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str6, (i7 & 8192) != 0 ? null : num7, (i7 & 16384) != 0 ? null : str7, (i7 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? null : num8, (i7 & 65536) != 0 ? null : str8, (i7 & 131072) != 0 ? null : bool, (i7 & 262144) != 0 ? null : annotatedStructurableText2);
    }
}
