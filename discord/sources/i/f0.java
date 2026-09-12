package i;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static f0 f11209d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11212c;

    public final void a(double d6, double d7, long j) {
        float f2 = (j - 946728000000L) / 8.64E7f;
        float f7 = (0.01720197f * f2) + 6.24006f;
        double d8 = f7;
        double dSin = (Math.sin(f7 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f7) * 3.4906598739326E-4d) + (Math.sin(d8) * 0.03341960161924362d) + d8 + 1.796593063d + 3.141592653589793d;
        double d9 = (-d7) / 360.0d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d8) * 0.0053d) + ((double) (Math.round(((double) (f2 - 9.0E-4f)) - d9) + 9.0E-4f)) + d9;
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d10 = 0.01745329238474369d * d6;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d10))) / (Math.cos(dAsin) * Math.cos(d10));
        if (dSin3 >= 1.0d) {
            this.f11212c = 1;
            this.f11210a = -1L;
            this.f11211b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f11212c = 0;
                this.f11210a = -1L;
                this.f11211b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f11210a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f11211b = jRound;
            if (jRound >= j || this.f11210a <= j) {
                this.f11212c = 1;
            } else {
                this.f11212c = 0;
            }
        }
    }
}
