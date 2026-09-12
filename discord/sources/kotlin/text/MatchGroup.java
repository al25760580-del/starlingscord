package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/MatchGroup;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MatchGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntRange f14704b;

    public MatchGroup(String value, IntRange range) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(range, "range");
        this.f14703a = value;
        this.f14704b = range;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchGroup)) {
            return false;
        }
        MatchGroup matchGroup = (MatchGroup) obj;
        return Intrinsics.areEqual(this.f14703a, matchGroup.f14703a) && Intrinsics.areEqual(this.f14704b, matchGroup.f14704b);
    }

    public final int hashCode() {
        return this.f14704b.hashCode() + (this.f14703a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f14703a + ", range=" + this.f14704b + ')';
    }
}
