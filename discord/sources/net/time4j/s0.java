package net.time4j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s0 f16706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s0 f16707e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s0[] f16708i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ s0[] f16709v;

    static {
        s0 s0Var = new s0("JANUARY", 0);
        f16706d = s0Var;
        s0 s0Var2 = new s0("FEBRUARY", 1);
        s0 s0Var3 = new s0("MARCH", 2);
        s0 s0Var4 = new s0("APRIL", 3);
        s0 s0Var5 = new s0("MAY", 4);
        s0 s0Var6 = new s0("JUNE", 5);
        s0 s0Var7 = new s0("JULY", 6);
        s0 s0Var8 = new s0("AUGUST", 7);
        s0 s0Var9 = new s0("SEPTEMBER", 8);
        s0 s0Var10 = new s0("OCTOBER", 9);
        s0 s0Var11 = new s0("NOVEMBER", 10);
        s0 s0Var12 = new s0("DECEMBER", 11);
        f16707e = s0Var12;
        f16709v = new s0[]{s0Var, s0Var2, s0Var3, s0Var4, s0Var5, s0Var6, s0Var7, s0Var8, s0Var9, s0Var10, s0Var11, s0Var12};
        f16708i = values();
    }

    public static s0 b(int i7) {
        if (i7 < 1 || i7 > 12) {
            throw new IllegalArgumentException(kk.b.h(i7, "Out of range: "));
        }
        return f16708i[i7 - 1];
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) f16709v.clone();
    }

    public final int a() {
        return ordinal() + 1;
    }
}
