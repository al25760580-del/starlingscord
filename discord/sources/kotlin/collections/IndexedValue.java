package kotlin.collections;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/collections/IndexedValue;", "T", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class IndexedValue<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14623b;

    public IndexedValue(int i7, Object obj) {
        this.f14622a = i7;
        this.f14623b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndexedValue)) {
            return false;
        }
        IndexedValue indexedValue = (IndexedValue) obj;
        return this.f14622a == indexedValue.f14622a && Intrinsics.areEqual(this.f14623b, indexedValue.f14623b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f14622a) * 31;
        Object obj = this.f14623b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f14622a + ", value=" + this.f14623b + ')';
    }
}
