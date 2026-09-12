package qd;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18758d;

    public j(long j, long j5, String str) {
        this.f18757c = str == null ? "" : str;
        this.f18755a = j;
        this.f18756b = j5;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        long j;
        String strJ = je.b.J(str, this.f18757c);
        if (jVar != null) {
            long j5 = jVar.f18756b;
            if (strJ.equals(je.b.J(str, jVar.f18757c))) {
                long j7 = this.f18756b;
                if (j7 != -1) {
                    j = j5;
                    long j10 = this.f18755a;
                    jVar2 = null;
                    if (j10 + j7 == jVar.f18755a) {
                        return new j(j10, j != -1 ? j7 + j : -1L, strJ);
                    }
                } else {
                    jVar2 = null;
                    j = j5;
                }
                if (j == -1) {
                    return jVar2;
                }
                long j11 = jVar.f18755a;
                if (j11 + j == this.f18755a) {
                    return new j(j11, j7 != -1 ? j + j7 : -1L, strJ);
                }
                return jVar2;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f18755a == jVar.f18755a && this.f18756b == jVar.f18756b && this.f18757c.equals(jVar.f18757c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f18758d == 0) {
            this.f18758d = this.f18757c.hashCode() + ((((527 + ((int) this.f18755a)) * 31) + ((int) this.f18756b)) * 31);
        }
        return this.f18758d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f18757c);
        sb2.append(", start=");
        sb2.append(this.f18755a);
        sb2.append(", length=");
        return a3.e.n(sb2, this.f18756b, ")");
    }
}
