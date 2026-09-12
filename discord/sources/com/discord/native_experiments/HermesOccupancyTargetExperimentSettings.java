package com.discord.native_experiments;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/discord/native_experiments/HermesOccupancyTargetExperimentSettings;", "", "state", "Lcom/discord/native_experiments/HermesOccupancyTargetExperimentState;", "treatmentId", "", "<init>", "(Lcom/discord/native_experiments/HermesOccupancyTargetExperimentState;Ljava/lang/Integer;)V", "getState", "()Lcom/discord/native_experiments/HermesOccupancyTargetExperimentState;", "getTreatmentId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "useOccupancyTarget75", "", "getUseOccupancyTarget75", "()Z", "isApplied", "component1", "component2", "copy", "(Lcom/discord/native_experiments/HermesOccupancyTargetExperimentState;Ljava/lang/Integer;)Lcom/discord/native_experiments/HermesOccupancyTargetExperimentSettings;", "equals", "other", "hashCode", "toString", "", "native_experiments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class HermesOccupancyTargetExperimentSettings {

    @NotNull
    private final HermesOccupancyTargetExperimentState state;
    private final Integer treatmentId;

    public HermesOccupancyTargetExperimentSettings(@NotNull HermesOccupancyTargetExperimentState state, Integer num) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.treatmentId = num;
    }

    public static /* synthetic */ HermesOccupancyTargetExperimentSettings copy$default(HermesOccupancyTargetExperimentSettings hermesOccupancyTargetExperimentSettings, HermesOccupancyTargetExperimentState hermesOccupancyTargetExperimentState, Integer num, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            hermesOccupancyTargetExperimentState = hermesOccupancyTargetExperimentSettings.state;
        }
        if ((i7 & 2) != 0) {
            num = hermesOccupancyTargetExperimentSettings.treatmentId;
        }
        return hermesOccupancyTargetExperimentSettings.copy(hermesOccupancyTargetExperimentState, num);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HermesOccupancyTargetExperimentState getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getTreatmentId() {
        return this.treatmentId;
    }

    @NotNull
    public final HermesOccupancyTargetExperimentSettings copy(@NotNull HermesOccupancyTargetExperimentState state, Integer treatmentId) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new HermesOccupancyTargetExperimentSettings(state, treatmentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HermesOccupancyTargetExperimentSettings)) {
            return false;
        }
        HermesOccupancyTargetExperimentSettings hermesOccupancyTargetExperimentSettings = (HermesOccupancyTargetExperimentSettings) other;
        return this.state == hermesOccupancyTargetExperimentSettings.state && Intrinsics.areEqual(this.treatmentId, hermesOccupancyTargetExperimentSettings.treatmentId);
    }

    @NotNull
    public final HermesOccupancyTargetExperimentState getState() {
        return this.state;
    }

    public final Integer getTreatmentId() {
        return this.treatmentId;
    }

    public final boolean getUseOccupancyTarget75() {
        return this.state == HermesOccupancyTargetExperimentState.TREATMENT;
    }

    public int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        Integer num = this.treatmentId;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final boolean isApplied() {
        return this.state != HermesOccupancyTargetExperimentState.UNAVAILABLE;
    }

    @NotNull
    public String toString() {
        return "HermesOccupancyTargetExperimentSettings(state=" + this.state + ", treatmentId=" + this.treatmentId + ")";
    }
}
