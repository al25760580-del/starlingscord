package mp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f15972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f15973e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ e[] f15974i;

    static {
        e eVar = new e("READ_ONLY", 0);
        f15972d = eVar;
        e eVar2 = new e("MUTABLE", 1);
        f15973e = eVar2;
        e[] eVarArr = {eVar, eVar2};
        f15974i = eVarArr;
        com.facebook.imagepipeline.nativecode.b.l(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f15974i.clone();
    }
}
