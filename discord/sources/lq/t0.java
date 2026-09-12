package lq;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t0 {
    public abstract e1 a();

    public abstract z b();

    public abstract boolean c();

    public abstract t0 d(mq.f fVar);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return c() == t0Var.c() && a() == t0Var.a() && b().equals(t0Var.b());
    }

    public final int hashCode() {
        int iHashCode = a().hashCode();
        if (b1.l(b())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (c() ? 17 : b().hashCode());
    }

    public final String toString() {
        if (c()) {
            return "*";
        }
        if (a() == e1.INVARIANT) {
            return b().toString();
        }
        return a() + " " + b();
    }
}
