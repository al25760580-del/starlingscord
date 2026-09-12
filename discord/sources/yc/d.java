package yc;

import a5.l0;
import com.google.android.exoplayer2.Format;
import gc.h1;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import je.e0;
import je.w;
import md.j0;
import pc.k;
import pc.l;
import pc.m;
import pc.n;
import pc.u;
import pc.x;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f23247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f23248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23249c;

    public final boolean a(l lVar) {
        boolean zS;
        e eVar = new e();
        if (eVar.a(lVar, true) && (eVar.f23250a & 2) == 2) {
            int iMin = Math.min(eVar.f23254e, 8);
            w wVar = new w(iMin);
            lVar.C(wVar.f13860a, 0, iMin);
            wVar.F(0);
            if (wVar.a() >= 5 && wVar.u() == 127 && wVar.v() == 1179402563) {
                this.f23248b = new c();
                return true;
            }
            wVar.F(0);
            try {
                zS = l0.S(1, wVar, true);
            } catch (h1 unused) {
                zS = false;
            }
            if (zS) {
                this.f23248b = new i();
            } else {
                wVar.F(0);
                if (g.e(wVar, g.f23257o)) {
                    this.f23248b = new g();
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0173 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0174  */
    @Override // pc.k
    public final int d(l lVar, n nVar) throws h1, EOFException, InterruptedIOException {
        byte[] bArr;
        je.b.l(this.f23247a);
        if (this.f23248b == null) {
            if (!a(lVar)) {
                throw h1.a("Failed to determine bitstream type", null);
            }
            ((pc.h) lVar).f17897x = 0;
        }
        if (!this.f23249c) {
            x xVarX = this.f23247a.x(0, 1);
            this.f23247a.q();
            h hVar = this.f23248b;
            hVar.f23262c = this.f23247a;
            hVar.f23261b = xVarX;
            hVar.d(true);
            this.f23249c = true;
        }
        h hVar2 = this.f23248b;
        jj.a aVar = hVar2.f23260a;
        je.b.l(hVar2.f23261b);
        int i7 = e0.f13788a;
        int i10 = hVar2.f23267h;
        long j = -1;
        if (i10 != 0) {
            if (i10 == 1) {
                ((pc.h) lVar).u((int) hVar2.f23265f);
                hVar2.f23267h = 2;
                return 0;
            }
            if (i10 != 2) {
                if (i10 == 3) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            long jA = hVar2.f23263d.a(lVar);
            if (jA >= 0) {
                nVar.f17905a = jA;
                return 1;
            }
            if (jA < -1) {
                hVar2.a(-(jA + 2));
            }
            if (!hVar2.f23269l) {
                u uVarC = hVar2.f23263d.c();
                je.b.l(uVarC);
                hVar2.f23262c.c(uVarC);
                hVar2.f23269l = true;
            }
            if (hVar2.k <= 0 && !aVar.b(lVar)) {
                hVar2.f23267h = 3;
                return -1;
            }
            hVar2.k = 0L;
            w wVar = (w) aVar.f13915e;
            long jB = hVar2.b(wVar);
            if (jB >= 0) {
                long j5 = hVar2.f23266g;
                if (j5 + jB >= hVar2.f23264e) {
                    long j7 = (j5 * 1000000) / ((long) hVar2.f23268i);
                    hVar2.f23261b.d(wVar.f13862c, wVar);
                    hVar2.f23261b.c(j7, 1, wVar.f13862c, 0, null);
                    hVar2.f23264e = -1L;
                }
            }
            hVar2.f23266g += jB;
            return 0;
        }
        while (true) {
            boolean zB = aVar.b(lVar);
            w wVar2 = (w) aVar.f13915e;
            if (!zB) {
                hVar2.f23267h = 3;
                return -1;
            }
            long j10 = ((pc.h) lVar).f17895v;
            long j11 = j;
            long j12 = hVar2.f23265f;
            hVar2.k = j10 - j12;
            if (!hVar2.c(wVar2, j12, hVar2.j)) {
                Format format = (Format) hVar2.j.f7971e;
                hVar2.f23268i = format.W;
                if (!hVar2.f23270m) {
                    hVar2.f23261b.e(format);
                    hVar2.f23270m = true;
                }
                j0 j0Var = (j0) hVar2.j.f7972i;
                if (j0Var == null) {
                    long j13 = ((pc.h) lVar).f17894i;
                    if (j13 == j11) {
                        hVar2.f23263d = new k8.a();
                    } else {
                        e eVar = (e) aVar.f13914d;
                        hVar2.f23263d = new b(hVar2, hVar2.f23265f, j13, eVar.f23253d + eVar.f23254e, eVar.f23251b, (eVar.f23250a & 4) != 0);
                    }
                    hVar2.f23267h = 2;
                    bArr = wVar2.f13860a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    wVar2.D(Arrays.copyOf(bArr, Math.max(65025, wVar2.f13862c)), wVar2.f13862c);
                    return 0;
                }
                hVar2.f23263d = j0Var;
                hVar2.f23267h = 2;
                bArr = wVar2.f13860a;
                if (bArr.length == 65025) {
                    return 0;
                }
                wVar2.D(Arrays.copyOf(bArr, Math.max(65025, wVar2.f13862c)), wVar2.f13862c);
                return 0;
            }
            hVar2.f23265f = ((pc.h) lVar).f17895v;
            j = j11;
        }
    }

    @Override // pc.k
    public final void e(m mVar) {
        this.f23247a = mVar;
    }

    @Override // pc.k
    public final boolean f(l lVar) {
        try {
            return a(lVar);
        } catch (h1 unused) {
            return false;
        }
    }

    @Override // pc.k
    public final void g(long j, long j5) {
        h hVar = this.f23248b;
        if (hVar != null) {
            jj.a aVar = hVar.f23260a;
            e eVar = (e) aVar.f13914d;
            eVar.f23250a = 0;
            eVar.f23251b = 0L;
            eVar.f23252c = 0;
            eVar.f23253d = 0;
            eVar.f23254e = 0;
            ((w) aVar.f13915e).C(0);
            aVar.f13911a = -1;
            aVar.f13913c = false;
            if (j == 0) {
                hVar.d(!hVar.f23269l);
                return;
            }
            if (hVar.f23267h != 0) {
                long j7 = (((long) hVar.f23268i) * j5) / 1000000;
                hVar.f23264e = j7;
                f fVar = hVar.f23263d;
                int i7 = e0.f13788a;
                fVar.d(j7);
                hVar.f23267h = 2;
            }
        }
    }

    @Override // pc.k
    public final void release() {
    }
}
