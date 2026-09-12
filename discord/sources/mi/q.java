package mi;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f15835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f15836b;

    public q(Class cls, Class cls2) {
        this.f15835a = cls;
        this.f15836b = cls2;
    }

    public static q a(Class cls) {
        return new q(p.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f15836b.equals(qVar.f15836b)) {
            return this.f15835a.equals(qVar.f15835a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15835a.hashCode() + (this.f15836b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f15836b;
        Class cls2 = this.f15835a;
        if (cls2 == p.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
