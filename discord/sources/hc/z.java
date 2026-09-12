package hc;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.AnalyticsListener$EventTime;
import java.util.Collections;
import java.util.List;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class z {
    public long A;
    public long B;
    public long C;
    public long D;
    public int E;
    public int F;
    public int G;
    public long H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public long N;
    public Format O;
    public Format P;
    public long Q;
    public long R;
    public float S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f10518a = new long[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f10519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f10520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f10521d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f10522e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f10523f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f10524g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f10525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f10526i;
    public boolean j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10527l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10528m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10529n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10530o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10531p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f10532q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10533r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f10534s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f10535t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f10536u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f10537v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f10538w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f10539x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f10540y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f10541z;

    public z(AnalyticsListener$EventTime analyticsListener$EventTime) {
        List list = Collections.EMPTY_LIST;
        this.f10519b = list;
        this.f10520c = list;
        this.f10521d = list;
        this.f10522e = list;
        this.f10523f = list;
        this.f10524g = list;
        boolean z5 = false;
        this.G = 0;
        this.H = analyticsListener$EventTime.f5592a;
        this.f10526i = -9223372036854775807L;
        this.f10532q = -9223372036854775807L;
        md.s sVar = analyticsListener$EventTime.f5595d;
        if (sVar != null && sVar.a()) {
            z5 = true;
        }
        this.f10525h = z5;
        this.f10535t = -1L;
        this.f10534s = -1L;
        this.f10533r = -1;
        this.S = 1.0f;
    }

    public static boolean a(int i7) {
        return i7 == 6 || i7 == 7 || i7 == 10;
    }

    public final void b(long j) {
        Format format;
        int i7;
        if (this.G == 3 && (format = this.P) != null && (i7 = format.E) != -1) {
            long j5 = (long) ((j - this.R) * this.S);
            this.f10540y += j5;
            this.f10541z = (j5 * ((long) i7)) + this.f10541z;
        }
        this.R = j;
    }

    public final void c(long j) {
        Format format;
        if (this.G == 3 && (format = this.O) != null) {
            long j5 = (long) ((j - this.Q) * this.S);
            int i7 = format.O;
            if (i7 != -1) {
                this.f10536u += j5;
                this.f10537v = (((long) i7) * j5) + this.f10537v;
            }
            int i10 = format.E;
            if (i10 != -1) {
                this.f10538w += j5;
                this.f10539x = (j5 * ((long) i10)) + this.f10539x;
            }
        }
        this.Q = j;
    }

    public final void d(AnalyticsListener$EventTime analyticsListener$EventTime, Format format) {
        int i7;
        if (e0.a(this.P, format)) {
            return;
        }
        b(analyticsListener$EventTime.f5592a);
        if (format != null && this.f10535t == -1 && (i7 = format.E) != -1) {
            this.f10535t = i7;
        }
        this.P = format;
    }

    public final void e(AnalyticsListener$EventTime analyticsListener$EventTime, Format format) {
        int i7;
        int i10;
        if (e0.a(this.O, format)) {
            return;
        }
        c(analyticsListener$EventTime.f5592a);
        if (format != null) {
            if (this.f10533r == -1 && (i10 = format.O) != -1) {
                this.f10533r = i10;
            }
            if (this.f10534s == -1 && (i7 = format.E) != -1) {
                this.f10534s = i7;
            }
        }
        this.O = format;
    }

    public final void f(AnalyticsListener$EventTime analyticsListener$EventTime, int i7) {
        long j = analyticsListener$EventTime.f5592a;
        je.b.g(j >= this.H);
        long j5 = j - this.H;
        int i10 = this.G;
        long[] jArr = this.f10518a;
        jArr[i10] = jArr[i10] + j5;
        if (this.f10526i == -9223372036854775807L) {
            this.f10526i = j;
        }
        this.f10527l |= ((i10 != 1 && i10 != 2 && i10 != 14) || i7 == 1 || i7 == 2 || i7 == 14 || i7 == 3 || i7 == 4 || i7 == 9 || i7 == 11) ? false : true;
        this.j |= i7 == 3 || i7 == 4 || i7 == 9;
        this.k = (i7 == 11) | this.k;
        if (i10 != 4 && i10 != 7 && (i7 == 4 || i7 == 7)) {
            this.f10528m++;
        }
        if (i7 == 5) {
            this.f10530o++;
        }
        if (!a(i10) && a(i7)) {
            this.f10531p++;
            this.N = j;
        }
        if (a(this.G) && this.G != 7 && i7 == 7) {
            this.f10529n++;
        }
        if (a(this.G)) {
            long j7 = j - this.N;
            long j10 = this.f10532q;
            if (j10 == -9223372036854775807L || j7 > j10) {
                this.f10532q = j7;
            }
        }
        this.G = i7;
        this.H = j;
    }
}
