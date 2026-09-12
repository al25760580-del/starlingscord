package nm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f16961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f16962e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a[] f16963i;

    static {
        a aVar = new a("ENTER", 0);
        f16961d = aVar;
        a aVar2 = new a("EXIT", 1);
        f16962e = aVar2;
        a[] aVarArr = {aVar, aVar2};
        f16963i = aVarArr;
        com.facebook.imagepipeline.nativecode.b.l(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f16963i.clone();
    }
}
