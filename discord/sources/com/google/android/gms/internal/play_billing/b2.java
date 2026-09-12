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
public final class b2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b2 f5980e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b2 f5981i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b2[] f5982v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ b2[] f5983w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5984d;

    /* JADX INFO: Fake field, exist only in values array */
    b2 EF0;

    static {
        n2 n2Var = n2.f6073w;
        b2 b2Var = new b2("DOUBLE", 0, 0, 1, n2Var);
        n2 n2Var2 = n2.f6072v;
        b2 b2Var2 = new b2("FLOAT", 1, 1, 1, n2Var2);
        n2 n2Var3 = n2.f6071i;
        b2 b2Var3 = new b2("INT64", 2, 2, 1, n2Var3);
        b2 b2Var4 = new b2("UINT64", 3, 3, 1, n2Var3);
        n2 n2Var4 = n2.f6070e;
        b2 b2Var5 = new b2("INT32", 4, 4, 1, n2Var4);
        b2 b2Var6 = new b2("FIXED64", 5, 5, 1, n2Var3);
        b2 b2Var7 = new b2("FIXED32", 6, 6, 1, n2Var4);
        n2 n2Var5 = n2.f6074x;
        b2 b2Var8 = new b2("BOOL", 7, 7, 1, n2Var5);
        n2 n2Var6 = n2.f6075y;
        b2 b2Var9 = new b2("STRING", 8, 8, 1, n2Var6);
        n2 n2Var7 = n2.G;
        b2 b2Var10 = new b2("MESSAGE", 9, 9, 1, n2Var7);
        n2 n2Var8 = n2.E;
        b2 b2Var11 = new b2("BYTES", 10, 10, 1, n2Var8);
        b2 b2Var12 = new b2("UINT32", 11, 11, 1, n2Var4);
        n2 n2Var9 = n2.F;
        b2 b2Var13 = new b2("ENUM", 12, 12, 1, n2Var9);
        b2 b2Var14 = new b2("SFIXED32", 13, 13, 1, n2Var4);
        b2 b2Var15 = new b2("SFIXED64", 14, 14, 1, n2Var3);
        b2 b2Var16 = new b2("SINT32", 15, 15, 1, n2Var4);
        b2 b2Var17 = new b2("SINT64", 16, 16, 1, n2Var3);
        b2 b2Var18 = new b2("GROUP", 17, 17, 1, n2Var7);
        b2 b2Var19 = new b2("DOUBLE_LIST", 18, 18, 2, n2Var);
        b2 b2Var20 = new b2("FLOAT_LIST", 19, 19, 2, n2Var2);
        b2 b2Var21 = new b2("INT64_LIST", 20, 20, 2, n2Var3);
        b2 b2Var22 = new b2("UINT64_LIST", 21, 21, 2, n2Var3);
        b2 b2Var23 = new b2("INT32_LIST", 22, 22, 2, n2Var4);
        b2 b2Var24 = new b2("FIXED64_LIST", 23, 23, 2, n2Var3);
        b2 b2Var25 = new b2("FIXED32_LIST", 24, 24, 2, n2Var4);
        b2 b2Var26 = new b2("BOOL_LIST", 25, 25, 2, n2Var5);
        b2 b2Var27 = new b2("STRING_LIST", 26, 26, 2, n2Var6);
        b2 b2Var28 = new b2("MESSAGE_LIST", 27, 27, 2, n2Var7);
        b2 b2Var29 = new b2("BYTES_LIST", 28, 28, 2, n2Var8);
        b2 b2Var30 = new b2("UINT32_LIST", 29, 29, 2, n2Var4);
        b2 b2Var31 = new b2("ENUM_LIST", 30, 30, 2, n2Var9);
        b2 b2Var32 = new b2("SFIXED32_LIST", 31, 31, 2, n2Var4);
        b2 b2Var33 = new b2("SFIXED64_LIST", 32, 32, 2, n2Var3);
        b2 b2Var34 = new b2("SINT32_LIST", 33, 33, 2, n2Var4);
        b2 b2Var35 = new b2("SINT64_LIST", 34, 34, 2, n2Var3);
        b2 b2Var36 = new b2("DOUBLE_LIST_PACKED", 35, 35, 3, n2Var);
        f5980e = b2Var36;
        b2 b2Var37 = new b2("FLOAT_LIST_PACKED", 36, 36, 3, n2Var2);
        b2 b2Var38 = new b2("INT64_LIST_PACKED", 37, 37, 3, n2Var3);
        b2 b2Var39 = new b2("UINT64_LIST_PACKED", 38, 38, 3, n2Var3);
        b2 b2Var40 = new b2("INT32_LIST_PACKED", 39, 39, 3, n2Var4);
        b2 b2Var41 = new b2("FIXED64_LIST_PACKED", 40, 40, 3, n2Var3);
        b2 b2Var42 = new b2("FIXED32_LIST_PACKED", 41, 41, 3, n2Var4);
        b2 b2Var43 = new b2("BOOL_LIST_PACKED", 42, 42, 3, n2Var5);
        b2 b2Var44 = new b2("UINT32_LIST_PACKED", 43, 43, 3, n2Var4);
        b2 b2Var45 = new b2("ENUM_LIST_PACKED", 44, 44, 3, n2Var9);
        b2 b2Var46 = new b2("SFIXED32_LIST_PACKED", 45, 45, 3, n2Var4);
        b2 b2Var47 = new b2("SFIXED64_LIST_PACKED", 46, 46, 3, n2Var3);
        b2 b2Var48 = new b2("SINT32_LIST_PACKED", 47, 47, 3, n2Var4);
        b2 b2Var49 = new b2("SINT64_LIST_PACKED", 48, 48, 3, n2Var3);
        f5981i = b2Var49;
        f5983w = new b2[]{b2Var, b2Var2, b2Var3, b2Var4, b2Var5, b2Var6, b2Var7, b2Var8, b2Var9, b2Var10, b2Var11, b2Var12, b2Var13, b2Var14, b2Var15, b2Var16, b2Var17, b2Var18, b2Var19, b2Var20, b2Var21, b2Var22, b2Var23, b2Var24, b2Var25, b2Var26, b2Var27, b2Var28, b2Var29, b2Var30, b2Var31, b2Var32, b2Var33, b2Var34, b2Var35, b2Var36, b2Var37, b2Var38, b2Var39, b2Var40, b2Var41, b2Var42, b2Var43, b2Var44, b2Var45, b2Var46, b2Var47, b2Var48, b2Var49, new b2("GROUP_LIST", 49, 49, 2, n2Var7), new b2("MAP", 50, 50, 4, n2.f6069d)};
        b2[] b2VarArrValues = values();
        f5982v = new b2[b2VarArrValues.length];
        for (b2 b2Var50 : b2VarArrValues) {
            f5982v[b2Var50.f5984d] = b2Var50;
        }
    }

    public b2(String str, int i7, int i10, int i11, n2 n2Var) {
        super(str, i7);
        this.f5984d = i10;
        int i12 = i11 - 1;
        if (i12 == 1 || i12 == 3) {
            n2Var.getClass();
        }
        if (i11 == 1) {
            n2 n2Var2 = n2.f6069d;
            n2Var.ordinal();
        }
    }

    public static b2[] values() {
        return (b2[]) f5983w.clone();
    }
}
