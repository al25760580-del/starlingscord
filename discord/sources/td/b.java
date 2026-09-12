package td;

import a5.b0;
import a5.i0;
import ad.f;
import android.net.Uri;
import bh.t;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import ei.w0;
import fe.p;
import gc.q1;
import he.l0;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import je.e0;
import od.i;
import od.j;
import od.l;
import od.m;
import pd.k;
import xc.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f20711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final od.d[] f20713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DataSource f20714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p f20715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ud.c f20716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public md.b f20718h;

    public b(l0 l0Var, ud.c cVar, int i7, p pVar, DataSource dataSource) {
        xc.p[] pVarArr;
        this.f20711a = l0Var;
        this.f20716f = cVar;
        this.f20712b = i7;
        this.f20715e = pVar;
        this.f20714d = dataSource;
        ud.b bVar = cVar.f21062f[i7];
        this.f20713c = new od.d[pVar.length()];
        for (int i10 = 0; i10 < this.f20713c.length; i10++) {
            int iG = pVar.g(i10);
            Format format = bVar.j[iG];
            if (format.L != null) {
                ud.a aVar = cVar.f21061e;
                aVar.getClass();
                pVarArr = aVar.f21042c;
            } else {
                pVarArr = null;
            }
            xc.p[] pVarArr2 = pVarArr;
            int i11 = bVar.f21043a;
            this.f20713c[i10] = new od.d(new xc.i(3, null, new o(iG, i11, bVar.f21045c, -9223372036854775807L, cVar.f21063g, format, 0, pVarArr2, i11 == 2 ? 4 : 0, null, null), Collections.EMPTY_LIST, null), bVar.f21043a, format);
        }
    }

    @Override // od.i
    public final long a(long j, q1 q1Var) {
        ud.b bVar = this.f20716f.f21062f[this.f20712b];
        int iE = e0.e(bVar.f21055o, j, true);
        long[] jArr = bVar.f21055o;
        long j5 = jArr[iE];
        return q1Var.a(j, j5, (j5 >= j || iE >= bVar.k - 1) ? j5 : jArr[iE + 1]);
    }

    @Override // od.i
    public final void b() throws md.b {
        md.b bVar = this.f20718h;
        if (bVar != null) {
            throw bVar;
        }
        this.f20711a.b();
    }

    @Override // od.i
    public final void c(long j, long j5, List list, i0 i0Var) {
        List list2;
        int iA;
        long jB;
        if (this.f20718h != null) {
            return;
        }
        ud.c cVar = this.f20716f;
        ud.b[] bVarArr = cVar.f21062f;
        int i7 = this.f20712b;
        ud.b bVar = bVarArr[i7];
        int i10 = bVar.k;
        long[] jArr = bVar.f21055o;
        if (i10 == 0) {
            i0Var.f214e = !cVar.f21060d;
            return;
        }
        if (list.isEmpty()) {
            iA = e0.e(jArr, j5, true);
            list2 = list;
        } else {
            list2 = list;
            iA = (int) (((l) kk.b.f(1, list2)).a() - ((long) this.f20717g));
            if (iA < 0) {
                this.f20718h = new md.b();
                return;
            }
        }
        if (iA >= bVar.k) {
            i0Var.f214e = !this.f20716f.f21060d;
            return;
        }
        long j7 = j5 - j;
        ud.c cVar2 = this.f20716f;
        if (cVar2.f21060d) {
            ud.b bVar2 = cVar2.f21062f[i7];
            int i11 = bVar2.k - 1;
            jB = (bVar2.b(i11) + bVar2.f21055o[i11]) - j;
        } else {
            jB = -9223372036854775807L;
        }
        int length = this.f20715e.length();
        m[] mVarArr = new m[length];
        for (int i12 = 0; i12 < length; i12++) {
            this.f20715e.g(i12);
            mVarArr[i12] = new k(bVar, iA);
        }
        this.f20715e.b(j, j7, jB, list2, mVarArr);
        long j10 = jArr[iA];
        long jB2 = bVar.b(iA) + j10;
        long j11 = list.isEmpty() ? j5 : -9223372036854775807L;
        int i13 = this.f20717g + iA;
        int iD = this.f20715e.d();
        od.d dVar = this.f20713c[iD];
        int iG = this.f20715e.g(iD);
        List list3 = bVar.f21054n;
        Format[] formatArr = bVar.j;
        je.b.k(formatArr != null);
        je.b.k(list3 != null);
        je.b.k(iA < list3.size());
        String string = Integer.toString(formatArr[iG].E);
        String string2 = ((Long) list3.get(iA)).toString();
        Uri uriK = je.b.K(bVar.f21052l, bVar.f21053m.replace("{bitrate}", string).replace("{Bitrate}", string).replace("{start time}", string2).replace("{start_time}", string2));
        Format formatL = this.f20715e.l();
        int iM = this.f20715e.m();
        Object objP = this.f20715e.p();
        Map map = Collections.EMPTY_MAP;
        je.b.m(uriK, "The uri must be set.");
        i0Var.f215i = new j(this.f20714d, new he.p(uriK, 0L, 1, null, w0.f8376y, 0L, -1L, null, 0), formatL, iM, objP, j10, jB2, j11, -9223372036854775807L, i13, 1, j10, dVar);
    }

    @Override // od.i
    public final boolean d(od.e eVar, boolean z5, b0 b0Var, o9.d dVar) {
        t tVarK = c9.a.k(this.f20715e);
        dVar.getClass();
        f fVarJ = o9.d.j(tVarK, b0Var);
        if (!z5 || fVarJ == null || fVarJ.f347a != 2) {
            return false;
        }
        p pVar = this.f20715e;
        return pVar.n(pVar.i(eVar.f17224v), fVarJ.f348b);
    }

    @Override // od.i
    public final boolean e(long j, od.e eVar, List list) {
        if (this.f20718h != null) {
            return false;
        }
        return this.f20715e.j(j, eVar, list);
    }

    @Override // od.i
    public final int f(long j, List list) {
        return (this.f20718h != null || this.f20715e.length() < 2) ? list.size() : this.f20715e.h(j, list);
    }

    @Override // od.i
    public final void release() {
        for (od.d dVar : this.f20713c) {
            dVar.f17214d.release();
        }
    }

    @Override // od.i
    public final void g(od.e eVar) {
    }
}
