package com.swmansion.rnscreens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t0 f7234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s0 f7235e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r0 f7236i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final q0 f7237v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ u0[] f7238w;

    static {
        t0 t0Var = new t0();
        f7234d = t0Var;
        s0 s0Var = new s0();
        f7235e = s0Var;
        r0 r0Var = new r0();
        f7236i = r0Var;
        q0 q0Var = new q0();
        f7237v = q0Var;
        u0[] u0VarArr = {t0Var, s0Var, r0Var, q0Var};
        f7238w = u0VarArr;
        com.facebook.imagepipeline.nativecode.b.l(u0VarArr);
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) f7238w.clone();
    }

    public abstract int a(p0 p0Var);
}
