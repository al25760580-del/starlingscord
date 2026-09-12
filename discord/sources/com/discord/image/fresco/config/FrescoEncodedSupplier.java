package com.discord.image.fresco.config;

import com.discord.native_experiments.FrescoMemoryCacheExperimentConfig;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import ga.g;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/discord/image/fresco/config/FrescoEncodedSupplier;", "Lga/g;", "<init>", "()V", "Lcom/facebook/imagepipeline/cache/MemoryCacheParams;", "get", "()Lcom/facebook/imagepipeline/cache/MemoryCacheParams;", "fresco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FrescoEncodedSupplier extends g {
    @Override // ga.g, com.facebook.common.internal.Supplier
    @NotNull
    public MemoryCacheParams get() {
        MemoryCacheParams memoryCacheParams = super.get();
        FrescoMemoryCacheExperimentConfig frescoMemoryCacheExperimentConfig = FrescoMemoryCacheExperimentConfig.INSTANCE;
        return new MemoryCacheParams(frescoMemoryCacheExperimentConfig.applyReduction(memoryCacheParams.f4800a), Integer.MAX_VALUE, frescoMemoryCacheExperimentConfig.applyReduction(memoryCacheParams.f4802c), frescoMemoryCacheExperimentConfig.applyReduction(memoryCacheParams.f4804e));
    }
}
