package yq;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.time.Duration;
import kotlin.time.TimeMark;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements TimeMark, Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23516d;

    public /* synthetic */ g(long j) {
        this.f23516d = j;
    }

    @Override // kotlin.time.TimeMark
    public final long a() {
        f.f23514a.getClass();
        long jNanoTime = System.nanoTime() - f.f23515b;
        d unit = d.NANOSECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        long j = this.f23516d;
        return (1 | (j - 1)) == LongCompanionObject.MAX_VALUE ? Duration.m(e4.f.M(j)) : e4.f.s0(jNanoTime, j, unit);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long jM;
        g other = (g) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(other, "other");
        long j = this.f23516d;
        if (other == null) {
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) ("ValueTimeMark(reading=" + j + ')')) + " and " + other);
        }
        long j5 = other.f23516d;
        f.f23514a.getClass();
        d unit = d.NANOSECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (((j5 - 1) | 1) != LongCompanionObject.MAX_VALUE) {
            jM = (1 | (j - 1)) == LongCompanionObject.MAX_VALUE ? e4.f.M(j) : e4.f.s0(j, j5, unit);
        } else if (j == j5) {
            Duration.f14747e.getClass();
            jM = 0;
        } else {
            jM = Duration.m(e4.f.M(j5));
        }
        Duration.f14747e.getClass();
        return Duration.c(jM, 0L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f23516d == ((g) obj).f23516d;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23516d);
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.f23516d + ')';
    }
}
