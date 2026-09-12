package rn;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a0 f19461e = new a0(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19462d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.compare(this.f19462d ^ Integer.MIN_VALUE, ((b0) obj).f19462d ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            return this.f19462d == ((b0) obj).f19462d;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19462d);
    }

    public final String toString() {
        return String.valueOf(((long) this.f19462d) & 4294967295L);
    }
}
