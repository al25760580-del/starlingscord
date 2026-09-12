package fk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f9278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f9279e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k f9280i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ k[] f9281v;

    static {
        k kVar = new k("MMMEd", 0);
        f9278d = kVar;
        k kVar2 = new k("d", 1);
        f9279e = kVar2;
        k kVar3 = new k("y", 2);
        f9280i = kVar3;
        f9281v = new k[]{kVar, kVar2, kVar3};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f9281v.clone();
    }
}
