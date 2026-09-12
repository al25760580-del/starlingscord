package lo;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final g f15166w = new g(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final h f15167x = new h(1, 0);

    public h(long j, long j5) {
        super(j, j5, 1L);
    }

    @Override // lo.e
    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (isEmpty() && ((h) obj).isEmpty()) {
            return true;
        }
        h hVar = (h) obj;
        return this.f15159d == hVar.f15159d && this.f15160e == hVar.f15160e;
    }

    @Override // lo.e
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.f15159d;
        long j5 = ((long) 31) * (j ^ (j >>> 32));
        long j7 = this.f15160e;
        return (int) (j5 + (j7 ^ (j7 >>> 32)));
    }

    @Override // lo.e
    public final boolean isEmpty() {
        return this.f15159d > this.f15160e;
    }

    @Override // lo.e
    public final String toString() {
        return this.f15159d + ".." + this.f15160e;
    }
}
