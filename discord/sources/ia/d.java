package ia;

import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.core.DefaultExecutorSupplier;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import ga.k;
import kotlin.jvm.internal.Intrinsics;
import pa.u;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.sentry.hints.j f11422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f11423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f11424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f11425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DiskCacheConfig f11426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final DiskCacheConfig f11427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f11428g;

    public d(io.sentry.hints.j fileCacheFactory, ImagePipelineConfig config) {
        Intrinsics.checkNotNullParameter(fileCacheFactory, "fileCacheFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        u poolFactory = config.f4853n;
        DefaultExecutorSupplier executorSupplier = config.f4849h;
        k imageCacheStatsTracker = config.f4850i;
        DiskCacheConfig mainDiskCacheConfig = config.k;
        DiskCacheConfig smallImageDiskCacheConfig = config.f4859t;
        Intrinsics.checkNotNullParameter(fileCacheFactory, "fileCacheFactory");
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        Intrinsics.checkNotNullParameter(executorSupplier, "executorSupplier");
        Intrinsics.checkNotNullParameter(imageCacheStatsTracker, "imageCacheStatsTracker");
        Intrinsics.checkNotNullParameter(mainDiskCacheConfig, "mainDiskCacheConfig");
        Intrinsics.checkNotNullParameter(smallImageDiskCacheConfig, "smallImageDiskCacheConfig");
        this.f11422a = fileCacheFactory;
        this.f11423b = poolFactory;
        this.f11424c = executorSupplier;
        this.f11425d = imageCacheStatsTracker;
        this.f11426e = mainDiskCacheConfig;
        this.f11427f = smallImageDiskCacheConfig;
        this.f11428g = l.a(m.f19485d, new a(this, 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.facebook.common.internal.Supplier
    public final Object get() {
        return (c) this.f11428g.getValue();
    }
}
