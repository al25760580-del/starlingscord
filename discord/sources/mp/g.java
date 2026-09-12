package mp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f15976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f15977e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f15978i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ g[] f15979v;

    static {
        g gVar = new g("FORCE_FLEXIBILITY", 0);
        f15976d = gVar;
        g gVar2 = new g("NULLABLE", 1);
        f15977e = gVar2;
        g gVar3 = new g("NOT_NULL", 2);
        f15978i = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
        f15979v = gVarArr;
        com.facebook.imagepipeline.nativecode.b.l(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f15979v.clone();
    }
}
