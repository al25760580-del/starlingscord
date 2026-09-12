package hq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f10992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f10993e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f10994i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f10995v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ a[] f10996w;

    static {
        a aVar = new a("FUNCTION", 0);
        f10992d = aVar;
        a aVar2 = new a("PROPERTY", 1);
        f10993e = aVar2;
        a aVar3 = new a("PROPERTY_GETTER", 2);
        f10994i = aVar3;
        a aVar4 = new a("PROPERTY_SETTER", 3);
        f10995v = aVar4;
        f10996w = new a[]{aVar, aVar2, aVar3, aVar4};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f10996w.clone();
    }
}
