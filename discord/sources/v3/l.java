package v3;

/* JADX INFO: loaded from: classes.dex */
public final class l extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f21411a = g.f21404c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return this.f21411a.equals(((l) obj).f21411a);
    }

    public final int hashCode() {
        return this.f21411a.hashCode() + (l.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f21411a + '}';
    }
}
