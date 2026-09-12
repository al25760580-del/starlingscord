package rd;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.DataSource;
import ei.r0;
import ei.w0;
import hc.c0;
import he.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import je.e0;
import md.x0;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f19271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataSource f19272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DataSource f19273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final po.d f19274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri[] f19275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Format[] f19276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sd.c f19277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x0 f19278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f19279i;
    public final c0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f19280l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public md.b f19282n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Uri f19283o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f19284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public fe.p f19285q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f19287s;
    public final ph.c j = new ph.c(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f19281m = e0.f13793f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f19286r = -9223372036854775807L;

    public j(l lVar, sd.c cVar, Uri[] uriArr, Format[] formatArr, k kVar, u0 u0Var, po.d dVar, List list, c0 c0Var) {
        this.f19271a = lVar;
        this.f19277g = cVar;
        this.f19275e = uriArr;
        this.f19276f = formatArr;
        this.f19274d = dVar;
        this.f19279i = list;
        this.k = c0Var;
        c cVar2 = (c) kVar;
        DataSource dataSourceCreateDataSource = cVar2.f19262a.createDataSource();
        this.f19272b = dataSourceCreateDataSource;
        if (u0Var != null) {
            dataSourceCreateDataSource.B(u0Var);
        }
        this.f19273c = cVar2.f19262a.createDataSource();
        this.f19278h = new x0("", formatArr);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < uriArr.length; i7++) {
            if ((formatArr[i7].f5530w & 16384) == 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        x0 x0Var = this.f19278h;
        int[] iArrP = mo.c0.P(arrayList);
        h hVar = new h(x0Var, iArrP);
        hVar.f19266g = hVar.i(x0Var.f15730v[iArrP[0]]);
        this.f19285q = hVar;
    }

    public final od.m[] a(m mVar, long j) {
        List listUnmodifiableList;
        j jVar = this;
        m mVar2 = mVar;
        int iA = mVar2 == null ? -1 : jVar.f19278h.a(mVar2.f17224v);
        int length = jVar.f19285q.length();
        od.m[] mVarArr = new od.m[length];
        boolean z5 = false;
        int i7 = 0;
        while (i7 < length) {
            int iG = jVar.f19285q.g(i7);
            Uri uri = jVar.f19275e[iG];
            sd.c cVar = jVar.f19277g;
            if (cVar.c(uri)) {
                sd.i iVarA = cVar.a(z5, uri);
                iVarA.getClass();
                long j5 = iVarA.f19876h - cVar.K;
                Pair pairC = jVar.c(mVar2, iG != iA ? true : z5, iVarA, j5, j);
                long jLongValue = ((Long) pairC.first).longValue();
                int iIntValue = ((Integer) pairC.second).intValue();
                long j7 = iVarA.k;
                ei.e0 e0Var = iVarA.f19885s;
                ei.e0 e0Var2 = iVarA.f19884r;
                int i10 = (int) (jLongValue - j7);
                if (i10 < 0 || e0Var2.size() < i10) {
                    ei.c0 c0Var = ei.e0.f8303e;
                    listUnmodifiableList = r0.f8352w;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i10 < e0Var2.size()) {
                        if (iIntValue != -1) {
                            sd.f fVar = (sd.f) e0Var2.get(i10);
                            if (iIntValue == 0) {
                                arrayList.add(fVar);
                            } else if (iIntValue < fVar.J.size()) {
                                ei.e0 e0Var3 = fVar.J;
                                arrayList.addAll(e0Var3.subList(iIntValue, e0Var3.size()));
                            }
                            i10++;
                        }
                        arrayList.addAll(e0Var2.subList(i10, e0Var2.size()));
                        iIntValue = 0;
                    }
                    if (iVarA.f19880n != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < e0Var.size()) {
                            arrayList.addAll(e0Var.subList(iIntValue, e0Var.size()));
                        }
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
                mVarArr[i7] = new g(j5, listUnmodifiableList);
            } else {
                mVarArr[i7] = od.m.f17240s;
            }
            i7++;
            jVar = this;
            mVar2 = mVar;
            z5 = false;
        }
        return mVarArr;
    }

    public final int b(m mVar) {
        int i7 = mVar.L;
        if (i7 == -1) {
            return 1;
        }
        sd.i iVarA = this.f19277g.a(false, this.f19275e[this.f19278h.a(mVar.f17224v)]);
        iVarA.getClass();
        ei.e0 e0Var = iVarA.f19884r;
        int i10 = (int) (mVar.G - iVarA.k);
        if (i10 < 0) {
            return 1;
        }
        ei.e0 e0Var2 = i10 < e0Var.size() ? ((sd.f) e0Var.get(i10)).J : iVarA.f19885s;
        if (i7 >= e0Var2.size()) {
            return 2;
        }
        sd.d dVar = (sd.d) e0Var2.get(i7);
        if (dVar.J) {
            return 0;
        }
        return e0.a(Uri.parse(je.b.J(iVarA.f19907a, dVar.f19860d)), mVar.f17222e.f10649a) ? 1 : 2;
    }

    public final Pair c(m mVar, boolean z5, sd.i iVar, long j, long j5) {
        boolean z6 = true;
        int i7 = -1;
        if (mVar != null) {
            long jA = mVar.G;
            int i10 = mVar.L;
            if (!z5) {
                if (!mVar.f19293e0) {
                    return new Pair(Long.valueOf(jA), Integer.valueOf(i10));
                }
                if (i10 == -1) {
                    jA = mVar.a();
                }
                return new Pair(Long.valueOf(jA), Integer.valueOf(i10 != -1 ? i10 + 1 : -1));
            }
        }
        long j7 = iVar.f19887u;
        ei.e0 e0Var = iVar.f19885s;
        long j10 = iVar.k;
        ei.e0 e0Var2 = iVar.f19884r;
        long j11 = j7 + j;
        if (mVar != null && !this.f19284p) {
            j5 = mVar.f17227y;
        }
        if (!iVar.f19881o && j5 >= j11) {
            return new Pair(Long.valueOf(j10 + ((long) e0Var2.size())), -1);
        }
        long j12 = j5 - j;
        Long lValueOf = Long.valueOf(j12);
        if (this.f19277g.J && mVar != null) {
            z6 = false;
        }
        int iC = e0.c(lValueOf, z6, e0Var2);
        long j13 = ((long) iC) + j10;
        if (iC >= 0) {
            sd.f fVar = (sd.f) e0Var2.get(iC);
            ei.e0 e0Var3 = j12 < fVar.f19864w + fVar.f19862i ? fVar.J : e0Var;
            for (int i11 = 0; i11 < e0Var3.size(); i11++) {
                sd.d dVar = (sd.d) e0Var3.get(i11);
                if (j12 < dVar.f19864w + dVar.f19862i) {
                    if (!dVar.I) {
                        break;
                    }
                    j13 += e0Var3 == e0Var ? 1L : 0L;
                    i7 = i11;
                    break;
                }
            }
        }
        return new Pair(Long.valueOf(j13), Integer.valueOf(i7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f d(Uri uri, int i7, boolean z5) {
        if (uri == null) {
            return null;
        }
        ph.c cVar = this.j;
        byte[] bArr = (byte[]) ((e) cVar.f18031d).remove(uri);
        if (bArr != null) {
            return null;
        }
        Map map = Collections.EMPTY_MAP;
        he.p pVar = new he.p(uri, 0L, 1, null, w0.f8376y, 0L, -1L, null, 1);
        Format format = this.f19276f[i7];
        int iM = this.f19285q.m();
        Object objP = this.f19285q.p();
        byte[] bArr2 = this.f19281m;
        f fVar = new f(this.f19273c, pVar, 3, format, iM, objP, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = e0.f13793f;
        }
        fVar.G = bArr2;
        return fVar;
    }
}
