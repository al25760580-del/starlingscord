package di;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements g, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f7636d;

    public h(List list) {
        this.f7636d = list;
    }

    @Override // di.g
    public final boolean apply(Object obj) {
        int i7 = 0;
        while (true) {
            List list = this.f7636d;
            if (i7 >= list.size()) {
                return true;
            }
            if (!((g) list.get(i7)).apply(obj)) {
                return false;
            }
            i7++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f7636d.equals(((h) obj).f7636d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7636d.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z5 = true;
        for (Object obj : this.f7636d) {
            if (!z5) {
                sb2.append(',');
            }
            sb2.append(obj);
            z5 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
