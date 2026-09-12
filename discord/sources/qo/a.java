package qo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f18925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f18926e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a[] f18927i;

    static {
        a aVar = new a("CALL_BY_NAME", 0);
        f18925d = aVar;
        a aVar2 = new a("POSITIONAL_CALL", 1);
        f18926e = aVar2;
        a[] aVarArr = {aVar, aVar2};
        f18927i = aVarArr;
        com.facebook.imagepipeline.nativecode.b.l(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f18927i.clone();
    }
}
