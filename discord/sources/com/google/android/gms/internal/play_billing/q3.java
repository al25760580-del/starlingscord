package com.google.android.gms.internal.play_billing;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class q3 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q3 f6099i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final q3 f6100v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final q3 f6101w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ q3[] f6102x;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r3 f6103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6104e;

    /* JADX INFO: Fake field, exist only in values array */
    q3 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    q3 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    q3 EF0;

    static {
        q3 q3Var = new q3("DOUBLE", 0, r3.f6114v, 1);
        q3 q3Var2 = new q3("FLOAT", 1, r3.f6113i, 5);
        r3 r3Var = r3.f6112e;
        q3 q3Var3 = new q3("INT64", 2, r3Var, 0);
        q3 q3Var4 = new q3("UINT64", 3, r3Var, 0);
        r3 r3Var2 = r3.f6111d;
        q3 q3Var5 = new q3("INT32", 4, r3Var2, 0);
        q3 q3Var6 = new q3("FIXED64", 5, r3Var, 1);
        q3 q3Var7 = new q3("FIXED32", 6, r3Var2, 5);
        q3 q3Var8 = new q3("BOOL", 7, r3.f6115w, 0);
        q3 q3Var9 = new q3("STRING", 8, r3.f6116x, 2);
        f6099i = q3Var9;
        r3 r3Var3 = r3.F;
        q3 q3Var10 = new q3("GROUP", 9, r3Var3, 3);
        f6100v = q3Var10;
        q3 q3Var11 = new q3("MESSAGE", 10, r3Var3, 2);
        f6101w = q3Var11;
        f6102x = new q3[]{q3Var, q3Var2, q3Var3, q3Var4, q3Var5, q3Var6, q3Var7, q3Var8, q3Var9, q3Var10, q3Var11, new q3("BYTES", 11, r3.f6117y, 2), new q3("UINT32", 12, r3Var2, 0), new q3("ENUM", 13, r3.E, 0), new q3("SFIXED32", 14, r3Var2, 5), new q3("SFIXED64", 15, r3Var, 1), new q3("SINT32", 16, r3Var2, 0), new q3("SINT64", 17, r3Var, 0)};
    }

    public q3(String str, int i7, r3 r3Var, int i10) {
        super(str, i7);
        this.f6103d = r3Var;
        this.f6104e = i10;
    }

    public static q3[] values() {
        return (q3[]) f6102x.clone();
    }
}
