package ag;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends b0 implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f522d;

    public f0(b0 b0Var) {
        this.f522d = b0Var;
    }

    @Override // ag.b0
    public final b0 b() {
        return this.f522d;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f522d.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0) {
            return this.f522d.equals(((f0) obj).f522d);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f522d.hashCode();
    }

    public final String toString() {
        return this.f522d.toString().concat(".reverse()");
    }
}
