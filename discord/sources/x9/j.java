package x9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f22698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f22699e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j f22700i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final j f22701v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final j f22702w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ j[] f22703x;

    static {
        j jVar = new j("H11", 0);
        f22698d = jVar;
        j jVar2 = new j("H12", 1);
        f22699e = jVar2;
        j jVar3 = new j("H23", 2);
        f22700i = jVar3;
        j jVar4 = new j("H24", 3);
        f22701v = jVar4;
        j jVar5 = new j("UNDEFINED", 4);
        f22702w = jVar5;
        f22703x = new j[]{jVar, jVar2, jVar3, jVar4, jVar5};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f22703x.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "h11";
        }
        if (iOrdinal == 1) {
            return "h12";
        }
        if (iOrdinal == 2) {
            return "h23";
        }
        if (iOrdinal == 3) {
            return "h24";
        }
        if (iOrdinal == 4) {
            return "";
        }
        throw new IllegalArgumentException();
    }
}
