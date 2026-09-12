package je;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f13801a;

    public g(SparseBooleanArray sparseBooleanArray) {
        this.f13801a = sparseBooleanArray;
    }

    public final int a(int i7) {
        SparseBooleanArray sparseBooleanArray = this.f13801a;
        b.j(i7, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        SparseBooleanArray sparseBooleanArray = gVar.f13801a;
        int i7 = e0.f13788a;
        SparseBooleanArray sparseBooleanArray2 = this.f13801a;
        if (i7 >= 24) {
            return sparseBooleanArray2.equals(sparseBooleanArray);
        }
        if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
            return false;
        }
        for (int i10 = 0; i10 < sparseBooleanArray2.size(); i10++) {
            if (a(i10) != gVar.a(i10)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i7 = e0.f13788a;
        SparseBooleanArray sparseBooleanArray = this.f13801a;
        if (i7 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            size = (size * 31) + a(i10);
        }
        return size;
    }
}
