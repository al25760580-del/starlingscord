package rn;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final d0 f19470e = new d0(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f19471d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.compare(this.f19471d ^ Long.MIN_VALUE, ((e0) obj).f19471d ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e0) {
            return this.f19471d == ((e0) obj).f19471d;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19471d);
    }

    public final String toString() {
        long j = this.f19471d;
        if (j >= 0) {
            String string = Long.toString(j, CharsKt.checkRadix(10));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        long j5 = 10;
        long j7 = ((j >>> 1) / j5) << 1;
        long j10 = j - (j7 * j5);
        if (j10 >= j5) {
            j10 -= j5;
            j7++;
        }
        StringBuilder sb2 = new StringBuilder();
        String string2 = Long.toString(j7, CharsKt.checkRadix(10));
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sb2.append(string2);
        String string3 = Long.toString(j10, CharsKt.checkRadix(10));
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        sb2.append(string3);
        return sb2.toString();
    }
}
