package com.discord.chat.bridge.premium_group_invite;

import a3.e;
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText;
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableTextSerializer;
import com.discord.chat.presentation.list.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import or.e1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002=>B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011B}\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0015J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003Jw\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0005HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001J%\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0001¢\u0006\u0002\b<R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006?"}, d2 = {"Lcom/discord/chat/bridge/premium_group_invite/PremiumGroupInviteEmbed;", "", "headerText", "", "headerColor", "", ViewProps.BACKGROUND_COLOR, ViewProps.BORDER_COLOR, "headerImageUrl", "betaPillText", "betaPillTextColor", "betaPillBackgroundColor", "bodyText", "bodyTextColor", "learnMoreLink", "Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;", "<init>", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;IILjava/lang/String;ILcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;IILjava/lang/String;ILcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getHeaderText", "()Ljava/lang/String;", "getHeaderColor", "()I", "getBackgroundColor", "getBorderColor", "getHeaderImageUrl", "getBetaPillText", "getBetaPillTextColor", "getBetaPillBackgroundColor", "getBodyText", "getBodyTextColor", "getLearnMoreLink", "()Lcom/discord/chat/bridge/structurabletext/AnnotatedStructurableText;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PremiumGroupInviteEmbed {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int backgroundColor;
    private final int betaPillBackgroundColor;

    @NotNull
    private final String betaPillText;
    private final int betaPillTextColor;

    @NotNull
    private final String bodyText;
    private final int bodyTextColor;
    private final int borderColor;
    private final int headerColor;

    @NotNull
    private final String headerImageUrl;

    @NotNull
    private final String headerText;

    @NotNull
    private final AnnotatedStructurableText learnMoreLink;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/premium_group_invite/PremiumGroupInviteEmbed$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/premium_group_invite/PremiumGroupInviteEmbed;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return PremiumGroupInviteEmbed$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PremiumGroupInviteEmbed(int i7, String str, int i10, int i11, int i12, String str2, String str3, int i13, int i14, String str4, int i15, AnnotatedStructurableText annotatedStructurableText, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i7 & 2047)) {
            e1.l(i7, 2047, PremiumGroupInviteEmbed$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.headerText = str;
        this.headerColor = i10;
        this.backgroundColor = i11;
        this.borderColor = i12;
        this.headerImageUrl = str2;
        this.betaPillText = str3;
        this.betaPillTextColor = i13;
        this.betaPillBackgroundColor = i14;
        this.bodyText = str4;
        this.bodyTextColor = i15;
        this.learnMoreLink = annotatedStructurableText;
    }

    public static /* synthetic */ PremiumGroupInviteEmbed copy$default(PremiumGroupInviteEmbed premiumGroupInviteEmbed, String str, int i7, int i10, int i11, String str2, String str3, int i12, int i13, String str4, int i14, AnnotatedStructurableText annotatedStructurableText, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = premiumGroupInviteEmbed.headerText;
        }
        if ((i15 & 2) != 0) {
            i7 = premiumGroupInviteEmbed.headerColor;
        }
        if ((i15 & 4) != 0) {
            i10 = premiumGroupInviteEmbed.backgroundColor;
        }
        if ((i15 & 8) != 0) {
            i11 = premiumGroupInviteEmbed.borderColor;
        }
        if ((i15 & 16) != 0) {
            str2 = premiumGroupInviteEmbed.headerImageUrl;
        }
        if ((i15 & 32) != 0) {
            str3 = premiumGroupInviteEmbed.betaPillText;
        }
        if ((i15 & 64) != 0) {
            i12 = premiumGroupInviteEmbed.betaPillTextColor;
        }
        if ((i15 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            i13 = premiumGroupInviteEmbed.betaPillBackgroundColor;
        }
        if ((i15 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            str4 = premiumGroupInviteEmbed.bodyText;
        }
        if ((i15 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            i14 = premiumGroupInviteEmbed.bodyTextColor;
        }
        if ((i15 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
            annotatedStructurableText = premiumGroupInviteEmbed.learnMoreLink;
        }
        int i16 = i14;
        AnnotatedStructurableText annotatedStructurableText2 = annotatedStructurableText;
        int i17 = i13;
        String str5 = str4;
        String str6 = str3;
        int i18 = i12;
        String str7 = str2;
        int i19 = i10;
        return premiumGroupInviteEmbed.copy(str, i7, i19, i11, str7, str6, i18, i17, str5, i16, annotatedStructurableText2);
    }

    public static final /* synthetic */ void write$Self$chat_release(PremiumGroupInviteEmbed self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.headerText);
        output.l(1, self.headerColor, serialDesc);
        output.l(2, self.backgroundColor, serialDesc);
        output.l(3, self.borderColor, serialDesc);
        output.q(serialDesc, 4, self.headerImageUrl);
        output.q(serialDesc, 5, self.betaPillText);
        output.l(6, self.betaPillTextColor, serialDesc);
        output.l(7, self.betaPillBackgroundColor, serialDesc);
        output.q(serialDesc, 8, self.bodyText);
        output.l(9, self.bodyTextColor, serialDesc);
        output.g(serialDesc, 10, AnnotatedStructurableTextSerializer.INSTANCE, self.learnMoreLink);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getBodyTextColor() {
        return this.bodyTextColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final AnnotatedStructurableText getLearnMoreLink() {
        return this.learnMoreLink;
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
    public final int getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBetaPillText() {
        return this.betaPillText;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getBetaPillTextColor() {
        return this.betaPillTextColor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getBetaPillBackgroundColor() {
        return this.betaPillBackgroundColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBodyText() {
        return this.bodyText;
    }

    @NotNull
    public final PremiumGroupInviteEmbed copy(@NotNull String headerText, int headerColor, int backgroundColor, int borderColor, @NotNull String headerImageUrl, @NotNull String betaPillText, int betaPillTextColor, int betaPillBackgroundColor, @NotNull String bodyText, int bodyTextColor, @NotNull AnnotatedStructurableText learnMoreLink) {
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(headerImageUrl, "headerImageUrl");
        Intrinsics.checkNotNullParameter(betaPillText, "betaPillText");
        Intrinsics.checkNotNullParameter(bodyText, "bodyText");
        Intrinsics.checkNotNullParameter(learnMoreLink, "learnMoreLink");
        return new PremiumGroupInviteEmbed(headerText, headerColor, backgroundColor, borderColor, headerImageUrl, betaPillText, betaPillTextColor, betaPillBackgroundColor, bodyText, bodyTextColor, learnMoreLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PremiumGroupInviteEmbed)) {
            return false;
        }
        PremiumGroupInviteEmbed premiumGroupInviteEmbed = (PremiumGroupInviteEmbed) other;
        return Intrinsics.areEqual(this.headerText, premiumGroupInviteEmbed.headerText) && this.headerColor == premiumGroupInviteEmbed.headerColor && this.backgroundColor == premiumGroupInviteEmbed.backgroundColor && this.borderColor == premiumGroupInviteEmbed.borderColor && Intrinsics.areEqual(this.headerImageUrl, premiumGroupInviteEmbed.headerImageUrl) && Intrinsics.areEqual(this.betaPillText, premiumGroupInviteEmbed.betaPillText) && this.betaPillTextColor == premiumGroupInviteEmbed.betaPillTextColor && this.betaPillBackgroundColor == premiumGroupInviteEmbed.betaPillBackgroundColor && Intrinsics.areEqual(this.bodyText, premiumGroupInviteEmbed.bodyText) && this.bodyTextColor == premiumGroupInviteEmbed.bodyTextColor && Intrinsics.areEqual(this.learnMoreLink, premiumGroupInviteEmbed.learnMoreLink);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBetaPillBackgroundColor() {
        return this.betaPillBackgroundColor;
    }

    @NotNull
    public final String getBetaPillText() {
        return this.betaPillText;
    }

    public final int getBetaPillTextColor() {
        return this.betaPillTextColor;
    }

    @NotNull
    public final String getBodyText() {
        return this.bodyText;
    }

    public final int getBodyTextColor() {
        return this.bodyTextColor;
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final int getHeaderColor() {
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

    @NotNull
    public final AnnotatedStructurableText getLearnMoreLink() {
        return this.learnMoreLink;
    }

    public int hashCode() {
        return this.learnMoreLink.hashCode() + a.u(this.bodyTextColor, e.d(a.u(this.betaPillBackgroundColor, a.u(this.betaPillTextColor, e.d(e.d(a.u(this.borderColor, a.u(this.backgroundColor, a.u(this.headerColor, this.headerText.hashCode() * 31, 31), 31), 31), 31, this.headerImageUrl), 31, this.betaPillText), 31), 31), 31, this.bodyText), 31);
    }

    @NotNull
    public String toString() {
        String str = this.headerText;
        int i7 = this.headerColor;
        int i10 = this.backgroundColor;
        int i11 = this.borderColor;
        String str2 = this.headerImageUrl;
        String str3 = this.betaPillText;
        int i12 = this.betaPillTextColor;
        int i13 = this.betaPillBackgroundColor;
        String str4 = this.bodyText;
        int i14 = this.bodyTextColor;
        AnnotatedStructurableText annotatedStructurableText = this.learnMoreLink;
        StringBuilder sbT = e.t("PremiumGroupInviteEmbed(headerText=", str, ", headerColor=", i7, ", backgroundColor=");
        e.z(sbT, i10, ", borderColor=", i11, ", headerImageUrl=");
        e.A(sbT, str2, ", betaPillText=", str3, ", betaPillTextColor=");
        e.z(sbT, i12, ", betaPillBackgroundColor=", i13, ", bodyText=");
        sbT.append(str4);
        sbT.append(", bodyTextColor=");
        sbT.append(i14);
        sbT.append(", learnMoreLink=");
        sbT.append(annotatedStructurableText);
        sbT.append(")");
        return sbT.toString();
    }

    public PremiumGroupInviteEmbed(@NotNull String headerText, int i7, int i10, int i11, @NotNull String headerImageUrl, @NotNull String betaPillText, int i12, int i13, @NotNull String bodyText, int i14, @NotNull AnnotatedStructurableText learnMoreLink) {
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(headerImageUrl, "headerImageUrl");
        Intrinsics.checkNotNullParameter(betaPillText, "betaPillText");
        Intrinsics.checkNotNullParameter(bodyText, "bodyText");
        Intrinsics.checkNotNullParameter(learnMoreLink, "learnMoreLink");
        this.headerText = headerText;
        this.headerColor = i7;
        this.backgroundColor = i10;
        this.borderColor = i11;
        this.headerImageUrl = headerImageUrl;
        this.betaPillText = betaPillText;
        this.betaPillTextColor = i12;
        this.betaPillBackgroundColor = i13;
        this.bodyText = bodyText;
        this.bodyTextColor = i14;
        this.learnMoreLink = learnMoreLink;
    }
}
