package od;

import a5.b0;
import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import e4.r;
import he.f0;
import he.h0;
import he.i0;
import he.k0;
import he.q;
import he.s0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import je.e0;
import mc.s;
import md.n0;
import md.o0;
import md.p0;
import md.q0;
import pd.o;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements o0, q0, f0, i0 {
    public final o9.d E;
    public final k0 F;
    public final a5.i0 G;
    public final ArrayList H;
    public final List I;
    public final n0 J;
    public final n0[] K;
    public final e4.c L;
    public e M;
    public Format N;
    public g O;
    public long P;
    public long Q;
    public int R;
    public a S;
    public boolean T;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f17234e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Format[] f17235i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean[] f17236v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i f17237w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f17238x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a1.d f17239y;

    public h(int i7, int[] iArr, Format[] formatArr, i iVar, p0 p0Var, q qVar, long j, s sVar, mc.n nVar, o9.d dVar, a1.d dVar2) {
        this.f17233d = i7;
        int i10 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f17234e = iArr;
        this.f17235i = formatArr == null ? new Format[0] : formatArr;
        this.f17237w = iVar;
        this.f17238x = p0Var;
        this.f17239y = dVar2;
        this.E = dVar;
        this.F = new k0("ChunkSampleStream");
        this.G = new a5.i0(9, (byte) 0);
        ArrayList arrayList = new ArrayList();
        this.H = arrayList;
        this.I = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.K = new n0[length];
        this.f17236v = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        n0[] n0VarArr = new n0[i11];
        sVar.getClass();
        n0 n0Var = new n0(qVar, sVar, nVar);
        this.J = n0Var;
        iArr2[0] = i7;
        n0VarArr[0] = n0Var;
        while (i10 < length) {
            n0 n0Var2 = new n0(qVar, null, null);
            this.K[i10] = n0Var2;
            int i12 = i10 + 1;
            n0VarArr[i12] = n0Var2;
            iArr2[i12] = this.f17234e[i10];
            i10 = i12;
        }
        this.L = new e4.c(14, iArr2, n0VarArr);
        this.P = j;
        this.Q = j;
    }

    @Override // md.q0
    public final boolean C() {
        return this.F.d();
    }

    @Override // md.q0
    public final long S() {
        long j;
        ArrayList arrayList = this.H;
        if (this.T) {
            return Long.MIN_VALUE;
        }
        if (j()) {
            return this.P;
        }
        long jMax = this.Q;
        a aVarH = h();
        if (!aVarH.b()) {
            aVarH = arrayList.size() > 1 ? (a) kk.b.e(2, arrayList) : null;
        }
        if (aVarH != null) {
            jMax = Math.max(jMax, aVarH.E);
        }
        n0 n0Var = this.J;
        synchronized (n0Var) {
            j = n0Var.f15684v;
        }
        return Math.max(jMax, j);
    }

    @Override // md.q0
    public final void W(long j) {
        k0 k0Var = this.F;
        if (k0Var.c() || j()) {
            return;
        }
        boolean zD = k0Var.d();
        List list = this.I;
        i iVar = this.f17237w;
        ArrayList arrayList = this.H;
        if (zD) {
            e eVar = this.M;
            eVar.getClass();
            boolean z5 = eVar instanceof a;
            if (!(z5 && i(arrayList.size() - 1)) && iVar.e(j, eVar, list)) {
                k0Var.a();
                if (z5) {
                    this.S = (a) eVar;
                    return;
                }
                return;
            }
            return;
        }
        int iF = iVar.f(j, list);
        if (iF < arrayList.size()) {
            je.b.k(!k0Var.d());
            int size = arrayList.size();
            while (true) {
                if (iF >= size) {
                    iF = -1;
                    break;
                } else if (!i(iF)) {
                    break;
                } else {
                    iF++;
                }
            }
            if (iF == -1) {
                return;
            }
            long j5 = h().E;
            a aVarG = g(iF);
            if (arrayList.isEmpty()) {
                this.P = this.Q;
            }
            this.T = false;
            this.f17239y.B(new MediaLoadData(1, this.f17233d, null, 3, null, e0.U(aVarG.f17227y), e0.U(j5)));
        }
    }

    @Override // md.o0
    public final void b() throws mc.j {
        k0 k0Var = this.F;
        k0Var.b();
        this.J.t();
        if (k0Var.d()) {
            return;
        }
        this.f17237w.b();
    }

    @Override // md.o0
    public final int c(r rVar, lc.f fVar, int i7) {
        if (j()) {
            return -3;
        }
        a aVar = this.S;
        n0 n0Var = this.J;
        if (aVar != null && aVar.c(0) <= n0Var.n()) {
            return -3;
        }
        m();
        return n0Var.w(rVar, fVar, i7, this.T);
    }

    @Override // he.i0
    public final void d() {
        n0 n0Var = this.J;
        n0Var.x(true);
        mc.k kVar = n0Var.f15672h;
        if (kVar != null) {
            kVar.d(n0Var.f15669e);
            n0Var.f15672h = null;
            n0Var.f15671g = null;
        }
        for (n0 n0Var2 : this.K) {
            n0Var2.x(true);
            mc.k kVar2 = n0Var2.f15672h;
            if (kVar2 != null) {
                kVar2.d(n0Var2.f15669e);
                n0Var2.f15672h = null;
                n0Var2.f15671g = null;
            }
        }
        this.f17237w.release();
        g gVar = this.O;
        if (gVar != null) {
            pd.c cVar = (pd.c) gVar;
            synchronized (cVar) {
                o oVar = (o) cVar.K.remove(this);
                if (oVar != null) {
                    n0 n0Var3 = oVar.f18006a;
                    n0Var3.x(true);
                    mc.k kVar3 = n0Var3.f15672h;
                    if (kVar3 != null) {
                        kVar3.d(n0Var3.f15669e);
                        n0Var3.f15672h = null;
                        n0Var3.f15671g = null;
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, md.p0] */
    @Override // he.f0
    public final void e(h0 h0Var, long j, long j5) {
        e eVar = (e) h0Var;
        this.M = null;
        this.f17237w.g(eVar);
        long j7 = eVar.f17221d;
        s0 s0Var = eVar.F;
        Uri uri = s0Var.f10700i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(s0Var.f10699e, s0Var.f10701v);
        this.E.getClass();
        this.f17239y.n(loadEventInfo, eVar.f17223i, this.f17233d, eVar.f17224v, eVar.f17225w, eVar.f17226x, eVar.f17227y, eVar.E);
        this.f17238x.c(this);
    }

    @Override // md.o0
    public final int f(long j) throws Throwable {
        if (j()) {
            return 0;
        }
        boolean z5 = this.T;
        n0 n0Var = this.J;
        int iP = n0Var.p(j, z5);
        a aVar = this.S;
        if (aVar != null) {
            iP = Math.min(iP, aVar.c(0) - n0Var.n());
        }
        n0Var.z(iP);
        m();
        return iP;
    }

    public final a g(int i7) {
        ArrayList arrayList = this.H;
        a aVar = (a) arrayList.get(i7);
        e0.N(arrayList, i7, arrayList.size());
        this.R = Math.max(this.R, arrayList.size());
        int i10 = 0;
        this.J.j(aVar.c(0));
        while (true) {
            n0[] n0VarArr = this.K;
            if (i10 >= n0VarArr.length) {
                return aVar;
            }
            n0 n0Var = n0VarArr[i10];
            i10++;
            n0Var.j(aVar.c(i10));
        }
    }

    public final a h() {
        return (a) kk.b.e(1, this.H);
    }

    public final boolean i(int i7) {
        int iN;
        a aVar = (a) this.H.get(i7);
        if (this.J.n() > aVar.c(0)) {
            return true;
        }
        int i10 = 0;
        do {
            n0[] n0VarArr = this.K;
            if (i10 >= n0VarArr.length) {
                return false;
            }
            iN = n0VarArr[i10].n();
            i10++;
        } while (iN <= aVar.c(i10));
        return true;
    }

    @Override // md.o0
    public final boolean isReady() {
        return !j() && this.J.r(this.T);
    }

    public final boolean j() {
        return this.P != -9223372036854775807L;
    }

    @Override // md.q0
    public final long k() {
        if (j()) {
            return this.P;
        }
        if (this.T) {
            return Long.MIN_VALUE;
        }
        return h().E;
    }

    public final void m() {
        int iO = o(this.J.n(), this.R - 1);
        while (true) {
            int i7 = this.R;
            if (i7 > iO) {
                return;
            }
            this.R = i7 + 1;
            a aVar = (a) this.H.get(i7);
            Format format = aVar.f17224v;
            if (!format.equals(this.N)) {
                this.f17239y.f(this.f17233d, format, aVar.f17225w, aVar.f17226x, aVar.f17227y);
            }
            this.N = format;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, md.p0] */
    @Override // he.f0
    public final ad.f n(h0 h0Var, long j, long j5, IOException iOException, int i7) {
        ad.f fVar;
        e eVar = (e) h0Var;
        long j7 = eVar.F.f10699e;
        boolean z5 = eVar instanceof a;
        ArrayList arrayList = this.H;
        int size = arrayList.size() - 1;
        boolean z6 = (j7 != 0 && z5 && i(size)) ? false : true;
        s0 s0Var = eVar.F;
        Uri uri = s0Var.f10700i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j7, s0Var.f10701v);
        e0.U(eVar.f17227y);
        e0.U(eVar.E);
        b0 b0Var = new b0(i7, 5, iOException);
        i iVar = this.f17237w;
        o9.d dVar = this.E;
        if (!iVar.d(eVar, z6, b0Var, dVar)) {
            fVar = null;
        } else if (z6) {
            if (z5) {
                je.b.k(g(size) == eVar);
                if (arrayList.isEmpty()) {
                    this.P = this.Q;
                }
            }
            fVar = k0.f10619w;
        } else {
            je.b.N("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            fVar = null;
        }
        if (fVar == null) {
            dVar.getClass();
            long jN = o9.d.n(b0Var);
            fVar = jN != -9223372036854775807L ? new ad.f(0, jN, false) : k0.f10620x;
        }
        boolean zA = fVar.a();
        this.f17239y.p(loadEventInfo, eVar.f17223i, this.f17233d, eVar.f17224v, eVar.f17225w, eVar.f17226x, eVar.f17227y, eVar.E, iOException, !zA);
        if (!zA) {
            this.M = null;
            dVar.getClass();
            this.f17238x.c(this);
        }
        return fVar;
    }

    public final int o(int i7, int i10) {
        ArrayList arrayList;
        do {
            i10++;
            arrayList = this.H;
            if (i10 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i10)).c(0) <= i7);
        return i10 - 1;
    }

    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, md.p0] */
    @Override // he.f0
    public final void p(h0 h0Var, long j, long j5, boolean z5) {
        e eVar = (e) h0Var;
        this.M = null;
        this.S = null;
        long j7 = eVar.f17221d;
        s0 s0Var = eVar.F;
        Uri uri = s0Var.f10700i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(s0Var.f10699e, s0Var.f10701v);
        this.E.getClass();
        this.f17239y.k(loadEventInfo, eVar.f17223i, this.f17233d, eVar.f17224v, eVar.f17225w, eVar.f17226x, eVar.f17227y, eVar.E);
        if (z5) {
            return;
        }
        if (j()) {
            this.J.x(false);
            for (n0 n0Var : this.K) {
                n0Var.x(false);
            }
        } else if (eVar instanceof a) {
            ArrayList arrayList = this.H;
            g(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.P = this.Q;
            }
        }
        this.f17238x.c(this);
    }

    public final void q(pd.c cVar) {
        this.O = cVar;
        n0 n0Var = this.J;
        n0Var.h();
        mc.k kVar = n0Var.f15672h;
        if (kVar != null) {
            kVar.d(n0Var.f15669e);
            n0Var.f15672h = null;
            n0Var.f15671g = null;
        }
        for (n0 n0Var2 : this.K) {
            n0Var2.h();
            mc.k kVar2 = n0Var2.f15672h;
            if (kVar2 != null) {
                kVar2.d(n0Var2.f15669e);
                n0Var2.f15672h = null;
                n0Var2.f15671g = null;
            }
        }
        this.F.e(this);
    }

    public final void s(long j) {
        a aVar;
        boolean zY;
        this.Q = j;
        if (j()) {
            this.P = j;
            return;
        }
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 < this.H.size()) {
                aVar = (a) this.H.get(i10);
                long j5 = aVar.f17227y;
                if (j5 == j && aVar.H == -9223372036854775807L) {
                    break;
                } else if (j5 <= j) {
                    i10++;
                }
            }
            aVar = null;
            break;
        }
        if (aVar != null) {
            n0 n0Var = this.J;
            int iC = aVar.c(0);
            synchronized (n0Var) {
                synchronized (n0Var) {
                    n0Var.f15681s = 0;
                    md.k0 k0Var = n0Var.f15665a;
                    k0Var.f15649e = k0Var.f15648d;
                }
            }
            int i11 = n0Var.f15679q;
            if (iC < i11 || iC > n0Var.f15678p + i11) {
                zY = false;
            } else {
                n0Var.f15682t = Long.MIN_VALUE;
                n0Var.f15681s = iC - i11;
                zY = true;
            }
        } else {
            zY = this.J.y(j, j < k());
        }
        if (zY) {
            this.R = o(this.J.n(), 0);
            n0[] n0VarArr = this.K;
            int length = n0VarArr.length;
            while (i7 < length) {
                n0VarArr[i7].y(j, true);
                i7++;
            }
            return;
        }
        this.P = j;
        this.T = false;
        this.H.clear();
        this.R = 0;
        if (this.F.d()) {
            this.J.h();
            n0[] n0VarArr2 = this.K;
            int length2 = n0VarArr2.length;
            while (i7 < length2) {
                n0VarArr2[i7].h();
                i7++;
            }
            this.F.a();
            return;
        }
        this.F.f10623i = null;
        this.J.x(false);
        for (n0 n0Var2 : this.K) {
            n0Var2.x(false);
        }
    }

    public final void w(long j) {
        long j5;
        if (j()) {
            return;
        }
        n0 n0Var = this.J;
        int i7 = n0Var.f15679q;
        n0Var.g(j, true);
        n0 n0Var2 = this.J;
        int i10 = n0Var2.f15679q;
        if (i10 > i7) {
            synchronized (n0Var2) {
                j5 = n0Var2.f15678p == 0 ? Long.MIN_VALUE : n0Var2.f15676n[n0Var2.f15680r];
            }
            int i11 = 0;
            while (true) {
                n0[] n0VarArr = this.K;
                if (i11 >= n0VarArr.length) {
                    break;
                }
                n0VarArr[i11].g(j5, this.f17236v[i11]);
                i11++;
            }
        }
        int iMin = Math.min(o(i10, 0), this.R);
        if (iMin > 0) {
            e0.N(this.H, 0, iMin);
            this.R -= iMin;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // md.q0
    public final boolean z(long j) {
        long j5;
        List list;
        if (!this.T) {
            k0 k0Var = this.F;
            if (!k0Var.d() && !k0Var.c()) {
                boolean zJ = j();
                if (zJ) {
                    list = Collections.EMPTY_LIST;
                    j5 = this.P;
                } else {
                    j5 = h().E;
                    list = this.I;
                }
                this.f17237w.c(j, j5, list, this.G);
                a5.i0 i0Var = this.G;
                boolean z5 = i0Var.f214e;
                e eVar = (e) i0Var.f215i;
                i0Var.f215i = null;
                i0Var.f214e = false;
                if (z5) {
                    this.P = -9223372036854775807L;
                    this.T = true;
                    return true;
                }
                if (eVar != null) {
                    this.M = eVar;
                    boolean z6 = eVar instanceof a;
                    e4.c cVar = this.L;
                    if (z6) {
                        a aVar = (a) eVar;
                        if (zJ) {
                            long j7 = aVar.f17227y;
                            long j10 = this.P;
                            if (j7 != j10) {
                                this.J.f15682t = j10;
                                for (n0 n0Var : this.K) {
                                    n0Var.f15682t = this.P;
                                }
                            }
                            this.P = -9223372036854775807L;
                        }
                        aVar.J = cVar;
                        n0[] n0VarArr = (n0[]) cVar.f7967i;
                        int[] iArr = new int[n0VarArr.length];
                        for (int i7 = 0; i7 < n0VarArr.length; i7++) {
                            n0 n0Var2 = n0VarArr[i7];
                            iArr[i7] = n0Var2.f15679q + n0Var2.f15678p;
                        }
                        aVar.K = iArr;
                        this.H.add(aVar);
                    } else if (eVar instanceof k) {
                        ((k) eVar).H = cVar;
                    }
                    k0Var.f(eVar, this, this.E.k(eVar.f17223i));
                    this.f17239y.s(new LoadEventInfo(eVar.f17222e), eVar.f17223i, this.f17233d, eVar.f17224v, eVar.f17225w, eVar.f17226x, eVar.f17227y, eVar.E);
                    return true;
                }
            }
        }
        return false;
    }
}
