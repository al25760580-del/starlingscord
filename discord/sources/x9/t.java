package x9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f22723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t f22724e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ t[] f22725i;

    static {
        t tVar = new t("STANDARD", 0);
        f22723d = tVar;
        t tVar2 = new t("ACCOUNTING", 1);
        f22724e = tVar2;
        f22725i = new t[]{tVar, tVar2};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f22725i.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "standard";
        }
        if (iOrdinal == 1) {
            return "accounting";
        }
        throw new IllegalArgumentException();
    }
}
