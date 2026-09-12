package lq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class z0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z0 f15270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z0 f15271e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ z0[] f15272i;

    static {
        z0 z0Var = new z0("SUPERTYPE", 0);
        f15270d = z0Var;
        z0 z0Var2 = new z0("COMMON", 1);
        f15271e = z0Var2;
        z0[] z0VarArr = {z0Var, z0Var2};
        f15272i = z0VarArr;
        com.facebook.imagepipeline.nativecode.b.l(z0VarArr);
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) f15272i.clone();
    }
}
