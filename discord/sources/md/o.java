package md;

import android.util.Pair;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import gc.u1;
import gc.v1;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends g {
    public final a H;
    public final boolean I;
    public final v1 J;
    public final u1 K;
    public m L;
    public l M;
    public boolean N;
    public boolean O;
    public boolean P;

    public o(a aVar, boolean z5) {
        this.H = aVar;
        this.I = z5 && aVar.j();
        this.J = new v1();
        this.K = new u1();
        Timeline timelineH = aVar.h();
        if (timelineH == null) {
            this.L = new m(new n(aVar.i()), v1.O, m.f15661w);
        } else {
            this.L = new m(timelineH, null, null);
            this.P = true;
        }
    }

    @Override // md.a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final l b(s sVar, he.q qVar, long j) {
        l lVar = new l(sVar, qVar, j);
        je.b.k(lVar.f15655v == null);
        lVar.f15655v = this.H;
        if (this.O) {
            Object obj = sVar.f15689a;
            if (this.L.f15663v != null && obj.equals(m.f15661w)) {
                obj = this.L.f15663v;
            }
            s sVarB = sVar.b(obj);
            long j5 = lVar.f15658y;
            if (j5 != -9223372036854775807L) {
                j = j5;
            }
            a aVar = lVar.f15655v;
            aVar.getClass();
            q qVarB = aVar.b(sVarB, qVar, j);
            lVar.f15656w = qVarB;
            if (lVar.f15657x != null) {
                qVarB.l(lVar, j);
                return lVar;
            }
        } else {
            this.M = lVar;
            if (!this.N) {
                this.N = true;
                B();
            }
        }
        return lVar;
    }

    public final void B() {
        z(null, this.H);
    }

    public final void C(long j) {
        l lVar = this.M;
        int iB = this.L.b(lVar.f15652d.f15689a);
        if (iB == -1) {
            return;
        }
        m mVar = this.L;
        u1 u1Var = this.K;
        mVar.f(iB, u1Var, false);
        long j5 = u1Var.f9889v;
        if (j5 != -9223372036854775807L && j >= j5) {
            j = Math.max(0L, j5 - 1);
        }
        lVar.f15658y = j;
    }

    @Override // md.a
    public final Timeline h() {
        return this.H.h();
    }

    @Override // md.a
    public final MediaItem i() {
        return this.H.i();
    }

    @Override // md.a
    public final boolean j() {
        return this.H.j();
    }

    @Override // md.a
    public final void m(he.u0 u0Var) {
        this.G = u0Var;
        this.F = je.e0.m(null);
        if (this.I) {
            return;
        }
        this.N = true;
        B();
    }

    @Override // md.a
    public final void q(q qVar) {
        l lVar = (l) qVar;
        if (lVar.f15656w != null) {
            a aVar = lVar.f15655v;
            aVar.getClass();
            aVar.q(lVar.f15656w);
        }
        if (qVar == this.M) {
            this.M = null;
        }
    }

    @Override // md.g, md.a
    public final void s() {
        this.O = false;
        this.N = false;
        super.s();
    }

    @Override // md.g
    public final s v(Object obj, s sVar) {
        Object obj2 = sVar.f15689a;
        Object obj3 = this.L.f15663v;
        if (obj3 != null && obj3.equals(obj2)) {
            obj2 = m.f15661w;
        }
        return sVar.b(obj2);
    }

    @Override // md.g
    public final long w(long j, Object obj) {
        return j;
    }

    @Override // md.g
    public final int x(int i7, Object obj) {
        return i7;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00de  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // md.g
    public final void y(Object obj, a aVar, Timeline timeline) {
        long j;
        m mVar;
        s sVarB;
        m mVar2;
        l lVar;
        long j5;
        long j7;
        q qVarB;
        if (this.O) {
            m mVar3 = this.L;
            this.L = new m(timeline, mVar3.f15662i, mVar3.f15663v);
            l lVar2 = this.M;
            if (lVar2 != null) {
                C(lVar2.f15658y);
            }
        } else {
            if (!timeline.p()) {
                v1 v1Var = this.J;
                timeline.n(0, v1Var);
                long j10 = v1Var.J;
                Object obj2 = v1Var.f9909d;
                l lVar3 = this.M;
                if (lVar3 != null) {
                    long j11 = lVar3.f15653e;
                    m mVar4 = this.L;
                    Object obj3 = lVar3.f15652d.f15689a;
                    u1 u1Var = this.K;
                    mVar4.g(obj3, u1Var);
                    long j12 = u1Var.f9890w + j11;
                    this.L.m(0, v1Var, 0L);
                    if (j12 != v1Var.J) {
                        j = j12;
                    } else {
                        j = j10;
                    }
                } else {
                    j = j10;
                }
                Pair pairI = timeline.i(this.J, this.K, 0, j);
                Object obj4 = pairI.first;
                long jLongValue = ((Long) pairI.second).longValue();
                if (this.P) {
                    m mVar5 = this.L;
                    mVar = new m(timeline, mVar5.f15662i, mVar5.f15663v);
                } else {
                    mVar = new m(timeline, obj2, obj4);
                }
                this.L = mVar;
                l lVar4 = this.M;
                if (lVar4 != null) {
                    C(jLongValue);
                    s sVar = lVar4.f15652d;
                    Object obj5 = sVar.f15689a;
                    if (this.L.f15663v != null && obj5.equals(m.f15661w)) {
                        obj5 = this.L.f15663v;
                    }
                    sVarB = sVar.b(obj5);
                }
                this.P = true;
                this.O = true;
                o(this.L);
                if (sVarB != null) {
                    lVar = this.M;
                    lVar.getClass();
                    j5 = lVar.f15653e;
                    j7 = lVar.f15658y;
                    if (j7 != -9223372036854775807L) {
                        j5 = j7;
                    }
                    a aVar2 = lVar.f15655v;
                    aVar2.getClass();
                    qVarB = aVar2.b(sVarB, lVar.f15654i, j5);
                    lVar.f15656w = qVarB;
                    if (lVar.f15657x != null) {
                        qVarB.l(lVar, j5);
                    }
                }
            }
            if (this.P) {
                m mVar6 = this.L;
                mVar2 = new m(timeline, mVar6.f15662i, mVar6.f15663v);
            } else {
                mVar2 = new m(timeline, v1.O, m.f15661w);
            }
            this.L = mVar2;
        }
        sVarB = null;
        this.P = true;
        this.O = true;
        o(this.L);
        if (sVarB != null) {
            lVar = this.M;
            lVar.getClass();
            j5 = lVar.f15653e;
            j7 = lVar.f15658y;
            if (j7 != -9223372036854775807L) {
                j5 = j7;
            }
            a aVar3 = lVar.f15655v;
            aVar3.getClass();
            qVarB = aVar3.b(sVarB, lVar.f15654i, j5);
            lVar.f15656w = qVarB;
            if (lVar.f15657x != null) {
                qVarB.l(lVar, j5);
            }
        }
    }

    @Override // md.a
    public final void k() {
    }
}
