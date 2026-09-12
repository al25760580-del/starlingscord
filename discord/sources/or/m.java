package or;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f17572a;

    static {
        boolean z5;
        try {
            Class.forName("java.lang.ClassValue");
            z5 = true;
        } catch (Throwable unused) {
            z5 = false;
        }
        f17572a = z5;
    }
}
