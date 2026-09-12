package km;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f14583e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f14584i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ a[] f14585v;

    static {
        a aVar = new a("ForJS", 0);
        f14582d = aVar;
        a aVar2 = new a("ForReanimated", 1);
        f14583e = aVar2;
        a aVar3 = new a("ForAnimated", 2);
        f14584i = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f14585v = aVarArr;
        com.facebook.imagepipeline.nativecode.b.l(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f14585v.clone();
    }
}
