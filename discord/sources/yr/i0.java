package yr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i0 f23542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i0 f23543e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i0 f23544i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final i0 f23545v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ i0[] f23546w;

    static {
        i0 i0Var = new i0("WIDE", 0);
        f23542d = i0Var;
        i0 i0Var2 = new i0("ABBREVIATED", 1);
        f23543e = i0Var2;
        i0 i0Var3 = new i0("SHORT", 2);
        f23544i = i0Var3;
        i0 i0Var4 = new i0("NARROW", 3);
        f23545v = i0Var4;
        f23546w = new i0[]{i0Var, i0Var2, i0Var3, i0Var4};
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) f23546w.clone();
    }
}
