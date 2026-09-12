package androidx.datastore.preferences.protobuf;

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
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o f1916e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o f1917i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final o[] f1918v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ o[] f1919w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1920d;

    /* JADX INFO: Fake field, exist only in values array */
    o EF0;

    static {
        x xVar = x.f1963w;
        o oVar = new o("DOUBLE", 0, 0, 1, xVar);
        x xVar2 = x.f1962v;
        o oVar2 = new o("FLOAT", 1, 1, 1, xVar2);
        x xVar3 = x.f1961i;
        o oVar3 = new o("INT64", 2, 2, 1, xVar3);
        o oVar4 = new o("UINT64", 3, 3, 1, xVar3);
        x xVar4 = x.f1960e;
        o oVar5 = new o("INT32", 4, 4, 1, xVar4);
        o oVar6 = new o("FIXED64", 5, 5, 1, xVar3);
        o oVar7 = new o("FIXED32", 6, 6, 1, xVar4);
        x xVar5 = x.f1964x;
        o oVar8 = new o("BOOL", 7, 7, 1, xVar5);
        x xVar6 = x.f1965y;
        o oVar9 = new o("STRING", 8, 8, 1, xVar6);
        x xVar7 = x.G;
        o oVar10 = new o("MESSAGE", 9, 9, 1, xVar7);
        x xVar8 = x.E;
        o oVar11 = new o("BYTES", 10, 10, 1, xVar8);
        o oVar12 = new o("UINT32", 11, 11, 1, xVar4);
        x xVar9 = x.F;
        o oVar13 = new o("ENUM", 12, 12, 1, xVar9);
        o oVar14 = new o("SFIXED32", 13, 13, 1, xVar4);
        o oVar15 = new o("SFIXED64", 14, 14, 1, xVar3);
        o oVar16 = new o("SINT32", 15, 15, 1, xVar4);
        o oVar17 = new o("SINT64", 16, 16, 1, xVar3);
        o oVar18 = new o("GROUP", 17, 17, 1, xVar7);
        o oVar19 = new o("DOUBLE_LIST", 18, 18, 2, xVar);
        o oVar20 = new o("FLOAT_LIST", 19, 19, 2, xVar2);
        o oVar21 = new o("INT64_LIST", 20, 20, 2, xVar3);
        o oVar22 = new o("UINT64_LIST", 21, 21, 2, xVar3);
        o oVar23 = new o("INT32_LIST", 22, 22, 2, xVar4);
        o oVar24 = new o("FIXED64_LIST", 23, 23, 2, xVar3);
        o oVar25 = new o("FIXED32_LIST", 24, 24, 2, xVar4);
        o oVar26 = new o("BOOL_LIST", 25, 25, 2, xVar5);
        o oVar27 = new o("STRING_LIST", 26, 26, 2, xVar6);
        o oVar28 = new o("MESSAGE_LIST", 27, 27, 2, xVar7);
        o oVar29 = new o("BYTES_LIST", 28, 28, 2, xVar8);
        o oVar30 = new o("UINT32_LIST", 29, 29, 2, xVar4);
        o oVar31 = new o("ENUM_LIST", 30, 30, 2, xVar9);
        o oVar32 = new o("SFIXED32_LIST", 31, 31, 2, xVar4);
        o oVar33 = new o("SFIXED64_LIST", 32, 32, 2, xVar3);
        o oVar34 = new o("SINT32_LIST", 33, 33, 2, xVar4);
        o oVar35 = new o("SINT64_LIST", 34, 34, 2, xVar3);
        o oVar36 = new o("DOUBLE_LIST_PACKED", 35, 35, 3, xVar);
        f1916e = oVar36;
        o oVar37 = new o("FLOAT_LIST_PACKED", 36, 36, 3, xVar2);
        o oVar38 = new o("INT64_LIST_PACKED", 37, 37, 3, xVar3);
        o oVar39 = new o("UINT64_LIST_PACKED", 38, 38, 3, xVar3);
        o oVar40 = new o("INT32_LIST_PACKED", 39, 39, 3, xVar4);
        o oVar41 = new o("FIXED64_LIST_PACKED", 40, 40, 3, xVar3);
        o oVar42 = new o("FIXED32_LIST_PACKED", 41, 41, 3, xVar4);
        o oVar43 = new o("BOOL_LIST_PACKED", 42, 42, 3, xVar5);
        o oVar44 = new o("UINT32_LIST_PACKED", 43, 43, 3, xVar4);
        o oVar45 = new o("ENUM_LIST_PACKED", 44, 44, 3, xVar9);
        o oVar46 = new o("SFIXED32_LIST_PACKED", 45, 45, 3, xVar4);
        o oVar47 = new o("SFIXED64_LIST_PACKED", 46, 46, 3, xVar3);
        o oVar48 = new o("SINT32_LIST_PACKED", 47, 47, 3, xVar4);
        o oVar49 = new o("SINT64_LIST_PACKED", 48, 48, 3, xVar3);
        f1917i = oVar49;
        f1919w = new o[]{oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, oVar9, oVar10, oVar11, oVar12, oVar13, oVar14, oVar15, oVar16, oVar17, oVar18, oVar19, oVar20, oVar21, oVar22, oVar23, oVar24, oVar25, oVar26, oVar27, oVar28, oVar29, oVar30, oVar31, oVar32, oVar33, oVar34, oVar35, oVar36, oVar37, oVar38, oVar39, oVar40, oVar41, oVar42, oVar43, oVar44, oVar45, oVar46, oVar47, oVar48, oVar49, new o("GROUP_LIST", 49, 49, 2, xVar7), new o("MAP", 50, 50, 4, x.f1959d)};
        o[] oVarArrValues = values();
        f1918v = new o[oVarArrValues.length];
        for (o oVar50 : oVarArrValues) {
            f1918v[oVar50.f1920d] = oVar50;
        }
    }

    public o(String str, int i7, int i10, int i11, x xVar) {
        super(str, i7);
        this.f1920d = i10;
        int iB = f0.e.b(i11);
        if (iB == 1 || iB == 3) {
            xVar.getClass();
        }
        if (i11 == 1) {
            xVar.ordinal();
        }
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f1919w.clone();
    }
}
