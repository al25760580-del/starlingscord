package vl;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f21743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f21744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21746d;

    public h(double d6, double d7, int i7, int i10) {
        this.f21743a = d6;
        this.f21744b = d7;
        this.f21745c = i7;
        this.f21746d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Double.compare(this.f21743a, hVar.f21743a) == 0 && Double.compare(this.f21744b, hVar.f21744b) == 0 && this.f21745c == hVar.f21745c && this.f21746d == hVar.f21746d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21746d) + com.discord.chat.presentation.list.a.u(this.f21745c, com.discord.chat.presentation.list.a.d(Double.hashCode(this.f21743a) * 31, this.f21744b, 31), 31);
    }

    public final String toString() {
        return "PendingKeyboardStartEvent(keyboardHeight=" + this.f21743a + ", progress=" + this.f21744b + ", duration=" + this.f21745c + ", target=" + this.f21746d + ")";
    }
}
