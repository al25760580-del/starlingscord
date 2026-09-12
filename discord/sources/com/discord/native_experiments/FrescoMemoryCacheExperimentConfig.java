package com.discord.native_experiments;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0007J\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/discord/native_experiments/FrescoMemoryCacheExperimentConfig;", "", "<init>", "()V", "reductionPercent", "", "useDiskCacheRouting", "", "disableLowPriorityMemoryCache", "configureReductionPercent", "", "percent", "configureDiskCacheRoutingEnabled", ViewProps.ENABLED, "configureDisableLowPriorityMemoryCache", "getReductionPercent", "hasRequestPolicyOverrides", "applyReduction", "value", "PERCENT_BASE", "MIN_CACHE_SIZE", "", "native_experiments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FrescoMemoryCacheExperimentConfig {

    @NotNull
    public static final FrescoMemoryCacheExperimentConfig INSTANCE = new FrescoMemoryCacheExperimentConfig();
    private static final long MIN_CACHE_SIZE = 1;
    private static final int PERCENT_BASE = 100;
    private static volatile boolean disableLowPriorityMemoryCache;
    private static volatile int reductionPercent;
    private static volatile boolean useDiskCacheRouting;

    private FrescoMemoryCacheExperimentConfig() {
    }

    public final int applyReduction(int value) {
        long j = (((long) value) * ((long) (100 - reductionPercent))) / ((long) 100);
        if (j < 1) {
            j = 1;
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return (int) j;
    }

    public final void configureDisableLowPriorityMemoryCache(boolean enabled) {
        disableLowPriorityMemoryCache = enabled;
    }

    public final void configureDiskCacheRoutingEnabled(boolean enabled) {
        useDiskCacheRouting = enabled;
    }

    public final void configureReductionPercent(int percent) {
        if (percent != 70) {
            percent = 0;
        }
        reductionPercent = percent;
    }

    public final boolean disableLowPriorityMemoryCache() {
        return disableLowPriorityMemoryCache;
    }

    public final int getReductionPercent() {
        return reductionPercent;
    }

    public final boolean hasRequestPolicyOverrides() {
        return useDiskCacheRouting || disableLowPriorityMemoryCache;
    }

    public final boolean useDiskCacheRouting() {
        return useDiskCacheRouting;
    }
}
