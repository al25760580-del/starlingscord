package wn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f22354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f22355e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f22356i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ a[] f22357v;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f22354d = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f22355e = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f22356i = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f22357v = aVarArr;
        com.facebook.imagepipeline.nativecode.b.l(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f22357v.clone();
    }
}
