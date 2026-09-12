package ke;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f14332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f14334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f14335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f14337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f14338g = new boolean[15];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14339h;

    public final boolean a() {
        return this.f14335d > 15 && this.f14339h == 0;
    }

    public final void b(long j) {
        long j5 = this.f14335d;
        if (j5 == 0) {
            this.f14332a = j;
        } else if (j5 == 1) {
            long j7 = j - this.f14332a;
            this.f14333b = j7;
            this.f14337f = j7;
            this.f14336e = 1L;
        } else {
            long j10 = j - this.f14334c;
            int i7 = (int) (j5 % 15);
            long jAbs = Math.abs(j10 - this.f14333b);
            boolean[] zArr = this.f14338g;
            if (jAbs <= 1000000) {
                this.f14336e++;
                this.f14337f += j10;
                if (zArr[i7]) {
                    zArr[i7] = false;
                    this.f14339h--;
                }
            } else if (!zArr[i7]) {
                zArr[i7] = true;
                this.f14339h++;
            }
        }
        this.f14335d++;
        this.f14334c = j;
    }

    public final void c() {
        this.f14335d = 0L;
        this.f14336e = 0L;
        this.f14337f = 0L;
        this.f14339h = 0;
        Arrays.fill(this.f14338g, false);
    }
}
