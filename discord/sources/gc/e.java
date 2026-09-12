package gc;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements k1 {
    public md.o0 E;
    public Format[] F;
    public long G;
    public boolean I;
    public boolean J;
    public DefaultTrackSelector K;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9602e;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p1 f9604v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9605w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public hc.c0 f9606x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f9607y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9601d = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e4.r f9603i = new e4.r(7);
    public long H = Long.MIN_VALUE;

    public e(int i7) {
        this.f9602e = i7;
    }

    public static int e(int i7, int i10, int i11) {
        return i7 | i10 | i11 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
    }

    public final com.google.android.exoplayer2.b f(Exception exc, Format format, boolean z5, int i7) {
        int iY;
        if (format == null || this.J) {
            iY = 4;
        } else {
            this.J = true;
            try {
                iY = y(format) & 7;
                this.J = false;
            } catch (com.google.android.exoplayer2.b unused) {
                this.J = false;
                iY = 4;
            } catch (Throwable th2) {
                this.J = false;
                throw th2;
            }
        }
        return new com.google.android.exoplayer2.b(1, exc, i7, h(), this.f9605w, format, format == null ? 4 : iY, z5);
    }

    public je.n g() {
        return null;
    }

    public abstract String h();

    public final boolean i() {
        return this.H == Long.MIN_VALUE;
    }

    public abstract boolean j();

    public abstract boolean k();

    public abstract void l();

    public abstract void n(long j, boolean z5);

    public abstract void s(Format[] formatArr, long j, long j5);

    public final int t(e4.r rVar, lc.f fVar, int i7) {
        md.o0 o0Var = this.E;
        o0Var.getClass();
        int iC = o0Var.c(rVar, fVar, i7);
        if (iC == -4) {
            if (fVar.c(4)) {
                this.H = Long.MIN_VALUE;
                return this.I ? -4 : -3;
            }
            long j = fVar.f15012x + this.G;
            fVar.f15012x = j;
            this.H = Math.max(this.H, j);
            return iC;
        }
        if (iC == -5) {
            Format format = (Format) rVar.f8035i;
            format.getClass();
            long j5 = format.M;
            if (j5 != LongCompanionObject.MAX_VALUE) {
                g0 g0VarA = format.a();
                g0VarA.f9647o = j5 + this.G;
                rVar.f8035i = new Format(g0VarA);
            }
        }
        return iC;
    }

    public abstract void u(long j, long j5);

    public final void v(Format[] formatArr, md.o0 o0Var, long j, long j5) {
        je.b.k(!this.I);
        this.E = o0Var;
        if (this.H == Long.MIN_VALUE) {
            this.H = j;
        }
        this.F = formatArr;
        this.G = j5;
        s(formatArr, j, j5);
    }

    public final void w() {
        je.b.k(this.f9607y == 0);
        this.f9603i.y();
        p();
    }

    public abstract int y(Format format);

    public int z() {
        return 0;
    }

    public void o() {
    }

    public void p() {
    }

    public void q() {
    }

    public void r() {
    }

    @Override // gc.k1
    public void c(int i7, Object obj) {
    }

    public void m(boolean z5, boolean z6) {
    }

    public void x(float f2, float f7) {
    }
}
