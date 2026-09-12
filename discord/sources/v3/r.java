package v3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f21420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f21421e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r f21422i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final r f21423v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final r f21424w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final r f21425x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ r[] f21426y;

    static {
        r rVar = new r("NOT_REQUIRED", 0);
        f21420d = rVar;
        r rVar2 = new r("CONNECTED", 1);
        f21421e = rVar2;
        r rVar3 = new r("UNMETERED", 2);
        f21422i = rVar3;
        r rVar4 = new r("NOT_ROAMING", 3);
        f21423v = rVar4;
        r rVar5 = new r("METERED", 4);
        f21424w = rVar5;
        r rVar6 = new r("TEMPORARILY_UNMETERED", 5);
        f21425x = rVar6;
        f21426y = new r[]{rVar, rVar2, rVar3, rVar4, rVar5, rVar6};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f21426y.clone();
    }
}
