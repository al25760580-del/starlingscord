package com.discord.native_experiments;

import a3.e;
import com.discord.chat.presentation.list.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/discord/native_experiments/FrescoMemoryCacheExperimentSettings;", "", "treatmentId", "", "reductionPercent", "disableLowPriorityMemoryCache", "", "useDiskCacheRouting", "<init>", "(IIZZ)V", "getTreatmentId", "()I", "getReductionPercent", "getDisableLowPriorityMemoryCache", "()Z", "getUseDiskCacheRouting", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "native_experiments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class FrescoMemoryCacheExperimentSettings {
    private final boolean disableLowPriorityMemoryCache;
    private final int reductionPercent;
    private final int treatmentId;
    private final boolean useDiskCacheRouting;

    public FrescoMemoryCacheExperimentSettings(int i7, int i10, boolean z5, boolean z6) {
        this.treatmentId = i7;
        this.reductionPercent = i10;
        this.disableLowPriorityMemoryCache = z5;
        this.useDiskCacheRouting = z6;
    }

    public static /* synthetic */ FrescoMemoryCacheExperimentSettings copy$default(FrescoMemoryCacheExperimentSettings frescoMemoryCacheExperimentSettings, int i7, int i10, boolean z5, boolean z6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = frescoMemoryCacheExperimentSettings.treatmentId;
        }
        if ((i11 & 2) != 0) {
            i10 = frescoMemoryCacheExperimentSettings.reductionPercent;
        }
        if ((i11 & 4) != 0) {
            z5 = frescoMemoryCacheExperimentSettings.disableLowPriorityMemoryCache;
        }
        if ((i11 & 8) != 0) {
            z6 = frescoMemoryCacheExperimentSettings.useDiskCacheRouting;
        }
        return frescoMemoryCacheExperimentSettings.copy(i7, i10, z5, z6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTreatmentId() {
        return this.treatmentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getReductionPercent() {
        return this.reductionPercent;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getDisableLowPriorityMemoryCache() {
        return this.disableLowPriorityMemoryCache;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getUseDiskCacheRouting() {
        return this.useDiskCacheRouting;
    }

    @NotNull
    public final FrescoMemoryCacheExperimentSettings copy(int treatmentId, int reductionPercent, boolean disableLowPriorityMemoryCache, boolean useDiskCacheRouting) {
        return new FrescoMemoryCacheExperimentSettings(treatmentId, reductionPercent, disableLowPriorityMemoryCache, useDiskCacheRouting);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrescoMemoryCacheExperimentSettings)) {
            return false;
        }
        FrescoMemoryCacheExperimentSettings frescoMemoryCacheExperimentSettings = (FrescoMemoryCacheExperimentSettings) other;
        return this.treatmentId == frescoMemoryCacheExperimentSettings.treatmentId && this.reductionPercent == frescoMemoryCacheExperimentSettings.reductionPercent && this.disableLowPriorityMemoryCache == frescoMemoryCacheExperimentSettings.disableLowPriorityMemoryCache && this.useDiskCacheRouting == frescoMemoryCacheExperimentSettings.useDiskCacheRouting;
    }

    public final boolean getDisableLowPriorityMemoryCache() {
        return this.disableLowPriorityMemoryCache;
    }

    public final int getReductionPercent() {
        return this.reductionPercent;
    }

    public final int getTreatmentId() {
        return this.treatmentId;
    }

    public final boolean getUseDiskCacheRouting() {
        return this.useDiskCacheRouting;
    }

    public int hashCode() {
        return Boolean.hashCode(this.useDiskCacheRouting) + a.g(a.u(this.reductionPercent, Integer.hashCode(this.treatmentId) * 31, 31), 31, this.disableLowPriorityMemoryCache);
    }

    @NotNull
    public String toString() {
        int i7 = this.treatmentId;
        int i10 = this.reductionPercent;
        boolean z5 = this.disableLowPriorityMemoryCache;
        boolean z6 = this.useDiskCacheRouting;
        StringBuilder sbR = e.r(i7, "FrescoMemoryCacheExperimentSettings(treatmentId=", i10, ", reductionPercent=", ", disableLowPriorityMemoryCache=");
        sbR.append(z5);
        sbR.append(", useDiskCacheRouting=");
        sbR.append(z6);
        sbR.append(")");
        return sbR.toString();
    }
}
