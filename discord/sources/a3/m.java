package a3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f102e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m f103i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ m[] f104v;

    static {
        m mVar = new m("AUTOMATIC", 0);
        f101d = mVar;
        m mVar2 = new m("TRUNCATE", 1);
        f102e = mVar2;
        m mVar3 = new m("WRITE_AHEAD_LOGGING", 2);
        f103i = mVar3;
        f104v = new m[]{mVar, mVar2, mVar3};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f104v.clone();
    }
}
