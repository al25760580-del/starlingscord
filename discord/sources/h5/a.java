package h5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f10331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f10332e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f10333i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f10334v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ a[] f10335w;

    static {
        a aVar = new a("TOP_START", 0);
        f10331d = aVar;
        a aVar2 = new a("TOP_END", 1);
        f10332e = aVar2;
        a aVar3 = new a("BOTTOM_START", 2);
        f10333i = aVar3;
        a aVar4 = new a("BOTTOM_END", 3);
        f10334v = aVar4;
        f10335w = new a[]{aVar, aVar2, aVar3, aVar4};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f10335w.clone();
    }
}
