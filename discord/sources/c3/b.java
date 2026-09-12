package c3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f3432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f3433e;

    public b(List columnNames, List referenceColumnNames, String referenceTable, String onDelete, String onUpdate) {
        Intrinsics.checkNotNullParameter(referenceTable, "referenceTable");
        Intrinsics.checkNotNullParameter(onDelete, "onDelete");
        Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
        Intrinsics.checkNotNullParameter(columnNames, "columnNames");
        Intrinsics.checkNotNullParameter(referenceColumnNames, "referenceColumnNames");
        this.f3429a = referenceTable;
        this.f3430b = onDelete;
        this.f3431c = onUpdate;
        this.f3432d = columnNames;
        this.f3433e = referenceColumnNames;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Intrinsics.areEqual(this.f3429a, bVar.f3429a) && Intrinsics.areEqual(this.f3430b, bVar.f3430b) && Intrinsics.areEqual(this.f3431c, bVar.f3431c) && Intrinsics.areEqual(this.f3432d, bVar.f3432d)) {
            return Intrinsics.areEqual(this.f3433e, bVar.f3433e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3433e.hashCode() + a3.e.f(this.f3432d, a3.e.d(a3.e.d(this.f3429a.hashCode() * 31, 31, this.f3430b), 31, this.f3431c), 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f3429a + "', onDelete='" + this.f3430b + " +', onUpdate='" + this.f3431c + "', columnNames=" + this.f3432d + ", referenceColumnNames=" + this.f3433e + '}';
    }
}
