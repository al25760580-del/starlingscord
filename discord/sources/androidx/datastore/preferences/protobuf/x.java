package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class x {
    public static final x E;
    public static final x F;
    public static final x G;
    public static final /* synthetic */ x[] H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f1959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f1960e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final x f1961i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final x f1962v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final x f1963w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final x f1964x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final x f1965y;

    static {
        x xVar = new x("VOID", 0);
        f1959d = xVar;
        x xVar2 = new x("INT", 1);
        f1960e = xVar2;
        x xVar3 = new x("LONG", 2);
        f1961i = xVar3;
        x xVar4 = new x("FLOAT", 3);
        f1962v = xVar4;
        x xVar5 = new x("DOUBLE", 4);
        f1963w = xVar5;
        x xVar6 = new x("BOOLEAN", 5);
        f1964x = xVar6;
        x xVar7 = new x("STRING", 6);
        f1965y = xVar7;
        e eVar = e.f1835i;
        x xVar8 = new x("BYTE_STRING", 7);
        E = xVar8;
        x xVar9 = new x("ENUM", 8);
        F = xVar9;
        x xVar10 = new x("MESSAGE", 9);
        G = xVar10;
        H = new x[]{xVar, xVar2, xVar3, xVar4, xVar5, xVar6, xVar7, xVar8, xVar9, xVar10};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) H.clone();
    }
}
