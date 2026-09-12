package x9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f22670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f22671e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f22672i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c f22673v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c f22674w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ c[] f22675x;

    static {
        c cVar = new c("BASE", 0);
        f22670d = cVar;
        c cVar2 = new c("ACCENT", 1);
        f22671e = cVar2;
        c cVar3 = new c("CASE", 2);
        f22672i = cVar3;
        c cVar4 = new c("VARIANT", 3);
        f22673v = cVar4;
        c cVar5 = new c("LOCALE", 4);
        f22674w = cVar5;
        f22675x = new c[]{cVar, cVar2, cVar3, cVar4, cVar5};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f22675x.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "base";
        }
        if (iOrdinal == 1) {
            return "accent";
        }
        if (iOrdinal == 2) {
            return "case";
        }
        if (iOrdinal == 3) {
            return "variant";
        }
        if (iOrdinal == 4) {
            return "";
        }
        throw new IllegalArgumentException();
    }
}
