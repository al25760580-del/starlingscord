package yc;

import java.io.EOFException;
import java.io.IOException;
import je.e0;
import pc.l;
import pc.u;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements f {
    public long E;
    public long F;
    public long G;
    public long H;
    public long I;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f23238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f23239e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f23240i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h f23241v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f23242w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f23243x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f23244y;

    public b(h hVar, long j, long j5, long j7, long j10, boolean z5) {
        je.b.g(j >= 0 && j5 > j);
        this.f23241v = hVar;
        this.f23239e = j;
        this.f23240i = j5;
        if (j7 == j5 - j || z5) {
            this.f23243x = j10;
            this.f23242w = 4;
        } else {
            this.f23242w = 0;
        }
        this.f23238d = new e();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4  */
    @Override // yc.f
    public final long a(l lVar) throws IOException {
        long j;
        long j5;
        long j7;
        int i7 = this.f23242w;
        long j10 = this.f23240i;
        e eVar = this.f23238d;
        if (i7 == 0) {
            j = 0;
            long position = lVar.getPosition();
            this.f23244y = position;
            this.f23242w = 1;
            long j11 = j10 - 65307;
            if (j11 > position) {
                return j11;
            }
        } else if (i7 != 1) {
            if (i7 == 2) {
                if (this.F == this.G) {
                    j7 = -1;
                } else {
                    long position2 = lVar.getPosition();
                    if (eVar.b(lVar, this.G)) {
                        eVar.a(lVar, false);
                        lVar.t();
                        long j12 = this.E;
                        long j13 = eVar.f23251b;
                        long j14 = j12 - j13;
                        j5 = 2;
                        int i10 = eVar.f23253d + eVar.f23254e;
                        if (0 > j14 || j14 >= 72000) {
                            if (j14 < 0) {
                                this.G = position2;
                                this.I = j13;
                            } else {
                                this.F = lVar.getPosition() + ((long) i10);
                                this.H = eVar.f23251b;
                            }
                            long j15 = this.G;
                            long j16 = this.F;
                            if (j15 - j16 < 100000) {
                                this.G = j16;
                                j7 = j16;
                            } else {
                                long position3 = lVar.getPosition() - (((long) i10) * (j14 <= 0 ? 2L : 1L));
                                long j17 = this.G;
                                long j18 = this.F;
                                j7 = e0.j((((j17 - j18) * j14) / (this.I - this.H)) + position3, j18, j17 - 1);
                            }
                        } else {
                            j7 = -1;
                        }
                    } else {
                        j7 = this.F;
                        if (j7 == position2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                    if (j7 != -1) {
                        return j7;
                    }
                    this.f23242w = 3;
                }
                j5 = 2;
                if (j7 != -1) {
                    return j7;
                }
                this.f23242w = 3;
            } else {
                if (i7 != 3) {
                    if (i7 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j5 = 2;
            }
            while (true) {
                eVar.b(lVar, -1L);
                eVar.a(lVar, false);
                if (eVar.f23251b > this.E) {
                    lVar.t();
                    this.f23242w = 4;
                    return -(this.H + j5);
                }
                lVar.u(eVar.f23253d + eVar.f23254e);
                this.F = lVar.getPosition();
                this.H = eVar.f23251b;
            }
        } else {
            j = 0;
        }
        eVar.f23250a = 0;
        eVar.f23251b = j;
        eVar.f23252c = 0;
        eVar.f23253d = 0;
        eVar.f23254e = 0;
        if (!eVar.b(lVar, -1L)) {
            throw new EOFException();
        }
        eVar.a(lVar, false);
        lVar.u(eVar.f23253d + eVar.f23254e);
        long j19 = eVar.f23251b;
        while ((eVar.f23250a & 4) != 4 && eVar.b(lVar, -1L) && lVar.getPosition() < j10 && eVar.a(lVar, true)) {
            try {
                lVar.u(eVar.f23253d + eVar.f23254e);
                j19 = eVar.f23251b;
            } catch (EOFException unused) {
            }
        }
        this.f23243x = j19;
        this.f23242w = 4;
        return this.f23244y;
    }

    @Override // yc.f
    public final u c() {
        if (this.f23243x != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // yc.f
    public final void d(long j) {
        this.E = e0.j(j, 0L, this.f23243x - 1);
        this.f23242w = 2;
        this.F = this.f23239e;
        this.G = this.f23240i;
        this.H = 0L;
        this.I = this.f23243x;
    }
}
