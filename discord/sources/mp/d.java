package mp;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f15967e = new d(null, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f15968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f15969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15971d;

    public d(g gVar, e eVar, boolean z5, boolean z6) {
        this.f15968a = gVar;
        this.f15969b = eVar;
        this.f15970c = z5;
        this.f15971d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f15968a == dVar.f15968a && this.f15969b == dVar.f15969b && this.f15970c == dVar.f15970c && this.f15971d == dVar.f15971d;
    }

    public final int hashCode() {
        g gVar = this.f15968a;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        e eVar = this.f15969b;
        return Boolean.hashCode(this.f15971d) + com.discord.chat.presentation.list.a.g((iHashCode + (eVar != null ? eVar.hashCode() : 0)) * 31, 31, this.f15970c);
    }

    public final String toString() {
        return "JavaTypeQualifiers(nullability=" + this.f15968a + ", mutability=" + this.f15969b + ", definitelyNotNull=" + this.f15970c + ", isNullabilityQualifierForWarning=" + this.f15971d + ')';
    }

    public /* synthetic */ d(g gVar, boolean z5) {
        this(gVar, null, z5, false);
    }
}
