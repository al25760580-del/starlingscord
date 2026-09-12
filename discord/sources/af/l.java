package af;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements ye.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f463e = new l(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f464d;

    public /* synthetic */ l(String str) {
        this.f464d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            return w.j(this.f464d, ((l) obj).f464d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f464d});
    }
}
