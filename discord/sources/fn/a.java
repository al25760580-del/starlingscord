package fn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f9318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f9319e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f9320i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f9321v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f9322w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ a[] f9323x;

    static {
        a aVar = new a("LevelDebug", 0);
        f9318d = aVar;
        a aVar2 = new a("LevelInfo", 1);
        f9319e = aVar2;
        a aVar3 = new a("LevelWarning", 2);
        f9320i = aVar3;
        a aVar4 = new a("LevelError", 3);
        f9321v = aVar4;
        a aVar5 = new a("LevelNone", 4);
        f9322w = aVar5;
        f9323x = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f9323x.clone();
    }
}
