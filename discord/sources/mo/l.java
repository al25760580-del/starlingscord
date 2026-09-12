package mo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f15949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f15950e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f15951i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ l[] f15952v;

    static {
        l lVar = new l("INSTANCE", 0);
        f15949d = lVar;
        l lVar2 = new l("EXTENSION_RECEIVER", 1);
        f15950e = lVar2;
        l lVar3 = new l("VALUE", 2);
        f15951i = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        f15952v = lVarArr;
        com.facebook.imagepipeline.nativecode.b.l(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f15952v.clone();
    }
}
