package lq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n0[] f15229d;

    /* JADX INFO: Fake field, exist only in values array */
    n0 EF5;

    static {
        n0[] n0VarArr = {new n0("CHECK_ONLY_LOWER", 0), new n0("CHECK_SUBTYPE_AND_LOWER", 1), new n0("SKIP_LOWER", 2)};
        f15229d = n0VarArr;
        com.facebook.imagepipeline.nativecode.b.l(n0VarArr);
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) f15229d.clone();
    }
}
