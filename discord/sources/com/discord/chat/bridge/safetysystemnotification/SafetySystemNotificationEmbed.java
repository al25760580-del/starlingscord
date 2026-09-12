package com.discord.chat.bridge.safetysystemnotification;

import a3.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
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
import or.e1;
import or.s1;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes.dex */
@f
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002<=Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u000eHÆ\u0003J\u0083\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0012HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001J%\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0001¢\u0006\u0002\b;R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006>"}, d2 = {"Lcom/discord/chat/bridge/safetysystemnotification/SafetySystemNotificationEmbed;", "", "titleText", "", "titleIcon", "subtitleText", "descriptionText", "primaryCtaText", "primaryCtaType", "primaryCtaKey", "secondaryCtaText", "secondaryCtaType", "secondaryCtaKey", "footerTheme", "Lcom/discord/chat/bridge/safetysystemnotification/FooterTheme;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/safetysystemnotification/FooterTheme;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/safetysystemnotification/FooterTheme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTitleText", "()Ljava/lang/String;", "getTitleIcon", "getSubtitleText", "getDescriptionText", "getPrimaryCtaText", "getPrimaryCtaType", "getPrimaryCtaKey", "getSecondaryCtaText", "getSecondaryCtaType", "getSecondaryCtaKey", "getFooterTheme", "()Lcom/discord/chat/bridge/safetysystemnotification/FooterTheme;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SafetySystemNotificationEmbed {

    @NotNull
    private final String descriptionText;

    @NotNull
    private final FooterTheme footerTheme;
    private final String primaryCtaKey;
    private final String primaryCtaText;
    private final String primaryCtaType;
    private final String secondaryCtaKey;
    private final String secondaryCtaText;
    private final String secondaryCtaType;

    @NotNull
    private final String subtitleText;

    @NotNull
    private final String titleIcon;

    @NotNull
    private final String titleText;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, l.a(m.f19486e, new a(26))};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/safetysystemnotification/SafetySystemNotificationEmbed$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/safetysystemnotification/SafetySystemNotificationEmbed;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return SafetySystemNotificationEmbed$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SafetySystemNotificationEmbed(int i7, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, FooterTheme footerTheme, SerializationConstructorMarker serializationConstructorMarker) {
        if (1039 != (i7 & 1039)) {
            e1.l(i7, 1039, SafetySystemNotificationEmbed$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.titleText = str;
        this.titleIcon = str2;
        this.subtitleText = str3;
        this.descriptionText = str4;
        if ((i7 & 16) == 0) {
            this.primaryCtaText = null;
        } else {
            this.primaryCtaText = str5;
        }
        if ((i7 & 32) == 0) {
            this.primaryCtaType = null;
        } else {
            this.primaryCtaType = str6;
        }
        if ((i7 & 64) == 0) {
            this.primaryCtaKey = null;
        } else {
            this.primaryCtaKey = str7;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
            this.secondaryCtaText = null;
        } else {
            this.secondaryCtaText = str8;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 0) {
            this.secondaryCtaType = null;
        } else {
            this.secondaryCtaType = str9;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0) {
            this.secondaryCtaKey = null;
        } else {
            this.secondaryCtaKey = str10;
        }
        this.footerTheme = footerTheme;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return FooterTheme.INSTANCE.serializer();
    }

    public static /* synthetic */ SafetySystemNotificationEmbed copy$default(SafetySystemNotificationEmbed safetySystemNotificationEmbed, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, FooterTheme footerTheme, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = safetySystemNotificationEmbed.titleText;
        }
        if ((i7 & 2) != 0) {
            str2 = safetySystemNotificationEmbed.titleIcon;
        }
        if ((i7 & 4) != 0) {
            str3 = safetySystemNotificationEmbed.subtitleText;
        }
        if ((i7 & 8) != 0) {
            str4 = safetySystemNotificationEmbed.descriptionText;
        }
        if ((i7 & 16) != 0) {
            str5 = safetySystemNotificationEmbed.primaryCtaText;
        }
        if ((i7 & 32) != 0) {
            str6 = safetySystemNotificationEmbed.primaryCtaType;
        }
        if ((i7 & 64) != 0) {
            str7 = safetySystemNotificationEmbed.primaryCtaKey;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            str8 = safetySystemNotificationEmbed.secondaryCtaText;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            str9 = safetySystemNotificationEmbed.secondaryCtaType;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            str10 = safetySystemNotificationEmbed.secondaryCtaKey;
        }
        if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
            footerTheme = safetySystemNotificationEmbed.footerTheme;
        }
        String str11 = str10;
        FooterTheme footerTheme2 = footerTheme;
        String str12 = str8;
        String str13 = str9;
        String str14 = str6;
        String str15 = str7;
        String str16 = str5;
        String str17 = str3;
        return safetySystemNotificationEmbed.copy(str, str2, str17, str4, str16, str14, str15, str12, str13, str11, footerTheme2);
    }

    public static final /* synthetic */ void write$Self$chat_release(SafetySystemNotificationEmbed self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = $childSerializers;
        output.q(serialDesc, 0, self.titleText);
        output.q(serialDesc, 1, self.titleIcon);
        output.q(serialDesc, 2, self.subtitleText);
        output.q(serialDesc, 3, self.descriptionText);
        if (output.u(serialDesc, 4) || self.primaryCtaText != null) {
            output.r(serialDesc, 4, s1.f17602a, self.primaryCtaText);
        }
        if (output.u(serialDesc, 5) || self.primaryCtaType != null) {
            output.r(serialDesc, 5, s1.f17602a, self.primaryCtaType);
        }
        if (output.u(serialDesc, 6) || self.primaryCtaKey != null) {
            output.r(serialDesc, 6, s1.f17602a, self.primaryCtaKey);
        }
        if (output.u(serialDesc, 7) || self.secondaryCtaText != null) {
            output.r(serialDesc, 7, s1.f17602a, self.secondaryCtaText);
        }
        if (output.u(serialDesc, 8) || self.secondaryCtaType != null) {
            output.r(serialDesc, 8, s1.f17602a, self.secondaryCtaType);
        }
        if (output.u(serialDesc, 9) || self.secondaryCtaKey != null) {
            output.r(serialDesc, 9, s1.f17602a, self.secondaryCtaKey);
        }
        output.g(serialDesc, 10, (KSerializer) lazyArr[10].getValue(), self.footerTheme);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleText() {
        return this.titleText;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSecondaryCtaKey() {
        return this.secondaryCtaKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final FooterTheme getFooterTheme() {
        return this.footerTheme;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitleIcon() {
        return this.titleIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitleText() {
        return this.subtitleText;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescriptionText() {
        return this.descriptionText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPrimaryCtaText() {
        return this.primaryCtaText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPrimaryCtaType() {
        return this.primaryCtaType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPrimaryCtaKey() {
        return this.primaryCtaKey;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSecondaryCtaText() {
        return this.secondaryCtaText;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSecondaryCtaType() {
        return this.secondaryCtaType;
    }

    @NotNull
    public final SafetySystemNotificationEmbed copy(@NotNull String titleText, @NotNull String titleIcon, @NotNull String subtitleText, @NotNull String descriptionText, String primaryCtaText, String primaryCtaType, String primaryCtaKey, String secondaryCtaText, String secondaryCtaType, String secondaryCtaKey, @NotNull FooterTheme footerTheme) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(titleIcon, "titleIcon");
        Intrinsics.checkNotNullParameter(subtitleText, "subtitleText");
        Intrinsics.checkNotNullParameter(descriptionText, "descriptionText");
        Intrinsics.checkNotNullParameter(footerTheme, "footerTheme");
        return new SafetySystemNotificationEmbed(titleText, titleIcon, subtitleText, descriptionText, primaryCtaText, primaryCtaType, primaryCtaKey, secondaryCtaText, secondaryCtaType, secondaryCtaKey, footerTheme);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SafetySystemNotificationEmbed)) {
            return false;
        }
        SafetySystemNotificationEmbed safetySystemNotificationEmbed = (SafetySystemNotificationEmbed) other;
        return Intrinsics.areEqual(this.titleText, safetySystemNotificationEmbed.titleText) && Intrinsics.areEqual(this.titleIcon, safetySystemNotificationEmbed.titleIcon) && Intrinsics.areEqual(this.subtitleText, safetySystemNotificationEmbed.subtitleText) && Intrinsics.areEqual(this.descriptionText, safetySystemNotificationEmbed.descriptionText) && Intrinsics.areEqual(this.primaryCtaText, safetySystemNotificationEmbed.primaryCtaText) && Intrinsics.areEqual(this.primaryCtaType, safetySystemNotificationEmbed.primaryCtaType) && Intrinsics.areEqual(this.primaryCtaKey, safetySystemNotificationEmbed.primaryCtaKey) && Intrinsics.areEqual(this.secondaryCtaText, safetySystemNotificationEmbed.secondaryCtaText) && Intrinsics.areEqual(this.secondaryCtaType, safetySystemNotificationEmbed.secondaryCtaType) && Intrinsics.areEqual(this.secondaryCtaKey, safetySystemNotificationEmbed.secondaryCtaKey) && this.footerTheme == safetySystemNotificationEmbed.footerTheme;
    }

    @NotNull
    public final String getDescriptionText() {
        return this.descriptionText;
    }

    @NotNull
    public final FooterTheme getFooterTheme() {
        return this.footerTheme;
    }

    public final String getPrimaryCtaKey() {
        return this.primaryCtaKey;
    }

    public final String getPrimaryCtaText() {
        return this.primaryCtaText;
    }

    public final String getPrimaryCtaType() {
        return this.primaryCtaType;
    }

    public final String getSecondaryCtaKey() {
        return this.secondaryCtaKey;
    }

    public final String getSecondaryCtaText() {
        return this.secondaryCtaText;
    }

    public final String getSecondaryCtaType() {
        return this.secondaryCtaType;
    }

    @NotNull
    public final String getSubtitleText() {
        return this.subtitleText;
    }

    @NotNull
    public final String getTitleIcon() {
        return this.titleIcon;
    }

    @NotNull
    public final String getTitleText() {
        return this.titleText;
    }

    public int hashCode() {
        int iD = e.d(e.d(e.d(this.titleText.hashCode() * 31, 31, this.titleIcon), 31, this.subtitleText), 31, this.descriptionText);
        String str = this.primaryCtaText;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.primaryCtaType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.primaryCtaKey;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.secondaryCtaText;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.secondaryCtaType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.secondaryCtaKey;
        return this.footerTheme.hashCode() + ((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.titleText;
        String str2 = this.titleIcon;
        String str3 = this.subtitleText;
        String str4 = this.descriptionText;
        String str5 = this.primaryCtaText;
        String str6 = this.primaryCtaType;
        String str7 = this.primaryCtaKey;
        String str8 = this.secondaryCtaText;
        String str9 = this.secondaryCtaType;
        String str10 = this.secondaryCtaKey;
        FooterTheme footerTheme = this.footerTheme;
        StringBuilder sbU = e.u("SafetySystemNotificationEmbed(titleText=", str, ", titleIcon=", str2, ", subtitleText=");
        e.A(sbU, str3, ", descriptionText=", str4, ", primaryCtaText=");
        e.A(sbU, str5, ", primaryCtaType=", str6, ", primaryCtaKey=");
        e.A(sbU, str7, ", secondaryCtaText=", str8, ", secondaryCtaType=");
        e.A(sbU, str9, ", secondaryCtaKey=", str10, ", footerTheme=");
        sbU.append(footerTheme);
        sbU.append(")");
        return sbU.toString();
    }

    public SafetySystemNotificationEmbed(@NotNull String titleText, @NotNull String titleIcon, @NotNull String subtitleText, @NotNull String descriptionText, String str, String str2, String str3, String str4, String str5, String str6, @NotNull FooterTheme footerTheme) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(titleIcon, "titleIcon");
        Intrinsics.checkNotNullParameter(subtitleText, "subtitleText");
        Intrinsics.checkNotNullParameter(descriptionText, "descriptionText");
        Intrinsics.checkNotNullParameter(footerTheme, "footerTheme");
        this.titleText = titleText;
        this.titleIcon = titleIcon;
        this.subtitleText = subtitleText;
        this.descriptionText = descriptionText;
        this.primaryCtaText = str;
        this.primaryCtaType = str2;
        this.primaryCtaKey = str3;
        this.secondaryCtaText = str4;
        this.secondaryCtaType = str5;
        this.secondaryCtaKey = str6;
        this.footerTheme = footerTheme;
    }

    public /* synthetic */ SafetySystemNotificationEmbed(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, FooterTheme footerTheme, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i7 & 16) != 0 ? null : str5, (i7 & 32) != 0 ? null : str6, (i7 & 64) != 0 ? null : str7, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : str8, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str9, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : str10, footerTheme);
    }
}
