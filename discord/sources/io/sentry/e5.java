package io.sentry;

import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class e5 extends j4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Date f12640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12641e;

    public e5(Date date, long j) {
        this.f12640d = date;
        this.f12641e = j;
    }

    @Override // io.sentry.j4, java.lang.Comparable
    /* JADX INFO: renamed from: a */
    public final int compareTo(j4 j4Var) {
        if (!(j4Var instanceof e5)) {
            return super.compareTo(j4Var);
        }
        e5 e5Var = (e5) j4Var;
        long time = this.f12640d.getTime();
        long time2 = e5Var.f12640d.getTime();
        return time == time2 ? Long.valueOf(this.f12641e).compareTo(Long.valueOf(e5Var.f12641e)) : Long.valueOf(time).compareTo(Long.valueOf(time2));
    }

    @Override // io.sentry.j4
    public final long b(j4 j4Var) {
        return j4Var instanceof e5 ? this.f12641e - ((e5) j4Var).f12641e : super.b(j4Var);
    }

    @Override // io.sentry.j4
    public final long c(j4 j4Var) {
        if (j4Var == null || !(j4Var instanceof e5)) {
            return super.c(j4Var);
        }
        e5 e5Var = (e5) j4Var;
        long j = e5Var.f12641e;
        int iCompareTo = compareTo(j4Var);
        long j5 = this.f12641e;
        if (iCompareTo < 0) {
            return d() + (j - j5);
        }
        return e5Var.d() + (j5 - j);
    }

    @Override // io.sentry.j4
    public final long d() {
        return this.f12640d.getTime() * 1000000;
    }

    public e5() {
        this(io.sentry.config.a.y(), System.nanoTime());
    }
}
