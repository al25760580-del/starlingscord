package pr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f18518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f18519e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a[] f18520i;

    static {
        a aVar = new a("NONE", 0);
        f18518d = aVar;
        a aVar2 = new a("ALL_JSON_OBJECTS", 1);
        a aVar3 = new a("POLYMORPHIC", 2);
        f18519e = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f18520i = aVarArr;
        com.facebook.imagepipeline.nativecode.b.l(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f18520i.clone();
    }
}
