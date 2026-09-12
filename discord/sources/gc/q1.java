package gc;

import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q1 f9828c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9830b;

    static {
        q1 q1Var = new q1(0L, 0L);
        new q1(LongCompanionObject.MAX_VALUE, LongCompanionObject.MAX_VALUE);
        new q1(LongCompanionObject.MAX_VALUE, 0L);
        new q1(0L, LongCompanionObject.MAX_VALUE);
        f9828c = q1Var;
    }

    public q1(long j, long j5) {
        je.b.g(j >= 0);
        je.b.g(j5 >= 0);
        this.f9829a = j;
        this.f9830b = j5;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005d A[RETURN] */
    public final long a(long j, long j5, long j7) {
        long j10 = this.f9829a;
        long j11 = this.f9830b;
        if (j10 == 0 && j11 == 0) {
            return j;
        }
        int i7 = je.e0.f13788a;
        long j12 = j - j10;
        if (((j10 ^ j) & (j ^ j12)) < 0) {
            j12 = Long.MIN_VALUE;
        }
        long j13 = j + j11;
        if (((j11 ^ j13) & (j ^ j13)) < 0) {
            j13 = LongCompanionObject.MAX_VALUE;
        }
        boolean z5 = false;
        boolean z6 = j12 <= j5 && j5 <= j13;
        if (j12 <= j7 && j7 <= j13) {
            z5 = true;
        }
        if (z6 && z5) {
            if (Math.abs(j5 - j) <= Math.abs(j7 - j)) {
                return j5;
            }
            return j7;
        }
        if (!z6) {
            if (z5) {
                return j7;
            }
            return j12;
        }
        return j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q1.class == obj.getClass()) {
            q1 q1Var = (q1) obj;
            if (this.f9829a == q1Var.f9829a && this.f9830b == q1Var.f9830b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f9829a) * 31) + ((int) this.f9830b);
    }
}
