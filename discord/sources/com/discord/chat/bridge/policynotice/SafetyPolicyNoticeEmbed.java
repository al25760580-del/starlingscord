package com.discord.chat.bridge.policynotice;

import a3.e;
import com.discord.chat.presentation.list.a;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\fHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J%\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006-"}, d2 = {"Lcom/discord/chat/bridge/policynotice/SafetyPolicyNoticeEmbed;", "", "classificationId", "", "titleText", "titleIcon", "subtitleText", "descriptionText", "ctaText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getClassificationId", "()Ljava/lang/String;", "getTitleText", "getTitleIcon", "getSubtitleText", "getDescriptionText", "getCtaText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$chat_release", "$serializer", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SafetyPolicyNoticeEmbed {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String classificationId;

    @NotNull
    private final String ctaText;

    @NotNull
    private final String descriptionText;

    @NotNull
    private final String subtitleText;

    @NotNull
    private final String titleIcon;

    @NotNull
    private final String titleText;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/bridge/policynotice/SafetyPolicyNoticeEmbed$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/bridge/policynotice/SafetyPolicyNoticeEmbed;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return SafetyPolicyNoticeEmbed$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SafetyPolicyNoticeEmbed(int i7, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i7 & 63)) {
            e1.l(i7, 63, SafetyPolicyNoticeEmbed$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.classificationId = str;
        this.titleText = str2;
        this.titleIcon = str3;
        this.subtitleText = str4;
        this.descriptionText = str5;
        this.ctaText = str6;
    }

    public static /* synthetic */ SafetyPolicyNoticeEmbed copy$default(SafetyPolicyNoticeEmbed safetyPolicyNoticeEmbed, String str, String str2, String str3, String str4, String str5, String str6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = safetyPolicyNoticeEmbed.classificationId;
        }
        if ((i7 & 2) != 0) {
            str2 = safetyPolicyNoticeEmbed.titleText;
        }
        if ((i7 & 4) != 0) {
            str3 = safetyPolicyNoticeEmbed.titleIcon;
        }
        if ((i7 & 8) != 0) {
            str4 = safetyPolicyNoticeEmbed.subtitleText;
        }
        if ((i7 & 16) != 0) {
            str5 = safetyPolicyNoticeEmbed.descriptionText;
        }
        if ((i7 & 32) != 0) {
            str6 = safetyPolicyNoticeEmbed.ctaText;
        }
        String str7 = str5;
        String str8 = str6;
        return safetyPolicyNoticeEmbed.copy(str, str2, str3, str4, str7, str8);
    }

    public static final /* synthetic */ void write$Self$chat_release(SafetyPolicyNoticeEmbed self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.classificationId);
        output.q(serialDesc, 1, self.titleText);
        output.q(serialDesc, 2, self.titleIcon);
        output.q(serialDesc, 3, self.subtitleText);
        output.q(serialDesc, 4, self.descriptionText);
        output.q(serialDesc, 5, self.ctaText);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClassificationId() {
        return this.classificationId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitleText() {
        return this.titleText;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitleIcon() {
        return this.titleIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitleText() {
        return this.subtitleText;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDescriptionText() {
        return this.descriptionText;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    @NotNull
    public final SafetyPolicyNoticeEmbed copy(@NotNull String classificationId, @NotNull String titleText, @NotNull String titleIcon, @NotNull String subtitleText, @NotNull String descriptionText, @NotNull String ctaText) {
        Intrinsics.checkNotNullParameter(classificationId, "classificationId");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(titleIcon, "titleIcon");
        Intrinsics.checkNotNullParameter(subtitleText, "subtitleText");
        Intrinsics.checkNotNullParameter(descriptionText, "descriptionText");
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        return new SafetyPolicyNoticeEmbed(classificationId, titleText, titleIcon, subtitleText, descriptionText, ctaText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SafetyPolicyNoticeEmbed)) {
            return false;
        }
        SafetyPolicyNoticeEmbed safetyPolicyNoticeEmbed = (SafetyPolicyNoticeEmbed) other;
        return Intrinsics.areEqual(this.classificationId, safetyPolicyNoticeEmbed.classificationId) && Intrinsics.areEqual(this.titleText, safetyPolicyNoticeEmbed.titleText) && Intrinsics.areEqual(this.titleIcon, safetyPolicyNoticeEmbed.titleIcon) && Intrinsics.areEqual(this.subtitleText, safetyPolicyNoticeEmbed.subtitleText) && Intrinsics.areEqual(this.descriptionText, safetyPolicyNoticeEmbed.descriptionText) && Intrinsics.areEqual(this.ctaText, safetyPolicyNoticeEmbed.ctaText);
    }

    @NotNull
    public final String getClassificationId() {
        return this.classificationId;
    }

    @NotNull
    public final String getCtaText() {
        return this.ctaText;
    }

    @NotNull
    public final String getDescriptionText() {
        return this.descriptionText;
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
        return this.ctaText.hashCode() + e.d(e.d(e.d(e.d(this.classificationId.hashCode() * 31, 31, this.titleText), 31, this.titleIcon), 31, this.subtitleText), 31, this.descriptionText);
    }

    @NotNull
    public String toString() {
        String str = this.classificationId;
        String str2 = this.titleText;
        String str3 = this.titleIcon;
        String str4 = this.subtitleText;
        String str5 = this.descriptionText;
        String str6 = this.ctaText;
        StringBuilder sbU = e.u("SafetyPolicyNoticeEmbed(classificationId=", str, ", titleText=", str2, ", titleIcon=");
        e.A(sbU, str3, ", subtitleText=", str4, ", descriptionText=");
        return a.l(sbU, str5, ", ctaText=", str6, ")");
    }

    public SafetyPolicyNoticeEmbed(@NotNull String classificationId, @NotNull String titleText, @NotNull String titleIcon, @NotNull String subtitleText, @NotNull String descriptionText, @NotNull String ctaText) {
        Intrinsics.checkNotNullParameter(classificationId, "classificationId");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(titleIcon, "titleIcon");
        Intrinsics.checkNotNullParameter(subtitleText, "subtitleText");
        Intrinsics.checkNotNullParameter(descriptionText, "descriptionText");
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        this.classificationId = classificationId;
        this.titleText = titleText;
        this.titleIcon = titleIcon;
        this.subtitleText = subtitleText;
        this.descriptionText = descriptionText;
        this.ctaText = ctaText;
    }
}
