package ep;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g0 f8546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g0 f8547e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g0 f8548i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ g0[] f8549v;

    static {
        g0 g0Var = new g0("ONE_COLLECTION_PARAMETER", 0);
        f8546d = g0Var;
        g0 g0Var2 = new g0("OBJECT_PARAMETER_NON_GENERIC", 1);
        f8547e = g0Var2;
        g0 g0Var3 = new g0("OBJECT_PARAMETER_GENERIC", 2);
        f8548i = g0Var3;
        g0[] g0VarArr = {g0Var, g0Var2, g0Var3};
        f8549v = g0VarArr;
        com.facebook.imagepipeline.nativecode.b.l(g0VarArr);
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f8549v.clone();
    }
}
