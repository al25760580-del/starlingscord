package lp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f[] f15168d;

    /* JADX INFO: Fake field, exist only in values array */
    f EF5;

    static {
        f[] fVarArr = {new f("SOURCE", 0), new f("BINARY", 1)};
        f15168d = fVarArr;
        com.facebook.imagepipeline.nativecode.b.l(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f15168d.clone();
    }
}
