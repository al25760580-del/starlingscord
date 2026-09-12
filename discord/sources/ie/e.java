package ie;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.cache.SimpleCache;
import he.t0;
import he.u0;
import he.z;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import je.e0;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements DataSource {
    public Uri E;
    public he.p F;
    public he.p G;
    public DataSource H;
    public long I;
    public long J;
    public long K;
    public t L;
    public boolean M;
    public boolean N;
    public long O;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f11723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f11724e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t0 f11725i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final DataSource f11726v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f11727w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f11728x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f11729y;

    public e(SimpleCache simpleCache, DataSource dataSource, z zVar, d dVar, int i7) {
        this.f11723d = simpleCache;
        this.f11724e = zVar;
        this.f11727w = (i7 & 1) != 0;
        this.f11728x = (i7 & 2) != 0;
        this.f11729y = (i7 & 4) != 0;
        if (dataSource != null) {
            this.f11726v = dataSource;
            this.f11725i = new t0(dataSource, dVar);
        } else {
            this.f11726v = com.google.android.exoplayer2.upstream.b.f5838d;
            this.f11725i = null;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void B(u0 u0Var) {
        u0Var.getClass();
        this.f11724e.B(u0Var);
        this.f11726v.B(u0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        b bVar = this.f11723d;
        DataSource dataSource = this.H;
        if (dataSource == null) {
            return;
        }
        try {
            dataSource.close();
        } finally {
            this.G = null;
            this.H = null;
            t tVar = this.L;
            if (tVar != null) {
                ((SimpleCache) bVar).j(tVar);
                this.L = null;
            }
        }
    }

    public final void c(he.p pVar, boolean z5) throws InterruptedIOException {
        t tVarM;
        he.p pVarA;
        DataSource dataSource;
        String str = pVar.f10656h;
        int i7 = e0.f13788a;
        if (this.N) {
            tVarM = null;
        } else if (this.f11727w) {
            try {
                b bVar = this.f11723d;
                long j = this.J;
                long j5 = this.K;
                SimpleCache simpleCache = (SimpleCache) bVar;
                synchronized (simpleCache) {
                    simpleCache.d();
                    while (true) {
                        tVarM = simpleCache.m(j, j5, str);
                        if (tVarM != null) {
                            break;
                        } else {
                            simpleCache.wait();
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            tVarM = ((SimpleCache) this.f11723d).m(this.J, this.K, str);
        }
        if (tVarM == null) {
            dataSource = this.f11726v;
            he.o oVarA = pVar.a();
            oVarA.f10645f = this.J;
            oVarA.f10646g = this.K;
            pVarA = oVarA.a();
        } else if (tVarM.f11739v) {
            Uri uriFromFile = Uri.fromFile(tVarM.f11740w);
            long j7 = tVarM.f11737e;
            long j10 = this.J - j7;
            long jMin = tVarM.f11738i - j10;
            long j11 = this.K;
            if (j11 != -1) {
                jMin = Math.min(jMin, j11);
            }
            he.o oVarA2 = pVar.a();
            oVarA2.f10640a = uriFromFile;
            oVarA2.f10641b = j7;
            oVarA2.f10645f = j10;
            oVarA2.f10646g = jMin;
            pVarA = oVarA2.a();
            dataSource = this.f11724e;
        } else {
            long jMin2 = tVarM.f11738i;
            if (jMin2 == -1) {
                jMin2 = this.K;
            } else {
                long j12 = this.K;
                if (j12 != -1) {
                    jMin2 = Math.min(jMin2, j12);
                }
            }
            he.o oVarA3 = pVar.a();
            oVarA3.f10645f = this.J;
            oVarA3.f10646g = jMin2;
            pVarA = oVarA3.a();
            dataSource = this.f11725i;
            if (dataSource == null) {
                dataSource = this.f11726v;
                ((SimpleCache) this.f11723d).j(tVarM);
                tVarM = null;
            }
        }
        this.O = (this.N || dataSource != this.f11726v) ? LongCompanionObject.MAX_VALUE : this.J + 102400;
        if (z5) {
            je.b.k(this.H == this.f11726v);
            if (dataSource == this.f11726v) {
                return;
            }
            try {
                b();
            } catch (Throwable th2) {
                if (!tVarM.f11739v) {
                    ((SimpleCache) this.f11723d).j(tVarM);
                }
                throw th2;
            }
        }
        if (tVarM != null && !tVarM.f11739v) {
            this.L = tVarM;
        }
        this.H = dataSource;
        this.G = pVarA;
        this.I = 0L;
        long jD = dataSource.d(pVarA);
        g gVar = new g();
        if (pVarA.f10655g == -1 && jD != -1) {
            this.K = jD;
            gVar.a(Long.valueOf(this.J + jD), "exo_len");
        }
        if (!(this.H == this.f11724e)) {
            Uri uriY = dataSource.y();
            this.E = uriY;
            Uri uri = pVar.f10649a.equals(uriY) ? null : this.E;
            if (uri == null) {
                ((ArrayList) gVar.f11734b).add("exo_redir");
                ((HashMap) gVar.f11733a).remove("exo_redir");
            } else {
                gVar.a(uri.toString(), "exo_redir");
            }
        }
        if (this.H == this.f11725i) {
            ((SimpleCache) this.f11723d).c(str, gVar);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
        this.F = null;
        this.E = null;
        this.J = 0L;
        try {
            b();
        } catch (Throwable th2) {
            if (this.H == this.f11724e || (th2 instanceof a)) {
                this.M = true;
            }
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long d(he.p pVar) {
        long j;
        b bVar = this.f11723d;
        try {
            String string = pVar.f10656h;
            long j5 = pVar.f10654f;
            long j7 = pVar.f10655g;
            if (string == null) {
                string = pVar.f10649a.toString();
            }
            he.o oVarA = pVar.a();
            oVarA.f10647h = string;
            he.p pVarA = oVarA.a();
            this.F = pVarA;
            Uri uri = pVarA.f10649a;
            byte[] bArr = (byte[]) ((SimpleCache) bVar).g(string).f11756b.get("exo_redir");
            Uri uri2 = null;
            String str = bArr != null ? new String(bArr, di.d.f7631c) : null;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.E = uri;
            this.J = j5;
            boolean z5 = (this.f11728x && this.M) || (this.f11729y && j7 == -1);
            this.N = z5;
            if (z5) {
                this.K = -1L;
                j = -1;
            } else {
                j = -1;
                long jA = n.a(((SimpleCache) bVar).g(string));
                this.K = jA;
                if (jA != -1) {
                    long j10 = jA - j5;
                    this.K = j10;
                    if (j10 < 0) {
                        throw new he.m(2008);
                    }
                }
            }
            if (j7 != j) {
                long j11 = this.K;
                this.K = j11 == j ? j7 : Math.min(j11, j7);
            }
            long j12 = this.K;
            if (j12 > 0 || j12 == j) {
                c(pVarA, false);
            }
            return j7 != j ? j7 : this.K;
        } catch (Throwable th2) {
            if (this.H == this.f11724e || (th2 instanceof a)) {
                this.M = true;
            }
            throw th2;
        }
    }

    @Override // he.k
    public final int read(byte[] bArr, int i7, int i10) {
        int i11;
        long j;
        z zVar = this.f11724e;
        if (i10 == 0) {
            return 0;
        }
        if (this.K == 0) {
            return -1;
        }
        he.p pVar = this.F;
        pVar.getClass();
        he.p pVar2 = this.G;
        pVar2.getClass();
        try {
            if (this.J >= this.O) {
                c(pVar, true);
            }
            DataSource dataSource = this.H;
            dataSource.getClass();
            int i12 = dataSource.read(bArr, i7, i10);
            if (i12 != -1) {
                long j5 = i12;
                this.J += j5;
                this.I += j5;
                long j7 = this.K;
                if (j7 == -1) {
                    return i12;
                }
                this.K = j7 - j5;
                return i12;
            }
            DataSource dataSource2 = this.H;
            if (!(dataSource2 == zVar)) {
                j = -1;
                long j10 = pVar2.f10655g;
                if (j10 != -1) {
                    i11 = i12;
                    if (this.I < j10) {
                    }
                } else {
                    i11 = i12;
                }
                String str = pVar.f10656h;
                int i13 = e0.f13788a;
                this.K = 0L;
                if (!(dataSource2 == this.f11725i)) {
                    return i11;
                }
                g gVar = new g();
                gVar.a(Long.valueOf(this.J), "exo_len");
                ((SimpleCache) this.f11723d).c(str, gVar);
                return i11;
            }
            i11 = i12;
            j = -1;
            long j11 = this.K;
            if (j11 <= 0 && j11 != j) {
                return i11;
            }
            b();
            c(pVar, false);
            return read(bArr, i7, i10);
        } catch (Throwable th2) {
            if (this.H == zVar || (th2 instanceof a)) {
                this.M = true;
            }
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Map s() {
        return !(this.H == this.f11724e) ? this.f11726v.s() : Collections.EMPTY_MAP;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri y() {
        return this.E;
    }
}
