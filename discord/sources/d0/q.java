package d0;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f7570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f7571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f7572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f7573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f7574e;

    public q(double d6, double d7, double d8, double d9, double d10) {
        this.f7570a = d6;
        this.f7571b = d7;
        this.f7572c = d8;
        this.f7573d = d9;
        this.f7574e = d10;
        if (Double.isNaN(d7) || Double.isNaN(d8) || Double.isNaN(d9) || Double.isNaN(d10) || Double.isNaN(0.0d) || Double.isNaN(0.0d) || Double.isNaN(d6)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d10 < 0.0d || d10 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d10);
        }
        if (d10 == 0.0d && (d7 == 0.0d || d6 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d10 >= 1.0d && d9 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d7 == 0.0d || d6 == 0.0d) && d9 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d9 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d7 < 0.0d || d6 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Double.compare(this.f7570a, qVar.f7570a) == 0 && Double.compare(this.f7571b, qVar.f7571b) == 0 && Double.compare(this.f7572c, qVar.f7572c) == 0 && Double.compare(this.f7573d, qVar.f7573d) == 0 && Double.compare(this.f7574e, qVar.f7574e) == 0 && Double.compare(0.0d, 0.0d) == 0 && Double.compare(0.0d, 0.0d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(0.0d) + com.discord.chat.presentation.list.a.d(com.discord.chat.presentation.list.a.d(com.discord.chat.presentation.list.a.d(com.discord.chat.presentation.list.a.d(com.discord.chat.presentation.list.a.d(Double.hashCode(this.f7570a) * 31, this.f7571b, 31), this.f7572c, 31), this.f7573d, 31), this.f7574e, 31), 0.0d, 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f7570a + ", a=" + this.f7571b + ", b=" + this.f7572c + ", c=" + this.f7573d + ", d=" + this.f7574e + ", e=0.0, f=0.0)";
    }
}
