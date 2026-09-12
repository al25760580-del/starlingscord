package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class w1 {
    public static final w1 E;
    public static final w1 F;
    public static final /* synthetic */ w1[] G;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w1 f1952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w1 f1953e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final w1 f1954i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final w1 f1955v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final w1 f1956w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final w1 f1957x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final w1 f1958y;

    static {
        w1 w1Var = new w1("INT", 0);
        f1952d = w1Var;
        w1 w1Var2 = new w1("LONG", 1);
        f1953e = w1Var2;
        w1 w1Var3 = new w1("FLOAT", 2);
        f1954i = w1Var3;
        w1 w1Var4 = new w1("DOUBLE", 3);
        f1955v = w1Var4;
        w1 w1Var5 = new w1("BOOLEAN", 4);
        f1956w = w1Var5;
        w1 w1Var6 = new w1("STRING", 5);
        f1957x = w1Var6;
        e eVar = e.f1835i;
        w1 w1Var7 = new w1("BYTE_STRING", 6);
        f1958y = w1Var7;
        w1 w1Var8 = new w1("ENUM", 7);
        E = w1Var8;
        w1 w1Var9 = new w1("MESSAGE", 8);
        F = w1Var9;
        G = new w1[]{w1Var, w1Var2, w1Var3, w1Var4, w1Var5, w1Var6, w1Var7, w1Var8, w1Var9};
    }

    public static w1 valueOf(String str) {
        return (w1) Enum.valueOf(w1.class, str);
    }

    public static w1[] values() {
        return (w1[]) G.clone();
    }
}
