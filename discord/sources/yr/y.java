package yr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f23564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y f23565e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ y[] f23566i;

    static {
        y yVar = new y("FORMAT", 0);
        f23564d = yVar;
        y yVar2 = new y("STANDALONE", 1);
        f23565e = yVar2;
        f23566i = new y[]{yVar, yVar2};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f23566i.clone();
    }
}
