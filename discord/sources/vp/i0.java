package vp;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public class i0 {
    public static final /* synthetic */ i0[] E;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i0 f21890i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final i0 f21891v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final f0 f21892w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final g0 f21893x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final i0 f21894y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0 f21895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21896e;

    /* JADX INFO: Fake field, exist only in values array */
    i0 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    i0 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    i0 EF2;

    static {
        i0 i0Var = new i0("DOUBLE", 0, j0.f21902w, 1);
        i0 i0Var2 = new i0("FLOAT", 1, j0.f21901v, 5);
        j0 j0Var = j0.f21900i;
        i0 i0Var3 = new i0("INT64", 2, j0Var, 0);
        i0 i0Var4 = new i0("UINT64", 3, j0Var, 0);
        j0 j0Var2 = j0.f21899e;
        i0 i0Var5 = new i0("INT32", 4, j0Var2, 0);
        f21890i = i0Var5;
        i0 i0Var6 = new i0("FIXED64", 5, j0Var, 1);
        i0 i0Var7 = new i0("FIXED32", 6, j0Var2, 5);
        i0 i0Var8 = new i0("BOOL", 7, j0.f21903x, 0);
        f21891v = i0Var8;
        e0 e0Var = new e0("STRING", 8, j0.f21904y, 2);
        j0 j0Var3 = j0.G;
        f0 f0Var = new f0("GROUP", 9, j0Var3, 3);
        f21892w = f0Var;
        g0 g0Var = new g0("MESSAGE", 10, j0Var3, 2);
        f21893x = g0Var;
        h0 h0Var = new h0("BYTES", 11, j0.E, 2);
        i0 i0Var9 = new i0("UINT32", 12, j0Var2, 0);
        i0 i0Var10 = new i0("ENUM", 13, j0.F, 0);
        f21894y = i0Var10;
        E = new i0[]{i0Var, i0Var2, i0Var3, i0Var4, i0Var5, i0Var6, i0Var7, i0Var8, e0Var, f0Var, g0Var, h0Var, i0Var9, i0Var10, new i0("SFIXED32", 14, j0Var2, 5), new i0("SFIXED64", 15, j0Var, 1), new i0("SINT32", 16, j0Var2, 0), new i0("SINT64", 17, j0Var, 0)};
    }

    public i0(String str, int i7, j0 j0Var, int i10) {
        super(str, i7);
        this.f21895d = j0Var;
        this.f21896e = i10;
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) E.clone();
    }

    public boolean a() {
        return !(this instanceof e0);
    }
}
