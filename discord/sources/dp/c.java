package dp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements a {
    public static final c E;
    public static final /* synthetic */ c[] F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f7693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f7694e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f7695i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c f7696v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c f7697w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final c f7698x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c f7699y;

    /* JADX INFO: Fake field, exist only in values array */
    c EF1;

    static {
        c cVar = new c("FROM_IDE", 0);
        c cVar2 = new c("FROM_BACKEND", 1);
        c cVar3 = new c("FROM_TEST", 2);
        c cVar4 = new c("FROM_BUILTINS", 3);
        f7693d = cVar4;
        c cVar5 = new c("WHEN_CHECK_DECLARATION_CONFLICTS", 4);
        c cVar6 = new c("WHEN_CHECK_OVERRIDES", 5);
        c cVar7 = new c("FOR_SCRIPT", 6);
        c cVar8 = new c("FROM_REFLECTION", 7);
        f7694e = cVar8;
        c cVar9 = new c("WHEN_RESOLVE_DECLARATION", 8);
        c cVar10 = new c("WHEN_GET_DECLARATION_SCOPE", 9);
        c cVar11 = new c("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10);
        c cVar12 = new c("FOR_ALREADY_TRACKED", 11);
        f7695i = cVar12;
        c cVar13 = new c("WHEN_GET_ALL_DESCRIPTORS", 12);
        f7696v = cVar13;
        c cVar14 = new c("WHEN_TYPING", 13);
        c cVar15 = new c("WHEN_GET_SUPER_MEMBERS", 14);
        f7697w = cVar15;
        c cVar16 = new c("FOR_NON_TRACKED_SCOPE", 15);
        f7698x = cVar16;
        c cVar17 = new c("FROM_SYNTHETIC_SCOPE", 16);
        c cVar18 = new c("FROM_DESERIALIZATION", 17);
        f7699y = cVar18;
        c cVar19 = new c("FROM_JAVA_LOADER", 18);
        E = cVar19;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, new c("WHEN_GET_LOCAL_VARIABLE", 19), new c("WHEN_FIND_BY_FQNAME", 20), new c("WHEN_GET_COMPANION_OBJECT", 21), new c("FOR_DEFAULT_IMPORTS", 22)};
        F = cVarArr;
        com.facebook.imagepipeline.nativecode.b.l(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) F.clone();
    }
}
