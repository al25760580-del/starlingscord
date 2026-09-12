package c3;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f3440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f3441d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public d(String name, boolean z5, List columns, List orders) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.f3438a = name;
        this.f3439b = z5;
        this.f3440c = columns;
        this.f3441d = orders;
        if (orders.isEmpty()) {
            int size = columns.size();
            orders = new ArrayList(size);
            for (int i7 = 0; i7 < size; i7++) {
                orders.add("ASC");
            }
        }
        this.f3441d = orders;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = dVar.f3438a;
            if (this.f3439b == dVar.f3439b && Intrinsics.areEqual(this.f3440c, dVar.f3440c) && Intrinsics.areEqual(this.f3441d, dVar.f3441d)) {
                String str2 = this.f3438a;
                return x.o(str2, "index_", false) ? x.o(str, "index_", false) : Intrinsics.areEqual(str2, str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f3438a;
        return this.f3441d.hashCode() + a3.e.f(this.f3440c, (((x.o(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.f3439b ? 1 : 0)) * 31, 31);
    }

    public final String toString() {
        return "Index{name='" + this.f3438a + "', unique=" + this.f3439b + ", columns=" + this.f3440c + ", orders=" + this.f3441d + "'}";
    }
}
