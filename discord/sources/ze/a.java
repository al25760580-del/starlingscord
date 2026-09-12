package ze;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4.l f23914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ye.b f23915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f23916d;

    public a(e4.l lVar, ye.b bVar, String str) {
        this.f23914b = lVar;
        this.f23915c = bVar;
        this.f23916d = str;
        this.f23913a = Arrays.hashCode(new Object[]{lVar, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return af.w.j(this.f23914b, aVar.f23914b) && af.w.j(this.f23915c, aVar.f23915c) && af.w.j(this.f23916d, aVar.f23916d);
    }

    public final int hashCode() {
        return this.f23913a;
    }
}
