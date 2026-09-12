package rd;

import ag.a1;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import je.e0;
import md.o0;
import mo.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements o0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f19304e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19305i = -1;

    public p(t tVar, int i7) {
        this.f19304e = tVar;
        this.f19303d = i7;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    public final void a() {
        je.b.g(this.f19305i == -1);
        t tVar = this.f19304e;
        tVar.f();
        tVar.h0.getClass();
        int[] iArr = tVar.h0;
        int i7 = this.f19303d;
        int i10 = iArr[i7];
        if (i10 != -1) {
            boolean[] zArr = tVar.f19327k0;
            if (zArr[i10]) {
                i10 = -2;
            } else {
                zArr[i10] = true;
            }
        } else if (tVar.f19323g0.contains(tVar.f19322f0.a(i7))) {
            i10 = -3;
        } else {
            i10 = -2;
        }
        this.f19305i = i10;
    }

    @Override // md.o0
    public final void b() throws IOException {
        int i7 = this.f19305i;
        t tVar = this.f19304e;
        if (i7 == -2) {
            tVar.f();
            throw new a1(s0.g.e("Unable to bind a sample queue to TrackGroup with MIME type ", tVar.f19322f0.a(this.f19303d).f15730v[0].I, "."));
        }
        if (i7 == -1) {
            tVar.u();
        } else if (i7 != -3) {
            tVar.u();
            tVar.S[i7].t();
        }
    }

    @Override // md.o0
    public final int c(e4.r rVar, lc.f fVar, int i7) {
        Format format;
        if (this.f19305i == -3) {
            fVar.a(4);
            return -4;
        }
        if (d()) {
            int i10 = this.f19305i;
            t tVar = this.f19304e;
            ArrayList arrayList = tVar.K;
            if (!tVar.s()) {
                int i11 = 0;
                if (!arrayList.isEmpty()) {
                    int i12 = 0;
                    loop0: while (i12 < arrayList.size() - 1) {
                        int i13 = ((m) arrayList.get(i12)).H;
                        int length = tVar.S.length;
                        for (int i14 = 0; i14 < length; i14++) {
                            if (tVar.f19327k0[i14] && tVar.S[i14].v() == i13) {
                                break loop0;
                            }
                        }
                        i12++;
                    }
                    e0.N(arrayList, 0, i12);
                    m mVar = (m) arrayList.get(0);
                    Format format2 = mVar.f17224v;
                    if (!format2.equals(tVar.f19319d0)) {
                        tVar.H.f(tVar.f19320e, format2, mVar.f17225w, mVar.f17226x, mVar.f17227y);
                    }
                    tVar.f19319d0 = format2;
                }
                if (arrayList.isEmpty() || ((m) arrayList.get(0)).h0) {
                    int iW = tVar.S[i10].w(rVar, fVar, i7, tVar.f19333q0);
                    if (iW == -5) {
                        Format formatC = (Format) rVar.f8035i;
                        formatC.getClass();
                        if (i10 == tVar.Y) {
                            int iE = c0.e(tVar.S[i10].v());
                            while (i11 < arrayList.size() && ((m) arrayList.get(i11)).H != iE) {
                                i11++;
                            }
                            if (i11 < arrayList.size()) {
                                format = ((m) arrayList.get(i11)).f17224v;
                            } else {
                                format = tVar.f19317c0;
                                format.getClass();
                            }
                            formatC = formatC.c(format);
                        }
                        rVar.f8035i = formatC;
                    }
                    return iW;
                }
            }
        }
        return -3;
    }

    public final boolean d() {
        int i7 = this.f19305i;
        return (i7 == -1 || i7 == -3 || i7 == -2) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    @Override // md.o0
    public final int f(long j) throws Throwable {
        Object next;
        Object objE;
        if (!d()) {
            return 0;
        }
        int i7 = this.f19305i;
        t tVar = this.f19304e;
        if (tVar.s()) {
            return 0;
        }
        s sVar = tVar.S[i7];
        int iP = sVar.p(j, tVar.f19333q0);
        ArrayList arrayList = tVar.K;
        if (arrayList == null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
                objE = next;
            } else {
                objE = null;
            }
        } else if (arrayList.isEmpty()) {
            objE = null;
        } else {
            objE = kk.b.e(1, arrayList);
        }
        m mVar = (m) objE;
        if (mVar != null && !mVar.h0) {
            iP = Math.min(iP, mVar.e(i7) - sVar.n());
        }
        sVar.z(iP);
        return iP;
    }

    @Override // md.o0
    public final boolean isReady() {
        if (this.f19305i == -3) {
            return true;
        }
        if (!d()) {
            return false;
        }
        int i7 = this.f19305i;
        t tVar = this.f19304e;
        return !tVar.s() && tVar.S[i7].r(tVar.f19333q0);
    }
}
