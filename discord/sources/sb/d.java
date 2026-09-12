package sb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f19823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f19824e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f19825i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ d[] f19826v;

    static {
        d dVar = new d("DEFAULT", 0);
        f19823d = dVar;
        d dVar2 = new d("VERY_LOW", 1);
        f19824e = dVar2;
        d dVar3 = new d("HIGHEST", 2);
        f19825i = dVar3;
        f19826v = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f19826v.clone();
    }
}
