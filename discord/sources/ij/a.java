package ij;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final a E;
    public static final a F;
    public static final a G;
    public static final a H;
    public static final a I;
    public static final a J;
    public static final a K;
    public static final a L;
    public static final a M;
    public static final a N;
    public static final /* synthetic */ a[] O;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f11786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f11787e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f11788i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f11789v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f11790w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f11791x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f11792y;

    static {
        a aVar = new a("AZTEC", 0);
        f11786d = aVar;
        a aVar2 = new a("CODABAR", 1);
        f11787e = aVar2;
        a aVar3 = new a("CODE_39", 2);
        f11788i = aVar3;
        a aVar4 = new a("CODE_93", 3);
        f11789v = aVar4;
        a aVar5 = new a("CODE_128", 4);
        f11790w = aVar5;
        a aVar6 = new a("DATA_MATRIX", 5);
        f11791x = aVar6;
        a aVar7 = new a("EAN_8", 6);
        f11792y = aVar7;
        a aVar8 = new a("EAN_13", 7);
        E = aVar8;
        a aVar9 = new a("ITF", 8);
        F = aVar9;
        a aVar10 = new a("MAXICODE", 9);
        G = aVar10;
        a aVar11 = new a("PDF_417", 10);
        H = aVar11;
        a aVar12 = new a("QR_CODE", 11);
        I = aVar12;
        a aVar13 = new a("RSS_14", 12);
        J = aVar13;
        a aVar14 = new a("RSS_EXPANDED", 13);
        K = aVar14;
        a aVar15 = new a("UPC_A", 14);
        L = aVar15;
        a aVar16 = new a("UPC_E", 15);
        M = aVar16;
        a aVar17 = new a("UPC_EAN_EXTENSION", 16);
        N = aVar17;
        O = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) O.clone();
    }
}
