package com.discord.native_experiments;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/discord/native_experiments/FrescoMemoryCacheExperimentBootstrap;", "", "<init>", "()V", "EXPERIMENT_ID", "", "defaultSettings", "Lcom/discord/native_experiments/FrescoMemoryCacheExperimentSettings;", "fromTreatmentId", "rawTreatmentId", "", "native_experiments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFrescoMemoryCacheExperimentBootstrap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrescoMemoryCacheExperimentBootstrap.kt\ncom/discord/native_experiments/FrescoMemoryCacheExperimentBootstrap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
public final class FrescoMemoryCacheExperimentBootstrap {

    @NotNull
    public static final String EXPERIMENT_ID = "2026-02-android-fresco-cache";

    @NotNull
    public static final FrescoMemoryCacheExperimentBootstrap INSTANCE = new FrescoMemoryCacheExperimentBootstrap();

    @NotNull
    private static final FrescoMemoryCacheExperimentSettings defaultSettings = new FrescoMemoryCacheExperimentSettings(0, 0, false, false);

    private FrescoMemoryCacheExperimentBootstrap() {
    }

    @NotNull
    public final FrescoMemoryCacheExperimentSettings fromTreatmentId(int rawTreatmentId) {
        Integer numValueOf = Integer.valueOf(rawTreatmentId);
        int iIntValue = numValueOf.intValue();
        if (iIntValue < 0 || iIntValue >= 3) {
            numValueOf = null;
        }
        int iIntValue2 = numValueOf != null ? numValueOf.intValue() : 0;
        if (iIntValue2 != 1) {
            return iIntValue2 != 2 ? defaultSettings : FrescoMemoryCacheExperimentSettings.copy$default(defaultSettings, 2, 0, true, false, 10, null);
        }
        return FrescoMemoryCacheExperimentSettings.copy$default(defaultSettings, 1, 70, false, false, 12, null);
    }
}
