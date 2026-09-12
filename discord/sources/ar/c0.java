package ar;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f2901a;

    static {
        String property;
        br.d dVar;
        e0 e0Var;
        int i7 = fr.w.f9400a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            hr.e eVar = k0.f2938a;
            dVar = fr.q.f9394a;
            br.d dVar2 = dVar.f3388w;
            if (dVar == null) {
                e0Var = dVar;
                e0Var = kotlinx.coroutines.a.G;
            }
        } else {
            e0Var = kotlinx.coroutines.a.G;
        }
        e0Var = dVar;
        f2901a = e0Var;
    }
}
