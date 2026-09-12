package p2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b E;
    public static final b F;
    public static final /* synthetic */ b[] G;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f17766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f17767e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f17768i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f17769v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f17770w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f17771x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f17772y;

    static {
        b bVar = new b("PENALTY_LOG", 0);
        f17766d = bVar;
        b bVar2 = new b("PENALTY_DEATH", 1);
        f17767e = bVar2;
        b bVar3 = new b("DETECT_FRAGMENT_REUSE", 2);
        f17768i = bVar3;
        b bVar4 = new b("DETECT_FRAGMENT_TAG_USAGE", 3);
        f17769v = bVar4;
        b bVar5 = new b("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f17770w = bVar5;
        b bVar6 = new b("DETECT_RETAIN_INSTANCE_USAGE", 5);
        f17771x = bVar6;
        b bVar7 = new b("DETECT_SET_USER_VISIBLE_HINT", 6);
        f17772y = bVar7;
        b bVar8 = new b("DETECT_TARGET_FRAGMENT_USAGE", 7);
        E = bVar8;
        b bVar9 = new b("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        F = bVar9;
        G = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) G.clone();
    }
}
