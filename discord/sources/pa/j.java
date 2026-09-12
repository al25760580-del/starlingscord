package pa;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f17822a = new SparseIntArray(0);

    public static final v a() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return new v(0, iMin > 16777216 ? (iMin / 4) * 3 : iMin / 2, f17822a, -1);
    }
}
