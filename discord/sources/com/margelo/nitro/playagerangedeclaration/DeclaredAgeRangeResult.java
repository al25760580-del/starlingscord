package com.margelo.nitro.playagerangedeclaration;

import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@xa.a
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013JH\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010 J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013¨\u0006#"}, d2 = {"Lcom/margelo/nitro/playagerangedeclaration/DeclaredAgeRangeResult;", "", "isEligible", "", "status", "Lcom/margelo/nitro/playagerangedeclaration/AppleAgeRangeDeclarationUserStatusValues;", "parentControls", "", "lowerBound", "", "upperBound", "<init>", "(ZLcom/margelo/nitro/playagerangedeclaration/AppleAgeRangeDeclarationUserStatusValues;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "()Z", "getStatus", "()Lcom/margelo/nitro/playagerangedeclaration/AppleAgeRangeDeclarationUserStatusValues;", "getParentControls", "()Ljava/lang/String;", "getLowerBound", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getUpperBound", "equals", "other", "hashCode", "", "component1", "component2", "component3", "component4", "component5", "copy", "(ZLcom/margelo/nitro/playagerangedeclaration/AppleAgeRangeDeclarationUserStatusValues;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lcom/margelo/nitro/playagerangedeclaration/DeclaredAgeRangeResult;", "toString", "Companion", "react-native-play-age-range-declaration_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DeclaredAgeRangeResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @xa.a
    @Keep
    private final boolean isEligible;

    @xa.a
    @Keep
    private final Double lowerBound;

    @xa.a
    @Keep
    private final String parentControls;

    @xa.a
    @Keep
    private final AppleAgeRangeDeclarationUserStatusValues status;

    @xa.a
    @Keep
    private final Double upperBound;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J?\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/margelo/nitro/playagerangedeclaration/DeclaredAgeRangeResult$Companion;", "", "", "isEligible", "Lcom/margelo/nitro/playagerangedeclaration/AppleAgeRangeDeclarationUserStatusValues;", "status", "", "parentControls", "", "lowerBound", "upperBound", "Lcom/margelo/nitro/playagerangedeclaration/DeclaredAgeRangeResult;", "fromCpp", "(ZLcom/margelo/nitro/playagerangedeclaration/AppleAgeRangeDeclarationUserStatusValues;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lcom/margelo/nitro/playagerangedeclaration/DeclaredAgeRangeResult;", "react-native-play-age-range-declaration_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        @xa.a
        @Keep
        public final DeclaredAgeRangeResult fromCpp(boolean isEligible, AppleAgeRangeDeclarationUserStatusValues status, String parentControls, Double lowerBound, Double upperBound) {
            return new DeclaredAgeRangeResult(isEligible, status, parentControls, lowerBound, upperBound);
        }
    }

    public DeclaredAgeRangeResult(boolean z5, AppleAgeRangeDeclarationUserStatusValues appleAgeRangeDeclarationUserStatusValues, String str, Double d6, Double d7) {
        this.isEligible = z5;
        this.status = appleAgeRangeDeclarationUserStatusValues;
        this.parentControls = str;
        this.lowerBound = d6;
        this.upperBound = d7;
    }

    public static /* synthetic */ DeclaredAgeRangeResult copy$default(DeclaredAgeRangeResult declaredAgeRangeResult, boolean z5, AppleAgeRangeDeclarationUserStatusValues appleAgeRangeDeclarationUserStatusValues, String str, Double d6, Double d7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z5 = declaredAgeRangeResult.isEligible;
        }
        if ((i7 & 2) != 0) {
            appleAgeRangeDeclarationUserStatusValues = declaredAgeRangeResult.status;
        }
        if ((i7 & 4) != 0) {
            str = declaredAgeRangeResult.parentControls;
        }
        if ((i7 & 8) != 0) {
            d6 = declaredAgeRangeResult.lowerBound;
        }
        if ((i7 & 16) != 0) {
            d7 = declaredAgeRangeResult.upperBound;
        }
        Double d8 = d7;
        String str2 = str;
        return declaredAgeRangeResult.copy(z5, appleAgeRangeDeclarationUserStatusValues, str2, d6, d8);
    }

    @xa.a
    @Keep
    private static final DeclaredAgeRangeResult fromCpp(boolean z5, AppleAgeRangeDeclarationUserStatusValues appleAgeRangeDeclarationUserStatusValues, String str, Double d6, Double d7) {
        return INSTANCE.fromCpp(z5, appleAgeRangeDeclarationUserStatusValues, str, d6, d7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsEligible() {
        return this.isEligible;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AppleAgeRangeDeclarationUserStatusValues getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getParentControls() {
        return this.parentControls;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getLowerBound() {
        return this.lowerBound;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getUpperBound() {
        return this.upperBound;
    }

    @NotNull
    public final DeclaredAgeRangeResult copy(boolean isEligible, AppleAgeRangeDeclarationUserStatusValues status, String parentControls, Double lowerBound, Double upperBound) {
        return new DeclaredAgeRangeResult(isEligible, status, parentControls, lowerBound, upperBound);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeclaredAgeRangeResult)) {
            return false;
        }
        DeclaredAgeRangeResult declaredAgeRangeResult = (DeclaredAgeRangeResult) other;
        return Objects.deepEquals(Boolean.valueOf(this.isEligible), Boolean.valueOf(declaredAgeRangeResult.isEligible)) && Objects.deepEquals(this.status, declaredAgeRangeResult.status) && Objects.deepEquals(this.parentControls, declaredAgeRangeResult.parentControls) && Objects.deepEquals(this.lowerBound, declaredAgeRangeResult.lowerBound) && Objects.deepEquals(this.upperBound, declaredAgeRangeResult.upperBound);
    }

    public final Double getLowerBound() {
        return this.lowerBound;
    }

    public final String getParentControls() {
        return this.parentControls;
    }

    public final AppleAgeRangeDeclarationUserStatusValues getStatus() {
        return this.status;
    }

    public final Double getUpperBound() {
        return this.upperBound;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{Boolean.valueOf(this.isEligible), this.status, this.parentControls, this.lowerBound, this.upperBound});
    }

    public final boolean isEligible() {
        return this.isEligible;
    }

    @NotNull
    public String toString() {
        return "DeclaredAgeRangeResult(isEligible=" + this.isEligible + ", status=" + this.status + ", parentControls=" + this.parentControls + ", lowerBound=" + this.lowerBound + ", upperBound=" + this.upperBound + ")";
    }
}
