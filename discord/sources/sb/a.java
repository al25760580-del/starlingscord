package sb;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f19820b;

    public a(Object obj, b bVar) {
        this.f19819a = obj;
        this.f19820b = bVar;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            b bVar2 = aVar.f19820b;
            if (this.f19819a.equals(aVar.f19819a)) {
                Object obj2 = d.f19823d;
                if (obj2.equals(obj2) && ((bVar = this.f19820b) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.f19819a.hashCode()) * 1000003) ^ d.f19823d.hashCode()) * 1000003;
        b bVar = this.f19820b;
        return (bVar == null ? 0 : bVar.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f19819a + ", priority=" + d.f19823d + ", productData=" + this.f19820b + "}";
    }
}
