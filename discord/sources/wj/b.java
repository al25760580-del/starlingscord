package wj;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22310b;

    public b(int i7, ArrayList arrayList) {
        this.f22309a = new ArrayList(arrayList);
        this.f22310b = i7;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && this.f22309a.equals(((b) obj).f22309a);
    }

    public final int hashCode() {
        return this.f22309a.hashCode() ^ Boolean.FALSE.hashCode();
    }

    public final String toString() {
        return "{ " + this.f22309a + " }";
    }
}
