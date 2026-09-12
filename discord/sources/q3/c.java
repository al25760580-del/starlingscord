package q3;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f18596d;

    public c(String str, String str2, boolean z5, b bVar) {
        if (str2.isEmpty() || str2.charAt(0) != '/') {
            throw new IllegalArgumentException("Path should start with a slash '/'.");
        }
        if (!str2.endsWith("/")) {
            throw new IllegalArgumentException("Path should end with a slash '/'");
        }
        this.f18594b = str;
        this.f18595c = str2;
        this.f18593a = z5;
        this.f18596d = bVar;
    }
}
