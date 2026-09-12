package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j4 implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(j4 j4Var) {
        return Long.valueOf(d()).compareTo(Long.valueOf(j4Var.d()));
    }

    public long b(j4 j4Var) {
        return d() - j4Var.d();
    }

    public long c(j4 j4Var) {
        return (j4Var == null || compareTo(j4Var) >= 0) ? d() : j4Var.d();
    }

    public abstract long d();
}
