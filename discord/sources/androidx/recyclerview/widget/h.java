package androidx.recyclerview.widget;

import android.os.SystemClock;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes.dex */
public final class h implements pd.h, pc.l, pc.m, vd.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2614e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f2615i;

    public /* synthetic */ h(long j, Object obj, int i7) {
        this.f2613d = i7;
        this.f2614e = j;
        this.f2615i = obj;
    }

    @Override // pd.h
    public long A(long j, long j5) {
        return ((pc.g) this.f2615i).f17886a;
    }

    @Override // pc.l
    public void C(byte[] bArr, int i7, int i10) {
        ((pc.l) this.f2615i).C(bArr, i7, i10);
    }

    @Override // pc.l
    public int D() {
        return ((pc.l) this.f2615i).D();
    }

    public void E(int i7) {
        if (i7 < 64) {
            this.f2614e &= ~(1 << i7);
            return;
        }
        h hVar = (h) this.f2615i;
        if (hVar != null) {
            hVar.E(i7 - 64);
        }
    }

    public int F(int i7) {
        h hVar = (h) this.f2615i;
        if (hVar == null) {
            return i7 >= 64 ? Long.bitCount(this.f2614e) : Long.bitCount(this.f2614e & ((1 << i7) - 1));
        }
        if (i7 < 64) {
            return Long.bitCount(this.f2614e & ((1 << i7) - 1));
        }
        return Long.bitCount(this.f2614e) + hVar.F(i7 - 64);
    }

    public void G() {
        if (((h) this.f2615i) == null) {
            this.f2615i = new h(0);
        }
    }

    public boolean H(int i7) {
        if (i7 < 64) {
            return (this.f2614e & (1 << i7)) != 0;
        }
        G();
        return ((h) this.f2615i).H(i7 - 64);
    }

    public long I() {
        l9.a aVar = (l9.a) this.f2615i;
        long j = this.f2614e;
        if (j != -1) {
            return j;
        }
        this.f2614e = 0L;
        int iA = aVar.a();
        for (int i7 = 0; i7 < iA; i7++) {
            this.f2614e += (long) aVar.b(i7);
        }
        return this.f2614e;
    }

    public void J(int i7, boolean z5) {
        if (i7 >= 64) {
            G();
            ((h) this.f2615i).J(i7 - 64, z5);
            return;
        }
        long j = this.f2614e;
        boolean z6 = (Long.MIN_VALUE & j) != 0;
        long j5 = (1 << i7) - 1;
        this.f2614e = ((j & (~j5)) << 1) | (j & j5);
        if (z5) {
            M(i7);
        } else {
            E(i7);
        }
        if (z6 || ((h) this.f2615i) != null) {
            G();
            ((h) this.f2615i).J(0, z6);
        }
    }

    public boolean K(int i7) {
        if (i7 >= 64) {
            G();
            return ((h) this.f2615i).K(i7 - 64);
        }
        long j = 1 << i7;
        long j5 = this.f2614e;
        boolean z5 = (j5 & j) != 0;
        long j7 = j5 & (~j);
        this.f2614e = j7;
        long j10 = j - 1;
        this.f2614e = (j7 & j10) | Long.rotateRight((~j10) & j7, 1);
        h hVar = (h) this.f2615i;
        if (hVar != null) {
            if (hVar.H(0)) {
                M(63);
            }
            ((h) this.f2615i).K(0);
        }
        return z5;
    }

    public void L() {
        this.f2614e = 0L;
        h hVar = (h) this.f2615i;
        if (hVar != null) {
            hVar.L();
        }
    }

    public void M(int i7) {
        if (i7 < 64) {
            this.f2614e |= 1 << i7;
        } else {
            G();
            ((h) this.f2615i).M(i7 - 64);
        }
    }

    public void N(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f2615i) == null) {
            this.f2615i = exc;
            this.f2614e = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.f2614e) {
            Exception exc2 = (Exception) this.f2615i;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f2615i;
            this.f2615i = null;
            throw exc3;
        }
    }

    @Override // pc.l
    public boolean a(byte[] bArr, int i7, int i10, boolean z5) {
        return ((pc.l) this.f2615i).a(bArr, 0, i10, z5);
    }

    @Override // pd.h
    public long b(long j) {
        return ((pc.g) this.f2615i).f17890e[(int) j] - this.f2614e;
    }

    @Override // pc.m
    public void c(pc.u uVar) {
        ((pc.m) this.f2615i).c(new uc.c(this, uVar));
    }

    @Override // pd.h
    public long e(long j, long j5) {
        return ((pc.g) this.f2615i).f17889d[(int) j];
    }

    @Override // vd.f
    public int f(long j) {
        return this.f2614e > j ? 0 : -1;
    }

    @Override // pc.l
    public boolean g(byte[] bArr, int i7, int i10, boolean z5) {
        return ((pc.l) this.f2615i).g(bArr, i7, i10, z5);
    }

    @Override // pc.l
    public long getLength() {
        return ((pc.l) this.f2615i).getLength() - this.f2614e;
    }

    @Override // pc.l
    public long getPosition() {
        return ((pc.l) this.f2615i).getPosition() - this.f2614e;
    }

    @Override // vd.f
    public long h(int i7) {
        je.b.g(i7 == 0);
        return this.f2614e;
    }

    @Override // pd.h
    public long i(long j, long j5) {
        return 0L;
    }

    @Override // pd.h
    public long j(long j, long j5) {
        return -9223372036854775807L;
    }

    @Override // pd.h
    public qd.j k(long j) {
        pc.g gVar = (pc.g) this.f2615i;
        int i7 = (int) j;
        return new qd.j(gVar.f17888c[i7], gVar.f17887b[i7], null);
    }

    @Override // vd.f
    public List l(long j) {
        if (j >= this.f2614e) {
            return (ei.e0) this.f2615i;
        }
        ei.c0 c0Var = ei.e0.f8303e;
        return ei.r0.f8352w;
    }

    @Override // pc.l
    public long m() {
        return ((pc.l) this.f2615i).m() - this.f2614e;
    }

    @Override // pc.l
    public void n(int i7) {
        ((pc.l) this.f2615i).n(i7);
    }

    @Override // vd.f
    public int o() {
        return 1;
    }

    @Override // pd.h
    public long p(long j, long j5) {
        return je.e0.e(((pc.g) this.f2615i).f17890e, j + this.f2614e, true);
    }

    @Override // pc.m
    public void q() {
        ((pc.m) this.f2615i).q();
    }

    @Override // pc.l
    public int r(byte[] bArr, int i7, int i10) {
        return ((pc.l) this.f2615i).r(bArr, i7, i10);
    }

    @Override // he.k
    public int read(byte[] bArr, int i7, int i10) {
        return ((pc.l) this.f2615i).read(bArr, i7, i10);
    }

    @Override // pc.l
    public void readFully(byte[] bArr, int i7, int i10) {
        ((pc.l) this.f2615i).readFully(bArr, i7, i10);
    }

    @Override // pc.l
    public void t() {
        ((pc.l) this.f2615i).t();
    }

    public String toString() {
        switch (this.f2613d) {
            case 0:
                if (((h) this.f2615i) == null) {
                    return Long.toBinaryString(this.f2614e);
                }
                return ((h) this.f2615i).toString() + "xx" + Long.toBinaryString(this.f2614e);
            default:
                return super.toString();
        }
    }

    @Override // pc.l
    public void u(int i7) {
        ((pc.l) this.f2615i).u(i7);
    }

    @Override // pd.h
    public boolean v() {
        return true;
    }

    @Override // pd.h
    public long w() {
        return 0L;
    }

    @Override // pc.m
    public pc.x x(int i7, int i10) {
        return ((pc.m) this.f2615i).x(i7, i10);
    }

    @Override // pd.h
    public long z(long j) {
        return ((pc.g) this.f2615i).f17886a;
    }

    public /* synthetic */ h(Object obj, long j, int i7) {
        this.f2613d = i7;
        this.f2615i = obj;
        this.f2614e = j;
    }

    public h(l9.a animationInformation) {
        this.f2613d = 4;
        Intrinsics.checkNotNullParameter(animationInformation, "animationInformation");
        this.f2615i = animationInformation;
        this.f2614e = -1L;
    }

    public h(BufferedSource source) {
        this.f2613d = 2;
        Intrinsics.checkNotNullParameter(source, "source");
        this.f2615i = source;
        this.f2614e = 262144L;
    }

    public h(pc.l lVar, long j) {
        this.f2613d = 6;
        this.f2615i = lVar;
        je.b.g(lVar.getPosition() >= j);
        this.f2614e = j;
    }

    public h(int i7) {
        this.f2613d = i7;
        switch (i7) {
            case 1:
                break;
            default:
                this.f2614e = 0L;
                break;
        }
    }
}
