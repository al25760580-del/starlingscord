package x9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f22726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u f22727e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u f22728i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ u[] f22729v;

    /* JADX INFO: Fake field, exist only in values array */
    u EF0;

    static {
        u uVar = new u("STANDARD", 0);
        u uVar2 = new u("SCIENTIFIC", 1);
        f22726d = uVar2;
        u uVar3 = new u("ENGINEERING", 2);
        f22727e = uVar3;
        u uVar4 = new u("COMPACT", 3);
        f22728i = uVar4;
        f22729v = new u[]{uVar, uVar2, uVar3, uVar4};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f22729v.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "standard";
        }
        if (iOrdinal == 1) {
            return "scientific";
        }
        if (iOrdinal == 2) {
            return "engineering";
        }
        if (iOrdinal == 3) {
            return "compact";
        }
        throw new IllegalArgumentException();
    }
}
