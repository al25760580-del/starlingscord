package l4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f14840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f14841e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f14842i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final f f14843v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final f f14844w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final f f14845x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ f[] f14846y;

    static {
        f fVar = new f("SET_ANIMATION", 0);
        f14840d = fVar;
        f fVar2 = new f("SET_PROGRESS", 1);
        f14841e = fVar2;
        f fVar3 = new f("SET_REPEAT_MODE", 2);
        f14842i = fVar3;
        f fVar4 = new f("SET_REPEAT_COUNT", 3);
        f14843v = fVar4;
        f fVar5 = new f("SET_IMAGE_ASSETS", 4);
        f14844w = fVar5;
        f fVar6 = new f("PLAY_OPTION", 5);
        f14845x = fVar6;
        f14846y = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f14846y.clone();
    }
}
