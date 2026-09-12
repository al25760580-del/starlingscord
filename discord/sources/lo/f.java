package lo;

import java.util.NoSuchElementException;
import kotlin.collections.t0;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends t0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15163e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15164i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f15165v;

    public f(long j, long j5, long j7) {
        this.f15162d = j7;
        this.f15163e = j5;
        boolean z5 = false;
        if (j7 <= 0 ? j >= j5 : j <= j5) {
            z5 = true;
        }
        this.f15164i = z5;
        this.f15165v = z5 ? j : j5;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15164i;
    }

    @Override // kotlin.collections.t0
    public final long nextLong() {
        long j = this.f15165v;
        if (j != this.f15163e) {
            this.f15165v = this.f15162d + j;
            return j;
        }
        if (!this.f15164i) {
            throw new NoSuchElementException();
        }
        this.f15164i = false;
        return j;
    }
}
