package ij;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class l {
    public static final l E;
    public static final l F;
    public static final l G;
    public static final /* synthetic */ l[] H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f11816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f11817e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f11818i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final l f11819v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final l f11820w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final l f11821x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final l f11822y;

    /* JADX INFO: Fake field, exist only in values array */
    l EF0;

    static {
        l lVar = new l("OTHER", 0);
        l lVar2 = new l("ORIENTATION", 1);
        f11816d = lVar2;
        l lVar3 = new l("BYTE_SEGMENTS", 2);
        f11817e = lVar3;
        l lVar4 = new l("ERROR_CORRECTION_LEVEL", 3);
        f11818i = lVar4;
        l lVar5 = new l("ISSUE_NUMBER", 4);
        f11819v = lVar5;
        l lVar6 = new l("SUGGESTED_PRICE", 5);
        f11820w = lVar6;
        l lVar7 = new l("POSSIBLE_COUNTRY", 6);
        f11821x = lVar7;
        l lVar8 = new l("UPC_EAN_EXTENSION", 7);
        f11822y = lVar8;
        l lVar9 = new l("PDF417_EXTRA_METADATA", 8);
        E = lVar9;
        l lVar10 = new l("STRUCTURED_APPEND_SEQUENCE", 9);
        F = lVar10;
        l lVar11 = new l("STRUCTURED_APPEND_PARITY", 10);
        G = lVar11;
        H = new l[]{lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) H.clone();
    }
}
