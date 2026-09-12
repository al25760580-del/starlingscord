package ga;

import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class g implements Supplier {
    private static final int MAX_CACHE_ENTRIES = Integer.MAX_VALUE;
    private static final int MAX_EVICTION_QUEUE_ENTRIES = Integer.MAX_VALUE;
    private static final long PARAMS_CHECK_INTERVAL_MS = TimeUnit.MINUTES.toMillis(5);

    @Override // com.facebook.common.internal.Supplier
    public MemoryCacheParams get() {
        int i7;
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin < 16777216) {
            i7 = 1048576;
        } else {
            i7 = iMin < 33554432 ? 2097152 : 4194304;
        }
        int i10 = i7;
        return new MemoryCacheParams(i10, Integer.MAX_VALUE, i10, PARAMS_CHECK_INTERVAL_MS, i10 / 8);
    }
}
