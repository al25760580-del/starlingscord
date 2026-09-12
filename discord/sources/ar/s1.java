package ar;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2963a = new ThreadLocal();

    public static t0 a() {
        ThreadLocal threadLocal = f2963a;
        t0 t0Var = (t0) threadLocal.get();
        if (t0Var != null) {
            return t0Var;
        }
        g gVar = new g(Thread.currentThread());
        threadLocal.set(gVar);
        return gVar;
    }
}
