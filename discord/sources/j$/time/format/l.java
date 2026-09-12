package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13511a;

    public l(String str) {
        this.f13511a = str;
    }

    @Override // j$.time.format.f
    public final boolean a(p pVar, StringBuilder sb2) {
        sb2.append(this.f13511a);
        return true;
    }

    public final String toString() {
        return "'" + this.f13511a.replace("'", "''") + "'";
    }
}
