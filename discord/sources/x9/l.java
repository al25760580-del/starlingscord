package x9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f22706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ l[] f22707e;

    /* JADX INFO: Fake field, exist only in values array */
    l EF0;

    static {
        l lVar = new l("NUMERIC", 0);
        l lVar2 = new l("DIGIT2", 1);
        l lVar3 = new l("LONG", 2);
        l lVar4 = new l("SHORT", 3);
        l lVar5 = new l("NARROW", 4);
        l lVar6 = new l("UNDEFINED", 5);
        f22706d = lVar6;
        f22707e = new l[]{lVar, lVar2, lVar3, lVar4, lVar5, lVar6};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f22707e.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "numeric";
        }
        if (iOrdinal == 1) {
            return "2-digit";
        }
        if (iOrdinal == 2) {
            return "long";
        }
        if (iOrdinal == 3) {
            return "short";
        }
        if (iOrdinal == 4) {
            return "narrow";
        }
        if (iOrdinal == 5) {
            return "";
        }
        throw new IllegalArgumentException();
    }
}
