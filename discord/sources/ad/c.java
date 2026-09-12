package ad;

import com.google.android.exoplayer2.Format;
import gc.g0;
import gc.h1;
import je.e0;
import pc.l;
import pc.m;
import pc.x;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Format f330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f334h;

    public c(m mVar, x xVar, e eVar, String str, int i7) throws h1 {
        this.f327a = mVar;
        this.f328b = xVar;
        this.f329c = eVar;
        int i10 = eVar.f342d;
        int i11 = eVar.f343e;
        int i12 = (eVar.f345v * i10) / 8;
        int i13 = eVar.f344i;
        if (i13 != i12) {
            throw h1.a("Expected block size: " + i12 + "; got: " + i13, null);
        }
        int i14 = i11 * i12;
        int i15 = i14 * 8;
        int iMax = Math.max(i12, i14 / 10);
        this.f331e = iMax;
        g0 g0Var = new g0();
        g0Var.k = str;
        g0Var.f9640f = i15;
        g0Var.f9641g = i15;
        g0Var.f9644l = iMax;
        g0Var.f9656x = i10;
        g0Var.f9657y = i11;
        g0Var.f9658z = i7;
        this.f330d = new Format(g0Var);
    }

    @Override // ad.b
    public final boolean a(l lVar, long j) {
        int i7;
        int i10;
        long j5 = j;
        while (j5 > 0 && (i7 = this.f333g) < (i10 = this.f331e)) {
            int iA = this.f328b.a(lVar, (int) Math.min(i10 - i7, j5), true);
            if (iA == -1) {
                j5 = 0;
            } else {
                this.f333g += iA;
                j5 -= (long) iA;
            }
        }
        e eVar = this.f329c;
        int i11 = eVar.f344i;
        int i12 = this.f333g / i11;
        if (i12 > 0) {
            long jP = this.f332f + e0.P(this.f334h, 1000000L, eVar.f343e);
            int i13 = i12 * i11;
            int i14 = this.f333g - i13;
            this.f328b.c(jP, 1, i13, i14, null);
            this.f334h += (long) i12;
            this.f333g = i14;
        }
        return j5 <= 0;
    }

    @Override // ad.b
    public final void b(long j) {
        this.f332f = j;
        this.f333g = 0;
        this.f334h = 0L;
    }

    @Override // ad.b
    public final void c(int i7, long j) {
        this.f327a.c(new g(this.f329c, 1, i7, j));
        this.f328b.e(this.f330d);
    }
}
