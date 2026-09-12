package fe;

import ei.e0;
import java.util.Collections;
import java.util.List;
import md.x0;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements gc.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f9117i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f9118v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x0 f9119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e0 f9120e;

    static {
        int i7 = je.e0.f13788a;
        f9117i = Integer.toString(0, 36);
        f9118v = Integer.toString(1, 36);
    }

    public s(x0 x0Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= x0Var.f15727d)) {
            throw new IndexOutOfBoundsException();
        }
        this.f9119d = x0Var;
        this.f9120e = e0.k(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (this.f9119d.equals(sVar.f9119d) && this.f9120e.equals(sVar.f9120e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f9120e.hashCode() * 31) + this.f9119d.hashCode();
    }
}
