package td;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import gc.g0;
import gc.q1;
import he.l0;
import he.u0;
import java.util.ArrayList;
import mc.n;
import mc.s;
import md.o0;
import md.p;
import md.p0;
import md.q;
import md.q0;
import md.x0;
import md.y0;
import od.h;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements q, p0 {
    public final he.q E;
    public final y0 F;
    public final i8.c G;
    public p H;
    public ud.c I;
    public h[] J;
    public u4.b K;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f20719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u0 f20720e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l0 f20721i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s f20722v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n f20723w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o9.d f20724x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a1.d f20725y;

    public d(ud.c cVar, a aVar, u0 u0Var, i8.c cVar2, s sVar, n nVar, o9.d dVar, a1.d dVar2, l0 l0Var, he.q qVar) {
        this.I = cVar;
        this.f20719d = aVar;
        this.f20720e = u0Var;
        this.f20721i = l0Var;
        this.f20722v = sVar;
        this.f20723w = nVar;
        this.f20724x = dVar;
        this.f20725y = dVar2;
        this.E = qVar;
        this.G = cVar2;
        x0[] x0VarArr = new x0[cVar.f21062f.length];
        int i7 = 0;
        while (true) {
            ud.b[] bVarArr = cVar.f21062f;
            if (i7 >= bVarArr.length) {
                this.F = new y0(x0VarArr);
                h[] hVarArr = new h[0];
                this.J = hVarArr;
                cVar2.getClass();
                this.K = new u4.b(24, hVarArr);
                return;
            }
            Format[] formatArr = bVarArr[i7].j;
            Format[] formatArr2 = new Format[formatArr.length];
            for (int i10 = 0; i10 < formatArr.length; i10++) {
                Format format = formatArr[i10];
                int iB = sVar.b(format);
                g0 g0VarA = format.a();
                g0VarA.F = iB;
                formatArr2[i10] = new Format(g0VarA);
            }
            x0VarArr[i7] = new x0(Integer.toString(i7), formatArr2);
            i7++;
        }
    }

    @Override // md.q0
    public final boolean C() {
        return this.K.C();
    }

    @Override // md.q
    public final long I() {
        return -9223372036854775807L;
    }

    @Override // md.q
    public final long P(fe.p[] pVarArr, boolean[] zArr, o0[] o0VarArr, boolean[] zArr2, long j) {
        fe.p pVar;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < pVarArr.length; i7++) {
            o0 o0Var = o0VarArr[i7];
            if (o0Var != null) {
                h hVar = (h) o0Var;
                fe.p pVar2 = pVarArr[i7];
                if (pVar2 == null || !zArr[i7]) {
                    hVar.q(null);
                    o0VarArr[i7] = null;
                } else {
                    ((b) hVar.f17237w).f20715e = pVar2;
                    arrayList.add(hVar);
                }
            }
            if (o0VarArr[i7] == null && (pVar = pVarArr[i7]) != null) {
                int iB = this.F.b(pVar.c());
                ud.c cVar = this.I;
                DataSource dataSourceCreateDataSource = ((a) this.f20719d).f20710a.createDataSource();
                u0 u0Var = this.f20720e;
                if (u0Var != null) {
                    dataSourceCreateDataSource.B(u0Var);
                }
                h hVar2 = new h(this.I.f21062f[iB].f21043a, null, null, new b(this.f20721i, cVar, iB, pVar, dataSourceCreateDataSource), this, this.E, j, this.f20722v, this.f20723w, this.f20724x, this.f20725y);
                arrayList.add(hVar2);
                o0VarArr[i7] = hVar2;
                zArr2[i7] = true;
            }
        }
        h[] hVarArr = new h[arrayList.size()];
        this.J = hVarArr;
        arrayList.toArray(hVarArr);
        h[] hVarArr2 = this.J;
        this.G.getClass();
        this.K = new u4.b(24, hVarArr2);
        return j;
    }

    @Override // md.q
    public final y0 Q() {
        return this.F;
    }

    @Override // md.q0
    public final long S() {
        return this.K.S();
    }

    @Override // md.q0
    public final void W(long j) {
        this.K.W(j);
    }

    @Override // md.q
    public final long a(long j, q1 q1Var) {
        for (h hVar : this.J) {
            if (hVar.f17233d == 2) {
                return hVar.f17237w.a(j, q1Var);
            }
        }
        return j;
    }

    @Override // md.p0
    public final void c(q0 q0Var) {
        this.H.c(this);
    }

    @Override // md.q0
    public final long k() {
        return this.K.k();
    }

    @Override // md.q
    public final void l(p pVar, long j) {
        this.H = pVar;
        pVar.d(this);
    }

    @Override // md.q
    public final void r() {
        this.f20721i.b();
    }

    @Override // md.q
    public final long v(long j) {
        for (h hVar : this.J) {
            hVar.s(j);
        }
        return j;
    }

    @Override // md.q
    public final void w(long j) {
        for (h hVar : this.J) {
            hVar.w(j);
        }
    }

    @Override // md.q0
    public final boolean z(long j) {
        return this.K.z(j);
    }
}
