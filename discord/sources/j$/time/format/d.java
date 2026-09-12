package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f13493a;

    public d(char c8) {
        this.f13493a = c8;
    }

    @Override // j$.time.format.f
    public final boolean a(p pVar, StringBuilder sb2) {
        sb2.append(this.f13493a);
        return true;
    }

    public final String toString() {
        char c8 = this.f13493a;
        if (c8 == '\'') {
            return "''";
        }
        return "'" + c8 + "'";
    }
}
