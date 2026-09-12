package zm;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f24053d;

    public a(boolean z5, boolean z6, boolean z7, boolean z10) {
        this.f24050a = z5;
        this.f24051b = z6;
        this.f24052c = z7;
        this.f24053d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f24050a == aVar.f24050a && this.f24051b == aVar.f24051b && this.f24052c == aVar.f24052c && this.f24053d == aVar.f24053d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24053d) + com.discord.chat.presentation.list.a.g(com.discord.chat.presentation.list.a.g(Boolean.hashCode(this.f24050a) * 31, 31, this.f24051b), 31, this.f24052c);
    }

    public final String toString() {
        return "SafeAreaViewEdges(left=" + this.f24050a + ", top=" + this.f24051b + ", right=" + this.f24052c + ", bottom=" + this.f24053d + ")";
    }
}
