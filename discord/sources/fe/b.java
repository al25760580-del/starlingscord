package fe;

import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import ei.b0;
import ei.e0;
import java.util.ArrayList;
import java.util.List;
import je.y;
import md.x0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final he.g f9066g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f9067h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f9068i;
    public final long j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f9069l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f9070m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f9071n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e0 f9072o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f9073p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f9074q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9075r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9076s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f9077t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public od.l f9078u;

    public b(x0 x0Var, int[] iArr, he.g gVar, long j, long j5, long j7, e0 e0Var) {
        super(x0Var, iArr);
        if (j7 < j) {
            je.b.N("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j7 = j;
        }
        this.f9066g = gVar;
        this.f9067h = j * 1000;
        this.f9068i = j5 * 1000;
        this.j = j7 * 1000;
        this.k = 1279;
        this.f9069l = 719;
        this.f9070m = 0.7f;
        this.f9071n = 0.75f;
        this.f9072o = e0.k(e0Var);
        this.f9073p = y.f13866a;
        this.f9074q = 1.0f;
        this.f9076s = 0;
        this.f9077t = -9223372036854775807L;
    }

    public static void t(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j5 : jArr) {
            j += j5;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            b0 b0Var = (b0) arrayList.get(i7);
            if (b0Var != null) {
                b0Var.a(new a(j, jArr[i7]));
            }
        }
    }

    public static long v(List list) {
        if (!list.isEmpty()) {
            od.l lVar = (od.l) ei.p.i(list);
            long j = lVar.f17227y;
            if (j != -9223372036854775807L) {
                long j5 = lVar.E;
                if (j5 != -9223372036854775807L) {
                    return j5 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // fe.p
    public final void b(long j, long j5, long j7, List list, od.m[] mVarArr) {
        long jV;
        this.f9073p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i7 = this.f9075r;
        if (i7 >= mVarArr.length || !mVarArr[i7].next()) {
            int length = mVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    jV = v(list);
                    break;
                }
                od.m mVar = mVarArr[i10];
                if (mVar.next()) {
                    jV = mVar.f() - mVar.d();
                    break;
                }
                i10++;
            }
        } else {
            od.m mVar2 = mVarArr[this.f9075r];
            jV = mVar2.f() - mVar2.d();
        }
        int i11 = this.f9076s;
        if (i11 == 0) {
            this.f9076s = 1;
            this.f9075r = u(jElapsedRealtime);
            return;
        }
        int i12 = this.f9075r;
        int i13 = list.isEmpty() ? -1 : i(((od.l) ei.p.i(list)).f17224v);
        if (i13 != -1) {
            i11 = ((od.l) ei.p.i(list)).f17225w;
            i12 = i13;
        }
        int iU = u(jElapsedRealtime);
        if (iU != i12 && !a(i12, jElapsedRealtime)) {
            Format[] formatArr = this.f9082d;
            Format format = formatArr[i12];
            Format format2 = formatArr[iU];
            long jMin = this.f9067h;
            if (j7 != -9223372036854775807L) {
                jMin = Math.min((long) ((jV != -9223372036854775807L ? j7 - jV : j7) * this.f9071n), jMin);
            }
            int i14 = format2.E;
            int i15 = format.E;
            if ((i14 > i15 && j5 < jMin) || (i14 < i15 && j5 >= this.f9068i)) {
                iU = i12;
            }
        }
        if (iU != i12) {
            i11 = 3;
        }
        this.f9076s = i11;
        this.f9075r = iU;
    }

    @Override // fe.p
    public final int d() {
        return this.f9075r;
    }

    @Override // fe.c, fe.p
    public final void disable() {
        this.f9078u = null;
    }

    @Override // fe.c, fe.p
    public final void enable() {
        this.f9077t = -9223372036854775807L;
        this.f9078u = null;
    }

    @Override // fe.c, fe.p
    public final int h(long j, List list) {
        int i7;
        int i10;
        this.f9073p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = this.f9077t;
        if (j5 != -9223372036854775807L && jElapsedRealtime - j5 < 1000 && (list.isEmpty() || ((od.l) ei.p.i(list)).equals(this.f9078u))) {
            return list.size();
        }
        this.f9077t = jElapsedRealtime;
        this.f9078u = list.isEmpty() ? null : (od.l) ei.p.i(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jY = je.e0.y(((od.l) list.get(size - 1)).f17227y - j, this.f9074q);
        long j7 = this.j;
        if (jY >= j7) {
            v(list);
            Format format = this.f9082d[u(jElapsedRealtime)];
            for (int i11 = 0; i11 < size; i11++) {
                od.l lVar = (od.l) list.get(i11);
                Format format2 = lVar.f17224v;
                if (je.e0.y(lVar.f17227y - j, this.f9074q) >= j7 && format2.E < format.E && (i7 = format2.O) != -1 && i7 <= this.f9069l && (i10 = format2.N) != -1 && i10 <= this.k && i7 < format.O) {
                    return i11;
                }
            }
        }
        return size;
    }

    @Override // fe.p
    public final int m() {
        return this.f9076s;
    }

    @Override // fe.c, fe.p
    public final void o(float f2) {
        this.f9074q = f2;
    }

    @Override // fe.p
    public final Object p() {
        return null;
    }

    public final int u(long j) {
        long j5;
        he.s sVar = (he.s) this.f9066g;
        synchronized (sVar) {
            j5 = sVar.f10696l;
        }
        long j7 = (long) (j5 * this.f9070m);
        this.f9066g.getClass();
        long j10 = (long) (j7 / this.f9074q);
        if (!this.f9072o.isEmpty()) {
            int i7 = 1;
            while (i7 < this.f9072o.size() - 1 && ((a) this.f9072o.get(i7)).f9064a < j10) {
                i7++;
            }
            a aVar = (a) this.f9072o.get(i7 - 1);
            a aVar2 = (a) this.f9072o.get(i7);
            long j11 = aVar.f9064a;
            float f2 = (j10 - j11) / (aVar2.f9064a - j11);
            long j12 = aVar.f9065b;
            j10 = j12 + ((long) (f2 * (aVar2.f9065b - j12)));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f9080b; i11++) {
            if (j == Long.MIN_VALUE || !a(i11, j)) {
                if (this.f9082d[i11].E <= j10) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }
}
