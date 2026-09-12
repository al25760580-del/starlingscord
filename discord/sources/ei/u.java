package ei;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends q0 implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Comparator f8369d;

    public u(Comparator comparator) {
        this.f8369d = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f8369d.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            return this.f8369d.equals(((u) obj).f8369d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8369d.hashCode();
    }

    public final String toString() {
        return this.f8369d.toString();
    }
}
