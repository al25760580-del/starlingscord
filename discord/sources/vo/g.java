package vo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f21808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f21809e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f21810i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final g f21811v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final g f21812w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final g f21813x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ g[] f21814y;

    static {
        g gVar = new g("CLASS", 0);
        f21808d = gVar;
        g gVar2 = new g("INTERFACE", 1);
        f21809e = gVar2;
        g gVar3 = new g("ENUM_CLASS", 2);
        f21810i = gVar3;
        g gVar4 = new g("ENUM_ENTRY", 3);
        f21811v = gVar4;
        g gVar5 = new g("ANNOTATION_CLASS", 4);
        f21812w = gVar5;
        g gVar6 = new g("OBJECT", 5);
        f21813x = gVar6;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6};
        f21814y = gVarArr;
        com.facebook.imagepipeline.nativecode.b.l(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f21814y.clone();
    }

    public final boolean a() {
        return this == f21813x || this == f21811v;
    }
}
