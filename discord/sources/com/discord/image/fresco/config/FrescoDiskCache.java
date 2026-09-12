package com.discord.image.fresco.config;

import android.content.Context;
import com.facebook.cache.disk.DiskCacheConfig;
import j8.c;
import j8.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\t\u001a\u00020\n*\u00020\u000bJ\n\u0010\f\u001a\u00020\n*\u00020\u000bJ\u0014\u0010\r\u001a\u00020\n*\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/image/fresco/config/FrescoDiskCache;", "", "<init>", "()V", "MAX_DISK_CACHE_SIZE", "", "CACHE_DIR", "", "CACHE_DIR_SMALL", "newRegularDiskCache", "Lcom/facebook/cache/disk/DiskCacheConfig;", "Landroid/content/Context;", "newSmallDiskCache", "newDiskCacheConfig", "directoryName", "fresco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FrescoDiskCache {

    @NotNull
    private static final String CACHE_DIR = "app_images_cache";

    @NotNull
    private static final String CACHE_DIR_SMALL = "app_images_cache_small";

    @NotNull
    public static final FrescoDiskCache INSTANCE = new FrescoDiskCache();
    private static final long MAX_DISK_CACHE_SIZE = 62914560;

    private FrescoDiskCache() {
    }

    private final DiskCacheConfig newDiskCacheConfig(Context context, String str) {
        d dVar = new d(context);
        dVar.f13681c = new c(1, context.getCacheDir());
        dVar.f13680b = str;
        dVar.f13679a = MAX_DISK_CACHE_SIZE;
        DiskCacheConfig diskCacheConfig = new DiskCacheConfig(dVar);
        Intrinsics.checkNotNullExpressionValue(diskCacheConfig, "build(...)");
        return diskCacheConfig;
    }

    @NotNull
    public final DiskCacheConfig newRegularDiskCache(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return newDiskCacheConfig(context, CACHE_DIR);
    }

    @NotNull
    public final DiskCacheConfig newSmallDiskCache(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return newDiskCacheConfig(context, CACHE_DIR_SMALL);
    }
}
