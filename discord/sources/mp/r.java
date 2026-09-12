package mp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f16006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f16007e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r f16008i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ r[] f16009v;

    static {
        r rVar = new r("FLEXIBLE_LOWER", 0);
        f16006d = rVar;
        r rVar2 = new r("FLEXIBLE_UPPER", 1);
        f16007e = rVar2;
        r rVar3 = new r("INFLEXIBLE", 2);
        f16008i = rVar3;
        r[] rVarArr = {rVar, rVar2, rVar3};
        f16009v = rVarArr;
        com.facebook.imagepipeline.nativecode.b.l(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f16009v.clone();
    }
}
