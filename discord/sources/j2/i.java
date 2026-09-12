package j2;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f13631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f13632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f13634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f13635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f13636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f13637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f13638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f13639i;
    public final f j;

    public i() {
        this.f13631a = Math.sqrt(1500.0d);
        this.f13632b = 0.5d;
        this.f13633c = false;
        this.f13639i = Double.MAX_VALUE;
        this.j = new f();
    }

    public final void a(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f13632b = f2;
        this.f13633c = false;
    }

    public final void b(float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f13631a = Math.sqrt(f2);
        this.f13633c = false;
    }

    public final f c(double d6, double d7, long j) {
        double dSin;
        double dCos;
        if (!this.f13633c) {
            if (this.f13639i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d8 = this.f13632b;
            if (d8 > 1.0d) {
                double d9 = this.f13631a;
                this.f13636f = (Math.sqrt((d8 * d8) - 1.0d) * d9) + ((-d8) * d9);
                double d10 = this.f13632b;
                double d11 = this.f13631a;
                this.f13637g = ((-d10) * d11) - (Math.sqrt((d10 * d10) - 1.0d) * d11);
            } else if (d8 >= 0.0d && d8 < 1.0d) {
                this.f13638h = Math.sqrt(1.0d - (d8 * d8)) * this.f13631a;
            }
            this.f13633c = true;
        }
        double d12 = j / 1000.0d;
        double d13 = d6 - this.f13639i;
        double d14 = this.f13632b;
        if (d14 > 1.0d) {
            double d15 = this.f13637g;
            double d16 = ((d15 * d13) - d7) / (d15 - this.f13636f);
            double d17 = d13 - d16;
            dSin = (Math.pow(2.718281828459045d, this.f13636f * d12) * d16) + (Math.pow(2.718281828459045d, d15 * d12) * d17);
            double d18 = this.f13637g;
            double dPow = Math.pow(2.718281828459045d, d18 * d12) * d17 * d18;
            double d19 = this.f13636f;
            dCos = (Math.pow(2.718281828459045d, d19 * d12) * d16 * d19) + dPow;
        } else if (d14 == 1.0d) {
            double d20 = this.f13631a;
            double d21 = (d20 * d13) + d7;
            double d22 = (d21 * d12) + d13;
            double dPow2 = Math.pow(2.718281828459045d, (-d20) * d12) * d22;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f13631a) * d12) * d22;
            double d23 = -this.f13631a;
            dCos = (Math.pow(2.718281828459045d, d23 * d12) * d21) + (dPow3 * d23);
            dSin = dPow2;
        } else {
            double d24 = 1.0d / this.f13638h;
            double d25 = this.f13631a;
            double d26 = ((d14 * d25 * d13) + d7) * d24;
            dSin = ((Math.sin(this.f13638h * d12) * d26) + (Math.cos(this.f13638h * d12) * d13)) * Math.pow(2.718281828459045d, (-d14) * d25 * d12);
            double d27 = this.f13631a;
            double d28 = this.f13632b;
            double d29 = (-d27) * dSin * d28;
            double dPow4 = Math.pow(2.718281828459045d, (-d28) * d27 * d12);
            double d30 = this.f13638h;
            double dSin2 = Math.sin(d30 * d12) * (-d30) * d13;
            double d31 = this.f13638h;
            dCos = (((Math.cos(d31 * d12) * d26 * d31) + dSin2) * dPow4) + d29;
        }
        float f2 = (float) (dSin + this.f13639i);
        f fVar = this.j;
        fVar.f13626a = f2;
        fVar.f13627b = (float) dCos;
        return fVar;
    }

    public i(float f2) {
        this.f13631a = Math.sqrt(1500.0d);
        this.f13632b = 0.5d;
        this.f13633c = false;
        this.j = new f();
        this.f13639i = f2;
    }
}
