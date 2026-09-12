package h3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f10303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f10304e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f10305i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final f f10306v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final f f10307w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ f[] f10308x;

    static {
        f fVar = new f("ON_CONFIGURE", 0);
        f10303d = fVar;
        f fVar2 = new f("ON_CREATE", 1);
        f10304e = fVar2;
        f fVar3 = new f("ON_UPGRADE", 2);
        f10305i = fVar3;
        f fVar4 = new f("ON_DOWNGRADE", 3);
        f10306v = fVar4;
        f fVar5 = new f("ON_OPEN", 4);
        f10307w = fVar5;
        f10308x = new f[]{fVar, fVar2, fVar3, fVar4, fVar5};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f10308x.clone();
    }
}
