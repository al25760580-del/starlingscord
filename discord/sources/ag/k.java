package ag;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends b0 implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Comparator f531d;

    public k(Comparator comparator) {
        comparator.getClass();
        this.f531d = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f531d.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            return this.f531d.equals(((k) obj).f531d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f531d.hashCode();
    }

    public final String toString() {
        return this.f531d.toString();
    }
}
