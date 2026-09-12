package md;

import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements o0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0 f15593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15594e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f15595i;

    public c(d dVar, o0 o0Var) {
        this.f15595i = dVar;
        this.f15593d = o0Var;
    }

    @Override // md.o0
    public final void b() {
        this.f15593d.b();
    }

    @Override // md.o0
    public final int c(e4.r rVar, lc.f fVar, int i7) {
        d dVar = this.f15595i;
        if (dVar.b()) {
            return -3;
        }
        if (this.f15594e) {
            fVar.f14999e = 4;
            return -4;
        }
        long jS = dVar.S();
        int iC = this.f15593d.c(rVar, fVar, i7);
        if (iC != -5) {
            long j = dVar.f15602w;
            if (j == Long.MIN_VALUE || ((iC != -4 || fVar.f15012x < j) && !(iC == -3 && jS == Long.MIN_VALUE && !fVar.f15011w))) {
                return iC;
            }
            fVar.e();
            fVar.f14999e = 4;
            this.f15594e = true;
            return -4;
        }
        Format format = (Format) rVar.f8035i;
        format.getClass();
        int i10 = format.Z;
        int i11 = format.Y;
        if (i11 == 0 && i10 == 0) {
            return -5;
        }
        if (dVar.f15602w != Long.MIN_VALUE) {
            i10 = 0;
        }
        gc.g0 g0VarA = format.a();
        g0VarA.A = i11;
        g0VarA.B = i10;
        rVar.f8035i = new Format(g0VarA);
        return -5;
    }

    @Override // md.o0
    public final int f(long j) {
        if (this.f15595i.b()) {
            return -3;
        }
        return this.f15593d.f(j);
    }

    @Override // md.o0
    public final boolean isReady() {
        return !this.f15595i.b() && this.f15593d.isReady();
    }
}
