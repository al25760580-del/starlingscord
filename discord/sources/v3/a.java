package v3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f21376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f21377e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a[] f21378i;

    static {
        a aVar = new a("EXPONENTIAL", 0);
        f21376d = aVar;
        a aVar2 = new a("LINEAR", 1);
        f21377e = aVar2;
        f21378i = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f21378i.clone();
    }
}
