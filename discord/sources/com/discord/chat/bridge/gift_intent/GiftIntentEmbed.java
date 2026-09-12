package com.discord.chat.bridge.gift_intent;

import a3.e;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kr.f;
import o5.a;
import or.d;
import or.e1;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0002MNB\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017B·\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001bJ\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\fHÆ\u0003J\t\u00106\u001a\u00020\fHÆ\u0003J\t\u00107\u001a\u00020\fHÆ\u0003J\t\u00108\u001a\u00020\fHÆ\u0003J\t\u00109\u001a\u00020\fHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J·\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u0003HÆ\u0001J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020\fHÖ\u0001J\t\u0010D\u001a\u00020\u0003HÖ\u0001J%\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KH\u0001¢\u0006\u0002\bLR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0011\u0010\u0010\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001d¨\u0006O"}, d2 = {"Lcom/discord/chat/bridge/gift_intent/GiftIntentEmbed;", "", "recipientAvatarUrl", "", "currentUserAvatarUrl", "recipientName", "headerText", "subHeaderParts", "", "Lcom/discord/chat/bridge/gift_intent/GiftIntentSubHeaderPart;", "recipientUserId", "giftIntentType", "", "headerTextColor", "subHeaderTextColor", ViewProps.BACKGROUND_COLOR, ViewProps.BORDER_COLOR, "subHeaderIconUrl", "primaryCtaLabel", "primaryCtaIconUrl", "secondaryCtaIconUrl", "secondaryCtaAccessibilityLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;IIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;IIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getRecipientAvatarUrl", "()Ljava/lang/String;", "getCurrentUserAvatarUrl", "getRecipientName", "getHeaderText", "getSubHeaderParts", "()Ljava/util/List;", "getRecipientUserId", "getGiftIntentType", "()I", "getHeaderTextColor", "getSubHeaderTextColor", "getBackgroundColor", "getBorderColor", "getSubHeaderIconUrl", "getPrimaryCtaLabel", "getPrimaryCtaIconUrl", "getSecondaryCtaIconUrl", "getSecondaryCtaAccessibilityLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GiftIntentEmbed {
    private final int backgroundColor;
    private final int borderColor;
    private final String currentUserAvatarUrl;
    private final int giftIntentType;

    @NotNull
    private final String headerText;
    private final int headerTextColor;
    private final String primaryCtaIconUrl;

    @NotNull
    private final String primaryCtaLabel;

    @NotNull
    private final String recipientAvatarUrl;

    @NotNull
    private final String recipientName;

    @NotNull
    private final String recipientUserId;

    @NotNull
    private final String secondaryCtaAccessibilityLabel;
    private final String secondaryCtaIconUrl;
    private final String subHeaderIconUrl;

    @NotNull
    private final List<GiftIntentSubHeaderPart> subHeaderParts;
    private final int subHeaderTextColor;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy[] $childSerializers = {null, null, null, null, l.a(m.f19486e, new a(11)), null, null, null, null, null, null, null, null, null, null, null};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/gift_intent/GiftIntentEmbed$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/gift_intent/GiftIntentEmbed;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return GiftIntentEmbed$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ GiftIntentEmbed(int i7, String str, String str2, String str3, String str4, List list, String str5, int i10, int i11, int i12, int i13, int i14, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if (38909 != (i7 & 38909)) {
            e1.l(i7, 38909, GiftIntentEmbed$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.recipientAvatarUrl = str;
        if ((i7 & 2) == 0) {
            this.currentUserAvatarUrl = null;
        } else {
            this.currentUserAvatarUrl = str2;
        }
        this.recipientName = str3;
        this.headerText = str4;
        this.subHeaderParts = list;
        this.recipientUserId = str5;
        this.giftIntentType = i10;
        this.headerTextColor = i11;
        this.subHeaderTextColor = i12;
        this.backgroundColor = i13;
        this.borderColor = i14;
        if ((i7 & RecyclerView.ItemAnimator.FLAG_MOVED) == 0) {
            this.subHeaderIconUrl = null;
        } else {
            this.subHeaderIconUrl = str6;
        }
        this.primaryCtaLabel = str7;
        if ((i7 & 8192) == 0) {
            this.primaryCtaIconUrl = null;
        } else {
            this.primaryCtaIconUrl = str8;
        }
        if ((i7 & 16384) == 0) {
            this.secondaryCtaIconUrl = null;
        } else {
            this.secondaryCtaIconUrl = str9;
        }
        this.secondaryCtaAccessibilityLabel = str10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(GiftIntentSubHeaderPart$$serializer.INSTANCE, 0);
    }

    public static final /* synthetic */ void write$Self$chat_release(GiftIntentEmbed self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = $childSerializers;
        output.q(serialDesc, 0, self.recipientAvatarUrl);
        if (output.u(serialDesc, 1) || self.currentUserAvatarUrl != null) {
            output.r(serialDesc, 1, s1.f17602a, self.currentUserAvatarUrl);
        }
        output.q(serialDesc, 2, self.recipientName);
        output.q(serialDesc, 3, self.headerText);
        output.g(serialDesc, 4, (KSerializer) lazyArr[4].getValue(), self.subHeaderParts);
        output.q(serialDesc, 5, self.recipientUserId);
        output.l(6, self.giftIntentType, serialDesc);
        output.l(7, self.headerTextColor, serialDesc);
        output.l(8, self.subHeaderTextColor, serialDesc);
        output.l(9, self.backgroundColor, serialDesc);
        output.l(10, self.borderColor, serialDesc);
        if (output.u(serialDesc, 11) || self.subHeaderIconUrl != null) {
            output.r(serialDesc, 11, s1.f17602a, self.subHeaderIconUrl);
        }
        output.q(serialDesc, 12, self.primaryCtaLabel);
        if (output.u(serialDesc, 13) || self.primaryCtaIconUrl != null) {
            output.r(serialDesc, 13, s1.f17602a, self.primaryCtaIconUrl);
        }
        if (output.u(serialDesc, 14) || self.secondaryCtaIconUrl != null) {
            output.r(serialDesc, 14, s1.f17602a, self.secondaryCtaIconUrl);
        }
        output.q(serialDesc, 15, self.secondaryCtaAccessibilityLabel);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRecipientAvatarUrl() {
        return this.recipientAvatarUrl;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getBorderColor() {
        return this.borderColor;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSubHeaderIconUrl() {
        return this.subHeaderIconUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getPrimaryCtaLabel() {
        return this.primaryCtaLabel;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getPrimaryCtaIconUrl() {
        return this.primaryCtaIconUrl;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSecondaryCtaIconUrl() {
        return this.secondaryCtaIconUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getSecondaryCtaAccessibilityLabel() {
        return this.secondaryCtaAccessibilityLabel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrentUserAvatarUrl() {
        return this.currentUserAvatarUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRecipientName() {
        return this.recipientName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    @NotNull
    public final List<GiftIntentSubHeaderPart> component5() {
        return this.subHeaderParts;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRecipientUserId() {
        return this.recipientUserId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getGiftIntentType() {
        return this.giftIntentType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getHeaderTextColor() {
        return this.headerTextColor;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getSubHeaderTextColor() {
        return this.subHeaderTextColor;
    }

    @NotNull
    public final GiftIntentEmbed copy(@NotNull String recipientAvatarUrl, String currentUserAvatarUrl, @NotNull String recipientName, @NotNull String headerText, @NotNull List<GiftIntentSubHeaderPart> subHeaderParts, @NotNull String recipientUserId, int giftIntentType, int headerTextColor, int subHeaderTextColor, int backgroundColor, int borderColor, String subHeaderIconUrl, @NotNull String primaryCtaLabel, String primaryCtaIconUrl, String secondaryCtaIconUrl, @NotNull String secondaryCtaAccessibilityLabel) {
        Intrinsics.checkNotNullParameter(recipientAvatarUrl, "recipientAvatarUrl");
        Intrinsics.checkNotNullParameter(recipientName, "recipientName");
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(subHeaderParts, "subHeaderParts");
        Intrinsics.checkNotNullParameter(recipientUserId, "recipientUserId");
        Intrinsics.checkNotNullParameter(primaryCtaLabel, "primaryCtaLabel");
        Intrinsics.checkNotNullParameter(secondaryCtaAccessibilityLabel, "secondaryCtaAccessibilityLabel");
        return new GiftIntentEmbed(recipientAvatarUrl, currentUserAvatarUrl, recipientName, headerText, subHeaderParts, recipientUserId, giftIntentType, headerTextColor, subHeaderTextColor, backgroundColor, borderColor, subHeaderIconUrl, primaryCtaLabel, primaryCtaIconUrl, secondaryCtaIconUrl, secondaryCtaAccessibilityLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftIntentEmbed)) {
            return false;
        }
        GiftIntentEmbed giftIntentEmbed = (GiftIntentEmbed) other;
        return Intrinsics.areEqual(this.recipientAvatarUrl, giftIntentEmbed.recipientAvatarUrl) && Intrinsics.areEqual(this.currentUserAvatarUrl, giftIntentEmbed.currentUserAvatarUrl) && Intrinsics.areEqual(this.recipientName, giftIntentEmbed.recipientName) && Intrinsics.areEqual(this.headerText, giftIntentEmbed.headerText) && Intrinsics.areEqual(this.subHeaderParts, giftIntentEmbed.subHeaderParts) && Intrinsics.areEqual(this.recipientUserId, giftIntentEmbed.recipientUserId) && this.giftIntentType == giftIntentEmbed.giftIntentType && this.headerTextColor == giftIntentEmbed.headerTextColor && this.subHeaderTextColor == giftIntentEmbed.subHeaderTextColor && this.backgroundColor == giftIntentEmbed.backgroundColor && this.borderColor == giftIntentEmbed.borderColor && Intrinsics.areEqual(this.subHeaderIconUrl, giftIntentEmbed.subHeaderIconUrl) && Intrinsics.areEqual(this.primaryCtaLabel, giftIntentEmbed.primaryCtaLabel) && Intrinsics.areEqual(this.primaryCtaIconUrl, giftIntentEmbed.primaryCtaIconUrl) && Intrinsics.areEqual(this.secondaryCtaIconUrl, giftIntentEmbed.secondaryCtaIconUrl) && Intrinsics.areEqual(this.secondaryCtaAccessibilityLabel, giftIntentEmbed.secondaryCtaAccessibilityLabel);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final String getCurrentUserAvatarUrl() {
        return this.currentUserAvatarUrl;
    }

    public final int getGiftIntentType() {
        return this.giftIntentType;
    }

    @NotNull
    public final String getHeaderText() {
        return this.headerText;
    }

    public final int getHeaderTextColor() {
        return this.headerTextColor;
    }

    public final String getPrimaryCtaIconUrl() {
        return this.primaryCtaIconUrl;
    }

    @NotNull
    public final String getPrimaryCtaLabel() {
        return this.primaryCtaLabel;
    }

    @NotNull
    public final String getRecipientAvatarUrl() {
        return this.recipientAvatarUrl;
    }

    @NotNull
    public final String getRecipientName() {
        return this.recipientName;
    }

    @NotNull
    public final String getRecipientUserId() {
        return this.recipientUserId;
    }

    @NotNull
    public final String getSecondaryCtaAccessibilityLabel() {
        return this.secondaryCtaAccessibilityLabel;
    }

    public final String getSecondaryCtaIconUrl() {
        return this.secondaryCtaIconUrl;
    }

    public final String getSubHeaderIconUrl() {
        return this.subHeaderIconUrl;
    }

    @NotNull
    public final List<GiftIntentSubHeaderPart> getSubHeaderParts() {
        return this.subHeaderParts;
    }

    public final int getSubHeaderTextColor() {
        return this.subHeaderTextColor;
    }

    public int hashCode() {
        int iHashCode = this.recipientAvatarUrl.hashCode() * 31;
        String str = this.currentUserAvatarUrl;
        int iU = com.discord.chat.presentation.list.a.u(this.borderColor, com.discord.chat.presentation.list.a.u(this.backgroundColor, com.discord.chat.presentation.list.a.u(this.subHeaderTextColor, com.discord.chat.presentation.list.a.u(this.headerTextColor, com.discord.chat.presentation.list.a.u(this.giftIntentType, e.d(e.f(this.subHeaderParts, e.d(e.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.recipientName), 31, this.headerText), 31), 31, this.recipientUserId), 31), 31), 31), 31), 31);
        String str2 = this.subHeaderIconUrl;
        int iD = e.d((iU + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.primaryCtaLabel);
        String str3 = this.primaryCtaIconUrl;
        int iHashCode2 = (iD + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.secondaryCtaIconUrl;
        return this.secondaryCtaAccessibilityLabel.hashCode() + ((iHashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.recipientAvatarUrl;
        String str2 = this.currentUserAvatarUrl;
        String str3 = this.recipientName;
        String str4 = this.headerText;
        List<GiftIntentSubHeaderPart> list = this.subHeaderParts;
        String str5 = this.recipientUserId;
        int i7 = this.giftIntentType;
        int i10 = this.headerTextColor;
        int i11 = this.subHeaderTextColor;
        int i12 = this.backgroundColor;
        int i13 = this.borderColor;
        String str6 = this.subHeaderIconUrl;
        String str7 = this.primaryCtaLabel;
        String str8 = this.primaryCtaIconUrl;
        String str9 = this.secondaryCtaIconUrl;
        String str10 = this.secondaryCtaAccessibilityLabel;
        StringBuilder sbU = e.u("GiftIntentEmbed(recipientAvatarUrl=", str, ", currentUserAvatarUrl=", str2, ", recipientName=");
        e.A(sbU, str3, ", headerText=", str4, ", subHeaderParts=");
        sbU.append(list);
        sbU.append(", recipientUserId=");
        sbU.append(str5);
        sbU.append(", giftIntentType=");
        e.z(sbU, i7, ", headerTextColor=", i10, ", subHeaderTextColor=");
        e.z(sbU, i11, ", backgroundColor=", i12, ", borderColor=");
        sbU.append(i13);
        sbU.append(", subHeaderIconUrl=");
        sbU.append(str6);
        sbU.append(", primaryCtaLabel=");
        e.A(sbU, str7, ", primaryCtaIconUrl=", str8, ", secondaryCtaIconUrl=");
        return com.discord.chat.presentation.list.a.l(sbU, str9, ", secondaryCtaAccessibilityLabel=", str10, ")");
    }

    public GiftIntentEmbed(@NotNull String recipientAvatarUrl, String str, @NotNull String recipientName, @NotNull String headerText, @NotNull List<GiftIntentSubHeaderPart> subHeaderParts, @NotNull String recipientUserId, int i7, int i10, int i11, int i12, int i13, String str2, @NotNull String primaryCtaLabel, String str3, String str4, @NotNull String secondaryCtaAccessibilityLabel) {
        Intrinsics.checkNotNullParameter(recipientAvatarUrl, "recipientAvatarUrl");
        Intrinsics.checkNotNullParameter(recipientName, "recipientName");
        Intrinsics.checkNotNullParameter(headerText, "headerText");
        Intrinsics.checkNotNullParameter(subHeaderParts, "subHeaderParts");
        Intrinsics.checkNotNullParameter(recipientUserId, "recipientUserId");
        Intrinsics.checkNotNullParameter(primaryCtaLabel, "primaryCtaLabel");
        Intrinsics.checkNotNullParameter(secondaryCtaAccessibilityLabel, "secondaryCtaAccessibilityLabel");
        this.recipientAvatarUrl = recipientAvatarUrl;
        this.currentUserAvatarUrl = str;
        this.recipientName = recipientName;
        this.headerText = headerText;
        this.subHeaderParts = subHeaderParts;
        this.recipientUserId = recipientUserId;
        this.giftIntentType = i7;
        this.headerTextColor = i10;
        this.subHeaderTextColor = i11;
        this.backgroundColor = i12;
        this.borderColor = i13;
        this.subHeaderIconUrl = str2;
        this.primaryCtaLabel = primaryCtaLabel;
        this.primaryCtaIconUrl = str3;
        this.secondaryCtaIconUrl = str4;
        this.secondaryCtaAccessibilityLabel = secondaryCtaAccessibilityLabel;
    }

    public /* synthetic */ GiftIntentEmbed(String str, String str2, String str3, String str4, List list, String str5, int i7, int i10, int i11, int i12, int i13, String str6, String str7, String str8, String str9, String str10, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i14 & 2) != 0 ? null : str2, str3, str4, list, str5, i7, i10, i11, i12, i13, (i14 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : str6, str7, (i14 & 8192) != 0 ? null : str8, (i14 & 16384) != 0 ? null : str9, str10);
    }
}
