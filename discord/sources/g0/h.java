package g0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f9441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f9442e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ h[] f9443i;

    static {
        h hVar = new h("Min", 0);
        f9441d = hVar;
        h hVar2 = new h("Max", 1);
        f9442e = hVar2;
        f9443i = new h[]{hVar, hVar2};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f9443i.clone();
    }
}
