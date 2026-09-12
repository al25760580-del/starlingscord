package wj;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vj.b f22306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vj.b f22307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vj.c f22308c;

    public a(vj.b bVar, vj.b bVar2, vj.c cVar) {
        this.f22306a = bVar;
        this.f22307b = bVar2;
        this.f22308c = cVar;
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f22306a.equals(aVar.f22306a)) {
                vj.b bVar = aVar.f22307b;
                vj.b bVar2 = this.f22307b;
                if (bVar2 == null) {
                    zEquals = bVar == null;
                } else {
                    zEquals = bVar2.equals(bVar);
                }
                if (zEquals && this.f22308c.equals(aVar.f22308c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f22306a.hashCode();
        vj.b bVar = this.f22307b;
        return (iHashCode ^ (bVar == null ? 0 : bVar.hashCode())) ^ this.f22308c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[ ");
        sb2.append(this.f22306a);
        sb2.append(" , ");
        sb2.append(this.f22307b);
        sb2.append(" : ");
        vj.c cVar = this.f22308c;
        sb2.append(cVar == null ? "null" : Integer.valueOf(cVar.f21690a));
        sb2.append(" ]");
        return sb2.toString();
    }
}
