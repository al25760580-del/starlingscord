package vj;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21689b;

    public b(int i7, int i10) {
        this.f21688a = i7;
        this.f21689b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f21688a == bVar.f21688a && this.f21689b == bVar.f21689b;
    }

    public final int hashCode() {
        return this.f21688a ^ this.f21689b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f21688a);
        sb2.append("(");
        return com.discord.chat.presentation.list.a.j(sb2, this.f21689b, ')');
    }
}
