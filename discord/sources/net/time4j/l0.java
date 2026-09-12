package net.time4j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l0 f16660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l0 f16661e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ l0[] f16662i;

    static {
        l0 l0Var = new l0("AM", 0);
        f16660d = l0Var;
        l0 l0Var2 = new l0("PM", 1);
        f16661e = l0Var2;
        f16662i = new l0[]{l0Var, l0Var2};
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) f16662i.clone();
    }
}
