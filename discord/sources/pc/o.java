package pc;

import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public class o implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f17908c;

    public /* synthetic */ o(Object obj, long j, int i7) {
        this.f17906a = i7;
        this.f17908c = obj;
        this.f17907b = j;
    }

    @Override // pc.u
    public final boolean c() {
        switch (this.f17906a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // pc.u
    public final t h(long j) {
        switch (this.f17906a) {
            case 0:
                p pVar = (p) this.f17908c;
                je.b.l(pVar.k);
                e4.r rVar = pVar.k;
                long[] jArr = (long[]) rVar.f8034e;
                long[] jArr2 = (long[]) rVar.f8035i;
                int iE = e0.e(jArr, e0.j((((long) pVar.f17913e) * j) / 1000000, 0L, pVar.j - 1), false);
                long j5 = iE == -1 ? 0L : jArr[iE];
                long j7 = iE != -1 ? jArr2[iE] : 0L;
                int i7 = pVar.f17913e;
                long j10 = (j5 * 1000000) / ((long) i7);
                long j11 = this.f17907b;
                v vVar = new v(j10, j7 + j11);
                if (j10 == j || iE == jArr.length - 1) {
                    return new t(vVar, vVar);
                }
                int i10 = iE + 1;
                return new t(vVar, new v((jArr[i10] * 1000000) / ((long) i7), j11 + jArr2[i10]));
            case 1:
                return (t) this.f17908c;
            default:
                rc.b bVar = (rc.b) this.f17908c;
                t tVarB = bVar.f19226g[0].b(j);
                int i11 = 1;
                while (true) {
                    rc.e[] eVarArr = bVar.f19226g;
                    if (i11 >= eVarArr.length) {
                        return tVarB;
                    }
                    t tVarB2 = eVarArr[i11].b(j);
                    if (tVarB2.f17927a.f17931b < tVarB.f17927a.f17931b) {
                        tVarB = tVarB2;
                    }
                    i11++;
                }
                break;
        }
    }

    @Override // pc.u
    public final long i() {
        switch (this.f17906a) {
            case 0:
                return ((p) this.f17908c).b();
            case 1:
                return this.f17907b;
            default:
                return this.f17907b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(long j) {
        this(j, 0L);
        this.f17906a = 1;
    }

    public o(long j, long j5) {
        this.f17906a = 1;
        this.f17907b = j;
        v vVar = j5 == 0 ? v.f17929c : new v(0L, j5);
        this.f17908c = new t(vVar, vVar);
    }
}
