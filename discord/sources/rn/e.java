package rn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f19468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e[] f19469e;

    static {
        e eVar = new e("WARNING", 0);
        f19468d = eVar;
        e[] eVarArr = {eVar, new e("ERROR", 1), new e("HIDDEN", 2)};
        f19469e = eVarArr;
        com.facebook.imagepipeline.nativecode.b.l(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f19469e.clone();
    }
}
