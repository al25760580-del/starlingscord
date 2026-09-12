package po;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f18083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e0 f18084e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ e0[] f18085i;

    static {
        e0 e0Var = new e0("DECLARED", 0);
        f18083d = e0Var;
        e0 e0Var2 = new e0("INHERITED", 1);
        f18084e = e0Var2;
        e0[] e0VarArr = {e0Var, e0Var2};
        f18085i = e0VarArr;
        com.facebook.imagepipeline.nativecode.b.l(e0VarArr);
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f18085i.clone();
    }
}
