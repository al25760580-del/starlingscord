package rl;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f19440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f19441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f19442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f19443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f19444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f19445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f19446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f19447h;

    public a(double d6, double d7, double d8, double d9, double d10, double d11, int i7, int i10) {
        this.f19440a = d6;
        this.f19441b = d7;
        this.f19442c = d8;
        this.f19443d = d9;
        this.f19444e = d10;
        this.f19445f = d11;
        this.f19446g = i7;
        this.f19447h = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Double.compare(this.f19440a, aVar.f19440a) == 0 && Double.compare(this.f19441b, aVar.f19441b) == 0 && Double.compare(this.f19442c, aVar.f19442c) == 0 && Double.compare(this.f19443d, aVar.f19443d) == 0 && Double.compare(this.f19444e, aVar.f19444e) == 0 && Double.compare(this.f19445f, aVar.f19445f) == 0 && this.f19446g == aVar.f19446g && this.f19447h == aVar.f19447h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19447h) + com.discord.chat.presentation.list.a.u(this.f19446g, com.discord.chat.presentation.list.a.d(com.discord.chat.presentation.list.a.d(com.discord.chat.presentation.list.a.d(com.discord.chat.presentation.list.a.d(com.discord.chat.presentation.list.a.d(Double.hashCode(this.f19440a) * 31, this.f19441b, 31), this.f19442c, 31), this.f19443d, 31), this.f19444e, 31), this.f19445f, 31), 31);
    }

    public final String toString() {
        return "FocusedInputLayoutChangedEventData(x=" + this.f19440a + ", y=" + this.f19441b + ", width=" + this.f19442c + ", height=" + this.f19443d + ", absoluteX=" + this.f19444e + ", absoluteY=" + this.f19445f + ", target=" + this.f19446g + ", parentScrollViewTarget=" + this.f19447h + ")";
    }
}
