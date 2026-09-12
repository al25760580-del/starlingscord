package qe;

import af.w;
import e4.c;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ye.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f18786i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18788e;

    static {
        c cVar = new c(17, false);
        cVar.f7966e = Boolean.FALSE;
        f18786i = new b(cVar);
    }

    public b(c cVar) {
        this.f18787d = ((Boolean) cVar.f7966e).booleanValue();
        this.f18788e = (String) cVar.f7967i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return w.j(null, null) && this.f18787d == bVar.f18787d && w.j(this.f18788e, bVar.f18788e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f18787d), this.f18788e});
    }
}
