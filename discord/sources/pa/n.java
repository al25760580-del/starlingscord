package pa;

import android.util.SparseIntArray;
import androidx.datastore.preferences.protobuf.d1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class n extends b {
    public final int[] G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q8.b memoryTrimmableRegistry, v poolParams, s poolStatsTracker) {
        super(memoryTrimmableRegistry, poolParams, poolStatsTracker);
        Intrinsics.checkNotNullParameter(memoryTrimmableRegistry, "memoryTrimmableRegistry");
        Intrinsics.checkNotNullParameter(poolParams, "poolParams");
        Intrinsics.checkNotNullParameter(poolStatsTracker, "poolStatsTracker");
        SparseIntArray sparseIntArray = poolParams.f17848c;
        if (sparseIntArray != null) {
            this.G = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                this.G[i7] = sparseIntArray.keyAt(i7);
            }
        } else {
            this.G = new int[0];
        }
        this.f17797e.getClass();
        this.F.getClass();
    }

    @Override // pa.b
    public final Object a(int i7) {
        return new byte[i7];
    }

    @Override // pa.b
    public final void c(Object obj) {
        byte[] value = (byte[]) obj;
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // pa.b
    public final int e(int i7) {
        if (i7 <= 0) {
            throw new d1(Integer.valueOf(i7));
        }
        for (int i10 : this.G) {
            if (i10 >= i7) {
                return i10;
            }
        }
        return i7;
    }

    @Override // pa.b
    public final int f(Object obj) {
        byte[] value = (byte[]) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        return value.length;
    }

    @Override // pa.b
    public final int g(int i7) {
        return i7;
    }
}
