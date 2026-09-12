package com.swmansion.rnscreens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class p0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p0 f7223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p0 f7224e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p0 f7225i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final p0 f7226v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ p0[] f7227w;

    static {
        p0 p0Var = new p0("NONE", 0);
        f7223d = p0Var;
        p0 p0Var2 = new p0("WORDS", 1);
        f7224e = p0Var2;
        p0 p0Var3 = new p0("SENTENCES", 2);
        f7225i = p0Var3;
        p0 p0Var4 = new p0("CHARACTERS", 3);
        f7226v = p0Var4;
        p0[] p0VarArr = {p0Var, p0Var2, p0Var3, p0Var4};
        f7227w = p0VarArr;
        com.facebook.imagepipeline.nativecode.b.l(p0VarArr);
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) f7227w.clone();
    }
}
