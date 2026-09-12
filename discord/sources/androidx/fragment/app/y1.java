package androidx.fragment.app;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class y1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y1 f2283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y1 f2284e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final y1 f2285i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ y1[] f2286v;

    static {
        y1 y1Var = new y1("NONE", 0);
        f2283d = y1Var;
        y1 y1Var2 = new y1("ADDING", 1);
        f2284e = y1Var2;
        y1 y1Var3 = new y1("REMOVING", 2);
        f2285i = y1Var3;
        f2286v = new y1[]{y1Var, y1Var2, y1Var3};
    }

    public static y1 valueOf(String str) {
        return (y1) Enum.valueOf(y1.class, str);
    }

    public static y1[] values() {
        return (y1[]) f2286v.clone();
    }
}
