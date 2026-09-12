package k1;

import android.util.SparseBooleanArray;
import kotlin.collections.s0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends s0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ SparseBooleanArray f14226e;

    public c(SparseBooleanArray sparseBooleanArray) {
        this.f14226e = sparseBooleanArray;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14225d < this.f14226e.size();
    }

    @Override // kotlin.collections.s0
    public final int nextInt() {
        SparseBooleanArray sparseBooleanArray = this.f14226e;
        int i7 = this.f14225d;
        this.f14225d = i7 + 1;
        return sparseBooleanArray.keyAt(i7);
    }
}
