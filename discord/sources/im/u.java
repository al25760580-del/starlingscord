package im;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f11966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u f11967e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u f11968i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final u f11969v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ u[] f11970w;

    static {
        u uVar = new u("NONE", 0);
        f11966d = uVar;
        u uVar2 = new u("BOX_NONE", 1);
        f11967e = uVar2;
        u uVar3 = new u("BOX_ONLY", 2);
        f11968i = uVar3;
        u uVar4 = new u("AUTO", 3);
        f11969v = uVar4;
        u[] uVarArr = {uVar, uVar2, uVar3, uVar4};
        f11970w = uVarArr;
        com.facebook.imagepipeline.nativecode.b.l(uVarArr);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f11970w.clone();
    }
}
