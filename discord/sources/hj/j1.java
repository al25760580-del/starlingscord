package hj;

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
public class j1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f1 f10864e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h1 f10865i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final j1 f10866v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ j1[] f10867w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k1 f10868d;

    /* JADX INFO: Fake field, exist only in values array */
    j1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    j1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    j1 EF2;

    static {
        j1 j1Var = new j1("DOUBLE", 0, k1.f10876v, 1);
        j1 j1Var2 = new j1("FLOAT", 1, k1.f10875i, 5);
        k1 k1Var = k1.f10874e;
        j1 j1Var3 = new j1("INT64", 2, k1Var, 0);
        j1 j1Var4 = new j1("UINT64", 3, k1Var, 0);
        k1 k1Var2 = k1.f10873d;
        j1 j1Var5 = new j1("INT32", 4, k1Var2, 0);
        j1 j1Var6 = new j1("FIXED64", 5, k1Var, 1);
        j1 j1Var7 = new j1("FIXED32", 6, k1Var2, 5);
        j1 j1Var8 = new j1("BOOL", 7, k1.f10877w, 0);
        f1 f1Var = new f1("STRING", 8, k1.f10878x, 2);
        f10864e = f1Var;
        k1 k1Var3 = k1.F;
        g1 g1Var = new g1("GROUP", 9, k1Var3, 3);
        h1 h1Var = new h1("MESSAGE", 10, k1Var3, 2);
        f10865i = h1Var;
        i1 i1Var = new i1("BYTES", 11, k1.f10879y, 2);
        j1 j1Var9 = new j1("UINT32", 12, k1Var2, 0);
        f10866v = j1Var9;
        f10867w = new j1[]{j1Var, j1Var2, j1Var3, j1Var4, j1Var5, j1Var6, j1Var7, j1Var8, f1Var, g1Var, h1Var, i1Var, j1Var9, new j1("ENUM", 13, k1.E, 0), new j1("SFIXED32", 14, k1Var2, 5), new j1("SFIXED64", 15, k1Var, 1), new j1("SINT32", 16, k1Var2, 0), new j1("SINT64", 17, k1Var, 0)};
    }

    public j1(String str, int i7, k1 k1Var, int i10) {
        super(str, i7);
        this.f10868d = k1Var;
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) f10867w.clone();
    }
}
