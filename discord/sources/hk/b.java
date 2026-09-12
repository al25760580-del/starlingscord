package hk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f10922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f10923e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f10924i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ b[] f10925v;

    static {
        b bVar = new b("date", 0);
        f10922d = bVar;
        b bVar2 = new b("time", 1);
        f10923e = bVar2;
        b bVar3 = new b("datetime", 2);
        f10924i = bVar3;
        f10925v = new b[]{bVar, bVar2, bVar3};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f10925v.clone();
    }
}
