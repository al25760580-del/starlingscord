package x9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f22732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w f22733e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final w f22734i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final w f22735v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ w[] f22736w;

    static {
        w wVar = new w("DECIMAL", 0);
        f22732d = wVar;
        w wVar2 = new w("PERCENT", 1);
        f22733e = wVar2;
        w wVar3 = new w("CURRENCY", 2);
        f22734i = wVar3;
        w wVar4 = new w("UNIT", 3);
        f22735v = wVar4;
        f22736w = new w[]{wVar, wVar2, wVar3, wVar4};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f22736w.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "decimal";
        }
        if (iOrdinal == 1) {
            return "percent";
        }
        if (iOrdinal == 2) {
            return "currency";
        }
        if (iOrdinal == 3) {
            return "unit";
        }
        throw new IllegalArgumentException();
    }
}
