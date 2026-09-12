package od;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17206e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f17207i;

    public b(long j, long j5) {
        this.f17205d = j;
        this.f17206e = j5;
        this.f17207i = j - 1;
    }

    public final void a() {
        long j = this.f17207i;
        if (j < this.f17205d || j > this.f17206e) {
            throw new NoSuchElementException();
        }
    }

    @Override // od.m
    public final boolean next() {
        long j = this.f17207i + 1;
        this.f17207i = j;
        return !(j > this.f17206e);
    }
}
