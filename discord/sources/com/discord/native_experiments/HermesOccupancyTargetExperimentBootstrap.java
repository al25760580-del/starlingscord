package com.discord.native_experiments;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/native_experiments/HermesOccupancyTargetExperimentBootstrap;", "", "<init>", "()V", "EXPERIMENT_ID", "", "unavailableSettings", "Lcom/discord/native_experiments/HermesOccupancyTargetExperimentSettings;", "getUnavailableSettings", "()Lcom/discord/native_experiments/HermesOccupancyTargetExperimentSettings;", "controlSettings", "treatmentSettings", "fromTreatmentId", "rawTreatmentId", "", "native_experiments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HermesOccupancyTargetExperimentBootstrap {

    @NotNull
    public static final String EXPERIMENT_ID = "2026-03-mobile-hermes-occupancy-target";

    @NotNull
    public static final HermesOccupancyTargetExperimentBootstrap INSTANCE = new HermesOccupancyTargetExperimentBootstrap();

    @NotNull
    private static final HermesOccupancyTargetExperimentSettings unavailableSettings = new HermesOccupancyTargetExperimentSettings(HermesOccupancyTargetExperimentState.UNAVAILABLE, null);

    @NotNull
    private static final HermesOccupancyTargetExperimentSettings controlSettings = new HermesOccupancyTargetExperimentSettings(HermesOccupancyTargetExperimentState.CONTROL, 0);

    @NotNull
    private static final HermesOccupancyTargetExperimentSettings treatmentSettings = new HermesOccupancyTargetExperimentSettings(HermesOccupancyTargetExperimentState.TREATMENT, 1);

    private HermesOccupancyTargetExperimentBootstrap() {
    }

    @NotNull
    public final HermesOccupancyTargetExperimentSettings fromTreatmentId(int rawTreatmentId) {
        if (rawTreatmentId != 0) {
            return rawTreatmentId != 1 ? unavailableSettings : treatmentSettings;
        }
        return controlSettings;
    }

    @NotNull
    public final HermesOccupancyTargetExperimentSettings getUnavailableSettings() {
        return unavailableSettings;
    }
}
