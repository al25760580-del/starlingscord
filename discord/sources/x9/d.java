package x9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f22681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f22682e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ d[] f22683i;

    static {
        d dVar = new d("SORT", 0);
        f22681d = dVar;
        d dVar2 = new d("SEARCH", 1);
        f22682e = dVar2;
        f22683i = new d[]{dVar, dVar2};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f22683i.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "sort";
        }
        if (iOrdinal == 1) {
            return "search";
        }
        throw new IllegalArgumentException();
    }
}
