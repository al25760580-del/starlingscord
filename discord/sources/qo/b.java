package qo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f18929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f18930e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ b[] f18931i;

    static {
        b bVar = new b("JAVA", 0);
        f18929d = bVar;
        b bVar2 = new b("KOTLIN", 1);
        f18930e = bVar2;
        b[] bVarArr = {bVar, bVar2};
        f18931i = bVarArr;
        com.facebook.imagepipeline.nativecode.b.l(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f18931i.clone();
    }
}
