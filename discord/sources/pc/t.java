package pc;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f17927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f17928b;

    public t(v vVar, v vVar2) {
        this.f17927a = vVar;
        this.f17928b = vVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (this.f17927a.equals(tVar.f17927a) && this.f17928b.equals(tVar.f17928b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f17928b.hashCode() + (this.f17927a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        v vVar = this.f17927a;
        sb2.append(vVar);
        v vVar2 = this.f17928b;
        if (vVar.equals(vVar2)) {
            str = "";
        } else {
            str = ", " + vVar2;
        }
        return com.discord.chat.presentation.list.a.k(sb2, str, "]");
    }
}
