package sh;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f20203d = new v(1, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20206c;

    public v(int i7, String str, String str2) {
        this.f20204a = i7;
        this.f20205b = str;
        this.f20206c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        String str = vVar.f20206c;
        String str2 = vVar.f20205b;
        if (this.f20204a != vVar.f20204a) {
            return false;
        }
        String str3 = this.f20205b;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        String str4 = this.f20206c;
        if (str4 == null) {
            return str == null;
        }
        return str4.equals(str);
    }

    public final int hashCode() {
        String str = this.f20205b;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f20206c;
        return (str2 != null ? str2.hashCode() : 0) ^ ((iHashCode ^ ((this.f20204a ^ 1000003) * 1000003)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AssetPackLocation{packStorageMethod=");
        sb2.append(this.f20204a);
        sb2.append(", path=");
        sb2.append(this.f20205b);
        sb2.append(", assetsPath=");
        return com.discord.chat.presentation.list.a.k(sb2, this.f20206c, "}");
    }
}
