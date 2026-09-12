package u4;

/* JADX INFO: loaded from: classes.dex */
public enum a {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20943d;

    a(String str) {
        this.f20943d = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f20943d;
    }
}
