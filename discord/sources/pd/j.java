package pd;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final od.d f17978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd.m f17979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qd.b f17980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f17981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f17983f;

    public j(long j, qd.m mVar, qd.b bVar, od.d dVar, long j5, h hVar) {
        this.f17982e = j;
        this.f17979b = mVar;
        this.f17980c = bVar;
        this.f17983f = j5;
        this.f17978a = dVar;
        this.f17981d = hVar;
    }

    public final j a(long j, qd.m mVar) throws md.b {
        long jP;
        long jP2;
        h hVarC = this.f17979b.c();
        h hVarC2 = mVar.c();
        if (hVarC == null) {
            return new j(j, mVar, this.f17980c, this.f17978a, this.f17983f, hVarC);
        }
        if (!hVarC.v()) {
            return new j(j, mVar, this.f17980c, this.f17978a, this.f17983f, hVarC2);
        }
        long jZ = hVarC.z(j);
        if (jZ == 0) {
            return new j(j, mVar, this.f17980c, this.f17978a, this.f17983f, hVarC2);
        }
        long jW = hVarC.w();
        long jB = hVarC.b(jW);
        long j5 = jZ + jW;
        long j7 = j5 - 1;
        long jE = hVarC.e(j7, j) + hVarC.b(j7);
        long jW2 = hVarC2.w();
        long jB2 = hVarC2.b(jW2);
        long j10 = this.f17983f;
        if (jE != jB2) {
            if (jE < jB2) {
                throw new md.b();
            }
            if (jB2 < jB) {
                jP2 = j10 - (hVarC2.p(jB, j) - jW);
            } else {
                jP = hVarC.p(jB2, j) - jW2;
            }
            return new j(j, mVar, this.f17980c, this.f17978a, jP2, hVarC2);
        }
        jP = j5 - jW2;
        jP2 = jP + j10;
        return new j(j, mVar, this.f17980c, this.f17978a, jP2, hVarC2);
    }

    public final long b(long j) {
        h hVar = this.f17981d;
        long j5 = this.f17982e;
        return (hVar.A(j5, j) + (hVar.i(j5, j) + this.f17983f)) - 1;
    }

    public final long c(long j) {
        return this.f17981d.e(j - this.f17983f, this.f17982e) + d(j);
    }

    public final long d(long j) {
        return this.f17981d.b(j - this.f17983f);
    }
}
