package mi;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f15820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15822c;

    public i(int i7, int i10, Class cls) {
        this(q.a(cls), i7, i10);
    }

    public static i a(Class cls) {
        return new i(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f15820a.equals(iVar.f15820a) && this.f15821b == iVar.f15821b && this.f15822c == iVar.f15822c;
    }

    public final int hashCode() {
        return ((((this.f15820a.hashCode() ^ 1000003) * 1000003) ^ this.f15821b) * 1000003) ^ this.f15822c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f15820a);
        sb2.append(", type=");
        int i7 = this.f15821b;
        if (i7 == 1) {
            str = "required";
        } else {
            str = i7 == 0 ? "optional" : "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i10 = this.f15822c;
        if (i10 == 0) {
            str2 = "direct";
        } else if (i10 == 1) {
            str2 = "provider";
        } else {
            if (i10 != 2) {
                throw new AssertionError(kk.b.h(i10, "Unsupported injection: "));
            }
            str2 = "deferred";
        }
        return com.discord.chat.presentation.list.a.k(sb2, str2, "}");
    }

    public i(q qVar, int i7, int i10) {
        this.f15820a = qVar;
        this.f15821b = i7;
        this.f15822c = i10;
    }
}
