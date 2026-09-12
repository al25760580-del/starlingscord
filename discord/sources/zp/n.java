package zp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n[] f24071d;

    /* JADX INFO: Fake field, exist only in values array */
    n EF5;

    static {
        n[] nVarArr = {new n("COMMON_SUPER_TYPE", 0), new n("INTERSECTION_TYPE", 1)};
        f24071d = nVarArr;
        com.facebook.imagepipeline.nativecode.b.l(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f24071d.clone();
    }
}
