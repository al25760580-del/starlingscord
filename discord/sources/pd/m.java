package pd;

import com.google.android.exoplayer2.Format;
import e4.r;
import je.e0;
import md.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements o0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Format f17997d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long[] f17999i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f18000v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public qd.g f18001w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f18002x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18003y;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e4.e f17998e = new e4.e(6, (byte) 0);
    public long E = -9223372036854775807L;

    public m(qd.g gVar, Format format, boolean z5) {
        this.f17997d = format;
        this.f18001w = gVar;
        this.f17999i = gVar.f18743b;
        a(gVar, z5);
    }

    public final void a(qd.g gVar, boolean z5) {
        int i7 = this.f18003y;
        long j = -9223372036854775807L;
        long j5 = i7 == 0 ? -9223372036854775807L : this.f17999i[i7 - 1];
        this.f18000v = z5;
        this.f18001w = gVar;
        long[] jArr = gVar.f18743b;
        this.f17999i = jArr;
        long j7 = this.E;
        if (j7 == -9223372036854775807L) {
            if (j5 != -9223372036854775807L) {
                this.f18003y = e0.b(jArr, j5, false);
            }
        } else {
            int iB = e0.b(jArr, j7, true);
            this.f18003y = iB;
            if (this.f18000v && iB == this.f17999i.length) {
                j = j7;
            }
            this.E = j;
        }
    }

    @Override // md.o0
    public final int c(r rVar, lc.f fVar, int i7) {
        int i10 = this.f18003y;
        boolean z5 = i10 == this.f17999i.length;
        if (z5 && !this.f18000v) {
            fVar.f14999e = 4;
            return -4;
        }
        if ((i7 & 2) != 0 || !this.f18002x) {
            rVar.f8035i = this.f17997d;
            this.f18002x = true;
            return -5;
        }
        if (z5) {
            return -3;
        }
        if ((i7 & 1) == 0) {
            this.f18003y = i10 + 1;
        }
        if ((i7 & 4) == 0) {
            byte[] bArrA = this.f17998e.A(this.f18001w.f18742a[i10]);
            fVar.i(bArrA.length);
            fVar.f15010v.put(bArrA);
        }
        fVar.f15012x = this.f17999i[i10];
        fVar.f14999e = 1;
        return -4;
    }

    @Override // md.o0
    public final int f(long j) {
        int iMax = Math.max(this.f18003y, e0.b(this.f17999i, j, true));
        int i7 = iMax - this.f18003y;
        this.f18003y = iMax;
        return i7;
    }

    @Override // md.o0
    public final boolean isReady() {
        return true;
    }

    @Override // md.o0
    public final void b() {
    }
}
