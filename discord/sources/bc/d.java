package bc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f3094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f3095e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f3096i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ d[] f3097v;

    static {
        d dVar = new d("NETWORK_UNMETERED", 0);
        f3094d = dVar;
        d dVar2 = new d("DEVICE_IDLE", 1);
        f3095e = dVar2;
        d dVar3 = new d("DEVICE_CHARGING", 2);
        f3096i = dVar3;
        f3097v = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f3097v.clone();
    }
}
