package ij;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k extends Exception {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f11814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final StackTraceElement[] f11815e;

    static {
        f11814d = System.getProperty("surefire.test.class.path") != null;
        f11815e = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
