package l4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f14818e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a[] f14819i;

    static {
        a aVar = new a("AUTOMATIC", 0);
        f14817d = aVar;
        a aVar2 = new a("ENABLED", 1);
        f14818e = aVar2;
        f14819i = new a[]{aVar, aVar2, new a("DISABLED", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f14819i.clone();
    }
}
