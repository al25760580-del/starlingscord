package np;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f16984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f16985e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f16986i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ b[] f16987v;

    static {
        b bVar = new b("PROPERTY", 0);
        f16984d = bVar;
        b bVar2 = new b("BACKING_FIELD", 1);
        f16985e = bVar2;
        b bVar3 = new b("DELEGATE_FIELD", 2);
        f16986i = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        f16987v = bVarArr;
        com.facebook.imagepipeline.nativecode.b.l(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f16987v.clone();
    }
}
