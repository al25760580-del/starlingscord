package fe;

import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.List;
import je.e0;
import kotlin.jvm.internal.LongCompanionObject;
import md.x0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f9079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f9081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Format[] f9082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f9083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9084f;

    public c(x0 x0Var, int[] iArr) {
        int i7 = 0;
        je.b.k(iArr.length > 0);
        x0Var.getClass();
        this.f9079a = x0Var;
        int length = iArr.length;
        this.f9080b = length;
        this.f9082d = new Format[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f9082d[i10] = x0Var.f15730v[iArr[i10]];
        }
        Arrays.sort(this.f9082d, new cl.b(5));
        this.f9081c = new int[this.f9080b];
        while (true) {
            int i11 = this.f9080b;
            if (i7 >= i11) {
                this.f9083e = new long[i11];
                return;
            } else {
                this.f9081c[i7] = x0Var.a(this.f9082d[i7]);
                i7++;
            }
        }
    }

    @Override // fe.p
    public final boolean a(int i7, long j) {
        return this.f9083e[i7] > j;
    }

    @Override // fe.p
    public final x0 c() {
        return this.f9079a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f9079a == cVar.f9079a && Arrays.equals(this.f9081c, cVar.f9081c)) {
                return true;
            }
        }
        return false;
    }

    @Override // fe.p
    public final Format f(int i7) {
        return this.f9082d[i7];
    }

    @Override // fe.p
    public final int g(int i7) {
        return this.f9081c[i7];
    }

    @Override // fe.p
    public int h(long j, List list) {
        return list.size();
    }

    public final int hashCode() {
        if (this.f9084f == 0) {
            this.f9084f = Arrays.hashCode(this.f9081c) + (System.identityHashCode(this.f9079a) * 31);
        }
        return this.f9084f;
    }

    @Override // fe.p
    public final int i(Format format) {
        for (int i7 = 0; i7 < this.f9080b; i7++) {
            if (this.f9082d[i7] == format) {
                return i7;
            }
        }
        return -1;
    }

    @Override // fe.p
    public final int k() {
        return this.f9081c[d()];
    }

    @Override // fe.p
    public final Format l() {
        return this.f9082d[d()];
    }

    @Override // fe.p
    public final int length() {
        return this.f9081c.length;
    }

    @Override // fe.p
    public final boolean n(int i7, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zA = a(i7, jElapsedRealtime);
        int i10 = 0;
        while (i10 < this.f9080b && !zA) {
            zA = (i10 == i7 || a(i10, jElapsedRealtime)) ? false : true;
            i10++;
        }
        if (!zA) {
            return false;
        }
        long[] jArr = this.f9083e;
        long j5 = jArr[i7];
        int i11 = e0.f13788a;
        long j7 = jElapsedRealtime + j;
        if (((j ^ j7) & (jElapsedRealtime ^ j7)) < 0) {
            j7 = LongCompanionObject.MAX_VALUE;
        }
        jArr[i7] = Math.max(j5, j7);
        return true;
    }

    @Override // fe.p
    public final int s(int i7) {
        for (int i10 = 0; i10 < this.f9080b; i10++) {
            if (this.f9081c[i10] == i7) {
                return i10;
            }
        }
        return -1;
    }

    @Override // fe.p
    public void disable() {
    }

    @Override // fe.p
    public void enable() {
    }

    @Override // fe.p
    public void o(float f2) {
    }
}
