package ub;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20997a;

    public i(ArrayList arrayList) {
        this.f20997a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return this.f20997a.equals(((i) ((o) obj)).f20997a);
    }

    public final int hashCode() {
        return this.f20997a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f20997a + "}";
    }
}
