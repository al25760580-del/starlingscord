package kq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f14783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f14784e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k f14785i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ k[] f14786v;

    static {
        k kVar = new k("NOT_COMPUTED", 0);
        f14783d = kVar;
        k kVar2 = new k("COMPUTING", 1);
        f14784e = kVar2;
        k kVar3 = new k("RECURSION_WAS_DETECTED", 2);
        f14785i = kVar3;
        f14786v = new k[]{kVar, kVar2, kVar3};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f14786v.clone();
    }
}
