package j8;

import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.common.internal.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13678b;

    public /* synthetic */ c(int i7, Object obj) {
        this.f13677a = i7;
        this.f13678b = obj;
    }

    @Override // com.facebook.common.internal.Supplier
    public final Object get() {
        switch (this.f13677a) {
            case 0:
                DiskCacheConfig diskCacheConfig = (DiskCacheConfig) this.f13678b;
                diskCacheConfig.j.getClass();
                return diskCacheConfig.j.getApplicationContext().getCacheDir();
            default:
                return this.f13678b;
        }
    }
}
