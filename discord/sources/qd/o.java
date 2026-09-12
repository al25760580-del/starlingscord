package qd;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends n {
    public final List j;

    public o(j jVar, long j, long j5, long j7, long j10, List list, long j11, List list2, long j12, long j13) {
        super(jVar, j, j5, j7, j10, list, j11, j12, j13);
        this.j = list2;
    }

    @Override // qd.n
    public final long d(long j) {
        return this.j.size();
    }

    @Override // qd.n
    public final j h(k kVar, long j) {
        return (j) this.j.get((int) (j - this.f18766d));
    }

    @Override // qd.n
    public final boolean i() {
        return true;
    }
}
