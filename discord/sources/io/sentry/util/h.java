package io.sentry.util;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f13226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f13227b;

    static {
        try {
            f13226a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            f13226a = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                f13227b = Double.valueOf(property).doubleValue() >= 9.0d;
            } else {
                f13227b = false;
            }
        } catch (Throwable unused2) {
            f13227b = false;
        }
    }
}
