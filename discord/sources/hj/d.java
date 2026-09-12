package hj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f10816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f10817b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f10816a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f10817b = cls2 != null;
    }

    public static boolean a() {
        return (f10816a == null || f10817b) ? false : true;
    }
}
