package uo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f21227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f21228e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f21229i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final l f21230v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final l f21231w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ l[] f21232x;

    static {
        l lVar = new l("HIDDEN", 0);
        f21227d = lVar;
        l lVar2 = new l("VISIBLE", 1);
        f21228e = lVar2;
        l lVar3 = new l("DEPRECATED_LIST_METHODS", 2);
        f21229i = lVar3;
        l lVar4 = new l("NOT_CONSIDERED", 3);
        f21230v = lVar4;
        l lVar5 = new l("DROP", 4);
        f21231w = lVar5;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5};
        f21232x = lVarArr;
        com.facebook.imagepipeline.nativecode.b.l(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f21232x.clone();
    }
}
