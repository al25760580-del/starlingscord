package net.time4j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class p1 {
    public static final p1[] E;
    public static final /* synthetic */ p1[] F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p1 f16687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p1 f16688e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p1 f16689i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final p1 f16690v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final p1 f16691w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final p1 f16692x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final p1 f16693y;

    static {
        p1 p1Var = new p1("MONDAY", 0);
        f16687d = p1Var;
        p1 p1Var2 = new p1("TUESDAY", 1);
        f16688e = p1Var2;
        p1 p1Var3 = new p1("WEDNESDAY", 2);
        f16689i = p1Var3;
        p1 p1Var4 = new p1("THURSDAY", 3);
        f16690v = p1Var4;
        p1 p1Var5 = new p1("FRIDAY", 4);
        f16691w = p1Var5;
        p1 p1Var6 = new p1("SATURDAY", 5);
        f16692x = p1Var6;
        p1 p1Var7 = new p1("SUNDAY", 6);
        f16693y = p1Var7;
        F = new p1[]{p1Var, p1Var2, p1Var3, p1Var4, p1Var5, p1Var6, p1Var7};
        E = values();
    }

    public static p1 d(int i7) {
        if (i7 < 1 || i7 > 7) {
            throw new IllegalArgumentException(kk.b.h(i7, "Out of range: "));
        }
        return E[i7 - 1];
    }

    public static p1 valueOf(String str) {
        return (p1) Enum.valueOf(p1.class, str);
    }

    public static p1[] values() {
        return (p1[]) F.clone();
    }

    public final int a() {
        return ordinal() + 1;
    }

    public final int b(v1 v1Var) {
        return (((ordinal() + 7) - v1Var.f16772d.ordinal()) % 7) + 1;
    }

    public final p1 c() {
        return d(((ordinal() + 13) % 7) + 1);
    }
}
