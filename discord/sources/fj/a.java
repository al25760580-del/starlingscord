package fj;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9262b;

    public a(String str, String str2) {
        this.f9261a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f9262b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f9261a.equals(aVar.f9261a) && this.f9262b.equals(aVar.f9262b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f9261a.hashCode() ^ 1000003) * 1000003) ^ this.f9262b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f9261a);
        sb2.append(", version=");
        return com.discord.chat.presentation.list.a.k(sb2, this.f9262b, "}");
    }
}
