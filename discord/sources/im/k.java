package im;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11933c;

    public k(boolean z5, int i7, int i10) {
        this.f11931a = z5;
        this.f11932b = i7;
        this.f11933c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f11931a == kVar.f11931a && this.f11932b == kVar.f11932b && this.f11933c == kVar.f11933c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11933c) + com.discord.chat.presentation.list.a.u(this.f11932b, Boolean.hashCode(this.f11931a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActiveUpdateSnapshot(pointerInside=");
        sb2.append(this.f11931a);
        sb2.append(", numberOfPointers=");
        sb2.append(this.f11932b);
        sb2.append(", pointerType=");
        return kk.b.l(sb2, this.f11933c, ")");
    }
}
