package wp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f22466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o f22467e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o f22468i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ o[] f22469v;

    static {
        o oVar = new o("ALL", 0);
        f22466d = oVar;
        o oVar2 = new o("ONLY_NON_SYNTHESIZED", 1);
        f22467e = oVar2;
        o oVar3 = new o("NONE", 2);
        f22468i = oVar3;
        o[] oVarArr = {oVar, oVar2, oVar3};
        f22469v = oVarArr;
        com.facebook.imagepipeline.nativecode.b.l(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f22469v.clone();
    }
}
