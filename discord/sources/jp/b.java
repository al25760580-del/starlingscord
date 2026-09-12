package jp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f13996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f13997e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f13998i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ b[] f13999v;

    static {
        b bVar = new b("INFLEXIBLE", 0);
        f13996d = bVar;
        b bVar2 = new b("FLEXIBLE_UPPER_BOUND", 1);
        f13997e = bVar2;
        b bVar3 = new b("FLEXIBLE_LOWER_BOUND", 2);
        f13998i = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        f13999v = bVarArr;
        com.facebook.imagepipeline.nativecode.b.l(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f13999v.clone();
    }
}
