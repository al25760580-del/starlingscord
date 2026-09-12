package x9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ x[] f22737d = {new x("SHORT", 0), new x("NARROW", 1), new x("LONG", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    x EF5;

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f22737d.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "short";
        }
        if (iOrdinal == 1) {
            return "narrow";
        }
        if (iOrdinal == 2) {
            return "long";
        }
        throw new IllegalArgumentException();
    }
}
