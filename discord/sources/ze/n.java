package ze;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f23956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xe.d f23957b;

    public /* synthetic */ n(a aVar, xe.d dVar) {
        this.f23956a = aVar;
        this.f23957b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof n)) {
            n nVar = (n) obj;
            if (af.w.j(this.f23956a, nVar.f23956a) && af.w.j(this.f23957b, nVar.f23957b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23956a, this.f23957b});
    }

    public final String toString() {
        e4.e eVar = new e4.e(this);
        eVar.w(this.f23956a, "key");
        eVar.w(this.f23957b, "feature");
        return eVar.toString();
    }
}
