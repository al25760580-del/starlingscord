package ij;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static final c E;
    public static final c F;
    public static final c G;
    public static final /* synthetic */ c[] H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f11794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f11795e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f11796i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c f11797v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c f11798w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final c f11799x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c f11800y;

    /* JADX INFO: Fake field, exist only in values array */
    c EF0;

    static {
        c cVar = new c("OTHER", 0);
        c cVar2 = new c("PURE_BARCODE", 1);
        f11794d = cVar2;
        c cVar3 = new c("POSSIBLE_FORMATS", 2);
        f11795e = cVar3;
        c cVar4 = new c("TRY_HARDER", 3);
        f11796i = cVar4;
        c cVar5 = new c("CHARACTER_SET", 4);
        f11797v = cVar5;
        c cVar6 = new c("ALLOWED_LENGTHS", 5);
        f11798w = cVar6;
        c cVar7 = new c("ASSUME_CODE_39_CHECK_DIGIT", 6);
        f11799x = cVar7;
        c cVar8 = new c("ASSUME_GS1", 7);
        f11800y = cVar8;
        c cVar9 = new c("RETURN_CODABAR_START_END", 8);
        E = cVar9;
        c cVar10 = new c("NEED_RESULT_POINT_CALLBACK", 9);
        F = cVar10;
        c cVar11 = new c("ALLOWED_EAN_EXTENSIONS", 10);
        G = cVar11;
        H = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) H.clone();
    }
}
