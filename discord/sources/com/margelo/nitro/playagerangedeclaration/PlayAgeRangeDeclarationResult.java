package com.margelo.nitro.playagerangedeclaration;

import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001(BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J`\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010&J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011¨\u0006)"}, d2 = {"Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationResult;", "", "isEligible", "", "installId", "", "userStatus", "Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationUserStatus;", "error", "ageLower", "", "ageUpper", "mostRecentApprovalDate", "<init>", "(ZLjava/lang/String;Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationUserStatus;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "()Z", "getInstallId", "()Ljava/lang/String;", "getUserStatus", "()Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationUserStatus;", "getError", "getAgeLower", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAgeUpper", "getMostRecentApprovalDate", "equals", "other", "hashCode", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ZLjava/lang/String;Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationUserStatus;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationResult;", "toString", "Companion", "react-native-play-age-range-declaration_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PlayAgeRangeDeclarationResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @xa.a
    @Keep
    private final Double ageLower;

    @xa.a
    @Keep
    private final Double ageUpper;

    @xa.a
    @Keep
    private final String error;

    @xa.a
    @Keep
    private final String installId;

    @xa.a
    @Keep
    private final boolean isEligible;

    @xa.a
    @Keep
    private final String mostRecentApprovalDate;

    @xa.a
    @Keep
    private final PlayAgeRangeDeclarationUserStatus userStatus;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001JS\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationResult$Companion;", "", "", "isEligible", "", "installId", "Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationUserStatus;", "userStatus", "error", "", "ageLower", "ageUpper", "mostRecentApprovalDate", "Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationResult;", "fromCpp", "(ZLjava/lang/String;Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationUserStatus;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)Lcom/margelo/nitro/playagerangedeclaration/PlayAgeRangeDeclarationResult;", "react-native-play-age-range-declaration_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        @xa.a
        @Keep
        public final PlayAgeRangeDeclarationResult fromCpp(boolean isEligible, String installId, PlayAgeRangeDeclarationUserStatus userStatus, String error, Double ageLower, Double ageUpper, String mostRecentApprovalDate) {
            return new PlayAgeRangeDeclarationResult(isEligible, installId, userStatus, error, ageLower, ageUpper, mostRecentApprovalDate);
        }
    }

    public PlayAgeRangeDeclarationResult(boolean z5, String str, PlayAgeRangeDeclarationUserStatus playAgeRangeDeclarationUserStatus, String str2, Double d6, Double d7, String str3) {
        this.isEligible = z5;
        this.installId = str;
        this.userStatus = playAgeRangeDeclarationUserStatus;
        this.error = str2;
        this.ageLower = d6;
        this.ageUpper = d7;
        this.mostRecentApprovalDate = str3;
    }

    public static /* synthetic */ PlayAgeRangeDeclarationResult copy$default(PlayAgeRangeDeclarationResult playAgeRangeDeclarationResult, boolean z5, String str, PlayAgeRangeDeclarationUserStatus playAgeRangeDeclarationUserStatus, String str2, Double d6, Double d7, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z5 = playAgeRangeDeclarationResult.isEligible;
        }
        if ((i7 & 2) != 0) {
            str = playAgeRangeDeclarationResult.installId;
        }
        if ((i7 & 4) != 0) {
            playAgeRangeDeclarationUserStatus = playAgeRangeDeclarationResult.userStatus;
        }
        if ((i7 & 8) != 0) {
            str2 = playAgeRangeDeclarationResult.error;
        }
        if ((i7 & 16) != 0) {
            d6 = playAgeRangeDeclarationResult.ageLower;
        }
        if ((i7 & 32) != 0) {
            d7 = playAgeRangeDeclarationResult.ageUpper;
        }
        if ((i7 & 64) != 0) {
            str3 = playAgeRangeDeclarationResult.mostRecentApprovalDate;
        }
        Double d8 = d7;
        String str4 = str3;
        Double d9 = d6;
        PlayAgeRangeDeclarationUserStatus playAgeRangeDeclarationUserStatus2 = playAgeRangeDeclarationUserStatus;
        return playAgeRangeDeclarationResult.copy(z5, str, playAgeRangeDeclarationUserStatus2, str2, d9, d8, str4);
    }

    @xa.a
    @Keep
    private static final PlayAgeRangeDeclarationResult fromCpp(boolean z5, String str, PlayAgeRangeDeclarationUserStatus playAgeRangeDeclarationUserStatus, String str2, Double d6, Double d7, String str3) {
        return INSTANCE.fromCpp(z5, str, playAgeRangeDeclarationUserStatus, str2, d6, d7, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsEligible() {
        return this.isEligible;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInstallId() {
        return this.installId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PlayAgeRangeDeclarationUserStatus getUserStatus() {
        return this.userStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getAgeLower() {
        return this.ageLower;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getAgeUpper() {
        return this.ageUpper;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMostRecentApprovalDate() {
        return this.mostRecentApprovalDate;
    }

    @NotNull
    public final PlayAgeRangeDeclarationResult copy(boolean isEligible, String installId, PlayAgeRangeDeclarationUserStatus userStatus, String error, Double ageLower, Double ageUpper, String mostRecentApprovalDate) {
        return new PlayAgeRangeDeclarationResult(isEligible, installId, userStatus, error, ageLower, ageUpper, mostRecentApprovalDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayAgeRangeDeclarationResult)) {
            return false;
        }
        PlayAgeRangeDeclarationResult playAgeRangeDeclarationResult = (PlayAgeRangeDeclarationResult) other;
        return Objects.deepEquals(Boolean.valueOf(this.isEligible), Boolean.valueOf(playAgeRangeDeclarationResult.isEligible)) && Objects.deepEquals(this.installId, playAgeRangeDeclarationResult.installId) && Objects.deepEquals(this.userStatus, playAgeRangeDeclarationResult.userStatus) && Objects.deepEquals(this.error, playAgeRangeDeclarationResult.error) && Objects.deepEquals(this.ageLower, playAgeRangeDeclarationResult.ageLower) && Objects.deepEquals(this.ageUpper, playAgeRangeDeclarationResult.ageUpper) && Objects.deepEquals(this.mostRecentApprovalDate, playAgeRangeDeclarationResult.mostRecentApprovalDate);
    }

    public final Double getAgeLower() {
        return this.ageLower;
    }

    public final Double getAgeUpper() {
        return this.ageUpper;
    }

    public final String getError() {
        return this.error;
    }

    public final String getInstallId() {
        return this.installId;
    }

    public final String getMostRecentApprovalDate() {
        return this.mostRecentApprovalDate;
    }

    public final PlayAgeRangeDeclarationUserStatus getUserStatus() {
        return this.userStatus;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{Boolean.valueOf(this.isEligible), this.installId, this.userStatus, this.error, this.ageLower, this.ageUpper, this.mostRecentApprovalDate});
    }

    public final boolean isEligible() {
        return this.isEligible;
    }

    @NotNull
    public String toString() {
        boolean z5 = this.isEligible;
        String str = this.installId;
        PlayAgeRangeDeclarationUserStatus playAgeRangeDeclarationUserStatus = this.userStatus;
        String str2 = this.error;
        Double d6 = this.ageLower;
        Double d7 = this.ageUpper;
        String str3 = this.mostRecentApprovalDate;
        StringBuilder sb2 = new StringBuilder("PlayAgeRangeDeclarationResult(isEligible=");
        sb2.append(z5);
        sb2.append(", installId=");
        sb2.append(str);
        sb2.append(", userStatus=");
        sb2.append(playAgeRangeDeclarationUserStatus);
        sb2.append(", error=");
        sb2.append(str2);
        sb2.append(", ageLower=");
        sb2.append(d6);
        sb2.append(", ageUpper=");
        sb2.append(d7);
        sb2.append(", mostRecentApprovalDate=");
        return com.discord.chat.presentation.list.a.k(sb2, str3, ")");
    }
}
