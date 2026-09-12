package kotlin.ranges;

import kotlin.Metadata;
import lo.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/a;", "", "", "w", "lo/c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IntRange extends a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final c f14685w = new c(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final IntRange f14686x = new IntRange(1, 0, 1);

    @Override // kotlin.ranges.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof IntRange)) {
            return false;
        }
        if (isEmpty() && ((IntRange) obj).isEmpty()) {
            return true;
        }
        IntRange intRange = (IntRange) obj;
        return this.f14688d == intRange.f14688d && this.f14689e == intRange.f14689e;
    }

    @Override // kotlin.ranges.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f14688d * 31) + this.f14689e;
    }

    @Override // kotlin.ranges.a
    public final boolean isEmpty() {
        return this.f14688d > this.f14689e;
    }

    @Override // kotlin.ranges.a
    public final String toString() {
        return this.f14688d + ".." + this.f14689e;
    }
}
