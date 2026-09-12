package net.time4j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class h1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h1 f16642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h1 f16643e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h1[] f16644i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ h1[] f16645v;

    static {
        h1 h1Var = new h1("Q1", 0);
        f16642d = h1Var;
        h1 h1Var2 = new h1("Q2", 1);
        h1 h1Var3 = new h1("Q3", 2);
        h1 h1Var4 = new h1("Q4", 3);
        f16643e = h1Var4;
        f16645v = new h1[]{h1Var, h1Var2, h1Var3, h1Var4};
        f16644i = values();
    }

    public static h1 valueOf(String str) {
        return (h1) Enum.valueOf(h1.class, str);
    }

    public static h1[] values() {
        return (h1[]) f16645v.clone();
    }
}
