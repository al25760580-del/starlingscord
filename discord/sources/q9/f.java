package q9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f18665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f18666e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f18667i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ f[] f18668v;

    static {
        f fVar = new f("SUCCESS", 0);
        f18665d = fVar;
        f fVar2 = new f("NEAREST", 1);
        f18666e = fVar2;
        f fVar3 = new f("MISSING", 2);
        f18667i = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
        f18668v = fVarArr;
        com.facebook.imagepipeline.nativecode.b.l(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f18668v.clone();
    }
}
