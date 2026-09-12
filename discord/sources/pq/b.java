package pq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f18511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f18512e;

    static {
        b bVar = new b("FOR_SUBTYPING", 0);
        f18511d = bVar;
        b[] bVarArr = {bVar, new b("FOR_INCORPORATION", 1), new b("FROM_EXPRESSION", 2)};
        f18512e = bVarArr;
        com.facebook.imagepipeline.nativecode.b.l(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f18512e.clone();
    }
}
