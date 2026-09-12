package com.swmansion.rnscreens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j0 f7205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j0 f7206e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j0 f7207i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final j0 f7208v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final j0 f7209w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ j0[] f7210x;

    static {
        j0 j0Var = new j0("LEFT", 0);
        f7205d = j0Var;
        j0 j0Var2 = new j0("CENTER", 1);
        f7206e = j0Var2;
        j0 j0Var3 = new j0("RIGHT", 2);
        f7207i = j0Var3;
        j0 j0Var4 = new j0("BACK", 3);
        f7208v = j0Var4;
        j0 j0Var5 = new j0("SEARCH_BAR", 4);
        f7209w = j0Var5;
        j0[] j0VarArr = {j0Var, j0Var2, j0Var3, j0Var4, j0Var5};
        f7210x = j0VarArr;
        com.facebook.imagepipeline.nativecode.b.l(j0VarArr);
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) f7210x.clone();
    }
}
