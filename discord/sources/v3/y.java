package v3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f21432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y f21433e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ y[] f21434i;

    static {
        y yVar = new y("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        f21432d = yVar;
        y yVar2 = new y("DROP_WORK_REQUEST", 1);
        f21433e = yVar2;
        f21434i = new y[]{yVar, yVar2};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f21434i.clone();
    }
}
