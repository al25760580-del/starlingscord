package com.discord.image.fresco.config;

import android.app.ActivityManager;
import android.content.Context;
import com.discord.native_experiments.FrescoMemoryCacheExperimentConfig;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import ga.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/discord/image/fresco/config/FrescoBitmapSupplier;", "Lga/f;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/facebook/imagepipeline/cache/MemoryCacheParams;", "get", "()Lcom/facebook/imagepipeline/cache/MemoryCacheParams;", "Companion", "fresco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FrescoBitmapSupplier extends f {
    private static final int MAX_BITMAP_MEM_CACHE_SIZE_RATIO = 3;

    /* JADX WARN: Illegal instructions before constructor call */
    public FrescoBitmapSupplier(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        super((ActivityManager) systemService);
    }

    @Override // ga.f, com.facebook.common.internal.Supplier
    @NotNull
    public MemoryCacheParams get() {
        int iApplyReduction = FrescoMemoryCacheExperimentConfig.INSTANCE.applyReduction(super.get().f4800a);
        return new MemoryCacheParams(iApplyReduction, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, Integer.MAX_VALUE, iApplyReduction / 3);
    }
}
