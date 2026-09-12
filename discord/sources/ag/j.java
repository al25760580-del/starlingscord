package ag;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o1 f529d;

    public j(o1 o1Var) {
        this.f529d = o1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return c.h(this.f529d, ((j) obj).f529d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f529d});
    }

    public final String toString() {
        return s0.g.e("Suppliers.ofInstance(", this.f529d.toString(), ")");
    }
}
