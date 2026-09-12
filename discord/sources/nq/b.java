package nq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f17028d;

    /* JADX INFO: Fake field, exist only in values array */
    b EF5;

    static {
        b[] bVarArr = {new b("ERROR_CLASS", 0), new b("ERROR_FUNCTION", 1), new b("ERROR_SCOPE", 2), new b("ERROR_MODULE", 3), new b("ERROR_PROPERTY", 4), new b("ERROR_TYPE", 5), new b("PARENT_OF_ERROR_SCOPE", 6)};
        f17028d = bVarArr;
        com.facebook.imagepipeline.nativecode.b.l(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f17028d.clone();
    }
}
