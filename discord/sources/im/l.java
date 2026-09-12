package im;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f11934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f11935e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f11936i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ l[] f11937v;

    static {
        l lVar = new l("UP", 0);
        f11934d = lVar;
        l lVar2 = new l("DOWN", 1);
        f11935e = lVar2;
        l lVar3 = new l("NONE", 2);
        f11936i = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        f11937v = lVarArr;
        com.facebook.imagepipeline.nativecode.b.l(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f11937v.clone();
    }
}
