package sb;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19822a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f19822a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f19822a.equals(((c) obj).f19822a);
    }

    public final int hashCode() {
        return this.f19822a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return com.discord.chat.presentation.list.a.k(new StringBuilder("Encoding{name=\""), this.f19822a, "\"}");
    }
}
