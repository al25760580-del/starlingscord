package cr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f7342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f7343e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f7344i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ a[] f7345v;

    static {
        a aVar = new a("SUSPEND", 0);
        f7342d = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f7343e = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f7344i = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f7345v = aVarArr;
        com.facebook.imagepipeline.nativecode.b.l(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f7345v.clone();
    }
}
